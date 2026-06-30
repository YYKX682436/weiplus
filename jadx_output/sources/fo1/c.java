package fo1;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f264856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f264857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar, po1.d dVar) {
        super(1);
        this.f264856d = lVar;
        this.f264857e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        po1.d dVar = this.f264857e;
        yz5.l lVar = this.f264856d;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("AutoBindHelper", "bind result is null, maybe timeout.");
            lVar.invoke(java.lang.Boolean.FALSE);
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
                    java.lang.String field_deviceId = fVar.field_deviceId;
                    kotlin.jvm.internal.o.f(field_deviceId, "field_deviceId");
                    dVar.getClass();
                    dVar.f357295a = field_deviceId;
                    java.lang.String str = fVar.field_nickName;
                    if (str != null) {
                        dVar.f357297c = str;
                    }
                    if (str != null) {
                        dVar.f357298d = str;
                    }
                    dVar.f357296b = po1.g.f357306d.a(fVar.field_productType);
                    oo1.o.f347151a.a(dVar.f357295a);
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
                com.tencent.mars.xlog.Log.e("AutoBindHelper", "Fail to bind. bindId is " + optString + ", isSuccess=" + a17);
                lVar.invoke(java.lang.Boolean.FALSE);
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AutoBindHelper", e17, "Fail to parse value from json. jsonObj=" + jSONObject, new java.lang.Object[0]);
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
