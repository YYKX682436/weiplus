package up2;

/* loaded from: classes2.dex */
public class m extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f429798d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f429799e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f429800f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f429801g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f429802h;

    /* renamed from: i, reason: collision with root package name */
    public final int f429803i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f429804m;

    /* renamed from: n, reason: collision with root package name */
    public final int f429805n;

    /* renamed from: o, reason: collision with root package name */
    public long f429806o;

    public m(java.util.ArrayList feedDataList, yz5.a autoPlayManager, sp2.c4 caller, yz5.a loadMoreCall, yz5.a canLoadingMore, int i17) {
        kotlin.jvm.internal.o.g(feedDataList, "feedDataList");
        kotlin.jvm.internal.o.g(autoPlayManager, "autoPlayManager");
        kotlin.jvm.internal.o.g(caller, "caller");
        kotlin.jvm.internal.o.g(loadMoreCall, "loadMoreCall");
        kotlin.jvm.internal.o.g(canLoadingMore, "canLoadingMore");
        this.f429798d = feedDataList;
        this.f429799e = autoPlayManager;
        this.f429800f = caller;
        this.f429801g = loadMoreCall;
        this.f429802h = canLoadingMore;
        this.f429803i = i17;
        this.f429804m = "NewEntrancePlayChecker";
        this.f429805n = b();
        int i18 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;
    }

    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i17;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
            int i18 = this.f429803i;
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            finderStaggeredGridLayoutManager.u(iArr);
            finderStaggeredGridLayoutManager.v(iArr2);
            java.util.ArrayList<so2.j5> arrayList = new java.util.ArrayList();
            int K = kz5.z.K(iArr);
            int e07 = kz5.z.e0(iArr2);
            java.util.ArrayList arrayList2 = this.f429798d;
            if (K <= e07) {
                while (true) {
                    so2.j5 j5Var = (so2.j5) kz5.n0.a0(arrayList2, K);
                    if (j5Var != null && !d(j5Var)) {
                        arrayList.add(j5Var);
                    }
                    if (K == e07) {
                        break;
                    } else {
                        K++;
                    }
                }
            }
            sp2.c4 c4Var = this.f429800f;
            java.util.Iterator it = c4Var.f410997a.iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                sp2.b4 b4Var = (sp2.b4) it.next();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (b4Var.c((so2.j5) it6.next())) {
                                i17 = 1;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (i17 == 0) {
                    b4Var.f();
                }
            }
            int i19 = 0;
            for (so2.j5 j5Var2 : arrayList) {
                for (sp2.b4 b4Var2 : c4Var.f410997a) {
                    if (b4Var2.c(j5Var2) && b4Var2.b(i19)) {
                        i19++;
                    }
                }
            }
            gp2.l0 l0Var = (gp2.l0) this.f429799e.invoke();
            boolean z17 = l0Var != null && l0Var.K(i19, true);
            if (l0Var != null) {
                l0Var.I(z17);
            }
            java.lang.String c17 = c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]#checkAutoPlayNew firstVisibleItemPos=");
            sb6.append(iArr);
            sb6.append(", lastVisibleItemPos=");
            sb6.append(iArr2);
            sb6.append(", visibleFeeds=");
            sb6.append(arrayList.size());
            sb6.append(", autoPlayContainerCount = ");
            sb6.append(i19);
            sb6.append(", parent scrollView autoPlay=");
            sb6.append(z17);
            sb6.append(".caller.listeners.size=");
            sb6.append(((java.util.ArrayList) c4Var.f410997a).size());
            sb6.append("feedDataList=[");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (java.lang.Object obj : arrayList2) {
                int i27 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var3 = (so2.j5) obj;
                arrayList3.add(("[" + i17 + ']' + j5Var3.getClass().getSimpleName() + " hashCode=" + j5Var3.hashCode()) + (j5Var3 instanceof vp2.x ? " nickName=" + ((vp2.x) j5Var3).getFeedObject().getNickName() : ""));
                i17 = i27;
            }
            sb6.append(kz5.n0.g0(arrayList3, ", ", null, null, 0, null, null, 62, null));
            sb6.append(']');
            com.tencent.mars.xlog.Log.i(c17, sb6.toString());
        }
    }

    public int b() {
        return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.V0().r()).intValue();
    }

    public java.lang.String c() {
        return this.f429804m;
    }

    public boolean d(so2.j5 j5Var) {
        return (j5Var instanceof wp2.b) || (j5Var instanceof vp2.c) || (j5Var instanceof vp2.h0);
    }

    public final void e(java.lang.String source, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (((java.lang.Boolean) this.f429802h.invoke()).booleanValue()) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            int[] iArr = new int[this.f429803i];
            ((com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager).v(iArr);
            int e07 = kz5.z.e0(iArr);
            java.util.ArrayList arrayList = this.f429798d;
            int size = arrayList.size();
            int i17 = this.f429805n;
            boolean z17 = size > 0 && e07 >= arrayList.size() - i17;
            com.tencent.mars.xlog.Log.i(c(), "checkLoadMore: source=" + source + ", enableLoadMore=" + z17 + ", lastPos=" + e07 + ", preloadCount=" + i17 + ", dataSize=" + arrayList.size());
            if (z17) {
                this.f429801g.invoke();
            }
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i(c(), "onScrollStateChanged: " + i17);
        sp2.z3.f411301b = null;
        if (i17 == 0) {
            a(recyclerView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f429806o > 50) {
            this.f429806o = currentTimeMillis;
            e("onScrolled", recyclerView);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f429800f.f410997a).iterator();
        while (it.hasNext()) {
            ((sp2.b4) it.next()).g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
