package zm5;

/* loaded from: classes3.dex */
public final class h implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.l f474223d;

    public h(zm5.l lVar) {
        this.f474223d = lVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.ui.base.WxImageView f18;
        if (i18 == 0) {
            zm5.l lVar = this.f474223d;
            if (lVar.f474241o == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", "onScroll>> position: " + i17);
                fn5.a aVar = lVar.f474233d;
                if (aVar != null && (f18 = aVar.f(0, true)) != null) {
                    f18.i();
                }
                if (lVar.f474242p) {
                    androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    zm5.g gVar = (zm5.g) pf5.z.f353948a.a(activity).a(zm5.g.class);
                    java.lang.String str = ((com.tencent.mm.api.QueryImageData) lVar.f474235f.get(i17)).f53206g;
                    kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
                    gVar.P6(str, lVar.f474237h);
                    lVar.f474242p = false;
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", i17 + " + select");
        zm5.l lVar = this.f474223d;
        lVar.f474238i = ((com.tencent.mm.api.QueryImageData) lVar.f474235f.get(i17)).f53203d;
        lVar.f474239m = ((com.tencent.mm.api.QueryImageData) lVar.f474235f.get(i17)).f53210n;
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((zm5.t) pf5.z.f353948a.a(activity).a(zm5.t.class)).P6();
        androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((zm5.f0) pf5.z.f353948a.a(activity2).a(zm5.f0.class)).O6();
        androidx.appcompat.app.AppCompatActivity activity3 = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        zm5.g gVar = (zm5.g) pf5.z.f353948a.a(activity3).a(zm5.g.class);
        java.lang.String str = ((com.tencent.mm.api.QueryImageData) lVar.f474235f.get(i17)).f53206g;
        kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
        gVar.P6(str, lVar.f474237h);
        lVar.f474241o = lVar.f474236g;
        lVar.f474236g = i17;
    }
}
