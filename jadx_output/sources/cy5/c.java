package cy5;

/* loaded from: classes13.dex */
public class c extends cy5.y {
    @Override // cy5.y
    public java.lang.String B() {
        return "com.tencent.xweb.xfiles.excel.ExcelReaderEnvironment";
    }

    @Override // cy5.y
    public int C(int i17) {
        if (i17 == 1) {
            return 238;
        }
        return i17 == 2 ? 280 : 100;
    }

    @Override // cy5.y
    public java.lang.String D() {
        return "com.tencent.xweb.xfiles.excel.ExcelReader";
    }

    @Override // cy5.h
    public java.lang.String m() {
        return com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL;
    }

    @Override // cy5.h
    public boolean p() {
        return true;
    }

    @Override // cy5.y
    public java.lang.String y(int i17) {
        return i(i17, "excelreader.apk");
    }
}
