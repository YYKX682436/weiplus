package e22;

/* loaded from: classes10.dex */
public final class d implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI f246631d;

    public d(com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI emojiMediaPickerUI) {
        this.f246631d = emojiMediaPickerUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        this.f246631d.X6().s(i17, f17, false, true);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI emojiMediaPickerUI = this.f246631d;
        oa.i k17 = emojiMediaPickerUI.X6().k(i17);
        if (k17 != null) {
            k17.b();
        }
        if (i17 != 0) {
            emojiMediaPickerUI.W6().setArrowVisibility(4);
        } else {
            emojiMediaPickerUI.W6().setArrowVisibility(0);
            emojiMediaPickerUI.W6().a();
        }
    }
}
