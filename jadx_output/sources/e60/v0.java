package e60;

/* loaded from: classes11.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f249745a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f249746b;

    /* renamed from: c, reason: collision with root package name */
    public final int f249747c;

    /* renamed from: d, reason: collision with root package name */
    public final e60.s0 f249748d;

    public v0(java.lang.String mediaPath, java.lang.String thumbPath, int i17, e60.s0 s0Var) {
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        this.f249745a = mediaPath;
        this.f249746b = thumbPath;
        this.f249747c = i17;
        this.f249748d = s0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.v0)) {
            return false;
        }
        e60.v0 v0Var = (e60.v0) obj;
        return kotlin.jvm.internal.o.b(this.f249745a, v0Var.f249745a) && kotlin.jvm.internal.o.b(this.f249746b, v0Var.f249746b) && this.f249747c == v0Var.f249747c && kotlin.jvm.internal.o.b(this.f249748d, v0Var.f249748d);
    }

    public int hashCode() {
        int hashCode = ((((this.f249745a.hashCode() * 31) + this.f249746b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f249747c)) * 31;
        e60.s0 s0Var = this.f249748d;
        return hashCode + (s0Var == null ? 0 : s0Var.hashCode());
    }

    public java.lang.String toString() {
        return "GalleryFileInfo(mediaPath=" + this.f249745a + ", thumbPath=" + this.f249746b + ", videoDurationSec=" + this.f249747c + ", mediaCDNInfo=" + this.f249748d + ')';
    }
}
