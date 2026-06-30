package qf1;

/* loaded from: classes13.dex */
public class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 316;
    public static final java.lang.String NAME = "connectWifi";

    public static android.util.Pair C(qf1.e eVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.util.Map map) {
        eVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.n2.a()) {
            map.put("errCode", 12006);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not open GPS");
            return new android.util.Pair("fail:may be not open GPS", jc1.c.f298899w);
        }
        boolean b17 = nf.t.b((android.app.Activity) context, lVar, "android.permission.ACCESS_FINE_LOCATION");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiConnectWifi", "fixErrInfo, checkLocation:%b", java.lang.Boolean.valueOf(b17));
        if (b17) {
            map.put("errCode", 12010);
            return null;
        }
        map.put("errCode", 12012);
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not obtain GPS Perrmission");
        return new android.util.Pair("fail:may be not obtain GPS Perrmission", jc1.c.f298900x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x080f  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r34, org.json.JSONObject r35, int r36) {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf1.e.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
