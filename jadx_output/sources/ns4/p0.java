package ns4;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f339608a;

    /* renamed from: b, reason: collision with root package name */
    public final ns4.r0 f339609b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.z2 f339610c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f339611d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f339612e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f339613f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f339614g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f339615h;

    public p0(android.content.Context context, ns4.r0 parameter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f339608a = context;
        this.f339609b = parameter;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0, true, parameter.f339631b);
        this.f339610c = z2Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489614d62, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pkl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339611d = (android.widget.Button) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483781c13);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f339612e = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.hdd);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f339613f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.hdu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f339614g = (android.widget.TextView) findViewById4;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f339613f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("inputArea");
            throw null;
        }
        walletFormView.setmContentAbnormalMoneyCheck(true);
        android.widget.Button button = this.f339611d;
        if (button == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        button.setEnabled(false);
        if (parameter.f339631b) {
            int color = context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.aa8)).setIconColor(color);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc)).setTextColor(color);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dim)).setTextColor(color2);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.pk_)).setIconColor(color2);
            ((com.tencent.mm.wallet_core.ui.WalletTextView) inflate.findViewById(com.tencent.mm.R.id.f487682pf5)).setTextColor(color);
            ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485971jq3)).setBackgroundResource(com.tencent.mm.R.drawable.baj);
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = this.f339613f;
            if (walletFormView2 == null) {
                kotlin.jvm.internal.o.o("inputArea");
                throw null;
            }
            walletFormView2.setContentTextColor(color);
            com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = this.f339612e;
            if (walletTextView == null) {
                kotlin.jvm.internal.o.o("coinAmount");
                throw null;
            }
            walletTextView.setTextColor(color2);
            android.widget.Button button2 = this.f339611d;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            button2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478837in));
            android.widget.Button button3 = this.f339611d;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            button3.setBackgroundResource(com.tencent.mm.R.drawable.f481059jm);
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.aa8)).setOnClickListener(new ns4.l0(this));
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = this.f339613f;
        if (walletFormView3 == null) {
            kotlin.jvm.internal.o.o("inputArea");
            throw null;
        }
        walletFormView3.b(new ns4.m0(this));
        android.widget.Button button4 = this.f339611d;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        button4.setOnClickListener(new ns4.n0(this));
        z2Var.k(inflate, 0, 0);
        z2Var.A(48);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        f5Var.f210400e = new ns4.g0(this);
        this.f339615h = f5Var;
    }

    public final void a() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f339613f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("inputArea");
            throw null;
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.clearFocus();
            ((android.view.inputmethod.InputMethodManager) walletFormView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(walletFormView.f214161h.getWindowToken(), 0);
        }
        this.f339615h.d();
        this.f339610c.B();
    }
}
