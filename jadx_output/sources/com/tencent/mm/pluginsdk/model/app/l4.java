package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class l4 implements com.tencent.mm.pluginsdk.model.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.w4 f188982a;

    public l4(com.tencent.mm.pluginsdk.model.app.w4 w4Var) {
        this.f188982a = w4Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.d4
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new com.tencent.mm.pluginsdk.model.app.k4(this));
        } else {
            com.tencent.mm.pluginsdk.model.app.w4 w4Var = this.f188982a;
            w4Var.f189114e.onSceneEnd(i17, i18, "", w4Var);
        }
    }
}
