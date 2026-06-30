package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f139877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask f139878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f139879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f139880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139881h;

    public c0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, long j17, com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask activeMainProcessTask, com.tencent.mm.pointers.PBool pBool, java.lang.Runnable runnable, java.lang.String str) {
        this.f139877d = j17;
        this.f139878e = activeMainProcessTask;
        this.f139879f = pBool;
        this.f139880g = runnable;
        this.f139881h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f139877d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "activeIpcTask, callback");
        this.f139878e.x();
        synchronized (this.f139879f) {
            com.tencent.mm.pointers.PBool pBool = this.f139879f;
            if (pBool.value) {
                return;
            }
            pBool.value = true;
            this.f139880g.run();
            java.lang.String str = this.f139881h;
            java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
            com.tencent.mm.plugin.wepkg.utils.a.c("ipcServiceStartTime", str, kh0.i.a(str), null, 0L, currentTimeMillis, null);
        }
    }
}
