package yx0;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.base.MJError f467408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yx0.b8 b8Var, com.tencent.maas.instamovie.base.MJError mJError, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467407e = b8Var;
        this.f467408f = mJError;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.k(this.f467407e, this.f467408f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467406d;
        yx0.b8 b8Var = this.f467407e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (b8Var.Z()) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                yx0.j jVar = new yx0.j(b8Var, null);
                this.f467406d = 1;
                if (kotlinx.coroutines.l.g(g3Var, jVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String message = this.f467408f.message;
        kotlin.jvm.internal.o.f(message, "message");
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
        b8Var.f0(message);
        b8Var.n0();
        return jz5.f0.f302826a;
    }
}
