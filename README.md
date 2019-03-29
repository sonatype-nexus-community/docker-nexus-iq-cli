<!--

    Sonatype Nexus (TM) Open Source Version
    Copyright (c) 2018-present Sonatype, Inc.
    All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.

    This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
    which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.

    Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
    of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
    Eclipse Foundation. All other trademarks are the property of their respective owners.

-->
## docker-nexus-iq-cli

This docker image wraps around the Nexus IQ CLI. It performs a component intelligence evaluation against the files in the mounted workspace.

## Usage
    Usage: sh evaluate [options] <Archives or directories to scan>

    Options:
    
    -i, --application-id
      ID of the application on the IQ Server
    -a, --authentication
      Authentication credentials to use for the IQ Server, format <username:password>
    -X, --debug
      Enable debug logs. WARNING: This may expose sensitive information in the
      log.
      Default: false
    -xc, --expanded-coverage
      Enable Expanded Coverage analysis.
      Default: false
    -w, --fail-on-policy-warnings
      Fail on policy evaluation warnings
      Default: false
    -h, --help
      Show this help screen
      Default: false
    -e, --ignore-system-errors
      Ignore system errors (IO, network, server, etc)
      Default: false
    --pki-authentication
      Delegate to the JVM for PKI authentication
      Default: false
    -p, --proxy
      Proxy to use, format <host[:port]>. If unspecified, the operating system
      will be queried for the proxy settings
    -U, --proxy-user
      Credentials to use for proxy, format <username:password>
    -r, --result-file
      Path to a JSON file where the results of the policy evaluation will be
      stored in a machine-readable format
    -s, --server-url
      URL to the IQ Server to which the scan result should be uploaded
    -t, --stage
      The stage to run analysis against. Accepted values:
      develop|build|stage-release|release|operate
      Default: build
