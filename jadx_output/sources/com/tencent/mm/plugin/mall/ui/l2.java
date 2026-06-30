package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class l2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.m2 f148440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.mall.ui.m2 m2Var) {
        super(false);
        this.f148440d = m2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.mall.ui.m2 m2Var = this.f148440d;
        if (m2Var.f148408e.getVisibility() == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25075, 2, 1);
        }
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2.o7(m2Var.f148447i);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(15);
    }
}
