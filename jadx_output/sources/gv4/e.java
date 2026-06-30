package gv4;

/* loaded from: classes.dex */
public final class e extends aw4.y {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f276120i;

    /* renamed from: m, reason: collision with root package name */
    public su4.m1 f276121m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hv4.b uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f276120i = "MicroMsg.WebSearch.TagSearchWebData";
        gm0.j1.d().a(4614, this);
        gm0.j1.d().a(4858, this);
    }

    @Override // aw4.y
    public void e() {
        super.e();
        gm0.j1.d().q(4614, this);
        gm0.j1.d().q(4858, this);
    }

    @Override // aw4.y
    public void h(java.lang.String paramsStr) {
        kotlin.jvm.internal.o.g(paramsStr, "paramsStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(paramsStr);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            gm0.j1.d().g(new su4.t1(g(hashMap)));
        } catch (java.lang.Exception unused) {
        }
    }

    public final hv4.b k() {
        aw4.q qVar = this.f14844d;
        if (qVar instanceof hv4.b) {
            return (hv4.b) qVar;
        }
        return null;
    }

    @Override // aw4.y, aw4.a, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sn3 sn3Var;
        hv4.b k17;
        gv4.a b17;
        boolean z17;
        gv4.a b18;
        gv4.a b19;
        super.onSceneEnd(i17, i18, str, m1Var);
        com.tencent.mars.xlog.Log.i(this.f276120i, "onSceneEnd errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        jz5.f0 f0Var = null;
        if (!(m1Var instanceof su4.t1)) {
            if (m1Var instanceof su4.m1) {
                su4.m1 m1Var2 = (su4.m1) m1Var;
                if (m1Var2.f413010h == a() && kotlin.jvm.internal.o.b(m1Var, this.f276121m)) {
                    if (i17 == 0 && i18 == 0 && (sn3Var = m1Var2.f413009g) != null && (k17 = k()) != null) {
                        k17.M5(sn3Var, m1Var2.f413011i, m1Var2.f413008f.f385027i);
                    }
                    this.f276121m = null;
                    return;
                }
                return;
            }
            return;
        }
        su4.t1 t1Var = (su4.t1) m1Var;
        if (t1Var.f413101g.f413077q == a()) {
            if (i17 != 0 || i18 != 0) {
                hv4.b k18 = k();
                if (k18 == null || (b17 = k18.b()) == null) {
                    return;
                }
                su4.r1 r1Var = t1Var.f413101g;
                z17 = r1Var.f413063c == 0;
                java.lang.String requestId = r1Var.f413085y;
                kotlin.jvm.internal.o.f(requestId, "requestId");
                b17.q(z17, "{\"ret\":-1}", requestId);
                return;
            }
            r45.aa7 aa7Var = t1Var.f413100f;
            if (aa7Var != null) {
                hv4.b k19 = k();
                if (k19 != null && (b19 = k19.b()) != null) {
                    su4.r1 r1Var2 = t1Var.f413101g;
                    boolean z18 = r1Var2.f413063c == 0;
                    java.lang.String str2 = aa7Var.f369877f;
                    if (str2 == null) {
                        str2 = "{}";
                    }
                    java.lang.String requestId2 = r1Var2.f413085y;
                    kotlin.jvm.internal.o.f(requestId2, "requestId");
                    b19.q(z18, str2, requestId2);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var != null) {
                    return;
                }
            }
            hv4.b k27 = k();
            if (k27 == null || (b18 = k27.b()) == null) {
                return;
            }
            su4.r1 r1Var3 = t1Var.f413101g;
            z17 = r1Var3.f413063c == 0;
            java.lang.String requestId3 = r1Var3.f413085y;
            kotlin.jvm.internal.o.f(requestId3, "requestId");
            b18.q(z17, "{\"ret\":-1}", requestId3);
        }
    }
}
