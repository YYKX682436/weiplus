package yq5;

/* loaded from: classes5.dex */
public final class b implements yq5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f464589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f464590b;

    public b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f464589a = path;
        this.f464590b = "file://" + path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.b.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f464589a, ((yq5.b) obj).f464589a);
    }

    public int hashCode() {
        return this.f464589a.hashCode();
    }

    public java.lang.String toString() {
        return "FileImageSource('" + this.f464589a + "')";
    }
}
