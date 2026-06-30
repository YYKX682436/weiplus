package ut4;

/* loaded from: classes15.dex */
public class a implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView f431183d;

    public a(com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView walletPayUOpenIntroView) {
        this.f431183d = walletPayUOpenIntroView;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView walletPayUOpenIntroView = this.f431183d;
        if (walletPayUOpenIntroView.f181244d.getParent() != null) {
            walletPayUOpenIntroView.f181244d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        walletPayUOpenIntroView.f181245e.setPage(i17);
    }
}
