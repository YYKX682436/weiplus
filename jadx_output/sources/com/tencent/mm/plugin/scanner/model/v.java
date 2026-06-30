package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes9.dex */
public final class v extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f159075d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f159076e;

    /* renamed from: f, reason: collision with root package name */
    public final long f159077f;

    public v(byte[] bArr, long j17, int i17, int i18, int i19, r45.cj cjVar, r45.vi viVar, com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo scanImagePHashInfo, hz3.b bVar, hz3.a aVar, java.util.ArrayList arrayList, java.lang.String chatUUID) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(chatUUID, "chatUUID");
        this.f159077f = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.aj();
        lVar.f70665b = new r45.bj();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_scene";
        lVar.f70667d = 1100;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f159076e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageSceneRequest");
        r45.aj ajVar = (r45.aj) fVar;
        ajVar.f370030e = i17;
        ajVar.f370031f = i18;
        ajVar.f370034i = i19;
        if (bArr != null) {
            ajVar.f370029d = com.tencent.mm.protobuf.g.b(bArr);
        }
        ajVar.f370032g = j17;
        ajVar.f370035m = cjVar;
        ajVar.f370036n = viVar;
        java.lang.String str3 = "";
        ajVar.f370038p = (scanImagePHashInfo == null || (str2 = scanImagePHashInfo.pHash) == null) ? "" : str2;
        if (scanImagePHashInfo != null && (str = scanImagePHashInfo.pHashVersion) != null) {
            str3 = str;
        }
        ajVar.f370039q = str3;
        if (bVar != null) {
            ajVar.f370043u = bVar.f286314a;
            ajVar.f370044v = bVar.f286315b;
        }
        ajVar.f370046x = chatUUID;
        if (arrayList != null) {
            ajVar.f370045w.addAll(arrayList);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneAiScanImageScene imageSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", type: ");
        sb6.append(i17);
        sb6.append(", mode: ");
        sb6.append(i18);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", seqNum: ");
        sb6.append(i19);
        sb6.append(", cdnUploadResult: ");
        sb6.append(aVar);
        sb6.append(", cdnInfoList: ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append(", chat_uuid=");
        sb6.append(chatUUID);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageScene", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f159075d = callback;
        return dispatch(dispatcher, this.f159076e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1100;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageScene", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f159075d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
