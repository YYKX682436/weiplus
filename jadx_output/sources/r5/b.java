package r5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f392513a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f392514b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f392515c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f392516d;

    public b(r5.c registry) {
        kotlin.jvm.internal.o.g(registry, "registry");
        this.f392513a = kz5.n0.V0(registry.f392517a);
        this.f392514b = kz5.n0.V0(registry.f392518b);
        this.f392515c = kz5.n0.V0(registry.f392519c);
        this.f392516d = kz5.n0.V0(registry.f392520d);
    }

    public final r5.b a(x5.g fetcher, java.lang.Class type) {
        kotlin.jvm.internal.o.g(fetcher, "fetcher");
        kotlin.jvm.internal.o.g(type, "type");
        this.f392515c.add(new jz5.l(fetcher, type));
        return this;
    }

    public final r5.b b(z5.b mapper, java.lang.Class type) {
        kotlin.jvm.internal.o.g(mapper, "mapper");
        kotlin.jvm.internal.o.g(type, "type");
        this.f392514b.add(new jz5.l(mapper, type));
        return this;
    }
}
