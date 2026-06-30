package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h24 f185207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 f185208e;

    public j2(com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var, r45.h24 h24Var) {
        this.f185208e = k2Var;
        this.f185207d = h24Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.h24 h24Var = this.f185207d;
        java.util.LinkedList linkedList = h24Var.f375774e;
        java.lang.String str = h24Var.f375775f;
        java.lang.String str2 = h24Var.f375776g;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var = this.f185208e;
        com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.x6(k2Var.f185228d.f184975d);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.i2 i2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.i2(this);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = k2Var.f185226b;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
            k2Var.f185228d.i5(k2Var.f185225a, "authorize:fail", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
        } else {
            if (x6Var.a(linkedList, str, str2, null, i2Var)) {
                return;
            }
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) e8Var).a();
        }
    }
}
