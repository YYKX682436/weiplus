package hh;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f281428a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f281429b;

    /* renamed from: c, reason: collision with root package name */
    public final f06.l f281430c;

    public a(yz5.a receiver, f06.l backingProperty) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        kotlin.jvm.internal.o.g(backingProperty, "backingProperty");
        this.f281428a = null;
        this.f281429b = receiver;
        this.f281430c = backingProperty;
    }

    public final java.lang.Object a(java.lang.Object obj, f06.v property) {
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.Object obj2 = this.f281428a;
        if (obj2 == null) {
            yz5.a aVar = this.f281429b;
            kotlin.jvm.internal.o.d(aVar);
            obj2 = aVar.invoke();
        }
        return this.f281430c.get(obj2);
    }

    public final void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.Object obj3 = this.f281428a;
        if (obj3 == null) {
            yz5.a aVar = this.f281429b;
            kotlin.jvm.internal.o.d(aVar);
            obj3 = aVar.invoke();
        }
        this.f281430c.I(obj3, obj2);
    }
}
