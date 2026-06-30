package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class m0 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150767g;

    public m0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, com.tencent.mm.plugin.music.ui.x xVar) {
        this.f150767g = musicMainUI;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "shake %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150767g;
        long j17 = musicMainUI.A;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 1200) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "tryStartShake delay too short:" + elapsedRealtime);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Music.MusicMainUI", "tryStartShake delay too enough:" + elapsedRealtime);
        musicMainUI.A = android.os.SystemClock.elapsedRealtime();
        int i17 = musicMainUI.B + 1;
        musicMainUI.B = i17;
        if (i17 % 2 == 0) {
            kl3.i iVar = (kl3.i) sl3.b.b(kl3.i.class);
            int i18 = musicMainUI.f150713r;
            kl3.z zVar = (kl3.z) iVar;
            zVar.getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(285L, 2L, 1L, false);
            if (zVar.f308854c != 1) {
                zVar.f308854c = 1;
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
                musicPlayerEvent.f54512g.f7036b = 5;
                musicPlayerEvent.e();
                pl3.c.f(2, 1, i18);
                return;
            }
            if (zVar.f308865n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "already running get list");
                return;
            }
            zVar.f308854c = 2;
            if (((java.util.ArrayList) zVar.f308856e).size() <= 1) {
                s75.d.b(new kl3.x(zVar, null), "music_get_list_task");
            } else {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = new com.tencent.mm.autogen.events.MusicPlayerEvent();
                musicPlayerEvent2.f54512g.f7036b = 5;
                musicPlayerEvent2.e();
            }
            pl3.c.f(1, 2, i18);
        }
    }
}
