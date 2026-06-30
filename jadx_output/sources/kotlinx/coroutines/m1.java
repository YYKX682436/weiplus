package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class m1 extends kotlinx.coroutines.internal.h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f310554g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.m1.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public m1(oz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(lVar, continuation);
        this._decision = 0;
    }

    public final java.lang.Object k0() {
        boolean z17;
        while (true) {
            int i17 = this._decision;
            z17 = false;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended".toString());
                }
            } else if (f310554g.compareAndSet(this, 0, 1)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return pz5.a.f359186d;
        }
        java.lang.Object a17 = kotlinx.coroutines.d3.a(P());
        if (a17 instanceof kotlinx.coroutines.e0) {
            throw ((kotlinx.coroutines.e0) a17).f310172a;
        }
        return a17;
    }

    @Override // kotlinx.coroutines.internal.h0, kotlinx.coroutines.c3
    public void u(java.lang.Object obj) {
        v(obj);
    }

    @Override // kotlinx.coroutines.internal.h0, kotlinx.coroutines.c3
    public void v(java.lang.Object obj) {
        boolean z17;
        while (true) {
            int i17 = this._decision;
            z17 = false;
            if (i17 != 0) {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
            } else if (f310554g.compareAndSet(this, 0, 2)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        kotlinx.coroutines.internal.i.b(pz5.f.b(this.f310497f), kotlinx.coroutines.i0.a(obj, this.f310497f), null, 2, null);
    }
}
