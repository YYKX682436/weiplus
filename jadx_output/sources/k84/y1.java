package k84;

/* loaded from: classes4.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305344d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f305346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, k84.d4 d4Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305346f = snsInfo;
        this.f305347g = d4Var;
        this.f305348h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        k84.y1 y1Var = new k84.y1(this.f305346f, this.f305347g, this.f305348h, continuation);
        y1Var.f305345e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        return y1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        java.lang.Object invokeSuspend = ((k84.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305344d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f305345e;
            kotlinx.coroutines.flow.j e17 = k84.e4.f305021d.e(a84.d0.c(this.f305346f));
            k84.x1 x1Var = new k84.x1(this.f305347g, y0Var, this.f305348h);
            this.f305344d = 1;
            if (((kotlinx.coroutines.flow.h3) e17).a(x1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4");
        return f0Var;
    }
}
