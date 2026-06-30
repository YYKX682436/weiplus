package com.tencent.mm.plugin.lite;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/LiteAppTaskPreloadReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class LiteAppTaskPreloadReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaLiteAppTaskPreloadReceiver", "onReceive NULL intent.");
            return;
        }
        com.tencent.mm.plugin.lite.w.initLib();
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        oVar.b(6, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        if (intent.hasExtra("task") && intent.hasExtra("appId") && kotlin.jvm.internal.o.b(intent.getStringExtra("task"), "prelogin")) {
            java.lang.String stringExtra = intent.getStringExtra("appId");
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(stringExtra, null);
            if (y17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaLiteAppTaskPreloadReceiver", stringExtra.concat(" is not existed"));
            } else {
                m93.i.INSTANCE.a(com.tencent.mm.plugin.lite.LiteAppCenter.getAuthUrl(y17.path, y17.appId, y17.signatureKey, false), true, 0, new com.tencent.mm.plugin.lite.t(y17));
            }
        }
        if (intent.hasExtra("task") && kotlin.jvm.internal.o.b(intent.getStringExtra("task"), "updateBaseLibPath")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppTaskPreloadReceiver", "receive set baselib path");
            oVar.d();
        }
    }
}
