package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.i f148344d;

    public c(com.tencent.mm.plugin.mall.ui.i iVar) {
        this.f148344d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/FunctionListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mall.ui.i iVar = this.f148344d;
        iVar.f148397m = !iVar.f148397m;
        iVar.f148401q = true;
        iVar.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
