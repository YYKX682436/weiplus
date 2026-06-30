package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190984d;

    public q(com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190984d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/otherway/BottomSheetOpenWayEnhance$showMoreOpenWay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f190984d.f191007h;
        if (z2Var != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/otherway/BottomSheetOpenWayEnhance$showMoreOpenWay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
