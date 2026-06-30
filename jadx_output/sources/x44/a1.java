package x44;

/* loaded from: classes4.dex */
public final class a1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("customerServiceUrl");
        if (optString == null) {
            optString = "";
        }
        java.lang.String a17 = a54.h.a(env.b());
        if (optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.CustomerService", "the jump url is empty!!!");
            b(g("the jump url is empty!!!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            return;
        }
        android.app.Activity a18 = env.a();
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.CustomerService", "the context is null!");
            b(g("the context is null!"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            return;
        }
        x44.y0 y0Var = new x44.y0(a18, a17, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestSignedUrl", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        r45.ta0 ta0Var = new r45.ta0();
        ta0Var.f386230e = a17;
        ta0Var.f386229d = optString;
        ta0Var.f386231f = 1;
        k64.h.a(ta0Var, 2634, "/cgi-bin/mmoc-bin/adplayinfo/customer_service_sign", new x44.z0(optString, y0Var), (r45.js5) r45.ua0.class.newInstance(), false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestSignedUrl", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
    }
}
