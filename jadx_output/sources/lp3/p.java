package lp3;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f320302a = com.tencent.mm.sdk.platformtools.o4.M("pat_user_mmkv");

    public static java.lang.String a(java.lang.String str) {
        try {
            return (java.lang.String) b(str, "pat_user_suffix_content");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PatUserMMKV", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.Object b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f320302a;
        if (!o4Var.f(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(o4Var.getString(str, ""));
        if (jSONObject.has(str2)) {
            return jSONObject.get(str2);
        }
        return null;
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = f320302a;
        org.json.JSONObject jSONObject = o4Var.f(str) ? new org.json.JSONObject(o4Var.getString(str, "")) : new org.json.JSONObject();
        jSONObject.put(str2, obj);
        o4Var.putString(str, jSONObject.toString());
    }
}
