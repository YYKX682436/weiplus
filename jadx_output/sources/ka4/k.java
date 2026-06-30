package ka4;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f306133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f306134e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        ka4.k kVar = new ka4.k(this.f306134e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        java.lang.Object invokeSuspend = ((ka4.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f306133d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str = this.f306134e;
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = Fj.W0(com.tencent.mm.plugin.sns.storage.w2.n(str));
            if (W0 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKaraOptionConfig", "snsInfoId: " + str + " no have info");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ka4.j jVar = new ka4.j(W0, null);
            this.f306133d = 1;
            if (kotlinx.coroutines.l.g(g3Var, jVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig$setMediaIdToPredictAfterLoadThumb$1");
        return f0Var;
    }
}
