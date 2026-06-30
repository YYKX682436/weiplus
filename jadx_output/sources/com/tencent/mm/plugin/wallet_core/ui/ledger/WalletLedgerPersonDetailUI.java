package com.tencent.mm.plugin.wallet_core.ui.ledger;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class WalletLedgerPersonDetailUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public int f180450f;

    /* renamed from: g, reason: collision with root package name */
    public int f180451g;

    /* renamed from: h, reason: collision with root package name */
    public int f180452h;

    /* renamed from: m, reason: collision with root package name */
    public int f180454m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.y0 f180455n;

    /* renamed from: o, reason: collision with root package name */
    public ft4.u1 f180456o;

    /* renamed from: p, reason: collision with root package name */
    public gt4.s0 f180457p;

    /* renamed from: q, reason: collision with root package name */
    public dt4.p f180458q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f180459r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f180460s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f180461t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f180462u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f180463v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f180464w;

    /* renamed from: x, reason: collision with root package name */
    public ft4.u f180465x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180448d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180449e = "";

    /* renamed from: i, reason: collision with root package name */
    public int f180453i = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f180466y = 1;

    /* renamed from: z, reason: collision with root package name */
    public final ft4.a1 f180467z = new ft4.a1(this);
    public final ft4.z0 A = new ft4.z0(this);
    public final ft4.d1 B = new ft4.d1(this);

    public final void U6() {
        dt4.p pVar = this.f180458q;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(this.f180454m, this.f180449e, this.f180450f, this.f180451g);
        java.util.ArrayList arrayList = (java.util.ArrayList) k17.f243286e;
        if (arrayList.size() <= 0) {
            android.widget.LinearLayout linearLayout = this.f180462u;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("noTradeLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            if (this.f180466y == 1) {
                dt4.p pVar2 = this.f180458q;
                if (pVar2 == null) {
                    kotlin.jvm.internal.o.o("ledgerDataCenter");
                    throw null;
                }
                java.util.List n17 = pVar2.n(this.f180449e, this.f180454m, this.f180450f, 2, true);
                if (!n17.isEmpty()) {
                    this.f180453i = ((dt4.u) kz5.n0.X(n17)).f243292a / 100;
                    android.widget.TextView textView = this.f180463v;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("lastMonthBtn");
                        throw null;
                    }
                    textView.setVisibility(0);
                } else {
                    android.widget.TextView textView2 = this.f180463v;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("lastMonthBtn");
                        throw null;
                    }
                    textView2.setVisibility(8);
                }
            } else {
                android.widget.TextView textView3 = this.f180463v;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("lastMonthBtn");
                    throw null;
                }
                textView3.setVisibility(8);
            }
        } else {
            android.widget.LinearLayout linearLayout2 = this.f180462u;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("noTradeLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.TextView textView4 = this.f180463v;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("lastMonthBtn");
                throw null;
            }
            textView4.setVisibility(8);
        }
        ft4.y0 y0Var = this.f180455n;
        if (y0Var == null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ft4.y0 y0Var2 = new ft4.y0(context, arrayList);
            this.f180455n = y0Var2;
            java.lang.String str = this.f180448d;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            y0Var2.f266731f = str;
            ft4.y0 y0Var3 = this.f180455n;
            if (y0Var3 != null) {
                java.lang.String str2 = this.f180449e;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                y0Var3.f266732g = str2;
            }
            ft4.y0 y0Var4 = this.f180455n;
            if (y0Var4 != null) {
                y0Var4.f266741s = new ft4.f1(this);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f180459r;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("detailListView");
                throw null;
            }
            recyclerView.setAdapter(this.f180455n);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f180459r;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("detailListView");
                throw null;
            }
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f180459r;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("detailListView");
                throw null;
            }
            recyclerView3.i(new ft4.g1(this));
        } else if (y0Var != null) {
            y0Var.f266730e = arrayList;
        }
        ft4.y0 y0Var5 = this.f180455n;
        if (y0Var5 != null) {
            y0Var5.f266733h = this.f180466y;
        }
        if (y0Var5 != null) {
            y0Var5.f266734i = this.f180450f;
        }
        if (y0Var5 != null) {
            y0Var5.f266735m = this.f180451g;
        }
        if (y0Var5 != null) {
            y0Var5.f266738p = this.f180454m;
        }
        if (y0Var5 != null) {
            y0Var5.f266736n = k17.f243285d;
        }
        if (y0Var5 != null) {
            y0Var5.f266737o = k17.f243284c;
        }
        if (y0Var5 != null) {
            ft4.a1 callback = this.f180467z;
            kotlin.jvm.internal.o.g(callback, "callback");
            y0Var5.f266739q = callback;
        }
        ft4.y0 y0Var6 = this.f180455n;
        if (y0Var6 != null) {
            ft4.z0 callback2 = this.A;
            kotlin.jvm.internal.o.g(callback2, "callback");
            y0Var6.f266740r = callback2;
        }
        ft4.y0 y0Var7 = this.f180455n;
        if (y0Var7 != null) {
            y0Var7.notifyDataSetChanged();
        }
        ft4.u uVar = this.f180465x;
        if (uVar == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        uVar.f266699c = this.f180466y;
        if (uVar != null) {
            uVar.b(this.f180450f, this.f180451g, k17.f243285d, k17.f243284c);
        } else {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.de7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int u17 = com.tencent.mm.wallet_core.ui.r1.u(0L, "yyyyMM") * 100;
        this.f180450f = u17 + 1;
        this.f180451g = u17 + 31;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pyb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f180459r = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pya);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f180460s = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485529py5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f180462u = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.pyl);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById4).setOnClickListener(this.f180467z);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.pyn);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f180461t = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qu_);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f180463v = textView;
        textView.setOnClickListener(new ft4.c1(this));
        android.widget.TextView textView2 = this.f180463v;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("lastMonthBtn");
            throw null;
        }
        com.tencent.mm.wallet_core.ui.r1.d(textView2);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.q2m);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f180464w = (android.widget.LinearLayout) findViewById7;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.widget.LinearLayout linearLayout = this.f180464w;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
        ft4.u uVar = new ft4.u(context, linearLayout);
        this.f180465x = uVar;
        uVar.a(this.A);
        ft4.u uVar2 = this.f180465x;
        if (uVar2 != null) {
            uVar2.f266699c = this.f180466y;
        } else {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478869jf));
        hideActionbarLine();
        setMMTitle("");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f180448d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        this.f180449e = stringExtra2 != null ? stringExtra2 : "";
        initView();
        dt4.p a17 = dt4.p.f243266f.a(this.f180448d);
        this.f180458q = a17;
        a17.p(new ft4.b1());
        dt4.p pVar = this.f180458q;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        int j17 = pVar.j(this.f180449e);
        if (j17 > 0) {
            int i17 = (j17 / 100) * 100;
            this.f180450f = i17 + 1;
            this.f180451g = i17 + 31;
        }
        dt4.p pVar2 = this.f180458q;
        if (pVar2 == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        java.lang.String username = this.f180449e;
        kotlin.jvm.internal.o.g(username, "username");
        this.f180452h = pVar2.i(username, 0);
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(or4.h.class);
    }
}
