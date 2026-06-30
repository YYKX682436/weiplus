package sc2;

/* loaded from: classes2.dex */
public final class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f405865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.av f405867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405868h;

    public e8(android.view.View view, sc2.p8 p8Var, java.lang.String str, r45.av avVar, xc2.p0 p0Var) {
        this.f405864d = view;
        this.f405865e = p8Var;
        this.f405866f = str;
        this.f405867g = avVar;
        this.f405868h = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f405864d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view.findViewById(com.tencent.mm.R.id.eic);
        if (wxRecyclerView != null) {
            if (wxRecyclerView.getScrollState() != 0) {
                sc2.p8 p8Var = this.f405865e;
                com.tencent.mars.xlog.Log.i(p8Var.f406152w, "checkLoopCard: don't loop scrollState=" + wxRecyclerView.getScrollState() + ", source=" + this.f405866f + ", carousel_time=" + this.f405867g.getInteger(5));
                p8Var.G(view, this.f405868h, "ScrollStateError");
                return;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager adStackLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.ad.AdStackLayoutManager) layoutManager : null;
            if (adStackLayoutManager != null) {
                adStackLayoutManager.f132651p = false;
                int o17 = adStackLayoutManager.o() + 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(o17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderJumperCarouselCardObserver$checkLoopCard$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/feed/component/FinderJumperCarouselCardObserver$checkLoopCard$2$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
    }
}
