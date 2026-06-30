package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class j8 implements android.media.MediaPlayer.OnInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191740a;

    public j8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191740a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.tencent.mm.pluginsdk.ui.tools.b4 b4Var = this.f191740a.f191494v;
        if (b4Var == null) {
            return false;
        }
        b4Var.k(i17, i18);
        return false;
    }
}
