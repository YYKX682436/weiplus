package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes9.dex */
public class r0 implements com.tencent.mm.plugin.lite.api.f {
    public r0(com.tencent.mm.plugin.lite.logic.t0 t0Var) {
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void a(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.logic.q0(this));
    }

    @Override // com.tencent.mm.plugin.lite.api.f
    public void b(com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.LiteAppTaskPreloadReceiver.class);
        intent.addFlags(268435456);
        intent.putExtra("task", "updateBaseLibPath");
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wxaLiteAppBaselibInfo.path);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.logic.p0(this));
    }
}
