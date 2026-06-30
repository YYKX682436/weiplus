package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class p5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f142982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f142983e;

    public p5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI, android.widget.TextView textView) {
        this.f142983e = iPCallUserProfileUI;
        this.f142982d = textView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.B;
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = this.f142983e;
        iPCallUserProfileUI.getClass();
        android.view.LayoutInflater.from(iPCallUserProfileUI);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) iPCallUserProfileUI, 1, false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.plugin.ipcall.ui.q5 q5Var = new com.tencent.mm.plugin.ipcall.ui.q5(iPCallUserProfileUI);
        com.tencent.mm.plugin.ipcall.ui.r5 r5Var = new com.tencent.mm.plugin.ipcall.ui.r5(iPCallUserProfileUI, this.f142982d);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList2.clear();
        db5.g4 g4Var = new db5.g4(iPCallUserProfileUI);
        q5Var.onCreateMMMenu(g4Var);
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = q5Var;
            k0Var.f211881s = r5Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
