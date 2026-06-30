package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayCardBackUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142262f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f142263g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142264h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142265i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f142266m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142267n;

    /* renamed from: o, reason: collision with root package name */
    public r45.an6 f142268o;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142262f = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.h1z);
        this.f142263g = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f485257h23);
        this.f142264h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485258h24);
        this.f142265i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485254h20);
        this.f142266m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485256h22);
        this.f142263g.b();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i(this.f142260d, "unbind success");
            com.tencent.mm.autogen.events.OfflineUpdateCardListEvent offlineUpdateCardListEvent = new com.tencent.mm.autogen.events.OfflineUpdateCardListEvent();
            am.dm dmVar = offlineUpdateCardListEvent.f54558g;
            dmVar.f6477a = 2;
            dmVar.f6478b = this.f142267n;
            offlineUpdateCardListEvent.e();
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f142261e = com.tencent.mm.R.color.f479236to;
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new v73.b(this));
        addSceneEndListener(2851);
        this.f142267n = getIntent().getStringExtra("key_card_no");
        initView();
        com.tencent.mars.xlog.Log.i(this.f142260d, "do qry card detail: %s", this.f142267n);
        r73.k kVar = new r73.k(this.f142267n);
        kVar.K(this);
        doSceneProgress(kVar, true);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2851);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof r73.k)) {
            return true;
        }
        r73.k kVar = (r73.k) m1Var;
        kVar.O(new v73.c(this, kVar));
        return true;
    }
}
