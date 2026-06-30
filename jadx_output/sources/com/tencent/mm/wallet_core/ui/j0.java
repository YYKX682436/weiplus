package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214194e;

    public j0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, android.view.View view, int i17) {
        this.f214193d = view;
        this.f214194e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f214193d.scrollBy(0, this.f214194e);
    }
}
