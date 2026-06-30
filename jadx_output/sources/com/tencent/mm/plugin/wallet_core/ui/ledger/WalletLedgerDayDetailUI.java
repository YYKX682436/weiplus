package com.tencent.mm.plugin.wallet_core.ui.ledger;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayDetailUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class WalletLedgerDayDetailUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: e, reason: collision with root package name */
    public int f180414e;

    /* renamed from: f, reason: collision with root package name */
    public int f180415f;

    /* renamed from: h, reason: collision with root package name */
    public int f180417h;

    /* renamed from: i, reason: collision with root package name */
    public ft4.u1 f180418i;

    /* renamed from: n, reason: collision with root package name */
    public ft4.i f180420n;

    /* renamed from: o, reason: collision with root package name */
    public dt4.p f180421o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f180422p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f180423q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f180424r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f180425s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180413d = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f180416g = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f180419m = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final ft4.q f180426t = new ft4.q(this);

    /* renamed from: u, reason: collision with root package name */
    public final ft4.s f180427u = new ft4.s(this);

    public final java.lang.String U6(long j17, long j18) {
        double d17 = 100;
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.f493543lh3, com.tencent.mm.wallet_core.ui.r1.o(java.lang.Math.abs(j18) / d17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.f493544lh4, com.tencent.mm.wallet_core.ui.r1.o(java.lang.Math.abs(j17) / d17));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string + "  " + string2;
    }

    public final void V6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dt4.t tVar = new dt4.t();
        tVar.f243287a = this.f180414e;
        tVar.f243288b = this.f180415f;
        arrayList.add(tVar);
        dt4.p pVar = this.f180421o;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        java.util.List l17 = pVar.l(this.f180417h, arrayList);
        java.util.List list = this.f180419m;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) l17;
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            dt4.t tVar2 = (dt4.t) it.next();
            tVar2.f243291e.size();
            java.util.Iterator it6 = ((java.util.TreeMap) kz5.b1.g(tVar2.f243291e, new ft4.p())).entrySet().iterator();
            while (it6.hasNext()) {
                arrayList2.add(new ft4.j(2, new ft4.k(), (dt4.q) ((java.util.Map.Entry) it6.next()).getValue()));
            }
        }
        if (arrayList3.isEmpty()) {
            android.widget.TextView textView = this.f180424r;
            if (textView == null) {
                kotlin.jvm.internal.o.o("summarizeText");
                throw null;
            }
            textView.setText(U6(0L, 0L));
            android.widget.LinearLayout linearLayout = this.f180425s;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("noTradeLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f180423q;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = this.f180424r;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("summarizeText");
                throw null;
            }
            textView2.setText(U6(((dt4.t) arrayList3.get(0)).f243290d, ((dt4.t) arrayList3.get(0)).f243289c));
            android.widget.LinearLayout linearLayout2 = this.f180425s;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("noTradeLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f180423q;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            recyclerView2.setVisibility(0);
        }
        ft4.i iVar = this.f180420n;
        if (iVar == null) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ft4.i iVar2 = new ft4.i(context, list);
            this.f180420n = iVar2;
            java.lang.String str = this.f180413d;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            iVar2.f266624f = str;
            ft4.i iVar3 = this.f180420n;
            kotlin.jvm.internal.o.d(iVar3);
            iVar3.f266627i = false;
            ft4.i iVar4 = this.f180420n;
            kotlin.jvm.internal.o.d(iVar4);
            iVar4.f266628m = !this.f180416g;
            ft4.i iVar5 = this.f180420n;
            kotlin.jvm.internal.o.d(iVar5);
            iVar5.f266625g = 0;
            ft4.i iVar6 = this.f180420n;
            kotlin.jvm.internal.o.d(iVar6);
            iVar6.f266626h = 0;
            ft4.i iVar7 = this.f180420n;
            kotlin.jvm.internal.o.d(iVar7);
            iVar7.f266629n = new ft4.t(this);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f180423q;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            recyclerView3.setAdapter(this.f180420n);
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f180423q;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            recyclerView4.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        } else {
            kotlin.jvm.internal.o.g(list, "<set-?>");
            iVar.f266623e = list;
        }
        ft4.i iVar8 = this.f180420n;
        kotlin.jvm.internal.o.d(iVar8);
        iVar8.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489618dm5;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pym);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(this.f180426t);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pyo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f180422p = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qxv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f180423q = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q2t);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f180424r = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f485529py5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f180425s = (android.widget.LinearLayout) findViewById5;
        android.widget.TextView textView = this.f180422p;
        if (textView != null) {
            textView.setText(getContext().getString(dt4.p.f243266f.c(this.f180417h)));
        } else {
            kotlin.jvm.internal.o.o("typeText");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0137  */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI.onCreate(android.os.Bundle):void");
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
