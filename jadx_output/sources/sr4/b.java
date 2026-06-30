package sr4;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f411866d = "";

    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle.getBoolean("key_is_show_detail", true)) {
            F(activity, bundle);
        } else {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    public void F(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.class, bundle);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "UnbindProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f213801c.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) != 1) {
            if (this.f213801c.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1) == 2) {
                j(activity, "wallet", ".balance.ui.WalletBalanceManagerUI");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
                j(activity, "mall", ".ui.MallIndexUIv2");
                return;
            }
        }
        int i17 = bundle.getInt("key_process_result_code", 0);
        k(activity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", i17, null, false);
        if (i17 == -1) {
            com.tencent.mm.autogen.events.OfflineUpdateCardListEvent offlineUpdateCardListEvent = new com.tencent.mm.autogen.events.OfflineUpdateCardListEvent();
            am.dm dmVar = offlineUpdateCardListEvent.f54558g;
            dmVar.f6477a = 2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f411866d)) {
                dmVar.f6478b = this.f411866d;
            }
            offlineUpdateCardListEvent.e();
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new sr4.a(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
    }
}
