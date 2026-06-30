package nl3;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338191d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f338192e;

    public d(java.util.LinkedList reqInfos) {
        kotlin.jvm.internal.o.g(reqInfos, "reqInfos");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6473;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetlink";
        lVar.f70664a = new r45.zr4();
        lVar.f70665b = new r45.bs4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f338192e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetLinkReq");
        ((r45.zr4) fVar).f392334d = reqInfos;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[");
        java.util.Iterator it = reqInfos.iterator();
        while (it.hasNext()) {
            r45.as4 as4Var = (r45.as4) it.next();
            stringBuffer.append("(");
            stringBuffer.append(as4Var.f370240d);
            stringBuffer.append(",");
            stringBuffer.append(as4Var.f370241e);
            stringBuffer.append("),");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneMusicLiveGetLink", "request music url:%s", stringBuffer.substring(0, stringBuffer.length() - 1) + ']');
    }

    public final java.util.LinkedList H() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar = this.f338192e;
        if (oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            return null;
        }
        return ((r45.bs4) fVar).f371024d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f338191d = callback;
        return dispatch(dispatcher, this.f338192e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6473;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneMusicLiveGetLink", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f338191d;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f338192e.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetLinkResp");
        com.tencent.mm.modelbase.u0 u0Var2 = this.f338191d;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
