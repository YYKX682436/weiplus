package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class xp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.zp f133361d;

    public xp(com.tencent.mm.plugin.finder.view.zp zpVar) {
        this.f133361d = zpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$createSelectView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f133361d.f133486c;
        if (y1Var != null) {
            y1Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/LiveChargeBottomSheet$createSelectView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
