package ez0;

/* loaded from: classes4.dex */
public final class f implements uy0.g {

    /* renamed from: a, reason: collision with root package name */
    public static final ez0.f f257790a = new ez0.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.storage.u3 f257791b;

    static {
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MAAS_SHOW_ALBUM_TEMPLATE_TIP_STRING_SYNC;
        f257791b = u3Var;
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "checkRepairerAutoDeleteStorageDisplayRecord: ");
            if (1 != bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsAlbumActivityTemplateTipForAutoDeleteRecord()) || kotlin.jvm.internal.o.b(gm0.j1.u().c().v(u3Var, ""), "")) {
                return;
            }
            gm0.j1.u().c().x(u3Var, "");
            ((ku5.t0) ku5.t0.f312615d).B(ez0.e.f257789d);
        }
    }

    public void a(uy0.n action) {
        kotlin.jvm.internal.o.g(action, "action");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callOnTipActionUpdate: ");
        int i17 = action.f431906d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.MaasTipActionReportStruct maasTipActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasTipActionReportStruct();
        maasTipActionReportStruct.f59014d = i17;
        maasTipActionReportStruct.f59015e = maasTipActionReportStruct.b("sessionid_", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi(), true);
        maasTipActionReportStruct.k();
    }
}
