package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

/* loaded from: classes4.dex */
public class ContentFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {
    public static final /* synthetic */ int P = 0;
    public gb4.p A;
    public za4.g0 B;
    public gb4.q C;
    public gb4.b D;
    public java.util.Map E;
    public boolean F;
    public int G;

    /* renamed from: e, reason: collision with root package name */
    public int f165738e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 f165739f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f165741h;

    /* renamed from: i, reason: collision with root package name */
    public ab4.z0 f165742i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165743m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f165744n;

    /* renamed from: o, reason: collision with root package name */
    public int f165745o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f165746p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f165747q;

    /* renamed from: r, reason: collision with root package name */
    public int f165748r;

    /* renamed from: s, reason: collision with root package name */
    public int f165749s;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f165751u;

    /* renamed from: v, reason: collision with root package name */
    public int f165752v;

    /* renamed from: w, reason: collision with root package name */
    public int f165753w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f165754x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f165755y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f165756z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f165737d = new java.util.WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final int f165740g = 1000;

    /* renamed from: t, reason: collision with root package name */
    public boolean f165750t = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final android.content.BroadcastReceiver f165736J = new gb4.n(this);
    public final android.view.View.OnClickListener K = new gb4.o(this);
    public final android.view.View.OnClickListener L = new gb4.c(this);
    public boolean M = false;
    public final com.tencent.mm.plugin.sns.ui.widget.ad.c1 N = new gb4.d(this);

