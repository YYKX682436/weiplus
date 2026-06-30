package i53;

/* loaded from: classes8.dex */
public class o1 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GamePublishGalleryUI f288683d;

    public o1(com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI) {
        this.f288683d = gamePublishGalleryUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        int i18 = i17 % 2;
        com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI = this.f288683d;
        if (i18 == 0) {
            gamePublishGalleryUI.f140055d.setSelected(true);
            gamePublishGalleryUI.f140056e.setSelected(false);
            gamePublishGalleryUI.f140058g.a();
        } else {
            gamePublishGalleryUI.f140056e.setSelected(true);
            gamePublishGalleryUI.f140055d.setSelected(false);
        }
        gamePublishGalleryUI.U6(i17, true);
    }
}
