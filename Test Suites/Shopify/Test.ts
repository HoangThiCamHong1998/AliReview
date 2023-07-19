<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Test</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>595c1574-b22c-4a56-8e5d-e4604b2eff1e</testSuiteGuid>
   <testCaseLink>
      <guid>87bda900-16b6-4fdb-b6c3-0eb95036b13a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC04_Open login shopify page</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>4bd6c3a0-512c-4e2a-bcb5-fa3ed481f03d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC01_Login Shopify</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>967801f7-abd8-4dba-a7f5-39565441d66d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>28274a37-88d4-489c-bd87-4e005b943f86</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>be254344-4714-4c53-b5a1-788e24d97d6f</id>
         <masked>false</masked>
         <name>store_name</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/Shopify/TC02_Create a store</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5c9cfd93-9f96-447f-8cc4-8884b2946f70</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value>2-6</value>
         </iterationEntity>
         <testDataId>Data Files/Store test/store_test</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>5c9cfd93-9f96-447f-8cc4-8884b2946f70</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>store_name</value>
         <variableId>be254344-4714-4c53-b5a1-788e24d97d6f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0a8bdb6d-c287-4f29-9f75-78b3c4a79278</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC03_Install AR App</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>