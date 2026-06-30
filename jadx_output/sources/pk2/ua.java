package pk2;

/* loaded from: classes3.dex */
public final class ua extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356293h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356293h = helper.N;
        this.f356294i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        qo0.b bVar = qo0.b.f365374k4;
        android.os.Bundle bundle = new android.os.Bundle();
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f8()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.X1;
            cl0.g gVar = new cl0.g();
            gVar.h("type", "2");
            gVar.h("operate_way", "1");
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            ml2.r0.hj(r0Var, b4Var, r26.i0.t(gVar2, ",", ";", false), 0L, null, null, null, null, null, 252, null);
            bundle.putBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", false);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c18;
            ml2.b4 b4Var2 = ml2.b4.X1;
            cl0.g gVar3 = new cl0.g();
            gVar3.h("type", "1");
            gVar3.h("operate_way", "1");
            java.lang.String gVar4 = gVar3.toString();
            kotlin.jvm.internal.o.f(gVar4, "toString(...)");
            ml2.r0.hj(r0Var2, b4Var2, r26.i0.t(gVar4, ",", ";", false), 0L, null, null, null, null, null, 252, null);
            bundle.putBoolean("PARAM_FINDER_LIVE_ONLY_AUDIO_MODE_SWITCH", true);
        }
        o9Var.j(bVar, bundle);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356294i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        return (!((mm2.c1) o9Var.c(mm2.c1.class)).d7() || ((mm2.e1) o9Var.c(mm2.e1.class)).g7() || zl2.r4.f473950a.X1(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s)) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("link mic state ");
        pk2.o9 o9Var2 = this.f364427a;
        sb6.append(((mm2.o4) o9Var2.c(mm2.o4.class)).C);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, sb6.toString());
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z17 = true;
        if (!(w0Var != null && w0Var.X())) {
            mm2.g0 g0Var = (mm2.g0) o9Var2.c(mm2.g0.class);
            if (!(((mm2.c1) g0Var.business(mm2.c1.class)).e8() && !((mm2.g0) g0Var.business(mm2.g0.class)).O6()) && !((mm2.o4) o9Var2.c(mm2.o4.class)).E7()) {
                z17 = false;
            }
        }
        boolean f86 = ((mm2.c1) o9Var.c(mm2.c1.class)).f8();
        int i17 = this.f356293h;
        if (f86) {
            menu.l(i17, o9Var2.f356078d.getResources().getString(com.tencent.mm.R.string.dyb), com.tencent.mm.R.raw.icons_outlined_eyes_on, z17);
        } else {
            menu.l(i17, o9Var2.f356078d.getResources().getString(com.tencent.mm.R.string.f491692dy0), com.tencent.mm.R.raw.ear2_regular, z17);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356293h;
    }
}
