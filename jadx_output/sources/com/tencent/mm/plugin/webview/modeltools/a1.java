package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.c1 f183240d;

    public a1(com.tencent.mm.plugin.webview.modeltools.c1 c1Var) {
        this.f183240d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f183240d.f183247a.destroy();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e17.getMessage());
        }
    }
}
