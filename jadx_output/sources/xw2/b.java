package xw2;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f457685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f457686e;

    public b(androidx.recyclerview.widget.f2 f2Var, com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner) {
        this.f457685d = f2Var;
        this.f457686e = mediaPlayBanner;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eb5.d dVar = (eb5.d) this.f457685d;
        int itemCount = dVar.getItemCount() - 1;
        if (itemCount > 0 || itemCount < dVar.f250921d.size()) {
            dVar.f250921d.remove(itemCount);
            dVar.notifyItemRemoved(itemCount);
        }
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner mediaPlayBanner = this.f457686e;
        dVar.registerAdapterDataObserver(mediaPlayBanner.f131714o);
        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = mediaPlayBanner.recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerHorizontalViewPager, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerHorizontalViewPager.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/view/base/MediaPlayBanner", "selectViewAt", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerHorizontalViewPager.g1(0, true, true);
        com.tencent.mm.plugin.finder.view.base.MediaPlayBanner.b(mediaPlayBanner, 0L, 1, null);
    }
}
