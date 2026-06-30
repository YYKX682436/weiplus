package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class d8 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f185057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185058e;

    public d8(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, long j17) {
        this.f185058e = c1Var;
        this.f185057d = j17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doUxSearchOpLog rsp errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.k77 k77Var = (r45.k77) oVar.f70711b.f70700a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("reqId", this.f185057d);
        bundle.putInt("ret", i18);
        com.tencent.mm.protobuf.g gVar = k77Var.f378478d;
        if (gVar != null) {
            gVar.i();
            bundle.putString("json", k77Var.f378478d.i());
        }
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = this.f185058e.f184998y;
            if (z0Var != null) {
                z0Var.callback(147, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHandler", e17, "", new java.lang.Object[0]);
        }
        return 0;
    }
}
