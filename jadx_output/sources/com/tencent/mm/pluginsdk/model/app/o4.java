package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class o4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v4 f189012b;

    public o4(com.tencent.mm.pluginsdk.model.app.v4 v4Var, int i17) {
        this.f189012b = v4Var;
        this.f189011a = i17;
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
        com.tencent.mm.pluginsdk.model.app.v4 v4Var = this.f189012b;
        objArr[6] = java.lang.Boolean.valueOf(v4Var.f189110d.f189116g == null);
        objArr[7] = java.lang.Boolean.valueOf(v4Var.f189110d.f189121o);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload not exist_whencheck call back new errMsg[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mm.pluginsdk.model.app.d dVar = v4Var.f189110d.f189115f;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
            Li.r1(5);
            bu.a.e(Li.getMsgId(), bu.a.c(0, 0, str, 727));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.e1(c01.w9.o(v4Var.f189110d.f189117h));
            f9Var.u1(v4Var.f189110d.f189117h);
            f9Var.d1(str);
            f9Var.setType(10000);
            f9Var.r1(6);
            f9Var.j1(0);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar2 = v4Var.f189110d.f189115f;
        dVar2.field_signature = str4;
        dVar2.field_fakeAeskey = str5;
        dVar2.field_fakeSignature = str6;
        dVar2.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = v4Var.f189110d;
        ot0.q qVar = w4Var.f189116g;
        if (qVar != null) {
            qVar.f348710t = str2;
            qVar.T = str3;
            qVar.f348682m = j17;
            com.tencent.mm.pluginsdk.model.app.d dVar3 = w4Var.f189115f;
            com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(dVar3.field_msgInfoTalker, dVar3.field_msgInfoId);
            Li2.d1(ot0.q.u(v4Var.f189110d.f189116g, null, null));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li2.getMsgId(), Li2, true);
        }
        v4Var.f189110d.f189121o = false;
        boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(v4Var.f189110d.f189115f, new java.lang.String[0]);
        if (update) {
            gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.n4(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + update);
        com.tencent.mm.pluginsdk.model.app.w4 w4Var2 = v4Var.f189110d;
        fp.k.a();
        w4Var2.getClass();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var3 = v4Var.f189110d;
        w4Var3.f189114e.onSceneEnd(3, this.f189011a, "", w4Var3);
    }
}
