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
```
sh evaluate [options] <Archives or directories to scan>
```

##### _Example_
```
sh evaluate -s https://lifecycle.myCompany.com -a ciUser:ciPassword -i WEBAPP target/our-web-app.war 
```
 
### Available Options
**Required**:  
* URL to the IQ Server to which the scan result should be uploaded
```
      -s, --server-url <http[s]://...>
```
* Authentication credentials to use for the IQ Server
```
      -a, --authentication <username:password>
```
* ID of the application on the Lifecycle Server
```
      -i, --application-id <app ID>
```
**Optional**:

* The stage to run analysis against. Accepted values: **_develop_** | **_build_** | **_stage-release_** | **_release_** | **_operate_**.  _Default_: **build**
```
      -t, --stage
```
* Path to a JSON file where the results of the policy evaluation will be stored in a machine-readable format.  _Default_: **none**
```
      -r, --result-file </path/to/file.json>
```
* Enable Expanded Coverage analysis.  _Default_: **false**
```
      -xc, --expanded-coverage
```
* Fail on policy evaluation warnings.  _Default_: **false**
```
      -w, --fail-on-policy-warnings
```
* Ignore system errors (IO, network, server, etc).  _Default_: **false**
```
      -e, --ignore-system-errors
```
* Proxy to use.  _Default_: **none**
```
      -p, --proxy <host[:port]>
```
* Credentials to use for the proxy.  _Default_: **none**
```
      -U, --proxy-user <username:password>
```
* Enable debug logs. **WARNING**: This may expose sensitive information in the log.  _Default_: **false**
```
      -X, --debug
```
* Show the help screen.  _Default_: **false**
```
      -h, --help
```
