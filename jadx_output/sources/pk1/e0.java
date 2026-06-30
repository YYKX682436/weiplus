package pk1;

/* loaded from: classes12.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f355440a;

    /* renamed from: b, reason: collision with root package name */
    public long f355441b;

    /* renamed from: c, reason: collision with root package name */
    public long f355442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f355443d;

    public e0(java.lang.String srcUrl, java.lang.String downloadId, long j17, long j18, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 4) != 0 ? 0L : j17;
        j18 = (i18 & 8) != 0 ? -1L : j18;
        i17 = (i18 & 16) != 0 ? 100 : i17;
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        this.f355440a = srcUrl;
        this.f355441b = j17;
        this.f355442c = j18;
        this.f355443d = i17;
    }
}
