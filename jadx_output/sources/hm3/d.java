package hm3;

/* loaded from: classes8.dex */
public final class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f282234d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282235e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282236f;

    public d(s45.g musicInfo, int i17, int i18, java.lang.String cacheKey) {
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        kotlin.jvm.internal.o.g(cacheKey, "cacheKey");
        this.f282234d = cacheKey;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8167;
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listenitem";
        lVar.f70664a = new s45.e();
        lVar.f70665b = new s45.f();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282236f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemRequest");
        s45.e eVar = (s45.e) fVar;
        eVar.f402977f = musicInfo;
        eVar.f402976e = i17;
        eVar.f402978g = i18;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[req_type:");
        stringBuffer.append(i17);
        stringBuffer.append(",scene:");
        stringBuffer.append(i18);
        stringBuffer.append("musicInfo:" + musicInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMMListenItem", "request music info:%s", stringBuffer.substring(0, stringBuffer.length() + (-1)) + ']');
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f282235e = u0Var;
        return dispatch(sVar, this.f282236f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8167;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMMListenItem", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282235e;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282236f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse");
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282235e;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
