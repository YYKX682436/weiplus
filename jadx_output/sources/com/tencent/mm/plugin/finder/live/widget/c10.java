package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f117936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f117938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f117939g;

    public c10(com.tencent.mm.plugin.finder.live.widget.m10 m10Var, int i17, r45.fr1 fr1Var, r45.xq1 xq1Var) {
        this.f117936d = m10Var;
        this.f117937e = i17;
        this.f117938f = fr1Var;
        this.f117939g = xq1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.fr1 fr1Var = this.f117938f;
        r45.xq1 xq1Var = this.f117939g;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f117936d;
        m10Var.b(new com.tencent.mm.plugin.finder.live.widget.b10(m10Var, this.f117937e, fr1Var, xq1Var));
        m10Var.r();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$setupBottomSheetForNormalGameTeam$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
