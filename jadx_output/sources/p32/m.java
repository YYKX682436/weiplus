package p32;

/* loaded from: classes4.dex */
public final class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f351502d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f351503e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mo3 f351504f;

    public m(r45.lo3 request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneGetSportHistory", "create NetSceneGetSportHistory, " + request.f379674d);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4835;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/rank/getsportrecordhistory";
        lVar.f70664a = request;
        lVar.f70665b = new r45.mo3();
        this.f351503e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f351502d = u0Var;
        return dispatch(sVar, this.f351503e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4835;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f351503e;
            com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSportRecordHistoryResponse");
            this.f351504f = (r45.mo3) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f351502d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
