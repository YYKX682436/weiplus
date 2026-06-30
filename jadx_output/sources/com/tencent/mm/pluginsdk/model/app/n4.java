package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.o4 f188997d;

    public n4(com.tencent.mm.pluginsdk.model.app.o4 o4Var) {
        this.f188997d = o4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene again");
        com.tencent.mm.pluginsdk.model.app.o4 o4Var = this.f188997d;
        com.tencent.mm.pluginsdk.model.app.w4 w4Var = o4Var.f189012b.f189110d;
        w4Var.doScene(w4Var.dispatcher(), o4Var.f189012b.f189110d.f189114e);
    }
}
