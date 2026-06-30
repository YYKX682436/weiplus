package com.tencent.mm.plugin.game.commlib;

@j95.b
/* loaded from: classes8.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f139393d = new com.tencent.mm.plugin.game.commlib.o(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        this.f139393d.alive();
        if (com.tencent.mm.plugin.game.commlib.util.c.f139401b == null) {
            com.tencent.mm.plugin.game.commlib.util.c.f139401b = new com.tencent.mm.plugin.game.commlib.util.b(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.plugin.game.commlib.util.c.f139401b, intentFilter);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (com.tencent.mm.plugin.game.commlib.util.i.f139409a != null) {
            synchronized (com.tencent.mm.plugin.game.commlib.util.i.f139410b) {
                try {
                    if (com.tencent.mm.plugin.game.commlib.util.i.f139409a != null) {
                        ((java.util.concurrent.ConcurrentHashMap) lm5.i.f319609a).remove("GameCommLib#WorkThread".toUpperCase(java.util.Locale.ENGLISH));
                        com.tencent.mm.plugin.game.commlib.util.i.f139409a.quit();
                        com.tencent.mm.plugin.game.commlib.util.i.f139409a = null;
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
        }
        this.f139393d.dead();
        com.tencent.mm.plugin.game.commlib.util.b bVar = com.tencent.mm.plugin.game.commlib.util.c.f139401b;
        if (bVar != null) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(bVar);
        }
        com.tencent.mm.plugin.game.commlib.util.c.f139401b = null;
    }
}
