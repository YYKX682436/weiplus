package xx5;

/* loaded from: classes13.dex */
public abstract class l {
    public static void a(int i17, int i18, boolean z17) {
        java.lang.String str = "20260502," + org.xwalk.core.XWalkEnvironment.d() + "," + com.tencent.xweb.WebView.getModuleName() + "," + i17 + "," + "".replaceAll(",", " ") + "," + i18 + "," + z17;
        by5.c4.f("KVReportForMultiProfile", "report:" + str);
        if (i17 != 0 || z17) {
            by5.s0.t(32527, str);
        }
    }
}
