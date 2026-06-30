package y25;

/* loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str, java.util.HashMap hashMap) {
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MallManager", "getWapPayKey key: " + str + " value is empty");
        return "";
    }
}
