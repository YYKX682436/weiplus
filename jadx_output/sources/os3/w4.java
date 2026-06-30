package os3;

/* loaded from: classes8.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.y4 f348244d;

    public w4(os3.y4 y4Var) {
        this.f348244d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.y4 y4Var = this.f348244d;
        y4Var.f348259a.f154928g.getSettings().H(true);
        y4Var.f348259a.f154928g.getSettings().N(true);
        y4Var.f348259a.f154928g.getSettings().r(true);
        ((com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView) ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) y4Var.f348259a.f154928g)).K0();
        ((com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView) ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) y4Var.f348259a.f154928g)).J0();
    }
}
