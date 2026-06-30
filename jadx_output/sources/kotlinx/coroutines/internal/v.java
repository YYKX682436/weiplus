package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310533a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.v.class, java.lang.Object.class, "_cur");
    private volatile /* synthetic */ java.lang.Object _cur;

    public v(boolean z17) {
        this._cur = new kotlinx.coroutines.internal.y(8, z17);
    }

    public final boolean a(java.lang.Object obj) {
        while (true) {
            kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) this._cur;
            int a17 = yVar.a(obj);
            if (a17 == 0) {
                return true;
            }
            if (a17 == 1) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310533a;
                kotlinx.coroutines.internal.y e17 = yVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
                }
            } else if (a17 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) this._cur;
            if (yVar.b()) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310533a;
            kotlinx.coroutines.internal.y e17 = yVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
            }
        }
    }

    public final int c() {
        return ((kotlinx.coroutines.internal.y) this._cur).c();
    }

    public final java.lang.Object d() {
        while (true) {
            kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) this._cur;
            java.lang.Object f17 = yVar.f();
            if (f17 != kotlinx.coroutines.internal.y.f310537g) {
                return f17;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310533a;
            kotlinx.coroutines.internal.y e17 = yVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
            }
        }
    }
}
