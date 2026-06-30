package xe3;

/* loaded from: classes15.dex */
public final class f extends ve3.q {

    /* renamed from: a, reason: collision with root package name */
    public final int f453941a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f453942b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f453943c;

    /* renamed from: d, reason: collision with root package name */
    public final rh3.r f453944d;

    /* renamed from: e, reason: collision with root package name */
    public final af3.b f453945e;

    /* renamed from: f, reason: collision with root package name */
    public final rh3.q f453946f;

    public f(int i17, java.lang.String src, boolean z17, boolean z18, java.lang.String mediaId, int i18, kotlin.jvm.internal.i iVar) {
        src = (i18 & 2) != 0 ? "" : src;
        mediaId = (i18 & 16) != 0 ? "" : mediaId;
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f453941a = i17;
        this.f453942b = src;
        this.f453943c = mediaId;
        af3.b bVar = new af3.b(this);
        this.f453945e = bVar;
        this.f453946f = new rh3.q();
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "create external video player item");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mars.xlog.Log.i("MMPlayerFactory", "buildMPPlayer");
        rh3.r rVar = new rh3.r(new sh3.a(new com.tencent.thumbplayer.tplayer.TPPlayer(context), null));
        rVar.q(bVar);
        rVar.i(bVar);
        rVar.h(bVar);
        rVar.f(bVar);
        rVar.p(bVar);
        rVar.o(bVar);
        rVar.l(bVar);
        rVar.e(bVar);
        this.f453944d = rVar;
    }

    @Override // ve3.q
    public int a() {
        return this.f453941a;
    }

    public void d(boolean z17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "setLoop " + this);
        this.f453944d.b(z17);
    }

    public void e(ve3.o callback) {
        mq0.d0 b17;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "startPlay " + this);
        rh3.r rVar = this.f453944d;
        if (rVar.isPlaying()) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_video_item", "startPlay already playing " + this);
            ((xd3.c) callback).b(-1, "already playing");
            return;
        }
        af3.b bVar = this.f453945e;
        if (bVar.f4543h && (b17 = bVar.b()) != null) {
            mq0.d0.Ub(b17, "useVideoCache", bVar.f4544i, null, 4, null);
        }
        rVar.start();
    }

    public java.lang.String toString() {
        return "MBExternalVideoPlayerItem(playId=" + this.f453941a + ", mediaId='" + this.f453943c + "')";
    }
}
