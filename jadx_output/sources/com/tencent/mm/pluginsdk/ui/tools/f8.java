package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class f8 implements android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191628a;

    public f8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191628a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        android.media.MediaPlayer mediaPlayer2;
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191628a;
        try {
            mediaPlayer2 = videoTextureView.f191486n;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "on video size changed error[%d, %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        if (mediaPlayer != mediaPlayer2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoTextureView", "another player on video size changed, return now.[%s, %s]", mediaPlayer, mediaPlayer2);
            return;
        }
        videoTextureView.f191488p = mediaPlayer.getVideoWidth();
        videoTextureView.f191489q = mediaPlayer.getVideoHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "on size change size:( " + videoTextureView.f191488p + " , " + videoTextureView.f191489q + " )");
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoTextureView.f191491s;
        if (a4Var != null) {
            a4Var.T4(videoTextureView.f191488p, videoTextureView.f191489q);
        }
        int i19 = com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.R;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) videoTextureView.getLayoutParams();
        layoutParams.addRule(13);
        videoTextureView.setLayoutParams(layoutParams);
    }
}
