package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.splash.w {
    public void a(com.tencent.mm.splash.v vVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SplashInit", "do one more thing");
        if (!com.tencent.mm.splash.t.f193683c || vVar == null) {
            return;
        }
        com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup = (com.tencent.mm.legacy.app.WeChatSplashStartup) com.tencent.mm.splash.t.f193682b;
        if (!weChatSplashStartup.f68488c) {
            weChatSplashStartup.a(vVar);
            return;
        }
        com.tencent.mm.legacy.app.x0 x0Var = weChatSplashStartup.f68490e;
        x0Var.c();
        x0Var.f68528a = vVar;
        if (x0Var.f68529b) {
            vVar.b();
            x0Var.f68529b = false;
        }
        if (x0Var.f68530c) {
            x0Var.f68528a.a();
        }
    }
}
