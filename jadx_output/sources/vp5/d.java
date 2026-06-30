package vp5;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final vp5.c f439100a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439101b;

    public d(vp5.c errnoCode, java.lang.String path) {
        kotlin.jvm.internal.o.g(errnoCode, "errnoCode");
        kotlin.jvm.internal.o.g(path, "path");
        this.f439100a = errnoCode;
        this.f439101b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.d)) {
            return false;
        }
        vp5.d dVar = (vp5.d) obj;
        return this.f439100a == dVar.f439100a && kotlin.jvm.internal.o.b(this.f439101b, dVar.f439101b);
    }

    public int hashCode() {
        return (this.f439100a.hashCode() * 31) + this.f439101b.hashCode();
    }

    public java.lang.String toString() {
        return "FileResult(errnoCode=" + this.f439100a + ", path=" + this.f439101b + ")";
    }
}
