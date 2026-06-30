package xs1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f456296a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f456297b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f456298c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456300e;

    public d(java.lang.String url, com.tencent.mm.vfs.r6 savedFile) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(savedFile, "savedFile");
        this.f456296a = url;
        this.f456297b = savedFile;
        this.f456299d = "";
        this.f456300e = "";
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebPrefetcherHttpDownloadRequest{eTag: ");
        sb6.append(this.f456299d);
        sb6.append(", wxETag: ");
        sb6.append(this.f456300e);
        sb6.append(", savedFile: ");
        com.tencent.mm.vfs.r6 r6Var = this.f456297b;
        sb6.append(r6Var.o());
        sb6.append(", ");
        sb6.append(r6Var.m());
        sb6.append('}');
        java.lang.String format = java.lang.String.format(sb6.toString(), java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
