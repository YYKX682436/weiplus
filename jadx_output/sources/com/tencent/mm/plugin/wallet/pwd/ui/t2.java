package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f179073a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f179074b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f179075c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179076d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179079g;

    /* renamed from: h, reason: collision with root package name */
    public int f179080h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179081i;

    public t2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI, android.content.Context context) {
        this.f179081i = walletSecuritySettingUI;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse(this.f179079g).buildUpon().appendQueryParameter(str, str2).build().toString();
    }

    public java.lang.String b() {
        int i17 = this.f179080h;
        return i17 == 0 ? a("qqpimsecurestatus", "not_installed") : i17 == 2 ? a("qqpimsecurestatus", "runing") : i17 == 1 ? a("qqpimsecurestatus", "not_run") : a("qqpimsecurestatus", "not_run");
    }
}
