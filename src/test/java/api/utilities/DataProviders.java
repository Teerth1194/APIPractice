package api.utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    @DataProvider(name = "Data")
    public Object[][] dpMethod() throws IOException {

        String path = System.getProperty("user.dir")+"//testdata//Testdata.xlsx";
        XLUtilities xl = new XLUtilities(path);

        int rowCount = xl.getRowCount("Sheet1");
        int cellCount = xl.getCellCount("Sheet1", 0);

//        Object apiData[][] = {
//                {xl.getCellData("Sheet1", 0, 0),xl.getCellData("Sheet1", 0, 1) },
//                {xl.getCellData("Sheet1", 1, 0),xl.getCellData("Sheet1", 1, 1) },
//                {xl.getCellData("Sheet1", 2, 0),xl.getCellData("Sheet1", 2, 1) }
//        };

        Object apiData[][] = new Object[rowCount][cellCount];

        for (int i=1; i<=rowCount; i++){
            for (int j=0; j<cellCount; j++){
                apiData[i-1][j] = xl.getCellData("Sheet1", i,j);
            }
        }

        System.out.println(rowCount);
        System.out.println(cellCount);
//
//        for (int i=1; i<rowCount; i++){
//            for (int j=0;j<=i;j++ ){
//                apiData[i-1][j] = xl.getCellData("Sheet1",i,j);
//            }
//        }
        return apiData;
    }
}
