package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameBannerView f141758d;

    public t(com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView) {
        this.f141758d = gameBannerView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.game.ui.GameBannerView gameBannerView = this.f141758d;
        if (gameBannerView.f140656e == null || gameBannerView.f140660i.size() <= 1) {
            gameBannerView.f140661m.d();
            return false;
        }
        androidx.viewpager.widget.ViewPager viewPager = gameBannerView.f140656e;
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        return true;
    }
}
