package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class lc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f132593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f132594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.fc f132596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f132597h;

    public lc(r45.xn1 xn1Var, db5.t4 t4Var, android.view.View view, com.tencent.mm.plugin.finder.view.fc fcVar, dk2.zf zfVar) {
        this.f132593d = xn1Var;
        this.f132594e = t4Var;
        this.f132595f = view;
        this.f132596g = fcVar;
        this.f132597h = zfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showFinderWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.oc ocVar = com.tencent.mm.plugin.finder.view.oc.f132781a;
        ocVar.d(2, this.f132593d.getInteger(7));
        this.f132594e.onMMMenuItemSelected(new db5.h4(this.f132595f.getContext(), 163, 0), 0);
        ocVar.c(com.tencent.mm.plugin.finder.view.ec.f131997f, this.f132596g, this.f132597h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showFinderWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
