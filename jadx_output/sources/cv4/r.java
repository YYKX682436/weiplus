package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/r;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null || !jSONObject.has("bizName") || !jSONObject.has("bizKey")) {
            this.f143443f.a("Require bizName and bizKey");
            return;
        }
        java.lang.String optString = jSONObject.optString("bizName");
        zv4.g gVar = zv4.h.f476461a;
        int b17 = gVar.b(optString);
        java.lang.String optString2 = jSONObject.optString("bizKey");
        kotlin.jvm.internal.o.d(optString2);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        gVar.f(b17, optString2, c17);
        this.f143443f.d(false);
    }
}
