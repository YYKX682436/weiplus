package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class RemittanceF2fLargeMoneyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f157411d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f157412e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f157413f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f157414g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f157415h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f157416i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f157417m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f157418n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f157419o;

    /* renamed from: p, reason: collision with root package name */
    public int f157420p = 4;

    /* renamed from: q, reason: collision with root package name */
    public int f157421q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f157422r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f157423s;

    /* renamed from: t, reason: collision with root package name */
    public double f157424t;

    public void U6(double d17) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157415h;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.e(false);
        }
        com.tencent.mm.autogen.events.F2fLargeMoneyPayEvent f2fLargeMoneyPayEvent = new com.tencent.mm.autogen.events.F2fLargeMoneyPayEvent();
        java.lang.String stringExtra = getIntent().getStringExtra("key_amount_remind_sign");
        am.f9 f9Var = f2fLargeMoneyPayEvent.f54223g;
        f9Var.f6654a = stringExtra;
        f9Var.f6657d = getIntent().getStringExtra("key_qr_code");
        f9Var.f6655b = (int) java.lang.Math.round(d17 * 100.0d);
        f9Var.f6656c = this;
        f2fLargeMoneyPayEvent.e();
    }

    public void V6() {
        this.f157420p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f157422r = getIntent().getStringExtra("key_title");
        this.f157423s = getIntent().getStringExtra("key_desc");
    }

    public void W6() {
        this.f157412e.setText(this.f157422r);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.remittance.model.s1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.remittance.model.s1.class)).setValue("page_title_key", this.f157422r);
        this.f157413f.setText(this.f157423s);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "finish()");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ce8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackGroundColorResource(com.tencent.mm.R.color.aaw);
        setBackBtn(new com.tencent.mm.plugin.remittance.ui.r6(this));
        this.f157411d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.root_view);
        this.f157412e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484271dm1);
        this.f157413f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484270dm0);
        this.f157414g = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.luu);
        this.f157415h = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f157418n = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcl);
        this.f157419o = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pco);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pck);
        if (com.tencent.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chv);
        } else {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.pcp);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pcm);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.chu);
        }
        W6();
        ((com.tencent.mm.wallet_core.ui.WalletTextView) this.f157414g.getTitleTv()).setTypeface(4);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) this.f157414g.getContentEt();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) tenpaySecureEditText.getLayoutParams();
        layoutParams.leftMargin = 0;
        tenpaySecureEditText.setLayoutParams(layoutParams);
        android.widget.TextView titleTv = this.f157414g.getTitleTv();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) titleTv.getLayoutParams();
        layoutParams2.width = -2;
        titleTv.setLayoutParams(layoutParams2);
        setWPKeyboard(this.f157414g.getContentEt(), true, true);
        this.f157415h.setActionText(getString(com.tencent.mm.R.string.f490507x1));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((or4.c) pf5.z.f353948a.a(activity).a(or4.c.class)).setValue("keyboard_title_key", getString(com.tencent.mm.R.string.f490507x1));
        ((android.widget.RelativeLayout.LayoutParams) this.f157415h.getLayoutParams()).addRule(12);
        this.f157414g.r(7, 2);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f157414g;
        int b17 = i65.a.b(getContext(), 2);
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = walletFormView.f214161h;
        if (tenpaySecureEditText2 != null) {
            tenpaySecureEditText2.setPadding(b17, 0, 0, 0);
        }
        this.f157414g.getContentEt().setOnEditorActionListener(new com.tencent.mm.plugin.remittance.ui.s6(this));
        this.f157414g.b(new com.tencent.mm.plugin.remittance.ui.t6(this));
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f157415h;
        if (wcPayKeyboard != null) {
            wcPayKeyboard.e(false);
        }
        this.f157419o.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK")) {
            this.f157416i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.pcn);
            this.f157417m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pcq);
            this.f157416i.post(new com.tencent.mm.plugin.remittance.ui.u6(this));
            this.f157414g.setmWalletFormViewListener(new com.tencent.mm.plugin.remittance.ui.v6(this));
        } else {
            this.f157418n.setVisibility(8);
        }
        this.f157411d.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.w6(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "RemittanceF2fLargeMoneyUI show");
        int intExtra = getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", 0);
        int intExtra2 = getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", 0);
        if (intExtra != 0 && intExtra2 != 0) {
            overridePendingTransition(intExtra, intExtra2);
        }
        V6();
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceF2fLargeMoneyUI", "onResume()");
        com.tencent.mm.plugin.remittance.ui.s1.d();
        com.tencent.mm.plugin.remittance.ui.r1.f157911a.a(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.remittance.model.s1.class);
    }
}
