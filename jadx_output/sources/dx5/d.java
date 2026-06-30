package dx5;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f244510a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244511b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f244512c;

    /* renamed from: d, reason: collision with root package name */
    public final long f244513d;

    public d(long j17, java.lang.String url, java.util.Map headers, long j18) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(headers, "headers");
        this.f244510a = j17;
        this.f244511b = url;
        this.f244512c = headers;
        this.f244513d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx5.d)) {
            return false;
        }
        dx5.d dVar = (dx5.d) obj;
        return this.f244510a == dVar.f244510a && kotlin.jvm.internal.o.b(this.f244511b, dVar.f244511b) && kotlin.jvm.internal.o.b(this.f244512c, dVar.f244512c) && this.f244513d == dVar.f244513d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f244510a) * 31) + this.f244511b.hashCode()) * 31) + this.f244512c.hashCode()) * 31) + java.lang.Long.hashCode(this.f244513d);
    }

    public java.lang.String toString() {
        return "DownloadParams(taskId=" + this.f244510a + ", url=" + this.f244511b + ", headers=" + this.f244512c + ", timeoutMillis=" + this.f244513d + ')';
    }
}
