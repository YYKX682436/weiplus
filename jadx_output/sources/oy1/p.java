package oy1;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f349912b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Integer f349913c;

    /* renamed from: d, reason: collision with root package name */
    public static oy1.l f349914d;

    /* renamed from: e, reason: collision with root package name */
    public static oy1.l f349915e;

    /* renamed from: a, reason: collision with root package name */
    public static final oy1.p f349911a = new oy1.p();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f349916f = kz5.p1.e("cgi_report_fake_session_out");

    public final int a() {
        if (f349913c == null) {
            f349913c = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sdk_cgi_report_aff_bizid_config, 0));
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "aff bizId config = [" + f349913c + ']');
        }
        java.lang.Integer num = f349913c;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int b() {
        if (f349912b == null) {
            f349912b = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sdk_cgi_report_open_aff_config, 1));
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "open aff cgi report = [" + f349912b + ']');
        }
        java.lang.Integer num = f349912b;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void c(int i17, java.util.List reportInfoList, boolean z17) {
        kotlin.jvm.internal.o.g(reportInfoList, "reportInfoList");
        if (b() == 2 || b() == 3) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                oy1.l lVar = f349914d;
                if (lVar != null) {
                    lVar.c(i17, reportInfoList, z17);
                    return;
                }
                return;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("other_process_add_msg_id", i17);
            bundle.putSerializable("other_process_add_msg", new java.util.ArrayList(reportInfoList));
            bundle.putBoolean("other_process_add_msg_is_collect", z17);
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, oy1.o.class, null);
            return;
        }
        int a17 = a();
        boolean z18 = false;
        if (a17 != 0 && ((a17 >> i17) & 1) == 1) {
            z18 = true;
        }
        if (!z18) {
            oy1.q0.f349919d.e(i17, reportInfoList, z17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "bizId=" + i17 + " hit affBizIdConfig, use AffCgiReporter");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            oy1.l lVar2 = f349915e;
            if (lVar2 != null) {
                lVar2.c(i17, reportInfoList, z17);
                return;
            }
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("other_process_add_msg_id", i17);
        bundle2.putSerializable("other_process_add_msg", new java.util.ArrayList(reportInfoList));
        bundle2.putBoolean("other_process_add_msg_is_collect", z17);
        com.tencent.mm.ipcinvoker.d0.d(str2, bundle2, oy1.o.class, null);
    }
}
