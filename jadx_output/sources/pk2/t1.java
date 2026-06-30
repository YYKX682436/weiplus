package pk2;

/* loaded from: classes3.dex */
public final class t1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356259h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356259h = helper.f356081e0;
        this.f356260i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "onItemClicked");
        int i17 = this.f364428b;
        if (i17 == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 11);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        } else {
            pk2.f8.a(pk2.f8.f355747a, 15, 2, null, 4, null);
        }
        df2.p1 p1Var = (df2.p1) o9Var.e(df2.p1.class);
        if (p1Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", "openPanel, scene: " + i17);
            com.tencent.mm.ui.MMActivity N6 = p1Var.N6();
            if (N6 != null) {
                r45.v94 v94Var = ((mm2.c1) p1Var.business(mm2.c1.class)).Y5;
                if (v94Var != null) {
                    com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", "Current replay setting:[" + v94Var.getBoolean(0) + ',' + v94Var.getBoolean(1) + ',' + v94Var.getBoolean(2) + ',' + v94Var.getBoolean(3) + ']');
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingController", "Current replay setting is null");
                }
                new com.tencent.mm.plugin.finder.live.widget.m6(N6, i17, v94Var, new df2.o1(p1Var, i17)).w();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("FinderLiveAnchorLiveReplaySettingController", "Activity is null, cannot open panel");
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356260i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean z17 = ((mm2.c1) this.f364427a.c(mm2.c1.class)).X5;
        com.tencent.mars.xlog.Log.i("AnchorLiveReplaySettingOption", "isEnabled: " + z17);
        return z17;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.no9);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f356259h, string, com.tencent.mm.R.raw.live_replay_regular);
        if (this.f364428b != 1) {
            pk2.f8.a(pk2.f8.f355747a, 15, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 11);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356259h;
    }
}
