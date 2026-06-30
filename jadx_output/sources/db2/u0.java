package db2;

/* loaded from: classes3.dex */
public final class u0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.qm1 f228185t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228186u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(byte[] bArr, r45.qm1 boxId, com.tencent.mm.protobuf.g gVar, long j17, long j18, java.lang.String anchorUserName, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        this.f228185t = boxId;
        this.f228186u = "Finder.CgiFinderGetFriendBoxLiveMsg";
        r45.o61 o61Var = new r45.o61();
        o61Var.f381973d = db2.t4.f228171a.b(11261, qt2Var);
        o61Var.f381974e = com.tencent.mm.protobuf.g.b(bArr);
        o61Var.f381975f = boxId;
        o61Var.f381976g = gVar;
        o61Var.f381977h = j17;
        o61Var.f381978i = j18;
        o61Var.f381979m = anchorUserName;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = o61Var;
        r45.p61 p61Var = new r45.p61();
        p61Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = p61Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = p61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfriendboxlivemsg";
        lVar.f70667d = 11261;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetFriendBoxLiveMsg", "CgiFinderGetFriendBoxLiveMsg init ");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.p61 resp = (r45.p61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228186u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
