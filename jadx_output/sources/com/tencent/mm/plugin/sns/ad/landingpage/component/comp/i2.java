package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f162846d;

    /* renamed from: e, reason: collision with root package name */
    public int f162847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o2 f162850h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162851i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f162852m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(android.content.Context context, int i17, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o2 o2Var, java.lang.String str, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f162848f = context;
        this.f162849g = i17;
        this.f162850h = o2Var;
        this.f162851i = str;
        this.f162852m = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i2 i2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i2(this.f162848f, this.f162849g, this.f162850h, this.f162851i, this.f162852m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        return i2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f162847e;
        android.content.Context context = this.f162848f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context context2 = this.f162848f;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.j7v), true, true, null);
            long j17 = this.f162849g;
            this.f162846d = Q;
            this.f162847e = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
                return aVar;
            }
            u3Var = Q;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
                throw illegalStateException;
            }
            u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f162846d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (u3Var != null) {
            u3Var.cancel();
        }
        kotlinx.coroutines.r0 r0Var = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.o2.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        this.f162850h.j0(this.f162851i, this.f162852m, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
        return f0Var;
    }
}
