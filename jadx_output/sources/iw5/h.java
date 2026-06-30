package iw5;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final iw5.h f295272a = new iw5.h();

    public final jz5.l a(java.lang.String reqJson) {
        kotlin.jvm.internal.o.g(reqJson, "reqJson");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(reqJson);
            java.lang.String string = jSONObject.getString("type");
            byte[] decode = android.util.Base64.decode(jSONObject.getString("req"), 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            return new jz5.l(string, new java.lang.String(decode, r26.c.f368865a));
        } catch (java.lang.Exception e17) {
            java.lang.String msg = "parseReq error " + e17;
            kotlin.jvm.internal.o.g(msg, "msg");
            if (iw5.o.f295275a == null) {
                return null;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelUtil", msg);
            return null;
        }
    }
}
