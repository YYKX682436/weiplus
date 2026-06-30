package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class r0 implements com.tencent.mm.plugin.scanner.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136921a;

    public r0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136921a = n1Var;
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void a(java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, boolean z17) {
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136921a;
        n1Var.b(4, imageQBarDataBean);
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        android.app.Activity activity = (android.app.Activity) n1Var.c();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        r3Var.f7780a = imageQBarDataBean.f158619d;
        r3Var.f7782c = imageQBarDataBean.f158620e;
        r3Var.f7783d = imageQBarDataBean.f158621f;
        r3Var.f7792m = imageQBarDataBean.f158627o;
        r3Var.f7788i = 40;
        r3Var.f7798s = imageQBarDataBean.f158626n;
        r3Var.f7797r = imageQBarDataBean.f158625m;
        r3Var.f7796q = imageQBarDataBean.f158630r;
        android.os.Bundle bundle = new android.os.Bundle();
        r3Var.f7791l = bundle;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "addStatInfo4AppBrand, from h5");
        bundle.putInt("LaunchCodeScene_ScanScene", 3);
        dealQBarStrEvent.e();
        com.tencent.mm.plugin.scanner.d0.f158718a.b(n1Var.f136907k.longValue(), z17 ? 1 : 2, arrayList, imageQBarDataBean, n1Var.f136908l.longValue(), 1, n1Var.d());
        n1Var.b(4, imageQBarDataBean);
        n1Var.f136897a.clear();
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void b(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.scanner.d0 d0Var = com.tencent.mm.plugin.scanner.d0.f158718a;
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136921a;
        d0Var.b(n1Var.f136907k.longValue(), 3, arrayList, null, n1Var.f136908l.longValue(), 1, n1Var.d());
        n1Var.f136897a.clear();
    }
}
