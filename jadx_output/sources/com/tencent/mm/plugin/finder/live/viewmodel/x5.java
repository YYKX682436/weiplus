package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes10.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a6 f117530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f117531e;

    public x5(com.tencent.mm.plugin.finder.live.viewmodel.a6 a6Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f117530d = a6Var;
        this.f117531e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327943e2, this.f117530d.S6("168"), null, "168", null, null, false, 116, null);
        this.f117531e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithNotice$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
