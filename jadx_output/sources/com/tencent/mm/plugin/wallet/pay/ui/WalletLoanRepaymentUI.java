package com.tencent.mm.plugin.wallet.pay.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletLoanRepaymentUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f178672w = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f178674e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f178675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f178676g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178677h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f178678i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178679m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.n8 f178680n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f178681o;

    /* renamed from: p, reason: collision with root package name */
    public double f178682p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f178684r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f178685s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f178686t;

    /* renamed from: u, reason: collision with root package name */
    public int f178687u;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f178683q = "CNY";

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f178688v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.8
        {
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI walletLoanRepaymentUI = com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Succ");
                    walletLoanRepaymentUI.doSceneProgress(new zr4.c(walletLoanRepaymentUI.f178684r), true);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "KindaBindCardEvent bindCard Cancel");
                    at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
                    if (bj6.c()) {
                        com.tencent.mm.plugin.wallet_core.model.Bankcard b17 = bj6.b();
                        if (b17 == null || !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_forbidWord)) {
                            int i17 = com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.f178672w;
                            walletLoanRepaymentUI.V6();
                        } else {
                            walletLoanRepaymentUI.W6(b17, walletLoanRepaymentUI.f178682p, walletLoanRepaymentUI.f178683q);
                        }
                    } else {
                        walletLoanRepaymentUI.setResult(0, null);
                    }
                }
            }
            walletLoanRepaymentUI.f178688v.dead();
            return true;
        }
    };

    public void U6() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_bind_scene", 8);
        boolean z17 = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putString("kreq_token", this.f178684r);
        if (com.tencent.mm.wallet_core.b.a().b()) {
            this.f178688v.alive();
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(this, bundle);
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.wallet_core.a.j(this, ur4.a.class, bundle, new com.tencent.mm.plugin.wallet.pay.ui.t(this));
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "to change a bankcard");
        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI.class), 1);
    }

    public final void W6(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, double d17, java.lang.String str) {
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var;
        com.tencent.mm.plugin.wallet.pay.ui.o oVar = new com.tencent.mm.plugin.wallet.pay.ui.o(this);
        com.tencent.mm.plugin.wallet.pay.ui.p pVar = new com.tencent.mm.plugin.wallet.pay.ui.p(this, bankcard);
        com.tencent.mm.plugin.wallet.pay.ui.q qVar = new com.tencent.mm.plugin.wallet.pay.ui.q(this);
        this.f178686t = bankcard.field_bindSerial;
        java.lang.String str2 = this.f178681o;
        java.util.HashMap hashMap = com.tencent.mm.plugin.wallet_core.ui.n8.f180519l1;
        if (isFinishing()) {
            n8Var = null;
        } else {
            com.tencent.mm.plugin.wallet_core.ui.n8 n8Var2 = new com.tencent.mm.plugin.wallet_core.ui.n8(this, com.tencent.mm.R.style.f494795wh);
            n8Var2.w(qVar);
            n8Var2.setOnCancelListener(qVar);
            n8Var2.setCancelable(true);
            n8Var2.f180525h.setText(str2);
            n8Var2.t(com.tencent.mm.wallet_core.ui.r1.n(d17, str), d17);
            n8Var2.f180520J = true;
            java.lang.String str3 = bankcard.field_desc;
            n8Var2.o(bankcard);
            n8Var2.A(!android.text.TextUtils.isEmpty(str3));
            n8Var2.p(str3, pVar, false);
            n8Var2.f180536u = oVar;
            n8Var2.show();
            db5.e1.a(this, n8Var2);
            n8Var = n8Var2;
        }
        this.f178680n = n8Var;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            if (!bj6.c()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLoanRepaymentUI", "onActivityResult hasRepaymentBankcard is false");
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard b17 = bj6.b();
            if (b17 == null || !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_forbidWord)) {
                finish();
                return;
            } else {
                W6(b17, this.f178682p, this.f178683q);
                return;
            }
        }
        int intExtra = intent.getIntExtra("ret", -1000);
        if (intExtra == -1003) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "to bind a new card");
            U6();
        } else {
            if (intExtra != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLoanRepaymentUI", "activity return unknow error");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "change card ok");
            com.tencent.mm.plugin.wallet_core.model.Bankcard a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj().a(intent.getStringExtra("bindSerial"));
            if (a17 != null) {
                W6(a17, this.f178682p, this.f178683q);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletLoanRepaymentUI", "bankcard is null by getBankcardBySerialNo");
                finish();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f178678i = intent.getStringExtra("appId");
        this.f178673d = intent.getStringExtra("timeStamp");
        this.f178674e = intent.getStringExtra("nonceStr");
        this.f178675f = intent.getStringExtra("packageExt");
        this.f178676g = intent.getStringExtra("signtype");
        this.f178677h = intent.getStringExtra("paySignature");
        this.f178679m = intent.getStringExtra("url");
        this.f178687u = intent.getIntExtra("pay_channel", 0);
        addSceneEndListener(580);
        doSceneForceProgress(new ss4.d(this.f178678i, this.f178673d, this.f178674e, this.f178675f, this.f178676g, this.f178677h, this.f178679m, 7, "getWebPayCheckoutCounterRequst", this.f178687u));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "onNewIntent");
        if (extras.containsKey("intent_bind_end")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "back from bind card");
            doSceneProgress(new zr4.c(this.f178684r), true);
        } else {
            if (!extras.containsKey("jsapi_verifycode_process_end")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "need to deal with,finish");
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "back from verify code");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("token", intent.getStringExtra("token"));
            intent2.putExtra("bind_serial", this.f178686t);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.d) {
                ss4.d dVar = (ss4.d) m1Var;
                h45.y.f278968a = dVar.H();
                this.f178684r = ((r45.y10) dVar.f412029e.f70711b.f70700a).f390702f;
                com.tencent.mm.wallet_core.b.a().getClass();
                ((h45.q) i95.n0.c(h45.q.class)).startWeBankLoanPay(this, this.f178684r, dVar.H(), new com.tencent.mm.plugin.wallet.pay.ui.n(this));
                return true;
            }
            if (m1Var instanceof zr4.c) {
                zr4.c cVar = (zr4.c) m1Var;
                this.f178683q = cVar.f475201e;
                this.f178682p = cVar.f475200d;
                this.f178681o = cVar.f475202f;
                at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
                if (bj6.c()) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard b17 = bj6.b();
                    if (b17 == null || !com.tencent.mm.sdk.platformtools.t8.K0(b17.field_forbidWord)) {
                        V6();
                    } else {
                        W6(b17, this.f178682p, this.f178683q);
                    }
                } else {
                    db5.e1.A(this, getResources().getString(com.tencent.mm.R.string.kni), "", getString(com.tencent.mm.R.string.f493589kv1), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.pay.ui.r(this), new com.tencent.mm.plugin.wallet.pay.ui.s(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.y) {
                ss4.y yVar = (ss4.y) m1Var;
                if (yVar.f412144e == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLoanRepaymentUI", "need free sms");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("key_pwd1", this.f178685s);
                    bundle.putString("key_jsapi_token", this.f178684r);
                    bundle.putString("key_relation_key", yVar.f412146g);
                    bundle.putInt("key_verify_scene", 8);
                    bundle.putString("key_mobile", yVar.f412145f);
                    com.tencent.mm.wallet_core.a.j(this, com.tencent.mm.plugin.wallet_core.ui.z4.class, bundle, null);
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("token", yVar.f412143d);
                    intent.putExtra("bind_serial", this.f178686t);
                    setResult(-1, intent);
                    finish();
                }
                return true;
            }
        }
        return false;
    }
}
