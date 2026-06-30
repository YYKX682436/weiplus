package ym5;

/* loaded from: classes10.dex */
public final class s2 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463515a;

    public s2(com.tencent.mm.view.MediaBanner mediaBanner) {
        this.f463515a = mediaBanner;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463515a;
        androidx.recyclerview.widget.f2 adapter = mediaBanner.getAdapter();
        if (adapter != null) {
            mediaBanner.getIndicator().setCount(adapter.getItemCount());
            if (mediaBanner.getIndicator().getF132355e2() > 0) {
                com.tencent.mm.view.RecyclerHorizontalViewPager pagerView = mediaBanner.getPagerView();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(pagerView, arrayList.toArray(), "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
                pagerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(pagerView, "com/tencent/mm/view/MediaBanner$dataObserver$1", "onChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463515a;
        androidx.recyclerview.widget.f2 adapter = mediaBanner.getAdapter();
        if (adapter != null) {
            mediaBanner.getIndicator().setCount(adapter.getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463515a;
        androidx.recyclerview.widget.f2 adapter = mediaBanner.getAdapter();
        if (adapter != null) {
            mediaBanner.getIndicator().setCount(adapter.getItemCount());
        }
    }
}
