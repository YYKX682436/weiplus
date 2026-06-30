package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l24 f185093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 f185095f;

    public f2(com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var, r45.l24 l24Var, java.lang.String str) {
        this.f185095f = g2Var;
        this.f185093d = l24Var;
        this.f185094e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.l24 l24Var = this.f185093d;
        java.util.LinkedList linkedList = l24Var.f379088f;
        java.lang.String str = l24Var.f379089g;
        java.lang.String str2 = l24Var.f379090h;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var = this.f185095f;
        com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.x6(g2Var.f185125d.f184975d);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e2 e2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.e2(this);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = g2Var.f185123b;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
            g2Var.f185125d.i5(g2Var.f185122a, "login:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
        } else {
            if (x6Var.a(linkedList, str, str2, null, e2Var)) {
                return;
            }
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
        }
    }
}
