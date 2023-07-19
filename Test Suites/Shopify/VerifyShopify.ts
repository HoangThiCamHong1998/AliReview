<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>VerifyShopify</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>4849e2fd-4f80-46ac-85f8-a3b6e7a42aa7</testSuiteGuid>
   <testCaseLink>
      <guid>216c6227-e8b0-42ef-ab9c-6d474f64c1e4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC04_Open login shopify page</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a5ae0aca-4dbf-490a-a01a-55c87a5fd845</guid>
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
      <guid>80ca749a-1aee-44af-a3ae-03574470ae9c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC02_Create a store</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>6592064c-cf87-4d9f-8272-696058abf599</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Store test/store_test</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>6592064c-cf87-4d9f-8272-696058abf599</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>store_name</value>
         <variableId>be254344-4714-4c53-b5a1-788e24d97d6f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8bf3a982-5969-4071-b52b-e74ff4291fda</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Shopify/TC03_Install AR App</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>4497ea8c-8e9a-47ec-991c-6a1ef6c419d2</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Store test/store_test</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
