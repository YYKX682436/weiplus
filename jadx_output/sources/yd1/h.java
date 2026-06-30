package yd1;

/* loaded from: classes7.dex */
public class h extends yd1.k {
    public static final int CTRL_INDEX = 705;
    public static final java.lang.String NAME = "openVideoEditor";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a A[Catch: JSONException -> 0x01aa, TryCatch #0 {JSONException -> 0x01aa, blocks: (B:4:0x001a, B:7:0x003c, B:9:0x005f, B:11:0x007f, B:24:0x0087, B:27:0x00ab, B:29:0x00b2, B:14:0x00ce, B:16:0x011a, B:19:0x013d, B:21:0x015e, B:35:0x00c3, B:33:0x00b6), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013b  */
    /* JADX WARN: Type inference failed for: r27v0, types: [int] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(yd1.h r24, com.tencent.mm.plugin.appbrand.service.c0 r25, int r26, int r27, java.lang.String r28, org.json.JSONObject r29, org.json.JSONObject r30) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd1.h.H(yd1.h, com.tencent.mm.plugin.appbrand.service.c0, int, int, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    @Override // yd1.k
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: %s %s", NAME, jSONObject.toString());
        if (c0Var.Z0() == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mm.plugin.appbrand.app.w7.a();
        int optInt = jSONObject.optInt("editType");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("sdkParmas");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("editorParmas");
        if (optInt == 1) {
            if (optJSONObject == null) {
                c0Var.a(i17, o(java.lang.String.format("fail: sdkParmas get failed", new java.lang.Object[0])));
                return;
            } else {
                I(c0Var, optJSONObject, new yd1.a(this, c0Var, i17));
                return;
            }
        }
        if (optInt == 2) {
            if (optJSONObject2 == null) {
                c0Var.a(i17, o(java.lang.String.format("fail: editorParmas get failed", new java.lang.Object[0])));
                return;
            } else {
                J(c0Var, optJSONObject2, new yd1.b(this, c0Var, i17));
                return;
            }
        }
        if (optJSONObject == null || optJSONObject2 == null) {
            c0Var.a(i17, o(java.lang.String.format("fail: sdkParmas or editorParmas get failed", new java.lang.Object[0])));
        } else {
            I(c0Var, optJSONObject, new yd1.d(this, c0Var, i17, optJSONObject2));
        }
    }

    public final void I(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, ta1.t0 t0Var) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: editForMediaSdk %s %s", NAME, jSONObject.toString());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String optString = jSONObject.optString("videoSrc", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                t0Var.a(2, -3, "sdkParmas videoSrc not set", new org.json.JSONObject());
                return;
            }
            jSONObject2.put("videoPath", c0Var.t3().getFileSystem().getAbsoluteFile(optString, false).o());
            java.lang.String optString2 = jSONObject.optString("bgmSrc", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                jSONObject2.put("audioPath", c0Var.t3().getFileSystem().getAbsoluteFile(optString2, false).o());
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("timeRange");
            if (optJSONArray != null) {
                jSONObject2.put("videoSlices", optJSONArray);
            }
            jSONObject2.put("audioVolume", jSONObject.optDouble("volume", 1.0d));
            jSONObject2.put("atempo", jSONObject.optDouble("atempo", 1.0d));
            jSONObject2.put("mix", jSONObject.optBoolean("audioMix"));
            yd1.j C = C(c0Var, new java.util.Date().getTime() + ".mp4", true);
            if (C != null) {
                java.lang.String str = C.f461003a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(C.f461004b)) {
                    jSONObject2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
                    ta1.q0 E = E(c0Var);
                    E.f416665a.postToWorker(new ta1.h(E, jSONObject2, new yd1.e(this, C, t0Var)));
                    return;
                }
            }
            t0Var.a(1, -1, "create file failed", new org.json.JSONObject());
        } catch (org.json.JSONException e17) {
            t0Var.a(2, -1, java.lang.String.format("editForMediaSdk error: " + e17.getMessage(), new java.lang.Object[0]), new org.json.JSONObject());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.tencent.mm.plugin.appbrand.service.c0 r19, org.json.JSONObject r20, ta1.t0 r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd1.h.J(com.tencent.mm.plugin.appbrand.service.c0, org.json.JSONObject, ta1.t0):void");
    }
}
