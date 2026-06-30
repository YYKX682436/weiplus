package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class h0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b21.r f150742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150746e;

    public h0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, b21.r rVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f150746e = musicMainUI;
        this.f150742a = rVar;
        this.f150743b = str;
        this.f150744c = str2;
        this.f150745d = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        b21.r rVar = this.f150742a;
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150746e;
        if (i17 == 0) {
            int i18 = ll3.j2.f319185a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            j45.l.v(musicMainUI, ".ui.transmit.SelectConversationUI", intent, 1);
            pl3.c.g(musicMainUI.f150713r);
            pl3.c.e(2);
            musicMainUI.T6(254, rVar, false);
            return;
        }
        if (i17 == 1) {
            ll3.j2.c(rVar, musicMainUI);
            pl3.c.h(musicMainUI.f150713r);
            pl3.c.e(1);
            musicMainUI.T6(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, rVar, false);
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            ll3.j2.g(this.f150743b, this.f150744c, this.f150745d);
            return;
        }
        ll3.j2.a(rVar, musicMainUI);
        pl3.c.e(3);
        int i19 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
        musicMainUI.T6(255, rVar, false);
    }
}
