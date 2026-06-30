package kz3;

/* loaded from: classes9.dex */
public final class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f313941d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f313942e;

    /* renamed from: f, reason: collision with root package name */
    public final long f313943f;

    public x(byte[] bArr, long j17, int i17, int i18, hz3.b bVar, hz3.a aVar, java.util.ArrayList arrayList, int i19, kotlin.jvm.internal.i iVar) {
        bArr = (i19 & 1) != 0 ? null : bArr;
        bVar = (i19 & 16) != 0 ? null : bVar;
        arrayList = (i19 & 64) != 0 ? null : arrayList;
        this.f313943f = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ml();
        lVar.f70665b = new r45.nl();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/imgretrieval/ocr_chat_image";
        lVar.f70667d = 5131;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f313942e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizOcrChatImageRequest");
        r45.ml mlVar = (r45.ml) fVar;
        mlVar.f380620p = j17;
        mlVar.f380612e = i17;
        mlVar.f380621q = i18;
        if (bArr != null) {
            mlVar.f380611d = com.tencent.mm.protobuf.g.b(bArr);
        }
        if (bVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizImageOCR", "NetSceneBizImageOCR decodeResult: %s, %s", java.lang.Integer.valueOf(bVar.f286314a), java.lang.Integer.valueOf(bVar.f286315b));
            mlVar.f380617m = bVar.f286314a;
            mlVar.f380618n = bVar.f286315b;
        }
        java.util.LinkedList linkedList = mlVar.f380619o;
        if (arrayList != null) {
            linkedList.addAll(arrayList);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneBizImageOCR imageSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", source: ");
        sb6.append(i17);
        sb6.append(", seqNum: ");
        sb6.append(i18);
        sb6.append(", cdn_image_list: ");
        sb6.append(linkedList);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizImageOCR", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f313941d = callback;
        return dispatch(dispatcher, this.f313942e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5131;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizImageOCR", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f313941d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
