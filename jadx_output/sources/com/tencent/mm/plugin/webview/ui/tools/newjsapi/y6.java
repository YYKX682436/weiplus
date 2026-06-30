package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class y6 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186679a;

    public y6(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186679a = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "onCallback#failCallback, errCode: " + num);
        com.tencent.mm.ipcinvoker.r rVar = this.f186679a;
        if (rVar != null) {
            kotlin.jvm.internal.o.d(num);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(num.intValue()));
        }
    }
}
