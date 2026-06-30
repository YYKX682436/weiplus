package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.l6 f142885d;

    public j6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
        this.f142885d = l6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/TalkUIController$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142885d;
        l6Var.f142926y.j(0, 0);
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(42);
        l6Var.f142924w.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/TalkUIController$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
