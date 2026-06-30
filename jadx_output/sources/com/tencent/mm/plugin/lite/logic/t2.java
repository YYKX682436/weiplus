package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes9.dex */
public class t2 implements com.tencent.mm.plugin.lite.api.f {
    public t2(com.tencent.mm.plugin.lite.logic.u2 u2Var) {
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void a(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppNewXmlConsumer", "update liteapp baselib fail.");
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void b(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", "updateBaseLibPath");
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wxaLiteAppBaselibInfo.path);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppNewXmlConsumer", "update liteapp baselib success.");
    }
}
