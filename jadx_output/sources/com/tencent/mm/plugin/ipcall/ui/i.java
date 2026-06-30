package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142854d;

    public i(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142854d = oVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142854d;
        if (oVar.f142966r) {
            oVar.f142960l = "+";
            oVar.f142950b.setText("+");
        } else {
            oVar.f142953e.setText("");
            oVar.f142961m = "";
            oVar.e("", -1);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
