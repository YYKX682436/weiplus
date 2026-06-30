package pk2;

/* loaded from: classes3.dex */
public final class r7 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f356216h;

    /* renamed from: i, reason: collision with root package name */
    public final int f356217i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356216h = "anchorlive.more.handoff";
        this.f356217i = helper.f356110t;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.ui.MMActivity mMActivity;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.o9 o9Var2 = this.f364427a;
        if (o9Var2 == null || (mMActivity = o9Var2.f356078d) == null) {
            return;
        }
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r)) {
            db5.t7.g(mMActivity, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d_3));
            return;
        }
        com.tencent.mm.plugin.handoff.model.HandOff c17 = wg2.a.f445720a.c(o9Var.f356074b);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHandOffUtil", "openHandOff " + c17);
            ((d73.i) i95.n0.c(d73.i.class)).f6(c17);
        }
        db5.t7.i(mMActivity, i65.a.r(mMActivity, com.tencent.mm.R.string.dxf), com.tencent.mm.R.raw.icons_outlined_colorful_handoff_success);
        if (o9Var.f356076c == 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.n3[] n3VarArr = ml2.n3.f327736d;
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.f327215J, java.lang.String.valueOf(2), 0L, null, null, null, null, null, 252, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.z4 z4Var = ml2.z4.K;
        ml2.n3[] n3VarArr2 = ml2.n3.f327736d;
        zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356216h;
    }

    @Override // qk2.f
    public boolean o() {
        return wg2.a.f445720a.a();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (wg2.a.f445720a.a()) {
            int i17 = this.f356217i;
            java.lang.String string = o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dxe);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_colorful_handoff, 0);
            if (!n()) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                ml2.n3[] n3VarArr = ml2.n3.f327736d;
                r0Var.getClass();
                ml2.r0.hj(r0Var, ml2.b4.f327215J, java.lang.String.valueOf(1), 0L, null, null, null, null, null, 252, null);
                return;
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.K;
            ml2.n3[] n3VarArr2 = ml2.n3.f327736d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(1), null, 4, null);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356217i;
    }
}
