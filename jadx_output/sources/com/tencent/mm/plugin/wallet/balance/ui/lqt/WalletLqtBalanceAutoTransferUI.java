package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class WalletLqtBalanceAutoTransferUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f177932t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f177933d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f177934e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177935f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177936g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177937h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177938i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f177939m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f177940n;

    /* renamed from: o, reason: collision with root package name */
    public int f177941o;

    /* renamed from: p, reason: collision with root package name */
    public r45.dm6 f177942p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ra5 f177943q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f177944r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f177945s;

    public final void U6() {
        this.f177939m.setVisibility(8);
        android.view.View view = this.f177940n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "hideTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String V6(r45.dm6 dm6Var, int i17) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
        return getString(i17, decimalFormat.format(dm6Var.f372578d / 60), decimalFormat.format(dm6Var.f372579e / 60));
    }

    public final void W6() {
        this.f177933d.setCheck(true);
        android.view.View view = this.f177945s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Y6();
    }

    public final void X6() {
        this.f177933d.setCheck(false);
        android.view.View view = this.f177945s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAccountUnChecked", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6();
    }

    public final void Y6() {
        this.f177939m.setVisibility(0);
        android.view.View view = this.f177940n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "showTimeLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bt8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f177933d = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.f485518hz0);
        this.f177937h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hz9);
        this.f177938i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485522hz4);
        this.f177936g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hz6);
        this.f177939m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.hz7);
        this.f177940n = findViewById(com.tencent.mm.R.id.f485521hz3);
        this.f177934e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485520hz2);
        this.f177935f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hz8);
        this.f177945s = findViewById(com.tencent.mm.R.id.f485523hz5);
        this.f177933d.setSwitchListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.v(this));
        this.f177939m.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.w(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "on activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("encrypt_pwd") : "";
        if (i17 == 16) {
            if (i18 != -1) {
                X6();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do open");
                new com.tencent.mm.plugin.wallet.balance.model.lqt.d(stringExtra).l().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.b0(this, com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null)));
                return;
            }
        }
        if (i17 != 32) {
            super.onActivityResult(i17, i18, intent);
        } else if (i18 != -1) {
            W6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do close");
            new com.tencent.mm.plugin.wallet.balance.model.lqt.b(stringExtra).l().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c0(this, com.tencent.mm.wallet_core.ui.b2.e(getContext(), false, false, null)));
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        initView();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        if (getIntent().getIntExtra("show_open_toast", 0) == 1) {
            dp.a.makeText(this, com.tencent.mm.R.string.koo, 0).show();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do qry setting");
        new com.tencent.mm.plugin.wallet.balance.model.lqt.e().l().h(new com.tencent.mm.plugin.wallet.balance.ui.lqt.a0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
