package vp;

/* loaded from: classes13.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f438823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(vp.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438823d = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp.p0(this.f438823d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vp.p0 p0Var = (vp.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vp.v0 v0Var = this.f438823d;
        synchronized (v0Var.f438840b) {
            v0Var.f438840b.clear();
        }
        vp.v0 v0Var2 = this.f438823d;
        v0Var2.c();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var2.f438842d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            java.util.Iterator it = ((java.util.ArrayList) v0Var2.f438841c).iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).clear();
            }
            reentrantReadWriteLock.writeLock().unlock();
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Cleared all row data");
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Cleared all danmaku data (async)");
            vp.v0 v0Var3 = this.f438823d;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = v0Var3.f438844f;
            reentrantReadWriteLock2.writeLock().lock();
            try {
                java.util.Iterator it6 = ((java.util.ArrayList) v0Var3.f438843e).iterator();
                while (it6.hasNext()) {
                    ((java.util.List) it6.next()).clear();
                }
                reentrantReadWriteLock2.writeLock().unlock();
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Cleared all follow row data");
                com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "Cleared all follow danmaku data (async)");
                return jz5.f0.f302826a;
            } catch (java.lang.Throwable th6) {
                reentrantReadWriteLock2.writeLock().unlock();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th7;
        }
    }
}
