package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f143093d;

    public z1(com.tencent.mm.plugin.ipcall.ui.f2 f2Var) {
        this.f143093d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f143093d;
        int i17 = f2Var.f142820v;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 != 3) {
            java.lang.String trim = f2Var.A.getText().toString().trim();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                r45.m57 m57Var = new r45.m57();
                m57Var.f380157d = 0;
                m57Var.f380158e = trim;
                linkedList.add(m57Var);
            }
            java.util.ArrayList arrayList2 = f2Var.F;
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.ipcall.ui.e2 e2Var = (com.tencent.mm.plugin.ipcall.ui.e2) it.next();
                    if (e2Var.f142792c) {
                        r45.m57 m57Var2 = new r45.m57();
                        try {
                            m57Var2.f380157d = com.tencent.mm.sdk.platformtools.t8.P(e2Var.f142790a, 0);
                            linkedList.add(m57Var2);
                        } catch (java.lang.NumberFormatException unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackDialog", "getFeedbackList error, id = " + e2Var.f142790a);
                        }
                    }
                }
            }
        }
        c01.d9.e().g(new p83.m(f2Var.f142806e, i17, linkedList));
        if (f2Var.f142820v == 3) {
            f2Var.f(2);
        } else {
            f2Var.hide();
            f2Var.G.postDelayed(new com.tencent.mm.plugin.ipcall.ui.d2(f2Var), 2000L);
            com.tencent.mm.ui.widget.snackbar.j.c(f2Var.f142809h.getString(com.tencent.mm.R.string.g5_), null, f2Var.f142808g, null, null);
            int i18 = f2Var.f142820v;
            q83.c.a(1, -1, i18, f2Var.e(i18), 0, -1, -1, f2Var.f142806e, f2Var.f142807f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
