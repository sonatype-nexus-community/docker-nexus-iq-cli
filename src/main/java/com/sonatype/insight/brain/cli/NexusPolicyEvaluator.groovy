/*
 * Copyright (c) 2019-present Sonatype, Inc. All rights reserved.
 * Includes the third-party code listed at http://links.sonatype.com/products/nexus/attributions.
 * "Sonatype" is a trademark of Sonatype, Inc.
 */
package com.sonatype.insight.brain.cli

import com.sonatype.insight.scan.cli.PolicyEvaluatorCli

import static CommandLineOptionFilter.filterCommandLineParams

class NexusPolicyEvaluator
{
  static void main(String[] args) {
    PolicyEvaluatorCli.main(filterCommandLineParams(args));
  }

}
