package pk2;

/* loaded from: classes3.dex */
public final class l2 extends qk2.h {

    /* renamed from: m, reason: collision with root package name */
    public static final pk2.i2 f355938m = new pk2.i2(null);

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f355939n = "";

    /* renamed from: h, reason: collision with root package name */
    public r45.v71 f355940h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f355941i;

    /* renamed from: j, reason: collision with root package name */
    public final int f355942j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f355943k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f355944l;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f355945r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355942j = helper.U;
        this.f355943k = "";
        this.f355944l = true;
        this.f355945r = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        if (n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 14);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 10);
            jSONObject2.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c18, 37L, jSONObject2.toString(), null, 4, null);
        }
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            kotlinx.coroutines.l.d(j17, null, null, new pk2.k2(this, o9Var, null), 3, null);
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f355944l;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355943k;
    }

    @Override // qk2.f
    public boolean o() {
        boolean n17 = n();
        pk2.o9 o9Var = this.f364427a;
        if (n17 && zl2.r4.F1(o9Var.f356074b)) {
            return false;
        }
        if (!n()) {
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var != null ? r5Var.b7(5) : false) {
                return false;
            }
        }
        return true;
    }

    @Override // qk2.f
    public boolean r() {
        return this.f355945r;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355942j;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e8o);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_finder_live_notice, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.l1 l1Var = n() ? ml2.l1.f327685i : ml2.l1.f327684h;
        y4Var.getClass();
        y4Var.f328295e0 = l1Var;
        if (n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 14);
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 10);
            jSONObject2.put("type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
        }
        kotlinx.coroutines.y0 j17 = j();
        jz5.f0 f0Var = null;
        if (j17 != null) {
            this.f355941i = kotlinx.coroutines.l.d(j17, null, null, new pk2.j2(this, o9Var, null), 3, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(o9Var.f356072a, "addItem: scope is null, scene=" + this.f364428b);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f355942j;
    }
}
