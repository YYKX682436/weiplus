package g22;

/* loaded from: classes11.dex */
public final class e0 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267806d;

    public e0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267806d = emojiStoreV3HomeUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        g22.v vVar;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TabView emojiStoreV3TabView;
        android.widget.ImageView imageView;
        oa.i k17;
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267806d;
        emojiStoreV3HomeUI.f98438h = i17;
        com.google.android.material.tabs.TabLayout tabLayout = emojiStoreV3HomeUI.f98441n;
        if (tabLayout != null && (k17 = tabLayout.k(i17)) != null) {
            k17.b();
        }
        if (emojiStoreV3HomeUI.f98438h != 1 || emojiStoreV3HomeUI.f98439i) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12090, new java.lang.Object[0]);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
        if (emojiStoreV3HomeUI.f98445r && emojiStoreV3HomeUI.f98441n != null) {
            java.util.List list = emojiStoreV3HomeUI.f98443p;
            if ((list != null ? ((java.util.ArrayList) list).size() : 0) > 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeUI", "cleanPersonPoint");
                java.util.List list2 = emojiStoreV3HomeUI.f98443p;
                if (list2 != null && (vVar = (g22.v) ((java.util.ArrayList) list2).get(1)) != null && (emojiStoreV3TabView = vVar.f267879d) != null && (imageView = emojiStoreV3TabView.f98474f) != null) {
                    imageView.setVisibility(4);
                }
            }
        }
        emojiStoreV3HomeUI.f98439i = true;
    }
}
