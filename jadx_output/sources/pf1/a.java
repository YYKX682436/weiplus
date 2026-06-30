package pf1;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f353768a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f353769b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f353770c;

    static {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "{}";
        try {
            str = new org.json.JSONObject().put("err_msg", "system:function_not_exist").toString();
        } catch (org.json.JSONException unused) {
            str = "{}";
        }
        kotlin.jvm.internal.o.d(str);
        f353768a = str;
        try {
            str2 = new org.json.JSONObject().put("err_msg", "system:invalid_data").toString();
        } catch (org.json.JSONException unused2) {
            str2 = "{}";
        }
        kotlin.jvm.internal.o.d(str2);
        f353769b = str2;
        try {
            str3 = new org.json.JSONObject().put("err_msg", "system:invalid_api").toString();
        } catch (org.json.JSONException unused3) {
            str3 = "{}";
        }
        kotlin.jvm.internal.o.d(str3);
        f353770c = str3;
        try {
            str4 = new org.json.JSONObject().put("err_msg", "system:access_denied").toString();
        } catch (org.json.JSONException unused4) {
        }
        kotlin.jvm.internal.o.d(str4);
    }
}
