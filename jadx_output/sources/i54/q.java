package i54;

/* loaded from: classes4.dex */
public final class q implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestAppointment");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt("opType", -1);
        java.lang.String optString = data.optString("phoneNumber");
        if (optString == null) {
            optString = "";
        }
        long optLong = data.optLong("appointmentId");
        java.lang.String a17 = a54.h.a(jsApiContext.e());
        b54.b.f18095a.a(optInt, optLong, a17, optString, new i54.p(jsApiContext));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestAppointment");
    }
}
