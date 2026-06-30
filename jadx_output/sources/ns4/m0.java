package ns4;

/* loaded from: classes8.dex */
public final class m0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f339590d;

    public m0(ns4.p0 p0Var) {
        this.f339590d = p0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        java.lang.String obj = s17.toString();
        ns4.p0 p0Var = this.f339590d;
        p0Var.getClass();
        com.tencent.mars.xlog.Log.i("WeCoinCustomAmountInputDialog", "update tips: %s", obj);
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(obj + "", "100");
        long j08 = com.tencent.mm.wallet_core.ui.r1.j0(obj + "", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = p0Var.f339612e;
        if (walletTextView == null) {
            kotlin.jvm.internal.o.o("coinAmount");
            throw null;
        }
        walletTextView.setText(java.lang.String.valueOf(j08));
        if (j07 == 0) {
            android.widget.Button button = p0Var.f339611d;
            if (button == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            button.setEnabled(false);
            android.widget.TextView textView = p0Var.f339614g;
            if (textView != null) {
                textView.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("inputTips");
                throw null;
            }
        }
        ns4.r0 r0Var = p0Var.f339609b;
        if (j07 <= r0Var.f339630a) {
            android.widget.Button button2 = p0Var.f339611d;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            button2.setEnabled(true);
            android.widget.TextView textView2 = p0Var.f339614g;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("inputTips");
                throw null;
            }
        }
        android.widget.Button button3 = p0Var.f339611d;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        button3.setEnabled(false);
        android.widget.TextView textView3 = p0Var.f339614g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("inputTips");
            throw null;
        }
        textView3.setVisibility(0);
        long j17 = r0Var.f339630a / 100;
        android.widget.TextView textView4 = p0Var.f339614g;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("inputTips");
            throw null;
        }
        textView4.setText(p0Var.f339608a.getString(com.tencent.mm.R.string.l9c, java.lang.String.valueOf(j17)));
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
