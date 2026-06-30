package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class i5 extends com.tencent.mm.plugin.luckymoney.model.d1 {
    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public java.lang.String b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUnionConfigManager", "[getConfigFromCache]");
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_UNION_CONFIG_STRING_SYNC, null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public java.lang.String d() {
        return "MicroMsg.LuckyMoneyUnionConfigManager";
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.d1
    public void h(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUnionConfigManager", "[saveConfigToCache]");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_UNION_CONFIG_STRING_SYNC, str);
    }
}
