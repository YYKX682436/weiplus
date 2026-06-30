package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class WalletECardBindCardListUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f181009o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f181010d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f181011e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_ecard.ui.e f181013g;

    /* renamed from: h, reason: collision with root package name */
    public int f181014h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f181012f = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f181015i = true;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.g f181016m = new com.tencent.mm.plugin.wallet_ecard.ui.b(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f181017n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.KindaBindCardEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.3
        {
            this.__eventId = 572563856;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent) {
            com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = kindaBindCardEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent2 == null) {
                return false;
            }
            com.tencent.mm.wallet_core.model.i1.a();
            com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI = com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.this;
            am.di diVar = kindaBindCardEvent2.f54454g;
            if (diVar != null) {
                if (diVar.f6453a) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Succ");
                    r45.od odVar = new r45.od();
                    odVar.f382155e = diVar.f6457e;
                    java.lang.String str = diVar.f6455c;
                    odVar.f382159i = str;
                    odVar.f382157g = diVar.f6458f;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382155e) && !com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382157g)) {
                        walletECardBindCardListUI.getNetController().d(odVar);
                    }
                    int i17 = com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.f181009o;
                    walletECardBindCardListUI.V6();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "KindaBindCardEvent bindCard Cancel");
                }
                walletECardBindCardListUI.f181015i = false;
            }
            walletECardBindCardListUI.f181017n.dead();
            return true;
        }
    };

    public void U6() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f181014h == 3) {
            bundle.putInt("key_bind_scene", 18);
        } else {
            bundle.putInt("key_bind_scene", 19);
        }
        boolean z17 = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putBoolean("key_is_bind_bankcard", true);
        bundle.putString("key_pwd1", getInput().getString("key_pwd1"));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "start bind card, scene: %s", java.lang.Integer.valueOf(this.f181014h));
        if (com.tencent.mm.wallet_core.b.a().b()) {
            this.f181017n.alive();
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
            ((h45.q) i95.n0.c(h45.q.class)).startBindCardUseCase(this, bundle);
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.wallet_core.a.j(this, kt4.a.class, bundle, this.f181016m);
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "load Data");
        doSceneForceProgress(new jt4.j("WEB_DEBIT", this.f181014h));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a4t;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f181010d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.afl);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.a4u, (android.view.ViewGroup) this.f181010d, false);
        this.f181011e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.d5r);
        this.f181010d.addHeaderView(inflate, null, false);
        com.tencent.mm.plugin.wallet_ecard.ui.e eVar = new com.tencent.mm.plugin.wallet_ecard.ui.e(this, null);
        this.f181013g = eVar;
        this.f181010d.setAdapter((android.widget.ListAdapter) eVar);
        this.f181010d.setOnItemClickListener(new com.tencent.mm.plugin.wallet_ecard.ui.a(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        this.mNetSceneMgr.c(1988);
        int i17 = getInput().getInt("key_open_scene", 2);
        this.f181014h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "openScene: %d", java.lang.Integer.valueOf(i17));
        setMMTitle("");
        initView();
        this.f181015i = true;
        V6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.i(1988);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof jt4.j)) {
            return false;
        }
        jt4.j jVar = (jt4.j) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletECardBindCardListUI", "net error: %s", jVar);
            db5.e1.F(getContext(), jt4.f.a(getContext(), str), "", false);
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.f301664f.f379459f)) {
            this.f181011e.setText(jVar.f301664f.f379459f);
        }
        r45.lg5 lg5Var = jVar.f301664f;
        if (lg5Var.f379457d != 0) {
            if (jt4.f.c(this, lg5Var.f379461h)) {
                return true;
            }
            db5.e1.F(getContext(), jt4.f.a(getContext(), jVar.f301664f.f379458e, str), "", false);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "banklist: %s", java.lang.Integer.valueOf(lg5Var.f379460g.size()));
        java.lang.String str2 = jVar.f301664f.f379462i;
        getInput().putString("key_true_name", jVar.f301664f.f379462i);
        if (jVar.f301664f.f379460g.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "no bind card, isGotoBindCardAfterNoBindCard: %s", java.lang.Boolean.valueOf(this.f181015i));
            if (!this.f181015i) {
                return true;
            }
            U6();
            return true;
        }
        java.util.List list = this.f181012f;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(jVar.f301664f.f379460g);
        this.f181013g.notifyDataSetChanged();
        return true;
    }
}
