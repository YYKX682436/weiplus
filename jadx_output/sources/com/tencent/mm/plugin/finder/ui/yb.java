package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f130049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f130050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ac f130051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f130052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f130053h;

    public yb(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI, com.tencent.mm.plugin.finder.ui.ac acVar, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f130049d = h0Var;
        this.f130050e = finderPostAtUI;
        this.f130051f = acVar;
        this.f130052g = k3Var;
        this.f130053h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.b2 b2Var = (ya2.b2) this.f130049d.f310123d;
        boolean z17 = (b2Var == null || (b2Var.field_user_flag & 4) == 0) ? false : true;
        int i17 = this.f130053h;
        androidx.recyclerview.widget.k3 k3Var = this.f130052g;
        com.tencent.mm.plugin.finder.ui.ac acVar = this.f130051f;
        if (z17) {
            com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f130050e;
            if (finderPostAtUI.A == 2) {
                java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
                if (a17 == null) {
                    a17 = "";
                }
                ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(finderPostAtUI.getContext(), "wxid_wi_1d142z0zdj03", 5, a17, new com.tencent.mm.plugin.finder.ui.xb(acVar, k3Var, i17, finderPostAtUI));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        acVar.x(k3Var, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
