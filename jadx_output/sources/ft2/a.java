package ft2;

/* loaded from: classes5.dex */
public abstract class a {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        if (kotlin.jvm.internal.o.b(str, str2)) {
            return true;
        }
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (str.length() == 0) {
            return str2 == null ? "" : str2;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return str;
        }
        return str + '_' + str2;
    }

    public static final org.json.JSONObject c(r45.xp2 xp2Var) {
        kotlin.jvm.internal.o.g(xp2Var, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jSONObject.put("startTs", xp2Var.getLong(3));
            jSONObject.put("endTs", xp2Var.getLong(4));
            jSONObject.put("duration", xp2Var.getLong(4) - xp2Var.getLong(3));
            jSONObject.put(dm.i4.COL_ID, xp2Var.getString(2));
            if (xp2Var.getInteger(5) >= 0) {
                jSONObject.put("endType", xp2Var.getInteger(5));
            }
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return jSONObject;
    }
}
