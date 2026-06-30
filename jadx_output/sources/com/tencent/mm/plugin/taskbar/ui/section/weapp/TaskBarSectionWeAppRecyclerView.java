package com.tencent.mm.plugin.taskbar.ui.section.weapp;

/* loaded from: classes8.dex */
public class TaskBarSectionWeAppRecyclerView extends com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView {

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f172709t2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    public java.util.List f172710e2;

    /* renamed from: f2, reason: collision with root package name */
    public final java.util.List f172711f2;

    /* renamed from: g2, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f172712g2;

    /* renamed from: h2, reason: collision with root package name */
    public rh4.b0 f172713h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f172714i2;

    /* renamed from: j2, reason: collision with root package name */
    public rh4.j0 f172715j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f172716k2;

    /* renamed from: l2, reason: collision with root package name */
    public android.widget.Toast f172717l2;

    /* renamed from: m2, reason: collision with root package name */
    public cl1.m0 f172718m2;

    /* renamed from: n2, reason: collision with root package name */
    public int f172719n2;

    /* renamed from: o2, reason: collision with root package name */
    public int f172720o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f172721p2;

    /* renamed from: q2, reason: collision with root package name */
    public int f172722q2;

    /* renamed from: r2, reason: collision with root package name */
    public final cl1.k0 f172723r2;

    /* renamed from: s2, reason: collision with root package name */
    public final cl1.l0 f172724s2;

    public TaskBarSectionWeAppRecyclerView(android.content.Context context) {
        super(context);
        this.f172710e2 = new java.util.ArrayList();
        this.f172711f2 = new java.util.ArrayList();
        this.f172712g2 = null;
        this.f172714i2 = false;
        this.f172716k2 = 0;
        this.f172719n2 = 1;
        this.f172720o2 = -1;
        this.f172721p2 = -1;
        this.f172722q2 = 0;
        this.f172723r2 = new rh4.e0(this);
        this.f172724s2 = new rh4.f0(this);
        j1(context);
    }

