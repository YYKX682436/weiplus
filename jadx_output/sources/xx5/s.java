package xx5;

/* loaded from: classes13.dex */
public abstract class s {
    public static void a(com.tencent.xweb.f1 f1Var, int i17, int i18, boolean z17, java.lang.String str) {
        int i19 = f1Var == com.tencent.xweb.f1.WV_KIND_SYS ? 1 : f1Var == com.tencent.xweb.f1.WV_KIND_CW ? 3 : f1Var == com.tencent.xweb.f1.WV_KIND_PINUS ? 4 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append(",20260502,");
        sb6.append(i19);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(z17 ? 1 : 0);
        sb6.append(",");
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForVideoFullscreen", "report:" + sb7);
        by5.s0.t(24151, sb7);
    }
}
