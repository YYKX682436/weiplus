package ym5;

/* loaded from: classes10.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f463535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463536e;

    public t2(androidx.recyclerview.widget.f2 f2Var, com.tencent.mm.view.MediaBanner mediaBanner) {
        this.f463535d = f2Var;
        this.f463536e = mediaBanner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.f2 f2Var = this.f463535d;
        eb5.d dVar = (eb5.d) f2Var;
        int itemCount = dVar.getItemCount() - 1;
        if (itemCount > 0 || itemCount < dVar.f250921d.size()) {
            dVar.f250921d.remove(itemCount);
            dVar.notifyItemRemoved(itemCount);
        }
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463536e;
        f2Var.registerAdapterDataObserver(mediaBanner.getDataObserver());
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = mediaBanner.pagerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerHorizontalViewPager, arrayList.toArray(), "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerHorizontalViewPager.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerHorizontalViewPager, "com/tencent/mm/view/MediaBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerHorizontalViewPager.g1(0, true, true);
        mediaBanner.b();
    }
}
