package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v4 f189035d;

    public p4(com.tencent.mm.pluginsdk.model.app.v4 v4Var) {
        this.f189035d = v4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene again");
        com.tencent.mm.pluginsdk.model.app.v4 v4Var = this.f189035d;
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = v4Var.f189110d;
        w4Var.doScene(w4Var.dispatcher(), v4Var.f189110d.f189114e);
    }
}
