package yx0;

/* loaded from: classes5.dex */
public final class v7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467724d = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.v7(this.f467724d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.v7 v7Var = (yx0.v7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var = this.f467724d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = b8Var.f467193t;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.l.f(null, new yx0.u7(b8Var, null), 1, null);
            reentrantLock.unlock();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }
}
