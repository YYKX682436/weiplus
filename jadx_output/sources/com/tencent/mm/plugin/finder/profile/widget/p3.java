package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124672f;

    public p3(com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var, int i17) {
        this.f124670d = e4Var;
        this.f124671e = n3Var;
        this.f124672f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.widget.n3 n3Var = this.f124671e;
        int i17 = this.f124672f;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124670d;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = e4Var.f124532h;
        r45.c32 c32Var = s4Var.f124765s;
        boolean z17 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.getCustom(1)) == null) ? false : fw4Var.getBoolean(2);
        c0Var.f310112d = z17;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(e4Var.f124530f, 1, true);
            k0Var.X1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.widget.z3(e4Var);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.widget.a4(c0Var, e4Var, e4Var.f124532h, n3Var, i17);
            k0Var.v();
        } else {
            com.tencent.mm.plugin.finder.profile.widget.e4.x(c0Var, e4Var, s4Var, n3Var, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
