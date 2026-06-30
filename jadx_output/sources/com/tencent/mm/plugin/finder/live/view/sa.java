package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ud5 f116680e;

    public sa(com.tencent.mm.plugin.finder.live.view.gb gbVar, r45.ud5 ud5Var) {
        this.f116679d = gbVar;
        this.f116680e = ud5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ud5 ud5Var = this.f116680e;
        if (ud5Var == null || (str = ud5Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.view.gb.e0(this.f116679d, str);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
