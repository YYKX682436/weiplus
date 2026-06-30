package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class f implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI f141266d;

    public f(com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI chatRoomTabUI) {
        this.f141266d = chatRoomTabUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        if (i17 == 1) {
            o43.c cVar = this.f141266d.f141099o.f141145f;
            kotlin.jvm.internal.o.d(cVar);
            cVar.f342849b.m1();
        }
    }
}
