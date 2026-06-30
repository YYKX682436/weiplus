package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class WalletECardLogoutUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f181027o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f181028d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f181029e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f181030f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f181031g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f181032h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f181033i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181034m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181035n;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488718a51;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f181028d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d_g);
        this.f181029e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d_f);
        this.f181031g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.d_e);
        this.f181030f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d__);
        this.f181033i = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.d_b);
        this.f181032h = findViewById(com.tencent.mm.R.id.d_d);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.d_c)).setOnClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.l(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2931);
        initView();
        setMMTitle(com.tencent.mm.R.string.bte);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardLogoutUI", "do qry logout desc");
        jt4.k kVar = new jt4.k(1L);
        kVar.K(this);
        doSceneProgress(kVar, true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2931);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof jt4.k)) {
            return false;
        }
        jt4.k kVar = (jt4.k) m1Var;
        kVar.O(new com.tencent.mm.plugin.wallet_ecard.ui.m(this, kVar));
        return true;
    }
}
