package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MusicPlayerEvent f150725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 f150726e;

    public a0(com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 anonymousClass4, com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        this.f150726e = anonymousClass4;
        this.f150725d = musicPlayerEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f150725d.f54512g.f7036b;
        com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 anonymousClass4 = this.f150726e;
        if (i17 == 0 && ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c != 2) {
            com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = com.tencent.mm.plugin.music.ui.MusicMainUI.this;
            musicMainUI.f150706h.setAdapter(musicMainUI.f150708m);
            com.tencent.mm.plugin.music.ui.MusicMainUI.this.f150706h.setCurrentItem(((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308855d + 100000);
        }
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI2 = com.tencent.mm.plugin.music.ui.MusicMainUI.this;
        int i18 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
        musicMainUI2.W6();
    }
}
