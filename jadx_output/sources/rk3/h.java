package rk3;

/* loaded from: classes8.dex */
public final class h implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk3.i f396520d;

    public h(rk3.i iVar) {
        this.f396520d = iVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        jk3.e eVar;
        jk3.e eVar2;
        rk3.i iVar = this.f396520d;
        if (i17 == 1 && iVar.f396525e == 0 && (eVar2 = iVar.f396523c) != null) {
            eVar2.j();
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager = iVar.f396522b;
            if (multiTaskViewPager != null && multiTaskViewPager.getCurrentItem() == 1) {
                try {
                    android.widget.FrameLayout frameLayout = iVar.f396524d;
                    if (frameLayout != null && (eVar = iVar.f396523c) != null) {
                        eVar.g(eVar != null ? eVar.h(uj5.g.d(frameLayout, (int) (frameLayout.getWidth() / 1.0f), (int) (frameLayout.getHeight() / 1.0f), true, android.graphics.Bitmap.Config.RGB_565)) : null);
                    }
                } catch (java.lang.Throwable th6) {
                    iVar.getClass();
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskWrapper", "snapshot bitmap failed", th6);
                }
                com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager2 = iVar.f396522b;
                if (multiTaskViewPager2 != null) {
                    multiTaskViewPager2.setCanSlide(false);
                }
                jk3.e eVar3 = iVar.f396523c;
                if (eVar3 != null) {
                    eVar3.k();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f396520d.f396525e = i17;
    }
}
