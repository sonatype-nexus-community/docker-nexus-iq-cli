/*
 * Copyright (c) 2019-present Sonatype, Inc. All rights reserved.
 * Includes the third-party code listed at http://links.sonatype.com/products/nexus/attributions.
 * "Sonatype" is a trademark of Sonatype, Inc.
 */
package com.sonatype.insight.brain.cli

import groovy.cli.commons.CliBuilder
import groovy.json.JsonSlurper

class PolicyEvaluationResultsProcessor
{
  static void main(String[] args) {
    def cli = new CliBuilder()
    cli.r(type: String, longOpt: 'results', 'results file', args: 1, required: true)

    def options = cli.parse(args)
    if (!options || !options.r) {
      System.exit(-2)
    }
    def results = new JsonSlurper().parse(new File(options.r))
    System.out.println('applicationId: ' + results.applicationId)
    System.out.println('scanId: ' + results.scanId)
    System.out.println('reportHtmlUrl: ' + results.reportHtmlUrl)
    System.out.println('reportPdfUrl: ' + results.reportPdfUrl)
    System.out.println('reportDataUrl: ' + results.reportDataUrl)
  }
}
