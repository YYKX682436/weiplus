package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class WcPayRealnameInputAddressUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f179245t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179246d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179247e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f179248f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f179249g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179250h = 1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179251i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179252m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179253n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179254o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179255p;

    /* renamed from: q, reason: collision with root package name */
    public int f179256q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f179257r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f179258s;

    public WcPayRealnameInputAddressUI() {
        new android.os.Bundle();
        this.f179258s = new java.util.ArrayList();
    }

    public final void U6() {
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(this.f179246d.getText());
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179247e.getText())) {
            z17 = false;
        }
        this.f179248f.setEnabled(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f179246d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ppr);
        this.f179247e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ppn);
        this.f179248f = (android.widget.Button) findViewById(com.tencent.mm.R.id.ppo);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.ppp);
        this.f179249g = inputPanelLinearLayout;
        inputPanelLinearLayout.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.i1(this));
        this.f179247e.getContentEt().setInputType(131073);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f179247e.getInfoIv().setLayoutParams(layoutParams);
        this.f179247e.getInfoIv().setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView infoIv = this.f179247e.getInfoIv();
        int color = getResources().getColor(com.tencent.mm.R.color.FG_2);
        infoIv.f192041u = com.tencent.mm.R.raw.icons_filled_close2;
        infoIv.f192042v = color;
        this.f179247e.setText(this.f179255p);
        this.f179247e.b(new com.tencent.mm.plugin.wallet_core.id_verify.j1(this));
        this.f179246d.setText(this.f179254o);
        this.f179246d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.k1(this));
        this.f179248f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.l1(this));
        U6();
        this.f179249g.e(new com.tencent.mm.plugin.wallet_core.id_verify.m1(this));
        int max = (int) (java.lang.Math.max(this.f179247e.getTitleMeasuredWidth(), this.f179246d.getTitleMeasuredWidth()) + 10.0f);
        this.f179247e.setTitleWidth(max);
        this.f179246d.setTitleWidth(max);
        com.tencent.mm.wallet_core.ui.r1.b(new com.tencent.mm.wallet_core.ui.formview.WalletFormView[]{this.f179247e, this.f179246d}, 10);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] requestCode：%s, resultCode：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == this.f179250h && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            this.f179251i = intent.getStringExtra("Country");
            this.f179252m = intent.getStringExtra("Contact_Province");
            this.f179253n = intent.getStringExtra("Contact_City");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
                sb6.append(" ");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                sb6.append(stringExtra2);
                sb6.append(" ");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                sb6.append(stringExtra3);
            }
            this.f179254o = sb6.toString();
            this.f179246d.setText(sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] country：%s, province: %s ，city：%s ", stringExtra, stringExtra2, stringExtra3);
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onActivityResult] countryCode：%s, provinceCode: %s， cityCode：%s , zone: %s , mZoneEt：%s", this.f179251i, this.f179252m, this.f179253n, this.f179254o, this.f179246d.getText());
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        setMMTitle("");
        this.f179251i = getIntent().getStringExtra("key_countrycode");
        this.f179252m = getIntent().getStringExtra("key_provincecode");
        this.f179253n = getIntent().getStringExtra("key_citycode");
        this.f179254o = getIntent().getStringExtra("key_zone");
        java.lang.String stringExtra = getIntent().getStringExtra("key_address");
        this.f179255p = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onCreate] countryCode：%s, provinceCode: %s ，cityCode：%s , zone: %s , address：%s", this.f179251i, this.f179252m, this.f179253n, this.f179254o, stringExtra);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("key_exclude_country");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            java.util.ArrayList arrayList = this.f179258s;
            arrayList.addAll(java.util.Arrays.asList(stringArrayExtra));
            arrayList.remove("CN");
            arrayList.remove("TW");
            arrayList.remove("HK");
            arrayList.remove("MO");
        }
        initView();
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.h1(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f179257r) {
            hideVKB();
            this.f179249g.getInputPanelHelper().f5896p = false;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet_core.utils.u.class);
    }
}
