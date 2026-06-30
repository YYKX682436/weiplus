package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class i4 extends com.tencent.mm.plugin.luckymoney.model.d1 {
    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public java.lang.String b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLiveConfigManager", "[getConfigFromCache]");
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_LIVECONFIG_STRING_SYNC, null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public java.lang.String d() {
        return "MicroMsg.LuckyMoneyLiveConfigManager";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyLiveConfigManager", "[saveConfigToCache]");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_LIVECONFIG_STRING_SYNC, str);
    }
}
