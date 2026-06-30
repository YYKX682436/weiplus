package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public final class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f159081d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f159082e;

    /* renamed from: f, reason: collision with root package name */
    public final long f159083f;

    public w(long j17, int i17, com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo scanImagePHashInfo, int i18, kotlin.jvm.internal.i iVar) {
        java.lang.String str;
        java.lang.String str2;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f159083f = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yi();
        lVar.f70665b = new r45.zi();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/imgretrieval/aiscan_image_scene_preview";
        lVar.f70667d = 5079;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f159082e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageScenePreviewRequest");
        r45.yi yiVar = (r45.yi) fVar;
        yiVar.f391115g = j17;
        yiVar.f391116h = i17;
        java.lang.String str3 = "";
        yiVar.f391113e = (scanImagePHashInfo == null || (str2 = scanImagePHashInfo.pHash) == null) ? "" : str2;
        if (scanImagePHashInfo != null && (str = scanImagePHashInfo.pHashVersion) != null) {
            str3 = str;
        }
        yiVar.f391114f = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageScenePreview", "NetSceneAiScanImageScenePreview sessionId: %d, seqNum: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f159081d = callback;
        return dispatch(dispatcher, this.f159082e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5079;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageScenePreview", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f159081d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
