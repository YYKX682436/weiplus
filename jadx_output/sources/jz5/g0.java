package jz5;

/* loaded from: classes8.dex */
public final class g0 implements jz5.g, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f302827d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f302828e;

    public g0(yz5.a initializer) {
        kotlin.jvm.internal.o.g(initializer, "initializer");
        this.f302827d = initializer;
        this.f302828e = jz5.a0.f302815a;
    }

    @Override // jz5.g
    public java.lang.Object getValue() {
        if (this.f302828e == jz5.a0.f302815a) {
            yz5.a aVar = this.f302827d;
            kotlin.jvm.internal.o.d(aVar);
            this.f302828e = aVar.invoke();
            this.f302827d = null;
        }
        return this.f302828e;
    }

    @Override // jz5.g
    public boolean isInitialized() {
        return this.f302828e != jz5.a0.f302815a;
    }

    public java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
