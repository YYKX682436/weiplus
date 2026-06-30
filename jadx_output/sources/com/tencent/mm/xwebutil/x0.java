package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class x0 implements com.tencent.xweb.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.e1 f214893a;

    public x0(com.tencent.xweb.e1 e1Var) {
        this.f214893a = e1Var;
    }

    @Override // com.tencent.xweb.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "onCoreInitFinished");
        com.tencent.mm.autogen.events.XWebViewInitCompleteEvent xWebViewInitCompleteEvent = new com.tencent.mm.autogen.events.XWebViewInitCompleteEvent();
        xWebViewInitCompleteEvent.f55003g.getClass();
        xWebViewInitCompleteEvent.e();
        com.tencent.xweb.e1 e1Var = this.f214893a;
        if (e1Var != null) {
            e1Var.a();
        }
    }

    @Override // com.tencent.xweb.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "onCoreInitFailed");
        com.tencent.mm.autogen.events.XWebViewInitCompleteEvent xWebViewInitCompleteEvent = new com.tencent.mm.autogen.events.XWebViewInitCompleteEvent();
        xWebViewInitCompleteEvent.f55003g.getClass();
        xWebViewInitCompleteEvent.e();
        com.tencent.xweb.e1 e1Var = this.f214893a;
        if (e1Var != null) {
            e1Var.b();
        }
    }
}
