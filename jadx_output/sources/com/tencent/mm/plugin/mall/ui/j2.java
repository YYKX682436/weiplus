package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class j2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.k2 f148417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.plugin.mall.ui.k2 k2Var) {
        super(false);
        this.f148417d = k2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(5);
        com.tencent.mm.plugin.mall.ui.k2 k2Var = this.f148417d;
        k2Var.f148429h.U.alive();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 1);
        j45.l.j(k2Var.f148429h.getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent, null);
        com.tencent.mm.wallet_core.model.n1.d(9, 0);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11850, 5, 0);
        g0Var.d(14419, k2Var.f148429h.f148259i, 1);
    }
}
