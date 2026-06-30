package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214212d;

    public p0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214212d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.View contentView;
        android.view.View contentView2;
        android.view.View findFocus;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214212d;
        contentView = walletBaseUI.getContentView();
        if (contentView == null) {
            findFocus = null;
        } else {
            contentView2 = walletBaseUI.getContentView();
            findFocus = contentView2.findFocus();
        }
        if (findFocus != null) {
            boolean z17 = findFocus instanceof android.widget.EditText;
        }
    }
}
