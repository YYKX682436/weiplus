package ox;

/* loaded from: classes7.dex */
public final class m implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk.p f349495a;

    public m(tk.p pVar) {
        this.f349495a = pVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MircoMsg.BizPublishImageExternalService", "value = " + str);
        try {
            kotlin.jvm.internal.o.d(str);
            jSONObject = str.length() > 0 ? new org.json.JSONObject(str) : new org.json.JSONObject();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.BizPublishImageExternalService", e17, "parse json error", new java.lang.Object[0]);
            jSONObject = new org.json.JSONObject();
        }
        this.f349495a.a(true, "", jSONObject);
    }
}
