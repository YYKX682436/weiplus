package ql2;

/* loaded from: classes10.dex */
public final class z implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.d0 f364570d;

    public z(ql2.d0 d0Var) {
        this.f364570d = d0Var;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceDestroy");
        ql2.d0 d0Var = this.f364570d;
        d0Var.f364507i = null;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = d0Var.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface(null);
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceAvailable width:" + i17 + " height:" + i18);
        ql2.d0 d0Var = this.f364570d;
        d0Var.f364507i = surfaceTexture;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = d0Var.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface(new android.view.Surface(d0Var.f364507i));
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceUpdate");
    }
}
