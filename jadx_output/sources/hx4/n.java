package hx4;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f285680d;

    public n(hx4.p pVar) {
        this.f285680d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hx4.p pVar = this.f285680d;
        jx4.a aVar = pVar.f285682a;
        lx4.j jVar = pVar.f285687f;
        ((com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) aVar).getClass();
        if (jVar != null) {
            jVar.show();
        }
        hx4.s.b(pVar.f285683b, 1, pVar.f285685d);
    }
}
