package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes14.dex */
public class NetworkDiagnoseAllInOneUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f175284y = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f175285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f175286e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f175287f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f175288g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f175289h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f175290i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f175291m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f175292n;

    /* renamed from: o, reason: collision with root package name */
    public int f175293o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f175294p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f175295q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f175296r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f175297s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f175298t;

    /* renamed from: u, reason: collision with root package name */
    public i11.e f175299u;

    /* renamed from: v, reason: collision with root package name */
    public i11.c f175300v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f175301w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f175302x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 829538561;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NetworkDiagnoseResultEvent networkDiagnoseResultEvent) {
            int i17;
            am.zk zkVar = networkDiagnoseResultEvent.f54528g;
            int i18 = zkVar.f8575b;
            int i19 = zkVar.f8574a;
            int i27 = 2;
            com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.this;
            if (i18 == 0) {
                networkDiagnoseAllInOneUI.f175293o = 33;
                networkDiagnoseAllInOneUI.f175296r = i19 == 0;
            } else if (i18 == 1) {
                networkDiagnoseAllInOneUI.f175293o = 66;
                networkDiagnoseAllInOneUI.f175297s = i19 == 0;
            } else if (i18 == 2) {
                networkDiagnoseAllInOneUI.f175298t = i19 == 0;
            }
            int i28 = networkDiagnoseAllInOneUI.f175285d;
            if (zkVar.f8576c) {
                networkDiagnoseAllInOneUI.f175293o = 100;
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.traceroute.ui.a(this));
                networkDiagnoseAllInOneUI.f175294p = zkVar.f8577d;
                i17 = 1000;
                if (!networkDiagnoseAllInOneUI.f175296r) {
                    i27 = networkDiagnoseAllInOneUI.f175297s ? 4 : networkDiagnoseAllInOneUI.f175298t ? 5 : 3;
                }
            } else {
                i27 = i28;
                i17 = 0;
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.traceroute.ui.b(this, i27), i17);
            return false;
        }
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", java.lang.Integer.valueOf(this.f175285d));
        switch (this.f175285d) {
            case 0:
            case 1:
                this.f175289h.setImageResource(com.tencent.mm.R.raw.network_diagnose_work);
                this.f175290i.setText(getString(com.tencent.mm.R.string.bpi, java.lang.Integer.valueOf(this.f175293o)));
                this.f175291m.setText(com.tencent.mm.R.string.bpa);
                this.f175286e.setVisibility(4);
                this.f175288g.setVisibility(4);
                return;
            case 2:
                this.f175289h.setImageResource(com.tencent.mm.R.raw.network_diagnose_work);
                this.f175290i.setText(com.tencent.mm.R.string.bpm);
                this.f175291m.setText(com.tencent.mm.R.string.bpd);
                this.f175286e.setVisibility(0);
                this.f175288g.setVisibility(4);
                return;
            case 3:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, com.tencent.mm.R.string.f490500wu);
                intent.putExtra("rawUrl", getString(com.tencent.mm.R.string.h7h));
                intent.putExtra("showShare", false);
                j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                U6(false);
                finish();
                return;
            case 4:
                this.f175289h.setImageResource(com.tencent.mm.R.raw.network_diagnose_fail);
                this.f175290i.setText(com.tencent.mm.R.string.bpl);
                this.f175291m.setText(com.tencent.mm.R.string.bpb);
                this.f175286e.setVisibility(0);
                this.f175286e.setText(com.tencent.mm.R.string.bp8);
                this.f175288g.setVisibility(0);
                return;
            case 5:
                this.f175289h.setImageResource(com.tencent.mm.R.raw.network_diagnose_fail);
                this.f175290i.setText(com.tencent.mm.R.string.bpj);
                this.f175291m.setText(com.tencent.mm.R.string.bpb);
                this.f175286e.setVisibility(0);
                this.f175286e.setText(com.tencent.mm.R.string.bp8);
                this.f175288g.setVisibility(0);
                return;
            case 6:
                this.f175289h.setImageResource(com.tencent.mm.R.raw.network_diagnose_feedback);
                this.f175290i.setText(com.tencent.mm.R.string.bpk);
                this.f175291m.setText(com.tencent.mm.R.string.bpc);
                this.f175286e.setVisibility(0);
                this.f175286e.setText(com.tencent.mm.R.string.bp7);
                this.f175288g.setVisibility(4);
                return;
            default:
                return;
        }
    }

    public final void U6(boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f175294p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(14533, "," + this.f175294p);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 71, "", "")) {
            this.f175292n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.bpo), true, true, null);
            this.f175286e.setEnabled(false);
            if (this.f175299u == null) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                this.f175299u = i11.h.e();
            }
            ((i11.h) this.f175299u).l(this.f175300v, true, false, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f175285d;
        if ((i17 == 5 || i17 == 4) && view == this.f175286e) {
            U6(true);
        } else {
            U6(false);
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        setMMTitle("");
        getSupportActionBar().o();
        android.content.Intent intent = getIntent();
        this.f175285d = intent.getIntExtra("diagnose_state", 0);
        this.f175293o = intent.getIntExtra("diagnose_percent", 1);
        this.f175294p = intent.getStringExtra("diagnose_kvInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", java.lang.Integer.valueOf(this.f175285d), java.lang.Integer.valueOf(this.f175293o), this.f175294p);
        if (this.f175285d == 0) {
            this.f175285d = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
            c01.d9.e().g(new c01.ra(new com.tencent.mm.plugin.traceroute.ui.g(this), null));
        }
        this.f175286e = (android.widget.Button) findViewById(com.tencent.mm.R.id.cy7);
        this.f175287f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484084cy5);
        this.f175288g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484083cy4);
        this.f175289h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cy9);
        this.f175290i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cy_);
        this.f175291m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cy6);
        this.f175287f.setOnClickListener(this);
        this.f175286e.setOnClickListener(this);
        this.f175288g.setOnClickListener(this);
        T6();
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.AnonymousClass1 anonymousClass1 = new com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
        this.f175295q = anonymousClass1;
        anonymousClass1.alive();
        this.f175300v = new com.tencent.mm.plugin.traceroute.ui.e(this);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.traceroute.ui.f(this), true);
        this.f175301w = b4Var;
        int i17 = this.f175285d;
        if (i17 == 0 || i17 == 1) {
            b4Var.c(1000L, 1000L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f175295q.dead();
        i11.e eVar = this.f175299u;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f175300v);
            this.f175299u = null;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f175301w;
        if (b4Var != null) {
            b4Var.d();
            this.f175301w = null;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 71) {
            return;
        }
        if (iArr[0] == 0) {
            U6(true);
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.hh9), false, new com.tencent.mm.plugin.traceroute.ui.h(this), new com.tencent.mm.plugin.traceroute.ui.i(this));
        }
    }
}
