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
    println('applicationId: ' + results.applicationId)
    println('scanId: ' + results.scanId)
    println('reportHtmlUrl: ' + results.reportHtmlUrl)
    println('reportPdfUrl: ' + results.reportPdfUrl)
    println('reportDataUrl: ' + results.reportDataUrl)
  }
}
