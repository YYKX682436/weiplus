package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f116805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c52 f116806f;

    public xa(com.tencent.mm.plugin.finder.live.view.gb gbVar, r45.a52 a52Var, r45.c52 c52Var) {
        this.f116804d = gbVar;
        this.f116805e = a52Var;
        this.f116806f = c52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116804d;
        wt2.a aVar = gbVar.R;
        if (aVar != null) {
            wt2.a.m4(aVar, this.f116805e, null, 2, null);
        }
        wt2.a aVar2 = gbVar.R;
        if (aVar2 != null && (q57 = aVar2.q5()) != null) {
            bf2.c cVar = bf2.c.f19598a;
            java.lang.String string = this.f116806f.getString(3);
            if (string == null) {
                string = "";
            }
            bf2.c.b(cVar, q57, 3, 3, string, 0, 16, null);
        }
        gbVar.s(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
