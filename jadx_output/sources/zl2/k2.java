package zl2;

/* loaded from: classes2.dex */
public final class k2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f473858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f473859g;

    public k2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, r45.qt2 qt2Var, int i17) {
        this.f473856d = baseFinderFeed;
        this.f473857e = context;
        this.f473858f = qt2Var;
        this.f473859g = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        r45.qw1 qw1Var;
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473856d;
        ya2.b2 contact = baseFinderFeed.getContact();
        java.lang.String str = contact != null ? contact.field_username : null;
        android.content.Context context = this.f473857e;
        if (r26.i0.q(str, xy2.c.e(context), false, 2, null)) {
            z17 = true;
        } else {
            zl2.q4 q4Var = zl2.q4.f473933a;
            boolean C = q4Var.C(baseFinderFeed);
            r45.qt2 qt2Var = this.f473858f;
            if (C) {
                kotlin.jvm.internal.o.d(g4Var);
                q4Var.a(g4Var);
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.T2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "8")), qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
            }
            int i17 = this.f473859g;
            if (i17 != 3 && i17 != 1) {
                com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
                kotlin.jvm.internal.o.d(g4Var);
                y4Var.h(context, g4Var, baseFinderFeed);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.u1 u1Var = ml2.u1.S1;
                jz5.l[] lVarArr = new jz5.l[4];
                r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
                lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()));
                lVarArr[2] = new jz5.l("panel_sence", i17 == 1005 ? "2" : "4");
                lVarArr[3] = new jz5.l("sessionBuffer", baseFinderFeed.g0());
                zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), qt2Var != null ? qt2Var.getString(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null), null, null, false, 112, null);
            }
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.u1 u1Var2 = ml2.u1.T1;
            jz5.l[] lVarArr2 = new jz5.l[3];
            r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null));
            z17 = true;
            lVarArr2[1] = new jz5.l("feedid", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
            lVarArr2[2] = new jz5.l("panel_sence", i17 != 1005 ? "4" : "2");
            zy2.zb.I8(zbVar2, u1Var2, kz5.c1.l(lVarArr2), qt2Var != null ? qt2Var.getString(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null), null, null, false, 112, null);
            g4Var.g(101, context.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        java.lang.String string = (object_extend == null || (qw1Var = (r45.qw1) object_extend.getCustom(14)) == null) ? null : qw1Var.getString(0);
        if ((string == null || string.length() == 0) ? z17 : false) {
            return;
        }
        g4Var.g(211, "统计(内部)", com.tencent.mm.R.raw.icons_outlined_more2);
    }
}
