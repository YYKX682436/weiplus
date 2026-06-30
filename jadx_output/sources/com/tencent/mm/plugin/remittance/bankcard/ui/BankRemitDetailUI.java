package com.tencent.mm.plugin.remittance.bankcard.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class BankRemitDetailUI extends com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f156501e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f156502f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f156503g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f156504h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f156505i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f156506m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f156507n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f156508o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f156509p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f156510q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f156511r;

    /* renamed from: s, reason: collision with root package name */
    public int f156512s;

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI
    public void U6() {
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
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getContentView().setFitsSystemWindows(true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488182js;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f156501e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.axl);
        this.f156502f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.axm);
        this.f156503g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axw);
        this.f156504h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axx);
        this.f156505i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axi);
        this.f156506m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axj);
        this.f156507n = findViewById(com.tencent.mm.R.id.axq);
        this.f156508o = findViewById(com.tencent.mm.R.id.axr);
        this.f156509p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.axb);
        this.f156510q = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.axg);
        if (this.f156512s != 1) {
            ((android.widget.Button) findViewById(com.tencent.mm.R.id.axe)).setOnClickListener(new qw3.p0(this));
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.axf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(fe1.t.CTRL_INDEX);
        this.f156511r = getIntent().getStringExtra("key_transfer_bill_id");
        int intExtra = getIntent().getIntExtra("key_enter_scene", 0);
        this.f156512s = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", this.f156511r, java.lang.Integer.valueOf(intExtra));
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitDetailUI", "do query detail");
        doSceneProgress(new ow3.j(this.f156511r));
        if (this.f156512s == 0) {
            showHomeBtn(false);
            enableBackMenu(false);
            setMMTitle(com.tencent.mm.R.string.ae8);
        } else {
            showHomeBtn(true);
            enableBackMenu(true);
            setMMTitle(com.tencent.mm.R.string.ae7);
        }
        setBackBtn(new qw3.o0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(fe1.t.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ow3.j) {
            ow3.j jVar = (ow3.j) m1Var;
            jVar.O(new qw3.r0(this, jVar));
            jVar.J(new qw3.q0(this, jVar));
            if (jVar.f214031i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitDetailUI", "net error: %s", jVar);
                dp.a.makeText(this, com.tencent.mm.R.string.adu, 1).show();
            }
        }
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(nw3.f.class);
    }
}
