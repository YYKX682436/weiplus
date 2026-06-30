package dt;

/* loaded from: classes11.dex */
public class j4 extends com.tencent.mm.sdk.event.n {
    public j4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = (com.tencent.mm.autogen.events.LogoutEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        if (logoutEvent.f54484g.f6836a != 2) {
            com.tencent.mm.xwebutil.s0.b("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE");
            try {
                com.tencent.mm.sdk.platformtools.o4.M("__webView_ad").W("AdWUID");
                com.tencent.xweb.a3.c(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "clearAllWebViewCache");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "clear cookie failed : %s", e17);
            }
        }
        if (gm0.j1.a()) {
            int i17 = logoutEvent.f54484g.f6836a;
            boolean z17 = i17 == 3;
            boolean z18 = i17 == 1;
            if (z17) {
                c01.b9.f37069c.d("login_user_name", "");
                gm0.m.u();
            } else {
                if (z18) {
                    gm0.m.u();
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
                }
                c01.b9.f37069c.c((java.lang.String) c01.d9.b().p().l(6, null), c01.d9.b().p().q(9, 0), (java.lang.String) c01.d9.b().p().l(5, null));
            }
        }
        return false;
    }
}
