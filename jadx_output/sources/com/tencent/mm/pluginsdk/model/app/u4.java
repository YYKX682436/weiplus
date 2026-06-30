package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class u4 implements com.tencent.mm.pluginsdk.model.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f189091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v4 f189092b;

    public u4(com.tencent.mm.pluginsdk.model.app.v4 v4Var, dn.h hVar) {
        this.f189092b = v4Var;
        this.f189091a = hVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.d4
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.model.app.v4 v4Var = this.f189092b;
        if (i17 != 4 || i18 != 102) {
            if (i17 == 0 && i18 == 0) {
                v4Var.f189110d.J(this.f189091a);
            }
            com.tencent.mm.pluginsdk.model.app.w4 w4Var = v4Var.f189110d;
            w4Var.f189114e.onSceneEnd(i17, i18, "", w4Var);
            return;
        }
        com.tencent.mm.pluginsdk.model.app.w4 w4Var2 = v4Var.f189110d;
        if (w4Var2.f189115f.field_totalLen <= 26214400) {
            gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.t4(this));
            return;
        }
        w4Var2.f189116g.T = "";
        if (!((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
            gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.s4(this));
            return;
        }
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var3 = v4Var.f189110d;
        e17.g(new g35.e(w4Var3.f189116g, w4Var3.f189115f.field_fileFullPath, w4Var3.f189117h, new com.tencent.mm.pluginsdk.model.app.r4(this)));
    }
}
