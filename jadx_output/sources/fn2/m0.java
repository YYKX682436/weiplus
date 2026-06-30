package fn2;

/* loaded from: classes10.dex */
public final class m0 extends android.widget.LinearLayout implements fn2.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f264313d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f264314e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f264315f;

    /* renamed from: g, reason: collision with root package name */
    public final fn2.u1 f264316g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f264317h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f264318i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.vu f264319m;

    /* renamed from: n, reason: collision with root package name */
    public fn2.t0 f264320n;

    /* renamed from: o, reason: collision with root package name */
    public int f264321o;

    /* renamed from: p, reason: collision with root package name */
    public r45.yx1 f264322p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f264323q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f264324r;

    /* renamed from: s, reason: collision with root package name */
    public final fn2.q1 f264325s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f264326t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, sf2.d3 controller, kotlinx.coroutines.y0 y0Var, java.lang.String str, fn2.u1 sourceScene) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        this.f264313d = controller;
        this.f264314e = y0Var;
        this.f264315f = str;
        this.f264316g = sourceScene;
        this.f264325s = new fn2.q1(controller);
        java.util.List i17 = kz5.c0.i(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491817mo2), java.lang.Integer.valueOf(com.tencent.mm.R.string.f491818mo3)), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.string.f491815mo0), java.lang.Integer.valueOf(com.tencent.mm.R.string.f491816mo1)), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.string.mnm), java.lang.Integer.valueOf(com.tencent.mm.R.string.mnn)));
        this.f264326t = i17;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dsm, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487351s92);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f264317h = (com.google.android.material.tabs.TabLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s_x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) findViewById2;
        this.f264318i = viewPager;
        viewPager.setOffscreenPageLimit(i17.size() - 1);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rtg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f264319m = new com.tencent.mm.plugin.finder.live.widget.vu((android.view.ViewGroup) findViewById3, controller, y0Var, sourceScene);
        this.f264323q = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.ssm);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487466vj4);
        this.f264324r = textView;
        if (textView != null) {
            textView.setOnClickListener(new fn2.d0(this));
        }
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new fn2.f0(this, null), 3, null);
        }
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new fn2.h0(this, null), 3, null);
        }
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f264319m;
        if (vuVar != null) {
            vuVar.c(1, bm2.y8.f22465h, 1, null);
        } else {
            kotlin.jvm.internal.o.o("singingSongWidget");
            throw null;
        }
    }

    public static final void b(fn2.m0 m0Var, int i17, int i18) {
        java.util.List list = m0Var.f264326t;
        java.lang.String string = i18 == 0 ? m0Var.getContext().getString(((java.lang.Number) ((jz5.l) list.get(i17)).f302834e).intValue()) : m0Var.getContext().getString(((java.lang.Number) ((jz5.l) list.get(i17)).f302833d).intValue(), java.lang.String.valueOf(i18));
        kotlin.jvm.internal.o.d(string);
        com.google.android.material.tabs.TabLayout tabLayout = m0Var.f264317h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        oa.i k17 = tabLayout.k(i17);
        if (k17 != null) {
            k17.e(string);
        }
    }

    private final void setupTabListInternal(fn2.i1 i1Var) {
        r45.yx1 yx1Var;
        boolean z17 = false;
        java.util.List i17 = kz5.c0.i(0, 1, 2);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fn2.t0 t0Var = new fn2.t0(context, i17, this.f264316g);
        this.f264320n = t0Var;
        androidx.viewpager.widget.ViewPager viewPager = this.f264318i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager.setAdapter(t0Var);
        com.google.android.material.tabs.TabLayout tabLayout = this.f264317h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        androidx.viewpager.widget.ViewPager viewPager2 = this.f264318i;
        if (viewPager2 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        tabLayout.setupWithViewPager(viewPager2);
        fn2.l0 l0Var = new fn2.l0(this, i17);
        androidx.viewpager.widget.ViewPager viewPager3 = this.f264318i;
        if (viewPager3 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager3.addOnPageChangeListener(l0Var);
        int i18 = i1Var != null ? i1Var.f264285b : 0;
        l0Var.onPageSelected(0);
        c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Selecting default tab: ");
        sb6.append(i18);
        sb6.append(" based on locate result: ");
        sb6.append(i1Var != null ? java.lang.Integer.valueOf(i1Var.f264285b) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequested", sb6.toString());
        androidx.viewpager.widget.ViewPager viewPager4 = this.f264318i;
        if (viewPager4 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        viewPager4.setCurrentItem(i18);
        java.lang.String str = this.f264315f;
        if (str != null && (yx1Var = this.f264322p) != null) {
            if (kotlin.jvm.internal.o.b(str, yx1Var != null ? yx1Var.f391459e : null)) {
                z17 = true;
            }
        }
        if (z17) {
            androidx.viewpager.widget.ViewPager viewPager5 = this.f264318i;
            if (viewPager5 != null) {
                viewPager5.postDelayed(new fn2.j0(this), 300L);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
        }
        if (i1Var == null || i1Var.f264286c < 0) {
            return;
        }
        androidx.viewpager.widget.ViewPager viewPager6 = this.f264318i;
        if (viewPager6 != null) {
            viewPager6.postDelayed(new fn2.k0(this, i18, i1Var), 300L);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // fn2.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.m0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        androidx.recyclerview.widget.RecyclerView songRv;
        fn2.t0 t0Var = this.f264320n;
        if (t0Var != null) {
            kz5.x0 it = e06.p.m(0, t0Var.getCount()).iterator();
            while (((e06.j) it).f246214f) {
                int b17 = it.b();
                fn2.h1 h1Var = (fn2.h1) t0Var.f264402g.get(b17);
                if (h1Var != null && (songRv = h1Var.getSongRv()) != null) {
                    int i17 = b17 == this.f264321o ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(songRv, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    songRv.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(songRv, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    songRv.setNestedScrollingEnabled(b17 == this.f264321o);
                }
            }
        }
    }

    public final void d() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f264323q;
        if (constraintLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(constraintLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            constraintLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f264324r;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.f264317h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(tabLayout, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = this.f264318i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(viewPager, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public java.lang.String getTitle() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.mnk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // fn2.y1
    public void h() {
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f264319m;
        if (vuVar == null) {
            kotlin.jvm.internal.o.o("singingSongWidget");
            throw null;
        }
        vuVar.b();
        fn2.q1 q1Var = this.f264325s;
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", "Clearing cache data");
        q1Var.f264359b = null;
        q1Var.f264360c = null;
        q1Var.f264361d = null;
        q1Var.f264362e = null;
    }
}
