package com.tencent.mm.plugin.lite.debug;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDebugInvokeTask", "invoke data = " + bundle.toString());
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, false, true, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDebugInvokeTask", "after start activity");
        com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData liteAppDebugIPCCallbackData = new com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData();
        liteAppDebugIPCCallbackData.f143457d = "ok";
        rVar.a(liteAppDebugIPCCallbackData);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDebugInvokeTask", "after callback");
    }
}
