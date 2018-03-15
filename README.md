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
Run image with appropriate options and the list of files or directories which are to be evaluated.

Example: ```docker run -it --rm -v $PWD:/workspace docker-nexus-iq-cli:latest [OPTIONS] [FILES/DIRECTORY TO SCAN]```

See the [Nexus IQ CLI](https://help.sonatype.com/display/NXI/Nexus+IQ+CLI) help page for available options.

### Required options
* -s, --server-url
* -a, --authentication
* -t, --stage
* -i, --application-id

## The Fine Print
It is worth noting that this is **NOT SUPPORTED** by Sonatype, and is a contribution of ours to the open source community (read: you!)

Remember:

* Use this contribution at the risk tolerance that you have
* Do **NOT** file Sonatype support tickets related to this
* **DO** file issues here on GitHub, so that the community can pitch in
