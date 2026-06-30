package com.tencent.mm.wallet_core.ui;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f214130d;

    public e0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, android.widget.EditText editText) {
        this.f214130d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f214130d;
        if (editText.findFocus() == null) {
            editText.requestFocus();
        }
    }
}
