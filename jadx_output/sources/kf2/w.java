package kf2;

/* loaded from: classes.dex */
public final class w {
    public w(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Boolean a(java.lang.Object obj, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.Integer b(java.lang.Object obj, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return java.lang.Integer.valueOf(jSONObject.getInt(name));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String c(java.lang.Object obj, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return jSONObject.getString(name);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
