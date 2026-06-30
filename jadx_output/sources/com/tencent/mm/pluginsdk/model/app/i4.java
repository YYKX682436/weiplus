package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class i4 extends qr.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.w4 f188933a;

    public i4(com.tencent.mm.pluginsdk.model.app.w4 w4Var) {
        this.f188933a = w4Var;
    }

    @Override // qr.j
    public void a(int i17, java.lang.String str, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "EmojiUploadByCdn Success:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188933a;
        if (i17 != 0) {
            com.tencent.mm.pluginsdk.model.app.k0.N(w4Var.f189115f.systemRowid, bu.a.a(i17));
            w4Var.f189114e.onSceneEnd(3, i17, "", w4Var);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        java.lang.String o27 = m11.b1.Di().o2(Li, bm5.f0.f22564i, Li.z0());
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_EmojiUploadCDN";
        mVar.field_mediaId = "emoji_upload_" + w4Var.f189119m + java.lang.System.currentTimeMillis();
        mVar.field_appType = 1;
        mVar.field_fileType = 3;
        mVar.field_thumbpath = o27;
        mVar.field_bzScene = 0;
        mVar.field_force_aeskeycdn = true;
        mVar.field_talker = Li.Q0();
        mVar.f241787f = new com.tencent.mm.pluginsdk.model.app.h4(w4Var, hVar);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }
}
