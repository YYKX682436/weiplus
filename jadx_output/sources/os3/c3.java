package os3;

/* loaded from: classes8.dex */
public class c3 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348054a;

    public c3(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI) {
        this.f348054a = mailWebViewUI;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        if (!wi6.startsWith("weixin://private/getcontentwidth/")) {
            return false;
        }
        com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.T6(this.f348054a, wi6);
        return true;
    }
}
