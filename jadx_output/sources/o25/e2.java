package o25;

/* loaded from: classes4.dex */
public final class e2 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f342511d;

    public e2(java.lang.String str, java.lang.String str2, java.lang.String str3, o25.c2 c2Var) {
        this.f342508a = str;
        this.f342509b = str2;
        this.f342510c = str3;
        this.f342511d = c2Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        java.lang.String str2;
        int i18;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f342508a + ", receive callback(instanceId:" + j17 + ", actionName:" + str + ", data:" + obj + ", callbackId:" + i17 + ')');
        if (obj instanceof org.json.JSONObject) {
            jSONObject = (org.json.JSONObject) obj;
        } else {
            if (obj instanceof java.lang.String) {
                try {
                    jSONObject = new org.json.JSONObject((java.lang.String) obj);
                } catch (org.json.JSONException unused) {
                }
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("result");
            if (kotlin.jvm.internal.o.b(optString, ya.b.SUCCESS)) {
                i18 = 0;
                str3 = null;
                str2 = jSONObject.toString();
            } else if (kotlin.jvm.internal.o.b(optString, "cancel")) {
                str3 = null;
                str2 = jSONObject.toString();
                i18 = -2;
            } else {
                str3 = null;
                i18 = -3;
                str2 = jSONObject.toString();
            }
        } else {
            str2 = null;
            i18 = -3;
            str3 = "wrong data when on dispatch";
        }
        o25.g2.f342527a.b(this.f342509b, this.f342510c, this.f342508a, i18, str3, str2);
        o25.c2 c2Var = this.f342511d;
        if (c2Var != null) {
            c2Var.f();
        }
        return false;
    }
}
