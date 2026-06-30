package x44;

/* loaded from: classes4.dex */
public final class j2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String a17 = a54.h.a(env.b());
        java.lang.String optString = data.optString("phoneNumber");
        long optLong = data.optLong("appointmentId");
        int optInt = data.optInt("opType");
        if (optLong <= 0 || optInt > 2 || optInt < 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Appointment", "the op type is invalid or appointmentId is 0");
            b(g("the appointmentId is 0"));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
            return;
        }
        if (f()) {
            kotlin.jvm.internal.o.d(optString);
            p(a17, optLong, optInt, optString, new x44.g2(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("uxInfo", a17);
            bundle.putString("phone", optString);
            bundle.putInt("opType", optInt);
            bundle.putLong("appointmentId", optLong);
            i(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        q(com.tencent.mm.sdk.platformtools.c2.f(bundle, "error", -1), com.tencent.mm.sdk.platformtools.c2.f(bundle, "opType", -1), com.tencent.mm.sdk.platformtools.c2.f(bundle, "status", -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "uxInfo");
        java.lang.String str = k17 == null ? "" : k17;
        long h17 = com.tencent.mm.sdk.platformtools.c2.h(bundle, "appointmentId", 0L);
        java.lang.String k18 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "phone");
        p(str, h17, com.tencent.mm.sdk.platformtools.c2.f(bundle, "opType", 0), k18 == null ? "" : k18, new x44.i2(bVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        return null;
    }

    public final void p(java.lang.String str, long j17, int i17, java.lang.String str2, yz5.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeAppointment", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        gm0.j1.n().f273288b.g(new k64.o(str, j17, i17, str2));
        gm0.j1.n().f273288b.a(5159, new x44.h2(qVar, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAppointment", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    public final void q(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        if (i17 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", i19);
            jSONObject.put("opType", i18);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, -1, "make appointment failed!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }
}
