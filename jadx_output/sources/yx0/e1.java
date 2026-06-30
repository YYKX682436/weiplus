package yx0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467270e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.e1(this.f467270e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 release;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467269d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ky0.b bVar = ky0.b.f313452a;
            yx0.b8 b8Var = this.f467270e;
            java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
            bVar.b((yz5.a) ((jz5.n) b8Var.H).getValue());
            pp0.p0 p0Var = this.f467270e.K;
            if (p0Var == null || (release = p0Var.release()) == null) {
                return null;
            }
            yx0.b8 b8Var2 = this.f467270e;
            this.f467269d = 1;
            if (b8Var2.a0(release, "ReleaseMaasManager", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
