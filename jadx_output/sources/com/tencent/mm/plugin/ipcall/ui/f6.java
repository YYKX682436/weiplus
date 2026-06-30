package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class f6 implements android.view.View.OnClickListener {
    public f6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/TalkUIController$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.model.r.Bi().f142508i.d();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/TalkUIController$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
