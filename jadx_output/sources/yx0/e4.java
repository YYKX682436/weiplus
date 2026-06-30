package yx0;

/* loaded from: classes5.dex */
public final class e4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(yx0.b8 b8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467278d = b8Var;
        this.f467279e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.e4(this.f467278d, this.f467279e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.e4 e4Var = (yx0.e4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var = this.f467278d;
        java.lang.String str = this.f467279e;
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "onPause. state: " + b8Var.f467192s);
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = b8Var.f467193t;
        reentrantLock2.lock();
        try {
            switch (b8Var.f467192s.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 14:
                case 15:
                case 16:
                case 17:
                    reentrantLock2.unlock();
                    return jz5.f0.f302826a;
                case 1:
                    kotlinx.coroutines.l.f(null, new yx0.u0(b8Var, null), 1, null);
                    break;
                case 5:
                    kotlinx.coroutines.l.f(null, new yx0.v0(b8Var, null), 1, null);
                    break;
                case 6:
                    kotlinx.coroutines.l.f(null, new yx0.x0(b8Var, null), 1, null);
                    break;
                case 7:
                    kotlinx.coroutines.l.f(null, new yx0.w0(b8Var, null), 1, null);
                    break;
                case 8:
                    kotlinx.coroutines.l.f(null, new yx0.y0(b8Var, null), 1, null);
                    break;
                case 9:
                    kotlinx.coroutines.l.f(null, new yx0.z0(b8Var, null), 1, null);
                    break;
                case 10:
                    kotlinx.coroutines.l.f(null, new yx0.a1(b8Var, null), 1, null);
                    break;
                case 11:
                    kotlinx.coroutines.l.f(null, new yx0.b1(b8Var, null), 1, null);
                    break;
                case 12:
                    kotlinx.coroutines.l.f(null, new yx0.c1(b8Var, null), 1, null);
                    b8Var.W(str, false);
                    break;
                case 13:
                    kotlinx.coroutines.l.f(null, new yx0.s0(b8Var, null), 1, null);
                    break;
            }
            b8Var.q0(yx0.v.f467696g);
            b8Var.f467194u = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.t0(b8Var, null), 3, null);
            reentrantLock2.unlock();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            reentrantLock2.unlock();
            throw th6;
        }
    }
}
