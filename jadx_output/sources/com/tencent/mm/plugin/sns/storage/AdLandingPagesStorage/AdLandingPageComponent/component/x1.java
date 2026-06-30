package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f165798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 f165799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f165800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1 f165801h;

    public x1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1 y1Var, int i17, int i18, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var, java.lang.Object obj) {
        this.f165801h = y1Var;
        this.f165797d = i17;
        this.f165798e = i18;
        this.f165799f = z1Var;
        this.f165800g = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        java.lang.Object obj = this.f165800g;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var = this.f165799f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
        try {
            boolean z17 = this.f165797d == 0 && this.f165798e == 0;
            z1Var.m0();
            java.lang.String str = "-1";
            if (obj instanceof java.lang.String) {
                org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) obj);
                java.lang.String optString = jSONObject.optString("status");
                int optInt = jSONObject.optInt("opType");
                str = optString;
                i17 = optInt;
            } else {
                i17 = -1;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCallback, status=");
            sb6.append(str);
            sb6.append(", opType=");
            sb6.append(i17);
            sb6.append(", appointmentId=");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y1 y1Var = this.f165801h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            long j17 = y1Var.f165841c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", sb6.toString());
            if (z17) {
                if (i17 == 0 && "1".equals(str)) {
                    db4.a aVar = z1Var.B;
                    if (aVar == null || (adClickActionInfo = aVar.f2896p1) == null) {
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1.i0(z1Var);
                    } else {
                        e54.a.a(z1Var.f165049d, adClickActionInfo, z1Var.u(), z1Var.B.f2817d);
                    }
                } else if (i17 == 1 && "0".equals(str)) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1.j0(z1Var, i17, true);
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1.l0(z1Var, str);
            } else {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1.j0(z1Var, i17, false);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
    }
}
