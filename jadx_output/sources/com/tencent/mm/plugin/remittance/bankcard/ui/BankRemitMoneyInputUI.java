package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitMoneyInputUI extends com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI {
    public static final /* synthetic */ int R = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public com.tencent.mm.plugin.wallet_core.ui.d7 H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f156513J;
    public java.lang.String K;
    public int M;
    public int N;
    public com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage P;
    public r45.e77 Q;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f156515f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f156516g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f156517h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f156518i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156519m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f156520n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f156521o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f156522p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f156523q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f156524r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f156525s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f156526t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f156527u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f156528v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f156529w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f156530x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel f156531y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f156532z;

    /* renamed from: e, reason: collision with root package name */
    public final int f156514e = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 270);
    public java.lang.String G = "";
    public int L = 0;

    public static void V6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        bankRemitMoneyInputUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "do start pay");
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str;
        payInfo.f192109e = 49;
        payInfo.f192111g = tw3.b.f422479a;
        android.os.Bundle bundle = new android.os.Bundle();
        payInfo.f192122u = bundle;
        if (bankRemitMoneyInputUI.mKindaEnable) {
            bundle.putString("key_transfer_bill_id", bankRemitMoneyInputUI.f156513J);
            bundle.putString("extinfo_key_2", str2);
            bundle.putString("extinfo_key_3", str3);
            bundle.putString("extinfo_key_4", str4);
            ((h45.q) i95.n0.c(h45.q.class)).startSNSPay(bankRemitMoneyInputUI, payInfo);
            return;
        }
        bundle.putString("extinfo_key_1", bankRemitMoneyInputUI.getString(com.tencent.mm.R.string.aev, str3, str4) + str2);
        h45.a0.f(bankRemitMoneyInputUI, payInfo, 1);
    }

    public static void Y6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI) {
        int round = (int) java.lang.Math.round(com.tencent.mm.sdk.platformtools.t8.F(bankRemitMoneyInputUI.f156519m.getText(), 0.0d) * 100.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "do request order, money: %s, fee: %s, desc: %s, input: %s, timeScene: %s", java.lang.Integer.valueOf(round), java.lang.Long.valueOf(bankRemitMoneyInputUI.I), bankRemitMoneyInputUI.G, java.lang.Integer.valueOf(bankRemitMoneyInputUI.F), java.lang.Integer.valueOf(bankRemitMoneyInputUI.E));
        java.lang.String str = bankRemitMoneyInputUI.A;
        java.lang.String str2 = bankRemitMoneyInputUI.B;
        java.lang.String str3 = bankRemitMoneyInputUI.D;
        int i17 = bankRemitMoneyInputUI.E;
        java.lang.String str4 = bankRemitMoneyInputUI.G;
        int i18 = (int) bankRemitMoneyInputUI.I;
        int i19 = bankRemitMoneyInputUI.F;
        java.lang.String str5 = bankRemitMoneyInputUI.C;
        java.lang.String str6 = bankRemitMoneyInputUI.K;
        ow3.m mVar = new ow3.m(str, str2, str3, i17, round, str4, i18, i19, str5, str6 == null ? "" : str6, new com.tencent.mm.protobuf.g(("" + bankRemitMoneyInputUI.f156513J).getBytes()), bankRemitMoneyInputUI.L);
        mVar.K(bankRemitMoneyInputUI);
        if (!bankRemitMoneyInputUI.mKindaEnable) {
            bankRemitMoneyInputUI.doSceneProgress(mVar);
        } else {
            bankRemitMoneyInputUI.showLoading();
            bankRemitMoneyInputUI.doSceneProgress(mVar, false);
        }
    }

    public static boolean a7(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, ow3.m mVar) {
        bankRemitMoneyInputUI.getClass();
        r45.h7 h7Var = mVar.f349427s.f382471n;
        if (h7Var == null || h7Var.f375892d != 1) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "show alert item");
        db5.e1.C(bankRemitMoneyInputUI, h7Var.f375893e, "", h7Var.f375895g, h7Var.f375894f, false, new qw3.b1(bankRemitMoneyInputUI, h7Var, mVar), new qw3.c1(bankRemitMoneyInputUI));
        return true;
    }

    public final void c7() {
        if (com.tencent.mm.sdk.platformtools.t8.F(this.f156519m.getText(), 0.0d) > 0.0d && !com.tencent.mm.sdk.platformtools.t8.K0(this.A) && !com.tencent.mm.sdk.platformtools.t8.K0(this.B) && !com.tencent.mm.sdk.platformtools.t8.K0(this.D) && !com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            this.f156525s.setEnabled(true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "disable btn: money: %s, seqNo: %s, tail: %s, bankType: %s, encrypt: %s", this.f156519m.getText(), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.A)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.B)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.D)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.C)));
            this.f156525s.setEnabled(false);
        }
    }

    public final void d7() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            spannableStringBuilder.append((java.lang.CharSequence) getString(com.tencent.mm.R.string.aeq));
            spannableStringBuilder.setSpan(this.H, 0, spannableStringBuilder.length(), 18);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.lang.String str = this.G;
            ((ke0.e) xVar).getClass();
            spannableStringBuilder.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            spannableStringBuilder.append((java.lang.CharSequence) (" " + getString(com.tencent.mm.R.string.aep)));
            spannableStringBuilder.setSpan(this.H, this.G.length(), spannableStringBuilder.length(), 34);
        }
        this.f156524r.setText(spannableStringBuilder);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488183jt;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        r45.f77 f77Var;
        this.f156518i = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view);
        this.f156515f = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.aya);
        this.f156516g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ayc);
        this.f156517h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ayh);
        this.f156519m = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ayb);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ayd);
        this.f156520n = linearLayout;
        this.f156521o = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.aye);
        this.f156522p = (android.widget.TextView) this.f156520n.findViewById(com.tencent.mm.R.id.ayf);
        this.f156523q = (android.widget.TextView) this.f156520n.findViewById(com.tencent.mm.R.id.ayj);
        this.f156524r = (android.widget.TextView) this.f156520n.findViewById(com.tencent.mm.R.id.ayi);
        this.f156525s = (android.widget.Button) findViewById(com.tencent.mm.R.id.ayg);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.lwf);
        this.f156526t = viewGroup;
        this.f156527u = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.lx9);
        this.f156528v = (android.widget.TextView) this.f156526t.findViewById(com.tencent.mm.R.id.lxb);
        this.f156529w = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f156526t.findViewById(com.tencent.mm.R.id.lx_);
        this.f156530x = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f156526t.findViewById(com.tencent.mm.R.id.lxa);
        this.f156521o.setText(getString(com.tencent.mm.R.string.ae9, this.f156531y.f156463p));
        this.f156515f.setUrl(this.f156531y.f156456f);
        this.f156516g.setText(getString(com.tencent.mm.R.string.aev, this.f156531y.f156455e, this.B));
        this.f156517h.setText(this.f156532z);
        this.f156519m.setTitleText(com.tencent.mm.wallet_core.model.c2.b());
        setEditFocusListener(this.f156519m, 2, false);
        this.f156519m.setmContentAbnormalMoneyCheck(true);
        this.f156519m.b(new qw3.v0(this));
        this.f156524r.setClickable(true);
        this.f156524r.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.H = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new qw3.a1(this, getIntent().getIntExtra("key_reason_len", 10)));
        d7();
        this.f156525s.setOnClickListener(new qw3.w0(this));
        c7();
        r45.e77 e77Var = this.Q;
        if (e77Var == null || e77Var.f373084d != 1 || (f77Var = e77Var.f373085e) == null || com.tencent.mm.sdk.platformtools.t8.K0(f77Var.f374081d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "  do not show WarningView");
            this.f156526t.setVisibility(8);
        } else {
            r45.e77 e77Var2 = this.Q;
            r45.f77 f77Var2 = e77Var2.f373085e;
            this.f156526t.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "warning textInfo.wording:%s", f77Var2.f374081d);
            this.f156528v.setText(f77Var2.f374081d);
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373087g)) {
                this.f156528v.setTextColor(com.tencent.mm.wallet_core.ui.r1.l0(e77Var2.f373086f));
            } else {
                this.f156528v.setTextColor(com.tencent.mm.wallet_core.ui.r1.l0(e77Var2.f373087g));
            }
            int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 20.0f);
            int d18 = com.tencent.mm.sdk.platformtools.j.d(this, 8.0f);
            int d19 = com.tencent.mm.sdk.platformtools.j.d(this, 16.0f);
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373089i)) {
                this.f156529w.b(e77Var2.f373088h, d17, d17, -1);
            } else {
                this.f156529w.b(e77Var2.f373089i, d17, d17, -1);
            }
            if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373091n)) {
                this.f156530x.b(e77Var2.f373091n, d18, d19, -1);
            } else if (com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373090m)) {
                this.f156530x.setVisibility(8);
            } else {
                this.f156530x.b(e77Var2.f373090m, d18, d19, -1);
            }
            this.f156526t.postDelayed(new qw3.t0(this), 10L);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28871, 3, 1);
            this.f156527u.setClickable(true);
            this.f156527u.setOnClickListener(new qw3.u0(this, f77Var2));
        }
        setTenpayKBStateListener(new qw3.x0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ow3.l lVar;
        if (i17 != 1) {
            if (i17 != 2) {
                super.onActivityResult(i17, i18, intent);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            j45.l.j(getContext(), "offline", ".ui.WalletOfflineCoinPurseUI", intent2, null);
            return;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "goto detail");
            android.content.Intent intent3 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitDetailUI.class);
            intent3.putExtra("key_transfer_bill_id", this.f156513J);
            intent3.putExtra("key_enter_scene", 0);
            startActivityForResult(intent3, 2);
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_trans_id") : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "do business callback: %s, %s", this.f156513J, stringExtra);
            doSceneProgress(new ow3.c(this.f156513J, stringExtra), false);
            this.L = 1;
            lVar = new ow3.l(this.f156513J, this.K, 1);
        } else if (com.tencent.mm.wallet_core.model.b2.b(intent)) {
            finish();
            return;
        } else {
            if (com.tencent.mm.wallet_core.model.b2.c(intent)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "pay failed: %d", java.lang.Integer.valueOf(i18));
            this.L = intent.getIntExtra("key_pay_reslut_type", 0);
            lVar = new ow3.l(this.f156513J, this.K, this.L);
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "onActivityResult() requestCode == REQ_PAY resultCode != RESULT_OK  mUnpayType:%s", java.lang.Integer.valueOf(this.L));
        }
        doSceneProgress(lVar, false);
    }

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        addSceneEndListener(1380);
        addSceneEndListener(2739);
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, 10)).intValue();
        this.M = intValue >= 0 ? intValue : 10;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC;
        int i17 = com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN;
        int intValue2 = ((java.lang.Integer) c17.m(u3Var, java.lang.Integer.valueOf(com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN))).intValue();
        if (intValue2 > 0) {
            i17 = intValue2;
        }
        this.N = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", "minFee: %s, maxAmount: %s", java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(this.N));
        this.K = getIntent().getStringExtra("key_unique_id");
        this.f156531y = (com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel) getIntent().getParcelableExtra("key_bank_card_elem_parcel");
        this.f156532z = getIntent().getStringExtra("key_payee_name");
        this.A = getIntent().getStringExtra("key_bank_card_seqno");
        this.B = getIntent().getStringExtra("key_bank_card_tailno");
        this.C = getIntent().getStringExtra("key_encrypt_data");
        this.E = getIntent().getIntExtra("key_enter_time_scene", 0);
        this.F = getIntent().getIntExtra("key_input_type", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_notice_item");
        if (byteArrayExtra != null) {
            r45.e77 e77Var = new r45.e77();
            try {
                e77Var.parseFrom(byteArrayExtra);
                this.Q = e77Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankRemitMoneyInputUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (this.f156531y == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitMoneyInputUI", "bankcard elem is null");
            this.f156531y = new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel();
        }
        this.D = this.f156531y.f156454d;
        initView();
        setMMTitle(com.tencent.mm.R.string.f490703af0);
        com.tencent.mm.wallet_core.b.a().getClass();
        this.mKindaEnable = true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1380);
        removeSceneEndListener(2739);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ow3.m)) {
            return false;
        }
        ow3.m mVar = (ow3.m) m1Var;
        mVar.O(new qw3.y0(this, mVar));
        if (mVar.f214032m) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitMoneyInputUI", "request order error: %s, %s", java.lang.Integer.valueOf(mVar.f349427s.f382464d), mVar.f349427s.f382465e);
            a7(this, mVar);
            if (this.mKindaEnable) {
                hideLoading();
            }
        }
        if (!mVar.f214031i) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitMoneyInputUI", "net error: %s", mVar);
        if (!this.mKindaEnable) {
            return false;
        }
        hideLoading();
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(qw3.e1.class);
    }
}
