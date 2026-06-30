package h26;

/* loaded from: classes16.dex */
public class h implements y16.s {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f278335b;

    public h(h26.i kind, java.lang.String... formatParams) {
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(formatParams, "formatParams");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        java.lang.String format = java.lang.String.format(kind.f278342d, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f278335b = format;
    }

    @Override // y16.s
    public java.util.Set a() {
        return kz5.r0.f314002d;
    }

    @Override // y16.s
    public java.util.Set d() {
        return kz5.r0.f314002d;
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        h26.b[] bVarArr = h26.b.f278327d;
        java.lang.String format = java.lang.String.format("<Error class: %s>", java.util.Arrays.copyOf(new java.lang.Object[]{name}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new h26.a(n16.g.m(format));
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return kz5.p0.f313996d;
    }

    @Override // y16.s
    public java.util.Set g() {
        return kz5.r0.f314002d;
    }

    @Override // y16.s
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public java.util.Set b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        h26.m mVar = h26.m.f278374a;
        return kz5.o1.c(new h26.d(h26.m.f278376c));
    }

    @Override // y16.s
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public java.util.Set c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        h26.m mVar = h26.m.f278374a;
        return h26.m.f278379f;
    }

    public java.lang.String toString() {
        return "ErrorScope{" + this.f278335b + '}';
    }
}
