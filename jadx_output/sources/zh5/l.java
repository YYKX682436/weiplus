package zh5;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f473038a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f473039b;

    /* renamed from: c, reason: collision with root package name */
    public final dn.m f473040c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f473041d;

    public l(java.lang.String mediaId, java.lang.String downloadPath, dn.m cdnTaskInfo) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        kotlin.jvm.internal.o.g(cdnTaskInfo, "cdnTaskInfo");
        this.f473038a = mediaId;
        this.f473039b = downloadPath;
        this.f473040c = cdnTaskInfo;
        kotlin.jvm.internal.o.f(java.util.UUID.randomUUID().toString(), "toString(...)");
    }
}
