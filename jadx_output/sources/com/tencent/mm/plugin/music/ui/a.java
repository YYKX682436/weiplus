package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.plugin.music.player.base.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView f150724a;

    public a(com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView floatBallMusicLyricView) {
        this.f150724a = floatBallMusicLyricView;
    }

    @Override // com.tencent.mm.plugin.music.player.base.k
    public void a(int i17, int i18) {
        if (i17 < 0 || i18 <= 0) {
            return;
        }
        com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView floatBallMusicLyricView = this.f150724a;
        floatBallMusicLyricView.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.b(floatBallMusicLyricView, i17));
    }
}
