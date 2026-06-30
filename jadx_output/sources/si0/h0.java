package si0;

/* loaded from: classes13.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f408083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(si0.l0 l0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408082e = l0Var;
        this.f408083f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.h0(this.f408082e, this.f408083f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408081d;
        si0.l0 l0Var = this.f408082e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = l0Var.f408119v;
            if (r2Var != null) {
                this.f408081d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long j17 = this.f408083f;
        long j18 = (long) (j17 / l0Var.f408116s);
        l0Var.f408111n = j18;
        l0Var.f408110m = (j18 * 1.0d) / l0Var.f408112o.getDuration();
        kotlinx.coroutines.y0 y0Var = l0Var.f408117t;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new si0.g0(l0Var, j17, null), 2, null);
        return jz5.f0.f302826a;
    }
}
