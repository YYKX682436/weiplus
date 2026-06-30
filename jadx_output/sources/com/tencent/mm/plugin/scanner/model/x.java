package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes9.dex */
public final class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f159091d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f159092e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f159093f;

    public x(byte[] imageData, int i17, int i18, int i19, int i27, long j17, com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo, r45.ti tiVar, r45.ui uiVar, r45.vi viVar, r45.sk6 sk6Var) {
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(scanProductInfo, "scanProductInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f159093f = arrayList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ev5();
        lVar.f70665b = new r45.fv5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmbizscan_v2_upload";
        lVar.f70667d = 5105;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
        lVar.f70672i = o4Var != null ? o4Var.getInt("scan_config_upload_timeout", 5000) : 5000;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f159092e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScanV2UploadRequest");
        r45.ev5 ev5Var = (r45.ev5) fVar;
        ev5Var.f373744e = i19;
        ev5Var.f373743d = j17;
        ev5Var.f373745f = java.lang.System.currentTimeMillis() / 1000;
        ev5Var.f373746g = i27;
        ev5Var.f373747h = false;
        java.util.LinkedList linkedList = ev5Var.f373748i;
        r45.dv5 dv5Var = new r45.dv5();
        dv5Var.f372773f = com.tencent.mm.protobuf.g.b(imageData);
        java.util.LinkedList linkedList2 = dv5Var.f372772e;
        r45.qi qiVar = new r45.qi();
        arrayList.add(java.lang.Integer.valueOf(scanProductInfo.getId()));
        qiVar.f384006d = scanProductInfo.getId();
        com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = new com.tencent.mm.protocal.protobuf.GoodsObject();
        goodsObject.relative_minx = scanProductInfo.getX1();
        goodsObject.relative_miny = scanProductInfo.getY1();
        goodsObject.relative_maxx = scanProductInfo.getX2();
        goodsObject.relative_maxy = scanProductInfo.getY2();
        qiVar.f384007e = goodsObject;
        qiVar.f384008f = scanProductInfo.getProb();
        linkedList2.add(qiVar);
        dv5Var.f372774g = sk6Var;
        linkedList.add(dv5Var);
        ev5Var.f373750n = tiVar;
        ev5Var.f373751o = uiVar;
        ev5Var.f373749m = viVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneAiScanImageV2-mixed imageSize: ");
        sb6.append(imageData.length);
        sb6.append(", mode; ");
        sb6.append(i19);
        sb6.append(", scanType: ");
        sb6.append(i27);
        sb6.append(", prob: ");
        sb6.append(scanProductInfo.getProb());
        sb6.append(", trackId: ");
        sb6.append(scanProductInfo.getId());
        sb6.append(", isPreload: ");
        sb6.append(ev5Var.f373747h);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", mode: ");
        sb6.append(ev5Var.f373744e);
        sb6.append(", imageWidth: ");
        sb6.append(i17);
        sb6.append(", imageHeight: ");
        sb6.append(i18);
        sb6.append(", send_srv_time: ");
        sb6.append(ev5Var.f373745f);
        sb6.append(", touchPoint: ");
        sb6.append(sk6Var != null ? java.lang.Float.valueOf(sk6Var.f385818d) : null);
        sb6.append(", ");
        sb6.append(sk6Var != null ? java.lang.Float.valueOf(sk6Var.f385819e) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageV2", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f159091d = callback;
        return dispatch(dispatcher, this.f159092e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5105;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        r45.qi qiVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageV2", "onGYNetEnd errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str + ", type: 5105");
        com.tencent.mm.modelbase.u0 u0Var = this.f159091d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.protobuf.f fVar = this.f159092e.f70711b.f70700a;
        java.lang.String str2 = null;
        r45.fv5 fv5Var = fVar != null ? (r45.fv5) fVar : null;
        if (fv5Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd reqKey: ");
            java.util.LinkedList mark_results = fv5Var.f374625d;
            kotlin.jvm.internal.o.f(mark_results, "mark_results");
            r45.ri riVar = (r45.ri) kz5.n0.Z(mark_results);
            if (riVar != null && (linkedList = riVar.f384885h) != null && (qiVar = (r45.qi) kz5.n0.Z(linkedList)) != null) {
                str2 = qiVar.f384009g;
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAiScanImageV2", sb6.toString());
        }
    }
}
