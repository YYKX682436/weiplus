package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.j f182927e;

    public i(com.tencent.mm.plugin.webview.model.j jVar, boolean z17) {
        this.f182927e = jVar;
        this.f182926d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f182926d;
        com.tencent.mm.plugin.webview.model.j jVar = this.f182927e;
        if (z17) {
            com.tencent.mm.plugin.webview.model.k.a(jVar.f182948f, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (true)");
        } else {
            com.tencent.mm.plugin.webview.model.k.a(jVar.f182948f, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay (false)");
        }
    }
}
