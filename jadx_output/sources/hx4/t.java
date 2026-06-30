package hx4;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI f285693d;

    public t(com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI browserChooseUI) {
        this.f285693d = browserChooseUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hx4.p pVar = this.f285693d.f183999d;
        pVar.c();
        hx4.s.a(pVar.f285683b, 1, pVar.f285685d);
    }
}
