package ql2;

/* loaded from: classes10.dex */
public final class m implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.r f364533d;

    public m(ql2.r rVar) {
        this.f364533d = rVar;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceDestroy");
        ql2.r rVar = this.f364533d;
        rVar.f364547m = null;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = rVar.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface(null);
        }
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceAvailable width:" + i17 + " height:" + i18);
        ql2.r rVar = this.f364533d;
        rVar.f364547m = surfaceTexture;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = rVar.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setSurface(new android.view.Surface(rVar.f364547m));
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "liveEffectView onSurfaceUpdate");
    }
}
