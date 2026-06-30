package vz5;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f441782a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f441783b;

    public d(java.io.File root, java.util.List segments) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(segments, "segments");
        this.f441782a = root;
        this.f441783b = segments;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz5.d)) {
            return false;
        }
        vz5.d dVar = (vz5.d) obj;
        return kotlin.jvm.internal.o.b(this.f441782a, dVar.f441782a) && kotlin.jvm.internal.o.b(this.f441783b, dVar.f441783b);
    }

    public int hashCode() {
        return (this.f441782a.hashCode() * 31) + this.f441783b.hashCode();
    }

    public java.lang.String toString() {
        return "FilePathComponents(root=" + this.f441782a + ", segments=" + this.f441783b + ')';
    }
}
