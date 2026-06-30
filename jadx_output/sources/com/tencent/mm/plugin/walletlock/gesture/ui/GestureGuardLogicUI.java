package com.tencent.mm.plugin.walletlock.gesture.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class GestureGuardLogicUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.walletlock.gesture.ui.widget.a, android.view.View.OnClickListener, com.tencent.mm.plugin.walletlock.ui.a {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f181308y = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f181311f;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f181325w;

    /* renamed from: d, reason: collision with root package name */
    public int f181309d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f181310e = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f181312g = 0;

    /* renamed from: h, reason: collision with root package name */
    public iu4.d0[] f181313h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f181314i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f181315m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f181316n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181317o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f181318p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f181319q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ViewFlipper f181320r = null;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f181321s = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public android.app.Dialog f181322t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f181323u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f181324v = false;

    /* renamed from: x, reason: collision with root package name */
    public int f181326x = -1;

    public static void T6(com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI gestureGuardLogicUI) {
        gestureGuardLogicUI.getClass();
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String r17 = c01.z1.r();
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.K(r17, 9, "PatternLockUpdate", "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11473, new java.lang.Object[0]);
    }

    public final void U6() {
        android.app.Dialog dialog = this.f181322t;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f181322t.dismiss();
    }

    public final boolean V6() {
        int i17 = this.f181311f;
        if (i17 == 20 || i17 == 0 || i17 == 2 || i17 == 1) {
            W6();
            return false;
        }
        if (this.f181323u) {
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            java.lang.String string = "next_action.modify_pattern".equals(stringExtra) ? getString(com.tencent.mm.R.string.fr9) : "next_action.switch_on_pattern".equals(stringExtra) ? getString(com.tencent.mm.R.string.fr_) : getString(com.tencent.mm.R.string.fr9);
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.A = false;
            aVar.f211729s = string;
            i0Var.f(com.tencent.mm.R.string.fr7);
            aVar.E = new iu4.s(this);
            i0Var.e(com.tencent.mm.R.string.f492242fr5);
            aVar.F = new iu4.r(this);
            i0Var.h();
        } else {
            com.tencent.mm.ui.widget.dialog.i0 i0Var2 = new com.tencent.mm.ui.widget.dialog.i0(this);
            com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var2.f211821b;
            aVar2.A = true;
            i0Var2.d(com.tencent.mm.R.string.fra);
            i0Var2.f(com.tencent.mm.R.string.fr6);
            aVar2.E = new iu4.q(this);
            i0Var2.h();
        }
        return true;
    }

    public final void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("next_action");
        if (this.f181311f == 20 || "next_action.goto_protected_page".equals(stringExtra)) {
            com.tencent.mm.plugin.walletlock.model.n.INSTANCE.h();
        }
    }

    public final void X6() {
        android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra("page_intent");
        if (intent != null) {
            com.tencent.mm.plugin.walletlock.model.n nVar = com.tencent.mm.plugin.walletlock.model.n.INSTANCE;
            nVar.j(true);
            nVar.k(true);
            intent.addFlags(131072);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
        }
        finish();
    }

    public final void Y6() {
        iu4.d0[] d0VarArr = this.f181313h;
        if (d0VarArr == null) {
            return;
        }
        iu4.d0 d0Var = d0VarArr[this.f181312g];
        int i17 = this.f181311f;
        if (i17 == 0) {
            setMMTitle(getString(com.tencent.mm.R.string.frr));
            this.f181317o = false;
            d0Var.f295023c.setEnableInput(true);
            d0Var.f295023c.setOnPatternListener(this);
            if (!"next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
                d0Var.f295022b.setText(getString(com.tencent.mm.R.string.frm));
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f181325w)) {
                d0Var.f295022b.setText(getString(com.tencent.mm.R.string.frn));
            } else {
                d0Var.f295022b.setText(this.f181325w);
            }
            d0Var.f295022b.setTextColor(this.f181309d);
            if (d0Var.f295024d.getVisibility() != 0) {
                d0Var.f295024d.setVisibility(0);
                return;
            }
            return;
        }
        if (i17 == 1) {
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            if ("next_action.modify_pattern".equals(stringExtra)) {
                d0Var.f295023c.b();
                b7(1, true);
                this.f181311f = 16;
                Y6();
                return;
            }
            if (!"next_action.switch_off_pattern".equals(stringExtra)) {
                if ("next_action.goto_protected_page".equals(stringExtra)) {
                    hu4.i.f285230a = android.os.SystemClock.elapsedRealtime();
                    X6();
                    com.tencent.mm.plugin.walletlock.model.m.c(this.f181326x, 1, 0);
                    return;
                }
                return;
            }
            java.util.List list = this.f181316n;
            iu4.a0 a0Var = new iu4.a0(this);
            d7(new iu4.i(this));
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.fz4();
            lVar.f70665b = new r45.gz4();
            lVar.f70667d = 689;
            lVar.f70666c = "/cgi-bin/micromsg-bin/oppatternlock";
            lVar.f70678o = 2;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.fz4 fz4Var = (r45.fz4) a17.f70710a.f70684a;
            fz4Var.f374747d = 3;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(hu4.j.c(list));
            fz4Var.f374748e = cu5Var;
            com.tencent.mm.modelbase.z2.d(a17, new iu4.j(this, a0Var), false);
            return;
        }
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.b bVar = com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong;
        if (i17 == 2) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            hu4.i.i(elapsedRealtime, 0L);
            int i18 = this.f181318p;
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            if (c17 != null) {
                c17.w(339972, java.lang.Integer.valueOf(i18));
                c17.i(true);
            }
            hu4.i.f285230a = -1L;
            if (this.f181318p == 5) {
                this.f181317o = true;
                hu4.i.h(elapsedRealtime, 0L);
                d0Var.f295023c.b();
                d0Var.f295023c.setEnableInput(false);
                this.f181311f = 20;
                Y6();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.A = false;
                aVar.f211729s = java.lang.String.format(getString(com.tencent.mm.R.string.fr8), 10L);
                aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f492241fr4);
                aVar.E = new iu4.o(this);
                aVar.f211733w = of5.b.a(this).getString(com.tencent.mm.R.string.f492240fr3);
                aVar.F = new iu4.p(this);
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar.f211723m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var.f211837r);
                }
                j0Var.show();
            } else {
                d0Var.f295023c.setEnableInput(false);
                d0Var.f295023c.setDisplayMode(bVar);
                c7(java.lang.String.format(getResources().getString(com.tencent.mm.R.string.fre), java.lang.Integer.valueOf(5 - this.f181318p)), new iu4.b0(this, d0Var));
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("next_action");
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", "nextAction: %s", stringExtra2);
            if ("next_action.goto_protected_page".equals(stringExtra2)) {
                if (this.f181318p == 5) {
                    com.tencent.mm.plugin.walletlock.model.m.c(this.f181326x, 1, 2);
                    return;
                } else {
                    com.tencent.mm.plugin.walletlock.model.m.c(this.f181326x, 1, 1);
                    return;
                }
            }
            return;
        }
        switch (i17) {
            case 16:
                java.lang.String stringExtra3 = getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra3)) {
                    setMMTitle(getString(com.tencent.mm.R.string.frp));
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct.f62116d = 5L;
                    wCPaySaftyClickReportStruct.f62117e = 1L;
                    wCPaySaftyClickReportStruct.k();
                } else if ("next_action.switch_on_pattern".equals(stringExtra3)) {
                    setMMTitle(getString(com.tencent.mm.R.string.frq));
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct2.f62116d = 4L;
                    wCPaySaftyClickReportStruct2.f62117e = 1L;
                    wCPaySaftyClickReportStruct2.k();
                } else {
                    setMMTitle(getString(com.tencent.mm.R.string.frp));
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct3.f62116d = 5L;
                    wCPaySaftyClickReportStruct3.f62117e = 1L;
                    wCPaySaftyClickReportStruct3.k();
                }
                this.f181317o = false;
                d0Var.f295023c.setEnableInput(true);
                d0Var.f295023c.setOnPatternListener(this);
                d0Var.f295022b.setText(getString(com.tencent.mm.R.string.frl));
                d0Var.f295022b.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
                if (d0Var.f295024d.getVisibility() != 8) {
                    d0Var.f295024d.setVisibility(8);
                    return;
                }
                return;
            case 17:
                d0Var.f295022b.setText(getResources().getString(com.tencent.mm.R.string.frj));
                d0Var.f295022b.setTextColor(this.f181309d);
                d0Var.f295023c.b();
                d0Var.f295023c.setEnableInput(true);
                if (d0Var.f295024d.getVisibility() != 8) {
                    d0Var.f295024d.setVisibility(8);
                    return;
                }
                return;
            case 18:
                java.lang.String stringExtra4 = getIntent().getStringExtra("next_action");
                if (!"next_action.modify_pattern".equals(stringExtra4)) {
                    if ("next_action.switch_on_pattern".equals(stringExtra4)) {
                        Z6(this.f181319q, this.f181315m, new iu4.w(this));
                        return;
                    } else {
                        if ("next_action.goto_protected_page".equals(stringExtra4)) {
                            Z6(this.f181319q, this.f181315m, new iu4.x(this));
                            return;
                        }
                        return;
                    }
                }
                if (this.f181324v) {
                    this.f181324v = false;
                    Z6(this.f181319q, this.f181315m, new iu4.u(this));
                    return;
                }
                java.util.List list2 = this.f181316n;
                java.util.List list3 = this.f181315m;
                iu4.v vVar = new iu4.v(this);
                com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
                d7(new iu4.g(this));
                lVar2.f70664a = new r45.fz4();
                lVar2.f70665b = new r45.gz4();
                lVar2.f70667d = 689;
                lVar2.f70666c = "/cgi-bin/micromsg-bin/oppatternlock";
                lVar2.f70678o = 2;
                com.tencent.mm.modelbase.o a18 = lVar2.a();
                r45.fz4 fz4Var2 = (r45.fz4) a18.f70710a.f70684a;
                fz4Var2.f374747d = 1;
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(hu4.j.c(list2));
                fz4Var2.f374748e = cu5Var2;
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(hu4.j.c(list3));
                fz4Var2.f374749f = cu5Var3;
                com.tencent.mm.modelbase.z2.d(a18, new iu4.h(this, vVar), false);
                return;
            case 19:
                d0Var.f295023c.setEnableInput(false);
                d0Var.f295023c.setDisplayMode(bVar);
                c7(getResources().getString(com.tencent.mm.R.string.frk), new iu4.z(this, d0Var));
                return;
            case 20:
                setMMTitle(getString(com.tencent.mm.R.string.fro));
                setMMTitle(getString(com.tencent.mm.R.string.frp));
                int i19 = this.f181326x;
                if (i19 == 1) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct4.f62116d = 8L;
                    wCPaySaftyClickReportStruct4.f62117e = 1L;
                    wCPaySaftyClickReportStruct4.k();
                } else if (i19 == 2) {
                    com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct5.f62116d = 10L;
                    wCPaySaftyClickReportStruct5.f62117e = 1L;
                    wCPaySaftyClickReportStruct5.k();
                }
                this.f181317o = true;
                d0Var.f295023c.setEnableInput(false);
                d0Var.f295023c.setOnPatternListener(null);
                d0Var.f295022b.setText(java.lang.String.format(getString(com.tencent.mm.R.string.frh), java.lang.Long.valueOf((long) java.lang.Math.ceil((600 - (hu4.i.a().f285235b / 1000)) / 60.0d))));
                d0Var.f295022b.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479482a31));
                return;
            default:
                return;
        }
    }

    public final void Z6(java.lang.String str, java.util.List list, com.tencent.mm.modelbase.e3 e3Var) {
        d7(new iu4.c(this));
        if (str == null) {
            U6();
            if (e3Var != null) {
                e3Var.callback(3, -6, getString(com.tencent.mm.R.string.frd), null, null);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nn5();
        lVar.f70665b = new r45.on5();
        lVar.f70667d = na1.e.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/registernewpatternlock";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.nn5 nn5Var = (r45.nn5) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(str.getBytes());
        nn5Var.f381551d = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(hu4.j.c(list));
        nn5Var.f381552e = cu5Var2;
        com.tencent.mm.modelbase.z2.d(a17, new iu4.d(this, e3Var), false);
    }

    public final void a7(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", "gesture finishWithResult");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", i18);
        intent.putExtra("key_err_msg", str);
        setResult(i17, intent);
        finish();
        if (i18 == 4 || i18 == 0) {
            com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent = new com.tencent.mm.autogen.events.WalletLockProtectEvent();
            int i19 = i18 == 4 ? 5 : 6;
            am.n10 n10Var = walletLockProtectEvent.f54960g;
            n10Var.f7392a = i19;
            n10Var.f7393b = this;
            walletLockProtectEvent.e();
        }
    }

    public final void b7(int i17, boolean z17) {
        int i18 = i17 - this.f181312g;
        if (i18 == 0) {
            return;
        }
        this.f181312g = i17;
        if (!z17) {
            this.f181320r.setInAnimation(null);
            this.f181320r.setOutAnimation(null);
        } else if (i18 > 0) {
            this.f181320r.setInAnimation(this, com.tencent.mm.R.anim.f477886ea);
            this.f181320r.setOutAnimation(this, com.tencent.mm.R.anim.f477882e6);
        } else {
            this.f181320r.setInAnimation(this, com.tencent.mm.R.anim.f477880e4);
            this.f181320r.setOutAnimation(this, com.tencent.mm.R.anim.f477889ed);
        }
        if (i18 <= 0) {
            while (i18 < 0) {
                this.f181320r.showPrevious();
                i18++;
            }
        } else {
            for (int i19 = 0; i19 < i18; i19++) {
                this.f181320r.showNext();
            }
        }
    }

    public final void c7(java.lang.String str, iu4.c0 c0Var) {
        android.widget.TextView textView = this.f181313h[this.f181312g].f295022b;
        textView.getText().toString();
        textView.setText(str);
        textView.setTextColor(this.f181310e);
        textView.startAnimation(this.f181314i);
        this.f181314i.setAnimationListener(new iu4.n(this, c0Var));
    }

    public final void d7(android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialog = this.f181322t;
        if (dialog == null) {
            this.f181322t = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.frg), false, false, onCancelListener);
        } else {
            dialog.show();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bl8;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        hideVKB();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f181314i = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477870du);
        this.f181309d = getResources().getColor(com.tencent.mm.R.color.a0c);
        this.f181310e = getResources().getColor(com.tencent.mm.R.color.f479482a31);
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("action");
        intent.getStringExtra("next_action");
        if ("action.switch_on_pattern".equals(stringExtra)) {
            this.f181311f = 16;
            b7(1, false);
        } else if ("action.verify_pattern".equals(stringExtra)) {
            if (hu4.j.f()) {
                this.f181317o = true;
                this.f181311f = 20;
            } else {
                this.f181317o = false;
                this.f181311f = 0;
            }
            b7(0, false);
        }
        setBackBtn(new iu4.k(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", java.lang.Integer.valueOf(this.f181311f)));
        Y6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
                return;
            }
            int intExtra = intent.getIntExtra("key_err_code", 0);
            if (intExtra != 0) {
                if (intExtra == -1) {
                    dp.a.makeText(this, getString(com.tencent.mm.R.string.frb), 0).show();
                    return;
                }
                return;
            }
            this.f181319q = intent.getStringExtra("key_token");
            intent.getStringExtra("key_type");
            java.lang.String stringExtra = getIntent().getStringExtra("next_action");
            if ("next_action.goto_protected_page".equals(stringExtra) || "next_action.modify_pattern".equals(stringExtra)) {
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    this.f181324v = true;
                }
                this.f181323u = false;
                setBackBtn(null);
                setBackBtnVisible(false);
                this.f181311f = 16;
                b7(1, false);
            } else if ("next_action.switch_off_pattern".equals(stringExtra)) {
                java.lang.String str = this.f181319q;
                iu4.t tVar = new iu4.t(this);
                d7(new iu4.l(this));
                if (str == null) {
                    U6();
                    tVar.callback(3, -6, getString(com.tencent.mm.R.string.frd), null, null);
                } else {
                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                    lVar.f70664a = new r45.nn5();
                    lVar.f70665b = new r45.on5();
                    lVar.f70667d = na1.e.CTRL_INDEX;
                    lVar.f70666c = "/cgi-bin/micromsg-bin/registernewpatternlock";
                    lVar.f70678o = 2;
                    com.tencent.mm.modelbase.o a17 = lVar.a();
                    r45.nn5 nn5Var = (r45.nn5) a17.f70710a.f70684a;
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(str.getBytes());
                    nn5Var.f381551d = cu5Var;
                    nn5Var.f381553f = 3;
                    com.tencent.mm.modelbase.z2.d(a17, new iu4.m(this, tVar), false);
                }
            } else {
                this.f181311f = 1;
            }
            Y6();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.omq) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("key_wallet_lock_type", 1);
            j45.l.n(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, 1001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        android.content.Intent intent = getIntent();
        if (!com.tencent.mm.sdk.platformtools.x2.f193072b.equals(intent.getPackage()) || com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("action")) || com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("next_action"))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
            finish();
            return;
        }
        this.f181320r = new android.widget.ViewFlipper(this);
        iu4.d0[] d0VarArr = {new iu4.d0(this), new iu4.d0(this), new iu4.d0(this)};
        this.f181313h = d0VarArr;
        for (int i17 = 0; i17 < 3; i17++) {
            iu4.d0 d0Var = d0VarArr[i17];
            this.f181320r.addView(d0Var.f295021a);
            d0Var.f295023c.setOnPatternListener(this);
            d0Var.f295024d.setOnClickListener(this);
        }
        setContentView(this.f181320r);
        this.f181319q = getIntent().getStringExtra("token");
        getIntent().getStringExtra("type");
        this.f181325w = getIntent().getStringExtra("verify_title");
        this.f181326x = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.walletlock.model.m.f181373a = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "wallet lock report create session: %d", java.lang.Long.valueOf(currentTimeMillis));
        }
        initView();
        getWindow().addFlags(8192);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        try {
            if (b3.l.checkSelfPermission(getContext(), "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                getWindow().setHideOverlayWindows(true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", "no permission");
                jx3.f.INSTANCE.kvStat(28867, "100");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardLogicUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.f181322t;
        if (dialog != null && dialog.isShowing()) {
            this.f181322t.dismiss();
        }
        android.widget.ViewFlipper viewFlipper = this.f181320r;
        if (viewFlipper != null) {
            viewFlipper.removeAllViews();
            this.f181320r = null;
        }
        int i17 = 0;
        while (true) {
            iu4.d0[] d0VarArr = this.f181313h;
            if (i17 >= d0VarArr.length) {
                this.f181313h = null;
                return;
            }
            iu4.d0 d0Var = d0VarArr[i17];
            d0Var.f295023c.setOnClickListener(null);
            d0Var.f295024d.setOnClickListener(null);
            d0Var.f295021a = null;
            d0Var.f295022b = null;
            d0Var.f295023c = null;
            d0Var.f295024d = null;
            this.f181313h[i17] = null;
            i17++;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (V6()) {
            return false;
        }
        a7(0, 4, "user cancel when setting gesture");
        return false;
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternCleared(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView) {
        patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct);
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternCompleted(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView, java.util.List list) {
        int i17 = this.f181311f;
        boolean z17 = true;
        if (i17 == 16) {
            if (list.size() < 4) {
                patternLockView.setEnableInput(false);
                patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong);
                c7(java.lang.String.format(getString(com.tencent.mm.R.string.frf), 4), new iu4.a(this, patternLockView));
                return;
            } else {
                this.f181315m = list;
                patternLockView.b();
                this.f181311f = 17;
                b7(2, true);
                Y6();
                return;
            }
        }
        if (i17 != 0) {
            if (i17 == 17) {
                if (this.f181315m.equals(list)) {
                    patternLockView.b();
                    this.f181317o = false;
                    this.f181318p = 0;
                    hu4.i.g();
                    hu4.i.e();
                    hu4.i.f();
                    hu4.i.f285230a = -1L;
                    this.f181311f = 18;
                } else {
                    this.f181311f = 19;
                }
                Y6();
                return;
            }
            return;
        }
        iu4.b bVar = new iu4.b(this, list);
        r45.q55 c17 = hu4.i.c();
        r45.p55 b17 = hu4.i.b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11453, new java.lang.Object[0]);
        d7(new iu4.e(this));
        boolean j17 = hu4.j.j(c17);
        boolean i18 = hu4.j.i(b17);
        boolean z18 = !i18 || (j17 && b17.f382771e < c17.f383695d);
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardLogicUI", java.lang.String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(i18), java.lang.Boolean.valueOf(z18)));
        if (!z18) {
            U6();
            r45.p55 b18 = hu4.i.b();
            if (b18 != null) {
                z17 = new java.lang.String(b18.f382772f.f371841f.f192156a).equals(kk.k.g((new kk.v(gm0.j1.b().h()).longValue() + '_' + new java.lang.String(hu4.j.c(list))).getBytes()));
            }
            if (z17) {
                bVar.callback(3, 0, null, null, null);
                return;
            } else {
                bVar.callback(3, -3, null, null, null);
                return;
            }
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fz4();
        lVar.f70665b = new r45.gz4();
        lVar.f70667d = 689;
        lVar.f70666c = "/cgi-bin/micromsg-bin/oppatternlock";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.fz4 fz4Var = (r45.fz4) a17.f70710a.f70684a;
        fz4Var.f374747d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(hu4.j.c(list));
        fz4Var.f374748e = cu5Var;
        com.tencent.mm.modelbase.z2.d(a17, new iu4.f(this, bVar), false);
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternGestureNodeJoin(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView, java.util.List list) {
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternStart(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f181311f == 0) {
            if (!hu4.j.e()) {
                this.f181318p = 0;
                return;
            }
            int d17 = hu4.i.d();
            this.f181318p = d17;
            if (d17 == -1) {
                this.f181318p = 0;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.f181313h[this.f181312g].f295023c;
        if (patternLockView != null) {
            patternLockView.setEnableInput(z17 && !this.f181317o);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(hu4.e.class);
    }
}
