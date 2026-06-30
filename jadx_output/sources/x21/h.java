package x21;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f451532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451533b;

    /* renamed from: c, reason: collision with root package name */
    public long f451534c;

    public h(java.lang.String filePath, int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 4) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f451532a = filePath;
        this.f451533b = i17;
        this.f451534c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x21.h)) {
            return false;
        }
        x21.h hVar = (x21.h) obj;
        return kotlin.jvm.internal.o.b(this.f451532a, hVar.f451532a) && this.f451533b == hVar.f451533b && this.f451534c == hVar.f451534c;
    }

    public int hashCode() {
        return (((this.f451532a.hashCode() * 31) + java.lang.Integer.hashCode(this.f451533b)) * 31) + java.lang.Long.hashCode(this.f451534c);
    }

    public java.lang.String toString() {
        return "FileInfo(filePath=" + this.f451532a + ", indexPos=" + this.f451533b + ", duration=" + this.f451534c + ')';
    }
}
