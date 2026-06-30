package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyHistoryEnvelopeUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int C = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f146120d;

    /* renamed from: e, reason: collision with root package name */
    public int f146121e;

    /* renamed from: f, reason: collision with root package name */
    public int f146122f;

    /* renamed from: g, reason: collision with root package name */
    public int f146123g;

    /* renamed from: h, reason: collision with root package name */
    public int f146124h;

    /* renamed from: i, reason: collision with root package name */
    public int f146125i;

    /* renamed from: m, reason: collision with root package name */
    public int f146126m;

    /* renamed from: n, reason: collision with root package name */
    public int f146127n;

    /* renamed from: o, reason: collision with root package name */
    public int f146128o;

    /* renamed from: p, reason: collision with root package name */
    public int f146129p;

    /* renamed from: q, reason: collision with root package name */
    public int f146130q;

    /* renamed from: r, reason: collision with root package name */
    public int f146131r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f146132s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f146133t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f146134u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f146135v;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f146138y;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f146136w = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f146137x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f146139z = true;
    public java.lang.String A = "";
    public boolean B = true;

    public final void T6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do get show source: %s", java.lang.Boolean.valueOf(this.f146139z));
        if (!this.f146139z) {
            this.f146133t.N(0);
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.n0 g17 = com.tencent.mm.plugin.luckymoney.model.n0.g();
        com.tencent.mm.ui.widget.dialog.u3 O = !z17 ? db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.m4(this, g17)) : null;
        g17.f213885c = new com.tencent.mm.plugin.luckymoney.model.h(this.A, 2);
        g17.c(new com.tencent.mm.plugin.luckymoney.ui.n4(this, O), true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f146132s = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f485785j20);
        this.f146133t = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById(com.tencent.mm.R.id.f485665ij4);
        this.f146134u = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f485666ij5);
        this.f146133t.setEnableRefresh(false);
        this.f146133t.setActionCallback(new com.tencent.mm.plugin.luckymoney.ui.b5(this));
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(getContext(), 2);
        gridLayoutManager.B = new com.tencent.mm.plugin.luckymoney.ui.c5(this, gridLayoutManager);
        this.f146134u.setLayoutManager(gridLayoutManager);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.4
            @Override // in5.s
            public in5.r getItemConvert(int i17) {
                return i17 == 1 ? new com.tencent.mm.plugin.luckymoney.ui.t5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.this) : new com.tencent.mm.plugin.luckymoney.ui.v5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.this);
            }
        }, this.f146136w, false);
        this.f146135v = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.luckymoney.ui.d5(this);
        wxRecyclerAdapter.f293104n = new com.tencent.mm.plugin.luckymoney.ui.e5(this);
        this.f146134u.setAdapter(wxRecyclerAdapter);
        this.f146134u.N(new com.tencent.mm.plugin.luckymoney.ui.f5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        hideActionbarLine();
        setMMTitle(getString(com.tencent.mm.R.string.gka));
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.y4(this));
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_history_close_switch, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigHistory：%s ", java.lang.Boolean.valueOf(fj6));
        this.B = fj6;
        this.f146138y = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        getWindow().getDecorView().post(new com.tencent.mm.plugin.luckymoney.ui.a5(this));
        initView();
        T6(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
