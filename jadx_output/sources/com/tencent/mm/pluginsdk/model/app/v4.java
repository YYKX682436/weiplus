package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class v4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.w4 f189110d;

    public v4(com.tencent.mm.pluginsdk.model.app.w4 w4Var) {
        this.f189110d = w4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final void a(int i17, dn.h hVar) {
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f189110d;
        w4Var.f189115f.field_status = 199L;
        boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0]);
        if (update) {
            com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
            com.tencent.mm.pluginsdk.model.app.k0.y(dVar.field_msgInfoId, dVar.field_msgInfoTalker, dVar.field_mediaSvrId, hVar, true);
            com.tencent.mm.pluginsdk.model.app.d dVar2 = w4Var.f189115f;
            c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.e4(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId, true, hVar, new com.tencent.mm.pluginsdk.model.app.u4(this, hVar), w4Var.f189122p, dVar2));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + update);
        fp.k.a();
        w4Var.getClass();
        w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f189110d;
        java.lang.String str2 = w4Var.f189126t;
        com.tencent.mm.pluginsdk.model.app.u5.wi().get(w4Var.f189118i, w4Var.f189115f);
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", w4Var.f189126t);
            return 0;
        }
        if (i17 != 0) {
            com.tencent.mm.pluginsdk.model.app.k0.N(w4Var.f189115f.systemRowid, bu.a.b(i17));
            com.tencent.mm.pluginsdk.model.app.u5.wi().get(w4Var.f189118i, w4Var.f189115f);
            w4Var.f189115f.field_signature = "";
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(w4Var.f189118i), java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0])));
            w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
            com.tencent.mm.pluginsdk.model.app.w4.H(w4Var, null);
            return 0;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
        long j17 = dVar.field_status;
        if (j17 == 105) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "attach upload has paused, status:%d, rowid:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(w4Var.f189118i));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(w4Var.f189126t);
            w4Var.f189114e.onSceneEnd(3, i17, "attach  has paused, status" + w4Var.f189115f.field_status, w4Var);
            return 0;
        }
        if (gVar != null) {
            dVar.field_lastModifyTime = c01.id.e();
            w4Var.f189115f.field_offset = gVar.field_finishedLength;
            boolean update = com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0]);
            if (!update) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + update);
                fp.k.a();
                w4Var.getClass();
                w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
            }
            return 0;
        }
        if (hVar != null) {
            com.tencent.mm.pluginsdk.model.app.w4.H(w4Var, hVar.field_filemd5);
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i18), hVar.field_arg, hVar.field_transInfo, "", "", "", "", "", "", "", hVar.f241767b);
                com.tencent.mm.pluginsdk.model.app.k0.N(w4Var.f189115f.systemRowid, bu.a.a(hVar.field_retCode));
                com.tencent.mm.pluginsdk.model.app.u5.wi().get(w4Var.f189118i, w4Var.f189115f);
                w4Var.f189115f.field_signature = "";
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] sceneResult.field_retCode[%d], rowid[%d], reset signature ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hVar.field_retCode), java.lang.Long.valueOf(w4Var.f189118i), java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0])));
                w4Var.f189114e.onSceneEnd(3, hVar.field_retCode, "", w4Var);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.field_exist_whencheck), com.tencent.mm.sdk.platformtools.t8.G1(w4Var.f189115f.field_signature));
                if (!z17) {
                    a(i17, hVar);
                } else if (!hVar.field_exist_whencheck) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig upload check but not exist");
                    if (((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                        c01.d9.e().g(new g35.e(null, w4Var.f189115f.field_fileFullPath, w4Var.f189117h, new com.tencent.mm.pluginsdk.model.app.o4(this, i17)));
                    } else {
                        w4Var.f189121o = false;
                        gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.p4(this));
                    }
                } else if (((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                    c01.d9.e().g(new g35.e(w4Var.f189116g, w4Var.f189115f.field_fileFullPath, w4Var.f189117h, new com.tencent.mm.pluginsdk.model.app.m4(this, i17, hVar)));
                } else {
                    a(i17, hVar);
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
