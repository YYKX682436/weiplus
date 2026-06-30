package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletDigitalCertUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178854d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ScrollView f178855e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f178856f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f178857g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f178858h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178859i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f178860m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f178861n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f178862o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f178863p;

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
        this.f178858h.removeAllViews();
        java.util.Vector vector = com.tencent.mm.wallet_core.model.p1.c().f213982g;
        com.tencent.mm.wallet_core.model.p1 c17 = com.tencent.mm.wallet_core.model.p1.c();
        c17.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.wallet_core.model.p1.b()) && c17.f213976a > 0) {
            this.f178856f.setVisibility(8);
            this.f178857g.setVisibility(0);
            this.f178854d.setText(com.tencent.mm.R.string.f493586ku4);
            if (vector.size() == 0 || vector.size() == 1) {
                this.f178855e.setFillViewport(true);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f178857g.getLayoutParams();
                layoutParams.removeRule(3);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i65.a.b(getContext(), 96);
                this.f178857g.setLayoutParams(layoutParams);
            } else {
                this.f178855e.setFillViewport(false);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f178857g.getLayoutParams();
                layoutParams2.removeRule(12);
                layoutParams2.addRule(3, com.tencent.mm.R.id.be_);
                layoutParams2.topMargin = i65.a.b(getContext(), 48);
                layoutParams2.bottomMargin = i65.a.b(getContext(), 64);
                this.f178857g.setLayoutParams(layoutParams2);
            }
        } else {
            this.f178856f.setVisibility(0);
            this.f178857g.setVisibility(8);
            this.f178854d.setText(com.tencent.mm.R.string.kts);
            if (vector.size() == 0) {
                this.f178855e.setFillViewport(true);
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f178856f.getLayoutParams();
                layoutParams3.removeRule(3);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = i65.a.b(getContext(), 96);
                this.f178856f.setLayoutParams(layoutParams3);
            } else {
                this.f178855e.setFillViewport(false);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) this.f178856f.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(3, com.tencent.mm.R.id.be_);
                layoutParams4.topMargin = i65.a.b(getContext(), 48);
                layoutParams4.bottomMargin = i65.a.b(getContext(), 64);
                this.f178856f.setLayoutParams(layoutParams4);
            }
        }
        if (vector.size() == 0) {
            this.f178858h.setVisibility(8);
            this.f178859i.setVisibility(8);
            return;
        }
        this.f178858h.setVisibility(0);
        this.f178859i.setVisibility(0);
        java.util.Iterator it = vector.iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.o1 o1Var = (com.tencent.mm.wallet_core.model.o1) it.next();
            if (o1Var.f213961d <= 0) {
                android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.d5v, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.beb);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483599be3);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484036cs5);
                textView.setText(o1Var.f213958a);
                textView2.setText(o1Var.f213959b);
                textView3.setTag(o1Var);
                textView3.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.z(this));
                this.f178858h.addView(inflate);
            }
        }
        if (this.f178858h.getChildCount() == 0) {
            this.f178859i.setVisibility(8);
        } else {
            this.f178859i.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483600be4);
        this.f178854d = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f178856f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485347he0);
        this.f178857g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f484032cs0);
        this.f178858h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485350he3);
        this.f178859i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485351he4);
        this.f178856f.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.q(this));
        this.f178857g.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.t(this));
        this.f178855e = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.bee);
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.u(this));
        U6();
        this.f178860m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.be9);
        this.f178861n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bea);
        this.f178862o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.be6);
        this.f178863p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.be7);
        this.f178862o.post(new com.tencent.mm.plugin.wallet.pwd.ui.v(this));
        this.f178863p.post(new com.tencent.mm.plugin.wallet.pwd.ui.w(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (1 == i17 && i18 == -1) {
            boolean a17 = ((mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class))).a();
            re4.v a18 = re4.u.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletDigitalCertUI", "getSecurityInfo isOpenTouchPay: %b", java.lang.Boolean.valueOf(a17));
            doSceneProgress(new gs4.q(false, a17, a18.f394553a, a18.f394554b), false);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1654);
        addSceneEndListener(1568);
        addSceneEndListener(1669);
        initView();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 1);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1654);
        removeSceneEndListener(1568);
        removeSceneEndListener(1669);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof gs4.q) {
            U6();
        } else if (m1Var instanceof com.tencent.mm.wallet_core.model.r0) {
            if (i18 == 0) {
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct.f62116d = 2L;
                wCPaySaftyClickReportStruct.f62117e = 2L;
                wCPaySaftyClickReportStruct.k();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 11);
                com.tencent.mm.wallet_core.model.p1.c().a(((com.tencent.mm.wallet_core.model.r0) m1Var).f213986d);
                android.widget.Toast makeText = dp.a.makeText(getContext(), "", 0);
                android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488379rq, null);
                ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icons_filled_done);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(getString(com.tencent.mm.R.string.ktr));
                makeText.setGravity(17, 0, 0);
                makeText.setView(inflate);
                makeText.show();
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 12);
            }
            U6();
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.wallet.pwd.ui.b0.class);
    }
}
