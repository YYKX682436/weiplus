package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class b8 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView f191532a;

    public b8(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        this.f191532a = videoSurfaceView;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191532a.f191475o;
        if (a4Var == null) {
            return true;
        }
        a4Var.onError(i17, i18);
        return true;
    }
}
