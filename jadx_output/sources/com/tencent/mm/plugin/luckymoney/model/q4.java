package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r4 f145563d;

    public q4(com.tencent.mm.plugin.luckymoney.model.r4 r4Var) {
        this.f145563d = r4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.luckymoney.model.r4 r4Var = this.f145563d;
        if (r4Var.f145579h == null || !r4Var.f145577f.isEmpty()) {
            return;
        }
        r4Var.f145579h.dismiss();
        java.util.Iterator it = r4Var.f145578g.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var);
        }
        r4Var.f145578g.clear();
    }
}
