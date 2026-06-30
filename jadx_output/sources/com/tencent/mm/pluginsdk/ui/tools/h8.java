package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class h8 implements android.media.MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191688a;

    public h8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191688a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1);
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191688a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", valueOf, java.lang.Boolean.valueOf(videoTextureView.f191490r), java.lang.Boolean.valueOf(videoTextureView.K));
        if (!videoTextureView.f191490r) {
            videoTextureView.pause();
        } else if (videoTextureView.K) {
            return;
        } else {
            videoTextureView.start();
        }
        com.tencent.mm.pluginsdk.ui.tools.c4 c4Var = videoTextureView.f191493u;
        if (c4Var != null) {
            c4Var.z(videoTextureView.f191490r);
        }
        videoTextureView.I = 0L;
    }
}
