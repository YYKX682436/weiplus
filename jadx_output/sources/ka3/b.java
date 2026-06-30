package ka3;

/* loaded from: classes15.dex */
public abstract class b {
    public static final boolean a(org.json.JSONObject result) {
        kotlin.jvm.internal.o.g(result, "result");
        return result.optInt("errCode") == 0;
    }

    public static final org.json.JSONObject b(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        if (str == null) {
            java.util.Map map = ka3.a.f306054a;
            str = (java.lang.String) ka3.a.f306054a.get(java.lang.Integer.valueOf(i17));
            if (str == null) {
                str = "unknown error";
            }
        }
        jSONObject.put("errMsg", str);
        return jSONObject;
    }

    public static /* synthetic */ org.json.JSONObject c(int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = null;
        }
        return b(i17, str);
    }

    public static org.json.JSONObject d(java.lang.Integer num, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = 0;
        }
        if ((i17 & 2) != 0) {
            str = "ok";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", num);
        jSONObject.put("errMsg", str);
        return jSONObject;
    }
}
