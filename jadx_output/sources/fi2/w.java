package fi2;

/* loaded from: classes10.dex */
public final class w implements ah2.f {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.w f262915a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f262916b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f262917c;

    /* renamed from: d, reason: collision with root package name */
    public final ah2.a f262918d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f262919e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f262920f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f262921g;

    public w(zi2.w plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f262915a = plugin;
        this.f262916b = jz5.h.b(new fi2.r(this));
        this.f262917c = jz5.h.b(new fi2.u(this));
        this.f262918d = new fi2.q(this);
        this.f262919e = jz5.h.b(new fi2.p(this));
        this.f262920f = jz5.h.b(new fi2.t(this));
    }

    @Override // ah2.f
    public kotlinx.coroutines.y0 a() {
        kotlinx.coroutines.y0 a17 = this.f262915a.a();
        return a17 == null ? kotlinx.coroutines.z0.b() : a17;
    }

    @Override // ah2.f
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f262915a.w1().b(callback);
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j c() {
        return ((om2.g) this.f262915a.S0().a(om2.g.class)).f346305i;
    }

    @Override // ah2.f
    public void d(boolean z17) {
        if (zl2.r4.f473950a.x1()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", z17 ? 2 : 1);
            jSONObject.put("pos", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.V1, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327250n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", z17 ? 2 : 1);
        jSONObject2.put("pos", 1);
        ml2.r0.hj(r0Var, b4Var, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j e() {
        return ((om2.g) this.f262915a.S0().a(om2.g.class)).f346303g;
    }

    @Override // ah2.f
    public mh2.n0 f() {
        return (mh2.n0) ((jz5.n) this.f262916b).getValue();
    }

    @Override // ah2.f
    public void g() {
        this.f262915a.u1();
    }

    @Override // ah2.f
    public boolean h() {
        return false;
    }

    @Override // ah2.f
    public void i() {
        sf2.d3 d3Var = (sf2.d3) this.f262915a.U0(sf2.d3.class);
        if (d3Var != null) {
            d3Var.v7(fn2.u1.f264415m, 5);
        }
    }

    @Override // ah2.f
    public void j(fn2.u1 sourceScene, java.lang.String str) {
        kotlin.jvm.internal.o.g(sourceScene, "sourceScene");
        sf2.d3 d3Var = (sf2.d3) this.f262915a.U0(sf2.d3.class);
        if (d3Var != null) {
            d3Var.w7(-1, sourceScene, fn2.v1.f264423f, str);
        }
    }

    @Override // ah2.f
    public boolean k() {
        zi2.w wVar = this.f262915a;
        tn0.w0 Z0 = wVar.Z0();
        if (Z0 != null) {
            return Z0.D.g(java.lang.Long.valueOf(((mm2.e1) wVar.P0(mm2.e1.class)).f328988r.getLong(0)));
        }
        return false;
    }

    @Override // ah2.f
    public kotlinx.coroutines.flow.j l() {
        return ((om2.g) this.f262915a.S0().a(om2.g.class)).D;
    }

    public final mh2.k0 m() {
        return (mh2.k0) ((jz5.n) this.f262917c).getValue();
    }

    public final void n(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("not_song_cnt", ((java.lang.Number) ((jz5.l) ((kotlinx.coroutines.flow.h3) ((om2.g) this.f262915a.S0().a(om2.g.class)).F).getValue()).f302834e).intValue());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328373q2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.T2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }

    public final void o() {
        pm0.v.X(new fi2.v(((java.lang.Number) ((jz5.l) ((kotlinx.coroutines.flow.h3) ((om2.g) this.f262915a.S0().a(om2.g.class)).F).getValue()).f302834e).intValue(), (android.widget.TextView) ((fg2.n0) ((jz5.n) this.f262920f).getValue()).f262160a.findViewById(com.tencent.mm.R.id.ve6), this));
    }
}
