package com.tencent.mm.wallet_core.ui;

/* loaded from: classes5.dex */
public class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f214202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214203e;

    public l0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, boolean z17) {
        this.f214203e = walletBaseUI;
        this.f214202d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        if (this.f214202d) {
            this.f214203e.finish();
        }
    }
}
