package tk;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419883a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f419884b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f419885c;

    public x(java.lang.String path, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f419883a = path;
        this.f419884b = z17;
        this.f419885c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.x)) {
            return false;
        }
        tk.x xVar = (tk.x) obj;
        return kotlin.jvm.internal.o.b(this.f419883a, xVar.f419883a) && this.f419884b == xVar.f419884b && kotlin.jvm.internal.o.b(this.f419885c, xVar.f419885c);
    }

    public int hashCode() {
        int hashCode = ((this.f419883a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f419884b)) * 31;
        java.lang.String str = this.f419885c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "SnsPhotoInfo(path=" + this.f419883a + ", isLivePhoto=" + this.f419884b + ", videoPath=" + this.f419885c + ')';
    }
}
