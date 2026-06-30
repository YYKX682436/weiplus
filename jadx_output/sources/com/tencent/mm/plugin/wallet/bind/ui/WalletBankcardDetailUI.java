package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class WalletBankcardDetailUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f178540n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f178541d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178542e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f178543f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f178544g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f178545h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f178546i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f178547m;

    public final void U6(boolean z17) {
        if (c01.z1.I() || z17 || ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().f()) {
            getInput().putBoolean("offline_pay", false);
            com.tencent.mm.wallet_core.a.d(this, getInput());
        } else {
            com.tencent.mm.wallet_core.ui.r1.q0(0, 1);
            db5.e1.k(this, com.tencent.mm.R.string.kga, -1, com.tencent.mm.R.string.kg_, com.tencent.mm.R.string.kgb, true, new com.tencent.mm.plugin.wallet.bind.ui.k(this), new com.tencent.mm.plugin.wallet.bind.ui.l(this));
        }
    }

    public void V6(boolean z17) {
        if (!z17) {
            this.f178545h.setVisibility(8);
            this.f178546i.setVisibility(8);
            this.f178547m.setVisibility(0);
            return;
        }
        this.f178545h.setVisibility(8);
        this.f178546i.setVisibility(0);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pa6)).setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.f(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pah);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pai);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.paf);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pag);
        textView.setText(com.tencent.mm.wallet_core.ui.r1.n(this.f178541d.field_onceQuotaKind, null));
        textView2.setText(com.tencent.mm.wallet_core.ui.r1.n(this.f178541d.field_onceQuotaVirtual, null));
        textView3.setText(com.tencent.mm.wallet_core.ui.r1.n(this.f178541d.field_dayQuotaKind, null));
        textView4.setText(com.tencent.mm.wallet_core.ui.r1.n(this.f178541d.field_dayQuotaVirtual, null));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178541d.field_repay_url)) {
            return;
        }
        this.f178543f.setVisibility(0);
        android.view.View view = this.f178544g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void W6() {
        this.f178545h.setVisibility(0);
        this.f178546i.setVisibility(8);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pa9)).setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.g(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pal)).setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.h(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d5h;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
        this.f178541d = bankcard;
        if (bankcard == null) {
            return;
        }
        this.f178545h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pa8);
        this.f178546i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pae);
        this.f178547m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pac);
        this.f178543f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.paa);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.paj);
        this.f178544g = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.wallet.bind.ui.e(this));
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f178541d;
        if (1 == bankcard2.field_bankcardState) {
            W6();
            return;
        }
        if (bankcard2.y0()) {
            V6(true);
            this.f178542e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pa7);
            at4.x1 Ai = vr4.f1.wi().Ai();
            java.lang.String str = this.f178541d.field_bindSerial;
            Ai.getClass();
            this.f178542e.setVisibility(8);
        } else {
            V6(false);
            this.f178542e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pab);
            at4.x1 Ai2 = vr4.f1.wi().Ai();
            java.lang.String str2 = this.f178541d.field_bindSerial;
            Ai2.getClass();
            this.f178542e.setVisibility(8);
        }
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.wallet.bind.ui.j(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        setMMTitle(com.tencent.mm.R.string.kg9);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        db5.e1.e(getContext(), getString(com.tencent.mm.R.string.kfw), getResources().getStringArray(com.tencent.mm.R.array.f478038am), "", new com.tencent.mm.plugin.wallet.bind.ui.m(this));
        return null;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.weishi.i.CTRL_INDEX);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof tr4.b) {
                android.widget.TextView textView = this.f178542e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (m1Var instanceof tr4.a) {
                tr4.a aVar = (tr4.a) m1Var;
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + aVar.f421433d);
                int i19 = aVar.f421433d;
                if (i19 == 2 || i19 == 3) {
                    db5.e1.G(this, aVar.f421434e, null, false, new com.tencent.mm.plugin.wallet.bind.ui.n(this, i19));
                } else {
                    U6(false);
                }
            }
        } else if (m1Var instanceof tr4.a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
            U6(false);
            return true;
        }
        return false;
    }
}
