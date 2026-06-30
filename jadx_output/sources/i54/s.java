package i54;

/* loaded from: classes.dex */
public final class s implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("requestName");
        java.lang.String optString2 = data.optString("requestIconUrl");
        com.tencent.mars.xlog.Log.i("SnsAdForm.PhoneNumber", "name is " + optString + ", iconUrl is " + optString2);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                java.lang.String phoneNumber = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getPhoneNumber();
                android.content.Context c17 = jsApiContext.c();
                if (c17 instanceof androidx.fragment.app.FragmentActivity) {
                    eb4.d.f250884a.a((androidx.fragment.app.FragmentActivity) c17, phoneNumber, optString, optString2, new i54.r(jsApiContext));
                } else {
                    com.tencent.mars.xlog.Log.e("SnsAdForm.PhoneNumber", "the context is invalid!");
                    jsApiContext.a("params error", kz5.c1.l(new jz5.l("ret", "-4"), new jz5.l("err_msg", "the context is invalid!!!")));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
            }
        }
        jsApiContext.a("params error", kz5.c1.l(new jz5.l("ret", "-1"), new jz5.l("err_msg", "the context is invalid!!!")));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber");
    }
}
