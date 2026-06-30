package ke2;

/* loaded from: classes.dex */
public final class x extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306996t;

    public x(long j17, long j18) {
        super(null, null, 2, null);
        this.f306996t = "Finder.CgiFinderLiveGetPromoteInfoList";
        r45.ig1 ig1Var = new r45.ig1();
        ig1Var.set(1, db2.t4.f228171a.a(5250));
        ig1Var.set(3, java.lang.Long.valueOf(j17));
        ig1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        ig1Var.set(2, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ig1Var;
        r45.jg1 jg1Var = new r45.jg1();
        jg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jg1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = jg1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchorgetpromoteinfolist";
        lVar.f70667d = 5250;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetPromoteInfoList", "init liveId:" + j18 + ", objectId:" + j17 + '}');
        xy2.b bVar = xy2.b.f458155b;
        java.lang.String string = ig1Var.getString(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", kotlin.jvm.internal.o.b(string, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f328852o : null), null, "Finder.CgiFinderLiveGetPromoteInfoList", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.jg1 resp = (r45.jg1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306996t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.w.f306992d);
                return;
            default:
                return;
        }
    }
}
