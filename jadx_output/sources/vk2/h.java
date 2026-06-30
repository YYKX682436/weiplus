package vk2;

/* loaded from: classes3.dex */
public final class h extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final tk2.a f437762h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f437763i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f437764m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f437765n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f437766o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f437767p;

    /* renamed from: q, reason: collision with root package name */
    public int f437768q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f437769r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1 f437770s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1] */
    public h(android.content.Context context, tk2.a service) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        this.f437762h = service;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f437766o = arrayList;
        this.f437767p = new java.util.ArrayList();
        jz5.g b17 = jz5.h.b(new vk2.f(this));
        this.f437769r = jz5.h.b(new vk2.e(context, this));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f437764m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager() { // from class: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f437764m;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.N(new vk2.d());
        vk2.a aVar = new vk2.a(this, (com.tencent.mm.plugin.finder.live.multistream.adapter.MultiStreamItemConvertFactory) ((jz5.n) b17).getValue(), arrayList);
        this.f437765n = aVar;
        aVar.f293105o = new vk2.b(this);
        aVar.f293104n = new vk2.c(this);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f437764m;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setAdapter(aVar);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f437764m;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.setHasFixedSize(true);
        this.f437770s = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                wk2.j y17 = vk2.h.this.y();
                java.util.HashSet hashSet = y17.f446950f;
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    y17.e((wk2.d) it.next());
                }
                hashSet.clear();
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                wk2.j y17 = vk2.h.this.y();
                y17.getClass();
                com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "checkAutoPlay");
                com.tencent.mm.sdk.platformtools.n3 n3Var = y17.f446953i;
                java.lang.Runnable runnable = y17.f446954j;
                n3Var.removeCallbacks(runnable);
                n3Var.postDelayed(runnable, 0L);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.avu;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.f491704dz3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f437763i = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.kor);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f437764m = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        androidx.lifecycle.o mo133getLifecycle;
        wk2.j y17 = y();
        java.util.HashSet hashSet = y17.f446950f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            y17.e((wk2.d) it.next());
        }
        hashSet.clear();
        android.content.Context context = this.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this.f437770s);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f437764m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(this.f437765n);
        z(this.f437768q);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        pm0.v.V(300L, new vk2.g(this));
    }

    public final wk2.j y() {
        return (wk2.j) ((jz5.n) this.f437769r).getValue();
    }

    public final void z(int i17) {
        if (i17 % 2 != 0) {
            i17--;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f437764m;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
