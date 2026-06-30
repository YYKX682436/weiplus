package wm2;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f447251a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f447252b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f447253c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f447254d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f447255e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f447256f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f447257g;

    /* renamed from: h, reason: collision with root package name */
    public final wm2.l f447258h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f447259i;

    public n(androidx.constraintlayout.widget.ConstraintLayout rootLayout) {
        kotlin.jvm.internal.o.g(rootLayout, "rootLayout");
        this.f447251a = rootLayout;
        this.f447257g = new java.util.ArrayList();
        this.f447258h = new wm2.l(this);
        rootLayout.setAlpha(0.0f);
        android.view.View findViewById = rootLayout.findViewById(com.tencent.mm.R.id.bz6);
        findViewById.setOnClickListener(new wm2.c(this));
        this.f447252b = findViewById;
        android.view.View findViewById2 = rootLayout.findViewById(com.tencent.mm.R.id.aa9);
        findViewById2.setOnClickListener(new wm2.d(this));
        this.f447253c = findViewById2;
        android.view.View findViewById3 = rootLayout.findViewById(com.tencent.mm.R.id.f486654uz4);
        findViewById3.setOnClickListener(new wm2.e(this));
        this.f447254d = findViewById3;
        android.view.View findViewById4 = rootLayout.findViewById(com.tencent.mm.R.id.f483936t00);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f447255e = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = rootLayout.findViewById(com.tencent.mm.R.id.uke);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f447256f = (android.widget.FrameLayout) findViewById5;
    }

    public final void a(boolean z17, boolean z18) {
        if (((java.util.ArrayList) this.f447257g).isEmpty()) {
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f447251a;
        if (z17) {
            constraintLayout.animate().translationY(constraintLayout.getHeight()).alpha(0.0f).setDuration(200L).withEndAction(new wm2.m(this, z18)).start();
            return;
        }
        constraintLayout.setAlpha(0.0f);
        c();
        yz5.l lVar = this.f447259i;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z18));
        }
    }

    public final void b() {
        java.util.List list = this.f447257g;
        if (!list.isEmpty()) {
            return;
        }
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        boolean z17 = c1Var != null ? c1Var.O3 : true;
        lo0.t b17 = ko0.l.f309870a.b();
        dk2.ug ugVar = dk2.ug.f234218a;
        wm2.a aVar = new wm2.a(b17, dk2.ug.f234219b, ko0.l0.f309878a.b(), z17, ko0.c0.f309825a.b());
        android.widget.FrameLayout containerView = this.f447255e;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        android.widget.FrameLayout navigatorContainerView = this.f447256f;
        kotlin.jvm.internal.o.g(navigatorContainerView, "navigatorContainerView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = navigatorContainerView.getContext().getString(com.tencent.mm.R.string.dtw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        arrayList.add(new an2.k(string, an2.j.f8861d));
        if (aVar.f447228b) {
            java.lang.String string2 = navigatorContainerView.getContext().getString(com.tencent.mm.R.string.dub);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            arrayList.add(new an2.k(string2, an2.j.f8862e));
        }
        if (aVar.f447230d) {
            java.lang.String string3 = navigatorContainerView.getContext().getString(com.tencent.mm.R.string.du7);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            arrayList.add(new an2.k(string3, an2.j.f8863f));
        }
        android.view.View inflate = android.view.LayoutInflater.from(navigatorContainerView.getContext()).inflate(com.tencent.mm.R.layout.e8v, (android.view.ViewGroup) navigatorContainerView, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        bn2.o oVar = new bn2.o(containerView, aVar, navigatorContainerView, new an2.i((android.view.ViewGroup) inflate, arrayList, (an2.b) kz5.n0.X(arrayList)));
        oVar.f22883g = this.f447258h;
        ((java.util.ArrayList) list).add(oVar);
        containerView.addView(oVar.f22881e);
        android.view.ViewGroup viewGroup = oVar.f22882f;
        if (viewGroup != null) {
            navigatorContainerView.addView(viewGroup);
        }
        oVar.d();
        oVar.f();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f447251a;
        constraintLayout.setTranslationY(constraintLayout.getHeight());
        constraintLayout.setAlpha(0.0f);
        constraintLayout.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).start();
    }

    public final void c() {
        while (true) {
            java.util.List list = this.f447257g;
            if (!(!list.isEmpty())) {
                this.f447255e.removeAllViews();
                this.f447256f.removeAllViews();
                android.view.View view = this.f447252b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = this.f447253c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view3 = this.f447254d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautyUnifiedPanelWidget", "resetState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            bn2.p pVar = (bn2.p) kz5.n0.i0(list);
            pVar.getClass();
            pVar.h();
            ((java.util.ArrayList) list).remove(list.size() - 1);
        }
    }
}
