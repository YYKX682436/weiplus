package ke2;

/* loaded from: classes.dex */
public final class b0 extends az2.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f306932u = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ke2.z promoteInfoReq) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(promoteInfoReq, "promoteInfoReq");
        this.f306933t = "Finder.CgiFinderLiveModPromoteInfo";
        r45.og1 og1Var = new r45.og1();
        og1Var.set(1, db2.t4.f228171a.a(6254));
        long j17 = promoteInfoReq.f307002a;
        og1Var.set(3, java.lang.Long.valueOf(j17));
        long j18 = promoteInfoReq.f307003b;
        og1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        og1Var.set(2, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null);
        int i17 = promoteInfoReq.f307004c;
        og1Var.set(5, java.lang.Integer.valueOf(i17));
        og1Var.set(6, promoteInfoReq.f307005d);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = og1Var;
        r45.pg1 pg1Var = new r45.pg1();
        pg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pg1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = pg1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchormodpromoteinfolist";
        lVar.f70667d = 6254;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModPromoteInfo", "init liveId:" + j18 + ", objectId:" + j17 + ", op_type" + i17);
        xy2.b bVar = xy2.b.f458155b;
        java.lang.String string = og1Var.getString(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", kotlin.jvm.internal.o.b(string, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f328852o : null), null, "Finder.CgiFinderLiveModPromoteInfo", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.pg1 resp = (r45.pg1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306933t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.a0.f306931d);
                return;
            default:
                return;
        }
    }
}
