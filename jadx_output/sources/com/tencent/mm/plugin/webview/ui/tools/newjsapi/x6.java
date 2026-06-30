package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class x6 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186656a;

    public x6(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186656a = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "onCallback#successCallback, state: " + num);
        com.tencent.mm.ipcinvoker.r rVar = this.f186656a;
        if (rVar != null) {
            kotlin.jvm.internal.o.d(num);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(num.intValue()));
        }
    }
}
