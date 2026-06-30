package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class j0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b21.r f150760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150761b;

    public j0(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, b21.r rVar) {
        this.f150761b = musicMainUI;
        this.f150760a = rVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150761b;
        if (i17 == 0) {
            int i18 = ll3.j2.f319185a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("mutil_select_is_ret", false);
            intent.putExtra("scene_from", 6);
            j45.l.v(musicMainUI, ".ui.transmit.SelectConversationUI", intent, 1);
            pl3.c.g(musicMainUI.f150713r);
            pl3.c.e(2);
            return;
        }
        b21.r rVar = this.f150760a;
        if (i17 == 1) {
            ll3.j2.c(rVar, musicMainUI);
            pl3.c.h(musicMainUI.f150713r);
            pl3.c.e(1);
        } else if (i17 == 2) {
            ll3.j2.a(rVar, musicMainUI);
            pl3.c.e(3);
        } else {
            if (i17 != 3) {
                return;
            }
            ll3.j2.b(rVar, musicMainUI);
            pl3.c.e(4);
        }
    }
}
