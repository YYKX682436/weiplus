package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class h4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.h f188921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.w4 f188922e;

    public h4(com.tencent.mm.pluginsdk.model.app.w4 w4Var, dn.h hVar) {
        this.f188922e = w4Var;
        this.f188921d = hVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188922e;
        if (i17 != 0) {
            com.tencent.mm.pluginsdk.model.app.k0.N(w4Var.f189115f.systemRowid, bu.a.b(i17));
            w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
            return 0;
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback progress: %s, %s, %s", java.lang.Integer.valueOf(gVar.field_status), java.lang.Long.valueOf(gVar.field_finishedLength), java.lang.Long.valueOf(gVar.field_toltalLength));
        }
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "cdn callback result: %s, %s", java.lang.Integer.valueOf(hVar.field_retCode), hVar.f241772g);
            int i18 = hVar.field_retCode;
            if (i18 == 0) {
                w4Var.f189115f.field_status = 199L;
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(w4Var.f189115f, new java.lang.String[0]);
                com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
                Li.d1(ot0.q.u(ot0.q.v(Li.j()), w4Var.f189115f.field_mediaSvrId, hVar));
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
                com.tencent.mm.pluginsdk.model.app.d dVar2 = w4Var.f189115f;
                c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.e4(dVar2.field_msgInfoTalker, dVar2.field_msgInfoId, true, this.f188921d, new com.tencent.mm.pluginsdk.model.app.g4(this), w4Var.f189122p, dVar2));
            } else {
                com.tencent.mm.pluginsdk.model.app.k0.N(w4Var.f189115f.systemRowid, bu.a.a(i18));
                w4Var.f189114e.onSceneEnd(3, hVar.field_retCode, "", w4Var);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
