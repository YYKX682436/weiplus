package im1;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final yf.s f292202a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f292203b;

    public p(yf.s type, java.lang.String path) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        this.f292202a = type;
        this.f292203b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im1.p)) {
            return false;
        }
        im1.p pVar = (im1.p) obj;
        return this.f292202a == pVar.f292202a && kotlin.jvm.internal.o.b(this.f292203b, pVar.f292203b);
    }

    public int hashCode() {
        return (this.f292202a.hashCode() * 31) + this.f292203b.hashCode();
    }

    public java.lang.String toString() {
        return "StickerApplyParams(type=" + this.f292202a + ", path=" + this.f292203b + ')';
    }
}
