package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.l4 f188972d;

    public k4(com.tencent.mm.pluginsdk.model.app.l4 l4Var) {
        this.f188972d = l4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.l4 l4Var = this.f188972d;
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = l4Var.f188982a;
        w4Var.f189121o = false;
        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var.f189115f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        dVar.field_createTime = java.lang.System.currentTimeMillis();
        l4Var.f188982a.f189115f.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.d dVar2 = l4Var.f188982a.f189115f;
        dVar2.field_offset = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(true);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar2.field_status = 101;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", java.lang.Boolean.valueOf(l4Var.f188982a.f189121o), java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().update(l4Var.f188982a.f189115f, new java.lang.String[0])), java.lang.Long.valueOf(l4Var.f188982a.f189115f.field_createTime));
        com.tencent.mm.pluginsdk.model.app.w4 w4Var2 = l4Var.f188982a;
        w4Var2.doScene(w4Var2.dispatcher(), l4Var.f188982a.f189114e);
    }
}
