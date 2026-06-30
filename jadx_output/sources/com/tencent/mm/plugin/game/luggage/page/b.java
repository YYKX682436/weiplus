package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.plugin.game.luggage.page.x0 {
    public b(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        this.f182186t.setVisibility(8);
        this.M.post(new com.tencent.mm.plugin.webview.luggage.w0(this));
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = this.f406656m;
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(false);
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameInsertWebPage", "onBackground");
        B("onPause");
        this.f182180p.onPause();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void f() {
        if (this.V) {
            return;
        }
        this.V = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameInsertWebPage", "onDestroy");
        B("onDestroy");
        this.B.f182669j = null;
        synchronized (com.tencent.mm.plugin.webview.luggage.u1.f182626a) {
            com.tencent.mm.plugin.webview.luggage.u1.f182628c.remove(this);
            com.tencent.mm.plugin.webview.luggage.u1.f182629d.remove(com.tencent.mm.plugin.webview.luggage.u1.a(this));
        }
        com.tencent.mm.plugin.webview.permission.d dVar = this.f182178J;
        dVar.f183396p = true;
        dVar.f183382b.clear();
        this.f406655i.a();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, sd.k
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameInsertWebPage", "onForeground");
        B("onResume");
        this.f182180p.onResume();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public boolean n() {
        return false;
    }
}
