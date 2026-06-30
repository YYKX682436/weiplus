package com.tencent.mm.plugin.setting.ui.setting;

@gm0.a2
/* loaded from: classes11.dex */
public class SettingsUI extends com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference implements l75.z0 {
    public static final /* synthetic */ int I = 0;
    public com.tencent.mm.ui.widget.dialog.j0 C;
    public android.view.View D;
    public android.widget.CheckBox E;
    public com.tencent.mm.ui.widget.dialog.z2 F;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160741g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f160743i;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160746o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160747p;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f160751t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f160752u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f160753v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f160754w;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.b f160756y;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f160742h = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f160744m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f160745n = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f160748q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160749r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f160750s = false;

    /* renamed from: x, reason: collision with root package name */
    public final d70.j f160755x = new com.tencent.mm.plugin.setting.ui.setting.io(this);

    /* renamed from: z, reason: collision with root package name */
    public final int f160757z = 1;
    public final int A = 2;
    public final int B = 3;
    public com.tencent.mm.sdk.platformtools.b4 G = null;
    public com.tencent.mm.modelbase.u0 H = null;

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference
    public int V6() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X6() {
        com.tencent.mars.xlog.Log.w("MicroMsg.SettingsUI", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
        if (!gm0.j1.b().t() || c01.z1.x()) {
            o7();
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.Cdo cdo = new com.tencent.mm.plugin.setting.ui.setting.Cdo(this);
        this.H = cdo;
        d17.a(281, cdo);
        de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.setting.ui.setting.eo(this, wi6), false);
        this.G = b4Var;
        b4Var.c(5000L, 5000L);
        this.f160742h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.l7z), true, true, new com.tencent.mm.plugin.setting.ui.setting.fo(this, wi6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y6() {
        if (gm0.j1.b().t()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.ui.bk.A() && !c01.z1.x()) {
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                com.tencent.mm.plugin.setting.ui.setting.no noVar = new com.tencent.mm.plugin.setting.ui.setting.no(this);
                this.f160744m = noVar;
                d17.a(281, noVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) wi6);
                Z6();
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.oo(this, wi6), false);
                this.f160746o = b4Var;
                b4Var.c(5000L, 5000L);
                this.f160742h = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.l7z), true, true, new com.tencent.mm.plugin.setting.ui.setting.po(this, wi6));
                return;
            }
        }
        Z6();
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.qo(this), false);
        this.f160747p = b4Var2;
        b4Var2.c(3000L, 3000L);
        this.f160742h = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbe), true, true, new com.tencent.mm.plugin.setting.ui.setting.ro(this));
    }

    public final void Z6() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.to toVar = new com.tencent.mm.plugin.setting.ui.setting.to(this);
        this.f160745n = toVar;
        d17.a(282, toVar);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        gm0.j1.d().g(new com.tencent.mm.modelsimple.r0(4));
    }

    public final void a7(boolean z17) {
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        if (z17) {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).i();
        } else {
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).getClass();
            com.tencent.mm.booter.notification.l0.f63501a.c(-1, null);
        }
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = false;
        backupProcessMgrExitEvent.e();
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.ui.vb.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).g();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        finish();
        if (k35.p.f303943a != null) {
            com.tencent.mm.ui.vb.d(getContext(), z17, 2);
        }
    }

    public final com.tencent.mm.plugin.setting.ui.setting.b b7() {
        if (this.f160756y == null) {
            com.tencent.mm.plugin.setting.ui.setting.g gVar = com.tencent.mm.plugin.setting.ui.setting.g.f161052a;
            this.f160756y = new com.tencent.mm.plugin.setting.ui.setting.e(this.f160741g, "settings_chatting");
        }
        return this.f160756y;
    }

    public final java.lang.String c7() {
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_welab");
        return (normalIconNewTipPreference == null || com.tencent.mm.sdk.platformtools.t8.K0(normalIconNewTipPreference.f197753x0)) ? (normalIconNewTipPreference == null || com.tencent.mm.sdk.platformtools.t8.J0(normalIconNewTipPreference.f197776m)) ? "" : normalIconNewTipPreference.f197776m.toString() : normalIconNewTipPreference.f197753x0;
    }

    public final boolean d7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final boolean e7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    public final boolean f7() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11545, 4);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
        if (this.D == null) {
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cl9, null);
            this.D = inflate;
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.f486873mq3);
            this.E = checkBox;
            checkBox.setChecked(true);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.C;
        if (j0Var == null) {
            this.C = db5.e1.r(getContext(), null, this.D, getString(com.tencent.mm.R.string.gis), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.bo(this), new com.tencent.mm.plugin.setting.ui.setting.co(this));
        } else {
            j0Var.show();
        }
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        if (4 == o17) {
        }
        if (6 == o17) {
            q7();
        } else if (64 == o17) {
            p7();
        }
        if (obj == com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC) {
            t7();
        }
    }

    public final boolean g7(boolean z17) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        if (u11.c.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "oversea user logout");
            db5.e1.K(getContext(), true, getResources().getString(com.tencent.mm.R.string.f493046is5), "", getResources().getString(com.tencent.mm.R.string.f493042is0), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.lo(this), null);
            return true;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11545, 8);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
        c01.uc ucVar = c01.uc.f37514c;
        if (((java.util.HashSet) ucVar.d()).size() > 1) {
            g0Var.d(14978, 1, 10, ucVar.f(), ucVar.e(), wo.w0.k());
        } else {
            g0Var.d(14978, 0, 10, ucVar.f(), ucVar.e(), wo.w0.k());
        }
        if (z17) {
            this.f160751t = (android.view.ViewGroup) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.enr, (android.view.ViewGroup) null);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_NO_PWD;
            is.f fVar = (is.f) r0Var;
            boolean aj6 = fVar.aj(aVar);
            if (aj6) {
                if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(c01.z1.r()) && (viewGroup2 = this.f160751t) != null) {
                    android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.ud8);
                    this.f160752u = textView;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.f160752u.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$f
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                                com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.this;
                                settingsUI.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsUI, array);
                                v61.d.g("one_clk_login_logout", 0);
                                android.content.Intent intent = new android.content.Intent(settingsUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
                                intent.putExtra("highlight_item_id", "settings_no_pwd_title");
                                j45.l.j(settingsUI.getContext(), "setting", ".ui.setting.SettingsAccountInfoUI", intent, null);
                                com.tencent.mm.ui.widget.dialog.z2 z2Var = settingsUI.F;
                                if (z2Var != null) {
                                    z2Var.B();
                                }
                                yj0.a.h(settingsUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        v61.d.h("one_clk_login_logout", 0);
                    }
                }
                fVar.Bi(aVar);
            }
            js.a aVar2 = js.a.WCAccountLogoutEntry_Fingerprint;
            boolean aj7 = fVar.aj(aVar2);
            if (aj7) {
                if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(c01.z1.r()) && (viewGroup = this.f160751t) != null) {
                    android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.ud7);
                    this.f160753v = textView2;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        this.f160753v.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                                com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.this;
                                settingsUI.getClass();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsUI, array);
                                v61.d.g("fingerprint_login_logout", 0);
                                android.content.Intent intent = new android.content.Intent(settingsUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
                                intent.putExtra("highlight_item_id", "settings_fingerprint_title");
                                j45.l.j(settingsUI.getContext(), "setting", ".ui.setting.SettingsAccountInfoUI", intent, null);
                                com.tencent.mm.ui.widget.dialog.z2 z2Var = settingsUI.F;
                                if (z2Var != null) {
                                    z2Var.B();
                                }
                                yj0.a.h(settingsUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        v61.d.h("fingerprint_login_logout", 0);
                    }
                }
                fVar.Bi(aVar2);
            }
            if (aj6 || aj7) {
                android.widget.TextView textView3 = (android.widget.TextView) this.f160751t.findViewById(com.tencent.mm.R.id.f485706ud4);
                if (textView3 != null) {
                    textView3.setText(com.tencent.mm.R.string.p_2);
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f160751t.findViewById(com.tencent.mm.R.id.ud9);
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 0, true);
            this.F = z2Var;
            z2Var.m(getContext().getResources().getString(com.tencent.mm.R.string.f490347sg), getContext().getResources().getString(com.tencent.mm.R.string.git));
            this.F.o(2);
            this.F.v(getResources().getColor(com.tencent.mm.R.color.a0c));
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.F;
            com.tencent.mm.ui.widget.dialog.p3 p3Var = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$a
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                    com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.this;
                    settingsUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "onCancel");
                    settingsUI.F.B();
                }
            };
            com.tencent.mm.ui.widget.dialog.p3 p3Var2 = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$b
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                    com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.this;
                    settingsUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "logout");
                    settingsUI.F.B();
                    settingsUI.h7();
                }
            };
            z2Var2.D = p3Var;
            z2Var2.E = p3Var2;
            z2Var2.j(this.f160751t);
            this.F.C();
            v61.d.h("logout_float", 0);
        } else {
            this.f160743i.v();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494932c0;
    }

    public final boolean h7() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11545, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        g0Var.d(11545, 3);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
        g0Var.idkeyStat(99L, 145L, 1L, false);
        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
            gm0.j1.d().f70764d.C(false);
        }
        m7();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        return true;
    }

    public final void i7() {
        db5.e1.C(getContext(), getString(com.tencent.mm.R.string.giw), null, getString(com.tencent.mm.R.string.bln), getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.plugin.setting.ui.setting.ao(this), null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.izw);
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f160741g = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).h("settings_notification_preference").J(com.tencent.mm.R.string.oho);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ap(this));
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        this.f160743i = k0Var;
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.bp(this);
        k0Var.p(new com.tencent.mm.plugin.setting.ui.setting.cp(this));
        this.f160743i.f211881s = new com.tencent.mm.plugin.setting.ui.setting.dp(this);
        setToTop(new com.tencent.mm.plugin.setting.ui.setting.ep(this));
        q7();
        s7();
        r7();
        com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference = (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_switch_account");
        buttonPreference.U = false;
        buttonPreference.O(getString(com.tencent.mm.R.string.iyv), getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        java.lang.String r17 = c01.z1.r();
        boolean bj6 = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).bj(r17);
        boolean Zi = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Zi(r17);
        if ((com.tencent.mm.ui.bk.A() || c01.z1.x()) || !(bj6 || Zi)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_logout_new", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_close", true);
            com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference2 = (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_logout");
            buttonPreference2.U = false;
            buttonPreference2.O(getString(com.tencent.mm.R.string.f493042is0), getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_logout", true);
            com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference3 = (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_logout_new");
            com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference4 = (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_close");
            buttonPreference3.U = false;
            buttonPreference3.O(getString(com.tencent.mm.R.string.git), getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            buttonPreference4.U = false;
            buttonPreference4.O(getString(com.tencent.mm.R.string.gis), getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        rn3.i.Di().k((com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_account_info"));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_dnd_mode_switch_new, 0) == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_active_time", true);
        }
    }

    public final void j7() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(getString(com.tencent.mm.R.string.f493045is3));
        u1Var.n(getString(com.tencent.mm.R.string.f493044is2));
        u1Var.l(new com.tencent.mm.plugin.setting.ui.setting.zn(this));
        u1Var.a(true);
        u1Var.q(false);
    }

    public final void k7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.class);
        intent.putExtra("key_scene", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void l7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "oneliang logout mm");
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Zi(c01.z1.r());
        ((com.tencent.mm.app.o7) f14.g.a()).getClass();
        com.tencent.mm.booter.q2.c();
        gm0.j1.u().c().e(this);
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 0;
        logoutEvent.e();
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = true;
        backupProcessMgrExitEvent.e();
        com.tencent.mm.sdk.platformtools.c3.b("show_whatsnew");
        gm0.k2.a(this, true);
        com.tencent.mm.plugin.report.service.f0.e(8);
        gm0.j1.n().e();
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("Intro_Switch", true);
        ((com.tencent.mm.app.y7) f14.g.b()).u(intent, getContext());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
        finish();
    }

    public final void m7() {
        com.tencent.mars.xlog.Log.w("MicroMsg.SettingsUI", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
        ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "queryHasPwdAndLogout: skip QueryHasPasswd for ex-device, do logout directly");
            Y6();
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.ho hoVar = new com.tencent.mm.plugin.setting.ui.setting.ho(this);
        this.f160748q = hoVar;
        d17.a(255, hoVar);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 2;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.jo(this, w0Var), false);
        this.f160746o = b4Var;
        b4Var.c(12000L, 12000L);
        this.f160742h = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbe), true, false, new com.tencent.mm.plugin.setting.ui.setting.ko(this, w0Var));
        if (gm0.j1.a()) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String r17 = c01.z1.r();
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, false));
        }
    }

    public final void n7(boolean z17) {
        java.lang.Object obj;
        com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct voiceToTextChatInterfaceStruct = new com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(34));
        if (z17) {
            voiceToTextChatInterfaceStruct.f61699d = 5L;
        } else {
            voiceToTextChatInterfaceStruct.f61699d = 4L;
        }
        java.lang.Object obj2 = c17.first;
        if (obj2 == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE) {
            voiceToTextChatInterfaceStruct.f61701f = 2L;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c7())) {
                voiceToTextChatInterfaceStruct.p(c7());
            }
        } else {
            voiceToTextChatInterfaceStruct.f61701f = 1L;
            voiceToTextChatInterfaceStruct.f61702g = ((com.tencent.mm.plugin.newtips.model.r) obj2).f152396e;
            if (obj2 == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE && (obj = c17.second) != null && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.pm6) obj).f383187e)) {
                voiceToTextChatInterfaceStruct.p(((r45.pm6) c17.second).f383187e);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c7())) {
                voiceToTextChatInterfaceStruct.p(c7());
            }
        }
        tn3.b bVar = tn3.c.f420823a;
        voiceToTextChatInterfaceStruct.f61703h = !bVar.b(com.tencent.mm.sdk.platformtools.x2.f193071a) ? this.A : bVar.c() ? this.f160757z : this.B;
        voiceToTextChatInterfaceStruct.k();
    }

    public final void o7() {
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "setPwdOrexit: skip QueryHasPasswd for ex-device, exit directly");
            a7(true);
            return;
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.vo voVar = new com.tencent.mm.plugin.setting.ui.setting.vo(this);
        this.f160748q = voVar;
        d17.a(255, voVar);
        com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
        w0Var.f71444f = 1;
        gm0.j1.d().g(w0Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.xo(this, w0Var), false);
        this.f160746o = b4Var;
        b4Var.c(5000L, 5000L);
        this.f160742h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbd), true, false, new com.tencent.mm.plugin.setting.ui.setting.yo(this, w0Var));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2) {
            if (intent == null) {
                return;
            }
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 1);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r(), true, false));
            intent2.putExtra("CropImage_ImgPath", b17);
            ((com.tencent.mm.app.y7) f14.g.b()).q(this, intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext2 = getApplicationContext();
            java.lang.String a18 = g83.a.a();
            ((ub0.r) oVar2).getClass();
            java.lang.String b18 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext2, intent, a18);
            if (b18 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", b18);
            intent3.putExtra("CropImage_ImgPath", b18);
            ((com.tencent.mm.app.y7) f14.g.b()).p(getContext(), intent3, 4);
            return;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                super.onActivityResult(i17, i18, intent);
                return;
            } else {
                if (i18 == -1) {
                    l7();
                    return;
                }
                return;
            }
        }
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsUI", "crop picture failed");
            return;
        }
        kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
        new com.tencent.mm.modelavatar.y0(context, stringExtra, false).b(1, null, true);
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.b().m()) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("jumptocare", false)) {
            e7();
        }
        initView();
        gm0.j1.u().c().a(this);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().a(this.f160755x);
        if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "unset more tab dot");
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsUI)).Rj(this, iy1.a.Setting);
        ((f50.c0) i95.n0.c(f50.c0.class)).getClass();
        l14.e eVar = l14.e.f315008a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationReporter", "reportSettingsMainPage");
        java.util.Map map = l14.e.f315009b;
        ((java.util.LinkedHashMap) map).clear();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(50236, "page_in", map, 33328);
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (gm0.j1.a()) {
            gm0.j1.u().c().e(this);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().m(this.f160755x);
        }
        if (this.f160744m != null) {
            gm0.j1.d().q(281, this.f160744m);
        }
        if (this.f160748q != null) {
            gm0.j1.d().q(255, this.f160748q);
        }
        if (this.H != null) {
            gm0.j1.d().q(281, this.H);
        }
        com.tencent.mm.plugin.setting.ui.setting.g.f161052a.d(b7());
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (gm0.j1.a()) {
            gm0.j1.e().f(new com.tencent.mm.plugin.setting.ui.setting.zo(this));
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().q("plugin");
        com.tencent.mm.plugin.setting.ui.setting.g.f161052a.d(b7());
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        android.widget.CheckBox checkBox;
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", str + " item has been clicked!");
        if ("settings_welab".equals(str)) {
            n7(true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_params, "", true))) {
                android.content.Intent intent = new android.content.Intent();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                arrayList.add("labs_browse");
                intent.putStringArrayListExtra("key_exclude_apps", arrayList);
                ((ty4.q) ((uy4.x) i95.n0.c(uy4.x.class))).Bi(this, intent);
            } else {
                try {
                    java.lang.String b17 = v24.w0.f432961a.b();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "openLiteApp query:%s", b17);
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).bj(this, b17);
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(48);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsUI", e17, "openLiteApp ", new java.lang.Object[0]);
                }
            }
            rn3.i.Di().a(34);
            return true;
        }
        if ("settings_personnal_info".equals(str)) {
            d7();
            return true;
        }
        if ("settings_account_info".equals(str)) {
            if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "unset setting account info dot show");
            }
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().i(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257);
            rn3.i.Di().a(51);
            startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI.class);
            return true;
        }
        if ("settings_teen_mode".equals(str)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).i3(this);
            return true;
        }
        if ("settings_care_mode".equals(str)) {
            e7();
            return true;
        }
        if ("settings_account".equals(str)) {
            d7();
            return true;
        }
        if (str.equals("settings_bind_mobile")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
            intent2.putExtra("key_upload_scene", 4);
            com.tencent.mm.ui.MMWizardActivity.X6(this, intent2);
            return true;
        }
        if (str.equals("settings_about_privacy")) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT;
            if (intValue > ((java.lang.Integer) c17.m(u3Var, 0)).intValue()) {
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21529, java.lang.String.format("%s,%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 4));
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_about_system")) {
            rn3.i.Di().a(31);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262158, 266265);
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_about_micromsg")) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262145, 266243);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266262);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262164, 266269);
            rn3.i.Di().a(38);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.class);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent5);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).aj();
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.setting.ui.setting.yn(this), 100L);
            return true;
        }
        if (str.equals("settings_about_device")) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = "wxd930c3b7cf7c92e6";
            b1Var.f317022f = "pages/device-list/device-list.html";
            b1Var.f317018d = 0;
            b1Var.f317016c = 0;
            b1Var.f317032k = 1112;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), b1Var);
            return true;
        }
        if (str.equals("settings_logout")) {
            g7(false);
            return true;
        }
        if (str.equals("settings_logout_new")) {
            g7(true);
            return true;
        }
        if (str.equals("settings_exit")) {
            f7();
            return true;
        }
        if (str.equals("settings_close")) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.enk, (android.view.ViewGroup) null);
            this.f160754w = viewGroup;
            if (viewGroup != null && (checkBox = (android.widget.CheckBox) viewGroup.findViewById(com.tencent.mm.R.id.f486873mq3)) != null) {
                checkBox.setChecked(true);
            }
            final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 1, 0, false);
            z2Var.m(getContext().getResources().getString(com.tencent.mm.R.string.f490347sg), getContext().getResources().getString(com.tencent.mm.R.string.gis));
            z2Var.o(2);
            z2Var.v(getResources().getColor(com.tencent.mm.R.color.a0c));
            com.tencent.mm.ui.widget.dialog.p3 p3Var = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$d
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11545, 5);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
                    com.tencent.mm.ui.widget.dialog.z2.this.B();
                }
            };
            com.tencent.mm.ui.widget.dialog.p3 p3Var2 = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$e
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
                    com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.this;
                    settingsUI.getClass();
                    ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
                    android.widget.CheckBox checkBox2 = (android.widget.CheckBox) settingsUI.f160754w.findViewById(com.tencent.mm.R.id.f486873mq3);
                    if (checkBox2 == null || !checkBox2.isChecked()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "normally exit");
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(99L, 144L, 1L, false);
                        g0Var.d(11545, 7);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
                        if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
                            gm0.j1.d().f70764d.C(false);
                        }
                        new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
                        settingsUI.X6();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "push notify mode exit");
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(99L, 143L, 1L, false);
                        g0Var2.d(11545, 6);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
                        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
                        o4Var.getClass();
                        o4Var.putBoolean("is_in_notify_mode", true);
                        settingsUI.a7(false);
                    }
                    z2Var.B();
                }
            };
            z2Var.D = p3Var;
            z2Var.E = p3Var2;
            z2Var.j(this.f160754w);
            z2Var.C();
            return true;
        }
        if (str.equals("settings_logout_option")) {
            h7();
            return true;
        }
        if (str.equals("settings_notification_preference")) {
            android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent6);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (str.equals("settings_chatting")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).notifyDataSetChanged();
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).notifyDataSetChanged();
            startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.class);
            return true;
        }
        if (str.equals("settings_active_time")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11351, 1, 0);
            startActivity(com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI.class);
            return true;
        }
        if (str.equals("settings_feedback")) {
            if (c01.e2.a0()) {
                java.lang.String string = (com.tencent.mm.sdk.platformtools.a0.f192448k || !(com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW"))) ? getString(com.tencent.mm.R.string.l8h) : getString(com.tencent.mm.R.string.l8g);
                android.content.Intent intent7 = new android.content.Intent();
                intent7.putExtra("showShare", false);
                intent7.putExtra("rawUrl", string);
                intent7.putExtra("show_feedback", false);
                intent7.putExtra("KShowFixToolsBtn", true);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent7, null);
            } else {
                com.tencent.mm.app.j3.b();
                java.lang.String string2 = getString(com.tencent.mm.R.string.f493688la4);
                android.content.Intent intent8 = new android.content.Intent();
                intent8.putExtra("showShare", false);
                intent8.putExtra("rawUrl", string2);
                intent8.putExtra("show_feedback", false);
                intent8.putExtra("KShowFixToolsBtn", true);
                j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent8, null);
            }
        } else if (str.equals("settings_switch_account")) {
            c01.uc ucVar = c01.uc.f37514c;
            if (((java.util.HashSet) ucVar.d()).size() > 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 6, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 0, 6, ucVar.f(), ucVar.e(), wo.w0.k());
            }
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (c01.z1.r().startsWith("wxid") && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str2) && !c01.z1.x() && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
                j7();
                return true;
            }
            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i7();
            } else {
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_SETTING_SWITCH_ACCOUNT_FIRST_CLICK_BOOLEAN_SYNC;
                if (c18.o(u3Var2, true)) {
                    gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
                    db5.e1.E(this, getString(com.tencent.mm.R.string.iyx), getString(com.tencent.mm.R.string.iyy), getString(com.tencent.mm.R.string.f490455vj), false, new com.tencent.mm.plugin.setting.ui.setting.fp(this));
                } else {
                    k7();
                }
            }
        } else {
            if (str.equals("settings_permission_index")) {
                android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsPermissionIndexUI.class);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(intent9);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList6.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            if (str.equals("settings_privacy_personal_list")) {
                if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite1af500fa066e5b60505c414cd42cacbc")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("appId", "wxalite1af500fa066e5b60505c414cd42cacbc");
                    bundle.putString("query", "{\"t\":\"datalist/personal\"}");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "open liteapp:wxalite1af500fa066e5b60505c414cd42cacbc,page:");
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(getContext(), bundle, true, false, new com.tencent.mm.plugin.setting.ui.setting.xn(this));
                } else {
                    java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_personal_privacy_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/personal", true);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                        com.tencent.mm.plugin.report.service.b1.f158148a.c();
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("showShare", false);
                        intent10.putExtra("rawUrl", Zi);
                        intent10.putExtra("show_feedback", false);
                        intent10.putExtra("show_bottom", false);
                        intent10.putExtra("needRedirect", false);
                        intent10.putExtra("neverGetA8Key", false);
                        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent10, null);
                    }
                }
                return true;
            }
            if (str.equals("settings_privacy_third_party_list")) {
                java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_privacy_third_party_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/shared", true);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi2)) {
                    android.content.Intent intent11 = new android.content.Intent();
                    intent11.putExtra("showShare", false);
                    intent11.putExtra("rawUrl", Zi2);
                    intent11.putExtra("show_feedback", false);
                    intent11.putExtra("show_bottom", false);
                    intent11.putExtra("needRedirect", false);
                    intent11.putExtra("neverGetA8Key", false);
                    j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent11, null);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.setting.ui.setting.PersonalPreference personalPreference = (com.tencent.mm.plugin.setting.ui.setting.PersonalPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_account");
        if (personalPreference != null) {
            java.lang.String r17 = c01.z1.r();
            personalPreference.M = -1;
            personalPreference.N = r17;
            if (personalPreference.L != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(personalPreference.L, personalPreference.N, null);
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_device_entry, 0) != 1) {
            com.tencent.mm.autogen.events.ExDeviceSettingShowEvent exDeviceSettingShowEvent = new com.tencent.mm.autogen.events.ExDeviceSettingShowEvent();
            exDeviceSettingShowEvent.e();
            if (!exDeviceSettingShowEvent.f54168g.f6337a) {
                ((com.tencent.mm.ui.base.preference.h0) this.f160741g).v(((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_about_device"));
            }
        }
        p7();
        t7();
        q7();
        s7();
        r7();
        if (com.tencent.mm.sdk.platformtools.f9.MeSetPlugin.h() || c01.e2.a0()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_welab", true);
        } else {
            if (!com.tencent.mm.sdk.platformtools.a0.c()) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_settings_plugin_params, "", true))) {
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalitebf3a88de4da873052ba340892dc97559", null);
                }
            }
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_welab");
            rn3.i.Di().k(normalIconNewTipPreference);
            normalIconNewTipPreference.n0(this.f160741g);
            normalIconNewTipPreference.h0();
            ty4.q qVar = (ty4.q) ((uy4.x) i95.n0.c(uy4.x.class));
            boolean Ai = qVar.Ai();
            boolean z17 = !qVar.Ai();
            boolean wi6 = qVar.wi();
            boolean o07 = normalIconNewTipPreference.o0(Ai || (z17 && wi6));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "updateWeLab :%s %s %s %s", java.lang.Boolean.valueOf(o07), java.lang.Boolean.valueOf(Ai), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(wi6));
            if (!o07) {
                com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
                if (Ai) {
                    normalIconNewTipPreference.a0(0);
                    normalIconNewTipPreference.V = getString(com.tencent.mm.R.string.f490501wv);
                    normalIconNewTipPreference.W = com.tencent.mm.R.drawable.asx;
                    normalIconNewTipPreference.e5(rVar, true);
                } else {
                    normalIconNewTipPreference.a0(8);
                }
                if (!z17) {
                    normalIconNewTipPreference.Y = 8;
                    normalIconNewTipPreference.T1 = -1;
                } else if (wi6) {
                    normalIconNewTipPreference.Y = 0;
                    normalIconNewTipPreference.T1 = com.tencent.mm.R.drawable.b8i;
                    normalIconNewTipPreference.e5(rVar, true);
                } else {
                    normalIconNewTipPreference.Y = 0;
                    normalIconNewTipPreference.T1 = com.tencent.mm.R.raw.welab_icon_grey;
                }
                normalIconNewTipPreference.f152362f2 = new com.tencent.mm.plugin.setting.ui.setting.SettingsUI$$c(normalIconNewTipPreference);
                com.tencent.mm.plugin.newtips.model.r rVar2 = (com.tencent.mm.plugin.newtips.model.r) rn3.i.Di().c(new vn3.c(34)).first;
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "updateWeLab: getShouldShowType type:%s", rVar2);
                if (rVar2 == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NONE) {
                    java.lang.String c17 = v24.s0.c();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        normalIconNewTipPreference.D = true;
                        normalIconNewTipPreference.E = android.text.TextUtils.TruncateAt.END;
                        normalIconNewTipPreference.H(c17);
                    }
                }
            }
        }
        if (j65.e.d()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_care_mode", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_care_mode", false);
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_care_mode");
            if (j65.e.b()) {
                h17.H(getString(com.tencent.mm.R.string.ikb));
            }
        }
        super.onResume();
        if (!this.f160749r) {
            this.f160749r = true;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.wo(this));
        }
        if (!this.f160750s) {
            this.f160750s = true;
            n7(false);
        }
        com.tencent.mm.plugin.setting.ui.setting.g.f161052a.c(b7());
    }

    public final void p7() {
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_account_info");
        if (iconPreference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsUI", "safedevicesate preference is null");
            return;
        }
        iconPreference.Y(8);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().c(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257)) {
            iconPreference.c0(0);
        } else {
            iconPreference.c0(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1) {
            if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                iconPreference.a0(8);
                iconPreference.V = "";
                iconPreference.W = -1;
            } else if ((gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                iconPreference.V = getString(com.tencent.mm.R.string.f490501wv);
                iconPreference.W = com.tencent.mm.R.drawable.asx;
                iconPreference.a0(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "show voiceprint dot");
            }
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).notifyDataSetChanged();
        }
    }

    public final void q7() {
        js.x0 b17 = r61.q0.b();
        com.tencent.mm.ui.base.preference.SwitchKeyValuePreference switchKeyValuePreference = (com.tencent.mm.ui.base.preference.SwitchKeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_bind_mobile");
        if (switchKeyValuePreference != null) {
            js.x0 x0Var = js.x0.SUCC;
            js.x0 x0Var2 = js.x0.SUCC_UNLOAD;
            boolean z17 = b17 == x0Var || b17 == x0Var2;
            switchKeyValuePreference.M = z17;
            android.widget.TextView textView = switchKeyValuePreference.L;
            if (textView != null) {
                android.content.Context context = switchKeyValuePreference.f197770d;
                if (z17) {
                    iz5.a.g(null, context != null);
                    textView.setTextColor(new com.tencent.mm.ui.tools.gd(context).f210448a[0]);
                } else {
                    textView.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
                }
            }
            switchKeyValuePreference.G((b17 == x0Var || b17 == x0Var2) ? com.tencent.mm.R.string.iwm : com.tencent.mm.R.string.iwl);
        }
    }

    public final void r7() {
        com.tencent.mm.ui.base.preference.IconPreference iconPreference = (com.tencent.mm.ui.base.preference.IconPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_about_privacy");
        if (iconPreference != null) {
            if (((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue() > ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT, 0)).intValue()) {
                iconPreference.c0(0);
            } else {
                iconPreference.c0(8);
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_personal_privacy_switcher, 1) == 0) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_permission_index", true);
        }
        boolean z17 = gm0.j1.b().d() == gm0.j.WeChat;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_personal_privacy_list_entry_switcher, 1) == 0;
        if (z17 || z18) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_privacy_personal_list", true);
        }
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_settings_privacy_third_party_list_entry_switcher, 1) == 0;
        if (z17 || z19) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_privacy_third_party_list", true);
        }
    }

    public final void s7() {
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_about_micromsg");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1(java.lang.Boolean.valueOf(bk0.a.g().e(262145, 266243)), false);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b17 = bk0.a.g().b(262157, 266262);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b18 = bk0.a.g().b(262164, 266269);
        if (!m17) {
            rn3.i.Di().k(normalIconNewTipPreference);
        }
        normalIconNewTipPreference.n0(this.f160741g);
        normalIconNewTipPreference.h0();
        boolean o07 = normalIconNewTipPreference.o0(m17 || b17 || b18);
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        if (!o07) {
            if (m17) {
                normalIconNewTipPreference.a0(0);
                normalIconNewTipPreference.V = getString(com.tencent.mm.R.string.f490501wv);
                normalIconNewTipPreference.W = com.tencent.mm.R.drawable.asx;
                normalIconNewTipPreference.e5(com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_NEW, true);
            } else if (b17) {
                normalIconNewTipPreference.c0(0);
                normalIconNewTipPreference.e5(rVar, true);
            } else if (((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).mj()) {
                normalIconNewTipPreference.c0(0);
                normalIconNewTipPreference.e5(rVar, true);
            } else if (b18) {
                normalIconNewTipPreference.c0(0);
                normalIconNewTipPreference.e5(rVar, true);
            } else {
                normalIconNewTipPreference.c0(8);
                normalIconNewTipPreference.V = "";
                normalIconNewTipPreference.W = -1;
                normalIconNewTipPreference.a0(8);
            }
        }
        com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference2 = (com.tencent.mm.plugin.newtips.NormalIconNewTipPreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_about_system");
        rn3.i.Di().k(normalIconNewTipPreference2);
        normalIconNewTipPreference2.n0(this.f160741g);
        normalIconNewTipPreference2.h0();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean b19 = bk0.a.g().b(262158, 266265);
        boolean e17 = rn3.i.Ai().e(1);
        if (normalIconNewTipPreference2.o0(b19 || e17)) {
            return;
        }
        if (!b19 && !e17) {
            normalIconNewTipPreference2.c0(8);
        } else {
            normalIconNewTipPreference2.c0(0);
            normalIconNewTipPreference2.e5(rVar, true);
        }
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(t14.i.class);
    }

    public final void t7() {
        com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference iconSwitchKeyValuePreference = (com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f160741g).h("settings_teen_mode");
        if (iconSwitchKeyValuePreference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsUI", "updateTeenMode Preference null");
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).Xd()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_teen_mode", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsUI", "need hide teen-mode entrance");
            if (isTeenMode) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SettingsUI", "already enable TeenMode, need to close it manually");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).C5();
                return;
            }
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f160741g).m("settings_teen_mode", false);
        if (!isTeenMode) {
            iconSwitchKeyValuePreference.H("");
        } else if (((uh4.c0) i95.n0.c(uh4.c0.class)).Yd()) {
            iconSwitchKeyValuePreference.H(getString(com.tencent.mm.R.string.ikb));
        } else {
            iconSwitchKeyValuePreference.H(getString(com.tencent.mm.R.string.ikb));
        }
        iconSwitchKeyValuePreference.Z1 = -1;
        iconSwitchKeyValuePreference.h0();
    }
}
