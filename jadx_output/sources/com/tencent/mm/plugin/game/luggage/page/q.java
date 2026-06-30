package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f139929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.u f139930e;

    public q(com.tencent.mm.plugin.game.luggage.page.u uVar, boolean z17) {
        this.f139930e = uVar;
        this.f139929d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f139929d) {
            this.f139930e.k();
            return;
        }
        com.tencent.mm.plugin.game.luggage.page.u uVar = this.f139930e;
        synchronized (uVar) {
            android.view.View view = uVar.I;
            if (view != null && view.getParent() != null) {
                uVar.f182700o.removeView(uVar.I);
            }
            uVar.I = null;
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            m02.u uVar2 = uVar.L;
            ((l02.q) sVar).getClass();
            java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
            com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
            com.tencent.mm.plugin.downloader_app.model.l0.D.remove(uVar2);
        }
    }
}
