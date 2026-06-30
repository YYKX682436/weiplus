package yx0;

/* loaded from: classes5.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467250e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yx0.d5 d5Var = new yx0.d5(this.f467250e, continuation);
        d5Var.f467249d = obj;
        return d5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f467249d;
        yx0.b8 b8Var = this.f467250e;
        java.util.concurrent.locks.ReentrantLock reentrantLock = b8Var.f467193t;
        reentrantLock.lock();
        try {
            int ordinal = b8Var.f467192s.ordinal();
            jz5.f0 f0Var = jz5.f0.f302826a;
            switch (ordinal) {
                case 0:
                    b8Var.T();
                    return f0Var;
                case 1:
                    return f0Var;
                case 2:
                    return f0Var;
                case 3:
                    kotlinx.coroutines.l.f(null, new yx0.x4(b8Var, null), 1, null);
                    break;
                case 5:
                    return f0Var;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    b8Var.u(false, new yx0.y4(b8Var));
                    return f0Var;
                case 14:
                    kotlinx.coroutines.l.f(null, new yx0.z4(b8Var, null), 1, null);
                    b8Var.T();
                    return f0Var;
                case 15:
                case 16:
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShootComposingCorePlugin", "resumeShootingState but state is " + b8Var.f467192s);
                    return f0Var;
                case 17:
                    return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new yx0.a5(b8Var, null), 2, null);
            b8Var.q0(yx0.v.f467698i);
            b8Var.f467194u = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.c5(b8Var, null), 3, null);
            return f0Var;
        } finally {
            reentrantLock.unlock();
        }
    }
}
