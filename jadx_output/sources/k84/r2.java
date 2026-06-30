package k84;

/* loaded from: classes4.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f305223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, k84.d4 d4Var, mb4.r rVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305223e = snsInfo;
        this.f305224f = d4Var;
        this.f305225g = rVar;
        this.f305226h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        k84.r2 r2Var = new k84.r2(this.f305223e, this.f305224f, this.f305225g, this.f305226h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        return r2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        java.lang.Object invokeSuspend = ((k84.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305222d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j e17 = i64.o.f289257d.e(a84.d0.c(this.f305223e));
            k84.q2 q2Var = new k84.q2(this.f305224f, this.f305225g, this.f305226h);
            this.f305222d = 1;
            if (((kotlinx.coroutines.flow.h3) e17).a(q2Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5");
        return f0Var;
    }
}
