package com.tencent.mm.plugin.taskbar.ui.section.weapp;

/* loaded from: classes8.dex */
public class TaskBarSectionCommonUsedWeAppRecyclerView extends com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView {
    public TaskBarSectionCommonUsedWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public int getMaxCount() {
        ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.tencent.mm.plugin.appbrand.appusage.j0.f76467a;
        if (i17 == 0) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            i17 = b17 != null ? b17.f369757e : 0;
            com.tencent.mm.plugin.appbrand.appusage.j0.f76467a = i17;
        }
        return i17 == 1 ? 4 : 8;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void h1(int i17, cl1.n0 n0Var) {
        this.f172715j2.f(n0Var, i17);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void i1() {
        super.i1();
        ((com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView) this.f172718m2).e(true);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void k1() {
        setItemAnimator(new rh4.k());
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void n1(androidx.recyclerview.widget.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.p(k3Var, view, n0Var, i17);
        }
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void o1(int i17, boolean z17, boolean z18) {
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void p1(float f17, float f18) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = (com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView) this.f172718m2;
        this.f172714i2 = appBrandDesktopDragView.c(f17, f18) && appBrandDesktopDragView.d(f17);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void q1() {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.r(7);
        }
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public boolean t1() {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            return j0Var.m();
        }
        return true;
    }

    public TaskBarSectionCommonUsedWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
