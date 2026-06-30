package v24;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432928a;

    /* renamed from: b, reason: collision with root package name */
    public long f432929b;

    /* renamed from: c, reason: collision with root package name */
    public int f432930c;

    /* renamed from: d, reason: collision with root package name */
    public int f432931d;

    public j(java.lang.String path, long j17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        j17 = (i19 & 2) != 0 ? 0L : j17;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(path, "path");
        this.f432928a = path;
        this.f432929b = j17;
        this.f432930c = i17;
        this.f432931d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v24.j)) {
            return false;
        }
        v24.j jVar = (v24.j) obj;
        return kotlin.jvm.internal.o.b(this.f432928a, jVar.f432928a) && this.f432929b == jVar.f432929b && this.f432930c == jVar.f432930c && this.f432931d == jVar.f432931d;
    }

    public int hashCode() {
        return (((((this.f432928a.hashCode() * 31) + java.lang.Long.hashCode(this.f432929b)) * 31) + java.lang.Integer.hashCode(this.f432930c)) * 31) + java.lang.Integer.hashCode(this.f432931d);
    }

    public java.lang.String toString() {
        return "DirEnt(path=" + this.f432928a + ", diskSpace=" + this.f432929b + ", fileCount=" + this.f432930c + ", dirCount=" + this.f432931d + ')';
    }
}
