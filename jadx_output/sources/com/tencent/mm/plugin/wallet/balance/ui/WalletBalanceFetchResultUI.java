package com.tencent.mm.plugin.wallet.balance.ui;

@db5.a(19)
/* loaded from: classes8.dex */
public class WalletBalanceFetchResultUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f177770d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f177771e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f177772f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177773g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177774h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177775i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f177776m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177777n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f177778o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f177779p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f177780q;

    public static void U6(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI walletBalanceFetchResultUI) {
        if (!walletBalanceFetchResultUI.getInput().containsKey("key_realname_guide_helper")) {
            walletBalanceFetchResultUI.getProcess().o(walletBalanceFetchResultUI, 0, walletBalanceFetchResultUI.getInput());
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) walletBalanceFetchResultUI.getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet");
            realnameGuideHelper.a(walletBalanceFetchResultUI, bundle, new com.tencent.mm.plugin.wallet.balance.ui.e(walletBalanceFetchResultUI), null);
            walletBalanceFetchResultUI.getInput().remove("key_realname_guide_helper");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488182js;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f177770d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.axk);
        this.f177771e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.axl);
        this.f177772f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.axm);
        this.f177770d.setImageResource(com.tencent.mm.R.drawable.f480888er);
        this.f177771e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f177771e.setImageResource(com.tencent.mm.R.raw.remittance_wait);
        this.f177772f.setImageResource(com.tencent.mm.R.drawable.f480889es);
        this.f177773g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axv);
        this.f177774h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axw);
        this.f177775i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axx);
        this.f177773g.setText(com.tencent.mm.R.string.kex);
        this.f177774h.setText(com.tencent.mm.R.string.kev);
        this.f177774h.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f177775i.setText(com.tencent.mm.R.string.kes);
        this.f177776m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axh);
        this.f177777n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axi);
        this.f177778o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axj);
        this.f177776m.setVisibility(8);
        this.f177777n.setText(getString(com.tencent.mm.R.string.kem, new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").format(new java.util.Date(this.f177780q.E))));
        this.f177777n.setVisibility(0);
        this.f177778o.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.axb);
        this.f177779p = linearLayout;
        linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f480887eq);
        java.lang.String string = getInput().getString("key_fetch_result_show_info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    com.tencent.mm.plugin.wallet_core.model.a a17 = com.tencent.mm.plugin.wallet_core.model.a.a(jSONArray.optJSONObject(i17));
                    if (a17 != null) {
                        arrayList.add(a17);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBalanceFetchResultUI", e17, "", new java.lang.Object[0]);
            }
        }
        arrayList.size();
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView((android.content.Context) this, true);
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f177780q;
            walletBalanceFetchResultItemView.b(com.tencent.mm.R.string.kfg, com.tencent.mm.wallet_core.ui.r1.n(orders.f179678h, orders.f179681m));
            this.f177779p.addView(walletBalanceFetchResultItemView);
            if (this.f177780q.f179682n > 0.0d) {
                com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView2 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView((android.content.Context) this, true);
                com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f177780q;
                walletBalanceFetchResultItemView2.b(com.tencent.mm.R.string.kfa, com.tencent.mm.wallet_core.ui.r1.n(orders2.f179682n, orders2.f179681m));
                this.f177779p.addView(walletBalanceFetchResultItemView2);
            }
            java.util.List list = this.f177780q.M;
            if (list != null && ((java.util.ArrayList) list).size() > 0) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f177780q.M).get(0);
                java.lang.String str = commodity.f179715s;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(commodity.f179720x)) {
                    str = str + " " + getString(com.tencent.mm.R.string.kvh) + commodity.f179720x;
                }
                com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView3 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView((android.content.Context) this, false);
                walletBalanceFetchResultItemView3.b(com.tencent.mm.R.string.kek, str);
                this.f177779p.addView(walletBalanceFetchResultItemView3);
            }
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.a aVar = (com.tencent.mm.plugin.wallet_core.model.a) it.next();
                if (aVar.f179818b != null) {
                    com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView walletBalanceFetchResultItemView4 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView(this, aVar.f179817a != 3);
                    com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo showInfo = aVar.f179818b;
                    walletBalanceFetchResultItemView4.c(showInfo.f179805d, showInfo.f179806e, showInfo.f179807f, showInfo.f179808g, aVar.f179817a == 3);
                    this.f177779p.addView(walletBalanceFetchResultItemView4);
                }
            }
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.axe)).setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.d(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.axz);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.axc);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.aaw)));
        android.view.View j17 = getSupportActionBar().j();
        if (j17 != null) {
            android.view.View findViewById = j17.findViewById(com.tencent.mm.R.id.d0v);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479222ta));
            }
            android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
            }
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        getContentView().setFitsSystemWindows(true);
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        this.f177780q = orders;
        if (orders == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBalanceFetchResultUI", "order is null!");
            finish();
        } else {
            initView();
            setMMTitle((java.lang.String) getNetController().a(0));
            setBackBtn(new com.tencent.mm.plugin.wallet.balance.ui.c(this));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
