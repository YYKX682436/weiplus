package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class t extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("rqt");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("fail: dataIn is null");
            return;
        }
        byte[] bytes = optString.getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        if (!fo3.s.INSTANCE.E1(1, bytes, 0, bytes.length, pInt, pInt2, pByteArray)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiCalRqt", "calrqt, connot calculate hash of rqt data.");
            this.f143443f.a("fail");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(5);
        hashMap.put("k1", java.lang.Integer.valueOf(pInt.value));
        hashMap.put("k2", java.lang.Integer.valueOf(pInt2.value));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, android.util.Base64.encodeToString(pByteArray.value, 2));
        this.f143443f.b(hashMap);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 0;
    }
}
