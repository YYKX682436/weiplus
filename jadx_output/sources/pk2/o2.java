package pk2;

/* loaded from: classes3.dex */
public final class o2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356053h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356053h = helper.S;
        this.f356054i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        int i17 = this.f364428b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17 == 0 ? 2 : i17 == 3 ? 1 : -1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 2);
        if (valueOf == null || valueOf.intValue() != -1) {
            jSONObject.put("userType", valueOf);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerInfo = ");
        pk2.o9 o9Var2 = this.f364427a;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) o9Var2.f356074b.a(mm2.c1.class)).f328822i5;
        if (finderJumpInfo == null || (obj = pm0.b0.g(finderJumpInfo)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, sb7, null);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = ((mm2.c1) o9Var2.f356074b.a(mm2.c1.class)).f328822i5;
        if (finderJumpInfo2 != null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(o9Var2.f356078d, finderJumpInfo2, null);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356054i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f364427a;
        return r4Var.y1(o9Var.f356074b) && ((mm2.c1) o9Var.f356074b.a(mm2.c1.class)).f328822i5 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f364428b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17 == 0 ? 2 : i17 == 3 ? 1 : -1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 1);
        if (valueOf == null || valueOf.intValue() != -1) {
            jSONObject.put("userType", valueOf);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        java.lang.String string = o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.m98);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f356053h, string, com.tencent.mm.R.raw.icons_outlined_bellring_close);
    }

    @Override // qk2.h
    public int y() {
        return this.f356053h;
    }
}
