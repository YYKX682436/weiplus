package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o44.c f162909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q1 f162913i;

    public p1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q1 q1Var, int i17, o44.c cVar, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent, java.lang.String str, android.content.Context context) {
        this.f162913i = q1Var;
        this.f162908d = i17;
        this.f162909e = cVar;
        this.f162910f = adLandingHBCardComponent;
        this.f162911g = str;
        this.f162912h = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$2");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q1 q1Var = this.f162913i;
        o44.c cVar = this.f162909e;
        int i17 = this.f162908d;
        if (i17 == 1) {
            cVar.h(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            f54.o oVar = q1Var.f162918c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            cVar.j(oVar.f259728d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            if (q1Var.f162919d == 1) {
                this.f162910f.T(this.f162911g);
            }
        } else if (i17 == 2) {
            cVar.h(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            f54.o oVar2 = q1Var.f162918c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            cVar.j(oVar2.f259730f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback");
            if (q1Var.f162919d == 1) {
                android.content.Context context = this.f162912h;
                db5.t7.n(context, context.getString(com.tencent.mm.R.string.j7b));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$HBStatusReqCallback$2");
    }
}
