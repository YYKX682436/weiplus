package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class j4 implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.w4 f188947a;

    public j4(com.tencent.mm.pluginsdk.model.app.w4 w4Var) {
        this.f188947a = w4Var;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "onUploadFailure, errCode:%s, uploadID:%s", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188947a;
        long j17 = w4Var.f189115f.systemRowid;
        java.util.Map map = bu.a.f24473a;
        bu.b bVar = new bu.b();
        bVar.f24474a = 4;
        java.lang.String jSONObject = new org.json.JSONObject().put("errCode", i17).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        bVar.f24475b = jSONObject;
        com.tencent.mm.pluginsdk.model.app.k0.N(j17, bVar);
        com.tencent.mm.pluginsdk.model.app.u5.wi().get(w4Var.f189118i, w4Var.f189115f);
        w4Var.f189115f.field_signature = "";
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", -1, java.lang.Long.valueOf(w4Var.f189118i), java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0])));
        w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
        com.tencent.mm.pluginsdk.model.app.w4.H(w4Var, null);
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        com.tencent.mm.pluginsdk.model.app.e wi6 = com.tencent.mm.pluginsdk.model.app.u5.wi();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188947a;
        wi6.get(w4Var.f189118i, w4Var.f189115f);
        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
        long j18 = dVar.field_status;
        if (j18 == 105 || j18 == 199) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig parallelUpload onUploadProgress, upload has paused, status:%s", java.lang.Long.valueOf(j18));
            z25.d dVar2 = w4Var.f189123q;
            if (dVar2 != null) {
                dVar2.f();
            }
            if (w4Var.f189124r) {
                return;
            }
            w4Var.f189124r = true;
            w4Var.f189114e.onSceneEnd(3, 0, "attach  has paused, status" + w4Var.f189115f.field_status, w4Var);
            return;
        }
        dVar.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.d dVar3 = w4Var.f189115f;
        if (dVar3.field_offset < j17) {
            dVar3.field_offset = j17;
        }
        boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0]);
        if (update) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + update);
        fp.k.a();
        w4Var.getClass();
        w4Var.f189114e.onSceneEnd(3, -1, "", w4Var);
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", jVar.f469824b, jVar.f469823a, java.lang.Long.valueOf(jVar.f469826d));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188947a;
        long j17 = w4Var.f189125s;
        dn.h hVar = new dn.h();
        hVar.field_aesKey = jVar.f469824b;
        hVar.field_fileId = jVar.f469823a;
        hVar.field_filemd5 = jVar.f469825c;
        hVar.field_fileLength = jVar.f469826d;
        com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
        java.lang.String str = w4Var.f189115f.field_fileFullPath;
        cj6.getClass();
        hVar.field_filecrc = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcFileCrc32(com.tencent.mm.vfs.w6.i(str, false));
        com.tencent.mm.pluginsdk.model.app.w4.H(w4Var, jVar.f469825c);
        w4Var.f189115f.field_status = 199L;
        boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0]);
        if (update) {
            com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
            com.tencent.mm.pluginsdk.model.app.k0.y(dVar.field_msgInfoId, dVar.field_msgInfoTalker, dVar.field_mediaSvrId, hVar, true);
            com.tencent.mm.pluginsdk.model.app.d dVar2 = w4Var.f189115f;
            c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.e4(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId, true, hVar, new com.tencent.mm.pluginsdk.model.app.l4(w4Var), w4Var.f189122p, dVar2));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + update);
        fp.k.a();
        w4Var.getClass();
        w4Var.f189114e.onSceneEnd(3, 0, "", w4Var);
    }
}
