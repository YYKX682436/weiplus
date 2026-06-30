package yd1;

/* loaded from: classes7.dex */
public class t extends yd1.k {
    public static final int CTRL_INDEX = 687;
    public static final java.lang.String NAME = "operateMediaTrack";

    @Override // yd1.k
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: %s %s", NAME, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType");
        if (optString.equalsIgnoreCase("get")) {
            java.lang.String optString2 = jSONObject.optString(ya.b.SOURCE);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                c0Var.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            try {
                if (optString2.startsWith("wxfile://")) {
                    jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, c0Var.t3().getFileSystem().getAbsoluteFile(optString2, false).o());
                } else {
                    jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, optString2);
                }
                ta1.q0 E = E(c0Var);
                E.f416665a.postToWorker(new ta1.l(E, jSONObject, new yd1.p(this, c0Var, i17)));
                return;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e17, "getMediaTrack fail, JSONException", new java.lang.Object[0]);
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e18, "getMediaTrack fail, Exception", new java.lang.Object[0]);
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
                return;
            }
        }
        if (optString.equalsIgnoreCase("create")) {
            ta1.q0 E2 = E(c0Var);
            E2.f416665a.postToWorker(new ta1.n(E2, jSONObject, new yd1.q(this, c0Var, i17)));
            return;
        }
        if (optString.equalsIgnoreCase("update")) {
            try {
                ta1.q0 E3 = E(c0Var);
                E3.f416665a.postToWorker(new ta1.p(E3, jSONObject, new yd1.r(this, c0Var, i17)));
                return;
            } catch (java.lang.Exception e19) {
                c0Var.a(i17, o(java.lang.String.format("fail: error %s", e19.getMessage())));
                return;
            }
        }
        if (!optString.equalsIgnoreCase("remove")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: invalid operate type: %s", optString);
            c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
        } else {
            ta1.q0 E4 = E(c0Var);
            E4.f416665a.postToWorker(new ta1.r(E4, jSONObject, new yd1.s(this, c0Var, i17)));
        }
    }
}
