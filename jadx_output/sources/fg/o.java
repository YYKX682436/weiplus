package fg;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fg.b0 b0Var) {
        super(4);
        this.f261793d = b0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String value = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        java.lang.String str2 = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(value, "value");
        fg.b0 b0Var = this.f261793d;
        b0Var.getClass();
        org.json.JSONObject put = new org.json.JSONObject().put("value", value).put("keyCode", (int) (value.length() > 0 ? value.charAt(value.length() - 1) : (char) 0)).put("cursor", intValue);
        kotlin.jvm.internal.o.f(put, "put(...)");
        if (str != null) {
            put.put("encryptedValue", str);
        }
        if (str2 != null) {
            put.put("encryptError", str2);
        }
        java.lang.String jSONObject = put.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        b0Var.evaluateJavascript("(function(){    var focusElement = document.activeElement;    if(focusElement){        if(focusElement.onkeyboardcomplete){            focusElement.onkeyboardcomplete(" + jSONObject + ");        }        focusElement.blur();    }})();", fg.k.f261780a);
        sf.c cVar = sf.c.f406939a;
        com.tencent.mm.plugin.appbrand.page.oa oaVar = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar);
        com.tencent.mm.plugin.appbrand.jsapi.t a17 = oaVar.a();
        com.tencent.mm.plugin.appbrand.page.oa oaVar2 = b0Var.f261727d;
        kotlin.jvm.internal.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(0, 0, b0Var.f261735l, new fg.n(b0Var)));
        return jz5.f0.f302826a;
    }
}
