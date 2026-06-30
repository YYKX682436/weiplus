package n06;

/* loaded from: classes15.dex */
public final class y extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f334016b;

    public y(java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f334015a = str;
        this.f334016b = h0Var;
    }

    @Override // o26.e
    public java.lang.Object a() {
        n06.r rVar = (n06.r) this.f334016b.f310123d;
        return rVar == null ? n06.r.f334005g : rVar;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.g javaClassDescriptor = (o06.g) obj;
        kotlin.jvm.internal.o.g(javaClassDescriptor, "javaClassDescriptor");
        java.lang.String a17 = g16.v0.a(g16.a1.f267591a, javaClassDescriptor, this.f334015a);
        boolean contains = n06.e0.f333971c.contains(a17);
        kotlin.jvm.internal.h0 h0Var = this.f334016b;
        if (contains) {
            h0Var.f310123d = n06.r.f334002d;
        } else if (n06.e0.f333973e.contains(a17)) {
            h0Var.f310123d = n06.r.f334003e;
        } else if (n06.e0.f333972d.contains(a17)) {
            h0Var.f310123d = n06.r.f334004f;
        } else if (n06.e0.f333970b.contains(a17)) {
            h0Var.f310123d = n06.r.f334006h;
        }
        return h0Var.f310123d == null;
    }
}
