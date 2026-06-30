package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class d extends kotlinx.coroutines.internal.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f310490a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.d.class, java.lang.Object.class, "_consensus");
    private volatile /* synthetic */ java.lang.Object _consensus = kotlinx.coroutines.internal.c.f310485a;

    @Override // kotlinx.coroutines.internal.e0
    public kotlinx.coroutines.internal.d a() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.e0
    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object obj2 = this._consensus;
        if (obj2 == kotlinx.coroutines.internal.c.f310485a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(java.lang.Object obj, java.lang.Object obj2);

    public final java.lang.Object e(java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2 = this._consensus;
        java.lang.Object obj3 = kotlinx.coroutines.internal.c.f310485a;
        if (obj2 != obj3) {
            return obj2;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f310490a;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                z17 = false;
                break;
            }
        }
        return z17 ? obj : this._consensus;
    }

    public final java.lang.Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != kotlinx.coroutines.internal.c.f310485a;
    }

    public abstract java.lang.Object i(java.lang.Object obj);
}
