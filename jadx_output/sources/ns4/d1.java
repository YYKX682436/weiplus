package ns4;

/* loaded from: classes8.dex */
public final class d1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339501d;

    public d1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339501d = weCoinEncashView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        java.lang.String obj = s17.toString();
        boolean A = r26.i0.A(obj, ".", false, 2, null);
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339501d;
        if (A) {
            s17.insert(0, "0");
        } else {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = weCoinEncashView.f179151f;
            if (walletFormView == null) {
                kotlin.jvm.internal.o.o("mInputMoneyText");
                throw null;
            }
            if (com.tencent.mm.wallet_core.ui.formview.WalletFormView.f(obj, walletFormView.getContentEt())) {
                return;
            }
        }
        java.lang.String obj2 = s17.toString();
        int L = r26.n0.L(obj2, ".", 0, false, 6, null);
        int length = obj2.length();
        if (L >= 0 && length - L > 3) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = weCoinEncashView.f179151f;
            if (walletFormView2 == null) {
                kotlin.jvm.internal.o.o("mInputMoneyText");
                throw null;
            }
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletFormView2.getContentEt(), obj2, L + 3, length);
        } else if (L > 12) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = weCoinEncashView.f179151f;
            if (walletFormView3 == null) {
                kotlin.jvm.internal.o.o("mInputMoneyText");
                throw null;
            }
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletFormView3.getContentEt(), obj2, 12, L);
        } else if (L == -1 && length > 12) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView4 = weCoinEncashView.f179151f;
            if (walletFormView4 == null) {
                kotlin.jvm.internal.o.o("mInputMoneyText");
                throw null;
            }
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.g(walletFormView4.getContentEt(), obj2, 12, length);
        }
        java.lang.String obj3 = s17.toString();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        weCoinEncashView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "update tips: %s", obj3);
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(obj3 + "", "100");
        int i17 = weCoinEncashView.f179157o;
        if (j07 <= 0) {
            android.widget.TextView textView = weCoinEncashView.f179152g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView.setText(weCoinEncashView.f179155m);
            android.widget.TextView textView2 = weCoinEncashView.f179152g;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView2.setTextColor(i17);
            weCoinEncashView.f179156n = false;
            weCoinEncashView.V6(false);
            return;
        }
        long longExtra = weCoinEncashView.getIntent().getLongExtra("wecoin_income_balance", 0L);
        if (j07 >= 200000000) {
            android.widget.TextView textView3 = weCoinEncashView.f179152g;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView3.setText(weCoinEncashView.getString(com.tencent.mm.R.string.l9l));
            android.widget.TextView textView4 = weCoinEncashView.f179152g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView4.setTextColor(weCoinEncashView.getResources().getColor(com.tencent.mm.R.color.Red_100));
            weCoinEncashView.f179156n = false;
            weCoinEncashView.V6(false);
            return;
        }
        if (j07 > longExtra) {
            android.widget.TextView textView5 = weCoinEncashView.f179152g;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView5.setText(weCoinEncashView.getString(com.tencent.mm.R.string.l9k));
            android.widget.TextView textView6 = weCoinEncashView.f179152g;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView6.setTextColor(weCoinEncashView.getResources().getColor(com.tencent.mm.R.color.Red_100));
            weCoinEncashView.f179156n = false;
            weCoinEncashView.V6(false);
            return;
        }
        if (j07 == 1) {
            ms4.n nVar = weCoinEncashView.f179154i;
            if (nVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            if (nVar.f331069f == 2) {
                android.widget.TextView textView7 = weCoinEncashView.f179152g;
                if (textView7 == null) {
                    kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                    throw null;
                }
                textView7.setText(weCoinEncashView.getString(com.tencent.mm.R.string.lpt));
                android.widget.TextView textView8 = weCoinEncashView.f179152g;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
                    throw null;
                }
                textView8.setTextColor(weCoinEncashView.getResources().getColor(com.tencent.mm.R.color.Red_100));
                weCoinEncashView.f179156n = false;
                weCoinEncashView.V6(false);
                return;
            }
        }
        android.widget.TextView textView9 = weCoinEncashView.f179152g;
        if (textView9 == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView9.setText(weCoinEncashView.f179155m);
        android.widget.TextView textView10 = weCoinEncashView.f179152g;
        if (textView10 == null) {
            kotlin.jvm.internal.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView10.setTextColor(i17);
        weCoinEncashView.f179156n = true;
        weCoinEncashView.V6(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
