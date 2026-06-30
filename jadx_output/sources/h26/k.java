package h26;

/* loaded from: classes16.dex */
public final class k implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final h26.l f278350a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f278351b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f278352c;

    public k(h26.l kind, java.lang.String... formatParams) {
        kotlin.jvm.internal.o.g(kind, "kind");
        kotlin.jvm.internal.o.g(formatParams, "formatParams");
        this.f278350a = kind;
        this.f278351b = formatParams;
        h26.b[] bVarArr = h26.b.f278327d;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        java.lang.String format = java.lang.String.format(kind.f278372d, java.util.Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format("[Error type: %s]", java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        this.f278352c = format2;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return kz5.p0.f313996d;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return kz5.p0.f313996d;
    }

    @Override // f26.c2
    public l06.o h() {
        jz5.g gVar = l06.i.f314882f;
        return (l06.i) ((jz5.n) l06.i.f314882f).getValue();
    }

    @Override // f26.c2
    public o06.j i() {
        h26.m.f278374a.getClass();
        return h26.m.f278376c;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    public java.lang.String toString() {
        return this.f278352c;
    }
}
