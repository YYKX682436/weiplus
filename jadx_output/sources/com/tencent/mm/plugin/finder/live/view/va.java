package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class va implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j34 f116752e;

    public va(com.tencent.mm.plugin.finder.live.view.gb gbVar, r45.j34 j34Var) {
        this.f116751d = gbVar;
        this.f116752e = j34Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        r45.j34 j34Var = this.f116752e;
        if (j34Var == null || (str = j34Var.getString(0)) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116751d;
        com.tencent.mm.plugin.finder.live.view.gb.e0(gbVar, str);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = gbVar.R;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f19598a, eVar, z17 ? 6 : 4, 8, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
