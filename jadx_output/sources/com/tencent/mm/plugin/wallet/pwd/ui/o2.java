package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class o2 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.IconPreference f179043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179044b;

    public o2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI, com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        this.f179044b = walletSecuritySettingUI;
        this.f179043a = iconPreference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSecuritySettingUI", "icon url: %s", str);
        com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI = this.f179044b;
        this.f179043a.U = new android.graphics.drawable.BitmapDrawable(walletSecuritySettingUI.getContext().getResources(), bitmap);
        ((java.util.HashMap) walletSecuritySettingUI.f178956v).remove(str);
    }
}
