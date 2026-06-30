package jz5;

/* loaded from: classes8.dex */
public final class n implements jz5.g, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f302838d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f302839e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f302840f;

    public n(yz5.a initializer, java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        obj = (i17 & 2) != 0 ? null : obj;
        kotlin.jvm.internal.o.g(initializer, "initializer");
        this.f302838d = initializer;
        this.f302839e = jz5.a0.f302815a;
        this.f302840f = obj == null ? this : obj;
    }

    @Override // jz5.g
    public java.lang.Object getValue() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.f302839e;
        jz5.a0 a0Var = jz5.a0.f302815a;
        if (obj2 != a0Var) {
            return obj2;
        }
        synchronized (this.f302840f) {
            obj = this.f302839e;
            if (obj == a0Var) {
                yz5.a aVar = this.f302838d;
                kotlin.jvm.internal.o.d(aVar);
                obj = aVar.invoke();
                this.f302839e = obj;
                this.f302838d = null;
            }
        }
        return obj;
    }

    @Override // jz5.g
    public boolean isInitialized() {
        return this.f302839e != jz5.a0.f302815a;
    }

    public java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
