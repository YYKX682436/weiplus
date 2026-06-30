package pl2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f356646a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f356647b;

    /* renamed from: c, reason: collision with root package name */
    public xx2.l f356648c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f356650e;

    /* renamed from: f, reason: collision with root package name */
    public pl2.m f356651f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356652g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f356653h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f356654i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.Context f356655j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f356656k;

    /* renamed from: l, reason: collision with root package name */
    public int f356657l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f356658m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356659n;

    /* renamed from: o, reason: collision with root package name */
    public final pl2.l f356660o;

    public s(android.view.View liveContainer) {
        kotlin.jvm.internal.o.g(liveContainer, "liveContainer");
        this.f356646a = liveContainer;
        this.f356647b = "Finder.FinderLiveSideBar";
        this.f356650e = new java.util.HashSet();
        this.f356656k = new java.util.ArrayList();
        this.f356660o = new pl2.l(this);
    }

    public static void e(pl2.s sVar, long j17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            xx2.l lVar = sVar.f356648c;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("finderSideBar");
                throw null;
            }
            lVar.f457985g.getClass();
            j17 = 300;
        }
        if ((i17 & 2) != 0) {
            aVar = pl2.o.f356642d;
        }
        sVar.d(j17, aVar);
    }

    public final void a(java.lang.String sceneId) {
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        com.tencent.mars.xlog.Log.i(this.f356647b, "addDragBarrier ".concat(sceneId));
        this.f356650e.add(sceneId);
        xx2.l lVar = this.f356648c;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("finderSideBar");
            throw null;
        }
        lVar.f457986h.post(new xx2.g(lVar));
    }

    public final android.content.Context b() {
        android.content.Context context = this.f356655j;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("context");
        throw null;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView c() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f356654i;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("sideBarRv");
        throw null;
    }

    public final void d(long j17, yz5.a animationEnd) {
        kotlin.jvm.internal.o.g(animationEnd, "animationEnd");
        com.tencent.mars.xlog.Log.i(this.f356647b, "hide");
        xx2.l lVar = this.f356648c;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("finderSideBar");
            throw null;
        }
        lVar.f457983e.A = 0;
        lVar.f457985g.b(false);
        lVar.d(lVar.f457983e, 0.0f, 1.0f, j17, new xx2.e(lVar, animationEnd));
    }

    public final void f(java.lang.String sceneId) {
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        com.tencent.mars.xlog.Log.i(this.f356647b, "removeDragBarrier ".concat(sceneId));
        this.f356650e.remove(sceneId);
        j(this.f356649d);
    }

    public final void g(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select position:");
        sb6.append(i17);
        sb6.append(", sideBarDataList.size:");
        java.util.ArrayList arrayList = this.f356656k;
        sb6.append(arrayList.size());
        sb6.append(", curPosition:");
        sb6.append(this.f356657l);
        com.tencent.mars.xlog.Log.i(this.f356647b, sb6.toString());
        if (i17 < 0 || i17 >= arrayList.size() || this.f356657l == i17) {
            return;
        }
        this.f356657l = i17;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((pl2.a) obj).f356617e = i18 == i17;
            i18 = i19;
        }
        androidx.recyclerview.widget.f2 adapter = c().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        c().post(new pl2.q(this));
    }

    public final void h(int i17) {
        android.view.View view = this.f356660o.f356637g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(boolean z17, yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show isShowExitBtn=");
        sb6.append(z17);
        sb6.append(" barrierSet size:");
        java.util.HashSet hashSet = this.f356650e;
        sb6.append(hashSet.size());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f356647b;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (hashSet.size() > 0) {
            com.tencent.mars.xlog.Log.i(str, "try show side bar but: barrierSet size:" + hashSet.size());
            return;
        }
        android.content.Context b17 = b();
        pf5.z zVar = pf5.z.f353948a;
        if (!(b17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) b17).a(pl2.x.class)).f356687m.f356677g = 1;
        pl2.l lVar = this.f356660o;
        lVar.f356631a = z17;
        android.widget.ImageView imageView = lVar.f356634d;
        if (imageView != null) {
            imageView.setOnClickListener(new pl2.r(aVar));
        }
        xx2.l lVar2 = this.f356648c;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("finderSideBar");
            throw null;
        }
        lVar2.f457983e.A = 0;
        xx2.d dVar = lVar2.f457985g;
        dVar.b(true);
        com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout draggableConstraintLayout = lVar2.f457983e;
        xx2.f fVar = new xx2.f(lVar2);
        dVar.getClass();
        lVar2.d(draggableConstraintLayout, 0.0f, 1.0f, 300L, fVar);
    }

    public final void j(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toggleSideBar from:");
        sb6.append(z17);
        sb6.append(", to:");
        sb6.append(z17);
        sb6.append(", barrierSet size:");
        java.util.HashSet hashSet = this.f356650e;
        sb6.append(hashSet.size());
        com.tencent.mars.xlog.Log.i(this.f356647b, sb6.toString());
        this.f356649d = z17;
        if (z17 && hashSet.isEmpty()) {
            xx2.l lVar = this.f356648c;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("finderSideBar");
                throw null;
            }
            lVar.f457986h.post(new xx2.h(lVar));
            return;
        }
        xx2.l lVar2 = this.f356648c;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("finderSideBar");
            throw null;
        }
        lVar2.f457986h.post(new xx2.g(lVar2));
    }

    public final void k() {
        java.lang.String str = this.f356647b;
        com.tencent.mars.xlog.Log.i(str, "unmount");
        int childCount = c().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c().getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            androidx.recyclerview.widget.k3 w07 = c().w0(childAt);
            kotlin.jvm.internal.o.f(w07, "getChildViewHolder(...)");
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) childAt.findViewById(com.tencent.mm.R.id.toa);
            com.tencent.mars.xlog.Log.i(str, "Stopping sidebar item play. " + w07.getAdapterPosition());
            nearbyLivePreviewView.stop();
            nearbyLivePreviewView.release();
        }
        this.f356656k.clear();
        this.f356657l = 0;
        this.f356650e.clear();
        this.f356652g = false;
        androidx.recyclerview.widget.f2 adapter = c().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        xx2.l lVar = this.f356648c;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("finderSideBar");
            throw null;
        }
        lVar.f457984f.setVisibility(8);
        j(false);
    }
}
