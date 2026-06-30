package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes3.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f178817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178818e;

    public x0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, android.widget.CheckBox checkBox) {
        this.f178818e = walletPayUI;
        this.f178817d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f178817d.isChecked()) {
            gm0.j1.i();
            gm0.j1.u().c().w(196614, java.lang.Boolean.FALSE);
        }
        this.f178818e.Y6(false);
    }
}
