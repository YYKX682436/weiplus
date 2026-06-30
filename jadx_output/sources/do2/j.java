package do2;

/* loaded from: classes10.dex */
public final class j implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView f242088d;

    public j(com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView) {
        this.f242088d = finderMegaVideoMiniView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242088d;
        finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(com.tencent.mm.R.string.jp7));
        finderMegaVideoMiniView.setVideoEnd(true);
        finderMegaVideoMiniView.setMusicCtrlBtnStatus(false);
        yz5.a onVideoCompletion = finderMegaVideoMiniView.getOnVideoCompletion();
        if (onVideoCompletion != null) {
            onVideoCompletion.invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242088d;
        finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(com.tencent.mm.R.string.jp8));
        finderMegaVideoMiniView.setVideoEnd(false);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView = finderMegaVideoMiniView.getVideoView();
        if (videoView != null) {
            videoView.stop();
        }
        finderMegaVideoMiniView.setError(true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242088d;
        finderMegaVideoMiniView.setVideoEnd(false);
        finderMegaVideoMiniView.setContentDescription(finderMegaVideoMiniView.getResources().getString(com.tencent.mm.R.string.jp8));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        yz5.p onPlayProgressUpdated = this.f242088d.getOnPlayProgressUpdated();
        if (onPlayProgressUpdated != null) {
            onPlayProgressUpdated.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242088d;
        finderMegaVideoMiniView.setMusicCtrlBtnStatus(false);
        yz5.a onVideoPause = finderMegaVideoMiniView.getOnVideoPause();
        if (onVideoPause != null) {
            onVideoPause.invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        do2.c cVar = com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView.f121046s;
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = this.f242088d;
        finderMegaVideoMiniView.e();
        finderMegaVideoMiniView.setMusicCtrlBtnStatus(true);
        yz5.a onVideoPlay = finderMegaVideoMiniView.getOnVideoPlay();
        if (onVideoPlay != null) {
            onVideoPlay.invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        do2.c cVar = com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView.f121046s;
        this.f242088d.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
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
