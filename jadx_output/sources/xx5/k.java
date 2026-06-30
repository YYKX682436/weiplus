package xx5;

/* loaded from: classes13.dex */
public abstract class k {
    public static void a(int i17, int i18, int i19, int i27, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        sb6.append(i19);
        sb6.append(",");
        sb6.append(i27);
        sb6.append(",");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",");
        com.tencent.xweb.b m17 = com.tencent.xweb.b.m();
        sb6.append(m17.i("mm_webview_mode", "mm", m17.i("mm_webview_downgrade_mode", "mm", 1)));
        sb6.append(",");
        sb6.append(com.tencent.xweb.b.m().h("disable_child_process_start_crash_count", "mm", false) ? "2" : "1");
        sb6.append(",");
        sb6.append(com.tencent.xweb.b.m().h("disable_child_process_start_timeout", "mm", false) ? "2" : "1");
        sb6.append(",");
        sb6.append(com.tencent.xweb.b.m().i("child_process_start_timeout_count", "mm", 2));
        sb6.append(",");
        sb6.append(com.tencent.xweb.b.m().i("child_process_start_timeout_threshold", "mm", 50));
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForMultiProcessDowngrade", "report:" + sb7);
        by5.s0.t(26528, sb7);
    }
}
