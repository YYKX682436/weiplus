package u06;

/* loaded from: classes16.dex */
public final class m0 extends u06.b0 implements e16.x {

    /* renamed from: a, reason: collision with root package name */
    public final u06.k0 f423515a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.annotation.Annotation[] f423516b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f423517c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423518d;

    public m0(u06.k0 type, java.lang.annotation.Annotation[] reflectAnnotations, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(reflectAnnotations, "reflectAnnotations");
        this.f423515a = type;
        this.f423516b = reflectAnnotations;
        this.f423517c = str;
        this.f423518d = z17;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return u06.m.a(this.f423516b, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        return u06.m.b(this.f423516b);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u06.m0.class.getName());
        sb6.append(": ");
        sb6.append(this.f423518d ? "vararg " : "");
        java.lang.String str = this.f423517c;
        sb6.append(str != null ? n16.g.j(str) : null);
        sb6.append(": ");
        sb6.append(this.f423515a);
        return sb6.toString();
    }
}
