package k84;

/* loaded from: classes4.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305119d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView f305122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f305123h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305124i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305125m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(k84.d4 d4Var, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.content.Context context, mb4.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305121f = d4Var;
        this.f305122g = adAttitudeAttractView;
        this.f305123h = snsInfo;
        this.f305124i = context;
        this.f305125m = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        k84.m2 m2Var = new k84.m2(this.f305121f, this.f305122g, this.f305123h, this.f305124i, this.f305125m, continuation);
        m2Var.f305120e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        return m2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        java.lang.Object invokeSuspend = ((k84.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305119d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f305120e;
            k84.d4 d4Var = this.f305121f;
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J2 = d4Var.J();
            l44.e0 e0Var = J2 != null && J2.m() ? l44.e0.f316094e : l44.e0.f316093d;
            kotlinx.coroutines.l.d(y0Var, null, null, new k84.j2(this.f305123h, this.f305121f, this.f305124i, this.f305125m, new kotlin.jvm.internal.h0(), null), 3, null);
            kotlinx.coroutines.flow.j2 cheerPagIsPlayedFlow = this.f305122g.getCheerPagIsPlayedFlow();
            kotlin.jvm.internal.o.f(cheerPagIsPlayedFlow, "getCheerPagIsPlayedFlow(...)");
            l44.b3 b3Var = l44.b3.f316041a;
            java.lang.String snsId = this.f305123h.getSnsId();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeFlowWithDefault", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            kotlinx.coroutines.flow.j[] jVarArr = {new l44.w2(b3Var.a(snsId)), new l44.z2(b3Var.b(snsId))};
            int i18 = kotlinx.coroutines.flow.i1.f310295a;
            kotlinx.coroutines.flow.i0 i0Var = new kotlinx.coroutines.flow.i0(new l44.a3(e0Var, null), new v26.v(kz5.z.B(jVarArr), oz5.m.f350329d, -2, u26.u.SUSPEND));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeFlowWithDefault", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            k84.k2 k2Var = new k84.k2(null);
            k84.l2 l2Var = new k84.l2(d4Var);
            this.f305119d = 1;
            java.lang.Object a17 = v26.b0.a(l2Var, new kotlinx.coroutines.flow.j[]{cheerPagIsPlayedFlow, i0Var}, kotlinx.coroutines.flow.h2.f310288d, new kotlinx.coroutines.flow.g2(k2Var, null), this);
            if (a17 != pz5.a.f359186d) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6");
        return f0Var;
    }
}
