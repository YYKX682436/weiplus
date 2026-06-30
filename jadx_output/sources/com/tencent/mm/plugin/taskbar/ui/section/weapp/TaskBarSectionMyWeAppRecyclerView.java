package com.tencent.mm.plugin.taskbar.ui.section.weapp;

/* loaded from: classes8.dex */
public class TaskBarSectionMyWeAppRecyclerView extends com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView {
    public TaskBarSectionMyWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public int getMaxCount() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void h1(int i17, cl1.n0 n0Var) {
        this.f172715j2.h(n0Var, i17);
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
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void q1() {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.r(2);
        }
    }

    @Override // com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView
    public void r1(cl1.a aVar) {
        rh4.j0 j0Var = this.f172715j2;
        if (j0Var != null) {
            j0Var.c(getDataList().get(aVar.getAdapterPosition()), true);
        }
    }

    public TaskBarSectionMyWeAppRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