    private void j1(android.content.Context context) {
        setLayoutManager(new rh4.d0(this, context, 4, 1, false));
        rh4.i0 i0Var = new rh4.i0(this);
        this.f172712g2 = i0Var;
        setAdapter(i0Var);
        k1();
        v1(context, i65.a.B(getContext()));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i1();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean g1(cl1.n0 n0Var) {
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        com.tencent.mm.plugin.appbrand.widget.recent.h a17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = n0Var.f42888a;
        if (a17 == null || localUsageInfo == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStarImpl %s", localUsageInfo.f76365h);
        int i17 = n0Var.f42889b;
        int i18 = localUsageInfo.f76363f;
        java.lang.String str = localUsageInfo.f76361d;
        int ce6 = i17 == 7 ? a17.ce(str, i18, false) : a17.ce(str, i18, true);
        if (ce6 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob add ok");
            u1(true);
        } else if (ce6 == -2) {
            com.tencent.mm.ui.widget.dialog.j0 y17 = db5.e1.y(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f490102ky, java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).y7())), "", getContext().getResources().getString(com.tencent.mm.R.string.f490507x1), null);
            if (y17 != null) {
                y17.o(true);
                y17.setCanceledOnTouchOutside(false);
                y17.show();
            }
        } else if (ce6 == -3) {
            com.tencent.mm.ui.widget.dialog.j0 y18 = db5.e1.y(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f490038j6), "", getContext().getResources().getString(com.tencent.mm.R.string.f490507x1), null);
            if (y18 != null) {
                y18.o(true);
                y18.setCanceledOnTouchOutside(false);
                y18.show();
            }
        } else {
            dp.a.makeText(getContext(), getContext().getString(com.tencent.mm.R.string.f490082ke), 0).show();
        }
        return ce6 == 0;
    }

    public java.util.List<cl1.n0> getDataList() {
        return this.f172710e2;
    }

    public int getMaxCount() {
        return (this.f172715j2.o() && ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).Bi() == 1) ? 4 : 8;
    }

    public int getShowCount() {
        return this.f172711f2.size();
    }

    public int getShowDataSize() {
        return this.f172711f2.size();
    }

    public int getShowLines() {
        return this.f172719n2;
    }

    public java.util.List<cl1.n0> getShowList() {
        return this.f172711f2;
    }

    public void h1(int i17, cl1.n0 n0Var) {
        this.f172715j2.l(n0Var, i17);
    }

    public void i1() {
        if (this.f172718m2 == null) {
            android.view.View rootView = getRootView();
            if (rootView == null) {
                return;
            } else {
                this.f172718m2 = (cl1.m0) rootView.findViewById(com.tencent.mm.R.id.d4h);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "configDragFeatureView");
        this.f172718m2.setRecyclerView(this);
        this.f172718m2.setList(this.f172711f2);
        this.f172718m2.setAppBrandDragCallback(this.f172723r2);
        this.f172718m2.setViewWidth(this.f172716k2);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_reorder, 1) == 1) {
            this.f172718m2.setCanMyWeAppMove(true);
        } else {
            this.f172718m2.setCanMyWeAppMove(false);
        }
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var == null || !j0Var.o()) {
            ((com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView) this.f172718m2).e(false);
        } else {
            ((com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView) this.f172718m2).e(true);
        }
        this.f172718m2.setShouldDoDeleteAnimation(false);
        this.f172718m2.setSectionCallback(this.f172724s2);
        this.f91124c2 = (com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView) this.f172718m2;
    }

    public void k1() {
        this.f172713h2 = new rh4.b0();
        setItemAnimator(this.f172713h2);
    }

    public final boolean l1() {
        return ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() != 1;
    }

    public void m1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "notifyDataChanged");
        getAdapter().notifyDataSetChanged();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
        a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void n1(androidx.recyclerview.widget.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.p(k3Var, view, n0Var, i17);
        }
    }

    public void o1(int i17, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "onDragStateChange %d %b %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (l1()) {
            return;
        }
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var == null || !j0Var.o()) {
            rh4.j0 j0Var2 = this.f172715j2;
            if (j0Var2 != null) {
                j0Var2.q(z17);
            }
            if (!z17 && !z18 && this.f172714i2) {
                cl1.n0 n0Var = (cl1.n0) ((java.util.ArrayList) this.f172711f2).get(i17);
                boolean g17 = g1(n0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStar %d， add:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(g17));
                if (g17) {
                    this.f172715j2.e(i17, new cl1.n0(n0Var));
                }
            }
            this.f172714i2 = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(false);
        android.view.View rootView = getRootView();
        for (android.view.View view = (android.view.View) getParent(); view != rootView && (view instanceof android.view.ViewGroup); view = (android.view.View) view.getParent()) {
            ((android.view.ViewGroup) view).setClipChildren(false);
            if (view instanceof androidx.recyclerview.widget.RecyclerView) {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getMeasuredWidth() != this.f172716k2) {
            int measuredWidth = getMeasuredWidth();
            this.f172716k2 = measuredWidth;
            cl1.m0 m0Var = this.f172718m2;
            if (m0Var != null) {
                m0Var.setViewWidth(measuredWidth);
            }
            this.f172722q2 = 0;
            if (!E0() && getScrollState() == 0) {
                v1(getContext(), this.f172716k2);
                return;
            }
            int i19 = this.f172722q2;
            if (i19 > 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "update item offset delay count reach max");
            } else {
                this.f172722q2 = i19 + 1;
                postDelayed(new rh4.c0$$a(this), 300L);
            }
        }
    }

    public void p1(float f17, float f18) {
        if (l1()) {
            return;
        }
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            this.f172714i2 = j0Var.a(f17, f18);
        }
        if (this.f172715j2.o()) {
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = (com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView) this.f172718m2;
            this.f172714i2 = appBrandDesktopDragView.c(f17, f18) && appBrandDesktopDragView.d(f17);
        }
    }

    public void q1() {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.g();
        }
    }

    public void r1(cl1.a aVar) {
        this.f172715j2.c((cl1.n0) this.f172710e2.get(aVar.getAdapterPosition()), false);
    }

    public void s1(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "remove item %d", java.lang.Integer.valueOf(i17));
        u1(false);
        java.util.List list = this.f172711f2;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.remove(i17);
        cl1.n0 n0Var = (cl1.n0) this.f172710e2.remove(i17);
        if (this.f172710e2.size() > arrayList.size()) {
            arrayList.add((cl1.n0) this.f172710e2.get(arrayList.size()));
        }
        this.f172712g2.notifyItemRemoved(i17);
        if (this.f172710e2.size() >= getMaxCount()) {
            this.f172712g2.notifyItemInserted(getMaxCount() - 1);
        }
        androidx.recyclerview.widget.f2 f2Var = this.f172712g2;
        f2Var.notifyItemRangeChanged(0, f2Var.getItemCount(), java.lang.Boolean.TRUE);
        h1(i17, n0Var);
        this.f172719n2 = ((java.util.ArrayList) list).size() > 3 ? 2 : 1;
    }

    public void setDataList(java.util.List<cl1.n0> list) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f172710e2.size());
        java.util.List list2 = this.f172711f2;
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setDateList now:%d showing:%d new:%d", valueOf, java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(list.size()));
        this.f172710e2 = new java.util.ArrayList(list);
        arrayList.clear();
        this.f172719n2 = ((java.util.ArrayList) list2).size() > 3 ? 2 : 1;
        int min = java.lang.Math.min(this.f172710e2.size(), getMaxCount());
        for (int i17 = 0; i17 < min; i17++) {
            arrayList.add((cl1.n0) this.f172710e2.get(i17));
        }
    }

    public void setItemTitleColor(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setItemTitleColor, itemTitleColor: %d", java.lang.Integer.valueOf(i17));
        this.f172721p2 = i17;
    }

    public void setLineGap(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setLineGap, lineGap: %d", java.lang.Integer.valueOf(i17));
        this.f172720o2 = i17;
        v1(getContext(), this.f172716k2);
    }

    public void setWeAppCallback(rh4.j0 j0Var) {
        this.f172715j2 = j0Var;
        v1(getContext(), this.f172716k2);
    }

    public boolean t1() {
        return true;
    }

    public final void u1(boolean z17) {
        android.widget.Toast toast = this.f172717l2;
        if (toast != null) {
            toast.cancel();
        }
        this.f172717l2 = dp.a.makeText(getContext(), "", 0);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488379rq, null);
        this.f172717l2.setGravity(17, 0, 0);
        this.f172717l2.setView(inflate);
        ((android.widget.TextView) this.f172717l2.getView().findViewById(com.tencent.mm.R.id.f487357oe3)).setText(z17 ? com.tencent.mm.R.string.f490330rz : com.tencent.mm.R.string.f490107l3);
        this.f172717l2.show();
    }

    public final void v1(android.content.Context context, int i17) {
        int i18 = this.f172720o2;
        if (-1 == i18) {
            i18 = i65.a.f(context, com.tencent.mm.R.dimen.f479738dv);
        }
        int i19 = i18;
        ft.v3 v3Var = (ft.v3) i95.n0.c(ft.v3.class);
        float f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479714d7);
        ((et.g) v3Var).getClass();
        float a17 = el1.c.f253739a.a(this, f17, i17, i19, 0, 0);
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.j(a17);
        }
    }

    public TaskBarSectionWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172710e2 = new java.util.ArrayList();
        this.f172711f2 = new java.util.ArrayList();
        this.f172712g2 = null;
        this.f172714i2 = false;
        this.f172716k2 = 0;
        this.f172719n2 = 1;
        this.f172720o2 = -1;
        this.f172721p2 = -1;
        this.f172722q2 = 0;
        this.f172723r2 = new rh4.e0(this);
        this.f172724s2 = new rh4.f0(this);
        j1(context);
    }

    public TaskBarSectionWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172710e2 = new java.util.ArrayList();
        this.f172711f2 = new java.util.ArrayList();
        this.f172712g2 = null;
        this.f172714i2 = false;
        this.f172716k2 = 0;
        this.f172719n2 = 1;
        this.f172720o2 = -1;
        this.f172721p2 = -1;
        this.f172722q2 = 0;
        this.f172723r2 = new rh4.e0(this);
        this.f172724s2 = new rh4.f0(this);
        j1(context);
    }
}
