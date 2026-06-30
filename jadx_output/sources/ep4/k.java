package ep4;

/* loaded from: classes.dex */
public final class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f255758d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f255759e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f255760f;

    /* renamed from: g, reason: collision with root package name */
    public int f255761g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f255762h;

    /* renamed from: i, reason: collision with root package name */
    public long f255763i;

    public k(java.lang.String finderUserName, java.lang.String inputText) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        this.f255758d = inputText;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findertexttospeech";
        lVar.f70667d = 5207;
        r45.qz2 qz2Var = new r45.qz2();
        qz2Var.set(2, finderUserName);
        qz2Var.set(3, inputText);
        lVar.f70664a = qz2Var;
        lVar.f70665b = new r45.rz2();
        this.f255759e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFinderTextToSpeech", "doScene");
        this.f255760f = u0Var;
        return dispatch(sVar, this.f255759e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5207;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd error");
        }
        com.tencent.mm.protobuf.f fVar = this.f255759e.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTextToSpeechResp");
        r45.rz2 rz2Var = (r45.rz2) fVar;
        com.tencent.mm.protobuf.g byteString = rz2Var.getByteString(1);
        this.f255762h = byteString != null ? byteString.f192156a : null;
        this.f255763i = rz2Var.getLong(2);
        com.tencent.mm.modelbase.u0 u0Var = this.f255760f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
