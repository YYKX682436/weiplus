package k84;

/* loaded from: classes4.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f305244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(long j17, android.content.Context context, k84.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305244e = j17;
        this.f305245f = context;
        this.f305246g = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        k84.s4 s4Var = new k84.s4(this.f305244e, this.f305245f, this.f305246g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return s4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        java.lang.Object invokeSuspend = ((k84.s4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305243d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f305243d = 1;
            if (kotlinx.coroutines.k1.b(this.f305244e, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object obj2 = this.f305245f;
        androidx.lifecycle.n nVar = null;
        androidx.lifecycle.y yVar = obj2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj2 : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            nVar = mo133getLifecycle.b();
        }
        boolean z17 = nVar != androidx.lifecycle.n.RESUMED;
        if (!z17) {
            ca4.z0.I0(new long[]{0, 100});
        }
        com.tencent.mars.xlog.Log.i(this.f305246g.j(), "doFullScreenVibrateDelay isNotResumed is " + z17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$doFullScreenVibrateDelay$1");
        return f0Var;
    }
}
