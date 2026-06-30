package yx0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.base.MJError f467108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yx0.b8 b8Var, com.tencent.maas.instamovie.base.MJError mJError, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467107d = b8Var;
        this.f467108e = mJError;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.a0(this.f467107d, this.f467108e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.a0 a0Var = (yx0.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String message = this.f467108e.message;
        kotlin.jvm.internal.o.f(message, "message");
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
        yx0.b8 b8Var = this.f467107d;
        b8Var.f0(message);
        b8Var.n0();
        return jz5.f0.f302826a;
    }
}
