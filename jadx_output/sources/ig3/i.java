package ig3;

/* loaded from: classes3.dex */
public final class i implements ig3.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291428a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f291429b;

    /* renamed from: c, reason: collision with root package name */
    public ig3.d f291430c;

    /* renamed from: d, reason: collision with root package name */
    public hg3.a f291431d;

    /* renamed from: e, reason: collision with root package name */
    public int f291432e;

    public i(java.lang.String holderLabel, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer videoView) {
        kotlin.jvm.internal.o.g(holderLabel, "holderLabel");
        kotlin.jvm.internal.o.g(videoView, "videoView");
        this.f291428a = holderLabel;
        this.f291429b = videoView;
        ig3.c cVar = ig3.c.f291416d;
    }

    public jz5.l a() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f291429b;
        return new jz5.l(java.lang.Integer.valueOf(thumbPlayerViewContainer.getCurrentPosition()), java.lang.Integer.valueOf(thumbPlayerViewContainer.getDuration()));
    }

    public boolean b() {
        return this.f291429b.isPlaying();
    }

    public final java.lang.String c(java.lang.String str) {
        return str + ("{holder@" + this.f291428a + '}');
    }

    public final void d(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MediaGallery.TPVideoStateController", c(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public void e(gg3.c cVar) {
        if (cVar == null) {
            d("setDataSource return, disposal", new java.lang.Object[0]);
            return;
        }
        hg3.a aVar = this.f291431d;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f291429b;
        if (aVar != null) {
            aVar.a(thumbPlayerViewContainer, cVar);
        }
        i(ig3.c.f291416d);
        java.lang.String f174598m = thumbPlayerViewContainer.getF174598m();
        java.lang.String str = cVar.f271728c;
        if (kotlin.jvm.internal.o.b(f174598m, str) && thumbPlayerViewContainer.isInitialized() && thumbPlayerViewContainer.e()) {
            d("setDataSource return, same ready path: " + str, new java.lang.Object[0]);
        } else {
            thumbPlayerViewContainer.stop();
            thumbPlayerViewContainer.setVideoPath(str);
            d("setDataSource set new path: " + str, new java.lang.Object[0]);
        }
    }

    public void f() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f291429b;
        if (thumbPlayerViewContainer.isPlaying()) {
            d("tryPause, set currPlayTimeMs:" + this.f291432e, new java.lang.Object[0]);
            this.f291432e = thumbPlayerViewContainer.getCurrentPosition();
            thumbPlayerViewContainer.pause();
            i(ig3.c.f291419g);
        }
    }

    public void g() {
        ig3.f fVar = new ig3.f(this);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer videoView = this.f291429b;
        videoView.setOneTimeVideoTextureUpdateCallback(fVar);
        boolean z17 = false;
        if (!videoView.isInitialized() || !videoView.e()) {
            d("tryStart, wait video", new java.lang.Object[0]);
            videoView.setVideoCallback(new ig3.h(this));
            return;
        }
        d("tryStart, video is ready", new java.lang.Object[0]);
        videoView.setVideoCallback(new ig3.g(this));
        videoView.b(this.f291432e);
        hg3.a aVar = this.f291431d;
        if (aVar != null) {
            sh5.d dVar = (sh5.d) aVar;
            kotlin.jvm.internal.o.g(videoView, "videoView");
            f25.m0 m0Var = dVar.f408032a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            if (!videoView.getF174611z()) {
                f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i.f259098c, new sh5.a(new java.lang.ref.WeakReference(videoView)));
                dVar.f408032a = m96;
                if (m96 != null && ((g25.e) m96).f267980c) {
                    z17 = true;
                }
                videoView.setMute(true ^ z17);
            }
        }
        videoView.start();
        i(ig3.c.f291417e);
    }

    public void h() {
        this.f291432e = 0;
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer videoView = this.f291429b;
        videoView.stop();
        hg3.a aVar = this.f291431d;
        if (aVar != null) {
            sh5.d dVar = (sh5.d) aVar;
            kotlin.jvm.internal.o.g(videoView, "videoView");
            f25.m0 m0Var = dVar.f408032a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            dVar.f408032a = null;
        }
        i(ig3.c.f291421i);
    }

    public final void i(ig3.c cVar) {
        d("notify uiListener, onStateChanged:" + cVar.name(), new java.lang.Object[0]);
        ig3.d dVar = this.f291430c;
        if (dVar != null) {
            dVar.I(cVar);
        }
    }
}
