package os3;

/* loaded from: classes8.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.y4 f348251d;

    public x4(os3.y4 y4Var) {
        this.f348251d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.y4 y4Var = this.f348251d;
        int contentHeight = (int) (y4Var.f348259a.f154928g.getContentHeight() * y4Var.f348259a.f154928g.getScale());
        y4Var.f348259a.f154928g.getContentHeight();
        y4Var.f348259a.f154928g.getHeight();
        y4Var.f348259a.f154928g.getScale();
        if (java.lang.Math.abs(contentHeight - y4Var.f348259a.f154928g.getHeight()) < 10) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView) ((com.tencent.mm.plugin.webview.ui.tools.widget.e2) y4Var.f348259a.f154928g)).I0(true);
        }
    }
}
