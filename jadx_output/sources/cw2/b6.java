package cw2;

/* loaded from: classes14.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f223595a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f223596b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderThumbPlayerPostProcessor$CachedSurface f223597c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f223598d;

    /* renamed from: e, reason: collision with root package name */
    public int f223599e;

    /* renamed from: f, reason: collision with root package name */
    public int f223600f;

    /* renamed from: g, reason: collision with root package name */
    public int f223601g;

    public b6(long j17, int i17, android.os.Handler handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f223595a = j17;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        surfaceTexture.setOnFrameAvailableListener(new cw2.a6(this), handler);
        this.f223596b = surfaceTexture;
        this.f223597c = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerPostProcessor$CachedSurface(surfaceTexture);
    }
}
