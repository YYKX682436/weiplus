package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class o5 implements io.flutter.plugin.common.MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode f143703a;

    public o5(com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode liteAppJsApiRecognizeQRCode) {
        this.f143703a = liteAppJsApiRecognizeQRCode;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f143703a.f143442e.b(java.lang.String.format("invoke getImageLocalInfo failed. code: %s, message: %s", str, str2));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        this.f143703a.f143442e.b("getImageLocalInfo notImplemented");
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiRecognizeQRCode", obj.toString());
        boolean z17 = obj instanceof java.util.ArrayList;
        com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode liteAppJsApiRecognizeQRCode = this.f143703a;
        if (z17) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (arrayList.size() == 1) {
                java.lang.String str = (java.lang.String) ((java.util.HashMap) arrayList.get(0)).get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
                liteAppJsApiRecognizeQRCode.f143486g.alive();
                liteAppJsApiRecognizeQRCode.f143487h.alive();
                long nanoTime = java.lang.System.nanoTime();
                am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
                aqVar.f6174a = nanoTime;
                aqVar.f6175b = str;
                recogQBarOfImageFileEvent.e();
                return;
            }
        }
        liteAppJsApiRecognizeQRCode.f143442e.b("invoke getImageLocalInfo failed");
    }
}
