package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class p extends android.content.BroadcastReceiver {
    public p(com.tencent.mm.plugin.game.model.silent_download.o oVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!gm0.j1.a() || gm0.m.r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
            return;
        }
        if (intent == null) {
            return;
        }
        boolean equals = "android.intent.action.BATTERY_OKAY".equals(intent.getAction());
        com.tencent.mm.plugin.game.model.silent_download.c0 c0Var = com.tencent.mm.plugin.game.model.silent_download.b0.f140446a;
        if (equals) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_OKAY, checkDownload");
            m43.c.b().a("game_silent_download", new com.tencent.mm.plugin.game.model.silent_download.x(c0Var, true));
        } else if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_LOW, pauseDownload");
            c0Var.c();
        }
    }
}
