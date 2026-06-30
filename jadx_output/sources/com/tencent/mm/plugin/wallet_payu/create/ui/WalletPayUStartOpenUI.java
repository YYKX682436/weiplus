package com.tencent.mm.plugin.wallet_payu.create.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletPayUStartOpenUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f181249m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormMobileInputView f181250d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f181251e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f181252f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f181253g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181254h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181255i;

    public final void U6() {
        if (this.f181250d.getVisibility() == 0) {
            if (!((com.tencent.mm.sdk.platformtools.t8.K0(V6()) || com.tencent.mm.sdk.platformtools.t8.K0(this.f181252f.getText().toString())) ? false : true)) {
                this.f181253g.setEnabled(false);
                return;
            }
            this.f181255i = V6();
            this.f181254h = this.f181250d.getMobileNumber();
            this.f181253g.setEnabled(true);
        }
    }

    public final java.lang.String V6() {
        return this.f181250d.getCountryCode().startsWith("+") ? this.f181250d.getCountryCode().substring(1) : this.f181250d.getCountryCode();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c97;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181254h = getInput().getString("key_mobile");
        java.lang.String string = getInput().getString("dial_code");
        this.f181255i = string;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f181255i = "27";
        }
        ((com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView) findViewById(com.tencent.mm.R.id.hec)).setPagerData(new tt4.a[]{new tt4.a(com.tencent.mm.R.drawable.ccr, com.tencent.mm.R.string.kwg, com.tencent.mm.R.string.kwb), new tt4.a(com.tencent.mm.R.drawable.ccs, com.tencent.mm.R.string.kwh, com.tencent.mm.R.string.kwc), new tt4.a(com.tencent.mm.R.drawable.cct, com.tencent.mm.R.string.kwi, com.tencent.mm.R.string.kwd)});
        this.f181250d = (com.tencent.mm.ui.base.MMFormMobileInputView) findViewById(com.tencent.mm.R.id.ngr);
        this.f181253g = (android.widget.Button) findViewById(com.tencent.mm.R.id.ngc);
        this.f181251e = this.f181250d.getCountryCodeEditText();
        this.f181252f = this.f181250d.getMobileNumberEditText();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f181254h)) {
            this.f181252f.setText(this.f181254h);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f181255i)) {
            this.f181251e.setText(this.f181255i);
        }
        ut4.c cVar = new ut4.c(this);
        this.f181252f.addTextChangedListener(cVar);
        this.f181251e.addTextChangedListener(cVar);
        this.f181253g.setOnClickListener(new ut4.d(this));
        vt4.c.a(this, (android.widget.TextView) findViewById(com.tencent.mm.R.id.ngo));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ngt)).setText(c01.z1.I() ? com.tencent.mm.R.string.kwm : com.tencent.mm.R.string.kwn);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
