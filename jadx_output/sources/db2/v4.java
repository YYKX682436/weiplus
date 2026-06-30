package db2;

/* loaded from: classes2.dex */
public final class v4 extends az2.j {
    public v4(java.lang.String str) {
        super(null, null, 3, null);
        bw5.qe qeVar = new bw5.qe();
        bw5.sc scVar = new bw5.sc();
        scVar.parseFrom(db2.t4.f228171a.b(14246, this.f16135n).toByteArray());
        qeVar.f32056d = scVar;
        boolean[] zArr = qeVar.f32058f;
        zArr[2] = true;
        qeVar.f32057e = str == null ? "" : str;
        zArr[3] = true;
        bw5.re reVar = new bw5.re();
        reVar.BaseResponse = new r45.ie();
        reVar.f32499d[1] = true;
        r45.ie baseResponse = reVar.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qeVar;
        lVar.f70665b = reVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdeloftenreadauthor";
        lVar.f70667d = 21880;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.DelOftenReadAuthorReqCgi", "[init] request=" + com.tencent.mm.plugin.finder.viewmodel.component.i00.a(qeVar) + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        bw5.re resp = (bw5.re) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.DelOftenReadAuthorReqCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ", resp=" + com.tencent.mm.plugin.finder.viewmodel.component.i00.a(resp));
    }
}
