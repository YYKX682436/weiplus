package t50;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final t50.h f415706a = new t50.h();

    public final void a(java.util.Map extParams, org.json.JSONObject extObj) {
        kotlin.jvm.internal.o.g(extParams, "extParams");
        kotlin.jvm.internal.o.g(extObj, "extObj");
        try {
            java.util.Iterator<java.lang.String> keys = extObj.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = extObj.get(next);
                if (obj instanceof java.lang.String) {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, obj);
                } else if (obj instanceof java.lang.Number) {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (obj instanceof java.lang.Boolean) {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (obj instanceof org.json.JSONObject) {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, obj.toString());
                } else if (kotlin.jvm.internal.o.b(org.json.JSONObject.NULL, obj)) {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, "null");
                } else {
                    kotlin.jvm.internal.o.d(next);
                    extParams.put(next, obj.toString());
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.AISearchUtils", e17, "", new java.lang.Object[0]);
        }
    }
}
