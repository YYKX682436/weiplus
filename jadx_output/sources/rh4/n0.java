package rh4;

/* loaded from: classes8.dex */
public class n0 extends lh4.h {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView f395769m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.RelativeLayout f395770n;

    /* renamed from: o, reason: collision with root package name */
    public rh4.j0 f395771o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, lh4.b callback, int i17, android.util.AttributeSet attributeSet, int i18) {
        super(context, callback, i17, attributeSet, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView i19 = i();
        this.f395769m = i19;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) getRoot().findViewById(com.tencent.mm.R.id.jqf);
        relativeLayout.setContentDescription(i65.a.r(context, com.tencent.mm.R.string.f490309re) + i65.a.r(context, com.tencent.mm.R.string.f490614a00));
        relativeLayout.setOnClickListener(new rh4.l0(this));
        relativeLayout.setOnLongClickListener(new rh4.m0(relativeLayout));
        this.f395770n = relativeLayout;
        ((android.view.ViewGroup) getRoot().findViewById(com.tencent.mm.R.id.cg7)).addView(i19, 0, new android.widget.FrameLayout.LayoutParams(-1, -2));
        i19.setId(com.tencent.mm.R.id.f487233nz1);
        relativeLayout.setAccessibilityTraversalBefore(i19.getId());
        j();
    }

    public static final java.lang.String k(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            sb6.append(((cl1.n0) it.next()).f42888a.f76365h + ',');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // lh4.h
    public void c() {
        n();
        this.f395769m.m1();
    }

    @Override // lh4.h
    public void d() {
        android.widget.TextView title = getTitle();
        if (title != null) {
            title.setText(com.tencent.mm.R.string.f490317rm);
        }
        android.widget.TextView title2 = getTitle();
        android.view.ViewGroup.LayoutParams layoutParams = title2 != null ? title2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7);
            getTitle().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // lh4.h
    public java.lang.String f() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490317rm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // lh4.h
    public boolean g(int i17) {
        return true;
    }

    public final android.widget.RelativeLayout getMoreView() {
        return this.f395770n;
    }

    public final com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView getRecyclerView() {
        return this.f395769m;
    }

    public final int getShowCount() {
        return this.f395769m.getShowCount();
    }

    public final int getShowLines() {
        return this.f395769m.getShowLines();
    }

    public final java.util.List<cl1.n0> getShowList() {
        return this.f395769m.getShowList();
    }

    public final int getShowMaxCount() {
        return this.f395769m.getMaxCount();
    }

    public final rh4.j0 getWeAppCallback() {
        return this.f395771o;
    }

    public com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView i() {
        return new com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView(getContext());
    }

    public final void j() {
        android.view.ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        getContainerView().setLayoutParams(marginLayoutParams);
        this.f395769m.setLineGap(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479648bn));
    }

    public void l() {
        rh4.j0 j0Var = this.f395771o;
        if (j0Var != null) {
            ((rh4.k0) j0Var).g();
        }
    }

    public void m(float f17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) getCallback();
        taskBarView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onWeAppMarginUpdate margin: %f", java.lang.Float.valueOf(f17));
        int i17 = (int) f17;
        rh4.n0 n0Var = taskBarView.f172531k2;
        if (n0Var != null) {
            n0Var.o(i17);
        }
        rh4.o oVar = taskBarView.f172532l2;
        if (oVar != null) {
            oVar.o(i17);
        }
        rh4.m mVar = taskBarView.f172533m2;
        if (mVar != null) {
            mVar.o(i17);
        }
        ph4.e eVar = taskBarView.f172534n2;
        if (eVar != null && (textView2 = eVar.f318713g) != null) {
            com.tencent.mm.ui.kk.e(textView2, i17);
        }
        oh4.j jVar = taskBarView.f172535o2;
        if (jVar == null || (textView = jVar.f318713g) == null) {
            return;
        }
        com.tencent.mm.ui.kk.e(textView, i17);
    }

    public void n() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395769m;
        int i17 = taskBarSectionWeAppRecyclerView.getDataList().size() > taskBarSectionWeAppRecyclerView.getMaxCount() ? 0 : 4;
        android.widget.RelativeLayout relativeLayout = this.f395770n;
        relativeLayout.setVisibility(i17);
        if (relativeLayout.getVisibility() != 4 || (imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jr6)) == null) {
            return;
        }
        imageView.setImageDrawable(null);
    }

    public void o(int i17) {
        android.widget.TextView textView = this.f318713g;
        if (textView != null) {
            com.tencent.mm.ui.kk.e(textView, i17);
        }
        android.widget.RelativeLayout relativeLayout = this.f395770n;
        if (relativeLayout == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = i17;
    }

    public final void setDataList(java.util.List<? extends cl1.n0> list) {
        this.f395769m.setDataList(list);
    }

    public final void setWeAppCallback(rh4.j0 j0Var) {
        if (j0Var != null) {
            rh4.k0 k0Var = new rh4.k0(this, j0Var);
            this.f395771o = k0Var;
            this.f395769m.setWeAppCallback(k0Var);
        }
    }
}
