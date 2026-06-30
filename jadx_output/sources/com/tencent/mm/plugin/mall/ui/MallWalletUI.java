package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class MallWalletUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f148314q = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f148315d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f148316e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f148317f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f148318g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yj6 f148319h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f148320i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Dialog f148321m;

    /* renamed from: n, reason: collision with root package name */
    public ef3.p f148322n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f148323o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f148324p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TableCellClickEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.mall.ui.MallWalletUI.1
        {
            this.__eventId = 1699303474;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.TableCellClickEvent tableCellClickEvent) {
            am.my myVar;
            com.tencent.mm.autogen.events.TableCellClickEvent tableCellClickEvent2 = tableCellClickEvent;
            if (tableCellClickEvent2 == null || (myVar = tableCellClickEvent2.f54881g) == null || !com.tencent.mm.sdk.platformtools.t8.D0(myVar.f7377a, "fqf_cell")) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "%s click", myVar.f7377a);
            int i17 = com.tencent.mm.plugin.mall.ui.MallWalletUI.f148314q;
            com.tencent.mm.plugin.mall.ui.MallWalletUI.this.getClass();
            return false;
        }
    };

    public final void U6(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "do query wechat wallet");
        if (z18) {
            this.f148321m = com.tencent.mm.wallet_core.ui.b2.e(this, false, false, null);
        }
        ef3.q.a(this.f148322n, true, z17, 0);
    }

    public final void V6(boolean z17) {
        r45.rl6 rl6Var;
        r45.yj6 yj6Var = this.f148319h;
        if (yj6Var != null) {
            r45.nt4 nt4Var = yj6Var.f391159d;
            int i17 = 0;
            if (nt4Var != null) {
                setMMTitle(com.tencent.mm.plugin.wallet_core.utils.z1.e(this, nt4Var.f381660d, null));
                r45.ot4 ot4Var = nt4Var.f381662f;
                com.tencent.mm.plugin.mall.ui.w2 w2Var = new com.tencent.mm.plugin.mall.ui.w2(this);
                if (ot4Var != null && ot4Var.f382509f == 2 && (rl6Var = ot4Var.f382508e) != null) {
                    addTextOptionMenu(0, com.tencent.mm.plugin.wallet_core.utils.z1.e(this, rl6Var, null).toString(), new com.tencent.mm.plugin.wallet_core.utils.o1(ot4Var, w2Var, this));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "section size: %s", this.f148319h.f391160e);
            int childCount = this.f148317f.getChildCount();
            int size = this.f148319h.f391160e.size();
            com.tencent.mm.plugin.mall.ui.u2 u2Var = new com.tencent.mm.plugin.mall.ui.u2(this);
            com.tencent.mm.plugin.mall.ui.v2 v2Var = new com.tencent.mm.plugin.mall.ui.v2(this);
            for (int i18 = 0; i18 < size; i18++) {
                r45.e14 e14Var = (r45.e14) this.f148319h.f391160e.get(i18);
                if (i18 < childCount) {
                    ((com.tencent.mm.plugin.mall.ui.MallWalletSectionView) this.f148317f.getChildAt(i18)).a(e14Var, z17, u2Var, v2Var);
                } else {
                    com.tencent.mm.plugin.mall.ui.MallWalletSectionView mallWalletSectionView = new com.tencent.mm.plugin.mall.ui.MallWalletSectionView(getContext());
                    mallWalletSectionView.a(e14Var, z17, u2Var, v2Var);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = f148314q;
                    mallWalletSectionView.setLayoutParams(layoutParams);
                    this.f148317f.addView(mallWalletSectionView, layoutParams);
                }
            }
            if (childCount > size) {
                this.f148317f.removeViews(size, childCount - size);
            }
            java.util.LinkedList<r45.rl6> linkedList = this.f148319h.f391161f;
            if (linkedList == null || linkedList.isEmpty()) {
                return;
            }
            this.f148318g.removeAllViews();
            linkedList.size();
            for (r45.rl6 rl6Var2 : linkedList) {
                android.widget.TextView textView = new android.widget.TextView(this);
                com.tencent.mm.plugin.wallet_core.utils.z1.k(textView, rl6Var2, new com.tencent.mm.plugin.mall.ui.x2(this), java.lang.Boolean.FALSE);
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                if (i17 != 0) {
                    layoutParams2.topMargin = i65.a.b(this, 8);
                }
                this.f148318g.addView(textView, layoutParams2);
                i17++;
            }
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi() && i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG") || obj.equals("USERINFO_NEW_LQT_LONG")) {
                V6(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bww;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f148317f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.k2u);
        this.f148318g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.k2t);
        this.f148315d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f148316e = wcPayBannerView;
        wcPayBannerView.a();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletUI", "requestCode: %s, resultCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 65281 || i17 == 65286) {
            return;
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478869jf));
        hideActionbarLine();
        setMMTitle("");
        initView();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().a(this);
        this.f148322n = new com.tencent.mm.plugin.mall.ui.t2(this);
        U6(true, true);
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = new com.tencent.mm.autogen.events.WalletGetBulletinEvent();
        am.i10 i10Var = walletGetBulletinEvent.f54955g;
        i10Var.f6893a = "1";
        i10Var.f6894b = new com.tencent.mm.plugin.mall.ui.y2(this, walletGetBulletinEvent);
        walletGetBulletinEvent.e();
        this.f148324p.alive();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f148324p.dead();
        ((java.util.ArrayList) ef3.q.f252427b).remove(this.f148322n);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().e(this);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6(false, false);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.mall.ui.z2.class);
    }
}
