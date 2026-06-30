package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletLqtSaveFetchFinishUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178039d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f178040e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f178041f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f178042g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du4 f178043h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f178044i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178045m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f178046n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f178047o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f178048p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f178049q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f178050r;

    /* renamed from: s, reason: collision with root package name */
    public int f178051s;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489629d74;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, 0);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideTitleView();
        enableBackMenu(false);
        this.f178039d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nrn);
        this.f178040e = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f482962t0);
        this.f178041f = (android.widget.Button) findViewById(com.tencent.mm.R.id.g6_);
        this.f178042g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lba);
        this.f178044i = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.f483434au2);
        this.f178045m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483435au3);
        this.f178046n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483433au1);
        this.f178047o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.auj);
        this.f178048p = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.g69);
        this.f178049q = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.d2a);
        this.f178050r = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.d2c);
        this.f178051s = getIntent().getIntExtra("entrance_type", 0);
        int intExtra = getIntent().getIntExtra("key_mode", 1);
        double doubleExtra = getIntent().getDoubleExtra("key_amount", 0.0d);
        java.lang.String stringExtra = getIntent().getStringExtra("profile_date_wording");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_guide_cell");
        if (byteArrayExtra != null) {
            try {
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishUI", e17, "", new java.lang.Object[0]);
            }
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_operation_view");
        if (byteArrayExtra2 != null) {
            try {
                this.f178043h = (r45.du4) new r45.du4().parseFrom(byteArrayExtra2);
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishUI", e18, "", new java.lang.Object[0]);
            }
        }
        if (intExtra == 1) {
            if (this.f178051s == 14) {
                java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_Purchase_Result_Wording");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f178039d.setText(getString(com.tencent.mm.R.string.kqz));
                    setMMTitle(getString(com.tencent.mm.R.string.kqz));
                } else {
                    this.f178039d.setText(stringExtra2);
                    setMMTitle(stringExtra2);
                }
                java.lang.String stringExtra3 = getIntent().getStringExtra("KEY_Confirm_Result_Wording");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    this.f178041f.setText(getResources().getString(com.tencent.mm.R.string.hyg));
                } else {
                    this.f178041f.setText(stringExtra3);
                }
                this.f178049q.setVisibility(8);
                this.f178050r.setVisibility(0);
                this.f178041f.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478838io));
                if (j65.e.b()) {
                    this.f178041f.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.f481058jl));
                } else {
                    this.f178041f.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk));
                }
            } else {
                this.f178039d.setText(getString(com.tencent.mm.R.string.f493564kr0));
                setMMTitle(getString(com.tencent.mm.R.string.f493564kr0));
                this.f178049q.setVisibility(0);
                this.f178050r.setVisibility(8);
            }
        } else if (intExtra == 2) {
            this.f178039d.setText(getString(com.tencent.mm.R.string.kpm));
            setMMTitle(getString(com.tencent.mm.R.string.kpm));
        }
        this.f178040e.setText(com.tencent.mm.wallet_core.ui.r1.o(doubleExtra));
        this.f178041f.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.f5(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f178042g.setText(stringExtra);
            this.f178042g.setVisibility(0);
        }
        r45.du4 du4Var = this.f178043h;
        if (du4Var == null) {
            this.f178047o.setVisibility(8);
            getWindow().getDecorView().post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.i5(this));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372754m)) {
            this.f178044i.setUrl(this.f178043h.f372754m);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29559, "7", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.f178045m.setText(this.f178043h.f372748d);
        this.f178046n.setText(this.f178043h.f372749e);
        this.f178047o.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g5(this));
        this.f178047o.setVisibility(0);
        getWindow().getDecorView().post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.h5(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(or4.e.class);
    }
}
