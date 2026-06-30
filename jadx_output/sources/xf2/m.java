package xf2;

/* loaded from: classes2.dex */
public final class m implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public static final xf2.m f454290d = new xf2.m();

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        java.util.Iterator<T> it = stringArrayListExtra.iterator();
        java.lang.String str = "";
        while (true) {
            if (!it.hasNext()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("share_username", str);
                jSONObject.put("type", 6);
                jSONObject.put("share_type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
                return;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (str.length() > 0) {
                str2 = ";" + str2;
            }
            sb6.append(str2);
            str = sb6.toString();
        }
    }
}
