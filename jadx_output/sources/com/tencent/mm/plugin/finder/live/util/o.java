package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.t f115641d;

    public o(com.tencent.mm.plugin.finder.live.util.t tVar) {
        this.f115641d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.live.util.n nVar = com.tencent.mm.plugin.finder.live.util.n.f115634g;
        com.tencent.mm.plugin.finder.live.util.t tVar = this.f115641d;
        tVar.e(nVar);
        if (tVar.f115696r.e()) {
            com.tencent.mm.plugin.finder.live.util.t.a(tVar);
            com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "long click start timer");
            com.tencent.mm.sdk.platformtools.b4 b4Var = tVar.f115696r;
            long j17 = tVar.f115680b;
            b4Var.c(j17, j17);
        }
        if (tVar.f115697s.e()) {
            com.tencent.mm.plugin.finder.live.util.t.a(tVar);
            com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "long click start longClickTimer");
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = tVar.f115697s;
            long j18 = tVar.f115682d;
            b4Var2.c(j18, j18);
        }
    }
}
