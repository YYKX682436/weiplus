package ey;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey.j f257274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f257275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ey.j jVar, long j17) {
        super(1);
        this.f257274d = jVar;
        this.f257275e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String jSONObject;
        org.json.JSONObject ret = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(ret, "ret");
        try {
            jSONObject = ret.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FunctionCallBaseImpl", "stringify json error " + e17);
            java.lang.String errorMessage = "stringify json error: " + e17.getMessage();
            kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.SUCCESS, false);
            jSONObject2.put("error_message", errorMessage);
            jSONObject = jSONObject2.toString();
        }
        kotlin.jvm.internal.o.d(jSONObject);
        com.tencent.wechat.aff.function_call.l lVar = this.f257274d.f257276a;
        if (lVar != null) {
            lVar.k1(this.f257275e, jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
