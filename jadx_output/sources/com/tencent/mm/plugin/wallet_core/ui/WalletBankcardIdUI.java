package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletBankcardIdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f179858r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179859d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179860e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179861f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179862g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f179863h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.m1 f179864i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179865m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f179866n = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f179867o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179868p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179869q;

    public WalletBankcardIdUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f179868p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.1
            {
                this.__eventId = 92672998;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletEntryChangeAccountEvent walletEntryChangeAccountEvent) {
                com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.this.finish();
                return false;
            }
        };
        this.f179869q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.10
            {
                this.__eventId = 96068484;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent) {
                com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent2 = scanBankCardResultEvent;
                if (!(scanBankCardResultEvent2 instanceof com.tencent.mm.autogen.events.ScanBankCardResultEvent)) {
                    com.tencent.mars.xlog.Log.f("Micromsg.WalletInputCardIDUI", "mismatched ScanBankCardResultEvent event");
                    return false;
                }
                com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
                java.lang.String randomKey = encrypt.getRandomKey();
                java.lang.String desedeEncode = encrypt.desedeEncode(scanBankCardResultEvent2.f54727g.f7741a, randomKey);
                android.graphics.Bitmap bitmap = scanBankCardResultEvent2.f54727g.f7742b;
                int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.f179858r;
                com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.this;
                walletBankcardIdUI.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_bankcard_id", desedeEncode);
                bundle.putString("key_bankcard_des", randomKey);
                bundle.putParcelable("key_bankcard_cropimg", bitmap);
                com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(walletBankcardIdUI);
                if (g17 != null) {
                    g17.B(walletBankcardIdUI, com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI.class, bundle);
                }
                return true;
            }
        };
    }

    public final boolean U6() {
        if (this.f179860e.c(null)) {
            this.f179859d.setEnabled(true);
            this.f179859d.setClickable(true);
            return true;
        }
        this.f179859d.setEnabled(false);
        this.f179859d.setClickable(false);
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5j;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179859d = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f483580bb3);
        this.f179860e = walletFormView;
        qp5.p.a(walletFormView);
        this.f179861f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.k3n);
        if (getInput().getBoolean("key_bind_show_change_card", false)) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = this.f179861f;
            if (walletFormView2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
            } else {
                walletFormView2.setOnInfoIvClickListener(new qp5.k(this));
                walletFormView2.setFilterChar("\\x20\\t\\r\\n".toCharArray());
            }
        } else {
            qp5.p.h(this, this.f179861f);
        }
        this.f179860e.setOnInputValidChangeListener(this);
        this.f179859d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.d1(this));
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            this.f179867o = process.f213801c.getBoolean("key_is_realname_verify_process", false);
        } else {
            this.f179867o = false;
        }
        if (this.f179867o) {
            setMMTitle(com.tencent.mm.R.string.kx9);
        } else {
            setMMTitle(com.tencent.mm.R.string.knd);
        }
        this.f179862g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdt);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y() || ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().x()) {
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(this);
            b4Var.f180146d = new com.tencent.mm.plugin.wallet_core.ui.e1(this);
            java.lang.String string = getString(com.tencent.mm.R.string.kn7);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(b4Var, string.length() - 6, string.length(), 33);
            this.f179862g.setText(spannableString);
            this.f179862g.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        } else {
            this.f179862g.setVisibility(0);
            java.lang.String string2 = getInput().getString("key_custom_bind_tips");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                this.f179862g.setText(string2);
            }
        }
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = (com.tencent.mm.plugin.wallet_core.model.FavorPayInfo) getInput().getParcelable("key_favor_pay_info");
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        if (favorPayInfo != null && orders != null) {
            com.tencent.mm.plugin.wallet_core.ui.g0 a17 = com.tencent.mm.plugin.wallet_core.ui.h0.INSTANCE.a(orders);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pba);
            if (a17 != null) {
                java.lang.String c17 = a17.c(favorPayInfo.f179667d, false);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                vr4.j0 j0Var = a17.f180279a;
                if (j0Var.f439757h != null) {
                    java.util.Map b17 = a17.b(c17, false);
                    int i17 = 0;
                    while (true) {
                        java.util.LinkedList linkedList2 = j0Var.f439757h;
                        if (i17 >= linkedList2.size()) {
                            break;
                        }
                        vr4.i1 i1Var = (vr4.i1) linkedList2.get(i17);
                        if (i1Var != null) {
                            if (i1Var.f439745r != 0) {
                                if (((java.util.HashMap) b17).containsKey(i1Var.f439746s)) {
                                    linkedList.add(i1Var);
                                }
                            }
                        }
                        i17++;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
                }
                if (linkedList.size() > 0) {
                    this.f179864i = new com.tencent.mm.plugin.wallet_core.ui.m1(getContext(), linkedList);
                    textView.setText(com.tencent.mm.R.string.f493539kn5);
                    textView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.f1(this));
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            } else {
                com.tencent.mars.xlog.Log.w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
                textView.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle = (com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle) getInput().getParcelable("realname_verify_process_bundle");
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        if (this.f179867o && realNameBundle != null && !com.tencent.mm.sdk.platformtools.t8.K0(realNameBundle.f179423d)) {
            this.f179861f.setVisibility(0);
            this.f179861f.setText(realNameBundle.f179423d);
            this.f179860e.setHint(getString(com.tencent.mm.R.string.kit));
            this.f179861f.setClickable(false);
            this.f179861f.setEnabled(false);
            this.f179862g.setText(com.tencent.mm.R.string.knc);
        } else if (!fj6.w() || fj6.q() == null || com.tencent.mm.sdk.platformtools.t8.K0(fj6.q().trim()) || !fj6.t()) {
            this.f179861f.setVisibility(8);
            this.f179860e.setHint(getString(com.tencent.mm.R.string.kn9));
        } else {
            this.f179861f.setVisibility(0);
            this.f179861f.setText(fj6.q());
            this.f179860e.setHint(getString(com.tencent.mm.R.string.kit));
            this.f179861f.setClickable(false);
            this.f179861f.setEnabled(false);
        }
        if (getInput().getInt("key_bind_scene") == 18 || getInput().getInt("key_bind_scene") == 19) {
            this.f179860e.setHint(getString(com.tencent.mm.R.string.kna));
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_SUPPORT_BANK_WORD_STRING, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f179860e.setHint(str);
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_history_bankcard");
        this.f179863h = bankcard;
        if (bankcard != null) {
            this.f179860e.setText(bankcard.J2);
            this.f179860e.b(new com.tencent.mm.plugin.wallet_core.ui.g1(this));
        }
        U6();
        com.tencent.mm.plugin.wallet_core.utils.b1.d(this, getInput(), 2);
        setEditFocusListener(this.f179860e, 0, false);
        this.f179860e.setOnInfoIvClickListener(new com.tencent.mm.plugin.wallet_core.ui.h1(this, realNameBundle));
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().g()) {
            this.f179860e.getInfoIv().setVisibility(0);
            this.f179860e.getInfoIv().setImageResource(com.tencent.mm.R.raw.wallet_scan_camera);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.knd);
        initView();
        this.f179868p.alive();
        this.f179869q.alive();
        this.f179866n = getInput().getInt("key_bind_scene");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 != 1) {
            if (!this.f179867o || i17 != 1000) {
                return super.onCreateDialog(i17);
            }
            java.lang.String string = getString(com.tencent.mm.R.string.kn6);
            com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(this);
            int q17 = g17 != null ? g17.q(this, 1) : -1;
            if (q17 != -1) {
                string = getString(q17);
            }
            return db5.e1.K(this, true, string, "", getString(com.tencent.mm.R.string.f490608zu), getString(com.tencent.mm.R.string.f490503wx), new com.tencent.mm.plugin.wallet_core.ui.i1(this), new com.tencent.mm.plugin.wallet_core.ui.j1(this));
        }
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.d6z, (android.view.ViewGroup) null);
        ((com.tencent.mm.ui.ListViewInScrollView) inflate.findViewById(com.tencent.mm.R.id.f482735mf)).setAdapter((android.widget.ListAdapter) this.f179864i);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.f493538kn4);
        aVar.L = inflate;
        aVar.G = null;
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.kmf);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        return j0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f179868p.dead();
        this.f179869q.dead();
        super.onDestroy();
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        if (!z17) {
            this.f179863h = null;
            getInput().putParcelable("key_history_bankcard", null);
        }
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.z) {
                ss4.z zVar = (ss4.z) m1Var;
                bundle.putBoolean("key_need_area", zVar.f412152i == 1);
                bundle.putBoolean("key_need_profession", zVar.f412153m == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f412154n);
                bundle.putBoolean("key_need_country", zVar.f412155o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f412156p);
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = zVar.f412148e;
                if (elementQuery != null) {
                    if (elementQuery.f179656p && elementQuery.c()) {
                        db5.e1.i(this, com.tencent.mm.R.string.kfs, com.tencent.mm.R.string.f490573yv);
                        return true;
                    }
                    bundle.putString("bank_name", zVar.f412148e.f179648e);
                    bundle.putParcelable("elemt_query", zVar.f412148e);
                    bundle.putString("key_card_id", this.f179860e.getText());
                    com.tencent.mm.wallet_core.a.d(this, bundle);
                    return true;
                }
                bundle.putString("bank_name", "");
                bundle.putParcelable("elemt_query", new com.tencent.mm.plugin.wallet_core.model.ElementQuery());
                bundle.putString("key_card_id", this.f179860e.getText());
                com.tencent.mm.wallet_core.a.d(this, bundle);
            }
        } else if (i18 == 1 && (m1Var instanceof ss4.z)) {
            bundle.putString("bank_name", "");
            bundle.putParcelable("elemt_query", new com.tencent.mm.plugin.wallet_core.model.ElementQuery());
            bundle.putString("key_card_id", this.f179860e.getText());
            com.tencent.mm.wallet_core.a.d(this, bundle);
            return true;
        }
        return false;
    }
}
