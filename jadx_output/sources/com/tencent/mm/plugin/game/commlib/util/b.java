package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public class b extends android.content.BroadcastReceiver {
    public b(com.tencent.mm.plugin.game.commlib.util.a aVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
            com.tencent.mm.plugin.game.commlib.util.c.f139400a = false;
        } else if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
            com.tencent.mm.plugin.game.commlib.util.c.f139400a = true;
        }
    }
}
