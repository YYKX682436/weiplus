package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes5.dex */
public class WalletSelectBankcardModeUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f177853d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.i2 f177854e;

    /* renamed from: f, reason: collision with root package name */
    public int f177855f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f177856g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f177857h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f177858i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f177859m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f177860n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f177861o;

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d88;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        setMMTitle(com.tencent.mm.R.string.kfr);
        setBackBtn(new com.tencent.mm.plugin.wallet.balance.ui.f2(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487677pf0);
        int i17 = this.f177855f;
        if (i17 == 0) {
            textView.setText(com.tencent.mm.R.string.kzj);
        } else if (i17 == 1) {
            textView.setText(com.tencent.mm.R.string.kzk);
        }
        this.f177853d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.pao);
        com.tencent.mm.plugin.wallet.balance.ui.i2 i2Var = new com.tencent.mm.plugin.wallet.balance.ui.i2(this);
        this.f177854e = i2Var;
        this.f177853d.setAdapter((android.widget.ListAdapter) i2Var);
        this.f177853d.setOnItemClickListener(new com.tencent.mm.plugin.wallet.balance.ui.g2(this));
        java.util.ArrayList arrayList = this.f177857h;
        arrayList.clear();
        this.f177861o = getString(com.tencent.mm.R.string.kfj);
        if (this.f177855f == 0) {
            at4.x1 Ai = vr4.f1.wi().Ai();
            java.util.ArrayList j17 = Ai.j();
            this.f177859m = j17;
            int i18 = 0;
            this.f177860n = Ai.k(j17, null, false, true);
            at4.f fVar = Ai.f14002k;
            if (fVar != null) {
                this.f177856g = fVar.f13835c;
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSelectBankcardModeUI", "is_show_charge is " + this.f177856g);
            } else {
                this.f177856g = 0;
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSelectBankcardModeUI", "userInfo.getBalanceFetchInfo() is null");
            }
            java.util.ArrayList arrayList2 = this.f177859m;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardModeUI", "hy: no bankcard show new only");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardModeUI", "mBankcardList size is " + this.f177859m.size());
                java.util.Iterator it = this.f177859m.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
                    com.tencent.mm.plugin.wallet.balance.ui.h2 h2Var = new com.tencent.mm.plugin.wallet.balance.ui.h2(null);
                    h2Var.f177899a = bankcard2.field_desc;
                    if (bankcard2.field_fetch_charge_rate <= 0.0d || this.f177856g != 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardModeUI", "the bank " + bankcard2.field_desc + " field_fetch_charge_rate is " + bankcard2.field_fetch_charge_rate + " is_show_charge is " + this.f177856g);
                    } else if (android.text.TextUtils.isEmpty(bankcard2.field_fetch_charge_info)) {
                        h2Var.f177900b = getString(com.tencent.mm.R.string.kel) + "" + (bankcard2.field_fetch_charge_rate * 100.0d) + "%";
                    } else {
                        h2Var.f177900b = bankcard2.field_fetch_charge_info;
                    }
                    arrayList.add(h2Var);
                    if (this.f177858i == -1 && (bankcard = this.f177860n) != null && bankcard.equals(bankcard2)) {
                        this.f177858i = i18;
                    }
                    i18++;
                }
                if (this.f177858i == -1 && this.f177860n == null) {
                    this.f177858i = i18;
                }
            }
            com.tencent.mm.plugin.wallet.balance.ui.h2 h2Var2 = new com.tencent.mm.plugin.wallet.balance.ui.h2(null);
            h2Var2.f177899a = this.f177861o;
            h2Var2.f177900b = "";
            arrayList.add(h2Var2);
        }
        this.f177854e.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        this.f177855f = getIntent().getIntExtra("key_scene_select_bankcard_mode_ui", 0);
        this.f177858i = getIntent().getIntExtra("key_select_index", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSelectBankcardModeUI", "onCreate() mFromScene is " + this.f177855f);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            setResult(0);
            finish();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
