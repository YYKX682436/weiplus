package r61;

/* loaded from: classes8.dex */
public abstract class r0 {
    public static java.lang.String a(java.util.List list) {
        if (list == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GoogleContactLogic", "");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            org.apache.http.NameValuePair nameValuePair = (org.apache.http.NameValuePair) list.get(i17);
            if (!android.text.TextUtils.isEmpty(nameValuePair.getName())) {
                if (i17 != 0) {
                    sb6.append("&");
                }
                sb6.append(java.net.URLEncoder.encode(nameValuePair.getName(), com.tencent.mapsdk.internal.rv.f51270c));
                sb6.append("=");
                if (android.text.TextUtils.isEmpty(nameValuePair.getValue())) {
                    sb6.append("");
                } else {
                    sb6.append(java.net.URLEncoder.encode(nameValuePair.getValue(), com.tencent.mapsdk.internal.rv.f51270c));
                }
            }
        }
        return sb6.toString();
    }

    public static boolean b(android.content.Context context) {
        return (context.getPackageManager().resolveActivity(new android.content.Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 0) == null || context.getPackageManager().resolveActivity(new android.content.Intent("com.google.android.gms.common.account.CHOOSE_ACCOUNT"), 0) == null || context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("googleauth", false)) ? false : true;
    }
}
