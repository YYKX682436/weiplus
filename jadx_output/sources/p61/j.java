package p61;

/* loaded from: classes8.dex */
public class j extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352293a;

    public j(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI) {
        this.f352293a = bindGoogleContactUI;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        java.lang.String wi6 = ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).wi(consoleMessage != null ? consoleMessage.message() : null);
        if (!wi6.toLowerCase().startsWith("weixin://private/googlegetcode")) {
            return false;
        }
        int i17 = com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.f72928s;
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352293a;
        bindGoogleContactUI.getClass();
        java.lang.String substring = wi6.substring(30);
        bindGoogleContactUI.X6();
        new p61.q(bindGoogleContactUI, substring).execute(new java.lang.Void[0]);
        return true;
    }
}
