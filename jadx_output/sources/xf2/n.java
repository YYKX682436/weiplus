package xf2;

/* loaded from: classes2.dex */
public final class n implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final xf2.n f454291d = new xf2.n();

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.String str = "";
            for (java.lang.String str2 : stringArrayListExtra) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                if (str.length() > 0) {
                    str2 = ";" + str2;
                }
                sb6.append(str2);
                str = sb6.toString();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 6);
            jSONObject.put("share_type", 2);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
