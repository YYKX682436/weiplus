package com.tencent.mm.plugin.radar.ui;

@db5.a(19)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSearchUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class RadarSearchUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f154992h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f154993e = jz5.h.a(jz5.i.f302831f, new qs3.c1(this, com.tencent.mm.R.id.lhe));

    /* renamed from: f, reason: collision with root package name */
    public boolean f154994f = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f154995g = 30764;

    public final com.tencent.mm.plugin.radar.ui.RadarViewController O6() {
        return (com.tencent.mm.plugin.radar.ui.RadarViewController) this.f154993e.getValue();
    }

    public final void P6() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227160h, new qs3.u(this))) {
            return;
        }
        com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = new com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent();
        talkRoomeStatusBarHideEvent.f54886g.getClass();
        talkRoomeStatusBarHideEvent.e();
        ps3.n.f358113e = 0;
        ps3.n.f358112d = 0L;
        ps3.n.f358112d = java.lang.System.currentTimeMillis();
        ps3.n.f358114f = 0;
        ps3.n.f358111c = 0L;
        ps3.n.f358109a = 0;
        ps3.n.f358110b = 0L;
        ps3.n.f358111c = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(759L, 0L, 1L, false);
        if (O6().getRadarStatus() == ps3.r.f358120d || O6().getRadarStatus() == ps3.r.f358121e) {
            ps3.w wVar = O6().f155043o;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            i11.e eVar = wVar.f358132e;
            if (eVar != null) {
                ((i11.h) eVar).k(wVar.f358145u, true);
            }
            ps3.w wVar2 = O6().f155043o;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            wVar2.f();
            O6().p();
        }
        com.tencent.mm.plugin.report.service.b1.f(3, 10);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        return (systemService == null || !kotlin.jvm.internal.o.b("layout_inflater", name)) ? systemService : com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f154995g) {
            if (intent == null) {
                this.f154994f = true;
                finish();
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                this.f154994f = true;
                finish();
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                this.f154994f = false;
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            kotlin.jvm.internal.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | mc1.c.CTRL_INDEX);
        setContentView(com.tencent.mm.R.layout.cbw);
        getWindow().getDecorView().setBackgroundColor(i65.a.d(this, com.tencent.mm.R.color.f478712f3));
        getWindow().setStatusBarColor(i65.a.d(this, com.tencent.mm.R.color.f478712f3));
        if (i17 >= 26 && !com.tencent.mm.ui.ga.q()) {
            getWindow().setNavigationBarColor(i65.a.d(this, com.tencent.mm.R.color.f478712f3));
        }
        O6().e();
        com.tencent.mm.plugin.radar.ui.RadarViewController O6 = O6();
        ps3.m mVar = O6.f155044p;
        mVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(mVar);
        mVar.f358106h.alive();
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.b("addcontact", mVar.f358107i, true);
        ps3.w wVar = O6.f155043o;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("radarManager");
            throw null;
        }
        gm0.j1.d().a(425, wVar);
        gm0.j1.d().a(602, wVar);
        java.lang.Object l17 = gm0.j1.u().c().l(229377, 0);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        gm0.j1.u().c().w(229377, java.lang.Integer.valueOf(((java.lang.Integer) l17).intValue() + 1));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        O6().h();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean onKeyDown = O6().onKeyDown(i17, event);
        return onKeyDown ? onKeyDown : super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent talkRoomeStatusBarHideEvent = new com.tencent.mm.autogen.events.TalkRoomeStatusBarHideEvent();
        talkRoomeStatusBarHideEvent.f54886g.getClass();
        talkRoomeStatusBarHideEvent.e();
        if (ps3.n.f358112d != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - ps3.n.f358112d;
            if (!(currentTimeMillis <= ((long) 500))) {
                int i17 = ps3.n.f358113e;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String format = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                g0Var.kvStat(10679, format);
                ps3.n.f358109a++;
                ps3.n.f358110b += currentTimeMillis;
                ps3.n.f358112d = 0L;
            }
        }
        if (ps3.n.f358111c != 0) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - ps3.n.f358111c;
            int i18 = ps3.n.f358109a;
            float f17 = 1000;
            float f18 = (((float) ps3.n.f358110b) * 1.0f) / f17;
            int i19 = ps3.n.f358114f;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String format2 = java.lang.String.format("%d,%d,%s,%d,%s", java.util.Arrays.copyOf(new java.lang.Object[]{1, java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf((((float) currentTimeMillis2) * 1.0f) / f17)}, 5));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            g0Var2.kvStat(10676, format2);
        }
        if (O6().getRadarStatus() == ps3.r.f358120d || O6().getRadarStatus() == ps3.r.f358121e) {
            ps3.w wVar = O6().f155043o;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            wVar.h();
            ps3.w wVar2 = O6().f155043o;
            if (wVar2 == null) {
                kotlin.jvm.internal.o.o("radarManager");
                throw null;
            }
            i11.e eVar = wVar2.f358132e;
            if (eVar != null) {
                ((i11.h) eVar).m(wVar2.f358145u);
            }
            O6().q();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RadarSearchUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 64) {
            if (grantResults[0] == 0) {
                P6();
            } else {
                this.f154994f = false;
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.hh9), false, new qs3.s(this), new qs3.t(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f154994f) {
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.d(this, "android.permission.ACCESS_FINE_LOCATION", true)) {
                    java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                    kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((java.lang.Boolean) m17).booleanValue()) {
                        c71.b.c(this, getString(com.tencent.mm.R.string.f492399gh2, com.tencent.mm.sdk.platformtools.m2.d()), this.f154995g, true);
                        return;
                    } else {
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.i(this, "android.permission.ACCESS_FINE_LOCATION", 64);
                        return;
                    }
                }
            } else {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                java.lang.String string = getString(com.tencent.mm.R.string.hqv);
                ((sb0.f) jVar).getClass();
                boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, null, string);
                com.tencent.mars.xlog.Log.i("MicroMsg.RadarSearchUI", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
                if (!a17) {
                    return;
                }
            }
            P6();
        }
    }
}
