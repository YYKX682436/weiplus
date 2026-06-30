package com.tencent.mm.plugin.updater.model;

/* loaded from: classes11.dex */
public class SuicideListener extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("Tinker.TinkerResponseProcessor", "do suicide");
        k35.o oVar = k35.p.f303943a;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((bt.b1) oVar).getClass();
        com.tencent.mm.ui.vb.c(context2);
    }
}
