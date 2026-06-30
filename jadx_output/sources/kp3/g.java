package kp3;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f310989a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310990b;

    public g(java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        str2 = (i17 & 2) != 0 ? null : str2;
        this.f310989a = str;
        this.f310990b = str2;
        this.f310990b = ((str == null || r26.n0.N(str)) || !com.tencent.mm.vfs.w6.j(str)) ? "" : kk.k.g(com.tencent.mm.vfs.w6.N(str, 0, -1));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp3.g)) {
            return false;
        }
        kp3.g gVar = (kp3.g) obj;
        return kotlin.jvm.internal.o.b(this.f310989a, gVar.f310989a) && kotlin.jvm.internal.o.b(this.f310990b, gVar.f310990b);
    }

    public int hashCode() {
        java.lang.String str = this.f310989a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f310990b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "VideoResult(videoPath=" + this.f310989a + ", videoMd5=" + this.f310990b + ')';
    }
}
