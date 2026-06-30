package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayCheckPwdUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f142305f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f142306g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142307h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142308i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f142309m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142310n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142311o;

    /* renamed from: p, reason: collision with root package name */
    public long f142312p;

    /* renamed from: q, reason: collision with root package name */
    public int f142313q;

    /* renamed from: r, reason: collision with root package name */
    public r45.an6 f142314r;

    /* renamed from: s, reason: collision with root package name */
    public int f142315s;

    public static void V6(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI honeyPayCheckPwdUI) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(honeyPayCheckPwdUI.f142314r == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do get pwd token: %s", objArr);
        if (honeyPayCheckPwdUI.f142314r != null) {
            honeyPayCheckPwdUI.showSafeProgress();
            java.lang.String text = honeyPayCheckPwdUI.f142305f.getText();
            r45.an6 an6Var = honeyPayCheckPwdUI.f142314r;
            honeyPayCheckPwdUI.doSceneProgress(new ss4.c0(text, an6Var.f370159g, an6Var.f370156d, an6Var.f370157e, an6Var.f370158f, an6Var.f370160h), false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void cleanUiData(int i17) {
        super.cleanUiData(i17);
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f142305f;
        if (editHintPasswdView != null) {
            editHintPasswdView.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjp;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) findViewById(com.tencent.mm.R.id.hdh);
        this.f142305f = editHintPasswdView;
        qp5.p.b(editHintPasswdView);
        this.f142305f.setOnInputValidListener(new v73.w(this));
        setEditFocusListener(this.f142305f, 0, false);
        this.f142307h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pes);
        this.f142306g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.peo);
        int i17 = this.f142313q;
        if (i17 == 1) {
            this.f142307h.setText(com.tencent.mm.R.string.fwo);
        } else if (i17 == 2) {
            this.f142307h.setText(com.tencent.mm.R.string.fwp);
        } else {
            this.f142307h.setText(com.tencent.mm.R.string.fwr);
        }
        this.f142306g.setText(com.tencent.mm.R.string.fwq);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f142308i = getIntent().getStringExtra("key_username");
        this.f142309m = getIntent().getStringExtra("key_take_message");
        this.f142312p = getIntent().getLongExtra("key_credit_line", 0L);
        this.f142313q = getIntent().getIntExtra("key_scene", 0);
        this.f142310n = getIntent().getStringExtra("key_card_no");
        this.f142311o = getIntent().getStringExtra("key_wishing");
        if (this.f142313q == 1) {
            int intExtra = getIntent().getIntExtra("key_cardtype", 0);
            this.f142315s = intExtra;
            if (intExtra == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayCheckPwdUI", "error card type: %s", java.lang.Integer.valueOf(intExtra));
                finish();
            }
        }
        int i17 = this.f142313q;
        if (i17 == 3 || i17 == 2) {
            r45.an6 an6Var = new r45.an6();
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_toke_mess");
                if (byteArrayExtra == null || byteArrayExtra.length == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayCheckPwdUI", "toke mess is null when unbind !!!");
                    finish();
                }
                an6Var.parseFrom(byteArrayExtra);
                this.f142314r = an6Var;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HoneyPayCheckPwdUI", e17, "", new java.lang.Object[0]);
                finish();
            }
        }
        setMMTitle("");
        addSceneEndListener(2662);
        addSceneEndListener(2685);
        addSceneEndListener(2630);
        addSceneEndListener(2815);
        addSceneEndListener(2659);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2662);
        removeSceneEndListener(2685);
        removeSceneEndListener(2630);
        removeSceneEndListener(2815);
        removeSceneEndListener(2659);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.c0) {
            ss4.c0 c0Var = (ss4.c0) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView = this.f142305f;
                if (editHintPasswdView != null) {
                    editHintPasswdView.a();
                }
                hideProgress();
                if (!c0Var.hasProcessWalletError() && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "show normal error msg");
                    db5.e1.G(getContext(), str, null, false, new v73.x(this));
                }
                return true;
            }
            int i19 = this.f142313q;
            if (i19 == 1) {
                java.lang.String str2 = c0Var.f412027d;
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do give card");
                showSafeProgress();
                r73.c cVar = new r73.c(str2, this.f142312p, this.f142308i, this.f142309m, this.f142315s, this.f142311o);
                cVar.K(this);
                doSceneProgress(cVar, false);
            } else if (i19 == 2) {
                java.lang.String str3 = c0Var.f412027d;
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do modify quota");
                showSafeProgress();
                r73.h hVar = new r73.h(this.f142312p, str3, this.f142310n);
                hVar.K(this);
                doSceneProgress(hVar, false);
            } else if (i19 == 3) {
                java.lang.String str4 = c0Var.f412027d;
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do unbind: %s", this.f142310n);
                showSafeProgress();
                r73.n nVar = new r73.n(this.f142310n, str4);
                nVar.K(this);
                doSceneProgress(nVar, false);
            }
        } else if (m1Var instanceof r73.c) {
            r73.c cVar2 = (r73.c) m1Var;
            hideProgress();
            cVar2.O(new v73.y(this, cVar2));
            if (cVar2.f214032m) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView2 = this.f142305f;
                if (editHintPasswdView2 != null) {
                    editHintPasswdView2.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 3L, 1L);
            }
            if (cVar2.f214031i) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView3 = this.f142305f;
                if (editHintPasswdView3 != null) {
                    editHintPasswdView3.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 3L, 1L);
            }
        } else if (m1Var instanceof r73.h) {
            hideProgress();
            r73.h hVar2 = (r73.h) m1Var;
            if (!hVar2.f214031i && !hVar2.f214032m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCheckPwdUI", "modify success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_modify_create_line_succ", true);
                intent.putExtra("key_credit_line", hVar2.f393172s);
                setResult(-1, intent);
                finish();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 8L, 1L);
            }
            if (hVar2.f214032m) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView4 = this.f142305f;
                if (editHintPasswdView4 != null) {
                    editHintPasswdView4.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 9L, 1L);
            }
            if (hVar2.f214031i) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView5 = this.f142305f;
                if (editHintPasswdView5 != null) {
                    editHintPasswdView5.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 9L, 1L);
            }
        } else if (m1Var instanceof r73.d) {
            r73.d dVar = (r73.d) m1Var;
            dVar.O(new v73.v(this, dVar));
            dVar.J(new v73.t(this, dVar));
            if (dVar.f214031i) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView6 = this.f142305f;
                if (editHintPasswdView6 != null) {
                    editHintPasswdView6.a();
                }
                hideProgress();
            }
        } else if (m1Var instanceof r73.g) {
            r73.g gVar = (r73.g) m1Var;
            this.f142314r = gVar.f393170r.f374378d;
            if (!gVar.f214031i && !gVar.f214032m) {
                V6(this);
            }
            if (gVar.f214032m) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView7 = this.f142305f;
                if (editHintPasswdView7 != null) {
                    editHintPasswdView7.a();
                }
                hideProgress();
            }
            if (gVar.f214031i) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView8 = this.f142305f;
                if (editHintPasswdView8 != null) {
                    editHintPasswdView8.a();
                }
                hideProgress();
            }
        } else if (m1Var instanceof r73.n) {
            hideProgress();
            r73.n nVar2 = (r73.n) m1Var;
            if (!nVar2.f214031i && !nVar2.f214032m) {
                setResult(-1);
                finish();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 6L, 1L);
            }
            if (nVar2.f214032m) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView9 = this.f142305f;
                if (editHintPasswdView9 != null) {
                    editHintPasswdView9.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 7L, 1L);
            }
            if (nVar2.f214031i) {
                com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView10 = this.f142305f;
                if (editHintPasswdView10 != null) {
                    editHintPasswdView10.a();
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 7L, 1L);
            }
        }
        return true;
    }
}
