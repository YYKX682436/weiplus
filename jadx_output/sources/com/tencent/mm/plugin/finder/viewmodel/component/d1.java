package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f134057d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f134058e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f134059f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f134060g;

    /* renamed from: h, reason: collision with root package name */
    public so2.a2 f134061h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.convert.qg f134062i;

    /* renamed from: m, reason: collision with root package name */
    public in5.s0 f134063m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.a f134064n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f134065o;

    /* renamed from: p, reason: collision with root package name */
    public int f134066p;

    /* renamed from: q, reason: collision with root package name */
    public int f134067q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f134068r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.u0 f134069s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134058e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.w0(this));
        this.f134059f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.v0(this));
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134060g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134065o = new int[2];
        this.f134068r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.z0(this));
    }

    public static void S6(com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var, boolean z17, java.lang.CharSequence charSequence, long j17, android.graphics.drawable.Drawable drawable, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = 3000;
        }
        if ((i17 & 8) != 0) {
            drawable = null;
        }
        d1Var.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var = new com.tencent.mm.plugin.finder.viewmodel.component.u0(0);
        u0Var.f136073a = charSequence;
        u0Var.f136074b = j17;
        androidx.recyclerview.widget.RecyclerView recyclerView = d1Var.f134057d;
        java.lang.Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        u0Var.f136076d = linearLayoutManager != null ? linearLayoutManager.w() : -1;
        u0Var.f136077e = java.lang.System.currentTimeMillis();
        if (drawable != null) {
            u0Var.f136075c = drawable;
        }
        d1Var.U6(z17, u0Var);
    }

    public final android.view.ViewGroup O6() {
        return (android.view.ViewGroup) this.f134059f.getValue();
    }

    public final void P6(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var) {
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.DoubleClickTipUIC", "[hideCompleted] isBegin=" + z17 + " action=0");
    }

    public final boolean Q6() {
        in5.s0 s0Var = this.f134063m;
        so2.a2 a2Var = this.f134061h;
        if (s0Var != null && a2Var != null) {
            com.tencent.mm.plugin.finder.convert.qg qgVar = this.f134062i;
            if (qgVar != null) {
                qgVar.h(s0Var, a2Var, 0, 2019, false, null);
            }
            return this.f134062i != null;
        }
        com.tencent.mars.xlog.Log.w("Finder.DoubleClickTipUIC", "notifyHeaderFullMergedView fail,feedFullMergedHeaderHolder:" + this.f134063m + ",headerFullMergedData:" + this.f134061h);
        return false;
    }

    public final void R6(androidx.recyclerview.widget.RecyclerView recyclerView, so2.a2 headerFullMergedData, com.tencent.mm.plugin.finder.feed.pz presenter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(headerFullMergedData, "headerFullMergedData");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f134061h = headerFullMergedData;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f482427eb);
        viewGroup.setVisibility(0);
        this.f134062i = new com.tencent.mm.plugin.finder.convert.qg(presenter);
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(getContext());
        kotlin.jvm.internal.o.d(this.f134062i);
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.f487838h, viewGroup, false);
        viewGroup.addView(inflate);
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f293126m = recyclerView;
        this.f134063m = s0Var;
        s0Var.f293125i = headerFullMergedData;
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f134062i;
        if (qgVar != null) {
            qgVar.i(recyclerView, s0Var, 2019);
            qgVar.h(s0Var, headerFullMergedData, 0, 2019, false, null);
        }
    }

    public final void T6(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var) {
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.DoubleClickTipUIC", "[showCompleted] isBegin=" + z17 + " action=0");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f134060g;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oa_);
        if (textView != null) {
            textView.setText(u0Var.f136073a);
            textView.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.oaf);
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.a1(this, u0Var), u0Var.f136074b);
    }

    public final void U6(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var) {
        android.view.View findViewById;
        boolean z18 = false;
        if (!z17) {
            com.tencent.mm.plugin.finder.viewmodel.component.u0 u0Var2 = this.f134069s;
            if (u0Var2 != null) {
                u0Var.getClass();
                z18 = true;
            }
            if ((z18 || u0Var2 == null) && (findViewById = findViewById(com.tencent.mm.R.id.f482429ed)) != null) {
                findViewById.animate().cancel();
                if (findViewById.getVisibility() == 0) {
                    P6(true, u0Var);
                    findViewById.animate().alpha(0.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.c1(findViewById, this, u0Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        this.f134069s = u0Var;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482429ed);
        if (findViewById2 != null) {
            findViewById2.setBackground(u0Var.f136075c);
            findViewById2.animate().cancel();
            T6(true, u0Var);
            if (findViewById2.getVisibility() == 8) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById2.animate().alpha(1.0f).setDuration(300L).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.b1(this, u0Var)).start();
            }
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.ya0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ya0.class)).P6();
    }

    public final void V6() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mars.xlog.Log.i("Finder.DoubleClickTipUIC", "unRegisteActionBarLayoutChangeListener!");
        android.view.ViewGroup O6 = O6();
        if (O6 != null && (viewTreeObserver = O6.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) ((jz5.n) this.f134068r).getValue());
        }
        this.f134064n = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) getRootView().findViewById(com.tencent.mm.R.id.o8_);
        this.f134057d = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(new com.tencent.mm.plugin.finder.viewmodel.component.x0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f134060g.removeCallbacksAndMessages(null);
        V6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134058e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.w0(this));
        this.f134059f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.v0(this));
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f134060g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134065o = new int[2];
        this.f134068r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.z0(this));
    }
}
