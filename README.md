# Build & Coverage Report
## Build Log (last 25 rows):
```
Audit done.
[WARNING] Unable to locate Source XRef to link to - DISABLED
[WARNING] Unable to locate Test Source XRef to link to - DISABLED
[INFO] 
[INFO] --- jacoco:0.8.13:report (report) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/ProvaPratica2/ProvaPratica2/roman-number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[INFO] 
[INFO] --- jacoco:0.8.13:check (check) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/ProvaPratica2/ProvaPratica2/roman-number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 2 classes
[WARNING] Rule violated for bundle roman-number: lines covered ratio is 0.62, but expected minimum is 0.85
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.982 s
[INFO] Finished at: 2025-05-11T14:05:07Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.jacoco:jacoco-maven-plugin:0.8.13:check (check) on project roman-number: Coverage checks have not been met. See log for details. -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException

## CSV of Jacoco Code Coverage:
```csv
GROUP,PACKAGE,CLASS,INSTRUCTION_MISSED,INSTRUCTION_COVERED,BRANCH_MISSED,BRANCH_COVERED,LINE_MISSED,LINE_COVERED,COMPLEXITY_MISSED,COMPLEXITY_COVERED,METHOD_MISSED,METHOD_COVERED
roman-number,it.unipd.mtss,IntegerToRoman,8,155,1,7,2,11,2,4,1,1
roman-number,it.unipd.mtss,RomanPrinter,94,273,13,11,16,19,10,9,1,3
```
