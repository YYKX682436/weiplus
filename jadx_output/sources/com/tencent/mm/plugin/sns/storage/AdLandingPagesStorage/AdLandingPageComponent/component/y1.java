package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class y1 implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f165839a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f165840b;

    /* renamed from: c, reason: collision with root package name */
    public final long f165841c;

    public y1(android.content.Context context, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var, long j17) {
        this.f165839a = new java.lang.ref.WeakReference(context);
        this.f165840b = new java.lang.ref.WeakReference(z1Var);
        this.f165841c = j17;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        com.tencent.mars.xlog.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, errType=" + i17 + ", errCode=" + i18 + ", data=" + obj);
        android.content.Context context = (android.content.Context) this.f165839a.get();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1 z1Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1) this.f165840b.get();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.w("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, isFinishing return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        } else if (z1Var == null) {
            com.tencent.mars.xlog.Log.w("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback, btnComp == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x1(this, i17, i18, z1Var, obj));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
        }
    }
}
