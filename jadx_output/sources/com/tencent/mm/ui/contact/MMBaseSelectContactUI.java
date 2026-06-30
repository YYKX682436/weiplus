package com.tencent.mm.ui.contact;

@gm0.a2
@java.lang.Deprecated
/* loaded from: classes11.dex */
public abstract class MMBaseSelectContactUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.pluginsdk.ui.b2, android.widget.AdapterView.OnItemClickListener, db5.o9, com.tencent.mm.ui.tools.b9, com.tencent.mm.pluginsdk.ui.c2, com.tencent.mm.ui.contact.l4, com.tencent.mm.pluginsdk.ui.a2 {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f206446d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.AlphabetScrollBar f206447e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.contact.a5 f206448f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.contact.o4 f206449g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.MultiSelectContactView f206450h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f206451i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f206452m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f206453n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f206454o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f206455p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f206456q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f206457r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f206458s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f206459t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f206460u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.contact.LabelContainerView f206461v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTagPanel f206462w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f206463x = true;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f206464y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f206465z = new java.util.HashSet();

    public static void V6(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI) {
        android.widget.TextView textView;
        mMBaseSelectContactUI.s7();
        android.view.View view = mMBaseSelectContactUI.f206458s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setNoResultStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.sdk.platformtools.t8.K0(mMBaseSelectContactUI.c7())) {
            return;
        }
        android.widget.TextView textView2 = mMBaseSelectContactUI.f206459t;
        if (textView2 != null) {
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            java.lang.String string = mMBaseSelectContactUI.getString(com.tencent.mm.R.string.icq);
            java.lang.String string2 = mMBaseSelectContactUI.getString(com.tencent.mm.R.string.icp);
            java.lang.String c76 = mMBaseSelectContactUI.c7();
            textView2.setText(o13.q.d(string, string2, p13.i.a(c76, c76, false, false)).f351105a);
            java.lang.String stringExtra = mMBaseSelectContactUI.getIntent().getStringExtra("no_result_tip");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (textView = mMBaseSelectContactUI.f206460u) != null) {
                textView.setVisibility(0);
                mMBaseSelectContactUI.f206460u.setText(stringExtra);
            }
        }
        android.widget.TextView textView3 = mMBaseSelectContactUI.f206459t;
        textView3.announceForAccessibility(textView3.getText().toString());
        mMBaseSelectContactUI.f206446d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s7() {
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "setInitStatus");
        r7(this.f206446d, 0);
        com.tencent.mm.ui.contact.a5 a5Var = this.f206448f;
        if (a5Var != null) {
            this.f206446d.setAdapter((android.widget.ListAdapter) a5Var);
            this.f206448f.notifyDataSetChanged();
        } else {
            if (a5Var == null) {
                this.f206448f = Z6();
            }
            this.f206446d.setAdapter((android.widget.ListAdapter) this.f206448f);
        }
        if (m7() && (alphabetScrollBar = this.f206447e) != null) {
            alphabetScrollBar.setVisibility(0);
        }
        android.view.View view = this.f206458s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f206446d.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.c2
    public void J3(boolean z17) {
        if (n7()) {
            v7();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b2
    public void L(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "onSearchTextChange: text=%s", str);
        if (n7()) {
            v7();
        }
        if (this.f206449g != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f206449g.s(str, d7(), o7());
                return;
            }
            this.f206449g.r();
            this.f206449g.notifyDataSetChanged();
            s7();
        }
    }

    public void M3(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        return this.f206446d;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.ui.tools.o3 o3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "onSearchChange: searchText=%s", str);
        if (n7()) {
            com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
            if (c9Var != null && (o3Var = c9Var.f210323h) != null) {
                o3Var.d();
            }
            v7();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f206449g.s(str, d7(), o7());
            return;
        }
        this.f206449g.r();
        this.f206449g.notifyDataSetChanged();
        s7();
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        int t17;
        android.widget.ListAdapter adapter = this.f206446d.getAdapter();
        if (adapter instanceof android.widget.HeaderViewListAdapter) {
            adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        com.tencent.mm.ui.contact.a5 a5Var = this.f206448f;
        if (adapter != a5Var || a5Var == null) {
            com.tencent.mm.ui.contact.o4 o4Var = this.f206449g;
            t17 = adapter == o4Var ? o4Var.t(str) : 0;
        } else {
            t17 = a5Var.r(str);
        }
        if (t17 == 0) {
            this.f206446d.setSelection(0);
            return;
        }
        if (t17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "Select unkown head selectPosition=%d | header=%s", java.lang.Integer.valueOf(t17), str);
            return;
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView == null) {
            this.f206446d.setSelection(t17);
        } else {
            this.f206446d.setSelectionFromTop(t17, multiSelectContactView.getMeasuredHeight());
            com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "Select head selectPosition=%d | header=%s | y=%d", java.lang.Integer.valueOf(t17), str, java.lang.Integer.valueOf(this.f206450h.getMeasuredHeight()));
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return null;
    }

    public void W6() {
    }

    public void X6() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
        if (c9Var != null) {
            com.tencent.mm.ui.tools.o3 o3Var = c9Var.f210323h;
            if (o3Var != null ? o3Var.a() : false) {
                this.f206451i.a();
                return;
            }
            return;
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView == null || !multiSelectContactView.hasFocus()) {
            return;
        }
        this.f206450h.clearFocus();
    }

    public void Y6() {
        com.tencent.mm.ui.tools.o3 o3Var;
        com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
        if (c9Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(c9Var.g()) && (o3Var = this.f206451i.f210323h) != null) {
            o3Var.g(true);
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView == null || com.tencent.mm.sdk.platformtools.t8.K0(multiSelectContactView.getSearchContent())) {
            return;
        }
        this.f206450h.c();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.ui.tools.b9
    public void Z2() {
        s7();
        if (n7()) {
            v7();
        }
        if (l7()) {
            android.view.View view = this.f206452m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206456q.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
            android.view.View view2 = this.f206453n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f206456q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onQuitSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206446d.setVisibility(0);
        }
    }

    public abstract com.tencent.mm.ui.contact.a5 Z6();

    public abstract com.tencent.mm.ui.contact.o4 a7();

    public com.tencent.mm.ui.contact.p4 b7() {
        if (this.f206446d.getHeaderViewsCount() <= 0) {
            if (this.f206446d.getAdapter() instanceof com.tencent.mm.ui.contact.p4) {
                return (com.tencent.mm.ui.contact.p4) this.f206446d.getAdapter();
            }
            return null;
        }
        if (this.f206446d.getAdapter() instanceof android.widget.HeaderViewListAdapter) {
            android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) this.f206446d.getAdapter();
            if (headerViewListAdapter.getWrappedAdapter() instanceof com.tencent.mm.ui.contact.p4) {
                return (com.tencent.mm.ui.contact.p4) headerViewListAdapter.getWrappedAdapter();
            }
        }
        return null;
    }

    public final java.lang.String c7() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
        if (c9Var != null) {
            return c9Var.g();
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        return multiSelectContactView != null ? multiSelectContactView.getSearchContent() : "";
    }

    public int[] d7() {
        return new int[]{131072, 131075, 131081};
    }

    public java.lang.String e7() {
        return "";
    }

    public float f7() {
        return -1.0f;
    }

    public abstract java.lang.String g7();

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1d;
    }

    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
    }

    public void i7() {
        android.view.View view = this.f206452m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "hideTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206456q.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(g7());
        java.lang.String e76 = e7();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e76)) {
            setMMSubTitle(e76);
            if (f7() > 0.0f) {
                setMMSubTitleSize(f7());
            }
        }
        this.f206452m = findViewById(com.tencent.mm.R.id.og6);
        this.f206453n = findViewById(com.tencent.mm.R.id.f487370og0);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mil);
        this.f206446d = listView;
        listView.setVisibility(0);
        if (this.f206448f == null) {
            this.f206448f = Z6();
        }
        this.f206446d.setAdapter((android.widget.ListAdapter) this.f206448f);
        this.f206449g = a7();
        this.f206455p = findViewById(com.tencent.mm.R.id.mqg);
        if (k7()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.kcl);
            this.f206458s = findViewById;
            findViewById.setTag(com.tencent.mm.R.id.nwy, java.lang.Boolean.FALSE);
            this.f206459t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcj);
            this.f206460u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kck);
            this.f206458s.setOnTouchListener(new com.tencent.mm.ui.contact.q4(this));
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = (com.tencent.mm.pluginsdk.ui.MultiSelectContactView) findViewById(com.tencent.mm.R.id.cek);
            this.f206450h = multiSelectContactView;
            multiSelectContactView.measure(android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
            this.f206450h.setOnSearchTextChangeListener(this);
            this.f206450h.setOnSearchTextFouceChangeListener(this);
            this.f206450h.setOnContactDeselectListener(this);
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.a0c, (android.view.ViewGroup) null);
            this.f206457r = inflate;
            this.f206456q = inflate.findViewById(com.tencent.mm.R.id.gxy);
            this.f206446d.addHeaderView(this.f206457r);
            if (l7()) {
                hideActionbarLine();
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = this.f206450h;
                if (multiSelectContactView2 != null) {
                    multiSelectContactView2.setVisibility(8);
                }
                android.view.View view = this.f206452m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f206456q.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
                android.view.View view2 = this.f206453n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
                this.f206451i = c9Var;
                c9Var.f210324i = this;
                c9Var.f210329n = true;
                this.f206452m.setOnClickListener(new com.tencent.mm.ui.contact.r4(this));
                this.f206453n.setOnTouchListener(new com.tencent.mm.ui.contact.s4(this));
                addSearchMenu(true, this.f206451i);
            } else {
                android.view.View view3 = this.f206452m;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f206456q.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
                }
                android.view.View view4 = this.f206453n;
                if (view4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f206450h.setVisibility(0);
            }
        }
        r7(this.f206446d, 0);
        setBackBtn(new com.tencent.mm.ui.contact.t4(this));
        com.tencent.mm.ui.contact.o4 o4Var = this.f206449g;
        if (o4Var != null) {
            o4Var.u(new com.tencent.mm.ui.contact.u4(this));
        }
        this.f206446d.setOnScrollListener(new com.tencent.mm.ui.contact.v4(this));
        this.f206446d.setOnItemClickListener(this);
        if (m7()) {
            com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = (com.tencent.mm.ui.base.AlphabetScrollBar) findViewById(com.tencent.mm.R.id.mio);
            this.f206447e = alphabetScrollBar;
            alphabetScrollBar.setVisibility(0);
            this.f206447e.setOnScrollBarTouchListener(this);
        }
        if (n7()) {
            com.tencent.mm.ui.contact.LabelContainerView labelContainerView = (com.tencent.mm.ui.contact.LabelContainerView) findViewById(com.tencent.mm.R.id.mik);
            this.f206461v = labelContainerView;
            ((android.widget.TextView) labelContainerView.findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.ies);
            com.tencent.mm.ui.base.MMTagPanel mMTagPanel = (com.tencent.mm.ui.base.MMTagPanel) this.f206461v.findViewById(com.tencent.mm.R.id.cee);
            this.f206462w = mMTagPanel;
            mMTagPanel.setTagSelectedBG(com.tencent.mm.R.drawable.f482150b51);
            this.f206462w.setTagSelectedTextColorRes(com.tencent.mm.R.color.a0c);
            this.f206461v.setOnLabelContainerListener(new com.tencent.mm.ui.contact.w4(this));
            this.f206462w.setCallBack(new com.tencent.mm.ui.contact.x4(this));
        }
    }

    public void j7() {
        this.A = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
    }

    public boolean k7() {
        return this.f206449g != null;
    }

    public abstract boolean l7();

    public abstract boolean m7();

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    public boolean n7() {
        return this instanceof com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI;
    }

    public boolean o7() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "onCreate!");
        j7();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "initData done!");
        initView();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "initView done!");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = this.f206447e;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.f197714q = null;
        }
        com.tencent.mm.ui.contact.a5 a5Var = this.f206448f;
        if (a5Var != null) {
            a5Var.k();
        }
        com.tencent.mm.ui.contact.o4 o4Var = this.f206449g;
        if (o4Var != null) {
            o4Var.k();
        }
        db5.d5 d5Var = this.f206454o;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00b9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(android.widget.AdapterView r17, android.view.View r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.MMBaseSelectContactUI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            p7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.d5 d5Var = this.f206454o;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (n7() && this.f206463x) {
            this.f206463x = false;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.z4(this));
        }
    }

    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    public void p7() {
        hideVKB();
        finish();
        W6();
    }

    public void q7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "select label=%s", str);
    }

    public void r7(android.widget.ListView listView, int i17) {
    }

    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    public void t7() {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView == null || (mMEditText = multiSelectContactView.f189797t) == null) {
            return;
        }
        mMEditText.setHintTextColor(multiSelectContactView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        multiSelectContactView.f189797t.setTextColor(multiSelectContactView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
    }

    public void u7(int i17) {
        if (this.f206456q != null) {
            int e17 = i17 == 0 ? com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479727dj) : com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479734dr);
            if (this.f206456q.getHeight() != e17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f206456q.getLayoutParams();
                layoutParams.height = e17;
                this.f206456q.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
        android.view.View view = this.f206453n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "onClickClearText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void v7() {
        boolean hasFocus;
        com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
        if (c9Var != null) {
            com.tencent.mm.ui.tools.o3 o3Var = c9Var.f210323h;
            if (o3Var != null) {
                hasFocus = o3Var.a();
            }
            hasFocus = false;
        } else {
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null) {
                hasFocus = multiSelectContactView.hasFocus();
            }
            hasFocus = false;
        }
        if (!hasFocus || !com.tencent.mm.sdk.platformtools.t8.K0(c7())) {
            com.tencent.mm.ui.contact.LabelContainerView labelContainerView = this.f206461v;
            if (labelContainerView != null) {
                labelContainerView.setVisibility(8);
                return;
            }
            return;
        }
        java.util.List list = this.f206464y;
        if (list == null || list.size() <= 0) {
            this.f206461v.setVisibility(8);
        } else {
            this.f206461v.setVisibility(0);
            this.f206462w.r(null, this.f206464y);
        }
    }
}
