package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes10.dex */
public final class y5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a6 f117545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f117547f;

    public y5(com.tencent.mm.plugin.finder.live.viewmodel.a6 a6Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f117545d = a6Var;
        this.f117546e = c0Var;
        this.f117547f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327946f2, this.f117545d.S6("168"), null, "168", null, null, false, 116, null);
        this.f117546e.f310112d = true;
        this.f117547f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
