package ho1;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ho1.a1 a1Var, long j17, java.lang.String str) {
        super(1);
        this.f282700d = a1Var;
        this.f282701e = j17;
        this.f282702f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        java.lang.String str = this.f282702f;
        long j17 = this.f282701e;
        ho1.a1 a1Var = this.f282700d;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e(a1Var.f282622a, "bind result is null, maybe timeout.");
            com.tencent.wechat.aff.affroam.e0 e0Var = a1Var.f282623b;
            if (e0Var != null) {
                e0Var.j0(j17, str, false);
            }
        } else {
            try {
                java.lang.String optString = jSONObject.optString("bindId", "");
                boolean a17 = fo1.d.f264858a.a(jSONObject, "bindResult", false);
                kotlin.jvm.internal.o.d(optString);
                if (!(optString.length() == 0) && a17) {
                    v32.f fVar = new v32.f();
                    fVar.field_deviceId = jSONObject.getString("deviceId");
                    fVar.field_nickName = jSONObject.getString("deviceName");
                    fVar.field_productType = jSONObject.getInt("deviceType");
                    com.tencent.mm.plugin.exdevice.model.l3.aj().replace(fVar);
                    oo1.o oVar = oo1.o.f347151a;
                    java.lang.String field_deviceId = fVar.field_deviceId;
                    kotlin.jvm.internal.o.f(field_deviceId, "field_deviceId");
                    oVar.a(field_deviceId);
                    com.tencent.wechat.aff.affroam.e0 e0Var2 = a1Var.f282623b;
                    if (e0Var2 != null) {
                        e0Var2.j0(j17, fVar.field_deviceId, true);
                    }
                }
                com.tencent.mars.xlog.Log.e(a1Var.f282622a, "Fail to bind. bindId is " + optString + ", isSuccess=" + a17);
                com.tencent.wechat.aff.affroam.e0 e0Var3 = a1Var.f282623b;
                if (e0Var3 != null) {
                    e0Var3.j0(j17, str, false);
                }
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(a1Var.f282622a, e17, "Fail to parse value from json. jsonObj=" + jSONObject, new java.lang.Object[0]);
                com.tencent.wechat.aff.affroam.e0 e0Var4 = a1Var.f282623b;
                if (e0Var4 != null) {
                    e0Var4.j0(j17, str, false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
