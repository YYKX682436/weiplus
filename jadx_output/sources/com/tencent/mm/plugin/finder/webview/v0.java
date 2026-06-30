package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class v0 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136933a;

    public v0(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136933a = n1Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        try {
            this.f136933a.f().getInvoke().favEditTag();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "favorite edittag fail, ex = " + e17.getMessage());
        }
    }
}
