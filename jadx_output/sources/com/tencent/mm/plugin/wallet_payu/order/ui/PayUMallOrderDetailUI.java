package com.tencent.mm.plugin.wallet_payu.order.ui;

/* loaded from: classes9.dex */
public class PayUMallOrderDetailUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181256d = "";

    /* renamed from: e, reason: collision with root package name */
    public r45.x65 f181257e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f181258f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f181259g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f181260h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f181261i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f181262m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f181263n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f181264o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f181265p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f181266q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f181267r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f181268s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f181269t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f181270u;

    public final void U6() {
        r45.x65 x65Var = this.f181257e;
        if (x65Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(x65Var.f389817d)) {
            this.f181258f.setVisibility(8);
        } else {
            this.f181258f.setVisibility(0);
            this.f181264o.setText(this.f181257e.f389817d);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181257e.f389828r)) {
            this.f181259g.setVisibility(8);
        } else {
            this.f181259g.setVisibility(0);
            this.f181265p.setText(this.f181257e.f389828r);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181257e.f389819f)) {
            this.f181260h.setVisibility(8);
        } else {
            this.f181260h.setVisibility(0);
            this.f181266q.setText(this.f181257e.f389819f);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181257e.f389823m)) {
            this.f181261i.setVisibility(8);
        } else {
            this.f181261i.setVisibility(0);
            this.f181267r.setText(com.tencent.mm.wallet_core.ui.r1.n(r3.f389818e / 100.0d, this.f181257e.f389823m));
        }
        if (this.f181257e.f389820g >= 0) {
            this.f181262m.setVisibility(0);
            this.f181268s.setText(com.tencent.mm.wallet_core.ui.r1.p(this.f181257e.f389820g));
        } else {
            this.f181262m.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181257e.f389821h)) {
            this.f181263n.setVisibility(8);
        } else {
            this.f181263n.setVisibility(0);
            this.f181269t.setText(this.f181257e.f389821h);
        }
        int i17 = this.f181257e.f389825o;
        if (i17 == 3) {
            this.f181270u.setText(com.tencent.mm.R.string.kf8);
        } else if (i17 != 5) {
            this.f181270u.setText(com.tencent.mm.R.string.f493597kw3);
        } else {
            this.f181270u.setText(com.tencent.mm.R.string.f493535kn1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489356c93;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX);
        java.lang.String string = getInput().getString("key_trans_id");
        this.f181256d = string;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
            finish();
        }
        doSceneProgress(new wt4.c(this.f181256d));
        this.f181258f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cwi);
        this.f181259g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cvu);
        this.f181260h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f484070cw4);
        this.f181261i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cw9);
        this.f181262m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cwg);
        this.f181263n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cwb);
        this.f181264o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cwj);
        this.f181265p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cvw);
        this.f181266q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484071cw5);
        this.f181267r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cw_);
        this.f181268s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cwh);
        this.f181269t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cwc);
        this.f181270u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cwm);
        U6();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof wt4.c)) {
            return true;
        }
        this.f181257e = ((wt4.c) m1Var).f449535f;
        U6();
        return true;
    }
}
