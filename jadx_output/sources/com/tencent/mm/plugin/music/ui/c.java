package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MusicPlayerEvent f150729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.AnonymousClass3 f150730e;

    public c(com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.AnonymousClass3 anonymousClass3, com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        this.f150730e = anonymousClass3;
        this.f150729d = musicPlayerEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView floatBallMusicLyricView = com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.this;
        java.lang.String str = this.f150729d.f54512g.f7038d;
        int i17 = com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.f150667i;
        floatBallMusicLyricView.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(ll3.o2.Ai().y0(str).field_songHAlbumUrl)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallMusicLyricView", "updateLyric, should not be empty");
        } else {
            floatBallMusicLyricView.f150669e.setVisibility(8);
        }
    }
}
