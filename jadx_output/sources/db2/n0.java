package db2;

/* loaded from: classes3.dex */
public final class n0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f228076t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228077u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(byte[] bArr, long j17, long j18, java.util.List boxList, java.lang.String anchorUserName, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(boxList, "boxList");
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        this.f228076t = boxList;
        this.f228077u = "Finder.CgiFinderGetBoxMsgTips";
        r45.ur1 ur1Var = new r45.ur1();
        ur1Var.f387587d = db2.t4.f228171a.b(11382, qt2Var);
        ur1Var.f387588e = com.tencent.mm.protobuf.g.b(bArr);
        ur1Var.f387589f = j17;
        ur1Var.f387590g = j18;
        ur1Var.f387591h.addAll(boxList);
        ur1Var.f387592i = anchorUserName;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ur1Var;
        r45.vr1 vr1Var = new r45.vr1();
        vr1Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = vr1Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = vr1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetboxmsgtips";
        lVar.f70667d = 11382;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetBoxMsgTips", "CgiFinderGetBoxMsgTips init ");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.vr1 resp = (r45.vr1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228077u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