    public static /* synthetic */ int j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int i17 = contentFragment.f165748r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return i17;
    }

    public static /* synthetic */ gb4.b l0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        gb4.b bVar = contentFragment.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return bVar;
    }

    public static /* synthetic */ gb4.q m0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        gb4.q qVar = contentFragment.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return qVar;
    }

    public static /* synthetic */ int n0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int i17 = contentFragment.f165749s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return i17;
    }

    public void A0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        try {
            this.C.f270074d.setVisibility(4);
            this.C.f270074d.setTranslationY(-i65.a.b(getContext(), 20));
            this.f165751u.setRepeatMode(2);
            this.f165751u.setRepeatCount(0);
            this.f165751u.end();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContentFragment", "stopDownAnimation, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public final boolean o0() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (!this.f165746p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        }
        if (this.f165752v != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        }
        if (this.f165753w != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z18 = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI u07 = u0();
        if (u07 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = u07.f166696b2;
            if (yVar != null) {
                z17 = yVar.Z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                z17 = false;
            }
            if (z17 || u07.U7()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                return false;
            }
        }
        int w17 = this.f165747q.w();
        if (w17 == this.f165747q.y() && w17 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        }
        boolean z19 = true;
        if (this.f165743m) {
            z19 = this.f165747q.y() != this.D.getItemCount() - 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return z19;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onCreate(bundle);
        java.util.Map map = this.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(getContext());
        this.f165748r = c17[0];
        this.f165749s = c17[1];
        if (this.B == null) {
            za4.g0 g0Var = (za4.g0) map.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE_INFO);
            this.B = g0Var;
            p0(g0Var);
        }
        this.f165742i = (ab4.z0) map.get("pageDownIconInfo");
        this.f165744n = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("is_first_show_page"));
        this.f165743m = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("is_last_shown_page"));
        com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("needEnterAnimation"));
        this.f165746p = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) map.get("needDirectionAnimation"));
        this.f165745o = com.tencent.mm.sdk.platformtools.t8.o1(map.get("groupListCompShowIndex"), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f487968ct, viewGroup, false);
        gb4.q qVar = new gb4.q(null);
        this.C = qVar;
        qVar.f270071a = inflate;
        qVar.f270072b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n4l);
        this.C.f270073c = (com.tencent.mm.plugin.sns.ui.widget.ad.OverScrollLinearout) inflate.findViewById(com.tencent.mm.R.id.n57);
        if (this.f165743m) {
            this.C.f270073c.setOnScrollActionListener(this.N);
        }
        this.C.f270074d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n_i);
        this.C.f270075e = inflate.findViewById(com.tencent.mm.R.id.n_j);
        this.C.f270075e.setOnClickListener(this.K);
        this.C.f270074d.setOnClickListener(this.L);
        this.C.f270077g = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.chi);
        gb4.q qVar2 = this.C;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.dpj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
        qVar2.f270078h = linearLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.C.f270077g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        recyclerView.setOverScrollMode(0);
        if (com.tencent.mm.sdk.platformtools.t8.o1(this.E.get("pageCount"), 0) > 1) {
            recyclerView.setOnTouchListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.t((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager) this.E.get("viewPager")));
        } else {
            recyclerView.setOnTouchListener(null);
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getActivity());
        this.f165747q = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        gb4.b bVar = new gb4.b(this.B, this.f165738e, getActivity(), this.f165747q);
        this.D = bVar;
        if (this.f165744n) {
            int i17 = this.f165745o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGroupListCompShowIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            bVar.f270052h = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGroupListCompShowIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        recyclerView.setAdapter(this.D);
        recyclerView.setDescendantFocusability(131072);
        this.f165739f = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0(recyclerView);
        recyclerView.i(new gb4.e(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        inflate.setTag(this.C);
        w0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDownArrowAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f165751u = ofFloat;
        ofFloat.setDuration(this.f165740g);
        this.f165751u.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.f165751u.addUpdateListener(new gb4.i(this));
        this.f165751u.addListener(new gb4.j(this));
        this.f165751u.setRepeatCount(-1);
        this.f165751u.setRepeatMode(2);
        ab4.z0 z0Var = this.f165742i;
        if (z0Var != null && !z0Var.equals(this.C.f270074d.getTag())) {
            this.C.f270074d.setTag(this.f165742i);
            this.C.f270074d.setVisibility(8);
            za4.t0.c(this.f165742i.f2914a, false, 1000000001, 0, new gb4.k(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDownArrowAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        gb4.p pVar = this.A;
        if (pVar != null) {
            com.tencent.mm.plugin.sns.ui.lc lcVar = (com.tencent.mm.plugin.sns.ui.lc) pVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterOnCreateView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3");
            java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = lcVar.f169738d;
            java.lang.String str = snsAdNativeLandingPagesUI.f166703e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            o54.f fVar = snsAdNativeLandingPagesUI.A2;
            fVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContentFragmentCreateView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            if (fVar.f343141g == 0) {
                fVar.f343141g = java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContentFragmentCreateView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            androidx.recyclerview.widget.RecyclerView t07 = t0();
            if (t07 != null) {
                t07.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.cc(lcVar, this, t07));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterOnCreateView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onDestroy();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var = this.f165739f;
        if (e0Var != null) {
            e0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            gb4.b bVar = (gb4.b) e0Var.f165645c;
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            java.util.Iterator it = bVar.f270050f.entrySet().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) ((java.util.Map.Entry) it.next()).getValue()).L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        try {
            A0();
            this.f165751u.removeAllListeners();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContentFragment", "destroyDownAnimation, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onPause();
        com.tencent.mars.xlog.Log.i("ContentFragment", this + " onPause " + getUserVisibleHint());
        this.f165741h = false;
        this.f165739f.c(false);
        if (this.f165739f != null && getUserVisibleHint()) {
            this.f165739f.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unRegisterSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z17 = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (z17) {
            try {
                hashCode();
                b4.d.a(getContext()).d(this.f165736J);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ContentFragmentSphereImageView", "unRegisterSphereImageCompEventReceiver, exp:" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unRegisterSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onResume();
        com.tencent.mars.xlog.Log.i("ContentFragment", this + " onResume " + getUserVisibleHint());
        this.f165741h = true;
        gb4.q qVar = this.C;
        if (qVar != null && (view = qVar.f270071a) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            while (viewGroup != null && viewGroup.getId() != com.tencent.mm.R.id.m7g) {
                viewGroup = (android.view.ViewGroup) viewGroup.getParent();
            }
            if (viewGroup instanceof android.widget.FrameLayout) {
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    if (viewGroup.getChildAt(i17) instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) {
                        this.f165741h = false;
                    }
                }
            }
        }
        if (this.f165755y && !com.tencent.mm.sdk.platformtools.t8.K0(this.f165756z)) {
            this.f165741h = false;
            if (this.f165739f != null && getUserVisibleHint()) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var = this.f165739f;
                za4.g0 g0Var = this.B;
                java.lang.String str = this.f165756z;
                e0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = e0Var.f165644b;
                if (linearLayoutManager != null) {
                    int w17 = linearLayoutManager.w();
                    int y17 = linearLayoutManager.y();
                    if (w17 == y17 && w17 == -1) {
                        com.tencent.mars.xlog.Log.i("RecyclerViewExposureMgr", "no exposuring child");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startFullScreenCompExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        while (true) {
                            if (w17 > y17) {
                                break;
                            }
                            if (((ab4.d0) g0Var.f471083c.get(w17)).f2817d.equals(str)) {
                                java.util.HashMap hashMap = (java.util.HashMap) e0Var.f165643a;
                                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0 a0Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) hashMap.get(java.lang.Integer.valueOf(w17));
                                if (a0Var == null) {
                                    a0Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0(e0Var, null);
                                    hashMap.put(java.lang.Integer.valueOf(w17), a0Var);
                                }
                                gb4.b bVar = (gb4.b) e0Var.f165645c;
                                if (bVar.J(w17) && !a0Var.f165631a) {
                                    bVar.y(w17, e0Var);
                                    a0Var.a();
                                }
                            } else {
                                w17++;
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startFullScreenCompExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            }
        }
        this.f165739f.c(this.f165741h);
        if (this.f165739f != null && getUserVisibleHint()) {
            this.f165739f.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z17 = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (z17) {
            try {
                hashCode();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_show");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_hide");
                b4.d.a(getContext()).b(this.f165736J, intentFilter);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ContentFragmentSphereImageView", "registerSphereImageCompEventReceiver, exp:" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void p0(za4.g0 g0Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSphereImageComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        this.H = false;
        this.I = false;
        if (g0Var != null && (linkedList = g0Var.f471083c) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ab4.d0 d0Var = (ab4.d0) it.next();
                if (d0Var instanceof ab4.y) {
                    ab4.y yVar = (ab4.y) d0Var;
                    yVar.getClass();
                    if (yVar.f2829s == 0.0f || yVar.f2830t == 0.0f) {
                        this.I = true;
                    }
                    this.H = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("ContentFragmentSphereImageView", "checkSphereImageComp, isSphereImageViewCompPage=" + this.H + ", isFullScreen=" + this.I);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSphereImageComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public int q0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        androidx.fragment.app.FragmentActivity activity = getActivity();
        int i17 = -1;
        if (!(activity instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return -1;
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) activity;
        snsAdNativeLandingPagesUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper floatJumpCompHelper = snsAdNativeLandingPagesUI.f166730n3;
        if (floatJumpCompHelper != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxJumpOffset", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            int i18 = floatJumpCompHelper.f163155h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxJumpOffset", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            i17 = i18;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return i17;
    }

    public java.util.Collection r0() {
        java.util.Collection values;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        gb4.b bVar = this.D;
        if (bVar == null) {
            values = java.util.Collections.EMPTY_LIST;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            java.util.LinkedHashMap linkedHashMap = bVar.f270050f;
            values = linkedHashMap == null ? java.util.Collections.EMPTY_LIST : linkedHashMap.values();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return values;
    }

    public ab4.j0 s0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI u07 = u0();
        if (u07 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ab4.j0 j0Var = u07.f166712h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return j0Var;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserVisibleHint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.setUserVisibleHint(z17);
        if (z17) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var = this.f165739f;
            if (e0Var != null) {
                e0Var.a();
            }
        } else {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var2 = this.f165739f;
            if (e0Var2 != null) {
                e0Var2.b();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserVisibleHint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public androidx.recyclerview.widget.RecyclerView t0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        gb4.q qVar = this.C;
        if (qVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = qVar.f270077g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return recyclerView;
    }

    public com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI u0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (!(activity instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return snsAdNativeLandingPagesUI;
    }

    public final void w0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("render", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (this.C == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("render", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        y0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        java.lang.String str = this.B.backgroundCoverUrl;
        if (str == null || str.length() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            y0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(nd1.s0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        } else {
            za4.g0 g0Var = this.B;
            java.lang.String str2 = g0Var.backgroundCoverUrl;
            com.tencent.mars.xlog.Log.i("ContentFragment", "bg need blur %b, url %s", java.lang.Boolean.valueOf(g0Var.f471082b), str2);
            java.util.WeakHashMap weakHashMap = (java.util.WeakHashMap) this.f165737d;
            if (weakHashMap.containsKey(str2)) {
                com.tencent.mars.xlog.Log.i("ContentFragment", "bg has cache bitmap");
                x0((android.graphics.Bitmap) weakHashMap.get(str2));
            } else {
                za4.t0.b("adId", str2, false, 1000000001, 0, new gb4.f(this, str2));
            }
        }
        if (this.D != null) {
            java.lang.String str3 = this.B.backgroundCoverUrl;
            if (str3 == null || str3.length() <= 0) {
                gb4.b bVar = this.D;
                int i17 = this.f165738e;
                bVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
                bVar.f270049e = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            } else {
                gb4.b bVar2 = this.D;
                bVar2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
                bVar2.f270049e = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            }
            gb4.b bVar3 = this.D;
            za4.g0 g0Var2 = this.B;
            bVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            if (bVar3.f270048d != g0Var2) {
                bVar3.f270048d = g0Var2;
                bVar3.notifyDataSetChanged();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("render", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public final void x0(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (bitmap != null) {
            this.C.f270071a.setBackgroundColor(0);
            this.C.f270072b.setBackgroundColor(0);
            this.C.f270073c.setBackgroundColor(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.f270072b.getLayoutParams();
            int i17 = layoutParams.height;
            int i18 = this.f165749s;
            if (i17 < i18) {
                i17 = i18;
            }
            layoutParams.height = i17;
            this.C.f270072b.setLayoutParams(layoutParams);
            this.C.f270072b.setImageBitmap(bitmap);
        } else {
            y0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public final void y0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        java.lang.String str = this.B.f471081a;
        if (str != null && str.length() > 0) {
            com.tencent.mars.xlog.Log.i("ContentFragment", "setting bg color %s", this.B.f471081a);
            try {
                this.f165738e = ca4.n0.e(this.B.f471081a, 0);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("ContentFragment", "the color is error : " + this.B.f471081a);
            }
            this.C.f270071a.setBackgroundColor(this.f165738e);
            this.C.f270072b.setBackgroundColor(this.f165738e);
            this.C.f270073c.setBackgroundColor(this.f165738e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void z0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ContentFragment", "startDownAnimation, exp=" + e17.toString());
        }
        if (o0() && !this.f165750t) {
            gb4.q qVar = this.C;
            if (!qVar.f270076f) {
                qVar.f270074d.setVisibility(0);
                this.C.f270074d.setTranslationY(-i65.a.b(getContext(), 20));
                this.f165751u.setRepeatMode(2);
                this.f165751u.setRepeatCount(-1);
                this.f165751u.start();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }
}
