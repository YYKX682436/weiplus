package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f145632a;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f145632a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.luckymoney.model.LuckMoneyEffectResourceMgr$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                int i17;
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = checkResUpdateCacheFileEvent;
                am.r2 r2Var = checkResUpdateCacheFileEvent2.f54053g;
                if (r2Var == null || (i17 = r2Var.f7759a) != 53) {
                    return false;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                am.r2 r2Var2 = checkResUpdateCacheFileEvent2.f54053g;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "luckyMoney resource file update, type: %s, subType: %s, filePath: %s", valueOf, java.lang.Integer.valueOf(r2Var2.f7760b), r2Var2.f7761c);
                if (com.tencent.mm.sdk.platformtools.t8.K0(r2Var2.f7761c) || !com.tencent.mm.vfs.w6.j(r2Var2.f7761c)) {
                    return false;
                }
                java.lang.String str = r2Var2.f7761c;
                int i18 = r2Var2.f7759a;
                int i19 = r2Var2.f7760b;
                com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.luckymoney.model.t0.f145632a;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckMoneyEffectResourceMgr", "start saveEffectResource %s %s %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                s75.d.b(new com.tencent.mm.plugin.luckymoney.model.s0(str, i18, i19), "LuckMoneyEffectResourceMgr_saveEffectResource");
                return false;
            }
        };
    }
}
