package k53;

/* loaded from: classes4.dex */
public class h0 implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoView f304363d;

    public h0(com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView) {
        this.f304363d = gameVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = this.f304363d;
        if (gameVideoView.f140146v) {
            gameVideoView.a(0.0d, true);
            return;
        }
        com.tencent.mm.pluginsdk.ui.f1 f1Var = gameVideoView.f140132e;
        if (f1Var != null) {
            f1Var.pause();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Haowan.GameVideoView", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = this.f304363d;
        k53.j0 j0Var = gameVideoView.f140144t;
        if (j0Var != null) {
            ((i53.f2) j0Var).a(false);
        }
        gameVideoView.setKeepScreenOn(false);
        gameVideoView.f140142r.a();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = this.f304363d;
        k53.j0 j0Var = gameVideoView.f140144t;
        if (j0Var != null) {
            ((i53.f2) j0Var).a(true);
        }
        gameVideoView.setKeepScreenOn(true);
        gameVideoView.f140142r.c(gameVideoView.f140149y);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        k53.i0 i0Var = this.f304363d.f140143s;
        if (i0Var != null) {
            k53.z zVar = (k53.z) i0Var;
            zVar.f304410a.f304339f.postDelayed(new k53.y(zVar), 200L);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
