package uv0;

/* loaded from: classes5.dex */
public final class u extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l {

    /* renamed from: J, reason: collision with root package name */
    public vv0.k f431351J;
    public float K;
    public boolean L;
    public android.view.ViewGroup M;
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar N;
    public android.widget.TextView P;
    public com.google.android.material.tabs.TabLayout Q;
    public androidx.recyclerview.widget.RecyclerView R;
    public android.view.View S;
    public android.view.View T;
    public uv0.i U;
    public final jz5.g V;
    public final java.util.ArrayList W;

    /* renamed from: p0, reason: collision with root package name */
    public final uv0.r f431352p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        vv0.k kVar = vv0.k.f440383f;
        this.f431351J = vv0.k.f440383f;
        this.K = 1.0f;
        this.V = jz5.h.b(new uv0.l(this));
        this.W = new java.util.ArrayList();
        this.f431352p0 = new uv0.r(this);
    }

    public static final void L(uv0.u uVar, int i17, vv0.k kVar) {
        com.tencent.maas.material.MJMaterialPack mJMaterialPack;
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo;
        java.lang.Object obj;
        com.tencent.maas.moviecomposing.Timeline D;
        com.tencent.maas.moviecomposing.Timeline D2;
        uVar.getClass();
        if (kotlin.jvm.internal.o.b(kVar, vv0.k.f440384g)) {
            return;
        }
        vv0.k filterInfo = i17 == 0 ? vv0.k.f440383f : kVar;
        if (!kotlin.jvm.internal.o.b(uVar.f431351J.f440385a, kVar.f440385a)) {
            uVar.K = 1.0f;
            uVar.J();
            uv0.i iVar = uVar.U;
            if (iVar != null) {
                float f17 = uVar.K;
                uv0.h hVar = (uv0.h) iVar;
                com.tencent.maas.moviecomposing.segments.Segment segment = hVar.f431335c.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null && (D2 = clipSegment.D()) != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.G0(clipSegment, f17, D2);
                }
                hVar.f431334b.p7().c7();
            }
            uVar.getAdapter().x(i17, filterInfo);
            uv0.i iVar2 = uVar.U;
            if (iVar2 != null) {
                uv0.h hVar2 = (uv0.h) iVar2;
                kotlin.jvm.internal.o.g(filterInfo, "filterInfo");
                rv0.n1 n1Var = hVar2.f431334b;
                du0.v0 R6 = n1Var.R6();
                R6.getClass();
                java.lang.String filterID = filterInfo.f440385a;
                kotlin.jvm.internal.o.g(filterID, "filterID");
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.e4(m7Var, filterID, null), 3, null);
                if (kotlin.jvm.internal.o.b(filterInfo, vv0.k.f440383f)) {
                    com.tencent.maas.moviecomposing.segments.Segment segment2 = hVar2.f431335c.f257167a;
                    com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = segment2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment2 : null;
                    if (clipSegment2 != null && (D = clipSegment2.D()) != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.k1(clipSegment2, "", D);
                    }
                    n1Var.p7().c7();
                } else {
                    vv0.c cVar = (vv0.c) n1Var.m7().f14482d.getValue();
                    if (cVar != null && (mJMaterialPack = cVar.f440373a) != null) {
                        java.util.Iterator it = ((java.util.ArrayList) mJMaterialPack.a()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                mJMaterialInfo = null;
                                break;
                            }
                            java.util.Iterator it6 = ((java.util.ArrayList) ((com.tencent.maas.material.MJMaterialCategory) it.next()).a()).iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it6.next();
                                    if (kotlin.jvm.internal.o.b(((com.tencent.maas.material.MJMaterialInfo) obj).f48224b, filterID)) {
                                        break;
                                    }
                                }
                            }
                            mJMaterialInfo = (com.tencent.maas.material.MJMaterialInfo) obj;
                            if (mJMaterialInfo != null) {
                                break;
                            }
                        }
                        if (mJMaterialInfo != null) {
                            aw0.f m76 = n1Var.m7();
                            vv0.b bVar = vv0.b.f440371d;
                            vv0.a aVar = new vv0.a(mJMaterialInfo, filterInfo.f440389e);
                            m76.getClass();
                            kotlinx.coroutines.l.d(m76.f14480b, null, null, new aw0.d(aVar, m76, bVar, null), 3, null);
                        }
                    }
                }
            }
        }
        uVar.setSelectedFilterInfo(filterInfo);
        uVar.getAdapter().z(filterInfo);
        uVar.P(filterInfo.f440388d);
        uVar.post(new uv0.t(uVar));
    }

    public static final void M(uv0.u uVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView = uVar.R;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int t17 = (linearLayoutManager.t() + linearLayoutManager.x()) / 2;
        vv0.k kVar = (vv0.k) kz5.n0.a0(uVar.getAdapter().f275970d, t17);
        if (kVar == null) {
            return;
        }
        if (kotlin.jvm.internal.o.b(kVar.f440385a, vv0.k.f440384g.f440385a) && (kVar = (vv0.k) kz5.n0.a0(uVar.getAdapter().f275970d, t17 + 1)) == null) {
            vv0.k kVar2 = (vv0.k) kz5.n0.a0(uVar.getAdapter().f275970d, t17 - 1);
            if (kVar2 == null) {
                kVar2 = vv0.k.f440383f;
            }
            kVar = kVar2;
        }
        uVar.P(kVar.f440388d);
    }

    public static final void N(uv0.u uVar, int i17) {
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("FilterPanel", "smoothScrollToCenter: index " + i17);
        androidx.recyclerview.widget.RecyclerView recyclerView = uVar.R;
        if (recyclerView != null) {
            dy0.o.a(recyclerView, i17, true);
        }
    }

    public static final void O(uv0.u uVar, float f17) {
        uVar.getClass();
        if (java.lang.Float.compare(f17, 0) == 0) {
            android.widget.TextView textView = uVar.P;
            if (textView == null) {
                return;
            }
            textView.setText("0");
            return;
        }
        android.widget.TextView textView2 = uVar.P;
        if (textView2 == null) {
            return;
        }
        java.lang.String format = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (f17 * 100))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        textView2.setText(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uv0.f getAdapter() {
        return (uv0.f) ((jz5.n) this.V).getValue();
    }

    private final void setSelectedFilterInfo(vv0.k kVar) {
        this.f431351J = kVar;
        post(new uv0.t(this));
    }

    public final void P(int i17) {
        oa.i k17;
        java.util.Iterator it = this.W.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((vv0.j) it.next()).f440382b == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 < 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FilterPanel", "selectTab: tabIndex " + i18);
        com.google.android.material.tabs.TabLayout tabLayout = this.Q;
        if (tabLayout == null || (k17 = tabLayout.k(i18)) == null) {
            return;
        }
        k17.b();
    }

    public final void Q(java.util.List categories, java.lang.String str) {
        kotlin.jvm.internal.o.g(categories, "categories");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.W;
        arrayList2.clear();
        vv0.k kVar = vv0.k.f440383f;
        arrayList.add(vv0.k.f440383f);
        java.util.Iterator it = categories.iterator();
        while (it.hasNext()) {
            com.tencent.maas.material.MJMaterialCategory mJMaterialCategory = (com.tencent.maas.material.MJMaterialCategory) it.next();
            if (!mJMaterialCategory.a().isEmpty()) {
                java.lang.String str2 = mJMaterialCategory.f48220c;
                kotlin.jvm.internal.o.f(str2, "getCategoryName(...)");
                arrayList2.add(new vv0.j(str2, mJMaterialCategory.f48219b));
                vv0.k kVar2 = vv0.k.f440383f;
                arrayList.add(vv0.k.f440384g);
                for (com.tencent.maas.material.MJMaterialInfo mJMaterialInfo : mJMaterialCategory.a()) {
                    java.lang.String str3 = mJMaterialInfo.f48224b;
                    kotlin.jvm.internal.o.f(str3, "getMaterialID(...)");
                    java.lang.String str4 = mJMaterialInfo.f48226d;
                    kotlin.jvm.internal.o.f(str4, "getMaterialName(...)");
                    java.lang.String str5 = mJMaterialInfo.f48227e;
                    kotlin.jvm.internal.o.f(str5, "getPreviewImageURL(...)");
                    vv0.k kVar3 = new vv0.k(str3, str4, str5, mJMaterialCategory.f48219b, zu0.i.f475674d);
                    if (kotlin.jvm.internal.o.b(str, kVar3.f440385a)) {
                        setSelectedFilterInfo(kVar3);
                    }
                    arrayList.add(kVar3);
                }
            }
        }
        post(new uv0.q(this, arrayList));
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.Q;
        if (tabLayout != null) {
            tabLayout.setVisibility(0);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.R;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        android.view.View view = this.S;
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.T;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R(vv0.a clipData, boolean z17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(clipData, "clipData");
        java.util.Iterator it = getAdapter().f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((vv0.k) obj).f440385a, clipData.f440369a.f48224b)) {
                    break;
                }
            }
        }
        vv0.k kVar = (vv0.k) obj;
        if (kVar == null) {
            return;
        }
        int i17 = kVar.f440388d;
        vv0.k kVar2 = vv0.k.f440383f;
        java.lang.String filterID = kVar.f440385a;
        kotlin.jvm.internal.o.g(filterID, "filterID");
        java.lang.String filterName = kVar.f440386b;
        kotlin.jvm.internal.o.g(filterName, "filterName");
        java.lang.String previewImageURL = kVar.f440387c;
        kotlin.jvm.internal.o.g(previewImageURL, "previewImageURL");
        zu0.i materialLoadState = clipData.f440370b;
        kotlin.jvm.internal.o.g(materialLoadState, "materialLoadState");
        S(new vv0.k(filterID, filterName, previewImageURL, i17, materialLoadState), z17);
    }

    public final void S(vv0.k kVar, boolean z17) {
        java.util.Iterator it = getAdapter().f275970d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((vv0.k) it.next()).f440385a, kVar.f440385a)) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("FilterPanel", "updateFilterState: index " + i17);
        if (i17 < 0) {
            return;
        }
        getAdapter().x(i17, kVar);
        if (z17) {
            getAdapter().z(kVar);
            post(new uv0.s(this, kVar, i17));
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dfs, bodyContainerLayout);
    }

    public final float getFilterIntensity() {
        return this.K;
    }

    @Override // qv0.f
    public java.lang.String getToolbarTitle() {
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.ll9);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.l, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        super.p();
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.Q;
        if (tabLayout != null) {
            tabLayout.setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.R;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.view.View view = this.S;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        I(new uv0.o(this), new uv0.p(this));
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(this, this.S, null);
    }

    public final void setFilterIntensity(float f17) {
        this.K = f17;
    }

    public final void setFilterOptionCallback(uv0.i optionCallback) {
        kotlin.jvm.internal.o.g(optionCallback, "optionCallback");
        this.U = optionCallback;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q panel) {
        java.util.List<yz5.l> onProgressChangedCallback;
        kotlin.jvm.internal.o.g(panel, "panel");
        this.M = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.q7k);
        this.N = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar) findViewById(com.tencent.mm.R.id.q7j);
        this.P = (android.widget.TextView) findViewById(com.tencent.mm.R.id.q7l);
        this.Q = (com.google.android.material.tabs.TabLayout) findViewById(com.tencent.mm.R.id.q4x);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.e4u);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        recyclerView.i(new uv0.j(this));
        this.R = recyclerView;
        this.S = findViewById(com.tencent.mm.R.id.q3i);
        this.T = findViewById(com.tencent.mm.R.id.hmo);
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar = this.N;
        if (adjustSeekBar != null && (onProgressChangedCallback = adjustSeekBar.getOnProgressChangedCallback()) != null) {
            onProgressChangedCallback.add(new uv0.m(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.R;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(getAdapter());
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.R;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.R;
        if (recyclerView4 != null) {
            recyclerView4.N(new uv0.a(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn), i65.a.h(getContext(), com.tencent.mm.R.dimen.f479648bn)));
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.Q;
        if (tabLayout != null) {
            tabLayout.a(this.f431352p0);
        }
        android.view.View view = this.S;
        if (view != null) {
            view.setOnClickListener(new uv0.n(this));
        }
        post(new uv0.t(this));
    }
}
