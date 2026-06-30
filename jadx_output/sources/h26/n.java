package h26;

/* loaded from: classes16.dex */
public final class n extends h26.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h26.i kind, java.lang.String... formatParams) {
        super(kind, (java.lang.String[]) java.util.Arrays.copyOf(formatParams, formatParams.length));
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(formatParams, "formatParams");
    }

    @Override // h26.h, y16.s
    public java.util.Set a() {
        throw new java.lang.IllegalStateException();
    }

    @Override // h26.h, y16.s
    public /* bridge */ /* synthetic */ java.util.Collection b(n16.g gVar, w06.a aVar) {
        b(gVar, aVar);
        throw null;
    }

    @Override // h26.h, y16.s
    public /* bridge */ /* synthetic */ java.util.Collection c(n16.g gVar, w06.a aVar) {
        c(gVar, aVar);
        throw null;
    }

    @Override // h26.h, y16.s
    public java.util.Set d() {
        throw new java.lang.IllegalStateException();
    }

    @Override // h26.h, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        throw new java.lang.IllegalStateException(this.f278335b + ", required name: " + name);
    }

    @Override // h26.h, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        throw new java.lang.IllegalStateException(this.f278335b);
    }

    @Override // h26.h, y16.s
    public java.util.Set g() {
        throw new java.lang.IllegalStateException();
    }

    @Override // h26.h
    /* renamed from: h */
    public java.util.Set b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        throw new java.lang.IllegalStateException(this.f278335b + ", required name: " + name);
    }

    @Override // h26.h
    /* renamed from: i */
    public java.util.Set c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        throw new java.lang.IllegalStateException(this.f278335b + ", required name: " + name);
    }

    @Override // h26.h
    public java.lang.String toString() {
        return "ThrowingScope{" + this.f278335b + '}';
    }
}
