package yr2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f464669a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f464670b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f464671c;

    public f(java.lang.String aesKey, java.lang.String initialIv, boolean z17) {
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(initialIv, "initialIv");
        this.f464669a = aesKey;
        this.f464670b = initialIv;
        this.f464671c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr2.f)) {
            return false;
        }
        yr2.f fVar = (yr2.f) obj;
        return kotlin.jvm.internal.o.b(this.f464669a, fVar.f464669a) && kotlin.jvm.internal.o.b(this.f464670b, fVar.f464670b) && this.f464671c == fVar.f464671c;
    }

    public int hashCode() {
        return (((this.f464669a.hashCode() * 31) + this.f464670b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f464671c);
    }

    public java.lang.String toString() {
        return "HlsTaskInfo(aesKey=" + this.f464669a + ", initialIv=" + this.f464670b + ", isHLSVideo=" + this.f464671c + ')';
    }
}
