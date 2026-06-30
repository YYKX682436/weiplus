package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f139883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f139884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139885f;

    public e0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var, com.tencent.mm.pointers.PBool pBool, java.lang.Runnable runnable) {
        this.f139885f = x0Var;
        this.f139883d = pBool;
        this.f139884e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f139883d) {
            if (this.f139883d.value) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "activeIpcTask, time out, callback");
            this.f139883d.value = true;
            this.f139885f.F(new com.tencent.mm.plugin.game.luggage.page.d0(this));
        }
    }
}
