package pk2;

/* loaded from: classes3.dex */
public final class n2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356026h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356027i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356026h = helper.f356104q;
        this.f356027i = n() ? "anchorlive.more.silent" : "startlive.more.silent";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean n17 = n();
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        if (n17) {
            if (((mm2.c1) o9Var.c(mm2.c1.class)).O4) {
                db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.d4e));
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.f327999x, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.y6((zy2.zb) c18, ml2.z4.D, "2", null, 4, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.zb.y6((zy2.zb) c19, ml2.z4.D, "1", null, 4, null);
                db5.t7.h(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.f491460d52));
                i95.m c27 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                zy2.zb.T8((zy2.zb) c27, ml2.t1.f327996w, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", !((mm2.c1) o9Var.c(mm2.c1.class)).O4);
            o9Var.j(qo0.b.f365401p4, bundle);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e eVar = o9Var.f356074b;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O4) {
            i95.m c28 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            zy2.zb.T8((zy2.zb) c28, ml2.t1.f327999x, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
            r4Var.A2(eVar, mMActivity, false);
            i95.m c29 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c29, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c29;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 22L, "2", null, 4, null);
            return;
        }
        i95.m c37 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c37, "getService(...)");
        zy2.zb.T8((zy2.zb) c37, ml2.t1.f327996w, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
        r4Var.A2(eVar, mMActivity, true);
        i95.m c38 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c38, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c38;
        ml2.c1 c1Var2 = ml2.c1.f327325e;
        zy2.zb.j5(zbVar2, 22L, "1", null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356027i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.w1() && !r4Var.x1()) {
            return;
        }
        boolean n17 = n();
        int i17 = com.tencent.mm.R.raw.icons_outlined_mic_on;
        if (!n17) {
            if (r4Var.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.f364427a.c(mm2.g1.class)).f329068f).getValue())) {
                return;
            }
            gk2.e eVar = o9Var.f356074b;
            boolean z17 = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O4;
            com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
            if (z17) {
                string = mMActivity.getResources().getString(com.tencent.mm.R.string.dwx);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
            } else {
                string = mMActivity.getResources().getString(com.tencent.mm.R.string.dxy);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.I8((zy2.zb) c18, ml2.u1.A, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327915e), null, null, null, null, false, 124, null);
                i17 = com.tencent.mm.R.raw.icons_outlined_mic_off;
            }
            s(menu, o9Var.f356104q, string, i17);
            return;
        }
        if (!((mm2.c1) o9Var.c(mm2.c1.class)).f328778a5 || ((mm2.e1) o9Var.c(mm2.e1.class)).f7()) {
            if (sn0.b.f409964e2 != null) {
                return;
            }
            boolean z18 = ((mm2.c1) o9Var.c(mm2.c1.class)).O4;
            int i18 = this.f356026h;
            if (z18) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwx);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                s(menu, i18, string2, com.tencent.mm.R.raw.icons_outlined_mic_on);
                i95.m c19 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.zb.I8((zy2.zb) c19, ml2.u1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
                return;
            }
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dxy);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            s(menu, i18, string3, com.tencent.mm.R.raw.icons_outlined_mic_off);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            zy2.zb.I8((zy2.zb) c27, ml2.u1.A, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356026h;
    }
}
