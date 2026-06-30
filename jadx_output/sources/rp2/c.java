package rp2;

/* loaded from: classes3.dex */
public final class c implements ws5.f {

    /* renamed from: d, reason: collision with root package name */
    public final rp2.a f398572d;

    /* renamed from: e, reason: collision with root package name */
    public mn0.b0 f398573e;

    /* renamed from: f, reason: collision with root package name */
    public cw2.d4 f398574f;

    /* renamed from: g, reason: collision with root package name */
    public final int f398575g;

    /* renamed from: h, reason: collision with root package name */
    public final int f398576h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398577i;

    public c(rp2.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f398572d = config;
        this.f398575g = -1;
        this.f398576h = -1;
    }

    @Override // ws5.f
    public android.view.View H() {
        return a();
    }

    public final cw2.d4 a() {
        cw2.d4 d4Var = this.f398574f;
        if (d4Var != null) {
            return d4Var;
        }
        kotlin.jvm.internal.o.o("renderView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public mn0.b0 e() {
        com.tencent.mars.xlog.Log.w("FinderLivePreloadVideoView", "disConnectPlayer player:" + this.f398573e);
        mn0.b0 b0Var = this.f398573e;
        this.f398573e = null;
        pm0.v.B(a());
        return b0Var;
    }

    @Override // ws5.f
    public void c(yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4) {
    }

    @Override // ws5.f
    public android.view.View f() {
        android.view.ViewGroup viewGroup = this.f398572d.f398567a;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    public long getBindFeedId() {
        return this.f398572d.f398570d;
    }

    @Override // ws5.f
    public android.view.View getCoverView() {
        return a();
    }

    @Override // ws5.f
    public java.lang.Object getLivePlayer() {
        return this.f398573e;
    }

    @Override // ws5.f
    public int getPlayStatus() {
        return 0;
    }

    @Override // ws5.f
    public java.lang.String getStreamId() {
        ko0.t tVar = ko0.t.f309903a;
        mn0.b0 b0Var = this.f398573e;
        return tVar.d(b0Var != null ? ((mn0.y) b0Var).f329815q : null);
    }

    @Override // ws5.f
    public android.view.TextureView getTextureView() {
        return a().getVideoView();
    }

    @Override // ws5.f
    /* renamed from: getVideoHeight */
    public int getA() {
        int i17 = this.f398576h;
        if (i17 > 0) {
            return i17;
        }
        android.view.ViewGroup viewGroup = this.f398572d.f398567a;
        if (viewGroup != null) {
            return viewGroup.getMeasuredHeight();
        }
        kotlin.jvm.internal.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: getVideoRatioWH */
    public float getB() {
        return 0.0f;
    }

    @Override // ws5.f
    /* renamed from: getVideoWidth */
    public int getF130757z() {
        int i17 = this.f398575g;
        if (i17 > 0) {
            return i17;
        }
        android.view.ViewGroup viewGroup = this.f398572d.f398567a;
        if (viewGroup != null) {
            return viewGroup.getMeasuredWidth();
        }
        kotlin.jvm.internal.o.o("sourceView");
        throw null;
    }

    @Override // ws5.f
    /* renamed from: isMute */
    public boolean getF130744m() {
        return false;
    }

    @Override // ws5.f
    public boolean isPlaying() {
        mn0.b0 b0Var = this.f398573e;
        return b0Var != null && ((mn0.y) b0Var).b(false);
    }

    @Override // ws5.f
    /* renamed from: k */
    public boolean getIsPauseToRemovePlayer() {
        return this.f398577i;
    }

    @Override // ws5.f
    /* renamed from: o */
    public boolean getF130755x() {
        return false;
    }

    @Override // ws5.f
    public boolean pause() {
        com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "pause");
        mn0.b0 b0Var = this.f398573e;
        if (b0Var != null) {
            mn0.b0.M(b0Var, false, 1, null);
        }
        return true;
    }

    @Override // ws5.f
    public java.lang.Object q() {
        this.f398577i = true;
        return e();
    }

    @Override // ws5.f
    public void release() {
        com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "release");
        mn0.b0 b0Var = this.f398573e;
        if (b0Var != null) {
            mn0.b0.C(b0Var, true, false, false, 6, null);
        }
        mn0.b0 b0Var2 = this.f398573e;
        if (b0Var2 != null) {
            mn0.b0.B(b0Var2, null, null, 2, null);
        }
        pm0.v.B(a());
    }

    @Override // ws5.f
    public void resume() {
        com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "resume");
    }

    @Override // ws5.f
    public void setMute(boolean z17) {
        mn0.b0 b0Var = this.f398573e;
        if (b0Var != null) {
            ((mn0.y) b0Var).G(z17);
        }
    }

    @Override // ws5.f
    public void stop() {
        com.tencent.mars.xlog.Log.i("FinderLivePreloadVideoView", "stop");
        release();
    }
}
