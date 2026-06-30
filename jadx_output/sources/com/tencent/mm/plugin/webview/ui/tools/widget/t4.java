package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class t4 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter f187542a;

    public t4(com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter) {
        this.f187542a = mPSmileyFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            this.f187542a.f187044i.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsUploadSayFooter", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter = this.f187542a;
        mPSmileyFooter.f187044i.getInputConnection().sendKeyEvent(new android.view.KeyEvent(0, 67));
        mPSmileyFooter.f187044i.getInputConnection().sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
