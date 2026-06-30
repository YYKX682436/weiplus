package cv4;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv4.q f222593d;

    public p(cv4.q qVar) {
        this.f222593d = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", "onScreenShot， path = " + str + "， dateAdded = " + j17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("retCode", "0");
        long j18 = this.f222593d.f143442e.f299024a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", "notifyJSEvent, liteAppUuid: " + j18 + ", funcName: onUserCaptureScreen, paramsJson: " + jSONObject);
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j18, "onUserCaptureScreen", jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiRegisterNativeEventMonitor", e17, "notifyJSEvent", new java.lang.Object[0]);
        }
    }
}
