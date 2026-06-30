package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitBankcardInputUI extends com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI {
    public static final /* synthetic */ int W = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel E;
    public com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel F;
    public com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel G;
    public java.lang.String P;
    public r45.e77 Q;
    public java.lang.String U;
    public java.lang.String V;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156478e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156479f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156480g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f156481h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f156482i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f156483m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f156484n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f156485o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f156486p;

    /* renamed from: q, reason: collision with root package name */
    public pw3.h f156487q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Filter.FilterListener f156488r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f156489s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f156490t;

    /* renamed from: v, reason: collision with root package name */
    public int f156492v;

    /* renamed from: w, reason: collision with root package name */
    public int f156493w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f156494x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f156495y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f156496z;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f156491u = "";
    public android.app.Dialog D = null;
    public boolean H = true;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f156477J = false;
    public ow3.f K = null;
    public boolean L = false;
    public boolean M = false;
    public boolean N = true;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;

    public static void V6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        bankRemitBankcardInputUI.getClass();
        bankRemitBankcardInputUI.startActivityForResult(new android.content.Intent(bankRemitBankcardInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI.class), 2);
    }

    public static boolean W6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.F;
        if (bankcardElemParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcardElemParcel.f156461n)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "show alert text: %s", bankRemitBankcardInputUI.F.f156461n);
        db5.e1.G(bankRemitBankcardInputUI, bankRemitBankcardInputUI.F.f156461n, "", false, new qw3.w(bankRemitBankcardInputUI));
        return true;
    }

    public static boolean X6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        int i17 = bankRemitBankcardInputUI.f156492v;
        if (i17 <= 0 || i17 >= bankRemitBankcardInputUI.f156478e.getInputLength()) {
            return true;
        }
        dp.a.makeText(bankRemitBankcardInputUI, bankRemitBankcardInputUI.getString(com.tencent.mm.R.string.aem, bankRemitBankcardInputUI.f156492v + ""), 1).show();
        return false;
    }

    public static void Y6(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        bankRemitBankcardInputUI.getClass();
        android.content.Intent intent = new android.content.Intent(bankRemitBankcardInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI.class);
        if (bankRemitBankcardInputUI.I) {
            intent.putExtra("key_bank_card_seqno", bankRemitBankcardInputUI.G.f156470d);
            intent.putExtra("key_bank_card_tailno", bankRemitBankcardInputUI.G.f156471e);
            intent.putExtra("key_payee_name", bankRemitBankcardInputUI.G.f156475i);
            intent.putExtra("key_input_type", 1);
        } else {
            intent.putExtra("key_bank_card_seqno", bankRemitBankcardInputUI.f156496z);
            intent.putExtra("key_bank_card_tailno", bankRemitBankcardInputUI.A);
            intent.putExtra("key_payee_name", bankRemitBankcardInputUI.B);
            if (com.tencent.mm.sdk.platformtools.t8.K0(bankRemitBankcardInputUI.P)) {
                intent.putExtra("key_input_type", 0);
            } else {
                intent.putExtra("key_input_type", 3);
            }
        }
        java.lang.String str = bankRemitBankcardInputUI.f156491u;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_unique_id", str);
        intent.putExtra("key_enter_time_scene", bankRemitBankcardInputUI.E.f156465d);
        intent.putExtra("key_encrypt_data", bankRemitBankcardInputUI.f156494x);
        intent.putExtra("key_bank_card_elem_parcel", bankRemitBankcardInputUI.F);
        intent.putExtra("key_reason_len", bankRemitBankcardInputUI.f156493w);
        r45.e77 e77Var = bankRemitBankcardInputUI.Q;
        if (e77Var != null) {
            try {
                intent.putExtra("key_notice_item", e77Var.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankRemitBankcardInputUI", e17, "", new java.lang.Object[0]);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bankRemitBankcardInputUI, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI", "gotoMoneyInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bankRemitBankcardInputUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(bankRemitBankcardInputUI, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI", "gotoMoneyInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Z6() {
        if (this.f156481h.getVisibility() == 0) {
            this.f156480g.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.b_g));
        } else {
            this.f156480g.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.f480893ew));
        }
    }

    public final void a7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do fetch transfer record: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            doSceneProgress(new ow3.k(), true);
        } else {
            doSceneProgress(new ow3.k(), false);
        }
    }

    public final void b7(com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel, java.util.List list) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel2 = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) list.get(size);
                if (transferRecordParcel2.f156470d.equals(transferRecordParcel.f156470d)) {
                    transferRecordParcel2.f156476m = transferRecordParcel.f156476m;
                    return;
                }
            }
        }
    }

    public final void c7(java.lang.String str, java.util.List list) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) list.get(size);
                if (transferRecordParcel.f156470d.equals(str)) {
                    list.remove(transferRecordParcel);
                    return;
                }
            }
        }
    }

    public final void d7() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = this.F;
        if (bankcardElemParcel != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcardElemParcel.f156459i)) {
            this.E = null;
            return;
        }
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel2 = this.F;
        if (bankcardElemParcel2 == null || (arrayList = bankcardElemParcel2.f156462o) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = (com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel) it.next();
            if (enterTimeParcel.f156468g > 0) {
                this.E = enterTimeParcel;
                return;
            }
        }
    }

    public final void e7() {
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f156478e.getText()) || this.f156478e.getText().trim().isEmpty() || com.tencent.mm.sdk.platformtools.t8.K0(this.f156479f.getText()) || !this.f156478e.n() || this.f156479f.getText().trim().isEmpty() || !this.f156479f.n() || com.tencent.mm.sdk.platformtools.t8.K0(this.f156480g.getText()) || this.f156481h.getVisibility() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f156481h.getText()) || (bankcardElemParcel = this.F) == null || !com.tencent.mm.sdk.platformtools.t8.K0(bankcardElemParcel.f156461n)) {
            this.f156483m.setEnabled(false);
        } else {
            this.f156483m.setEnabled(true);
        }
    }

    public final void f7() {
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = this.F;
        if (bankcardElemParcel != null) {
            this.f156480g.setText(bankcardElemParcel.f156455e);
            this.f156482i.setUrl(this.F.f156456f);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f156482i.getLayoutParams();
            layoutParams.setMargins(i65.a.b(getContext(), 15), 0, 0, 0);
            this.f156482i.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public final void g7() {
        com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = this.E;
        if (enterTimeParcel != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(enterTimeParcel.f156469h)) {
                this.f156481h.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            } else {
                this.f156481h.setContentTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.E.f156469h, true));
            }
            this.f156481h.setText(this.E.f156466e);
            this.f156481h.setVisibility(0);
            return;
        }
        com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = this.F;
        if (bankcardElemParcel == null || com.tencent.mm.sdk.platformtools.t8.K0(bankcardElemParcel.f156459i)) {
            this.f156481h.setVisibility(8);
            return;
        }
        this.f156481h.setText(this.F.f156459i);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.F.f156460m)) {
            this.f156481h.setContentTextColorRes(com.tencent.mm.R.color.a0c);
        } else {
            this.f156481h.setContentTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(this.F.f156460m, true));
        }
        this.f156481h.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488179jp;
    }

    public final void h7() {
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel = this.G;
        if (transferRecordParcel != null) {
            this.f156478e.setText(transferRecordParcel.f156475i);
            this.I = true;
            this.f156479f.setText(getString(com.tencent.mm.R.string.adp, this.G.f156471e));
            this.f156480g.setText(this.G.f156473g);
            this.f156482i.setUrl(this.G.f156472f);
            this.f156479f.e();
            this.f156479f.setContentEnabled(false);
            this.f156477J = true;
            this.f156480g.setClickable(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.LinearLayout linearLayout;
        int b17 = i65.a.b(getContext(), 16);
        int b18 = i65.a.b(getContext(), 8);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(b17, b17);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = b18;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ax7);
        this.f156478e = walletFormView;
        walletFormView.getInfoIv().setLayoutParams(layoutParams);
        this.f156478e.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f156478e.getInfoIv();
        int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv.f192042v = color;
        this.f156478e.setIsSecretAnswer(true);
        this.f156478e.findViewById(com.tencent.mm.R.id.pcg).setAccessibilityDelegate(new qw3.m0(this, null));
        this.f156478e.getContentEt().setInputType(131073);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ax6);
        this.f156479f = walletFormView2;
        walletFormView2.getInfoIv().setLayoutParams(layoutParams);
        this.f156479f.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv2 = this.f156479f.getInfoIv();
        int color2 = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv2.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv2.f192042v = color2;
        ((android.widget.TextView) this.f156479f.findViewById(com.tencent.mm.R.id.f487682pf5)).setAccessibilityDelegate(new qw3.l0(this, null));
        this.f156479f.getContentEt().setInputType(131073);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f483462ax5);
        this.f156480g = walletFormView3;
        walletFormView3.getContentEt().setInputType(131073);
        this.f156482i = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f156480g.findViewById(com.tencent.mm.R.id.pci);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView4 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f483461ax4);
        this.f156481h = walletFormView4;
        walletFormView4.getContentEt().setInputType(131073);
        this.f156483m = (android.widget.Button) findViewById(com.tencent.mm.R.id.ax8);
        this.f156478e.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        this.f156478e.setOnFocusChangeListener(new qw3.v(this));
        android.widget.EditText contentEt = this.f156478e.getContentEt();
        android.widget.EditText contentEt2 = this.f156479f.getContentEt();
        if (!la5.b.f317600a.g(true) && (linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.adk)) != null) {
            linearLayout.setClickable(true);
            linearLayout.setOnTouchListener(new qw3.x(this, contentEt));
        }
        this.f156478e.b(new qw3.y(this, contentEt, contentEt2));
        this.f156478e.setOnEditorActionListener(new qw3.a0(this));
        qp5.p.a(this.f156479f);
        setEditFocusListener(this.f156479f, 2, false, false, true);
        this.f156479f.b(new qw3.c0(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            this.f156479f.setText(this.P);
        }
        this.f156480g.setOnClickListener(new qw3.d0(this));
        this.f156481h.setOnClickListener(new qw3.e0(this));
        this.f156483m.setOnClickListener(new qw3.g0(this));
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f156485o = wcPayBannerView;
        wcPayBannerView.a();
        this.f156478e.getInfoIv().setVisibility(0);
        this.f156478e.getInfoIv().setClickable(true);
        this.f156478e.getInfoIv().setEnabled(true);
        this.f156478e.getInfoIv().setIconContentDescription(getString(com.tencent.mm.R.string.aew));
        this.f156478e.getInfoIv().setOnClickListener(new qw3.u(this));
        e7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel;
        if (i17 != 1) {
            if (i17 != 3) {
                if (i17 != 2) {
                    super.onActivityResult(i17, i18, intent);
                    return;
                }
                if (i18 == -1) {
                    this.F = (com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel) intent.getParcelableExtra("key_bank_card_elem_parcel");
                    f7();
                    d7();
                    g7();
                    Z6();
                    e7();
                    return;
                }
                return;
            }
            if (i18 == -1) {
                int intExtra = intent.getIntExtra("key_enter_time_scene", -1);
                com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel bankcardElemParcel = this.F;
                if (bankcardElemParcel != null && (arrayList = bankcardElemParcel.f156462o) != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel enterTimeParcel = (com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel) it.next();
                        if (enterTimeParcel.f156465d == intExtra) {
                            this.E = enterTimeParcel;
                            break;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitBankcardInputUI", "can't find the right enter scene: %d", java.lang.Integer.valueOf(intExtra));
                g7();
                e7();
                return;
            }
            return;
        }
        if (i18 == -1) {
            this.H = false;
            java.lang.String stringExtra = intent.getStringExtra("key_bank_card_seqno");
            this.f156496z = stringExtra;
            java.util.ArrayList arrayList2 = this.f156489s;
            if (arrayList2 != null) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) it6.next();
                    if (transferRecordParcel.f156470d.equals(stringExtra)) {
                        break;
                    }
                }
            }
            java.util.ArrayList arrayList3 = this.f156490t;
            if (arrayList3 != null) {
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    transferRecordParcel = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) it7.next();
                    if (transferRecordParcel.f156470d.equals(stringExtra)) {
                        break;
                    }
                }
            }
            transferRecordParcel = null;
            this.G = transferRecordParcel;
            h7();
            e7();
            com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel2 = this.G;
            if (transferRecordParcel2 != null) {
                java.lang.String str = this.f156495y;
                java.lang.String str2 = transferRecordParcel2.f156470d;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", str2);
                doSceneProgress(new ow3.a(str2, str, transferRecordParcel2.f156474h), false);
            }
            com.tencent.mm.sdk.platformtools.u3.i(new qw3.q(this), 50L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "resultCode: %s", java.lang.Integer.valueOf(i18));
        if (intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_delete_seq_no_list");
            java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_modified_record_list");
            if (stringArrayListExtra != null) {
                java.util.Iterator<java.lang.String> it8 = stringArrayListExtra.iterator();
                while (it8.hasNext()) {
                    java.lang.String next = it8.next();
                    c7(next, this.f156489s);
                    c7(next, this.f156490t);
                }
            }
            if (parcelableArrayListExtra != null) {
                java.util.Iterator it9 = parcelableArrayListExtra.iterator();
                while (it9.hasNext()) {
                    com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel transferRecordParcel3 = (com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel) it9.next();
                    b7(transferRecordParcel3, this.f156489s);
                    b7(transferRecordParcel3, this.f156490t);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        this.P = getIntent().getStringExtra("key_content");
        initView();
        addSceneEndListener(1348);
        addSceneEndListener(1542);
        addSceneEndListener(1378);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.dd.CTRL_INDEX);
        addSceneEndListener(1280);
        this.C = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_PAYLIST_STRING_SYNC, "");
        a7(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "do operation");
        this.S = true;
        doSceneProgress(new ow3.i(), false);
        setMMTitle(com.tencent.mm.R.string.f490703af0);
        addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new qw3.i(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 1);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1348);
        removeSceneEndListener(1542);
        removeSceneEndListener(1378);
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.dd.CTRL_INDEX);
        removeSceneEndListener(1280);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f156478e.postDelayed(new qw3.p(this), 500L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (m1Var instanceof ow3.a) {
            ow3.a aVar = (ow3.a) m1Var;
            if (!aVar.f349392u.equals(this.G.f156470d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "outdated request: %s, %s", aVar.f349392u, this.f156496z);
                return true;
            }
            aVar.O(new qw3.e(this, aVar));
            aVar.J(new qw3.d(this, aVar));
            if (aVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", aVar);
            }
        } else if (m1Var instanceof ow3.f) {
            ow3.f fVar = (ow3.f) m1Var;
            if (fVar == this.K) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "reset pending scene");
                this.K = null;
            }
            if (!fVar.f349406u.equals(this.f156479f.getMD5Value())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitBankcardInputUI", "outdated card request: %s, %s", fVar.f349406u, this.f156479f.getMD5Value());
                return true;
            }
            if (!fVar.f214031i && !fVar.f214032m) {
                r45.qd qdVar = fVar.f349404s.f381194f;
                if (qdVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitBankcardInputUI", "bank_elem is null");
                    V6(this);
                } else {
                    this.F = new com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel(qdVar);
                    f7();
                    d7();
                    g7();
                    Z6();
                    e7();
                }
            }
            if (fVar.f214032m) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "bank info reponse error: %s, msg: %s", java.lang.Integer.valueOf(fVar.f349404s.f381192d), fVar.f349404s.f381193e);
                V6(this);
            }
            if (fVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", fVar);
            }
        } else if (m1Var instanceof ow3.k) {
            ow3.k kVar = (ow3.k) m1Var;
            this.M = true;
            kVar.O(new qw3.h(this, kVar));
            kVar.J(new qw3.g(this, kVar));
            if (kVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", kVar);
                this.L = true;
            }
        } else if (m1Var instanceof ow3.d) {
            ow3.d dVar = (ow3.d) m1Var;
            dVar.O(new qw3.l(this, dVar));
            dVar.J(new qw3.k(this, dVar));
            if (dVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", dVar);
            }
        } else if (m1Var instanceof ow3.i) {
            ow3.i iVar = (ow3.i) m1Var;
            iVar.O(new qw3.o(this, iVar));
            iVar.J(new qw3.n(this, iVar));
            if (iVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", iVar);
                this.S = false;
                this.T = false;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(qw3.k0.class);
    }
}
