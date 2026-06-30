package db2;

/* loaded from: classes3.dex */
public final class l extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j17, java.lang.String str, int i17, java.lang.String reportData, java.lang.String bypassData) {
        super(null, null, 3, null);
        java.util.LinkedList list;
        r45.fl2 fl2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(reportData, "reportData");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8083;
        r45.lt0 lt0Var = new r45.lt0();
        lt0Var.set(2, reportData);
        lt0Var.set(3, bypassData);
        db2.t4 t4Var = db2.t4.f228171a;
        lt0Var.set(1, t4Var.a(8083));
        t4Var.h((r45.kv0) lt0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = lt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f70665b = mt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadcommentreport";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport init reportData: ".concat(reportData));
        r45.kv0 kv0Var = (r45.kv0) lt0Var.getCustom(1);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport sessionBuffer: ".concat((kv0Var == null || (list = kv0Var.getList(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(list)) == null || (string = fl2Var.getString(1)) == null) ? "" : string));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.mt0 resp = (r45.mt0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdCommentReport", "CgiFinderAdCommentReport onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
