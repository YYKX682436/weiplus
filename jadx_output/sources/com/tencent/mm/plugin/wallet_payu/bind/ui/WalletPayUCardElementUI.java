package com.tencent.mm.plugin.wallet_payu.bind.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class WalletPayUCardElementUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181233d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181234e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181235f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f181236g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f181237h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f181238i;

    /* renamed from: m, reason: collision with root package name */
    public st4.g f181239m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181240n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181241o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f181242p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashSet f181243q = null;

    public static void U6(com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI, android.view.View view, android.text.Editable editable) {
        if (editable != null) {
            walletPayUCardElementUI.getClass();
            if (editable.length() != 0) {
                if (view.getId() == walletPayUCardElementUI.f181233d.getId()) {
                    walletPayUCardElementUI.f181240n = true;
                } else if (view.getId() == walletPayUCardElementUI.f181235f.getId()) {
                    walletPayUCardElementUI.f181241o = true;
                } else {
                    view.getId();
                    walletPayUCardElementUI.f181234e.getId();
                }
            }
        }
        walletPayUCardElementUI.f181239m.a();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489357c94;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181239m = new st4.g(this);
        this.f181242p = new java.util.HashMap();
        this.f181243q = new java.util.HashSet();
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f483580bb3);
        this.f181233d = walletFormView;
        qp5.p.a(walletFormView);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cqm);
        this.f181234e = walletFormView2;
        qp5.p.d(this, walletFormView2);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView3 = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.cpz);
        this.f181235f = walletFormView3;
        qp5.p.c(this, walletFormView3);
        this.f181236g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pbh);
        this.f181237h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pb7);
        this.f181238i = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        setEditFocusListener(this.f181233d, 0, false);
        setEditFocusListener(this.f181235f, 0, false);
        this.f181233d.setOnInputValidChangeListener(this);
        this.f181235f.setOnInputValidChangeListener(this);
        this.f181234e.setOnInputValidChangeListener(this);
        this.f181233d.setEncryptType(0);
        this.f181235f.b(new st4.b(this));
        this.f181234e.b(new st4.c(this));
        this.f181233d.b(new st4.d(this));
        this.f181238i.setOnClickListener(new st4.e(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.pek)).setText(c01.z1.I() ? com.tencent.mm.R.string.kwm : com.tencent.mm.R.string.kwn);
        vt4.c.a(this, (android.widget.TextView) findViewById(com.tencent.mm.R.id.ngo));
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f181239m.a();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof rt4.b) {
            rt4.b bVar = (rt4.b) m1Var;
            this.f181242p.put(bVar.f399541d, (com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement) getInput().getParcelable("key_card_element"));
            this.f181239m.a();
            this.f181243q.remove(bVar.f399541d);
            return true;
        }
        if ((m1Var instanceof rt4.a) && (i17 != 0 || i18 != 0)) {
            this.f181233d.setEncryptType(0);
        }
        return false;
    }
}
