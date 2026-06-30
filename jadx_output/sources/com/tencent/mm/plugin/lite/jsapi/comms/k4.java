package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class k4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.l4 f143635a;

    public k4(com.tencent.mm.plugin.lite.jsapi.comms.l4 l4Var) {
        this.f143635a = l4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.lite.jsapi.comms.l4 l4Var = this.f143635a;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = l4Var.f143656g;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenWeRun", "invoke() called errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            l4Var.f143443f.d(false);
            return fVar;
        }
        l4Var.f143443f.a("fail");
        return fVar;
    }
}
