package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f120398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120399e;

    public y00(com.tencent.mm.ui.widget.dialog.y1 y1Var, com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f120398d = y1Var;
        this.f120399e = m10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f120398d.q();
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120399e;
        m10Var.H = false;
        if (m10Var.C == m10Var.E) {
            m10Var.t();
        }
        m10Var.C = -1;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
