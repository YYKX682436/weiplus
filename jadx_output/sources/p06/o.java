package p06;

/* loaded from: classes15.dex */
public final class o implements p06.c {

    /* renamed from: a, reason: collision with root package name */
    public final l06.o f350768a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.c f350769b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f350770c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f350771d;

    public o(l06.o builtIns, n16.c fqName, java.util.Map allValueArguments, boolean z17) {
        kotlin.jvm.internal.o.g(builtIns, "builtIns");
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(allValueArguments, "allValueArguments");
        this.f350768a = builtIns;
        this.f350769b = fqName;
        this.f350770c = allValueArguments;
        this.f350771d = jz5.h.a(jz5.i.f302830e, new p06.n(this));
    }

    @Override // p06.c
    public n16.c a() {
        return this.f350769b;
    }

    @Override // p06.c
    public java.util.Map c() {
        return this.f350770c;
    }

    @Override // p06.c
    public o06.x1 getSource() {
        return o06.x1.f342004a;
    }

    @Override // p06.c
    public f26.o0 getType() {
        java.lang.Object value = this.f350771d.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (f26.o0) value;
    }
}
