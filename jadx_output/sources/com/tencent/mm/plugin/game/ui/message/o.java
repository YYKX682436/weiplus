package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class o implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI f141593d;

    public o(com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI gameMsgCenterUI) {
        this.f141593d = gameMsgCenterUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMsgCenterUI", "onPageSelected:%d", java.lang.Integer.valueOf(i17));
        this.f141593d.T6(i17);
    }
}
