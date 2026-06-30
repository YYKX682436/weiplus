package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.u4 f189067d;

    public s4(com.tencent.mm.pluginsdk.model.app.u4 u4Var) {
        this.f189067d = u4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.u4 u4Var = this.f189067d;
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = u4Var.f189092b.f189110d;
        w4Var.f189121o = false;
        w4Var.f189115f.field_createTime = c01.id.a();
        com.tencent.mm.pluginsdk.model.app.v4 v4Var = u4Var.f189092b;
        v4Var.f189110d.f189115f.field_lastModifyTime = c01.id.e();
        com.tencent.mm.pluginsdk.model.app.w4 w4Var2 = v4Var.f189110d;
        com.tencent.mm.pluginsdk.model.app.d dVar = w4Var2.f189115f;
        dVar.field_offset = 0L;
        w4Var2.I(true);
        dVar.field_status = 101;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED skip checkbigfile doScene again enableHitcheck[%b], ret[%b] new createtime:%d", java.lang.Boolean.valueOf(v4Var.f189110d.f189121o), java.lang.Boolean.valueOf(com.tencent.mm.pluginsdk.model.app.u5.wi().update(v4Var.f189110d.f189115f, new java.lang.String[0])), java.lang.Long.valueOf(v4Var.f189110d.f189115f.field_createTime));
        com.tencent.mm.pluginsdk.model.app.w4 w4Var3 = v4Var.f189110d;
        w4Var3.doScene(w4Var3.dispatcher(), v4Var.f189110d.f189114e);
    }
}
