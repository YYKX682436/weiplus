package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class cb implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186015e;

    public cb(nw4.k kVar, nw4.y2 y2Var) {
        this.f186014d = kVar;
        this.f186015e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindPhone :");
        sb6.append(iPCString != null ? iPCString.f68406d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestBindPhoneNumber.", sb6.toString());
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.bb(this.f186014d, this.f186015e, iPCString));
    }
}
