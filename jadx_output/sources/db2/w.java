package db2;

/* loaded from: classes2.dex */
public final class w extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, java.lang.String str, int i17, r45.qt2 qt2Var, java.lang.String exportId, boolean z17, int i18, com.tencent.mm.protobuf.g gVar, int i19, kotlin.jvm.internal.i iVar) {
        super(qt2Var, null, 2, null);
        exportId = (i19 & 16) != 0 ? "" : exportId;
        z17 = (i19 & 32) != 0 ? false : z17;
        i18 = (i19 & 64) != 0 ? 0 : i18;
        gVar = (i19 & 128) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(exportId, "exportId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.uw0 uw0Var = new r45.uw0();
        uw0Var.set(2, java.lang.Long.valueOf(j17));
        uw0Var.set(3, java.lang.Integer.valueOf(i18));
        uw0Var.set(5, exportId);
        uw0Var.set(7, java.lang.Integer.valueOf(i17));
        uw0Var.set(8, gVar);
        uw0Var.set(6, java.lang.Integer.valueOf(z17 ? 2 : 0));
        int integer = qt2Var != null ? qt2Var.getInteger(5) : 0;
        uw0Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, integer));
        db2.t4.f228171a.h((r45.kv0) uw0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(integer), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = uw0Var;
        r45.vw0 vw0Var = new r45.vw0();
        vw0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) vw0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = vw0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderclickfeedback";
        lVar.f70667d = 11026;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderFeedBack", "[CgiFinderFeedBack] feedId=" + j17 + " feedbackType=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.vw0 resp = (r45.vw0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderClickFeedBack", "[CgiFinderClickFeedBack] onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
