package ny1;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static ny1.b f341399b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f341400a;

    public b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f341400a = hashMap;
        hashMap.put("1:finder_feed_item_view:view_unexp", "clicfg_finder_stats_cgi_report");
        hashMap.put("1:share_menu:view_clk", "clicfg_finder_stats_cgi_report");
        hashMap.put("1:no_interest:view_clk", "clicfg_finder_stats_cgi_report");
        hashMap.put("1:feed_avatar:view_clk", "clicfg_finder_stats_cgi_report");
        hashMap.put("1:finder_comment_view:enter_comment", "clicfg_finder_stats_cgi_report");
        hashMap.put("1:feed_living_item:view_clk", "clicfg_finder_stats_cgi_report");
        hashMap.put("16:1123:session_in", "clicfg_livetips_session3_report");
        hashMap.put("16:1123:session_out", "clicfg_livetips_session3_report");
        hashMap.put("16:1003:page_in", "clicfg_livetips_session3_report");
        hashMap.put("16:1001:page_in", "clicfg_livetips_session3_report");
        hashMap.put("16:app_in:app_in", "clicfg_livetips_session3_report");
        hashMap.put("16:live_notify_get_config:live_notify_get_config", "clicfg_livetips_session3_report");
        b();
    }

    public boolean a(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        java.lang.String str3 = (java.lang.String) this.f341400a.get(java.lang.String.format("%d:%s:%s", objArr));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return true;
        }
        return j62.e.g().l(str3, false, true, false);
    }

    public void b() {
        java.lang.String a17 = j62.e.g().a("clicfg_data_report_sdk_cgi_controll", "", false, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return;
        }
        try {
            java.lang.String[] split = a17.split(";");
            if (split == null || split.length <= 0) {
                return;
            }
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split("@");
                this.f341400a.put(split2[0], split2[1]);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DataReportController", "read expt config error [%s] [%s]", a17, e17.toString());
        }
    }
}
