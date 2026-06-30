package h41;

/* loaded from: classes15.dex */
public final class c0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278773a;

    public c0(h41.i0 i0Var) {
        this.f278773a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "contact::display_contact_list";
    }

    @Override // ey.k
    public void c(com.tencent.wechat.aff.function_call.e notification) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(notification, "notification");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(notification.c());
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("displayed_contacts");
            kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
            c75.c.d(jSONArray, new h41.b0(arrayList));
            java.lang.String optString = jSONObject.optString("error_description", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            str = optString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "parse display_contact_list return error: " + e17);
            str = "";
        }
        try {
            str2 = new org.json.JSONObject(notification.b()).optString("display_scene", "send_message");
            kotlin.jvm.internal.o.f(str2, "optString(...)");
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "parse display_contact_list param error: " + e18);
            str2 = "send_message";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "onDisplayContactListEnd: contacts=" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null) + ", scene=" + str2 + ", error=" + str);
        com.tencent.wechat.aff.ovc.d dVar = this.f278773a.f278794a;
        if (dVar != null) {
            dVar.c1(arrayList, str2);
        }
    }
}
