package jz5;

/* loaded from: classes8.dex */
public final class m implements jz5.g, java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f302835f = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(jz5.m.class, java.lang.Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile yz5.a f302836d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f302837e;

    public m(yz5.a initializer) {
        kotlin.jvm.internal.o.g(initializer, "initializer");
        this.f302836d = initializer;
        this.f302837e = jz5.a0.f302815a;
    }

    @Override // jz5.g
    public java.lang.Object getValue() {
        boolean z17;
        java.lang.Object obj = this.f302837e;
        jz5.a0 a0Var = jz5.a0.f302815a;
        if (obj != a0Var) {
            return obj;
        }
        yz5.a aVar = this.f302836d;
        if (aVar != null) {
            java.lang.Object invoke = aVar.invoke();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f302835f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, invoke)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                this.f302836d = null;
                return invoke;
            }
        }
        return this.f302837e;
    }

    @Override // jz5.g
    public boolean isInitialized() {
        return this.f302837e != jz5.a0.f302815a;
    }

    public java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
