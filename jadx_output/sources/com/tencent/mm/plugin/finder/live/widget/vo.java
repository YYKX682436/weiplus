package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vo extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f120077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f120078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f120079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f120080g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(com.tencent.mm.plugin.finder.live.widget.hp hpVar, kotlin.jvm.internal.c0 c0Var, int i17, r45.xn1 xn1Var) {
        super(1);
        this.f120077d = hpVar;
        this.f120078e = c0Var;
        this.f120079f = i17;
        this.f120080g = xn1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f120077d;
        android.view.View view = hpVar.H1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1", "invoke", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget = hpVar.J1;
        if (finderLiveVisitorFinderDetailWidget != null) {
            finderLiveVisitorFinderDetailWidget.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget2 = hpVar.J1;
        r45.xn1 xn1Var = this.f120080g;
        int i17 = this.f120079f;
        if (finderLiveVisitorFinderDetailWidget2 != null) {
            finderLiveVisitorFinderDetailWidget2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.uo(hpVar, str, i17, xn1Var));
        }
        kotlin.jvm.internal.c0 c0Var = this.f120078e;
        if (!c0Var.f310112d) {
            hpVar.u0(hpVar.j0(i17), java.lang.Integer.valueOf(xn1Var.getInteger(7)), 1);
            hpVar.t0(1, hpVar.j0(i17), java.lang.Integer.valueOf(xn1Var.getInteger(7)), null);
            c0Var.f310112d = true;
        }
        return jz5.f0.f302826a;
    }
}
