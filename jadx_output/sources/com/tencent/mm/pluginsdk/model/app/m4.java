package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class m4 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.h f188987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v4 f188988c;

    public m4(com.tencent.mm.pluginsdk.model.app.v4 v4Var, int i17, dn.h hVar) {
        this.f188988c = v4Var;
        this.f188986a = i17;
        this.f188987b = hVar;
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
        com.tencent.mm.pluginsdk.model.app.v4 v4Var = this.f188988c;
        objArr[6] = java.lang.Boolean.valueOf(v4Var.f189110d.f189116g == null);
        objArr[7] = java.lang.Boolean.valueOf(v4Var.f189110d.f189121o);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload exist_whencheck call back new errMsg:[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mm.pluginsdk.model.app.d dVar = v4Var.f189110d.f189115f;
            dVar.field_signature = str4;
            dVar.field_fakeAeskey = str5;
            dVar.field_fakeSignature = str6;
            v4Var.a(this.f188986a, this.f188987b);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar2 = v4Var.f189110d.f189115f;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId);
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
    }
}
