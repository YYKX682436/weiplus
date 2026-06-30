package xx5;

/* loaded from: classes13.dex */
public abstract class g {
    public static void a(int i17, java.lang.String str, int i18, java.lang.String str2) {
        java.lang.String str3 = "20260502," + org.xwalk.core.XWalkEnvironment.d() + "," + i18 + "," + com.tencent.xweb.WebView.getModuleName() + "," + i17 + "," + str.replaceAll(",", " ") + "," + str2.replaceAll(",", " ");
        by5.c4.f("KVReportForCrash", "report:" + str3);
        by5.s0.t(25407, str3);
    }
}
