package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayCardDetailUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f142269f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f142270g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142271h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142272i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f142273m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142274n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142275o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f142276p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tg5 f142277q;

    /* renamed from: r, reason: collision with root package name */
    public int f142278r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142279s;

    public final void V6() {
        r45.cx3 cx3Var = this.f142277q.f386407f;
        if (cx3Var == null) {
            return;
        }
        setMMTitle(cx3Var.f371892p);
        this.f142270g.setText(cx3Var.f371891o);
        int i17 = cx3Var.f371886g;
        if (i17 == 2) {
            this.f142269f.setImageResource(com.tencent.mm.R.raw.icons_outlined_done2);
            this.f142269f.setColorFilter(getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), android.graphics.PorterDuff.Mode.SRC_ATOP);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cx3Var.f371896t)) {
                cx3Var.f371896t = u73.h.j(cx3Var.f371896t, this.f142277q.f386407f.f371884e, -1);
                this.f142271h.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).ij(this, cx3Var.f371896t, (int) this.f142271h.getTextSize(), 1, null));
            }
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485259h25);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485260h26);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.h2c);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i17 == 3) {
            this.f142269f.setImageResource(com.tencent.mm.R.raw.remittance_timed_out);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cx3Var.f371896t)) {
                this.f142271h.setText(cx3Var.f371896t);
            }
            this.f142272i.setText(com.tencent.mm.R.string.fxk);
            this.f142273m.setText(com.tencent.mm.R.string.fxm);
            this.f142274n.setText(u73.h.b(this.f142277q.f386407f.f371887h));
            this.f142275o.setText(u73.h.b(this.f142277q.f386407f.f371888i));
        } else if (i17 == 4) {
            this.f142269f.setImageResource(com.tencent.mm.R.raw.remittance_timed_out);
            int i18 = this.f142277q.f386407f.f371890n;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(cx3Var.f371896t)) {
                this.f142271h.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).hj(this, cx3Var.f371896t, (int) this.f142271h.getTextSize(), 1, null));
            }
            this.f142272i.setText(com.tencent.mm.R.string.fxl);
            this.f142274n.setText(u73.h.b(this.f142277q.f386407f.f371889m));
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.h2c);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f142276p.setBannerData(this.f142277q.f386411m);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjh;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142269f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h2h);
        this.f142270g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h2g);
        this.f142271h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h2f);
        this.f142274n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h28);
        this.f142275o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h2e);
        this.f142272i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h27);
        this.f142273m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h2d);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f142276p = wcPayBannerView;
        wcPayBannerView.a();
        this.f142271h.setClickable(true);
        this.f142271h.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f142261e = com.tencent.mm.R.color.f479235tn;
        super.onCreate(bundle);
        addSceneEndListener(2613);
        this.f142278r = getIntent().getIntExtra("key_scene", 0);
        this.f142279s = getIntent().getStringExtra("key_card_no");
        initView();
        if (this.f142278r == 0) {
            r73.m mVar = new r73.m(this.f142279s);
            mVar.K(this);
            doSceneProgress(mVar, true);
            return;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_qry_response");
        try {
            r45.tg5 tg5Var = new r45.tg5();
            this.f142277q = tg5Var;
            tg5Var.parseFrom(byteArrayExtra);
            V6();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f142260d, e17, "", new java.lang.Object[0]);
            r73.m mVar2 = new r73.m(this.f142279s);
            mVar2.K(this);
            doSceneProgress(mVar2, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2613);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof r73.m)) {
            return true;
        }
        r73.m mVar = (r73.m) m1Var;
        if (mVar.f214031i || mVar.f214032m) {
            return true;
        }
        this.f142277q = mVar.f393178r;
        V6();
        return true;
    }
}
