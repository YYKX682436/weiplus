package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class MobileRemitResultUI extends com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f156591d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f156592e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f156593f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f156594g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f156595h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f156596i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f156597m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f156598n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f156599o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f156600p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f156601q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156602r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f156603s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f156604t;

    /* renamed from: u, reason: collision with root package name */
    public int f156605u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f156606v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f156607w;

    /* renamed from: x, reason: collision with root package name */
    public int f156608x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f156609y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f156610z;

    public final void V6(int i17) {
        if (i17 == 0) {
            this.f156593f.setImageDrawable(i65.a.i(this, com.tencent.mm.R.raw.icons_filled_done2));
            this.f156593f.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478502m), android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            this.f156593f.setImageDrawable(i65.a.i(this, com.tencent.mm.R.raw.icons_filled_time));
            this.f156593f.getDrawable().setColorFilter(getResources().getColor(com.tencent.mm.R.color.f478496g), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void W6(r45.tp6 tp6Var) {
        if (tp6Var == null) {
            V6(this.f156608x);
            this.f156594g.post(new com.tencent.mm.plugin.remittance.mobile.ui.q0(this));
            this.f156597m.setText(com.tencent.mm.wallet_core.ui.r1.n(this.f156605u / 100.0d, "CNY"));
            android.view.View view = this.f156598n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f156599o.setVisibility(8);
        } else {
            V6(tp6Var.f386661f);
            if (tp6Var.f386663h != null) {
                this.f156591d.setVisibility(0);
                this.f156592e.setText(tp6Var.f386663h.f381048d);
                this.f156591d.setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.s0(this, tp6Var));
            }
            java.util.LinkedList linkedList = tp6Var.f386662g;
            if (linkedList == null || linkedList.isEmpty()) {
                this.f156599o.setVisibility(8);
                android.view.View view2 = this.f156598n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                for (int i17 = 0; i17 < linkedList.size(); i17++) {
                    r45.f44 f44Var = (r45.f44) linkedList.get(i17);
                    android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.c28, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hqa)).setText(f44Var.f374006d);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.own)).setText(f44Var.f374007e);
                    this.f156599o.addView(inflate);
                }
                this.f156599o.setVisibility(0);
                android.view.View view3 = this.f156598n;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.ui.tools.k8.a(getContext(), (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view), findViewById(com.tencent.mm.R.id.auz), findViewById(com.tencent.mm.R.id.f483451aw1), findViewById(com.tencent.mm.R.id.auj), 48);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c29;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(null);
        setBackBtnVisible(false);
        this.f156591d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jo9);
        this.f156592e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        this.f156593f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485955jo3);
        this.f156594g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485954jo2);
        this.f156595h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485953jo1);
        this.f156596i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485956jo4);
        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = (com.tencent.mm.wallet_core.ui.WalletTextView) findViewById(com.tencent.mm.R.id.f485957jo5);
        this.f156597m = walletTextView;
        walletTextView.setTypeface(0);
        this.f156598n = findViewById(com.tencent.mm.R.id.jo7);
        this.f156599o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.jo8);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.jo6)).setOnClickListener(new com.tencent.mm.plugin.remittance.mobile.ui.p0(this));
        W6(null);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.wallet_core.b.a().getClass();
        com.tencent.mm.wallet_core.b.a().getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "use Kinda");
        if (getIntent() == null || getIntent().getExtras() == null) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) getInput().getParcelable("key_pay_info");
            this.f156600p = payInfo;
            if (payInfo == null || payInfo.f192122u == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "payInfo != null && payInfo.extInfo != null");
                U6();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "use native");
                android.os.Bundle bundle2 = this.f156600p.f192122u;
                this.f156601q = bundle2.getString("extinfo_key_1");
                this.f156602r = bundle2.getString("extinfo_key_2");
                this.f156603s = bundle2.getString("extinfo_key_3");
                this.f156604t = bundle2.getString("extinfo_key_4");
                this.f156605u = bundle2.getInt("extinfo_key_5");
                this.f156606v = bundle2.getString("extinfo_key_6");
                this.f156607w = bundle2.getString("extinfo_key_7");
                this.f156608x = bundle2.getInt("extinfo_key_8");
                this.f156609y = bundle2.getString("extinfo_key_9");
                this.f156610z = bundle2.getString("extinfo_key_10");
                this.A = bundle2.getString("extinfo_key_11");
            }
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            this.f156601q = extras.getString("extinfo_key_1");
            this.f156602r = extras.getString("extinfo_key_2");
            this.f156603s = extras.getString("extinfo_key_3");
            this.f156604t = extras.getString("extinfo_key_4");
            this.f156605u = extras.getInt("extinfo_key_5");
            this.f156606v = extras.getString("extinfo_key_6");
            this.f156607w = extras.getString("extinfo_key_7");
            this.f156608x = extras.getInt("extinfo_key_8");
            this.f156609y = extras.getString("extinfo_key_9");
            this.f156610z = extras.getString("extinfo_key_10");
            this.A = extras.getString("extinfo_key_11");
        }
        initView();
        doSceneProgress(new sw3.i(this.f156601q, this.f156602r, this.f156603s, this.f156604t, this.f156605u, this.f156606v, this.f156607w));
        addSceneEndListener(1903);
        com.tencent.mm.autogen.events.MobilePayCheckEvent mobilePayCheckEvent = new com.tencent.mm.autogen.events.MobilePayCheckEvent();
        mobilePayCheckEvent.f54496g.f8017a = this.A;
        mobilePayCheckEvent.e();
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1903);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "onKeyUp KEYCODE_BACK click");
            U6();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof sw3.i)) {
            return false;
        }
        r45.tp6 tp6Var = ((sw3.i) m1Var).f413472t;
        if (tp6Var == null) {
            tp6Var = null;
        }
        if (tp6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage succPageResp is null");
            return true;
        }
        int i19 = tp6Var.f386659d;
        if (i19 == 0) {
            W6(tp6Var);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage ret_code:%s ret_msg:%s", java.lang.Integer.valueOf(i19), tp6Var.f386660e);
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.mobile.ui.u0.class);
    }
}
