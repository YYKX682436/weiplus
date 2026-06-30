package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
class WalletLockInitTask$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletLockProtectEvent> {
    public WalletLockInitTask$1(com.tencent.mm.plugin.walletlock.model.k kVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.__eventId = 1842411039;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent) {
        boolean z17;
        boolean z18;
        boolean z19;
        com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent2 = walletLockProtectEvent;
        int i17 = walletLockProtectEvent2.f54960g.f7392a;
        com.tencent.mm.plugin.walletlock.model.n nVar = com.tencent.mm.plugin.walletlock.model.n.INSTANCE;
        synchronized (nVar.f181378f) {
        }
        synchronized (nVar.f181378f) {
        }
        am.n10 n10Var = walletLockProtectEvent2.f54960g;
        int i18 = n10Var.f7392a;
        am.o10 o10Var = walletLockProtectEvent2.f54961h;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    o10Var.f7505a = java.lang.Boolean.valueOf(hu4.j.g());
                } else if (i18 == 3) {
                    o10Var.f7505a = java.lang.Boolean.valueOf(hu4.j.f());
                } else if (i18 == 4) {
                    nVar.i();
                }
            } else if (n10Var.f7393b instanceof com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI) {
                o10Var.f7505a = 16;
            } else {
                synchronized (nVar.f181378f) {
                    z18 = nVar.f181376d;
                }
                if (z18) {
                    nVar.j(false);
                    nVar.k(false);
                    o10Var.f7505a = 16;
                } else {
                    synchronized (nVar.f181378f) {
                        z19 = nVar.f181377e;
                    }
                    if (z19) {
                        nVar.j(false);
                        nVar.k(false);
                        o10Var.f7505a = 18;
                    } else {
                        long j17 = hu4.i.f285230a;
                        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
                        if ((j17 == -1 || elapsedRealtime >= hu4.c.f285224a || hu4.j.f()) && hu4.f.a()) {
                            o10Var.f7505a = 17;
                        } else {
                            o10Var.f7505a = 16;
                        }
                        nVar.a(new java.lang.ref.WeakReference(n10Var.f7393b));
                    }
                }
            }
        } else if (n10Var.f7393b instanceof com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI) {
            o10Var.f7505a = 16;
        } else {
            synchronized (nVar.f181378f) {
                z17 = nVar.f181376d;
            }
            if (z17) {
                o10Var.f7505a = 16;
                nVar.a(new java.lang.ref.WeakReference(n10Var.f7393b));
                nVar.j(false);
            } else {
                long j18 = hu4.i.f285230a;
                long elapsedRealtime2 = (android.os.SystemClock.elapsedRealtime() - j18) / 1000;
                if (j18 == -1 || elapsedRealtime2 >= hu4.c.f285224a || (hu4.j.f() && hu4.f.a())) {
                    o10Var.f7505a = 17;
                } else {
                    o10Var.f7505a = 16;
                    nVar.a(new java.lang.ref.WeakReference(n10Var.f7393b));
                }
            }
        }
        n10Var.f7393b = null;
        return false;
    }
}
