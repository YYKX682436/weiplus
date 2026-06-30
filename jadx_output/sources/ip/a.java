package ip;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ip.a f293544a = new ip.a();

    public final int a() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LimitationOnSight");
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration getDynamicConfig:" + d17);
        if (!android.text.TextUtils.isEmpty(d17)) {
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(d17).optJSONObject("kSightLimitationMaxDurationKey");
                int optInt = optJSONObject != null ? optJSONObject.optInt("c2c") : 300;
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration result:%d", java.lang.Integer.valueOf(optInt));
                if (optInt <= 15) {
                    return 300;
                }
                return optInt;
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration parse Json error!");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getC2CSelectMaxDuration default result:%d", 300);
        return 300;
    }

    public final int b() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LimitationOnSight");
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration getDynamicConfig:" + d17);
        int i17 = 300;
        if (!android.text.TextUtils.isEmpty(d17)) {
            try {
                org.json.JSONObject optJSONObject = new org.json.JSONObject(d17).optJSONObject("kSightLimitationMaxDurationKey");
                int optInt = optJSONObject != null ? optJSONObject.optInt("sns") : 300;
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration result:%d", java.lang.Integer.valueOf(optInt));
                if (optInt > 15) {
                    i17 = optInt;
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration parse Json error!");
            }
            return i17 * 1000;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumConfigControl", "getSNSSelectMaxDuration default result:%d", 300);
        return i17 * 1000;
    }
}
