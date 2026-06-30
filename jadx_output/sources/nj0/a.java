package nj0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f337799a;

    public static int a(android.content.Context context) {
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 4;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 5;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
        if (netType == -1) {
            return 255;
        }
        if (netType == 0) {
            return 1;
        }
        if (netType != 5) {
            return netType != 6 ? 6 : 3;
        }
        return 2;
    }

    public static java.lang.String b() {
        if (f337799a == null) {
            java.lang.String k17 = wo.w0.k();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < k17.length() - 1; i17++) {
                sb6.append(java.lang.Integer.toHexString(k17.charAt(i17)));
            }
            sb6.append("00");
            f337799a = sb6.toString();
        }
        return f337799a;
    }

    public static java.lang.String c(java.util.Map map) {
        if (map != null && map.size() != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameReportUtil", e17.getMessage());
                    return "";
                }
            }
            try {
                return java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameReportUtil", e18.getMessage());
            }
        }
        return "";
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportUtil", e17.getMessage());
            return "";
        }
    }
}
