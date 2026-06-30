package dv2;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f243850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(org.json.JSONObject jSONObject) {
        super(2);
        this.f243850d = jSONObject;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.cd1 cd1Var = (r45.cd1) obj;
        r45.cd1 cd1Var2 = (r45.cd1) obj2;
        org.json.JSONObject jSONObject = this.f243850d;
        if (cd1Var != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            r45.gd1 gd1Var = (r45.gd1) cd1Var.getCustom(2);
            jSONObject2.put("latitude", gd1Var != null ? java.lang.Float.valueOf(gd1Var.getFloat(1)) : null);
            r45.gd1 gd1Var2 = (r45.gd1) cd1Var.getCustom(2);
            jSONObject2.put("longitude", gd1Var2 != null ? java.lang.Float.valueOf(gd1Var2.getFloat(0)) : null);
            jSONObject.put("lastUserLocation", jSONObject2);
        }
        if (cd1Var2 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            r45.gd1 gd1Var3 = (r45.gd1) cd1Var2.getCustom(2);
            jSONObject3.put("latitude", gd1Var3 != null ? java.lang.Float.valueOf(gd1Var3.getFloat(1)) : null);
            r45.gd1 gd1Var4 = (r45.gd1) cd1Var2.getCustom(2);
            jSONObject3.put("longitude", gd1Var4 != null ? java.lang.Float.valueOf(gd1Var4.getFloat(0)) : null);
            jSONObject.put("materialLbsLocation", jSONObject3);
        }
        return jz5.f0.f302826a;
    }
}
