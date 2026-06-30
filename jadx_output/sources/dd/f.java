package dd;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd.e f228876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bd.e eVar) {
        super(2);
        this.f228876d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.i("WeixinPayService.JumpRemindImpl", "jumpRemind interruptCallback, isAgree: " + booleanValue + ", path: " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", "interrupt");
        jSONObject.put("isAgree", booleanValue);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
        this.f228876d.a(dd.d.f228871a.i(jSONObject, "ok"), false, false);
        return jz5.f0.f302826a;
    }
}
