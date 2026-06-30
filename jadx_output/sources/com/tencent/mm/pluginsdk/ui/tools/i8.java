package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class i8 implements android.media.MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191719a;

    public i8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView) {
        this.f191719a = videoTextureView;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i17) {
        this.f191719a.f191498z = i17;
    }
}
