package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f214242a;

    /* renamed from: b, reason: collision with root package name */
    public static int f214243b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f214244c;

    public static void a(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        if (f214242a == 1000) {
            int i17 = f214243b;
            if (i17 == 1) {
                if (!walletBaseUI.onProgressFinish()) {
                    walletBaseUI.setContentViewVisibility(0);
                }
                walletBaseUI.cleanUiData(0);
            } else if (i17 == 3) {
                com.tencent.mm.wallet_core.a.c(walletBaseUI.getContext(), walletBaseUI.getInput(), f214243b);
            } else if (walletBaseUI.isTransparent() || walletBaseUI.getContentViewVisibility() != 0) {
                walletBaseUI.finish();
            } else {
                walletBaseUI.cleanUiData(0);
            }
        } else {
            com.tencent.mm.wallet_core.a.b(walletBaseUI.getContext(), f214243b);
        }
        f214242a = 0;
        f214243b = 0;
        f214244c = null;
    }
}
