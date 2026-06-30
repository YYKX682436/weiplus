package tb1;

/* loaded from: classes13.dex */
public abstract class e0 extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    private static final int CTRL_INDEX = 455;
    public static final java.lang.String NAME = "onCameraScanCode";

    public static void u(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, int i18, java.lang.String str2, byte[] bArr, com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cameraId", java.lang.Integer.valueOf(i17));
        hashMap.put("type", str);
        hashMap.put("result", str2);
        hashMap.put("codeVersion", java.lang.Integer.valueOf(i18));
        if (qbarNative$QBarPoint != null) {
            hashMap.put("scanArea", new float[]{qbarNative$QBarPoint.f215230x0 / ik1.w.f(), qbarNative$QBarPoint.f215234y0 / ik1.w.f(), (qbarNative$QBarPoint.f215231x1 - qbarNative$QBarPoint.f215230x0) / ik1.w.f(), (qbarNative$QBarPoint.f215237y3 - qbarNative$QBarPoint.f215234y0) / ik1.w.f()});
        }
        if (bArr != null && bArr.length > 0) {
            java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
            hashMap.put("charSet", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            hashMap.put("rawData", encodeToString);
        }
        lVar.d(NAME, new org.json.JSONObject(hashMap).toString(), null);
    }
}
