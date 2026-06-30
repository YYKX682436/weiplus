package k84;

/* loaded from: classes4.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f305265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, k84.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305265e = snsInfo;
        this.f305266f = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        k84.t5 t5Var = new k84.t5(this.f305265e, this.f305266f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        return t5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        java.lang.Object invokeSuspend = ((k84.t5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305264d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j e17 = k84.q4.f305212d.e(a84.d0.c(this.f305265e));
            k84.r4 r4Var = k84.c6.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            k84.c6 c6Var = this.f305266f;
            kotlinx.coroutines.flow.j2 j2Var = c6Var.f304977J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            k84.r5 r5Var = new k84.r5(null);
            k84.s5 s5Var = new k84.s5(c6Var);
            this.f305264d = 1;
            java.lang.Object a17 = v26.b0.a(s5Var, new kotlinx.coroutines.flow.j[]{e17, j2Var}, kotlinx.coroutines.flow.h2.f310288d, new kotlinx.coroutines.flow.g2(r5Var, null), this);
            if (a17 != pz5.a.f359186d) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1");
        return f0Var;
    }
}
