package x83;

/* loaded from: classes5.dex */
public final class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f452569d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f452570e;

    public h(java.lang.String nickName, java.lang.String bindMobile, int i17, boolean z17, java.lang.String extRegUrl, java.lang.String fileId, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(bindMobile, "bindMobile");
        kotlin.jvm.internal.o.g(extRegUrl, "extRegUrl");
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gn0();
        lVar.f70665b = new r45.hn0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/extreg";
        lVar.f70667d = 5888;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f452570e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        r45.gn0 gn0Var = (r45.gn0) fVar;
        gn0Var.f375369d = nickName;
        gn0Var.f375370e = bindMobile;
        gn0Var.f375371f = i17;
        gn0Var.f375372g = z17 ? 1 : 0;
        gn0Var.f375375m = extRegUrl;
        gn0Var.f375376n = fileId;
        gn0Var.f375377o = aesKey;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtReg", "fileId:" + fileId + ", aesKey:" + aesKey);
    }

    public final void H(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f452570e.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        ((r45.gn0) fVar).f375373h = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtReg", "setRegSessionId %s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s autoAuth, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(autoAuth, "autoAuth");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f452569d = callback;
        return dispatch(autoAuth, this.f452570e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5888;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) rr6;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegRequest");
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
        com.tencent.mm.modelbase.u0 u0Var = this.f452569d;
        kotlin.jvm.internal.o.d(u0Var);
        u0Var.onSceneEnd(i18, i19, str, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneExtReg", "errType:" + i18 + ", errCode:" + i19 + ", errType:" + str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 rr6) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }
}
