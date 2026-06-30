package d82;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f226930a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f226931b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f226932c;

    /* renamed from: d, reason: collision with root package name */
    public d82.f f226933d;

    public g(java.lang.String dataId, java.lang.String originalPath, java.lang.String compressedPath, d82.f state, int i17, kotlin.jvm.internal.i iVar) {
        state = (i17 & 8) != 0 ? d82.f.f226926d : state;
        kotlin.jvm.internal.o.g(dataId, "dataId");
        kotlin.jvm.internal.o.g(originalPath, "originalPath");
        kotlin.jvm.internal.o.g(compressedPath, "compressedPath");
        kotlin.jvm.internal.o.g(state, "state");
        this.f226930a = dataId;
        this.f226931b = originalPath;
        this.f226932c = compressedPath;
        this.f226933d = state;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d82.g)) {
            return false;
        }
        d82.g gVar = (d82.g) obj;
        return kotlin.jvm.internal.o.b(this.f226930a, gVar.f226930a) && kotlin.jvm.internal.o.b(this.f226931b, gVar.f226931b) && kotlin.jvm.internal.o.b(this.f226932c, gVar.f226932c) && this.f226933d == gVar.f226933d;
    }

    public int hashCode() {
        return (((((this.f226930a.hashCode() * 31) + this.f226931b.hashCode()) * 31) + this.f226932c.hashCode()) * 31) + this.f226933d.hashCode();
    }

    public java.lang.String toString() {
        return "CompressTaskInfo(dataId=" + this.f226930a + ", originalPath=" + this.f226931b + ", compressedPath=" + this.f226932c + ", state=" + this.f226933d + ')';
    }
}
