package oh5;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345516a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345517b;

    public p(java.lang.String soName, long j17) {
        kotlin.jvm.internal.o.g(soName, "soName");
        this.f345516a = soName;
        this.f345517b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5.p)) {
            return false;
        }
        oh5.p pVar = (oh5.p) obj;
        return kotlin.jvm.internal.o.b(this.f345516a, pVar.f345516a) && this.f345517b == pVar.f345517b;
    }

    public int hashCode() {
        return (this.f345516a.hashCode() * 31) + java.lang.Long.hashCode(this.f345517b);
    }

    public java.lang.String toString() {
        return "MemoryHookInfo(soName=" + this.f345516a + ", soSize=" + this.f345517b + ')';
    }
}
