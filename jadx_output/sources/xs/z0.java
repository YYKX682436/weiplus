package xs;

/* loaded from: classes12.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f456282b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f456283c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f456284d;

    public z0(java.lang.String thumbPath, java.lang.String hdThumbPath, java.lang.String thumbWritePath, java.lang.String hdThumbWritePath) {
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(hdThumbPath, "hdThumbPath");
        kotlin.jvm.internal.o.g(thumbWritePath, "thumbWritePath");
        kotlin.jvm.internal.o.g(hdThumbWritePath, "hdThumbWritePath");
        this.f456281a = thumbPath;
        this.f456282b = hdThumbPath;
        this.f456283c = thumbWritePath;
        this.f456284d = hdThumbWritePath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.z0)) {
            return false;
        }
        xs.z0 z0Var = (xs.z0) obj;
        return kotlin.jvm.internal.o.b(this.f456281a, z0Var.f456281a) && kotlin.jvm.internal.o.b(this.f456282b, z0Var.f456282b) && kotlin.jvm.internal.o.b(this.f456283c, z0Var.f456283c) && kotlin.jvm.internal.o.b(this.f456284d, z0Var.f456284d);
    }

    public int hashCode() {
        return (((((this.f456281a.hashCode() * 31) + this.f456282b.hashCode()) * 31) + this.f456283c.hashCode()) * 31) + this.f456284d.hashCode();
    }

    public java.lang.String toString() {
        return "ImagePaths(thumbPath=" + this.f456281a + ", hdThumbPath=" + this.f456282b + ", thumbWritePath=" + this.f456283c + ", hdThumbWritePath=" + this.f456284d + ')';
    }
}
