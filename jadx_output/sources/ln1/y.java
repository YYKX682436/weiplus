package ln1;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.z f319873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f319874b;

    /* renamed from: c, reason: collision with root package name */
    public final long f319875c;

    public y(ln1.z zVar, java.lang.Object obj, long j17) {
        this.f319873a = zVar;
        this.f319874b = obj;
        this.f319875c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln1.y)) {
            return false;
        }
        ln1.y yVar = (ln1.y) obj;
        return kotlin.jvm.internal.o.b(this.f319873a, yVar.f319873a) && kotlin.jvm.internal.o.b(this.f319874b, yVar.f319874b) && this.f319875c == yVar.f319875c;
    }

    public int hashCode() {
        ln1.z zVar = this.f319873a;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        java.lang.Object obj = this.f319874b;
        return ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f319875c);
    }

    public java.lang.String toString() {
        return "FlowData(runnbale=" + this.f319873a + ", obj=" + this.f319874b + ", size=" + this.f319875c + ')';
    }
}
