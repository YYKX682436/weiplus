package qp5;

/* loaded from: classes9.dex */
public abstract class p {
    public static void a(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setLogicDelegate(new qp5.b());
        }
    }

    public static void b(com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView) {
        if (editHintPasswdView != null) {
            editHintPasswdView.setEncrType(1);
        }
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setOnInfoIvClickListener(new qp5.e(walletFormView, mMActivity));
        }
    }

    public static void d(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
            return;
        }
        walletFormView.setLogicDelegate(new qp5.c());
        walletFormView.setOnClickListener(new qp5.v(mMActivity, walletFormView));
        walletFormView.setOnInfoIvClickListener(new qp5.d(walletFormView, mMActivity));
    }

    public static void e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setLogicDelegate(new qp5.n(1, walletFormView));
            walletFormView.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        }
    }

    public static void f(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setOnInfoIvClickListener(new qp5.g(mMActivity));
            walletFormView.setLogicDelegate(new qp5.h());
        }
    }

    public static void g(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setLogicDelegate(new qp5.a());
        }
    }

    public static void h(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setOnInfoIvClickListener(new qp5.l(mMActivity));
            walletFormView.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        }
    }
}
