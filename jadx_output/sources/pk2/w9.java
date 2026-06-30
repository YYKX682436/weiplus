package pk2;

/* loaded from: classes3.dex */
public final class w9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356335h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356335h = helper.f356102p;
        this.f356336i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.d8h));
        } else {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327724f, 2);
            o9Var.j(qo0.b.f365351f4, null);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356336i;
    }

    @Override // qk2.f
    public boolean o() {
        kn0.g gVar;
        r45.ka4 ka4Var;
        pk2.o9 o9Var = this.f364427a;
        if (pm0.v.z(((mm2.c1) o9Var.c(mm2.c1.class)).Q1, 2048) && ((mm2.c1) o9Var.c(mm2.c1.class)).S) {
            kn0.i iVar = ((mm2.e1) o9Var.c(mm2.e1.class)).f328990t;
            if (!com.tencent.mm.sdk.platformtools.t8.K0((iVar == null || (gVar = iVar.f309558b) == null || (ka4Var = gVar.f309548o) == null) ? null : ka4Var.f378559z) && !zl2.r4.f473950a.p2(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s)) {
                return true;
            }
        }
        return false;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String string;
        boolean z17;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "prepareVisitorMenuItems liveInfo:" + cm2.a.f43328a.y(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r));
        if (((mm2.c1) o9Var.c(mm2.c1.class)).C4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d8a));
            sb6.append('\n');
            km2.n0 n0Var = ((mm2.c1) o9Var.c(mm2.c1.class)).C4;
            sb6.append(n0Var != null ? n0Var.f309164a : null);
            string = sb6.toString();
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwz);
            kotlin.jvm.internal.o.d(string);
        }
        java.lang.String str = string;
        int i17 = this.f356335h;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m);
        if (((mm2.c1) o9Var.c(mm2.c1.class)).f328846n != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            if (!(finderObject != null && finderObject.getId() == 0)) {
                z17 = false;
                menu.j(i17, str, com.tencent.mm.R.raw.finder_live_icons_outlined_cast_screen, color, z17);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327723e, 2);
            }
        }
        z17 = true;
        menu.j(i17, str, com.tencent.mm.R.raw.finder_live_icons_outlined_cast_screen, color, z17);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327723e, 2);
    }

    @Override // qk2.h
    public int y() {
        return this.f356335h;
    }
}
