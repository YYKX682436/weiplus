package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f118205e;

    public e10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, r45.fr1 fr1Var) {
        this.f118204d = m10Var;
        this.f118205e = fr1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.fr1 fr1Var = this.f118205e;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f118204d;
        m10Var.b(new com.tencent.mm.plugin.finder.live.widget.d10(fr1Var, m10Var));
        m10Var.r();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
