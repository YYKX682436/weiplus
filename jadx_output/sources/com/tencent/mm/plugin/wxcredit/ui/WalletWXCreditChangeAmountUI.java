package com.tencent.mm.plugin.wxcredit.ui;

/* loaded from: classes9.dex */
public class WalletWXCreditChangeAmountUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f188524d;

    /* renamed from: f, reason: collision with root package name */
    public d05.l f188526f;

    /* renamed from: g, reason: collision with root package name */
    public d05.l f188527g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f188529i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f188530m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f188531n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f188532o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f188533p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f188534q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f188535r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f188536s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.EditText f188537t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.EditText f188538u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.EditText f188539v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.EditText f188540w;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f188525e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f188528h = -1;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.BaseAdapter f188541x = new e05.o(this);

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.BaseAdapter f188542y = new e05.e(this);

    public static void U6(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        java.util.ArrayList arrayList = (java.util.ArrayList) walletWXCreditChangeAmountUI.f188525e;
        arrayList.clear();
        if (walletWXCreditChangeAmountUI.f188529i) {
            java.util.Iterator it = ((java.util.ArrayList) walletWXCreditChangeAmountUI.f188524d).iterator();
            while (it.hasNext()) {
                d05.l lVar = (d05.l) it.next();
                if (lVar.f225609a != 2) {
                    arrayList.add(lVar);
                }
            }
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) walletWXCreditChangeAmountUI.f188524d).iterator();
        while (it6.hasNext()) {
            d05.l lVar2 = (d05.l) it6.next();
            if (lVar2.f225609a != 1) {
                arrayList.add(lVar2);
            }
        }
    }

    public final void V6() {
        d05.l lVar = this.f188526f;
        if (lVar != null) {
            this.f188531n.setText(lVar.f225613e);
            if (this.f188526f.f225616h != null) {
                this.f188535r.setVisibility(0);
                this.f188537t.setVisibility(8);
                this.f188533p.setText(this.f188526f.f225616h.f225613e);
                this.f188538u.setHint(this.f188526f.f225616h.f225614f);
                if ("Y".equals(this.f188526f.f225611c)) {
                    this.f188533p.setVisibility(0);
                    this.f188538u.setVisibility(0);
                    this.f188535r.setText(com.tencent.mm.R.string.f490608zu);
                } else {
                    this.f188533p.setVisibility(8);
                    this.f188538u.setVisibility(8);
                    if ("N".equals(this.f188526f.f225611c)) {
                        this.f188535r.setText(com.tencent.mm.R.string.f490503wx);
                    }
                }
            } else {
                this.f188535r.setVisibility(8);
                this.f188537t.setVisibility(0);
                this.f188537t.setHint(this.f188526f.f225614f);
                this.f188533p.setVisibility(8);
                this.f188538u.setVisibility(8);
            }
        }
        d05.l lVar2 = this.f188527g;
        if (lVar2 != null) {
            this.f188532o.setText(lVar2.f225613e);
            if (this.f188527g.f225616h == null) {
                this.f188536s.setVisibility(8);
                this.f188539v.setVisibility(0);
                this.f188539v.setHint(this.f188527g.f225614f);
                this.f188534q.setVisibility(8);
                this.f188540w.setVisibility(8);
                return;
            }
            this.f188536s.setVisibility(0);
            this.f188539v.setVisibility(8);
            this.f188534q.setText(this.f188527g.f225616h.f225613e);
            this.f188540w.setHint(this.f188527g.f225616h.f225614f);
            if ("Y".equals(this.f188527g.f225611c)) {
                this.f188534q.setVisibility(0);
                this.f188540w.setVisibility(0);
                this.f188536s.setText(com.tencent.mm.R.string.f490608zu);
            } else {
                this.f188534q.setVisibility(8);
                this.f188540w.setVisibility(8);
                if ("N".equals(this.f188527g.f225611c)) {
                    this.f188536s.setText(com.tencent.mm.R.string.f490503wx);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8p;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f493638l31);
        this.f188531n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfo);
        this.f188533p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfp);
        this.f188532o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfq);
        this.f188534q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfr);
        this.f188537t = (android.widget.EditText) findViewById(com.tencent.mm.R.id.pfe);
        this.f188538u = (android.widget.EditText) findViewById(com.tencent.mm.R.id.pff);
        this.f188539v = (android.widget.EditText) findViewById(com.tencent.mm.R.id.pfg);
        this.f188540w = (android.widget.EditText) findViewById(com.tencent.mm.R.id.pfh);
        this.f188535r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfi);
        this.f188536s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pfj);
        this.f188535r.setOnClickListener(this);
        this.f188536s.setOnClickListener(this);
        this.f188531n.setOnClickListener(new e05.g(this));
        this.f188532o.setOnClickListener(new e05.h(this));
        setBackBtn(new e05.i(this));
        findViewById(com.tencent.mm.R.id.kao).setOnClickListener(new e05.j(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.pfi) {
            this.f188530m = true;
            showDialog(2);
        } else if (view.getId() == com.tencent.mm.R.id.pfj) {
            this.f188530m = false;
            showDialog(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        V6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 == 1) {
            android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.d6z, (android.view.ViewGroup) null);
            com.tencent.mm.ui.ListViewInScrollView listViewInScrollView = (com.tencent.mm.ui.ListViewInScrollView) inflate.findViewById(com.tencent.mm.R.id.f482735mf);
            listViewInScrollView.setAdapter((android.widget.ListAdapter) this.f188541x);
            listViewInScrollView.setOnItemClickListener(new e05.k(this));
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.l2z);
            aVar.L = inflate;
            aVar.G = null;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var == null) {
                return j0Var;
            }
            d0Var.a(j0Var.f211837r);
            return j0Var;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return db5.e1.F(this, "", "", true);
            }
            java.lang.String string = getString(com.tencent.mm.R.string.l2y);
            int i18 = this.f188528h;
            if (i18 > 0) {
                string = getString(com.tencent.mm.R.string.l2w, java.lang.Integer.valueOf(i18));
            }
            return db5.e1.u(this, string, null, new e05.m(this), new e05.n(this));
        }
        android.view.View inflate2 = getLayoutInflater().inflate(com.tencent.mm.R.layout.d6z, (android.view.ViewGroup) null);
        com.tencent.mm.ui.ListViewInScrollView listViewInScrollView2 = (com.tencent.mm.ui.ListViewInScrollView) inflate2.findViewById(com.tencent.mm.R.id.f482735mf);
        listViewInScrollView2.setAdapter((android.widget.ListAdapter) this.f188542y);
        listViewInScrollView2.setOnItemClickListener(new e05.l(this));
        com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
        aVar2.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.l2v);
        aVar2.L = inflate2;
        aVar2.G = null;
        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var2.e(aVar2);
        com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
        if (d0Var2 == null) {
            return j0Var2;
        }
        d0Var2.a(j0Var2.f211837r);
        return j0Var2;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof d05.e) {
                d05.e eVar = (d05.e) m1Var;
                java.util.List list = eVar.f225588d;
                this.f188524d = list;
                this.f188528h = eVar.f225590f;
                if (list != null && list.size() >= 2) {
                    this.f188526f = (d05.l) this.f188524d.get(0);
                    d05.l lVar = (d05.l) this.f188524d.get(1);
                    this.f188527g = lVar;
                    this.f188526f.f225609a = 1;
                    lVar.f225609a = 2;
                }
                V6();
                return true;
            }
        } else if (m1Var instanceof d05.c) {
            db5.e1.G(this, str, null, false, new e05.f(this));
            return true;
        }
        return false;
    }
}
