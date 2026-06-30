package pk2;

/* loaded from: classes3.dex */
public final class t7 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356266h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356266h = helper.D;
        this.f356267i = "anchorlive.more.shareqrcode";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.ui.MMActivity mMActivity;
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f364427a;
        if (o9Var2 == null || (mMActivity = o9Var2.f356078d) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.c3[] c3VarArr = ml2.c3.f327331d;
        java.lang.String jSONObject2 = jSONObject.put("type", 2).toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B1, jSONObject2, null, 4, null);
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        pk2.g8.a(g8Var, null, null, new pk2.s7(mMActivity, o9Var, null), 3, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356267i;
    }

    @Override // qk2.f
    public boolean o() {
        return pm0.v.z(((mm2.c1) this.f364427a.c(mm2.c1.class)).Q1, 16384);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356266h;
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.e_h);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_filled_qr_code, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478502m));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.c3[] c3VarArr = ml2.c3.f327331d;
        java.lang.String jSONObject2 = jSONObject.put("type", 1).toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B1, jSONObject2, null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356266h;
    }
}
