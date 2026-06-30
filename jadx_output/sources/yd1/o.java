package yd1;

/* loaded from: classes7.dex */
public class o extends yd1.k {
    public static final int CTRL_INDEX = 686;
    public static final java.lang.String NAME = "operateMediaContainer";

    @Override // yd1.k
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s %s", NAME, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType");
        if (optString.equalsIgnoreCase("create")) {
            ta1.q0 E = E(c0Var);
            yd1.l lVar = new yd1.l(this, c0Var, i17);
            E.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger createMediaContainer");
            E.f416665a.postToWorker(new ta1.j(E, jSONObject, lVar));
            return;
        }
        if (!optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_EXPORT)) {
            if (!optString.equalsIgnoreCase("remove")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: invalid operate type: %s", optString);
                c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
                return;
            } else {
                ta1.q0 E2 = E(c0Var);
                E2.f416665a.postToWorker(new ta1.v(E2, jSONObject, new yd1.n(this, c0Var, i17)));
                return;
            }
        }
        int optInt = jSONObject.optInt("containerId");
        java.lang.String optString2 = jSONObject.optString("mimeType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            c0Var.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
            return;
        }
        java.lang.String str = "export_" + optInt + "_" + java.lang.System.currentTimeMillis() + "." + optString2;
        yd1.j C = C(c0Var, str, true);
        if (C != null) {
            java.lang.String str2 = C.f461003a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(C.f461004b)) {
                try {
                    jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str2);
                    ta1.q0 E3 = E(c0Var);
                    E3.f416665a.postToWorker(new ta1.t(E3, jSONObject, new yd1.m(this, C, c0Var, optString2, i17, str)));
                    return;
                } catch (org.json.JSONException e17) {
                    c0Var.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                    return;
                } catch (java.lang.Exception e18) {
                    c0Var.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s, alloc file failed", NAME);
        c0Var.a(i17, o(java.lang.String.format("fail: internal create file failed", new java.lang.Object[0])));
    }
}
