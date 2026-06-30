package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i60 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f134702d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134703e;

    /* renamed from: f, reason: collision with root package name */
    public final int f134704f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f134704f = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.K3).getValue()).r()).intValue();
    }

    public final void O6() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.widget.TextView textView;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (getActivity().isFinishing() || getActivity().isDestroyed()) {
            return;
        }
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
            kotlin.jvm.internal.o.g(fragment, "fragment");
            com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) zVar.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
            if (t80Var != null) {
                recyclerView = t80Var.S6();
            }
            recyclerView = null;
        } else {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) getActivity().findViewById(com.tencent.mm.R.id.m6e);
            if (refreshLoadMoreLayout != null) {
                recyclerView = refreshLoadMoreLayout.getRecyclerView();
            }
            recyclerView = null;
        }
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int t17 = linearLayoutManager != null ? linearLayoutManager.t() : -1;
        if (t17 != -1) {
            androidx.recyclerview.widget.k3 p07 = recyclerView.p0(t17);
            in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
            if (s0Var != null && s0Var.getItemViewType() == 4) {
                h0Var.f310123d = s0Var.p(com.tencent.mm.R.id.jdk);
            }
        }
        if (h0Var.f310123d == null) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_SPEED_GUIDE_INT;
        int r17 = c17.r(u3Var, 0);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_SPEED_SHOW_TIME_LONG;
        long t18 = c18.t(u3Var2, 0L);
        boolean z17 = t18 == 0 || t18 + ((long) this.f134704f) < java.lang.System.currentTimeMillis() / ((long) 1000);
        if (r17 >= 3 || !z17) {
            return;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b9l, (android.view.ViewGroup) null, false);
        this.f134702d = inflate;
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g39)) != null) {
            textView.setTextSize(1, 20.0f);
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View view = this.f134702d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC", "checkShow", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC", "checkShow", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.animate().setDuration(300L).alpha(1.0f).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.f60(this, view, new kotlin.jvm.internal.c0(), h0Var)).start();
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) h0Var.f310123d;
        android.view.View view2 = this.f134702d;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        viewGroup.addView(view2, layoutParams);
        android.view.View view3 = this.f134702d;
        if (view3 != null) {
            view3.setClickable(false);
        }
        android.view.View view4 = this.f134702d;
        if (view4 != null) {
            view4.setOnTouchListener(new com.tencent.mm.plugin.finder.viewmodel.component.h60(this, h0Var));
        }
        this.f134705g = true;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getIntExtra("report_scene", 0) == 22) {
            com.tencent.mars.xlog.Log.i("Finder.SpeedGuideUIC", "FinderScanPreviewLogic hide speedGuide");
        }
    }
}
