package wj;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final xj.m f446462a;

    /* renamed from: b, reason: collision with root package name */
    public final wj.o0 f446463b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f446464c;

    public p(xj.m mVar, wj.o0 value, java.lang.String str) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f446462a = mVar;
        this.f446463b = value;
        this.f446464c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj.p)) {
            return false;
        }
        wj.p pVar = (wj.p) obj;
        return kotlin.jvm.internal.o.b(this.f446462a, pVar.f446462a) && this.f446463b == pVar.f446463b && kotlin.jvm.internal.o.b(this.f446464c, pVar.f446464c);
    }

    public int hashCode() {
        xj.m mVar = this.f446462a;
        int hashCode = (((mVar == null ? 0 : mVar.hashCode()) * 31) + this.f446463b.hashCode()) * 31;
        java.lang.String str = this.f446464c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GetAdInfoOutcome(adInfo=" + this.f446462a + ", value=" + this.f446463b + ", extra=" + this.f446464c + ')';
    }
}
