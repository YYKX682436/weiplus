package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class a8 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView f191515a;

    public a8(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        this.f191515a = videoSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView = this.f191515a;
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoSurfaceView.f191475o;
        if (a4Var != null) {
            a4Var.q(videoSurfaceView.f191470g.getCurrentPosition(), videoSurfaceView.f191470g.getDuration());
            videoSurfaceView.f191475o.onCompletion();
        }
    }
}
