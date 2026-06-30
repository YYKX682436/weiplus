package u06;

/* loaded from: classes16.dex */
public final class h0 extends u06.b0 implements e16.r {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f423504a;

    public h0(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        this.f423504a = fqName;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return null;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u06.h0) {
            if (kotlin.jvm.internal.o.b(this.f423504a, ((u06.h0) obj).f423504a)) {
                return true;
            }
        }
        return false;
    }

    @Override // e16.d
    public /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
        return kz5.p0.f313996d;
    }

    public int hashCode() {
        return this.f423504a.hashCode();
    }

    public java.lang.String toString() {
        return u06.h0.class.getName() + ": " + this.f423504a;
    }
}
