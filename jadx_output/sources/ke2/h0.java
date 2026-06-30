package ke2;

/* loaded from: classes.dex */
public final class h0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f306955u;

    public h0(com.tencent.mm.protobuf.g gVar) {
        super(null, 1, null);
        this.f306955u = "CgiFinderLiveReservedNoticeList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 16827;
        r45.su1 su1Var = new r45.su1();
        su1Var.set(2, gVar);
        su1Var.set(1, db2.t4.f228171a.a(16827));
        lVar.f70664a = su1Var;
        lVar.f70665b = new r45.tu1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetreservednoticelist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveReservedNoticeList", "last_buffer:" + su1Var.getByteString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tu1 resp = (r45.tu1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306955u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
