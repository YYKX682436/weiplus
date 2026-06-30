package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class k0 implements com.tencent.mm.plugin.music.player.base.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150763a;

    public k0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI) {
        this.f150763a = musicMainUI;
    }

    @Override // com.tencent.mm.plugin.music.player.base.k
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150763a;
        com.tencent.mm.plugin.music.ui.u uVar = musicMainUI.f150708m;
        if (uVar == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.w("MicroMsg.Music.MusicMainUI", "pager is null, return");
            return;
        }
        if (musicMainUI.f150712q == 1 && !musicMainUI.f150714s) {
            long currentTimeMillis = ((float) (java.lang.System.currentTimeMillis() - musicMainUI.getIntent().getLongExtra("music_player_beg_time", 0L))) + (musicMainUI.getIntent().getFloatExtra("key_offset", 0.0f) * 1000.0f);
            if (currentTimeMillis >= 0) {
                com.tencent.mm.plugin.music.ui.u uVar2 = musicMainUI.f150708m;
                uVar2.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.o(uVar2, musicMainUI.f150706h.getCurrentItem(), currentTimeMillis + 200));
            }
        } else if (i17 >= 0 && i18 > 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.o(uVar, musicMainUI.f150706h.getCurrentItem(), i17));
        }
        android.os.Message message = new android.os.Message();
        message.what = 1;
        musicMainUI.H.sendMessage(message);
    }
}
