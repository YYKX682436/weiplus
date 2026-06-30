package mx2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332484a;

    public e(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        this.f332484a = finderImageBanner;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332484a;
        ym5.o1 indicator = finderImageBanner.getIndicator();
        if (indicator != null) {
            indicator.setCount(finderImageBanner.getImageAdapter().getItemCount());
        }
        ym5.o1 indicator2 = finderImageBanner.getIndicator();
        if ((indicator2 != null ? indicator2.getF132355e2() : 0) > 0) {
            com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager mediaView = finderImageBanner.getMediaView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mediaView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            mediaView.h1(((java.lang.Integer) arrayList.get(0)).intValue(), true);
            yj0.a.f(mediaView, "com/tencent/mm/plugin/finder/view/image/FinderImageBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332484a;
        ym5.o1 indicator = finderImageBanner.getIndicator();
        if (indicator != null) {
            indicator.setCount(finderImageBanner.getImageAdapter().getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332484a;
        ym5.o1 indicator = finderImageBanner.getIndicator();
        if (indicator != null) {
            indicator.setCount(finderImageBanner.getImageAdapter().getItemCount());
        }
    }
}
