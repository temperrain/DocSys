package com.DocSystem.test;

import com.DocSystem.controller.BaseController;

class ExportDocAuthList extends BaseController{
    public static void main(String[] args) {
    	exportObjectListToJsonFile(DOC_AUTH, "docAuthList.json", 20000, 20000);
    }
}