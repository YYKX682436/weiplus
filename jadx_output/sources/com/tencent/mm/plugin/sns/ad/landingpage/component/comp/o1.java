package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162905d;

    public o1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q1 q1Var, android.content.Context context) {
        this.f162905d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$1");
        android.content.Context context = this.f162905d;
        db5.t7.n(context, context.getString(com.tencent.mm.R.string.j7c));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$1");
    }
}
