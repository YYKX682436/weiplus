package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class WalletSwitchWalletCurrencyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180106d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f180107e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.f9 f180108f = null;

    /* renamed from: g, reason: collision with root package name */
    public at4.j1 f180109g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8j;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f180106d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mq_);
        com.tencent.mm.plugin.wallet_core.ui.f9 f9Var = new com.tencent.mm.plugin.wallet_core.ui.f9(this, this.f180107e);
        this.f180108f = f9Var;
        this.f180106d.setAdapter((android.widget.ListAdapter) f9Var);
        java.util.ArrayList arrayList = this.f180107e;
        if (arrayList != null && arrayList.size() > 0) {
            com.tencent.mm.plugin.wallet_core.ui.f9 f9Var2 = this.f180108f;
            f9Var2.f180275d = this.f180107e;
            f9Var2.notifyDataSetChanged();
        }
        this.f180106d.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.c9(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.l09);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.TRUE);
        getIntent().getIntExtra("switch_wallet_scene", 0);
        java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().y0();
        this.f180107e = y07;
        if (y07 == null || y07.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = true");
            doSceneProgress(new ss4.r(), true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = false");
            doSceneProgress(new ss4.r(), false);
        }
        initView();
        setResult(0);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.r) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
                if (this.f180107e == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
                    return false;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
            java.util.ArrayList y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().y0();
            this.f180107e = y07;
            com.tencent.mm.plugin.wallet_core.ui.f9 f9Var = this.f180108f;
            f9Var.f180275d = y07;
            f9Var.notifyDataSetChanged();
            return true;
        }
        if (!(m1Var instanceof ss4.v) || i17 != 0 || i18 != 0) {
            return false;
        }
        this.f180109g.field_wallet_selected = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.f180109g.field_wallet_type + " " + this.f180109g.field_wallet_tpa_country_mask);
        ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).wi();
        ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().update(this.f180109g, new java.lang.String[0]);
        at4.j1 j1Var = this.f180108f.f180277f;
        if (j1Var != null) {
            j1Var.field_wallet_selected = 0;
            ((pg0.a3) i95.n0.c(pg0.a3.class)).ij().update(j1Var, new java.lang.String[0]);
        }
        gm0.j1.i();
        gm0.j1.u().c().w(339975, java.lang.Integer.valueOf(this.f180109g.field_wallet_type));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.f180109g.field_wallet_tpa_country_mask));
        c01.je.m(this.f180109g.field_wallet_tpa_country_mask);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.d.f();
        if (c01.z1.z()) {
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Di(this, null);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_switch_wallet", 1);
        setResult(-1, intent);
        finish();
        return true;
    }
}
