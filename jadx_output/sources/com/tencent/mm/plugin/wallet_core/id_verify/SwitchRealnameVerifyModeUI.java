package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class SwitchRealnameVerifyModeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f179206f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f179207g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f179208h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f179209i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179210m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f179211n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f179212o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f179213p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f179214q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f179215r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f179216s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f179217t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179218u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179219v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f179220w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f179221x;

    /* renamed from: d, reason: collision with root package name */
    public final int f179204d = 500;

    /* renamed from: e, reason: collision with root package name */
    public long f179205e = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f179222y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f179223z = false;
    public final com.tencent.mm.plugin.wallet_core.ui.ca A = new com.tencent.mm.plugin.wallet_core.ui.ca();
    public boolean B = false;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0399 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U6(boolean r23) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.U6(boolean):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489633d82;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        this.f179206f = findViewById(com.tencent.mm.R.id.nu7);
        this.f179207g = findViewById(com.tencent.mm.R.id.nu8);
        this.f179208h = findViewById(com.tencent.mm.R.id.nu9);
        this.f179207g.setOnClickListener(this);
        this.f179206f.setOnClickListener(this);
        this.f179208h.setOnClickListener(this);
        this.f179209i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aho);
        this.f179210m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahn);
        this.f179211n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahs);
        this.f179212o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahr);
        this.f179213p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dlr);
        this.f179214q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m9d);
        this.f179216s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ox7);
        this.f179217t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ox6);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487194nu3);
        this.f179215r = textView;
        if (this.f179223z) {
            textView.setText(com.tencent.mm.R.string.kxa);
        }
        U6(false);
        ys4.e eVar = new ys4.e("");
        addSceneEndListener(1666);
        doSceneProgress(eVar);
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.p0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.ca caVar = this.A;
            if (i18 == -1) {
                caVar.a(intent);
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.aa aaVar = caVar.f180182g;
            if (aaVar != null) {
                aaVar.cancel();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f179205e <= this.f179204d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SwitchRealnameVerifyModeUI", "process pass");
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f179205e = java.lang.System.currentTimeMillis();
        this.A.d(new com.tencent.mm.plugin.wallet_core.id_verify.r0(this, view), this.B);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onClickImp(android.view.View view) {
        int id6 = view.getId();
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process != null) {
            android.os.Bundle bundle = process.f213801c;
            if (id6 == com.tencent.mm.R.id.nu7) {
                com.tencent.mm.wallet_core.ui.r1.r0(15, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179222y);
                if (bundle.getInt("realname_scene") == 1) {
                    if (getIntent() == null) {
                        db5.e1.G(this, com.tencent.mm.sdk.platformtools.t8.K0("") ? getString(com.tencent.mm.R.string.l0g) : "", null, false, new com.tencent.mm.plugin.wallet_core.id_verify.t0(this));
                        return;
                    } else {
                        addSceneEndListener(580);
                        doSceneForceProgress(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)));
                        return;
                    }
                }
                bundle.putInt("real_name_verify_mode", 1);
            } else if (id6 == com.tencent.mm.R.id.nu8) {
                com.tencent.mm.wallet_core.ui.r1.r0(17, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179222y);
                bundle.putInt("real_name_verify_mode", 2);
            } else if (id6 == com.tencent.mm.R.id.nu9) {
                com.tencent.mm.wallet_core.ui.r1.r0(16, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179222y);
                if (this.f179221x && !com.tencent.mm.sdk.platformtools.t8.K0(this.f179220w)) {
                    db5.e1.E(this, this.f179220w, "", this.f179219v, false, new com.tencent.mm.plugin.wallet_core.id_verify.s0(this, process));
                    return;
                } else {
                    bundle.putInt("real_name_verify_mode", 3);
                    bundle.putString("verify_card_flag", "1");
                }
            }
            com.tencent.mm.wallet_core.a.d(this, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras().getBoolean("is_from_new_cashier") && getProcess() == null) {
            boolean z17 = getIntent().getExtras().getBoolean("key_process_is_end");
            boolean z18 = getIntent().getExtras().getBoolean("key_process_is_stay");
            if (z17 && !z18) {
                finish();
            }
        }
        this.f179223z = getInput().getBoolean("key_from_set_pwd", false);
        initView();
        getProcess();
        this.f179222y = getInput().getInt("entry_scene", this.f179222y);
        com.tencent.mm.wallet_core.ui.r1.r0(13, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179222y);
        if (this.f179223z) {
            setMMTitle(com.tencent.mm.R.string.kx_);
        }
        this.A.f180181f = new com.tencent.mm.plugin.wallet_core.id_verify.o0(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A.getClass();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mm.wallet_core.h process = getProcess();
            if (process != null) {
                com.tencent.mm.wallet_core.ui.r1.r0(14, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179222y);
                process.c(this, 0);
                return true;
            }
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A.b();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A.c();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.d) {
            if (i17 == 0 && i18 == 0) {
                ss4.d dVar = (ss4.d) m1Var;
                h45.y.f278968a = dVar.H();
                removeSceneEndListener(580);
                java.lang.String str2 = ((r45.y10) dVar.f412029e.f70711b.f70700a).f390702f;
                com.tencent.mm.wallet_core.h process = getProcess();
                if (process != null) {
                    android.os.Bundle bundle = process.f213801c;
                    bundle.putInt("real_name_verify_mode", 1);
                    com.tencent.mm.wallet_core.a.d(this, bundle);
                }
                return true;
            }
        } else if (m1Var instanceof ys4.e) {
            removeSceneEndListener(1666);
            U6(true);
            ys4.e eVar = (ys4.e) m1Var;
            this.B = eVar.f465225g;
            com.tencent.mm.wallet_core.model.p0 p0Var = eVar.f465226h;
            if (p0Var != null) {
                p0Var.g(this, new com.tencent.mm.plugin.wallet_core.id_verify.q0(this));
                return true;
            }
        }
        return false;
    }
}
