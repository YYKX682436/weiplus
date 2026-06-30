package com.tencent.mm.plugin.wallet_core.ui.ledger;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class WalletLedgerPersonUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public long f180470f;

    /* renamed from: g, reason: collision with root package name */
    public int f180471g;

    /* renamed from: h, reason: collision with root package name */
    public int f180472h;

    /* renamed from: i, reason: collision with root package name */
    public int f180473i;

    /* renamed from: m, reason: collision with root package name */
    public int f180474m;

    /* renamed from: n, reason: collision with root package name */
    public int f180475n;

    /* renamed from: o, reason: collision with root package name */
    public dt4.p f180476o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Dialog f180477p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f180478q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f180479r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f180480s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180468d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180469e = "";

    /* renamed from: t, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f180481t = new ft4.h1(this);

    public final void U6() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, java.lang.Integer.valueOf(this.f180470f > 0 ? 3 : 2), 12, 0, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", this.f180468d);
        intent.putExtra("key_username", this.f180469e);
        j45.l.j(getContext(), "wallet_core", ".ui.ledger.WalletLedgerPersonDetailUI", intent, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dea;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideLoading() {
        android.app.Dialog dialog = this.f180477p;
        if (dialog != null) {
            kotlin.jvm.internal.o.d(dialog);
            if (dialog.isShowing()) {
                android.app.Dialog dialog2 = this.f180477p;
                kotlin.jvm.internal.o.d(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pyi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f180478q = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pyj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f180479r = textView;
        if (this.f180470f > 0) {
            textView.setText(getContext().getString(com.tencent.mm.R.string.lhg));
        } else {
            textView.setText(getContext().getString(com.tencent.mm.R.string.lhi));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.py6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f180480s = textView2;
        textView2.setOnClickListener(new ft4.l1(this));
        android.widget.TextView textView3 = this.f180480s;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("allTradeBtn");
            throw null;
        }
        com.tencent.mm.wallet_core.ui.r1.d(textView3);
        int i17 = this.f180475n;
        if (i17 == 1) {
            android.widget.TextView textView4 = this.f180480s;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("allTradeBtn");
                throw null;
            }
            textView4.setText(getContext().getString(com.tencent.mm.R.string.f493545lh5));
        } else if (i17 != 2) {
            android.widget.TextView textView5 = this.f180480s;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("allTradeBtn");
                throw null;
            }
            textView5.setText(getContext().getString(com.tencent.mm.R.string.lo_));
        } else {
            android.widget.TextView textView6 = this.f180480s;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("allTradeBtn");
                throw null;
            }
            textView6.setText(getContext().getString(com.tencent.mm.R.string.lo9));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f180478q;
        if (recyclerView != null) {
            recyclerView.post(new ft4.n1(this));
        } else {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.lifecycle.c1 a17;
        dt4.r rVar;
        androidx.lifecycle.c1 a18;
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f180468d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f180469e = stringExtra2;
        this.f180470f = getIntent().getLongExtra("key_amount", 0L);
        this.f180471g = getIntent().getIntExtra("key_date", 0);
        this.f180472h = getIntent().getIntExtra("key_from_date", 0);
        this.f180473i = getIntent().getIntExtra("key_to_date", 0);
        this.f180474m = getIntent().getIntExtra("key_select_type", 0);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f180469e, true);
        if (n17 != null) {
            this.f180475n = n17.I;
        }
        initView();
        dt4.p a19 = dt4.p.f243266f.a(this.f180468d);
        this.f180476o = a19;
        a19.p(new ft4.i1());
        int i17 = this.f180471g;
        if (i17 > 0) {
            dt4.p pVar = this.f180476o;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("ledgerDataCenter");
                throw null;
            }
            int i18 = this.f180474m;
            java.lang.String username = this.f180469e;
            kotlin.jvm.internal.o.g(username, "username");
            rVar = new dt4.r();
            p75.m0 j17 = dm.ec.f236715r.j(pVar.f243268a);
            p75.d dVar = dm.ec.f236717t;
            p75.y yVar = (p75.y) j17.c(dVar.i(java.lang.Integer.valueOf(i17)));
            yVar.f(dm.ec.f236719v.j(username));
            p75.d dVar2 = dm.ec.f236721x;
            yVar.f(dVar2.o(0));
            if (i18 > 0) {
                yVar.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i18)));
            }
            dm.dc dcVar = new dm.dc();
            dcVar.d();
            dcVar.c();
            ((java.util.LinkedList) dcVar.f236464a).add(dVar);
            dcVar.f();
            ((java.util.LinkedList) dcVar.f236464a).add(dm.ec.f236720w);
            ((java.util.LinkedList) dcVar.f236464a).add(dVar2);
            dcVar.e();
            dcVar.f236465b = yVar;
            dcVar.b();
            p75.l0 a27 = dcVar.a();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            java.util.Iterator it = ((java.util.ArrayList) a27.k(((xs4.b) a18).Q4(), dm.ec.class)).iterator();
            while (it.hasNext()) {
                dm.ec ecVar = (dm.ec) it.next();
                dt4.u uVar = new dt4.u();
                uVar.f243292a = ecVar.t0();
                java.lang.String D0 = ecVar.D0();
                kotlin.jvm.internal.o.f(D0, "getTradeUser(...)");
                uVar.f243293b = D0;
                uVar.f243295d = ecVar.v0();
                uVar.f243296e = ecVar.A0();
                uVar.f243297f = ecVar.u0();
                if (ecVar.z0() == 1) {
                    rVar.f243279b += ecVar.y0();
                    uVar.f243294c += ecVar.y0();
                    ((java.util.ArrayList) rVar.f243281d).add(uVar);
                } else {
                    rVar.f243278a -= ecVar.y0();
                    uVar.f243294c -= ecVar.y0();
                    ((java.util.ArrayList) rVar.f243280c).add(uVar);
                }
            }
        } else {
            dt4.p pVar2 = this.f180476o;
            if (pVar2 == null) {
                kotlin.jvm.internal.o.o("ledgerDataCenter");
                throw null;
            }
            int i19 = this.f180474m;
            java.lang.String username2 = this.f180469e;
            int i27 = this.f180472h;
            int i28 = this.f180473i;
            kotlin.jvm.internal.o.g(username2, "username");
            dt4.r rVar2 = new dt4.r();
            p75.m0 j18 = dm.ec.f236715r.j(pVar2.f243268a);
            p75.d dVar3 = dm.ec.f236717t;
            p75.y yVar2 = (p75.y) j18.c(dVar3.n(java.lang.Integer.valueOf(i27)));
            yVar2.f(dVar3.w(java.lang.Integer.valueOf(i28)));
            yVar2.f(dm.ec.f236719v.j(username2));
            p75.d dVar4 = dm.ec.f236721x;
            yVar2.f(dVar4.o(0));
            if (i19 > 0) {
                yVar2.f(dm.ec.f236720w.i(java.lang.Integer.valueOf(i19)));
            }
            dm.dc dcVar2 = new dm.dc();
            dcVar2.d();
            dcVar2.c();
            ((java.util.LinkedList) dcVar2.f236464a).add(dVar3);
            dcVar2.f();
            ((java.util.LinkedList) dcVar2.f236464a).add(dm.ec.f236720w);
            ((java.util.LinkedList) dcVar2.f236464a).add(dVar4);
            dcVar2.e();
            dcVar2.f236465b = yVar2;
            dcVar2.b();
            p75.l0 a28 = dcVar2.a();
            synchronized (jm0.k.f300270i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
            }
            java.util.Iterator it6 = ((java.util.ArrayList) a28.k(((xs4.b) a17).Q4(), dm.ec.class)).iterator();
            while (it6.hasNext()) {
                dm.ec ecVar2 = (dm.ec) it6.next();
                dt4.u uVar2 = new dt4.u();
                uVar2.f243292a = ecVar2.t0();
                java.lang.String D02 = ecVar2.D0();
                kotlin.jvm.internal.o.f(D02, "getTradeUser(...)");
                uVar2.f243293b = D02;
                uVar2.f243295d = ecVar2.v0();
                uVar2.f243296e = ecVar2.A0();
                uVar2.f243297f = ecVar2.u0();
                if (ecVar2.z0() == 1) {
                    rVar2.f243279b += ecVar2.y0();
                    uVar2.f243294c += ecVar2.y0();
                    ((java.util.ArrayList) rVar2.f243281d).add(uVar2);
                } else {
                    rVar2.f243278a -= ecVar2.y0();
                    uVar2.f243294c -= ecVar2.y0();
                    ((java.util.ArrayList) rVar2.f243280c).add(uVar2);
                }
            }
            rVar = rVar2;
        }
        java.util.List list = rVar.f243281d;
        if (this.f180470f < 0) {
            list = rVar.f243280c;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ft4.r0 r0Var = new ft4.r0(context, list);
        r0Var.f266681f = this.f180475n;
        java.lang.String str = this.f180468d;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        r0Var.f266682g = str;
        java.lang.String str2 = this.f180469e;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        r0Var.f266683h = str2;
        r0Var.f266684i = this.f180471g;
        r0Var.f266685m = this.f180472h;
        r0Var.f266686n = this.f180473i;
        r0Var.f266687o = this.f180470f;
        r0Var.f266689q = new ft4.j1(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f180478q;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
        recyclerView.setAdapter(r0Var);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f180478q;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f180478q;
        if (recyclerView3 != null) {
            recyclerView3.i(new ft4.k1(this));
        } else {
            kotlin.jvm.internal.o.o("detailListView");
            throw null;
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void showLoading() {
        android.app.Dialog dialog = this.f180477p;
        if (dialog == null) {
            this.f180477p = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.ggd), false, true, this.f180481t);
            return;
        }
        kotlin.jvm.internal.o.d(dialog);
        if (dialog.isShowing()) {
            return;
        }
        android.app.Dialog dialog2 = this.f180477p;
        kotlin.jvm.internal.o.d(dialog2);
        dialog2.show();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(or4.h.class);
    }
}
