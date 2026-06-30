package pk2;

/* loaded from: classes3.dex */
public final class u4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356282h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356283i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f356284j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356282h = helper.f356116w;
        this.f356283i = n() ? "anchorlive.more.anchorwish" : "startlive.more.anchorwish";
        this.f356284j = true;
        if (zl2.r4.f473950a.r()) {
            qk2.h.z(this, n() ? 24035 : 24002, 0, "live_more_anchor_wish", false, 2, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        if (ll2.e.f319133a.h(this.f356283i)) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "hasShowAnchorWishRedDot");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_WISH_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        boolean n17 = n();
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        if (n17) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.F1, null, null, null, null, null, false, 126, null);
            if (((mm2.c1) o9Var.c(mm2.c1.class)).m7() || ((mm2.c1) o9Var.c(mm2.c1.class)).Z5) {
                ((mm2.f7) o9Var.c(mm2.f7.class)).f329060h.postValue(new mm2.a7(true, qs5.s.f366465e));
            } else {
                db5.t7.h(mMActivity, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dk8));
            }
            pk2.f8.a(pk2.f8.f355747a, 3, 2, null, 4, null);
        } else {
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            gk2.e eVar = o9Var.f356074b;
            if (r4Var2.U1(eVar) || ((mm2.c1) o9Var.c(mm2.c1.class)).Z5) {
                ((mm2.f7) eVar.a(mm2.f7.class)).f329060h.postValue(new mm2.a7(true, qs5.s.f366465e));
            } else {
                db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.dk8));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 2);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f230952w;
            pk2.o9 o9Var2 = this.f364427a;
            gk2.e eVar2 = o9Var2.f356074b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar2, 2, 7, odVar != null ? odVar.f230958r : null, 38);
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f364427a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_LIVE_WISH_LIST);
    }

    public final boolean E(pk2.o9 o9Var) {
        ya2.b2 b17;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        r45.jx0 jx0Var = ((mm2.c1) o9Var.f356074b.a(mm2.c1.class)).f328795e2;
        boolean z17 = jx0Var != null ? jx0Var.getBoolean(0) : true;
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.j9 j9Var = o9Var.f356084g;
        boolean z18 = pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.field_liveSwitchFlag), 16384);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "isWishEnable isBlueAccount " + z17 + " isWishFlagEnable: " + z18);
        return z18 && z17;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f356284j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356283i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean n17 = n();
        pk2.o9 o9Var = this.f364427a;
        if (!n17 || !((mm2.c1) o9Var.c(mm2.c1.class)).f328836l3) {
            if (n() || !E(o9Var)) {
                return false;
            }
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
            if (r5Var != null ? r5Var.b7(9) : false) {
                return false;
            }
        }
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean n17 = n();
        int i17 = this.f356282h;
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        if (n17) {
            if (((mm2.c1) o9Var.c(mm2.c1.class)).f328836l3) {
                if (D()) {
                    int i18 = this.f356282h;
                    java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.ekt);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    java.lang.String string2 = mMActivity.getString(com.tencent.mm.R.string.mpo);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    u(menu, i18, string, com.tencent.mm.R.raw.icons_outlined_wish, string2, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478554ao));
                } else {
                    r(menu, i17, com.tencent.mm.R.string.ekt, com.tencent.mm.R.raw.icons_outlined_wish);
                }
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.B1, null, null, null, null, null, false, 126, null);
                pk2.f8.a(pk2.f8.f355747a, 3, 1, null, 4, null);
            }
        } else if (E(o9Var) && !zl2.r4.f473950a.X1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) o9Var.c(mm2.g1.class)).f329068f).getValue())) {
            if (D()) {
                int i19 = this.f356282h;
                java.lang.String string3 = mMActivity.getString(com.tencent.mm.R.string.ekt);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                java.lang.String string4 = mMActivity.getString(com.tencent.mm.R.string.mpo);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                u(menu, i19, string3, com.tencent.mm.R.raw.icons_outlined_wish, string4, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478554ao));
            } else {
                r(menu, i17, com.tencent.mm.R.string.ekt, com.tencent.mm.R.raw.icons_outlined_wish);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 2);
            jSONObject.put("type", 1);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        if (D()) {
            df2.dd ddVar = df2.od.f230952w;
            pk2.o9 o9Var2 = this.f364427a;
            gk2.e eVar = o9Var2.f356074b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 1, 7, odVar != null ? odVar.f230958r : null, 38);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356282h;
    }
}
