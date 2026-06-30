package pk2;

/* loaded from: classes3.dex */
public final class z0 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f356407h;

    /* renamed from: i, reason: collision with root package name */
    public final int f356408i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f356409j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356407h = n() ? "anchorlive.more.fansgroup" : "startlive.more.fansgroup";
        this.f356408i = helper.f356114v;
        this.f356409j = true;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.plugin.finder.live.widget.cf cfVar;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean z17 = false;
        if (n()) {
            qo0.b bVar = qo0.b.O4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
            o9Var.j(bVar, bundle);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.M, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 1);
            jSONObject.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.M, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
            pk2.j9 j9Var = o9Var.f356084g;
            if (j9Var != null) {
                if (j9Var.f355886b == null) {
                    com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
                    android.view.View findViewById = mMActivity.findViewById(android.R.id.content);
                    kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                    com.tencent.mm.plugin.finder.live.widget.e5 e5Var = new com.tencent.mm.plugin.finder.live.widget.e5(mMActivity, (android.view.ViewGroup) findViewById, null);
                    j9Var.f355886b = e5Var;
                    kotlinx.coroutines.y0 scope = j9Var.f355885a;
                    kotlin.jvm.internal.o.g(scope, "scope");
                    e5Var.f118226a.setScope(scope);
                }
                r45.eq1 eq1Var = ((mm2.n2) o9Var.f356074b.a(mm2.n2.class)).f329279g;
                if (eq1Var != null && eq1Var.getBoolean(1)) {
                    com.tencent.mm.plugin.finder.live.widget.e5 e5Var2 = j9Var.f355886b;
                    if (e5Var2 != null) {
                        e5Var2.f118226a.h(null, true);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.widget.e5 e5Var3 = j9Var.f355886b;
                    if (e5Var3 != null && (cfVar = e5Var3.f118227b) != null) {
                        cfVar.f0();
                    }
                }
            }
        }
        pk2.o9 o9Var2 = this.f364427a;
        df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_OPEN_FANS_CLUB)) {
            z17 = true;
        }
        if (z17) {
            df2.dd ddVar = df2.od.f230952w;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar2 = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar2 != null ? odVar2.f230958r : null, 40);
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f356409j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356407h;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        r45.eq1 eq1Var = ((mm2.n2) o9Var.c(mm2.n2.class)).f329279g;
        boolean z17 = eq1Var != null && eq1Var.getBoolean(4);
        if (this.f364428b != 1) {
            return z17;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        return ((r5Var != null ? r5Var.b7(8) : false) ^ true) && z17;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        pk2.o9 o9Var2 = this.f364427a;
        df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
        if (odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_OPEN_FANS_CLUB)) {
            df2.dd ddVar = df2.od.f230952w;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar2 = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar2 != null ? odVar2.f230958r : null, 40);
            int i17 = this.f356408i;
            com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
            java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.dxb);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = mMActivity.getString(com.tencent.mm.R.string.mpo);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            u(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_fans, string2, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478554ao));
        } else {
            r(menu, this.f356408i, com.tencent.mm.R.string.dxb, com.tencent.mm.R.raw.icons_outlined_fans);
        }
        if (n()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.Q, "1", null, 4, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            return;
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c19;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 27L, "1", null, 4, null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 1);
        jSONObject.put("type", 1);
        i95.m c27 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        zy2.zb.j5((zy2.zb) c27, 37L, jSONObject.toString(), null, 4, null);
        i95.m c28 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c28, "getService(...)");
        zy2.zb.I8((zy2.zb) c28, ml2.u1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356408i;
    }
}
