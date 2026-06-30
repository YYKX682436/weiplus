package yx0;

/* loaded from: classes5.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(yx0.b8 b8Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467359d = b8Var;
        this.f467360e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.h4(this.f467359d, this.f467360e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.b8 b8Var = this.f467359d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = b8Var.f467193t;
        java.util.List list = this.f467360e;
        reentrantLock.lock();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "preloadTemplate, count: " + list.size());
            int ordinal = b8Var.f467192s.ordinal();
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (ordinal != 0 && ordinal != 1) {
                switch (ordinal) {
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        kotlinx.coroutines.l.f(null, new yx0.g4(b8Var, list, null), 1, null);
                        return f0Var;
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ShootComposingCorePlugin", "preloadTemplate >> but state is " + b8Var.f467192s);
            return f0Var;
        } finally {
            reentrantLock.unlock();
        }
    }
}
