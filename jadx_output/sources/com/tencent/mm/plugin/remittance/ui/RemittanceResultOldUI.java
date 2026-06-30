package com.tencent.mm.plugin.remittance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class RemittanceResultOldUI extends com.tencent.mm.plugin.remittance.ui.RemittanceResultUI {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f157589i = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f157590e;

    /* renamed from: f, reason: collision with root package name */
    public int f157591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157592g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157593h;

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI
    public boolean U6() {
        return false;
    }

    public final void W6() {
        if (!getInput().containsKey("key_realname_guide_helper")) {
            getProcess().f(this, getInput());
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.remittance.ui.h8(this), 100L);
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
        if (realnameGuideHelper != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
            bundle.putString("realname_verify_process_jump_plugin", "remittance");
            realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.remittance.ui.g8(this), null);
            getInput().remove("key_realname_guide_helper");
        }
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ceg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        boolean z17;
        java.util.List list;
        setMMTitle(getString(com.tencent.mm.R.string.i17));
        setBackBtn(null);
        showHomeBtn(false);
        enableBackMenu(false);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486625lx0);
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f157590e;
        if (orders != null) {
            textView.setText(com.tencent.mm.wallet_core.ui.r1.n(orders.f179678h, orders.f179681m));
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
        if (payInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
            finish();
            return;
        }
        android.os.Bundle bundle = payInfo.f192122u;
        if (bundle != null) {
            this.f157593h = bundle.getBoolean("extinfo_key_4");
            str = payInfo.f192122u.getString("extinfo_key_1");
        } else {
            str = "";
        }
        int i17 = payInfo.f192109e;
        this.f157591f = i17;
        this.f157592g = str;
        java.lang.String x17 = com.tencent.mm.wallet_core.ui.r1.x(str);
        if (i17 == 31) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486627lx2);
            java.lang.String string = getString(com.tencent.mm.R.string.f492832i16, x17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                textView2.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView2.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string, textSize));
                textView2.setVisibility(0);
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.lwt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f157590e.f179682n > 0.0d) {
                android.content.res.Resources resources = getResources();
                com.tencent.mm.plugin.wallet_core.model.Orders orders2 = this.f157590e;
                ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f483610bf1)).setText(resources.getString(com.tencent.mm.R.string.f492830i14, com.tencent.mm.wallet_core.ui.r1.n(orders2.f179682n, orders2.f179681m)));
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f483611bf2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.os.Bundle bundle2 = payInfo.f192122u;
            java.lang.String string2 = bundle2 != null ? bundle2.getString("extinfo_key_2") : "";
            if (i17 != 32 && i17 != 33) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    x17 = x17 + getString(com.tencent.mm.R.string.i1n);
                } else {
                    x17 = x17 + "（" + com.tencent.mm.wallet_core.ui.r1.y(string2) + "）";
                }
            }
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486627lx2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                textView3.setVisibility(8);
            } else {
                java.lang.String string3 = getString(com.tencent.mm.R.string.f492831i15, x17);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView3.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string3, textSize2));
                textView3.setVisibility(0);
            }
            if (i17 == 33 || i17 == 32) {
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.lwy);
                android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwz);
                android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwx);
                java.lang.String string4 = payInfo.f192122u.getString("extinfo_key_3");
                java.lang.String string5 = payInfo.f192122u.getString("extinfo_key_8");
                boolean z18 = true;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z17 = false;
                } else {
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize3 = textView5.getTextSize();
                    ((ke0.e) xVar3).getClass();
                    textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string4, textSize3));
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
                        textView4.setText(string5);
                    }
                    z17 = true;
                }
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.lwv);
                android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lww);
                android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lwu);
                java.lang.String string6 = payInfo.f192122u.getString("extinfo_key_6");
                java.lang.String string7 = payInfo.f192122u.getString("extinfo_key_7");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string7)) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z18 = false;
                } else {
                    le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize4 = textView7.getTextSize();
                    ((ke0.e) xVar4).getClass();
                    textView7.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string7, textSize4));
                    textView7.setVisibility(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
                        le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                        float textSize5 = textView6.getTextSize();
                        ((ke0.e) xVar5).getClass();
                        textView6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string6, textSize5));
                    }
                }
                if (!z17 && !z18) {
                    android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.lwt);
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i17 == 5 && (list = this.f157590e.M) != null && ((java.util.ArrayList) list).get(0) != null && !android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157590e.M).get(0)).f179706g)) {
                textView3.setText(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157590e.M).get(0)).f179706g);
            }
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f486626lx1)).setOnClickListener(new com.tencent.mm.plugin.remittance.ui.f8(this));
        ((mz2.j2) ((mz2.e1) i95.n0.c(mz2.e1.class))).Ai(this);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f157590e = (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
        initView();
        if (this.f157591f == 31) {
            java.lang.String str = ((java.util.ArrayList) this.f157590e.M).size() > 0 ? ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f157590e.M).get(0)).f179714r : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResultOldUI", "transId: %s", str);
            kw3.p.Ai().Di().d(str, this.f157592g, "");
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            W6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceResultUI, com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
