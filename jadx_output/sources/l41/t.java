package l41;

/* loaded from: classes4.dex */
public final class t extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315924d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315925e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jk0 f315926f;

    public t(java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9146;
        lVar.f70666c = "/cgi-bin/micromsg-bin/encryptforwardwxworkmsg";
        lVar.f70664a = new r45.ik0();
        lVar.f70665b = new r45.jk0();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315925e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgReq");
        r45.ik0 ik0Var = (r45.ik0) fVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            linkedList.addAll(list);
        }
        ik0Var.f377106d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f315924d = callback;
        return dispatch(dispatcher, this.f315925e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 9146;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetForwardWeWorkMsg", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f315925e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgResp");
            this.f315926f = (r45.jk0) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f315924d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
