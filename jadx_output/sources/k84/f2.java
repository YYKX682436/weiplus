package k84;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f305031d;

    /* renamed from: e, reason: collision with root package name */
    public int f305032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(mb4.r rVar, android.content.Context context, k84.d4 d4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305033f = rVar;
        this.f305034g = context;
        this.f305035h = d4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        k84.f2 f2Var = new k84.f2(this.f305033f, this.f305034g, this.f305035h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return f2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        java.lang.Object invokeSuspend = ((k84.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305032e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mb4.r rVar = this.f305033f;
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVibrateDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            int i18 = rVar.f325463j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVibrateDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            long j18 = i18;
            this.f305031d = j18;
            this.f305032e = 1;
            if (kotlinx.coroutines.k1.b(j18, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
                return aVar;
            }
            j17 = j18;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
                throw illegalStateException;
            }
            j17 = this.f305031d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object obj2 = this.f305034g;
        androidx.lifecycle.n nVar = null;
        androidx.lifecycle.y yVar = obj2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) obj2 : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            nVar = mo133getLifecycle.b();
        }
        boolean z17 = nVar != androidx.lifecycle.n.RESUMED;
        if (!z17) {
            ca4.z0.I0(new long[]{0, 100});
        }
        com.tencent.mars.xlog.Log.i(this.f305035h.j(), "vibrateJob delay " + j17 + ' ' + z17);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$6$1$1$1");
        return f0Var;
    }
}
