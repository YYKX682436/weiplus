package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class k8 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191754a;

    public k8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191754a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "video on completion");
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView = this.f191754a;
        videoTextureView.f191497y = i17;
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = videoTextureView.f191491s;
        if (a4Var != null) {
            a4Var.onCompletion();
        }
    }
}
