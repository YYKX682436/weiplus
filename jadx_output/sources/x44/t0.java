package x44;

/* loaded from: classes4.dex */
public final class t0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (env.a() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.OpenAuthManagementUI", "activity is null!!");
            b(g("activity is null!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
            return;
        }
        m54.l b17 = env.b();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landig_pages_from_source", b17.l());
        intent.putExtra("sns_landing_pages_ux_info", a54.h.a(b17));
        java.lang.String j17 = b17.j();
        if (!(j17 == null || j17.length() == 0)) {
            intent.putExtra("sns_landing_pages_rawSnsId", b17.j());
        }
        j45.l.j(env.a(), "sns", ".ui.SnsAdLBSAuthManagerUI", intent, null);
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
    }
}
