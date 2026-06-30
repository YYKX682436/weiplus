package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class o7 implements ph3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f191811a;

    public o7(com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView) {
        this.f191811a = videoPlayerTextureView;
    }

    @Override // ph3.d
    public void a(int i17, int i18, int i19) {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191811a;
        com.tencent.mars.xlog.Log.i(videoPlayerTextureView.f191448h, "video size changed size[%d, %d] degrees[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        videoPlayerTextureView.f191447J.c();
        videoPlayerTextureView.f191453p = i19;
        videoPlayerTextureView.f191452o = i17;
        videoPlayerTextureView.f191451n = i18;
        videoPlayerTextureView.J();
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoPlayerTextureView.f191460w;
        if (a4Var != null) {
            a4Var.T4(videoPlayerTextureView.f191452o, videoPlayerTextureView.f191451n);
        }
    }

    @Override // ph3.d
    public void onCompletion() {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191811a.f191460w;
        if (a4Var != null) {
            a4Var.onCompletion();
        }
    }

    @Override // ph3.d
    public void onError(int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191811a.f191460w;
        if (a4Var != null) {
            a4Var.onError(i17, i18);
        }
    }

    @Override // ph3.d
    public void onPrepared() {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191811a;
        com.tencent.mars.xlog.Log.i(videoPlayerTextureView.f191448h, "%s onPrepared, path:%s", java.lang.Integer.valueOf(hashCode()), videoPlayerTextureView.getF174598m());
        videoPlayerTextureView.f191454q = true;
        videoPlayerTextureView.setMute(videoPlayerTextureView.f191455r);
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoPlayerTextureView.f191460w;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
        videoPlayerTextureView.requestLayout();
    }

    @Override // ph3.d
    public void onSeekComplete() {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191811a;
        com.tencent.mm.pluginsdk.ui.tools.c4 c4Var = videoPlayerTextureView.f191462y;
        if (c4Var != null) {
            c4Var.z(videoPlayerTextureView.f191456s);
        }
        if (!videoPlayerTextureView.f191456s) {
            com.tencent.mars.xlog.Log.i(videoPlayerTextureView.f191448h, "player seek done, but don't play now.");
            videoPlayerTextureView.f191456s = true;
            return;
        }
        ph3.k kVar = videoPlayerTextureView.f191450m;
        if (kVar != null) {
            java.lang.String str = videoPlayerTextureView.f191448h;
            kVar.m();
            videoPlayerTextureView.f191450m.start();
        }
    }
}
