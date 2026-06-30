package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f179065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.s2 f179066e;

    public r2(com.tencent.mm.plugin.wallet.pwd.ui.s2 s2Var, boolean z17) {
        this.f179066e = s2Var;
        this.f179065d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var = this.f179066e.f179070d;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI = t2Var.f179081i;
        com.tencent.mm.plugin.wallet.pwd.ui.t2 t2Var2 = walletSecuritySettingUI.f178952r;
        if (t2Var2 == null) {
            return;
        }
        if (this.f179065d) {
            t2Var.f179080h = 2;
        } else {
            t2Var.f179080h = 1;
        }
        int i17 = t2Var2.f179080h;
        java.lang.String str = i17 == 0 ? t2Var2.f179076d : i17 == 1 ? t2Var2.f179077e : i17 == 3 ? null : t2Var2.f179078f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            walletSecuritySettingUI.f178945h.H(str);
        }
        ((com.tencent.mm.ui.base.preference.h0) walletSecuritySettingUI.f178942e).notifyDataSetChanged();
    }
}
