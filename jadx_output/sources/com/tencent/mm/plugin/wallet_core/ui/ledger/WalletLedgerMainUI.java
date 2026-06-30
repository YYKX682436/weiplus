package com.tencent.mm.plugin.wallet_core.ui.ledger;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class WalletLedgerMainUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {
    public androidx.recyclerview.widget.RecyclerView A;
    public android.view.View B;
    public android.widget.TextView C;
    public ft4.u D;

    /* renamed from: e, reason: collision with root package name */
    public int f180429e;

    /* renamed from: f, reason: collision with root package name */
    public int f180430f;

    /* renamed from: g, reason: collision with root package name */
    public int f180431g;

    /* renamed from: h, reason: collision with root package name */
    public int f180432h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f180434m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.k f180435n;

    /* renamed from: p, reason: collision with root package name */
    public int f180437p;

    /* renamed from: r, reason: collision with root package name */
    public ft4.u1 f180439r;

    /* renamed from: s, reason: collision with root package name */
    public gt4.s0 f180440s;

    /* renamed from: u, reason: collision with root package name */
    public ft4.i f180442u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.Dialog f180443v;

    /* renamed from: w, reason: collision with root package name */
    public dt4.p f180444w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f180445x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f180446y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f180447z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180428d = "";

    /* renamed from: i, reason: collision with root package name */
    public int f180433i = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f180436o = 2;

    /* renamed from: q, reason: collision with root package name */
    public int f180438q = 1;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f180441t = new java.util.ArrayList();
    public final ft4.x E = new ft4.x(this);
    public final ft4.h0 F = new ft4.h0(this);
    public final ft4.c0 G = new ft4.c0(this);
    public final android.content.DialogInterface.OnCancelListener H = new ft4.w(this);

    public static final void U6(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI, int i17) {
        java.util.Collection collection;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 7, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        if (walletLedgerMainUI.f180440s == null) {
            androidx.appcompat.app.AppCompatActivity context = walletLedgerMainUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gt4.s0 s0Var = new gt4.s0(context);
            walletLedgerMainUI.f180440s = s0Var;
            com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = s0Var.f275541n;
            if (customDatePickerNew == null) {
                kotlin.jvm.internal.o.o("datePicker");
                throw null;
            }
            customDatePickerNew.f212200o = false;
            customDatePickerNew.f212201p = true;
            customDatePickerNew.f212202q = true;
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date());
            kotlin.jvm.internal.o.d(format);
            java.util.List g17 = new r26.t("-").g(format, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            gt4.s0 s0Var2 = walletLedgerMainUI.f180440s;
            kotlin.jvm.internal.o.d(s0Var2);
            s0Var2.h(com.tencent.mm.sdk.platformtools.t8.D1(strArr[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[2], 0));
            gt4.s0 s0Var3 = walletLedgerMainUI.f180440s;
            kotlin.jvm.internal.o.d(s0Var3);
            s0Var3.g(com.tencent.mm.sdk.platformtools.t8.D1(strArr[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[1], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[2], 0));
            if (walletLedgerMainUI.f180431g > 0) {
                gt4.s0 s0Var4 = walletLedgerMainUI.f180440s;
                kotlin.jvm.internal.o.d(s0Var4);
                int i18 = walletLedgerMainUI.f180431g;
                s0Var4.i(i18 / 10000, (i18 % 10000) / 100, 1);
            } else {
                gt4.s0 s0Var5 = walletLedgerMainUI.f180440s;
                kotlin.jvm.internal.o.d(s0Var5);
                s0Var5.i(com.tencent.mm.sdk.platformtools.t8.D1(strArr[0], 0), com.tencent.mm.sdk.platformtools.t8.D1(strArr[1], 0), 1);
            }
            if (i17 > 0) {
                gt4.s0 s0Var6 = walletLedgerMainUI.f180440s;
                kotlin.jvm.internal.o.d(s0Var6);
                s0Var6.g(i17 / 10000, (i17 % 10000) / 100, i17 % 100);
            }
            gt4.s0 s0Var7 = walletLedgerMainUI.f180440s;
            kotlin.jvm.internal.o.d(s0Var7);
            s0Var7.L = new ft4.i0(walletLedgerMainUI);
        }
        if (walletLedgerMainUI.f180431g > 0) {
            gt4.s0 s0Var8 = walletLedgerMainUI.f180440s;
            kotlin.jvm.internal.o.d(s0Var8);
            int i19 = walletLedgerMainUI.f180431g;
            s0Var8.i(i19 / 10000, (i19 % 10000) / 100, 1);
        }
        if (i17 > 0) {
            gt4.s0 s0Var9 = walletLedgerMainUI.f180440s;
            kotlin.jvm.internal.o.d(s0Var9);
            s0Var9.g(i17 / 10000, (i17 % 10000) / 100, i17 % 100);
        }
        gt4.s0 s0Var10 = walletLedgerMainUI.f180440s;
        kotlin.jvm.internal.o.d(s0Var10);
        s0Var10.l();
    }

    public final int V6(java.util.List list, java.util.List list2) {
        ft4.k kVar = list2.isEmpty() ? null : ((ft4.j) kz5.n0.i0(list2)).f266632b;
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            dt4.t tVar = (dt4.t) it.next();
            ft4.k kVar2 = new ft4.k();
            kVar2.f266636a = this.f180438q;
            kVar2.f266637b = tVar.f243287a;
            kVar2.f266638c = tVar.f243288b;
            kVar2.f266640e = tVar.f243289c;
            kVar2.f266639d = tVar.f243290d;
            int i18 = kVar != null ? kVar.f266642g : 0;
            kVar2.f266641f = i18;
            java.util.LinkedHashMap linkedHashMap = tVar.f243291e;
            kVar2.f266642g = i18 + linkedHashMap.size() + 1;
            i17 += linkedHashMap.size() + 1;
            list2.add(new ft4.j(1, kVar2, null));
            java.util.Iterator it6 = kz5.b1.g(linkedHashMap, new ft4.v()).entrySet().iterator();
            while (it6.hasNext()) {
                list2.add(new ft4.j(2, kVar2, (dt4.q) ((java.util.Map.Entry) it6.next()).getValue()));
            }
            kVar = kVar2;
        }
        return i17;
    }

    public final void W6(int i17) {
        java.util.List list = this.f180441t;
        if (i17 >= ((java.util.ArrayList) list).size() || i17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerMainUI", "jumpToIndex invalid index:" + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "jumpToIndex index:" + i17);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "jumpToIndex", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "jumpToIndex", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        ft4.k kVar = ((ft4.j) ((java.util.ArrayList) list).get(i17)).f266632b;
        this.f180435n = kVar;
        ft4.u uVar = this.D;
        if (uVar == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        kotlin.jvm.internal.o.d(kVar);
        int i18 = kVar.f266637b;
        ft4.k kVar2 = this.f180435n;
        kotlin.jvm.internal.o.d(kVar2);
        int i19 = kVar2.f266638c;
        ft4.k kVar3 = this.f180435n;
        kotlin.jvm.internal.o.d(kVar3);
        long j17 = kVar3.f266639d;
        ft4.k kVar4 = this.f180435n;
        kotlin.jvm.internal.o.d(kVar4);
        uVar.b(i18, i19, j17, kVar4.f266640e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0423, code lost:
    
        r2 = r36.f180446y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0427, code lost:
    
        if (r2 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0429, code lost:
    
        r2.setVisibility(0);
        r2 = r36.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x042f, code lost:
    
        if (r2 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0431, code lost:
    
        r2.setVisibility(8);
        r2 = r36.f180447z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0436, code lost:
    
        if (r2 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0438, code lost:
    
        r2.setVisibility(0);
        r4.clear();
        r2 = new ft4.k();
        r2.f266636a = r36.f180438q;
        r1 = r37 * 100;
        r2.f266637b = r1 + 1;
        r2.f266638c = r1 + 31;
        r4.add(new ft4.j(1, r2, null));
        r36.f180435n = r2;
        r1 = r36.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x045f, code lost:
    
        if (r1 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0461, code lost:
    
        r2 = new java.util.ArrayList();
        r3 = zj0.c.f473285a;
        r2.add(0);
        java.util.Collections.reverse(r2);
        yj0.a.d(r1, r2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "updateRecyclerView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r2.get(0)).intValue());
        yj0.a.f(r1, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "updateRecyclerView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r2 = r36.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04a5, code lost:
    
        if (r2 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04a7, code lost:
    
        r2.f266699c = r36.f180438q;
        r1 = r36.f180435n;
        kotlin.jvm.internal.o.d(r1);
        r3 = r1.f266637b;
        r1 = r36.f180435n;
        kotlin.jvm.internal.o.d(r1);
        r4 = r1.f266638c;
        r1 = r36.f180435n;
        kotlin.jvm.internal.o.d(r1);
        r5 = r1.f266639d;
        r1 = r36.f180435n;
        kotlin.jvm.internal.o.d(r1);
        r2.b(r3, r4, r5, r1.f266640e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04cc, code lost:
    
        kotlin.jvm.internal.o.o("header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04d0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04d1, code lost:
    
        kotlin.jvm.internal.o.o(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04d6, code lost:
    
        kotlin.jvm.internal.o.o(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04db, code lost:
    
        kotlin.jvm.internal.o.o(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04e0, code lost:
    
        kotlin.jvm.internal.o.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03de, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "scrollToPosition total:" + r4.size() + " selectMonth:" + r37 + " targetIndex:" + r2 + " lastTradeMonth:" + r36.f180433i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x040e, code lost:
    
        if (r2 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0410, code lost:
    
        r1 = r36.f180447z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0412, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0414, code lost:
    
        r1.setVisibility(8);
        W6(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04ca, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x041e, code lost:
    
        kotlin.jvm.internal.o.o(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0422, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(int r37) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI.X6(int):void");
    }

    public final void Y6(int i17) {
        int i18 = this.f180436o;
        if (i18 == 1) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                textView.setText(getContext().getString(com.tencent.mm.R.string.m2m));
                return;
            } else {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
        }
        if (i18 != 2) {
            return;
        }
        android.widget.TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setText(getContext().getString(com.tencent.mm.R.string.m2l));
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489622de3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void hideLoading() {
        android.app.Dialog dialog = this.f180443v;
        if (dialog != null) {
            kotlin.jvm.internal.o.d(dialog);
            if (dialog.isShowing()) {
                android.app.Dialog dialog2 = this.f180443v;
                kotlin.jvm.internal.o.d(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int u17 = com.tencent.mm.wallet_core.ui.r1.u(0L, "yyyyMM");
        int i17 = u17 * 100;
        this.f180429e = i17 + 1;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(u17 / 100, (u17 % 100) - 1, 1);
        this.f180430f = i17 + calendar.getActualMaximum(5);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.pym);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(this.E);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.pyo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f180445x = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485529py5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f180446y = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q2v);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.A = (androidx.recyclerview.widget.RecyclerView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.qxw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f180447z = textView;
        textView.setOnClickListener(new ft4.z(this));
        android.widget.TextView textView2 = this.f180447z;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("lastMonthBtn");
            throw null;
        }
        com.tencent.mm.wallet_core.ui.r1.d(textView2);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.qxx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById6;
        this.C = textView3;
        com.tencent.mm.wallet_core.ui.r1.d(textView3);
        android.widget.TextView textView4 = this.C;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
        textView4.setOnClickListener(new ft4.a0(this));
        Y6(this.f180436o);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.q2n);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.B = findViewById7;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View view = this.B;
        if (view == null) {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
        ft4.u uVar = new ft4.u(context, view);
        this.D = uVar;
        uVar.a(new ft4.b0(this));
        ft4.u uVar2 = this.D;
        if (uVar2 == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        uVar2.f266699c = this.f180438q;
        android.view.View view2 = this.B;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478869jf));
        hideActionbarLine();
        setMMTitle(getResources().getString(com.tencent.mm.R.string.f493540lh0));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f180428d = stringExtra;
        initView();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        dt4.p a17 = dt4.p.f243266f.a(this.f180428d);
        this.f180444w = a17;
        a17.p(new ft4.y(weakReference));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void showLoading() {
        android.app.Dialog dialog = this.f180443v;
        if (dialog == null) {
            this.f180443v = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.ggd), false, true, this.H);
            return;
        }
        kotlin.jvm.internal.o.d(dialog);
        if (dialog.isShowing()) {
            return;
        }
        android.app.Dialog dialog2 = this.f180443v;
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
