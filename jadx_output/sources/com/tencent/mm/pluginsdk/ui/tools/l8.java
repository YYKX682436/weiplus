package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class l8 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191767a;

    public l8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191767a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoTextureView", "Error: " + i17 + "," + i18);
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191767a.f191491s;
        if (a4Var == null) {
            return true;
        }
        a4Var.onError(i17, i18);
        return true;
    }
}
