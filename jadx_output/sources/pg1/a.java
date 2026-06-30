package pg1;

/* loaded from: classes7.dex */
public final class a implements b06.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f354077b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f354078c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354079d;

    public a(java.lang.String name, boolean z17, yz5.l setter) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(setter, "setter");
        this.f354076a = name;
        this.f354077b = z17;
        this.f354078c = setter;
    }

    @Override // b06.d
    public void a(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        synchronized (this) {
            if (this.f354079d != null && !this.f354077b) {
                throw new java.lang.IllegalStateException("'" + this.f354076a + "' is immutable");
            }
            this.f354079d = obj2;
        }
        this.f354078c.invoke(obj2);
    }

    @Override // b06.c
    public java.lang.Object b(java.lang.Object obj, f06.v property) {
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(property, "property");
        synchronized (this) {
            obj2 = this.f354079d;
            if (obj2 == null) {
                throw new jz5.e0("'" + this.f354076a + "' is not initialized yet");
            }
        }
        return obj2;
    }
}
