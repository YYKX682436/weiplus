package z51;

/* loaded from: classes10.dex */
public final class k implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.p f470191d;

    public k(z51.p pVar) {
        this.f470191d = pVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        this.f470191d.f("onGetVideoSize >> width " + i17 + " height: " + i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion ");
        z51.p pVar = this.f470191d;
        sb6.append(pVar.f470208o);
        pVar.f(sb6.toString());
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = pVar.f470200g;
        if (thumbPlayerViewContainer == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer.stop();
        ((z51.w) pVar.a(z51.w.class)).f470233k = false;
        if (pVar.f470208o) {
            return;
        }
        ((z51.g) pVar.a(z51.g.class)).k();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        this.f470191d.e("onError " + i17 + ' ' + i18);
        f65.q.f259959a.a("play_local_live_photo", -2, 0L, "what: " + i17 + " extra: " + i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrepared isPaused:");
        z51.p pVar = this.f470191d;
        sb6.append(pVar.f470208o);
        sb6.append(" isMuted: ");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = pVar.f470200g;
        if (thumbPlayerViewContainer == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        sb6.append(thumbPlayerViewContainer.getF174611z());
        pVar.f(sb6.toString());
        if (pVar.f470208o) {
            return;
        }
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer2 = pVar.f470200g;
        if (thumbPlayerViewContainer2 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer2.start();
        z51.g gVar = (z51.g) pVar.a(z51.g.class);
        gVar.f("aniToPlayView");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer3 = ((z51.p) gVar.a(z51.p.class)).f470200g;
        if (thumbPlayerViewContainer3 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        android.widget.FrameLayout frameLayout = ((z51.p) gVar.a(z51.p.class)).f470199f;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("videoViewContainer");
            throw null;
        }
        thumbPlayerViewContainer3.setVisibility(0);
        frameLayout.post(new z51.d(gVar, thumbPlayerViewContainer3, frameLayout));
        boolean z17 = ((z51.w) pVar.a(z51.w.class)).f470233k;
        pVar.f("start isLongClickToPlay: " + z17);
        if (!z17) {
            android.widget.FrameLayout frameLayout2 = pVar.f470199f;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("videoViewContainer");
                throw null;
            }
            frameLayout2.performHapticFeedback(4);
        }
        f65.q.b(f65.q.f259959a, "play_local_live_photo", 0, 0L, null, 12, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        this.f470191d.f("onPlayTime >> playTime " + i17 + " videoTime: " + i18);
        return 0;
    }
}
