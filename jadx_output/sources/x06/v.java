package x06;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f451327a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f451328b;

    /* renamed from: c, reason: collision with root package name */
    public final e16.g f451329c;

    public v(n16.b classId, byte[] bArr, e16.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        bArr = (i17 & 2) != 0 ? null : bArr;
        gVar = (i17 & 4) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(classId, "classId");
        this.f451327a = classId;
        this.f451328b = bArr;
        this.f451329c = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.v)) {
            return false;
        }
        x06.v vVar = (x06.v) obj;
        return kotlin.jvm.internal.o.b(this.f451327a, vVar.f451327a) && kotlin.jvm.internal.o.b(this.f451328b, vVar.f451328b) && kotlin.jvm.internal.o.b(this.f451329c, vVar.f451329c);
    }

    public int hashCode() {
        int hashCode = this.f451327a.hashCode() * 31;
        byte[] bArr = this.f451328b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        e16.g gVar = this.f451329c;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Request(classId=" + this.f451327a + ", previouslyFoundClassFileContent=" + java.util.Arrays.toString(this.f451328b) + ", outerClass=" + this.f451329c + ')';
    }
}
