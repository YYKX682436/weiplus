package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class c1 extends com.tencent.mm.plugin.game.luggage.page.x0 {
    public c1(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebPage", "create");
        com.tencent.mm.plugin.webview.model.k.b(this.f182180p);
        com.tencent.mm.ipcinvoker.w0.b(new com.tencent.mm.plugin.game.luggage.page.z0(this, bundle));
        com.tencent.mm.ipcinvoker.w0.a().f68411b.postDelayed(new com.tencent.mm.plugin.game.luggage.page.a1(this), 100L);
        this.f406655i.c(new com.tencent.mm.plugin.game.luggage.page.b1(this));
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public void C(java.lang.String str) {
        super.C(str);
        this.f406655i.c(new com.tencent.mm.plugin.game.luggage.page.b1(this));
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public void E(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebPage", "onUrlRedirect, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0
    public sx4.d0 R(java.lang.String str) {
        return sx4.d0.b(str);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0
    public boolean V(java.lang.String str) {
        if (str.equals(s())) {
            return false;
        }
        return super.V(str);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.u0, sd.k
    public void b(java.lang.String str, android.os.Bundle bundle) {
        super.b(str, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0, sd.u0
    public java.lang.String j() {
        return ik1.f.e("preload_game_adapter.js");
    }
}
