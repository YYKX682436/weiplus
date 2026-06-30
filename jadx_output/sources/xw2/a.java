package xw2;

/* loaded from: classes10.dex */
public final class a extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f457684a;

    public a(com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner) {
        this.f457684a = mediaPlayBanner;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457684a;
        androidx.recyclerview.widget.f2 adapter = mediaPlayBanner.getAdapter();
        if (adapter != null) {
            ym5.o1 indicator = mediaPlayBanner.getIndicator();
            if (indicator != null) {
                indicator.setCount(adapter.getItemCount());
            }
            ym5.o1 indicator2 = mediaPlayBanner.getIndicator();
            if ((indicator2 != null ? indicator2.getF132355e2() : 0) > 0) {
                com.tencent.mm.view.RecyclerHorizontalViewPager recyclerView = mediaPlayBanner.getRecyclerView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        ym5.o1 indicator;
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457684a;
        androidx.recyclerview.widget.f2 adapter = mediaPlayBanner.getAdapter();
        if (adapter == null || (indicator = mediaPlayBanner.getIndicator()) == null) {
            return;
        }
        indicator.setCount(adapter.getItemCount());
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        ym5.o1 indicator;
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457684a;
        androidx.recyclerview.widget.f2 adapter = mediaPlayBanner.getAdapter();
        if (adapter == null || (indicator = mediaPlayBanner.getIndicator()) == null) {
            return;
        }
        indicator.setCount(adapter.getItemCount());
    }
}
