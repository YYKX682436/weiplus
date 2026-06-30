package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nq f119107d;

    public mq(com.tencent.mm.plugin.finder.live.widget.nq nqVar) {
        this.f119107d = nqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cl0.g gVar = new cl0.g();
        gVar.o("type", 12);
        gVar.h("game_id", null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
        com.tencent.mm.plugin.finder.live.widget.nq nqVar = this.f119107d;
        java.lang.String str = nqVar.M;
        nqVar.getClass();
        i95.m c18 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c18, nqVar.f118183e, str, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 1, false, false, 1, false, false, 0, false, false, false, "#FFFFFF", false, 0, false, 2, false, false, false, 7831247, null), 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostGameChoosePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
