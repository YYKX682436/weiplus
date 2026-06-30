package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.z0 f162351d;

    public x0(com.tencent.mm.plugin.shake.ui.z0 z0Var) {
        this.f162351d = z0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 2;
        h34.i0 Ui = c34.h0.Ui();
        Ui.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = Ui.f278543d.B("SELECT * FROM shaketvhistory ORDER BY createtime DESC", null);
        if (B != null) {
            while (B.moveToNext()) {
                h34.h0 h0Var = new h34.h0();
                h0Var.convertFrom(B);
                arrayList.add(h0Var);
            }
            B.close();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb6.append(((h34.h0) it.next()).field_username);
            sb6.append("|");
        }
        objArr[1] = sb6.toString();
        g0Var.d(12662, objArr);
        c34.h0.Ui().f278543d.delete("shaketvhistory", null, null);
        c01.d9.e().g(new h34.h(2, null));
        com.tencent.mm.plugin.shake.ui.z0 z0Var = this.f162351d;
        z0Var.f162360d.f162219d.q();
        z0Var.f162360d.enableOptionMenu(false);
    }
}
