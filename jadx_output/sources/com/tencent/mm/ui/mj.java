package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class mj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.nj f209146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.hj f209147e;

    public mj(com.tencent.mm.ui.nj njVar, com.tencent.mm.ui.hj hjVar) {
        this.f209146d = njVar;
        this.f209147e = hjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/TipUseDuplicateGroupItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f209146d.f209427e;
        if (lVar != null) {
            lVar.invoke(this.f209147e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/TipUseDuplicateGroupItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
