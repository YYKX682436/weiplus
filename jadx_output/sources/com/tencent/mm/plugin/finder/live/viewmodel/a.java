package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b f116868d;

    public a(com.tencent.mm.plugin.finder.live.viewmodel.b bVar) {
        this.f116868d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.b bVar = this.f116868d;
        r45.xl6 xl6Var = bVar.f116915i;
        if (xl6Var != null && (string = xl6Var.getString(0)) != null) {
            pm0.z.b(xy2.b.f458155b, "AUTH_ERROR_4", false, null, null, false, false, null, 124, null);
            com.tencent.mars.xlog.Log.i(bVar.f116910d, "returnBack -4");
            com.tencent.mm.plugin.finder.assist.w7.f102656a.e(-4, string);
        }
        bVar.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
