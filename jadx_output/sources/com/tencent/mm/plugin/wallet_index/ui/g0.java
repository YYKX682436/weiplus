package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class g0 implements com.tencent.kinda.gen.UseCaseCallback {
    public g0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI) {
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        int i17 = iTransmitKvData.getInt("refund_way");
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        if (i17 == com.tencent.kinda.gen.KHbRefundWayType.LQ.ordinal()) {
            longValue = (longValue | 1) & (-3);
        } else if (i17 == com.tencent.kinda.gen.KHbRefundWayType.ORIGIN.ordinal()) {
            longValue = (longValue & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(longValue));
        r45.oo4 oo4Var = new r45.oo4();
        if ((longValue & 1) != 0) {
            oo4Var.f382396d = 1L;
            oo4Var.f382397e = 2L;
        } else if ((longValue & 2) != 0) {
            oo4Var.f382396d = 2L;
            oo4Var.f382397e = 1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "UseCaseCallback doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(longValue), java.lang.Long.toBinaryString(oo4Var.f382396d), java.lang.Long.toBinaryString(oo4Var.f382397e));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
    }
}
