package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class kj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pj f199371e;

    public kj(com.tencent.mm.ui.chatting.component.pj pjVar, com.tencent.mm.storage.f9 f9Var) {
        this.f199371e = pjVar;
        this.f199370d = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.ui.chatting.component.pj pjVar = this.f199371e;
            pjVar.getClass();
            com.tencent.mm.storage.f9 f9Var = this.f199370d;
            if (c01.id.c() - f9Var.getCreateTime() > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_transfer_revoke_timelimit, u04.d.f423477c)) {
                db5.e1.y(pjVar.f198580d.g(), pjVar.f198580d.g().getString(com.tencent.mm.R.string.b5t), "", pjVar.f198580d.s().getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.ui.chatting.component.lj(pjVar));
                return;
            }
            java.lang.String U1 = f9Var.U1();
            if (U1 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "xml is null");
                return;
            }
            ot0.q v17 = ot0.q.v(U1);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "content is null");
                return;
            }
            ot0.n nVar = (ot0.n) v17.y(ot0.n.class);
            if (nVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRevokeComponent", "piece is null");
                return;
            }
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            java.lang.String str = nVar.f348594c;
            java.lang.String x17 = pjVar.f198580d.x();
            java.lang.String str2 = v17.L0;
            ((pg0.a3) b0Var).getClass();
            com.tencent.mm.plugin.remittance.model.d dVar = new com.tencent.mm.plugin.remittance.model.d(str, x17, str2);
            yb5.d dVar2 = pjVar.f198580d;
            dVar2.W(dVar2.g(), null, pjVar.f198580d.s().getString(com.tencent.mm.R.string.b5q), true, true, new com.tencent.mm.ui.chatting.component.mj(pjVar, f9Var, dVar));
            dVar.l().q(new com.tencent.mm.ui.chatting.component.oj(pjVar, f9Var));
        }
    }
}
