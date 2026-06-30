package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyMyRecordUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.sdk.platformtools.f7 {
    public static final /* synthetic */ int I = 0;
    public java.lang.String C;
    public com.tencent.mm.ui.widget.dialog.j0 H;

    /* renamed from: g, reason: collision with root package name */
    public int f146154g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f146155h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f146156i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146157m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146158n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f146159o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f146160p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f146161q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f146162r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f146163s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f146164t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f146165u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.i6 f146166v;

    /* renamed from: w, reason: collision with root package name */
    public int f146167w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f146168x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f146169y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Map f146170z = new java.util.HashMap();
    public boolean A = true;
    public boolean B = false;
    public int D = -1;
    public java.util.List E = new java.util.ArrayList();
    public java.lang.String F = "";
    public java.lang.String G = "";

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        java.util.List list = luckyMoneyMyRecordUI.f146168x;
        if (list != null) {
            ((java.util.LinkedList) list).clear();
        }
        java.util.Map map = luckyMoneyMyRecordUI.f146170z;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        luckyMoneyMyRecordUI.f146167w = 0;
        java.util.ArrayList arrayList = luckyMoneyMyRecordUI.f146169y;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void W6() {
        this.B = true;
        int i17 = this.f146167w;
        if (i17 == 0) {
            this.F = "";
        }
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.a6(11, i17, this.f146154g, this.C, "v1.0", this.F));
    }

    public final void X6() {
        this.f146163s.setVisibility(8);
        android.view.View findViewById = this.f146165u.findViewById(com.tencent.mm.R.id.j2w);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f146154g == 1) {
            setMMTitle(getString(com.tencent.mm.R.string.gly));
            com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146157m, getString(com.tencent.mm.R.string.gnn, c01.z1.l()));
            this.f146160p.setText(com.tencent.mm.R.string.gns);
            this.f146166v = new com.tencent.mm.plugin.luckymoney.ui.a7(getContext());
            this.f146163s.setVisibility(0);
        } else {
            setMMTitle(getString(com.tencent.mm.R.string.glw));
            com.tencent.mm.plugin.luckymoney.model.m5.E(getContext(), this.f146157m, getString(com.tencent.mm.R.string.gnb, c01.z1.l()));
            this.f146160p.setText(com.tencent.mm.R.string.gnc);
            this.f146166v = new com.tencent.mm.plugin.luckymoney.ui.h6(getContext());
            android.view.View findViewById2 = this.f146165u.findViewById(com.tencent.mm.R.id.j2w);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyMyRecordUI", "setViewData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f146155h.setAdapter((android.widget.ListAdapter) this.f146166v);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f146156i, c01.z1.r(), 0.0f);
        android.widget.TextView textView = this.f146162r;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.C;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        textView.setText(getString(com.tencent.mm.R.string.gnd, objArr));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.j6(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.luckymoney.ui.m6(this));
        this.f146164t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485795j33);
        this.f146155h = (com.tencent.mm.ui.base.MMLoadMoreListView) findViewById(com.tencent.mm.R.id.f485798j36);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.buo, (android.view.ViewGroup) null);
        this.f146165u = inflate;
        this.f146155h.addHeaderView(inflate);
        this.f146156i = (android.widget.ImageView) this.f146165u.findViewById(com.tencent.mm.R.id.j2q);
        this.f146157m = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2t);
        this.f146158n = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2p);
        this.f146159o = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2u);
        this.f146160p = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2v);
        this.f146161q = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2r);
        this.f146162r = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2y);
        this.f146163s = (android.widget.TextView) this.f146165u.findViewById(com.tencent.mm.R.id.j2x);
        this.f146155h.setOnItemClickListener(new com.tencent.mm.plugin.luckymoney.ui.n6(this));
        this.f146155h.setOnItemLongClickListener(new com.tencent.mm.plugin.luckymoney.ui.p6(this));
        this.f146155h.setOnLoadMoreListener(new com.tencent.mm.plugin.luckymoney.ui.q6(this));
        this.f146156i.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.r6(this));
        X6();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479360xf));
        setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f479349x3));
        this.f146154g = getIntent().getIntExtra("key_type", 2);
        initView();
        W6();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(this.f146154g == 1 ? 8 : 9), 0, 0, 0, 1);
        gb3.p.f270042a.a(15);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.H;
        if (j0Var != null && j0Var.isShowing()) {
            this.H.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(getContext(), this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(getContext(), this);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.a6) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "get record list success");
                com.tencent.mm.plugin.luckymoney.model.a6 a6Var = (com.tencent.mm.plugin.luckymoney.model.a6) m1Var;
                java.util.LinkedList linkedList = a6Var.f145165h.f145477m;
                this.F = a6Var.f145168n;
                this.G = a6Var.f145169o;
                if (this.f146167w == 0) {
                    this.E = a6Var.f145166i;
                    this.C = a6Var.f145167m;
                    android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485792j30);
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j2z);
                    if (((java.util.ArrayList) this.E).size() > 1) {
                        imageView.setVisibility(0);
                        findViewById.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.s6(this));
                    }
                    this.f146162r.setText(getString(com.tencent.mm.R.string.gnd, this.C));
                }
                com.tencent.mm.plugin.luckymoney.model.n4 n4Var = a6Var.f145165h;
                if (n4Var != null) {
                    if (this.f146154g == 1) {
                        this.f146158n.setText(com.tencent.mm.wallet_core.ui.r1.o(n4Var.f145474g / 100.0d));
                        java.lang.String str2 = n4Var.f145473f + "";
                        java.lang.String string = getString(com.tencent.mm.R.string.gnr, str2);
                        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(getResources().getColor(com.tencent.mm.R.color.f479347x2));
                        int indexOf = string.indexOf(str2);
                        android.text.SpannableString spannableString = new android.text.SpannableString(string);
                        spannableString.setSpan(foregroundColorSpan, indexOf, str2.length() + indexOf, 33);
                        this.f146163s.setText(spannableString);
                    } else {
                        this.f146158n.setText(com.tencent.mm.wallet_core.ui.r1.o(n4Var.f145472e / 100.0d));
                        this.f146159o.setText(n4Var.f145471d + "");
                        this.f146161q.setText(n4Var.f145475h + "");
                    }
                }
                java.util.List list = this.f146168x;
                if (linkedList != null) {
                    for (int i19 = 0; i19 < linkedList.size(); i19++) {
                        com.tencent.mm.plugin.luckymoney.model.o4 o4Var = (com.tencent.mm.plugin.luckymoney.model.o4) linkedList.get(i19);
                        ((java.util.LinkedList) list).add((com.tencent.mm.plugin.luckymoney.model.o4) linkedList.get(i19));
                        this.f146169y.add(o4Var.f145509t);
                        java.util.HashMap hashMap = (java.util.HashMap) this.f146170z;
                        if (!hashMap.containsKey(o4Var.f145509t)) {
                            hashMap.put(o4Var.f145509t, 1);
                        }
                    }
                    this.f146167w += linkedList.size();
                    com.tencent.mm.plugin.luckymoney.model.n4 n4Var2 = a6Var.f145165h;
                    this.A = n4Var2 == null || n4Var2.f145476i == 1;
                    this.B = false;
                    com.tencent.mm.plugin.luckymoney.ui.i6 i6Var = this.f146166v;
                    if (list == null) {
                        i6Var.getClass();
                        i6Var.f147017d = new java.util.LinkedList();
                    } else {
                        i6Var.f147017d = list;
                    }
                    i6Var.notifyDataSetChanged();
                }
                if (list == null || ((java.util.LinkedList) list).size() == 0) {
                    this.f146164t.setVisibility(0);
                } else {
                    this.f146164t.setVisibility(8);
                }
                if (this.A) {
                    this.f146155h.g();
                } else {
                    this.f146155h.b();
                }
                return true;
            }
            this.G = null;
        } else if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.b6) {
            int i27 = this.D;
            this.D = -1;
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.luckymoney.model.o4 item = this.f146166v.getItem(i27);
                if (item != null) {
                    dp.a.makeText(this, com.tencent.mm.R.string.glk, 0).show();
                    this.f146166v.f147017d.remove(item);
                    this.f146166v.notifyDataSetChanged();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyMyRecordUI", "can't found local record");
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.v6.class);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMyRecordUI", "onScreenShot");
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f146169y);
        int i17 = this.f146154g;
        if (i17 == 1) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_record_send_page", linkedList, 0);
        } else if (i17 == 2) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_record_receive_page", linkedList, 0);
        }
    }
}
