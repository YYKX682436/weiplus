package d85;

/* loaded from: classes5.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f227229a = new java.util.HashMap();

    static {
        d85.i1 i1Var = d85.i1.f227206a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject(i1Var.a(context, "methodToPermissionMap.json"));
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String obj = jSONArray.get(i17).toString();
                kotlin.jvm.internal.o.d(next);
                f227229a.put(obj, next);
            }
        }
    }
}
