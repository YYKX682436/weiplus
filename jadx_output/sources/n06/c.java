package n06;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f333948a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.b f333949b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.b f333950c;

    public c(n16.b javaClass, n16.b kotlinReadOnly, n16.b kotlinMutable) {
        kotlin.jvm.internal.o.g(javaClass, "javaClass");
        kotlin.jvm.internal.o.g(kotlinReadOnly, "kotlinReadOnly");
        kotlin.jvm.internal.o.g(kotlinMutable, "kotlinMutable");
        this.f333948a = javaClass;
        this.f333949b = kotlinReadOnly;
        this.f333950c = kotlinMutable;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n06.c)) {
            return false;
        }
        n06.c cVar = (n06.c) obj;
        return kotlin.jvm.internal.o.b(this.f333948a, cVar.f333948a) && kotlin.jvm.internal.o.b(this.f333949b, cVar.f333949b) && kotlin.jvm.internal.o.b(this.f333950c, cVar.f333950c);
    }

    public int hashCode() {
        return (((this.f333948a.hashCode() * 31) + this.f333949b.hashCode()) * 31) + this.f333950c.hashCode();
    }

    public java.lang.String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f333948a + ", kotlinReadOnly=" + this.f333949b + ", kotlinMutable=" + this.f333950c + ')';
    }
}
