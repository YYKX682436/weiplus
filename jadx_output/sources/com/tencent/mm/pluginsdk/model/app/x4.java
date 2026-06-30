package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class x4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.z4 f189141d;

    public x4(com.tencent.mm.pluginsdk.model.app.z4 z4Var) {
        this.f189141d = z4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.z4 z4Var = this.f189141d;
        java.lang.String str2 = z4Var.f189193q;
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", z4Var.f189193q);
            z4Var.f189190n = false;
            z4Var.f189191o.removeMessages(1);
            return 0;
        }
        if (i17 != 0) {
            z4Var.f189190n = false;
            z4Var.f189191o.removeMessages(1);
            ((d73.i) i95.n0.c(d73.i.class)).Qi(z4Var.f189186g, "");
            return 0;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = z4Var.f189187h;
        long j17 = dVar.field_status;
        if (j17 == 105) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "attach upload has paused, status:%d", java.lang.Long.valueOf(j17));
            z4Var.f189190n = false;
            z4Var.f189191o.removeMessages(1);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(z4Var.f189193q);
            return 0;
        }
        if (gVar != null) {
            dVar.field_lastModifyTime = c01.id.e();
            com.tencent.mm.pluginsdk.model.app.d dVar2 = z4Var.f189187h;
            long j18 = gVar.field_finishedLength;
            dVar2.field_offset = j18;
            z4Var.f189188i = j18;
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i18), hVar.field_arg, hVar.field_transInfo, "", "", "", "", "", "", "", hVar.f241767b);
                z4Var.f189190n = false;
                z4Var.f189191o.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Qi(z4Var.f189186g, "");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttachForHandOff", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.field_exist_whencheck), com.tencent.mm.sdk.platformtools.t8.G1(z4Var.f189187h.field_signature));
                z4Var.f189190n = false;
                z4Var.f189191o.removeMessages(1);
                ((d73.i) i95.n0.c(d73.i.class)).Kg(z4Var.f189186g, hVar.field_fileId, hVar.field_aesKey);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
