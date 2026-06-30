package x44;

/* loaded from: classes4.dex */
public final class m2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("requestIcon", "");
        java.lang.String optString2 = data.optString("requestName", "");
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            kotlin.jvm.internal.o.d(optString2);
            if (!(optString2.length() == 0)) {
                android.app.Activity a17 = env.a();
                if (!(a17 instanceof androidx.fragment.app.FragmentActivity)) {
                    com.tencent.mars.xlog.Log.e("SnsAdJs.RequestPhoneNumber", "the activity is null or not fragmentActivity!!");
                    b(g("the activity is or not fragmentActivity!!"));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
                    return;
                } else {
                    java.lang.String phoneNumber = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getPhoneNumber();
                    java.lang.String str = phoneNumber == null ? "" : phoneNumber;
                    java.lang.String a18 = com.tencent.mm.ui.fg.a(str);
                    ((ku5.t0) ku5.t0.f312615d).B(new x44.l2(a17, a18 == null ? "" : a18, optString2, optString, this, str));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAdJs.RequestPhoneNumber", "the request icon or request name is empty!!");
        b(g("the request icon or request name is empty!!"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
    }
}
