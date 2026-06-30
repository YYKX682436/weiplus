package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public abstract class b {
    public static com.tencent.mm.plugin.game.model.silent_download.a a() {
        boolean z17;
        android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.tencent.mm.plugin.game.model.silent_download.a aVar = new com.tencent.mm.plugin.game.model.silent_download.a();
        if (registerReceiver != null) {
            try {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z17 = false;
                    aVar.f140442a = z17;
                    aVar.f140443b = registerReceiver.getIntExtra(ya.b.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
                }
                z17 = true;
                aVar.f140442a = z17;
                aVar.f140443b = registerReceiver.getIntExtra(ya.b.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BatteryHelper", "err:%s", e17.getMessage());
            }
        }
        return aVar;
    }
}
