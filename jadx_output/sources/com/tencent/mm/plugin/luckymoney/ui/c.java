package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class c implements com.tencent.kinda.gen.KUserService {
    @Override // com.tencent.kinda.gen.KUserService
    public java.lang.String city() {
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            h67Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            return h67Var.f375886g;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e17.getLocalizedMessage());
            return "";
        }
    }

    @Override // com.tencent.kinda.gen.KUserService
    public long localBalance() {
        return ((java.lang.Long) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
    }

    @Override // com.tencent.kinda.gen.KUserService
    public java.lang.String province() {
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            h67Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            return h67Var.f375885f;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e17.getLocalizedMessage());
            return "";
        }
    }

    @Override // com.tencent.kinda.gen.KUserService
    public void updateBalance(long j17) {
        com.tencent.mars.xlog.Log.i("KindaUserInfoServiceImpl", "wallet balance: %s", java.lang.Long.valueOf(j17));
        at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
        r17.field_wallet_balance = j17;
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_BALANCE_LONG_SYNC, java.lang.Long.valueOf(r17.field_wallet_balance));
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().H(r17);
    }

    @Override // com.tencent.kinda.gen.KUserService
    public void updateLqtBalance(long j17) {
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.kinda.gen.KUserService
    public void updateUserInfo(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("KindaUserInfoService", "updateUserInfo");
    }
}
