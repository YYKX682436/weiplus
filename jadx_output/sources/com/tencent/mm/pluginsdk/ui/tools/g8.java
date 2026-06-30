package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class g8 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191663a;

    public g8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191663a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191663a;
        android.media.MediaPlayer mediaPlayer2 = videoTextureView.f191486n;
        if (mediaPlayer != mediaPlayer2 && mediaPlayer != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoTextureView", "another player callback, release now.[%s, %s]", mediaPlayer, mediaPlayer2);
            new com.tencent.mm.pluginsdk.ui.tools.e8(videoTextureView, mediaPlayer).start();
            return;
        }
        videoTextureView.f191487o = true;
        videoTextureView.f191488p = mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
        videoTextureView.f191489q = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", java.lang.Integer.valueOf(videoTextureView.f191488p), java.lang.Integer.valueOf(videoTextureView.f191489q), java.lang.Boolean.valueOf(videoTextureView.f191490r));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) videoTextureView.getLayoutParams();
        layoutParams.addRule(13);
        videoTextureView.setLayoutParams(layoutParams);
        if (videoTextureView.f191488p == 0 || videoTextureView.f191489q == 0) {
            if (videoTextureView.f191490r) {
                videoTextureView.f191486n.start();
                videoTextureView.f191490r = false;
                videoTextureView.f191486n.setLooping(videoTextureView.A);
            }
        } else if (videoTextureView.f191490r) {
            videoTextureView.f191486n.start();
            videoTextureView.f191486n.setLooping(videoTextureView.A);
            videoTextureView.f191490r = false;
        }
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoTextureView.f191491s;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
    }
}
