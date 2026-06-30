package com.tencent.mm.plugin.lite;

/* loaded from: classes7.dex */
public class d0 implements com.tencent.mm.plugin.lite.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback f143456b;

    public d0(com.tencent.mm.plugin.lite.w wVar, java.lang.String str, com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback) {
        this.f143455a = str;
        this.f143456b = nativeCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    @Override // com.tencent.mm.plugin.lite.x0
    public void a(java.lang.String str) {
        gp.d dVar;
        boolean isEmpty = str.isEmpty();
        com.tencent.mm.plugin.lite.LiteAppCenter.NativeCallback nativeCallback = this.f143456b;
        java.lang.String str2 = "{}";
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "get filepath from src: %s fail", this.f143455a);
            nativeCallback.onCallback("{}");
            return;
        }
        gp.d dVar2 = null;
        gp.d dVar3 = null;
        try {
            try {
                try {
                    dVar = new gp.d();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.io.IOException unused) {
        }
        try {
            dVar.setDataSource(str);
            int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(24), 0);
            java.lang.String extractMetadata = dVar.extractMetadata(12);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
            long k17 = com.tencent.mm.vfs.w6.k(str);
            int P3 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
            int P4 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
            int P5 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(20), 0);
            float L = com.tencent.mm.sdk.platformtools.t8.L(dVar.extractMetadata(25), 0.0f);
            if (L == 0.0f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "fps is 0");
                L = com.tencent.mm.plugin.lite.w.a(str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "filepath: %s, rotation: %d, type: %s, duration: %d, size %d, width: %d, height: %d, bitrate: %d, fps: %f", str, java.lang.Integer.valueOf(P), extractMetadata, java.lang.Integer.valueOf(P2), java.lang.Long.valueOf(k17), java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4), java.lang.Integer.valueOf(P5), java.lang.Float.valueOf(L));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("orientation", P != 90 ? P != 180 ? P != 270 ? "up" : "left" : "down" : "right");
            ?? r76 = "type";
            jSONObject.put("type", extractMetadata.replace("video/", ""));
            jSONObject.put("duration", P2);
            jSONObject.put("size", k17);
            jSONObject.put("height", P4);
            jSONObject.put("width", P3);
            jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, (int) L);
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, P5);
            str2 = jSONObject.toString();
            dVar.release();
            dVar2 = r76;
        } catch (java.lang.Exception e18) {
            e = e18;
            dVar3 = dVar;
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWxaLiteAppCenter", "getVideoInfo error: %s", e.toString());
            dVar2 = dVar3;
            if (dVar3 != null) {
                dVar3.release();
                dVar2 = dVar3;
            }
            nativeCallback.onCallback(str2);
        } catch (java.lang.Throwable th7) {
            th = th7;
            dVar2 = dVar;
            if (dVar2 != null) {
                try {
                    dVar2.release();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
        nativeCallback.onCallback(str2);
    }
}
