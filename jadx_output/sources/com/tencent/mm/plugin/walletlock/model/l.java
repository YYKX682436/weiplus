package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
public enum l {
    instance;


    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181370d;

    /* renamed from: e, reason: collision with root package name */
    public zt5.s f181371e;

    /* renamed from: f, reason: collision with root package name */
    public int f181372f = -1;

    l() {
    }

    public void d(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "closeAllWalletLock");
        l(false);
        if (z17) {
            fu4.a.b();
        }
        hu4.f.b(false);
        k(false);
        if (z17) {
            fu4.a.b();
        }
    }

    public int h() {
        if (this.f181372f == -1) {
            this.f181372f = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, 0)).intValue();
        }
        return this.f181372f;
    }

    public boolean i() {
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    public boolean j(com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent) {
        boolean z17;
        long j17;
        boolean z18;
        if (walletLockProtectEvent == null) {
            return false;
        }
        com.tencent.mm.plugin.walletlock.model.n nVar = com.tencent.mm.plugin.walletlock.model.n.INSTANCE;
        synchronized (nVar.f181378f) {
            z17 = nVar.f181376d;
        }
        am.n10 n10Var = walletLockProtectEvent.f54960g;
        if (z17) {
            nVar.a(new java.lang.ref.WeakReference(n10Var.f7393b));
            nVar.j(false);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "current wallet lock type: %d", java.lang.Integer.valueOf(this.f181372f));
        int i17 = this.f181372f;
        if (i17 == 2) {
            j17 = fu4.a.f266884a;
        } else {
            if (i17 != 1) {
                return false;
            }
            j17 = hu4.i.f285230a;
        }
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "lastVerifyOkTime: %d, elapsedRealTime: %d, pastTime: %d, PREVENT_INPUT_PWD_SECONDS: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(com.tencent.mm.plugin.walletlock.model.k.a()));
        if (j17 != -1 && elapsedRealtime < com.tencent.mm.plugin.walletlock.model.k.a()) {
            int i18 = instance.f181372f;
            if (i18 == 1) {
                z18 = hu4.j.f();
            } else if (i18 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "isUserBlockedInFingerprint: %b", java.lang.Boolean.valueOf(fu4.a.e()));
                z18 = fu4.a.e();
            } else {
                z18 = false;
            }
            if (!z18) {
                nVar.a(new java.lang.ref.WeakReference(n10Var.f7393b));
                return false;
            }
        }
        return true;
    }

    public void k(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "set user face id lock: %s", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FACEID_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }

    public void l(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintInfoStorage", "set fingerprint lock status isOpened: %b", java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_FINGERPRINT_IS_OPENED_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(gm0.j1.u().c().l(40, null), 0);
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(z17 ? 8388608 | o17 : (-8388609) & o17));
        gm0.j1.u().c().i(true);
    }

    public void m(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockManager", "old wallet lock type: %d, new type: %d", java.lang.Integer.valueOf(this.f181372f), java.lang.Integer.valueOf(i17));
        this.f181372f = i17;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLETLOCK_CURRENT_USED_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().i(true);
    }
}
