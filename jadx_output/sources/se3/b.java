package se3;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406911a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f406912b;

    public b(java.lang.String path, java.lang.String query) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        this.f406911a = path;
        this.f406912b = query;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3.b)) {
            return false;
        }
        se3.b bVar = (se3.b) obj;
        return kotlin.jvm.internal.o.b(this.f406911a, bVar.f406911a) && kotlin.jvm.internal.o.b(this.f406912b, bVar.f406912b);
    }

    public int hashCode() {
        return (this.f406911a.hashCode() * 31) + this.f406912b.hashCode();
    }

    public java.lang.String toString() {
        return "CreateFrameSetRootEvent(path=" + this.f406911a + ", query=" + this.f406912b + ')';
    }
}
