package hc2;

/* loaded from: classes.dex */
public abstract class i0 {
    public static final void a(r45.k74 k74Var, java.util.Map queries) {
        org.json.JSONObject jSONObject;
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(k74Var, "<this>");
        kotlin.jvm.internal.o.g(queries, "queries");
        java.lang.String string = k74Var.getString(2);
        if (string == null || string.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            com.tencent.mars.xlog.Log.i("FinderExt", "litepp appendQueries, query:" + string);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject(string));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            jSONObject = (org.json.JSONObject) m521constructorimpl;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        }
        try {
            for (java.util.Map.Entry entry : queries.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            k74Var.set(2, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderExt", "liteapp appendQueries err: " + e17);
        }
    }
}
