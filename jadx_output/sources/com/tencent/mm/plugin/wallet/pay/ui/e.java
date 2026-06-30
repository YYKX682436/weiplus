package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent f178757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.AnonymousClass1 f178758e;

    public e(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.AnonymousClass1 anonymousClass1, com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
        this.f178758e = anonymousClass1;
        this.f178757d = walletRealNameResultNotifyEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (-1 == this.f178757d.f54973g.f6120a) {
            com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI walletChangeBankcardUI = com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.this;
            int i17 = com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI.f178651z;
            walletChangeBankcardUI.a7(-1);
        }
    }
}
