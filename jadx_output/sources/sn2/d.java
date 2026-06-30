package sn2;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService f410124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f410125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f410124d = finderLiveMediaBrowserService;
        this.f410125e = bitmap;
        this.f410126f = str;
        this.f410127g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService = this.f410124d;
        android.graphics.Bitmap bitmap = this.f410125e;
        finderLiveMediaBrowserService.f120857t = bitmap;
        android.support.v4.media.r rVar = new android.support.v4.media.r();
        java.lang.String str = this.f410126f;
        rVar.d("android.media.metadata.TITLE", str);
        java.lang.String str2 = this.f410127g;
        rVar.d("android.media.metadata.ARTIST", str2);
        rVar.d("android.media.metadata.DISPLAY_TITLE", str);
        rVar.d("android.media.metadata.DISPLAY_SUBTITLE", str2);
        rVar.b("android.media.metadata.ALBUM_ART", bitmap);
        android.support.v4.media.MediaMetadataCompat a17 = rVar.a();
        android.support.v4.media.session.f0 f0Var = finderLiveMediaBrowserService.f120852o;
        if (f0Var == null) {
            kotlin.jvm.internal.o.o("mediaSession");
            throw null;
        }
        f0Var.g(a17);
        android.support.v4.media.session.k0 k0Var = finderLiveMediaBrowserService.f120853p;
        if (k0Var == null) {
            kotlin.jvm.internal.o.o("stateBuilder");
            throw null;
        }
        finderLiveMediaBrowserService.i(k0Var.a().f8952d);
        com.tencent.mars.xlog.Log.i(finderLiveMediaBrowserService.f120851n, "updateMetadataWithCover - Cover updated");
        return jz5.f0.f302826a;
    }
}
