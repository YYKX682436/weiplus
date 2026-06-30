package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 f150728d;

    public b0(com.tencent.mm.plugin.music.ui.MusicMainUI.AnonymousClass4 anonymousClass4) {
        this.f150728d = anonymousClass4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.music.ui.MusicViewPager musicViewPager = com.tencent.mm.plugin.music.ui.MusicMainUI.this.f150706h;
        musicViewPager.setCurrentItem(musicViewPager.getCurrentItem() + 1);
    }
}
