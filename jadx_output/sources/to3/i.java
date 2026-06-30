package to3;

/* loaded from: classes9.dex */
public class i extends qs4.j {
    public static void H(to3.i iVar, com.tencent.mm.ui.MMActivity mMActivity) {
        iVar.getClass();
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = (com.tencent.mm.wallet_core.ui.WalletBaseUI) mMActivity;
        java.lang.String string = walletBaseUI.getInput().getString("key_pwd1");
        int i17 = walletBaseUI.getInput().getInt("offline_add_fee", 0);
        com.tencent.mm.plugin.wallet_core.model.Bankcard d17 = yo3.m.d(true);
        if (d17 != null) {
            walletBaseUI.doSceneForceProgress(new wo3.k(d17, string, i17));
        }
    }

    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        return super.A(activity, bundle);
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "OfflineBindCardProcess";
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        new com.tencent.mm.autogen.events.OfflineBindCardEventEvent().e();
        if (yo3.m.k()) {
            h(activity, com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI.class, -1, null, true);
        } else if (bundle.getInt("key_entry_scene", -1) == 2) {
            j(activity, "offline", "ui.WalletOfflineEntranceUI");
        } else {
            j(activity, "mall", ".ui.MallIndexUIv2");
        }
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        super.o(activity, i17, bundle);
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        return mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI ? new to3.g(this, mMActivity, b0Var) : mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI ? new to3.h(this, mMActivity, b0Var) : super.p(mMActivity, b0Var);
    }

    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return super.t(activity, bundle);
    }
}
