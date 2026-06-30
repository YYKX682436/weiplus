package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class nc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.fc f132707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f132708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f132709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f132710g;

    public nc(com.tencent.mm.plugin.finder.view.fc fcVar, dk2.zf zfVar, db5.t4 t4Var, db5.h4 h4Var) {
        this.f132707d = fcVar;
        this.f132708e = zfVar;
        this.f132709f = t4Var;
        this.f132710g = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showTopMemuItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.oc.f132781a.c(com.tencent.mm.plugin.finder.view.ec.f131997f, this.f132707d, this.f132708e);
        this.f132709f.onMMMenuItemSelected(this.f132710g, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderIOSFlowWindowHelper$showTopMemuItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
