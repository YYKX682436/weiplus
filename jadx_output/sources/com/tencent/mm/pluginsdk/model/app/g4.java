package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class g4 implements com.tencent.mm.pluginsdk.model.app.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.h4 f188912a;

    public g4(com.tencent.mm.pluginsdk.model.app.h4 h4Var) {
        this.f188912a = h4Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.d4
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.model.app.h4 h4Var = this.f188912a;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.pluginsdk.model.app.k0.N(h4Var.f188922e.f189115f.systemRowid, bu.a.c(i18, i17, "", com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT));
        }
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = h4Var.f188922e;
        w4Var.f189114e.onSceneEnd(i17, i18, "", w4Var);
    }
}
