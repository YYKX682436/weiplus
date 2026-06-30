package ik1;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f291840a = new r26.t("^[a-zA-Z0-9!#$&^_.+-]{1,127}/[a-zA-Z0-9!#$&^_.+-]{1,127}$");

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0151, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if ((r12 == null || r26.n0.N(r12)) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject a(org.json.JSONObject r25, com.tencent.mm.plugin.appbrand.appstorage.u1 r26) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik1.t.a(org.json.JSONObject, com.tencent.mm.plugin.appbrand.appstorage.u1):org.json.JSONObject");
    }

    public static final java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            kotlin.jvm.internal.o.d(str);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(keys.next());
                if (optJSONObject != null) {
                    optJSONObject.remove(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                }
            }
            com.tencent.mars.xlog.Log.i("Luggage.FileRefsUtil", "filterFileRefs, externalFileRefs:" + jSONObject);
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.FileRefsUtil", "parse externalFileRefs failed, msg:" + e17.getMessage() + ", externalFileRefs:" + str);
            return null;
        }
    }
}
