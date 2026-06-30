package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class y1 implements com.tencent.mm.plugin.lite.api.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.g1 f144091a;

    public y1(com.tencent.mm.plugin.lite.logic.g1 g1Var) {
        this.f144091a = g1Var;
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void a(int i17) {
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144091a;
        com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).get(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib fail.errCode: %d, checkItem: %s.", java.lang.Integer.valueOf(i17), k2Var);
        if (k2Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).remove(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = k2Var.f143997b;
        if (currentTimeMillis - j17 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT || currentTimeMillis - j17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception succ errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var.f143997b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.tencent.mm.plugin.lite.logic.g1 g1Var2 = this.f144091a;
        long j18 = k2Var.f143997b;
        long j19 = k2Var.f144000e;
        long j27 = k2Var.f144001f;
        g1Var2.O(i17, com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, currentTimeMillis - j18, j19 - j18, j27 - j19, currentTimeMillis - j27, 2);
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void b(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo, int i17) {
        com.tencent.mm.plugin.lite.logic.g1 g1Var = this.f144091a;
        com.tencent.mm.plugin.lite.logic.k2 k2Var = (com.tencent.mm.plugin.lite.logic.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).get(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib success.info: %s, checkItem: %s.", wxaLiteAppBaselibInfo, k2Var);
        if (k2Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f143951e).remove(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = k2Var.f143997b;
        if (currentTimeMillis - j17 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT || currentTimeMillis - j17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception succ errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var.f143997b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.tencent.mm.plugin.lite.logic.g1 g1Var2 = this.f144091a;
        long j18 = k2Var.f143997b;
        long j19 = k2Var.f144000e;
        long j27 = k2Var.f144001f;
        g1Var2.O(i17, com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB, currentTimeMillis - j18, j19 - j18, j27 - j19, currentTimeMillis - j27, 2);
        if (wxaLiteAppBaselibInfo == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", "updateBaseLibPath");
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wxaLiteAppBaselibInfo.path);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }
}
