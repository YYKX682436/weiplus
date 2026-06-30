package wg3;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445731b;

    /* renamed from: c, reason: collision with root package name */
    public final int f445732c;

    /* renamed from: d, reason: collision with root package name */
    public final int f445733d;

    public k(java.lang.String str, int i17, int i18, int i19) {
        this.f445730a = str;
        this.f445731b = i17;
        this.f445732c = i18;
        this.f445733d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg3.k)) {
            return false;
        }
        wg3.k kVar = (wg3.k) obj;
        return kotlin.jvm.internal.o.b(this.f445730a, kVar.f445730a) && this.f445731b == kVar.f445731b && this.f445732c == kVar.f445732c && this.f445733d == kVar.f445733d;
    }

    public int hashCode() {
        java.lang.String str = this.f445730a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f445731b)) * 31) + java.lang.Integer.hashCode(this.f445732c)) * 31) + java.lang.Integer.hashCode(this.f445733d);
    }

    public java.lang.String toString() {
        return "MediaGroupReportInfo(groupId=" + this.f445730a + ", imageCount=" + this.f445731b + ", videoCount=" + this.f445732c + ", liveCount=" + this.f445733d + ')';
    }
}
