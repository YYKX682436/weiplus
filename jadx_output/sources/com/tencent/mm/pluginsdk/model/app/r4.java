package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class r4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.u4 f189055a;

    public r4(com.tencent.mm.pluginsdk.model.app.u4 u4Var) {
        this.f189055a = u4Var;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = com.tencent.mm.sdk.platformtools.t8.G1(str3);
        objArr[3] = com.tencent.mm.sdk.platformtools.t8.G1(str4);
        objArr[4] = com.tencent.mm.sdk.platformtools.t8.G1(str5);
        objArr[5] = com.tencent.mm.sdk.platformtools.t8.G1(str6);
        com.tencent.mm.pluginsdk.model.app.u4 u4Var = this.f189055a;
        objArr[6] = java.lang.Boolean.valueOf(u4Var.f189092b.f189110d.f189116g == null);
        objArr[7] = java.lang.Boolean.valueOf(u4Var.f189092b.f189110d.f189121o);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload2 exist_whencheck call back new errMsg:[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mm.pluginsdk.model.app.d dVar = u4Var.f189092b.f189110d.f189115f;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
            Li.r1(5);
            bu.a.e(Li.getMsgId(), bu.a.c(0, 0, str, 727));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "NetSceneCheckBigFileUpload2 get signature fail");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = u4Var.f189092b.f189110d;
        com.tencent.mm.pluginsdk.model.app.d dVar2 = w4Var.f189115f;
        dVar2.field_signature = str4;
        dVar2.field_fakeAeskey = str5;
        dVar2.field_fakeSignature = str6;
        ot0.q qVar = w4Var.f189116g;
        if (qVar != null) {
            qVar.T = str3;
            com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId);
            Li2.d1(ot0.q.u(u4Var.f189092b.f189110d.f189116g, null, null));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li2.getMsgId(), Li2, true);
        }
        gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.q4(this));
    }
}
