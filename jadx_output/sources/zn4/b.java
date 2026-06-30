package zn4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f474493a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f474494b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f474495c;

    public b(yz5.a get, yz5.l set) {
        kotlin.jvm.internal.o.g(get, "get");
        kotlin.jvm.internal.o.g(set, "set");
        this.f474493a = get;
        this.f474494b = set;
    }

    public final java.lang.Object a(java.lang.Object obj, f06.v property) {
        kotlin.jvm.internal.o.g(property, "property");
        return this.f474493a.invoke();
    }

    public final void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        if (kotlin.jvm.internal.o.b(obj2, this.f474493a.invoke())) {
            return;
        }
        this.f474495c = true;
        this.f474494b.invoke(obj2);
    }
}
