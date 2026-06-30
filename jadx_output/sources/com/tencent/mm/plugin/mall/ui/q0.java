package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q67 f148469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 f148470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2, r45.q67 q67Var) {
        super(false);
        this.f148470e = mallIndexOSUIv2;
        this.f148469d = q67Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        java.lang.String b17 = x51.j1.b(this.f148469d.f383717f);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2 = this.f148470e;
        g0Var.d(13867, b17, java.lang.Integer.valueOf(mallIndexOSUIv2.f148264q));
        if (b17.equals("wxpay://bizmall/hk_offlinepay")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexOSUIv2", "click native hk offlinepay url");
            ((h45.q) i95.n0.c(h45.q.class)).startHKOfflinePrePay(mallIndexOSUIv2.getContext(), 1);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", b17);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        com.tencent.mm.wallet_core.ui.r1.T(mallIndexOSUIv2.getContext(), intent);
    }
}
