package com.tencent.mm.plugin.walletlock.ui;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f181397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI f181398e;

    public d(com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI walletLockSettingUI, com.tencent.mm.ui.base.preference.Preference preference) {
        this.f181398e = walletLockSettingUI;
        this.f181397d = preference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI.f181380t;
        com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI walletLockSettingUI = this.f181398e;
        walletLockSettingUI.W6();
        walletLockSettingUI.X6(this.f181397d, true, true);
        walletLockSettingUI.getClass();
        if (com.tencent.mm.plugin.walletlock.model.l.instance.h() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockSettingUI", "request close wallet lock");
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().c(walletLockSettingUI, 3);
        com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f62116d = 14L;
        wCPaySaftyClickReportStruct.f62117e = 1L;
        wCPaySaftyClickReportStruct.k();
    }
}
