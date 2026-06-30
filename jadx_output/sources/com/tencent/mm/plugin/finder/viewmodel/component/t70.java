package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t70 extends com.tencent.mm.plugin.finder.viewmodel.component.q70 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.u70 f135990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f135991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(com.tencent.mm.plugin.finder.viewmodel.component.u70 u70Var, int i17) {
        super(u70Var, i17);
        this.f135990e = u70Var;
        this.f135991f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("FinderTabPreloadUIC", "startPreload: start tabType = " + this.f135673d);
        this.f135990e.f136105e.remove(java.lang.Integer.valueOf(this.f135673d));
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = (com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
        int i17 = this.f135991f;
        if (i17 != 39) {
            bs2.n1 R6 = finderStreamTabPreloadCore.R6(i17);
            if (R6 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performInsidePreload] tabType=");
                int i18 = R6.f23907a;
                sb6.append(i18);
                sb6.append(", cache.resp is null = ");
                bs2.b0 b0Var = R6.f23925s;
                sb6.append(b0Var.f23806b == null);
                com.tencent.mars.xlog.Log.i(R6.f23909c, sb6.toString());
                if (b0Var.f23806b == null && ((ey2.t0) ((jz5.n) R6.f23908b.f122545g).getValue()).R6(i18)) {
                    bs2.n1.r(R6, bs2.h0.f23852o, null, new bs2.u0(R6), 2, null);
                    return;
                }
                return;
            }
            return;
        }
        bs2.w wVar = finderStreamTabPreloadCore.f122544f;
        if (wVar != null) {
            bs2.h0 h0Var = bs2.h0.f23852o;
            bs2.u uVar2 = bs2.u.f23952d;
            ey2.h1 h1Var = (ey2.h1) ((xy2.k) uVar.e(zy2.b6.class).c(xy2.k.class));
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127699fd).getValue()).r()).booleanValue() && h1Var.O6())) {
                com.tencent.mars.xlog.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: native drama disabled, source=" + h0Var);
                uVar2.invoke(bs2.i0.f23861e);
                return;
            }
            if (!wVar.f23963a.V6(h0Var)) {
                com.tencent.mars.xlog.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: core disabled, source=" + h0Var);
                uVar2.invoke(bs2.i0.f23861e);
                return;
            }
            wVar.f23965c.lock();
            try {
                if (wVar.b() != null) {
                    com.tencent.mars.xlog.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: cache still valid, source=" + h0Var);
                    uVar2.invoke(bs2.i0.f23861e);
                } else {
                    if (!wVar.f23969g) {
                        wVar.f23969g = true;
                        wVar.f23970h = false;
                        if (wVar.a("nextPreload")) {
                            bs2.g.a(bs2.g.f23841a, 0, 0, 3, 2, false, 0, false, 115, null);
                        }
                        r45.qt2 qt2Var = new r45.qt2();
                        qt2Var.set(5, 397);
                        com.tencent.mars.xlog.Log.i("Finder.NativeDramaTabPreloadWorker", "preload: start cgi, source=" + h0Var);
                        db2.o4 o4Var = new db2.o4(qt2Var, null);
                        wVar.f23966d = o4Var;
                        wVar.f23965c.unlock();
                        o4Var.l().K(new bs2.v(wVar, uVar2, h0Var, o4Var));
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("Finder.NativeDramaTabPreloadWorker", "preload: already loading, source=" + h0Var);
                    uVar2.invoke(bs2.i0.f23860d);
                }
            } finally {
                wVar.f23965c.unlock();
            }
        }
    }
}
