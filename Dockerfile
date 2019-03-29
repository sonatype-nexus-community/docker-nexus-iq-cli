# Copyright (c) 2019-present Sonatype, Inc.
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

FROM openjdk:8-alpine

ENV SONATYPE_DIR=/opt/sonatype

COPY target/docker-nexus-iq-cli.jar ${SONATYPE_DIR}/lib/docker-nexus-iq-cli.jar
COPY src/main/sh/evaluate ${SONATYPE_DIR}/bin/evaluate

RUN find ${SONATYPE_DIR}/bin -type f -exec chmod +x {} \;
