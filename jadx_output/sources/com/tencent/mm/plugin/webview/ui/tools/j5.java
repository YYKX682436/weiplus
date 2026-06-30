package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class j5 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f184858a;

    public j5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f184858a = b5Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        try {
            this.f184858a.f183947o.getController().A.favEditTag();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "favorite edittag fail, ex = " + e17.getMessage());
        }
    }
}
