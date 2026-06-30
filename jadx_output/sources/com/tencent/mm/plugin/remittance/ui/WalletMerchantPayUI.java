package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class WalletMerchantPayUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements mp5.v {
    public static final /* synthetic */ int X = 0;
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public android.widget.TextView G;
    public android.widget.LinearLayout H;
    public android.widget.RelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f157597J;
    public android.widget.RelativeLayout K;
    public android.widget.TextView L;
    public int M;
    public long N;
    public java.lang.String P;
    public android.view.View Q;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.widget.Button U;

    /* renamed from: d, reason: collision with root package name */
    public int f157598d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f157599e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f157600f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f157601g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f157602h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f157603i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f157604m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f157605n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f157606o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157607p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.EditText f157608q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f157610s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ScrollView f157611t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f157612u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f157613v;

    /* renamed from: x, reason: collision with root package name */
    public double f157615x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f157616y;

    /* renamed from: r, reason: collision with root package name */
    public boolean f157609r = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f157614w = "";

    /* renamed from: z, reason: collision with root package name */
    public int f157617z = 4;
    public int V = 0;
    public final java.lang.Runnable W = new com.tencent.mm.plugin.remittance.ui.o9(this);

    public static void U6(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        walletMerchantPayUI.f157602h.clearFocus();
        if (walletMerchantPayUI.f157607p == null) {
            walletMerchantPayUI.f157607p = new com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage(walletMerchantPayUI, 60, "", com.tencent.mm.plugin.remittance.ui.l7.f157809f);
        }
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = walletMerchantPayUI.f157607p;
        java.lang.String title = walletMerchantPayUI.getContext().getString(com.tencent.mm.R.string.hyf);
        remittanceRemarkInputHalfPage.getClass();
        kotlin.jvm.internal.o.g(title, "title");
        remittanceRemarkInputHalfPage.f157568n = title;
        walletMerchantPayUI.f157607p.a(walletMerchantPayUI.f157616y, com.tencent.mm.sdk.platformtools.t8.K0(walletMerchantPayUI.f157610s) ? "" : walletMerchantPayUI.f157610s, new com.tencent.mm.plugin.remittance.ui.k9(walletMerchantPayUI));
    }

    public static void Z6(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        walletMerchantPayUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "do place order");
        walletMerchantPayUI.hideWcKb();
        if (walletMerchantPayUI.f157609r) {
            walletMerchantPayUI.hideVKB();
            walletMerchantPayUI.f157608q.clearFocus();
        }
        walletMerchantPayUI.addSceneEndListener(4954);
        com.tencent.mm.plugin.remittance.model.d0 d0Var = new com.tencent.mm.plugin.remittance.model.d0(walletMerchantPayUI.f157613v, walletMerchantPayUI.f157615x, walletMerchantPayUI.f157616y, walletMerchantPayUI.F);
        d0Var.setProcessName("MerchantPay");
        walletMerchantPayUI.showLoading();
        android.app.Dialog dialog = walletMerchantPayUI.mTipDialog;
        if (dialog != null) {
            dialog.setCancelable(false);
            walletMerchantPayUI.mTipDialog.setCanceledOnTouchOutside(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "doPlaceOrder: set loading dialog not cancelable");
        }
        walletMerchantPayUI.doSceneProgress(d0Var, false);
    }

    public void a7(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "do check pay");
        com.tencent.mm.plugin.remittance.model.b0 b0Var = new com.tencent.mm.plugin.remittance.model.b0(str, i17, this.f157613v);
        b0Var.setProcessName("MerchantPay");
        doSceneProgress(b0Var, false);
    }

    public final double b7() {
        if (this.f157598d == 0) {
            this.f157615x = com.tencent.mm.sdk.platformtools.t8.F(this.f157602h.getText(), 0.0d);
            com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "mMoneyEt.getText：%s", this.f157602h.getText());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "mTotalAmt：%s", java.lang.Double.valueOf(this.f157615x));
        return this.f157615x;
    }

    public void c7(com.tencent.mm.plugin.remittance.model.d0 d0Var) {
        java.lang.String str = d0Var.f156804f.f371654g;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("prepayId", str);
        bundle.putInt("payScene", 73);
        bundle.putInt("payChannel", this.A);
        bundle.putString("qrCodeUrl", getIntent().getStringExtra("qrcodeUrl"));
        bundle.putInt("chatType", getIntent().getIntExtra("chat_type", 0));
        bundle.putInt("sendType", getIntent().getIntExtra("send_type", 0));
        bundle.putInt("qrCodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
        bundle.putString("qrCodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
        bundle.putString("qrCodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
        bundle.putString("qrcodeSenderName", getIntent().getStringExtra("qrcode_sender_username"));
        bundle.putString("qrcodeSenderMsgId", getIntent().getStringExtra("msg_svr_id"));
        java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bundle.putString("payInitRawUrl", stringExtra == null ? "" : stringExtra);
        bundle.putLong("payInitTimestamp", longExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "startPay initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
        ((h45.q) i95.n0.c(h45.q.class)).startInWxAppPayUseCase(this, bundle);
    }

    public final void d7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157616y)) {
            this.f157605n.setVisibility(8);
            this.f157606o.setVisibility(0);
            java.lang.String string = getString(com.tencent.mm.R.string.hyf);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f157606o, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.remittance.ui.j9(this), true), getContext());
            return;
        }
        this.f157605n.setVisibility(0);
        this.f157606o.setVisibility(8);
        java.lang.String string2 = getString(com.tencent.mm.R.string.f492824i05);
        java.lang.String string3 = getString(com.tencent.mm.R.string.b9z, this.f157616y, string2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3);
        com.tencent.mm.wallet_core.ui.r1.w0(this.f157605n, i17.toString(), i17.length() - string2.length(), i17.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.remittance.ui.i9(this), true), getContext());
    }

    public final void e7() {
        double b76 = b7();
        this.f157615x = b76;
        if (b76 <= 0.0d) {
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157612u;
            if (wcPayKeyboard != null) {
                wcPayKeyboard.e(false);
            }
            this.U.setEnabled(false);
            return;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2 = this.f157612u;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.e(true);
        }
        if (!this.f157609r) {
            this.U.setEnabled(true);
        } else if (this.U.getVisibility() != 0 || com.tencent.mm.sdk.platformtools.t8.J0(this.f157608q.getText())) {
            this.U.setEnabled(false);
        } else {
            this.U.setEnabled(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxk;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.widget.ScrollView scrollView = this.f157611t;
        if (scrollView != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.f157611t.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        hideActionbarLine();
        this.f157611t = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f157599e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485913ji5);
        this.f157600f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485911ji3);
        this.f157601g = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.f485912ji4);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485908ji0);
        this.f157602h = walletFormView;
        walletFormView.getHint();
        this.H = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jhu);
        this.G = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jhv);
        this.f157603i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jhr);
        this.f157606o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jho);
        this.f157605n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jhq);
        this.f157604m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jhs);
        this.f157608q = (android.widget.EditText) findViewById(com.tencent.mm.R.id.jht);
        this.f157597J = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pco);
        this.f157612u = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.Q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jhw);
        this.R = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jhl);
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jhm);
        this.T = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jhk);
        this.U = (android.widget.Button) findViewById(com.tencent.mm.R.id.jhn);
        if (this.f157598d == 1) {
            android.view.View view = this.Q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.H.setVisibility(8);
            this.f157597J.setVisibility(8);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
                android.widget.TextView textView = this.R;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = this.P;
                float textSize = this.R.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
            }
            this.S.setText(com.tencent.mm.wallet_core.ui.r1.o(this.f157615x));
            this.T.setTextSize(1, 56.0f);
            this.S.setTextSize(1, 56.0f);
            this.U.setVisibility(0);
            this.f157611t.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.m9(this, false));
        } else {
            android.view.View view2 = this.Q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.H.setVisibility(0);
            this.f157597J.setVisibility(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
                android.widget.TextView textView2 = this.G;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = this.P;
                float textSize2 = this.G.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str2, textSize2));
            }
            this.f157602h.getContentEt().setTextSize(1, 52.0f);
            this.f157602h.getContentEt().setMinHeight(i65.a.b(getContext(), 56));
            this.f157602h.getTitleTv().setTextSize(1, 52.0f);
            if (this.f157609r) {
                this.U.setVisibility(0);
                this.U.setEnabled(false);
                this.f157611t.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.m9(this, false));
                z17 = false;
            } else {
                this.U.setVisibility(8);
                this.f157611t.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.m9(this, true));
                z17 = true;
            }
            if (!z17) {
                this.f157602h.getContentEt().clearFocus();
            }
            setWPKeyboard(this.f157602h.getContentEt(), z17, true);
            this.f157602h.setmContentAbnormalMoneyCheck(true);
            if (fp.h.c(28)) {
                this.f157602h.getContentEt().post(new com.tencent.mm.plugin.remittance.ui.d9(this, z17));
            }
            if (this.f157609r) {
                this.f157612u.setActionText(getString(com.tencent.mm.R.string.f490507x1));
                androidx.appcompat.app.AppCompatActivity activity = getContext();
                kotlin.jvm.internal.o.g(activity, "activity");
                ((com.tencent.mm.plugin.remittance.model.r1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.f490507x1));
            } else {
                this.f157612u.setActionText(getString(com.tencent.mm.R.string.hys));
                androidx.appcompat.app.AppCompatActivity activity2 = getContext();
                kotlin.jvm.internal.o.g(activity2, "activity");
                ((com.tencent.mm.plugin.remittance.model.r1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.remittance.model.r1.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.hys));
            }
            setWcKbHeightListener(this);
            ((android.widget.RelativeLayout.LayoutParams) this.f157612u.getLayoutParams()).addRule(12);
            this.f157602h.setOnFocusChangeListener(new com.tencent.mm.plugin.remittance.ui.e9(this));
            this.f157602h.b(new com.tencent.mm.plugin.remittance.ui.f9(this));
            this.f157602h.r(7, 2);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.remittance.ui.u9(this));
        if (this.f157609r) {
            this.f157603i.setVisibility(8);
            this.f157604m.setVisibility(0);
            this.f157608q.setHint(this.f157610s);
            this.f157608q.addTextChangedListener(new com.tencent.mm.plugin.remittance.ui.g9(this));
            this.f157608q.setOnFocusChangeListener(new com.tencent.mm.plugin.remittance.ui.h9(this));
        } else {
            this.f157604m.setVisibility(8);
            this.f157603i.setVisibility(0);
            d7();
        }
        com.tencent.mm.plugin.remittance.ui.p9 p9Var = new com.tencent.mm.plugin.remittance.ui.p9(this);
        this.U.setOnClickListener(p9Var);
        this.f157602h.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.remittance.ui.q9(this, p9Var));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pck);
        if (com.tencent.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chv);
        } else {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chu);
        }
        setTenpayKBStateListener(new com.tencent.mm.plugin.remittance.ui.r9(this));
        this.I = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcl);
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK")) {
            this.K = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcn);
            this.L = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pcq);
            this.K.post(new com.tencent.mm.plugin.remittance.ui.s9(this));
            this.f157602h.setmWalletFormViewListener(new com.tencent.mm.plugin.remittance.ui.t9(this));
        } else {
            this.I.setVisibility(8);
        }
        com.tencent.mm.ui.tools.k8.b(this, this.f157611t, findViewById(com.tencent.mm.R.id.jhz), findViewById(com.tencent.mm.R.id.jhz), findViewById(com.tencent.mm.R.id.jhy), 24, 0.0f, false);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isHandleAutoShowNormalStWcKb() {
        return this.f157598d == 0 && this.f157612u.o();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.a07)));
        android.view.View j17 = getSupportActionBar().j();
        if (j17 != null && (findViewById = j17.findViewById(android.R.id.text1)) != null && (findViewById instanceof android.widget.TextView)) {
            ((android.widget.TextView) findViewById).setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        if (fp.h.c(21) && !fp.h.c(23)) {
            getWindow().setStatusBarColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
        setBackBtn(new com.tencent.mm.plugin.remittance.ui.l9(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        addSceneEndListener(4954);
        addSceneEndListener(4839);
        setMMTitle(com.tencent.mm.R.string.hys);
        setBackBtn(new com.tencent.mm.plugin.remittance.ui.n9(this));
        this.f157617z = 4;
        this.B = getIntent().getStringExtra("shopName");
        this.f157613v = getIntent().getStringExtra("scanId");
        this.D = getIntent().getStringExtra("shopAddress");
        this.C = getIntent().getStringExtra("shopAdName");
        this.E = getIntent().getStringExtra("shopHeadImgURL");
        this.A = getIntent().getIntExtra("payChannel", 0);
        this.F = getIntent().getStringExtra("qrcode_sender_username");
        this.P = getIntent().getStringExtra("key_shop_desc");
        this.N = getIntent().getLongExtra("key_shop_amount", 0L);
        this.f157609r = getIntent().getBooleanExtra("merchantPayPayerDescRequired", false);
        java.lang.String stringExtra = getIntent().getStringExtra("merchantPayPayerDescPlaceholder");
        this.f157610s = stringExtra;
        if (this.f157609r && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f157610s = getString(com.tencent.mm.R.string.hyv);
        }
        double j18 = com.tencent.mm.wallet_core.ui.r1.j("" + this.N, "100", 2, java.math.RoundingMode.HALF_UP);
        this.f157615x = j18;
        if (j18 > 0.0d) {
            this.f157598d = 1;
        } else {
            this.f157598d = 0;
        }
        initView();
        e7();
        if (this.f157598d == 0) {
            this.V = 1;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(4954);
        removeSceneEndListener(4839);
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "onDestroy()");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.W, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157612u;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "onPause()");
        if (this.f157598d != 0 || this.f157612u.p()) {
            return;
        }
        this.V = 3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "onResume()");
        com.tencent.mm.plugin.remittance.ui.s1.d();
        com.tencent.mm.plugin.remittance.ui.r1.f157911a.a(this);
        if (this.V == 3 && isHandleAutoShowNormalStWcKb() && !this.f157609r) {
            showNormalStWcKb();
        }
        if (this.f157598d == 0) {
            this.V = 2;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.d0) {
            com.tencent.mm.plugin.remittance.model.d0 d0Var = (com.tencent.mm.plugin.remittance.model.d0) m1Var;
            hideLoading();
            if (i17 == 0 && i18 == 0) {
                r45.cl4 cl4Var = d0Var.f156804f;
                if (cl4Var.f371651d == 0) {
                    java.lang.String str2 = cl4Var.f371654g;
                    this.f157614w = cl4Var.f371653f;
                    if (com.tencent.mm.plugin.wallet_core.utils.l0.e(cl4Var.f371655h)) {
                        new com.tencent.mm.plugin.wallet_core.utils.l0(this).c(cl4Var.f371655h, new com.tencent.mm.plugin.remittance.ui.c9(this, d0Var));
                        return true;
                    }
                    c7(d0Var);
                } else {
                    java.lang.String str3 = cl4Var.f371652e;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    objArr[0] = str3 == null ? "" : str3;
                    objArr[1] = "";
                    com.tencent.mars.xlog.Log.w("MicroMsg.MerchantPayUI", "showAlert3() msg:%s, title:%s", objArr);
                    db5.e1.G(this, str3, "", true, null);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean shouldEnsureSoterConnection() {
        return true;
    }
}
