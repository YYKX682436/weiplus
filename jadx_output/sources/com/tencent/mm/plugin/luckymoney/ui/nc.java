package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f147232d;

    public nc(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f147232d = wcPayKeyboard;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f147232d.i();
    }
}
