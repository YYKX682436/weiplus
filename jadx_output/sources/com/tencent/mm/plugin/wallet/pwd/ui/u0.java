package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI f179083d;

    public u0(com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI) {
        this.f179083d = walletIdCardCheckUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("Micromsg.WalletIdCardCheckUI", "onbackbtn click");
        this.f179083d.finish();
        return false;
    }
}
