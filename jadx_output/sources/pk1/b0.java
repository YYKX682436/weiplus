package pk1;

/* loaded from: classes12.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long f355420a;

    /* renamed from: b, reason: collision with root package name */
    public long f355421b;

    public b0(java.lang.String srcUrl, java.lang.String downloadId, java.lang.String cachePath, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 8) != 0 ? 0L : j17;
        j18 = (i17 & 16) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        this.f355420a = j17;
        this.f355421b = j18;
    }
}
