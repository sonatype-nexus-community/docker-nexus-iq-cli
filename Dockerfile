# Copyright (c) 2018-present Sonatype, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

FROM openjdk:8-jre-alpine

ARG IQ_VERSION

RUN apk add --no-cache bash curl

COPY evaluate /usr/local/bin/

ADD https://download.sonatype.com/clm/scanner/nexus-iq-cli-${IQ_VERSION}.jar /opt/nexus-iq-cli.jar

RUN mkdir -p /workspace

VOLUME /workspace

WORKDIR /workspace

ENTRYPOINT ["evaluate"]
