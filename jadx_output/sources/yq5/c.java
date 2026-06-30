package yq5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f464591a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f464592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f464593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f464594d;

    public c(long j17, java.lang.String mimeType, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        this.f464591a = j17;
        this.f464592b = mimeType;
        int i17 = zq5.g.f475066c;
        this.f464593c = (int) (j17 >> 32);
        this.f464594d = zq5.g.b(j17);
    }

    public final java.lang.String a() {
        return "(" + this.f464593c + 'x' + this.f464594d + ",'" + this.f464592b + "')";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.c)) {
            return false;
        }
        yq5.c cVar = (yq5.c) obj;
        return zq5.g.a(this.f464591a, cVar.f464591a) && kotlin.jvm.internal.o.b(this.f464592b, cVar.f464592b);
    }

    public int hashCode() {
        int i17 = zq5.g.f475066c;
        return (java.lang.Long.hashCode(this.f464591a) * 31) + this.f464592b.hashCode();
    }

    public java.lang.String toString() {
        return "ImageInfo(size=" + this.f464593c + 'x' + this.f464594d + ", mimeType='" + this.f464592b + "')";
    }
}
