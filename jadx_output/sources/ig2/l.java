package ig2;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f291392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291392e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ig2.l(this.f291392e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ig2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291391d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f291391d = 1;
            if (kotlinx.coroutines.k1.b(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startEnterLiveCountDown launch timeout feedId: ");
        long j17 = this.f291392e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", sb6.toString());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        ig2.k kVar = new ig2.k(j17, null);
        this.f291391d = 2;
        if (kotlinx.coroutines.l.g(g3Var, kVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
