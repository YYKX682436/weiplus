package com.tencent.mm.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class HomeUI implements com.tencent.mm.ui.n8, com.tencent.mm.ui.p8, com.tencent.mm.ui.o8, hh4.a {

    /* renamed from: a0, reason: collision with root package name */
    public static java.lang.Boolean f196738a0;

    /* renamed from: b0, reason: collision with root package name */
    public static java.lang.Boolean f196739b0;

    /* renamed from: c0, reason: collision with root package name */
    public static boolean f196740c0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.ImageView C;
    public android.view.View D;
    public android.widget.ImageView E;
    public android.view.MenuItem F;
    public android.view.MenuItem G;
    public android.view.View K;
    public final com.tencent.mm.sdk.event.IListener L;
    public final com.tencent.mm.sdk.event.IListener M;
    public final com.tencent.mm.sdk.event.IListener N;
    public final android.os.MessageQueue.IdleHandler O;
    public java.lang.String P;
    public final java.lang.Runnable Q;
    public int R;
    public long S;
    public final java.util.LinkedList T;
    public final vg3.d4 U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.b f196744c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f196745d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f196746e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196747f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f196749h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f196750i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f196751j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.rg f196752k;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f196758q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.m8 f196759r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.o7 f196760s;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.HomeUI.PlusActionView f196765x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f196766y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f196767z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f196742a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f196743b = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f196748g = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f196753l = true;

    /* renamed from: m, reason: collision with root package name */
    public int f196754m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f196755n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f196756o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.HomeUI.ActivityStatus f196757p = com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_CREATE;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.MainTabUI f196761t = new com.tencent.mm.ui.MainTabUI();

    /* renamed from: u, reason: collision with root package name */
    public boolean f196762u = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f196763v = new android.view.View.OnLayoutChangeListener(this) { // from class: com.tencent.mm.ui.HomeUI.6
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        }
    };

    /* renamed from: w, reason: collision with root package name */
    public final boolean f196764w = com.tencent.mm.sdk.platformtools.m2.j();
    public boolean H = true;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public long f196741J = 0;

    /* renamed from: com.tencent.mm.ui.HomeUI$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    class AnonymousClass1 implements com.tencent.mm.ui.fe {
        public AnonymousClass1() {
        }
    }

    /* loaded from: classes11.dex */
    public enum ActivityStatus {
        ACTIVITY_CREATE,
        ACTIVITY_RESUME,
        ACTIVITY_PAUSE
    }

    /* loaded from: classes5.dex */
    public class PlusActionView implements com.tencent.mm.plugin.newtips.model.a {
        public PlusActionView(int i17, int i18) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
            android.view.View inflate = android.view.LayoutInflater.from(com.tencent.mm.ui.HomeUI.this.f196758q).inflate(com.tencent.mm.R.layout.f487913bf, (android.view.ViewGroup) null);
            com.tencent.mm.ui.HomeUI.this.f196766y = inflate;
            com.tencent.mm.ui.HomeUI.this.f196767z = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h5n);
            com.tencent.mm.ui.HomeUI.this.A = com.tencent.mm.ui.HomeUI.this.f196766y.findViewById(com.tencent.mm.R.id.o_w);
            com.tencent.mm.ui.HomeUI.this.f196766y.setLayoutParams(layoutParams);
            com.tencent.mm.ui.HomeUI.this.f196766y.setMinimumHeight(i18);
            com.tencent.mm.ui.HomeUI.this.f196766y.setMinimumWidth(i17);
            com.tencent.mm.ui.HomeUI.this.f196767z.setImageResource(com.tencent.mm.R.raw.icons_outlined_add2);
            com.tencent.mm.ui.HomeUI.this.f196766y.setContentDescription(com.tencent.mm.ui.HomeUI.this.l(com.tencent.mm.R.string.jzq));
            com.tencent.mm.ui.HomeUI.this.f196766y.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.PlusActionView.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10919, "0");
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(3);
                    com.tencent.mm.ui.HomeUI.PlusActionView plusActionView = com.tencent.mm.ui.HomeUI.PlusActionView.this;
                    com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                    java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                    homeUI.o();
                    if (com.tencent.mm.ui.HomeUI.f196738a0.booleanValue()) {
                        com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        homeUI2.p(bool2, bool2);
                    }
                    if (com.tencent.mm.ui.HomeUI.f196739b0.booleanValue()) {
                        com.tencent.mm.ui.HomeUI.this.p(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
                    }
                    if (!com.tencent.mm.sdk.platformtools.s9.f192974b) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.mm.ui.HomeUI homeUI3 = com.tencent.mm.ui.HomeUI.this;
                        if (currentTimeMillis - homeUI3.f196741J > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                            homeUI3.f196741J = currentTimeMillis;
                            homeUI3.I = 1;
                        } else {
                            int i19 = homeUI3.I + 1;
                            homeUI3.I = i19;
                            if (i19 >= 5) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
                                com.tencent.mm.sdk.platformtools.s9.f192974b = true;
                            }
                        }
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            com.tencent.mm.ui.HomeUI.this.f196766y.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.PlusActionView.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.ui.HomeUI.this.f196758q.supportInvalidateOptionsMenu();
                }

                public java.lang.String toString() {
                    return super.toString() + "|supportInvalidateOptionsMenu";
                }
            });
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean T1(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean W5() {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean Y3(boolean z17) {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean Z3(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
            com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public java.lang.String getPath() {
            return "plus";
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public android.view.View h() {
            return com.tencent.mm.ui.HomeUI.this.f196766y;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean o0(boolean z17) {
            return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean q3(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean u6(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.tencent.mm.plugin.newtips.model.a
        public boolean y(boolean z17) {
            com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
            if (z17) {
                android.view.View view = homeUI.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            android.view.View view2 = homeUI.A;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f196738a0 = bool;
        f196739b0 = bool;
        f196740c0 = true;
    }

    public HomeUI() {
        new java.util.HashMap();
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.18
            {
                this.__eventId = -443124368;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                android.view.View view = homeUI.f196766y;
                if (view != null) {
                    view.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.18.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                            java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                            homeUI2.u(true);
                        }

                        public java.lang.String toString() {
                            return super.toString() + "|updatePlusMenuNewTips";
                        }
                    });
                }
                com.tencent.mm.ui.he heVar = homeUI.f196761t.f196922b;
                heVar.getClass();
                nm.j.f338443g.a(new com.tencent.mm.ui.we(heVar));
                return false;
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.19
            {
                this.__eventId = 871897161;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent) {
                final com.tencent.mm.autogen.events.NotifyMulitTaskIconShowEvent notifyMulitTaskIconShowEvent2 = notifyMulitTaskIconShowEvent;
                android.widget.TextView textView = com.tencent.mm.ui.HomeUI.this.f196746e;
                if (textView == null) {
                    return false;
                }
                textView.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.19.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                        boolean z17 = notifyMulitTaskIconShowEvent2.f54548g.f8018a;
                        java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                        homeUI.i(z17);
                    }

                    public java.lang.String toString() {
                        return super.toString() + "|updateMultiTaskIcon";
                    }
                });
                return false;
            }
        };
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MuteModePlayChangeEvent>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.20
            {
                this.__eventId = 2077291978;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MuteModePlayChangeEvent muteModePlayChangeEvent) {
                com.tencent.mm.autogen.events.MuteModePlayChangeEvent muteModePlayChangeEvent2 = muteModePlayChangeEvent;
                if (muteModePlayChangeEvent2 instanceof com.tencent.mm.autogen.events.MuteModePlayChangeEvent) {
                    boolean z17 = muteModePlayChangeEvent2.f54514g.f7249a;
                    boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                    boolean z18 = j65.e.b() && j65.e.g();
                    com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = homeUI.f196747f;
                    if (weImageView != null && !isTeenMode && z18 && homeUI.f196761t.f196925e == 0) {
                        weImageView.setVisibility(z17 ? 8 : 0);
                    }
                }
                return false;
            }
        };
        this.O = new android.os.MessageQueue.IdleHandler() { // from class: com.tencent.mm.ui.HomeUI.21
            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(15, null)) == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "not init finish , do not post sync task");
                    return false;
                }
                java.lang.String a17 = c01.b9.f37069c.a("login_user_name", "");
                if (c01.d9.h() || !a17.equals("")) {
                    c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.HomeUI$21$$a(), "launch normal"));
                }
                s75.d.b(new com.tencent.mm.booter.d3(new com.tencent.mm.booter.e3(com.tencent.mm.ui.HomeUI.this.f196758q)), "StartupReport_report");
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("mm_proc_startup", 0);
                com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("mm_proc_startup");
                com.tencent.mm.sdk.platformtools.o4.Z(sharedPreferences, R);
                java.lang.String[] split = R.getString("startup_info", "").split("=");
                if (split != null && split.length > 0) {
                    com.tencent.mm.booter.p2 p2Var = new com.tencent.mm.booter.p2();
                    if (p2Var.a(split[split.length - 1])) {
                        p2Var.f63551e = android.os.Process.myPid();
                        split[split.length - 1] = p2Var.toString();
                    }
                }
                int myPid = android.os.Process.myPid();
                int i17 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
                java.lang.String b17 = com.tencent.mm.booter.q2.b(split);
                java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d", 2, 1, java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), 0);
                if (b17.length() > 0) {
                    format = b17 + "=" + format;
                }
                R.putString("startup_info", format);
                com.tencent.mm.ui.HomeUI.this.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable(this) { // from class: com.tencent.mm.ui.HomeUI.21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.tencent.mm.plugin.report.service.c0.c();
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "loadFilesToReport error message : " + th6.getMessage());
                        }
                    }
                });
                android.os.Looper.myQueue().removeIdleHandler(com.tencent.mm.ui.HomeUI.this.O);
                return false;
            }
        };
        this.P = null;
        this.Q = new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.22
            @Override // java.lang.Runnable
            public void run() {
                ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
                int j17 = iq.b.j();
                if (j17 != 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j17), 14);
                }
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                if ((!iq.b.g(homeUI.f196758q) || iq.b.v(homeUI.f196758q)) && !iq.b.c(homeUI.f196758q, true)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("BaseScanUI_select_scan_mode", 1);
                    intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                    intent.putExtra("key_enable_multi_code", true);
                    intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
                    intent.putExtra("key_enable_scan_code_product_merge", true);
                    intent.putExtra("key_scan_report_enter_scene", 14);
                    java.lang.String str = homeUI.P;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    intent.putExtra("key_scan_launch_referrer", str);
                    intent.setFlags(65536);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11409, new java.lang.Object[0]);
                    j45.l.j(homeUI.f196758q, "scanner", ".ui.BaseScanUI", intent, null);
                    homeUI.P = null;
                }
            }
        };
        this.R = 0;
        this.S = android.os.SystemClock.elapsedRealtime();
        this.T = new java.util.LinkedList();
        this.U = new vg3.d4() { // from class: com.tencent.mm.ui.HomeUI.35
            @Override // vg3.d4
            public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (!(str == null ? "" : str).equals("showprivacypolicy") || map == null) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) map.get(".sysmsg.showprivacypolicy.device_id");
                java.lang.String str3 = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_content");
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                homeUI.f196749h = str3;
                homeUI.f196750i = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_ok");
                homeUI.f196751j = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_cancel");
                boolean equals = "yes".equals(map.get(".sysmsg.showprivacypolicy.needbirthday"));
                boolean equals2 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needopenplatform"));
                boolean equals3 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needconfirm"));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEED_OPENPLATFORM_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals2));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEED_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals3));
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "showprivacypolicy onNewXmlReceived, doubleCheckContent:%s, doubleCheckOk:%s, doubleCheckCancel:%s, needBirthday:%s, needOpenPlatform:%s, needConfirm:%s", homeUI.f196749h, homeUI.f196750i, homeUI.f196751j, java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(equals2), java.lang.Boolean.valueOf(equals3));
                if (!ot5.h.f348877a.a(str2, wo.w0.k(), "showprivacypolicy", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "device id not match");
                    return;
                }
                java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
                java.lang.String string = homeUI.f196758q.getString(com.tencent.mm.R.string.gbc, com.tencent.mm.sdk.platformtools.m2.d(), obj, "login", 1, java.lang.Integer.valueOf(equals2 ? 1 : 0));
                if (u11.c.f(obj)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "eu true, needconfirm: %s", java.lang.Boolean.valueOf(equals3));
                    if (equals3) {
                        com.tencent.mm.ui.HomeUI.e(homeUI, string, 22722, homeUI.f196758q.getString(com.tencent.mm.R.string.f492239fr2, com.tencent.mm.sdk.platformtools.m2.d()));
                    } else {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("close_dialog_msg", homeUI.f196749h);
                        bundle.putString("close_dialog_cancel", homeUI.f196751j);
                        bundle.putString("close_dialog_ok", homeUI.f196750i);
                        bundle.putBoolean("close_dialog_ok_close", false);
                        com.tencent.mm.ui.HomeUI.d(homeUI, string, 22722, bundle);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "eu false");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("close_dialog_msg", homeUI.f196758q.getString(com.tencent.mm.R.string.gb9));
                    bundle2.putString("close_dialog_cancel", homeUI.f196758q.getString(com.tencent.mm.R.string.git));
                    bundle2.putString("close_dialog_ok", homeUI.f196758q.getString(com.tencent.mm.R.string.gbb));
                    bundle2.putBoolean("close_dialog_ok_close", false);
                    com.tencent.mm.ui.HomeUI.d(homeUI, string, 22722, bundle2);
                }
                db5.f.h(homeUI.f196758q);
            }
        };
        this.V = 8589934591L;
        this.W = 8589934591L;
        this.X = 8589934591L;
        this.Y = 8589934591L;
        this.Z = 8589934591L;
    }

    public static void d(com.tencent.mm.ui.HomeUI homeUI, java.lang.String str, int i17, android.os.Bundle bundle) {
        homeUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (bundle != null) {
            intent.putExtra("key_close_action", 1);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        if (i17 > 0) {
            j45.l.n(homeUI.f196758q, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(homeUI.f196758q, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void e(com.tencent.mm.ui.HomeUI homeUI, java.lang.String str, int i17, java.lang.String str2) {
        homeUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("key_close_action", 2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("close_jump_url", str2);
            bundle.putInt("close_jump_url_request_code", 206);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        if (i17 > 0) {
            j45.l.n(homeUI.f196758q, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(homeUI.f196758q, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void f(final android.app.Activity activity) {
        final android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.f482435ei);
        if (findViewById == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, actionBarContainer == null");
            return;
        }
        if (!com.tencent.mm.ui.b4.c(activity)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, below 35, skip");
            return;
        }
        n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.ui.HomeUI$$e
            @Override // n3.k0
            public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, onApplyWindowInsetsListener");
                com.tencent.mm.ui.HomeUI.s(activity, view);
                return g3Var;
            }
        };
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(findViewById, k0Var);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.HomeUI$$f
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, requestApplyInsets");
                android.app.Activity activity2 = activity;
                android.view.View view = findViewById;
                com.tencent.mm.ui.HomeUI.s(activity2, view);
                java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                n3.y0.c(view);
                return jz5.f0.f302826a;
            }
        };
        if (n3.x0.b(findViewById)) {
            lVar.invoke(findViewById);
        } else {
            findViewById.addOnAttachStateChangeListener(new n3.x1(findViewById, lVar));
        }
    }

    public static void s(android.app.Activity activity, android.view.View view) {
        int h17 = com.tencent.mm.ui.bl.h(activity);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, statusBarHeight: %d", java.lang.Integer.valueOf(h17));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, already adjusted, skip");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // hh4.a
    public void a(float f17, int i17, int i18) {
        com.tencent.mm.ui.MMFragment g17 = getMainTabUI().g();
        if (g17 != null) {
            if (g17 instanceof com.tencent.mm.ui.MoreTabUI) {
                q(this.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e));
                return;
            }
            if (g17 instanceof com.tencent.mm.ui.conversation.MainUI) {
                q(i17);
            } else {
                q(this.f196758q.getResources().getColor(com.tencent.mm.R.color.a07));
            }
            if (i18 > 10) {
                k(this.D, false);
                k(this.f196766y, false);
            } else {
                k(this.D, true);
                k(this.f196766y, true);
            }
        }
    }

    @Override // hh4.a
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "updateStatusBar show: %b", java.lang.Boolean.valueOf(z17));
        v(this.f196758q.getResources().getColor(z17 ? com.tencent.mm.R.color.a07 : com.tencent.mm.R.color.a9e));
    }

    @Override // hh4.a
    public void c(float f17, int i17, int i18) {
        com.tencent.mm.ui.MainTabUI mainTabUI;
        android.widget.TextView textView;
        if (i17 != 0 && (textView = this.f196746e) != null) {
            long j17 = i17;
            if (this.X != j17) {
                textView.setTextColor(i17);
                this.X = j17;
            }
        }
        android.widget.ImageView imageView = this.E;
        if (imageView != null) {
            long j18 = i18;
            if (this.Y != j18) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this.f196758q, com.tencent.mm.R.raw.actionbar_icon_dark_search, i18));
                this.Y = j18;
            }
        }
        if (com.tencent.mm.ui.t7.f209881a.a() && (mainTabUI = this.f196761t) != null && mainTabUI.f196925e == 1) {
            android.widget.ImageView imageView2 = this.C;
            if (imageView2 != null) {
                long j19 = i18;
                if (this.Z != j19) {
                    imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(this.f196758q, com.tencent.mm.R.raw.person_plus_regular, i18));
                    this.Z = j19;
                    return;
                }
                return;
            }
            return;
        }
        android.widget.ImageView imageView3 = this.f196767z;
        if (imageView3 != null) {
            long j27 = i18;
            if (this.Z != j27) {
                imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(this.f196758q, com.tencent.mm.R.raw.icons_outlined_add2, i18));
                this.Z = j27;
            }
        }
    }

    public final void g() {
        if (com.tencent.mm.ui.t7.f209881a.a() && this.G != null) {
            if (getMainTabUI() == null || getMainTabUI().f196925e != 1 || this.B == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "bindPlusItemActionView plusActionView");
                this.G.setActionView(this.f196766y);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "bindPlusItemActionView addFriendActionView");
                this.G.setActionView(this.B);
            }
        }
    }

    public com.tencent.mm.ui.MainTabUI getMainTabUI() {
        return this.f196761t;
    }

    public final void h() {
        android.view.MenuItem menuItem;
        if (com.tencent.mm.ui.t7.f209881a.a()) {
            if (getMainTabUI() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "checkIfHideMenuItem getMainTabUI null");
                return;
            }
            int i17 = getMainTabUI().f196925e;
            if (i17 != 2) {
                if ((i17 == 0 || i17 == 1) && (menuItem = this.F) != null) {
                    menuItem.setVisible(false);
                    return;
                }
                return;
            }
            if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.ui.t7.f209883c).getValue()).booleanValue()) {
                return;
            }
            android.view.MenuItem menuItem2 = this.F;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
            }
            if (this.G == null || getMainTabUI() == null || getMainTabUI().f196925e != 2) {
                return;
            }
            this.G.setVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r25) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.HomeUI.i(boolean):void");
    }

    public void j() {
        com.tencent.mm.ui.conversation.MainUI mainUI;
        yf5.j0 j0Var;
        com.tencent.mm.ui.MainTabUI mainTabUI = this.f196761t;
        if (this.f196742a && (mainUI = (com.tencent.mm.ui.conversation.MainUI) mainTabUI.f196935o.get(0)) != null && (j0Var = mainUI.f207379v) != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f461991w) {
                w0Var.f461991w = false;
            }
        }
        com.tencent.mm.ui.he heVar = mainTabUI.f196922b;
        heVar.getClass();
        if (gm0.j1.a()) {
            c01.d9.b().p().e(heVar.f208874r);
            ((l75.a1) c01.d9.b().r()).e(heVar);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().m(heVar.f208873q);
            heVar.f208876t.dead();
            heVar.f208870n.dead();
            heVar.f208871o.dead();
        }
        zy2.ka kaVar = heVar.f208865f;
        if (kaVar != null) {
            ((com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105533g.dead();
        }
        com.tencent.mm.ui.af afVar = heVar.f208872p;
        java.lang.String str = null;
        if (afVar != null) {
            afVar.f197133a = null;
            heVar.f208872p = null;
        }
        mv.a0 a0Var = (mv.a0) i95.n0.c(mv.a0.class);
        mv.z listener = heVar.f208875s;
        nv.v1 v1Var = (nv.v1) a0Var;
        synchronized (v1Var) {
            kotlin.jvm.internal.o.g(listener, "listener");
            v1Var.f340402e.remove(listener);
        }
        com.tencent.mm.ui.o7 o7Var = this.f196760s;
        if (o7Var != null && o7Var.f209458i != null) {
            c01.d9.e().q(255, o7Var.f209458i);
            c01.d9.e().q(384, o7Var.f209458i);
            o7Var.f209458i = null;
        }
        z65.c.f470455a = false;
        this.f196757p = com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_PAUSE;
        if (!(c01.d9.f37105b == null)) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        }
        com.tencent.mm.ui.m8 m8Var = this.f196759r;
        boolean k17 = m8Var != null ? ((com.tencent.mm.ui.NewChattingTabUI) m8Var).k() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "edw onPause, chatting is show " + k17);
        if (!k17) {
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = this.f196761t.f196925e;
            kn4.i0 i0Var = (kn4.i0) uVar;
            i0Var.getClass();
            if (i17 == 0) {
                str = "MainUI";
            } else if (i17 == 1) {
                str = "AddressUI";
            } else if (i17 == 2) {
                str = "FindMoreFriendUI";
            } else if (i17 == 3) {
                str = "MoreTabUI";
            }
            if (str != null) {
                i0Var.Ai(str, 4);
            }
        }
        if (!this.f196758q.isFinishing()) {
            al5.a3.d(this.f196758q);
        }
        if (this.f196742a) {
            nm.j jVar = nm.j.f338443g;
            synchronized (jVar) {
                jVar.f338447d = true;
                if (jVar.f338445b) {
                    jVar.b();
                }
            }
            if (gm0.j1.a()) {
                this.L.dead();
            }
        }
        com.tencent.mm.ui.rg rgVar = this.f196752k;
        if (rgVar == null || !rgVar.c()) {
            return;
        }
        this.f196752k.a();
    }

    public final void k(android.view.View view, boolean z17) {
        if (view != null) {
            if (z17) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
                view.setBackground(null);
            }
        }
    }

    public java.lang.String l(int i17) {
        return this.f196758q.getString(i17);
    }

    public final void m() {
        android.widget.TextView textView;
        if (((com.tencent.mm.ui.NewChattingTabUI) this.f196759r).k()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] isChattingForeground True!");
            return;
        }
        if (this.f196744c == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] mActionBar == null");
            return;
        }
        this.f196748g = com.tencent.mm.ui.bk.C();
        this.f196744c.I(new android.graphics.drawable.ColorDrawable(this.f196758q.getResources().getColor(android.R.color.transparent)));
        this.f196744c.F(false);
        this.f196744c.B(false);
        this.f196744c.E(false);
        this.f196744c.D(true);
        this.f196744c.y(com.tencent.mm.ui.id.b(this.f196758q).inflate(com.tencent.mm.R.layout.f487919bl, (android.view.ViewGroup) new android.widget.LinearLayout(this.f196758q), false));
        android.widget.ImageView imageView = (android.widget.ImageView) this.f196744c.j().findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn);
        if (imageView != null) {
            imageView.setImageResource(((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? com.tencent.mm.R.raw.icons_multi_task_star_line_regular : com.tencent.mm.R.raw.icons_outlined_multitask);
            imageView.getDrawable().setColorFilter(this.f196758q.getResources().getColor(com.tencent.mm.R.color.FG_0), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.23
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/HomeUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.multitask.m0 Ni = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                Ni.j(bool, bool);
                ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(com.tencent.mm.ui.HomeUI.this.f196758q)).l7(true, 2);
                yj0.a.h(this, "com/tencent/mm/ui/HomeUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if ((bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalBounceLogSwitch()) == 1) && (textView = (android.widget.TextView) this.f196744c.j().findViewById(android.R.id.text1)) != null) {
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.24
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    new ul5.x(com.tencent.mm.ui.HomeUI.this.f196758q).show();
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        androidx.appcompat.app.b bVar = this.f196744c;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f196758q;
        bVar.w(com.tencent.mm.ui.uk.e(mMFragmentActivity, com.tencent.mm.R.color.f478861j7, mMFragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9)));
        w(true);
        this.f196744c.j().findViewById(com.tencent.mm.R.id.f482545hb).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.25
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                if (elapsedRealtime - homeUI.S < 300) {
                    java.util.Iterator it = homeUI.T.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                }
                homeUI.S = android.os.SystemClock.elapsedRealtime();
                yj0.a.h(this, "com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public final void n() {
        int i17 = this.f196761t.f196925e;
        if (i17 == 0) {
            ((com.tencent.mm.ui.conversation.MainUI) getMainTabUI().g()).getClass();
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Bi(this.f196758q, i17);
    }

    public final void o() {
        if (this.f196752k == null || !gm0.j1.a()) {
            return;
        }
        if (this.f196752k.c()) {
            this.f196752k.a();
            return;
        }
        com.tencent.mm.ui.rg rgVar = this.f196752k;
        com.tencent.mm.ui.gg ggVar = rgVar.f209743v;
        int i17 = 0;
        ggVar.a(false);
        android.util.SparseArray sparseArray = ggVar.f208697e;
        int size = sparseArray.size();
        android.content.Context context = rgVar.f209741t;
        if (size != 0) {
            rgVar.f209740s = sparseArray;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
            android.util.SparseArray sparseArray2 = rgVar.f209740s;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            } else {
                rgVar.f209740s = new android.util.SparseArray();
            }
            int i18 = 0;
            for (int i19 : com.tencent.mm.sdk.platformtools.f9.HomeMoreFeedback.h() ? com.tencent.mm.ui.rg.f209737z : com.tencent.mm.sdk.platformtools.t8.P0(context) ? com.tencent.mm.ui.rg.f209736y : com.tencent.mm.ui.rg.f209735x) {
                com.tencent.mm.ui.pg f17 = com.tencent.mm.ui.rg.f(i19);
                com.tencent.mm.ui.og ogVar = new com.tencent.mm.ui.og(f17);
                if (f17 != null) {
                    rgVar.f209740s.put(i18, ogVar);
                }
                i18++;
            }
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_open_pay_entry_default_logic, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "clicfg_android_open_pay_entry_default_logic is false");
        } else if (rgVar.f209740s == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "menuDataMap is null");
        } else if (c01.e2.a0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "wechat user, ignore");
        } else {
            int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            boolean z17 = true;
            if (intValue > 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "walletRegion is " + intValue + ", not chain mainland wallet, ignore");
            } else {
                int i27 = 0;
                while (true) {
                    if (i27 >= rgVar.f209740s.size()) {
                        z17 = false;
                        break;
                    }
                    com.tencent.mm.ui.pg pgVar = ((com.tencent.mm.ui.og) rgVar.f209740s.get(i27)).f209476b;
                    if (pgVar != null && pgVar.f209508c == 20) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "has offline pay entry in menuDataMap");
                        break;
                    }
                    i27++;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlusSubMenuHelper", "offline pay entry not in menuDataMap, manual add it");
                    jx3.f.INSTANCE.kvStat(34167, "1");
                    com.tencent.mm.ui.pg f18 = com.tencent.mm.ui.rg.f(20);
                    com.tencent.mm.ui.og ogVar2 = new com.tencent.mm.ui.og(f18);
                    if (f18 != null) {
                        android.util.SparseArray sparseArray3 = rgVar.f209740s;
                        sparseArray3.put(sparseArray3.size(), ogVar2);
                    }
                }
            }
        }
        try {
            if (((java.lang.Boolean) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_SUBMENU_SHOW_TIT_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                while (i17 < rgVar.f209740s.size() && ((com.tencent.mm.ui.og) rgVar.f209740s.get(i17)).f209476b.f209508c != 2147483646) {
                    i17++;
                }
                if (i17 == rgVar.f209740s.size()) {
                    com.tencent.mm.ui.pg f19 = com.tencent.mm.ui.rg.f(2147483646);
                    com.tencent.mm.ui.og ogVar3 = new com.tencent.mm.ui.og(f19);
                    if (f19 != null) {
                        android.util.SparseArray sparseArray4 = rgVar.f209740s;
                        sparseArray4.put(sparseArray4.size(), ogVar3);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.ui.mg mgVar = rgVar.f209739r;
        if (mgVar != null) {
            mgVar.notifyDataSetChanged();
        }
        rgVar.d(com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.afe));
    }

    public final void p(java.lang.Boolean bool, java.lang.Boolean bool2) {
    }

    public final void q(int i17) {
        androidx.appcompat.app.b bVar = this.f196744c;
        if (bVar != null) {
            long j17 = i17;
            if (this.V != j17) {
                if (i17 != 0) {
                    bVar.w(new android.graphics.drawable.ColorDrawable(i17));
                    android.view.View j18 = this.f196744c.j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(j18, arrayList.toArray(), "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(j18, "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    bVar.w(null);
                    android.view.View j19 = this.f196744c.j();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(j19, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(j19, "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.V = j17;
            }
        }
        android.view.View view = this.f196745d;
        if (view != null) {
            long j27 = i17;
            if (this.W != j27) {
                if (i17 != 0) {
                    view.setBackgroundColor(i17);
                } else {
                    view.setBackground(null);
                }
                this.W = j27;
            }
        }
    }

    public final void r() {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f196758q;
        if (mMFragmentActivity != null) {
            try {
                mMFragmentActivity.moveTaskToBack(true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (gm0.j1.a()) {
            gm0.j1.e().k(new java.lang.Runnable(this) { // from class: com.tencent.mm.ui.HomeUI.29
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.storage.n3 p17;
                    if (!gm0.j1.a() || (p17 = c01.d9.b().p()) == null) {
                        return;
                    }
                    p17.i(true);
                }
            }, 500L);
        }
        if (com.tencent.mm.app.i5.f53456c == null) {
            com.tencent.mm.app.i5.f53456c = new com.tencent.mm.app.i5();
        }
        com.tencent.mm.app.i5 i5Var = com.tencent.mm.app.i5.f53456c;
        i5Var.f53457a = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = i5Var.f53458b;
        n3Var.removeMessages(-1999);
        n3Var.removeMessages(-2999);
        n3Var.sendEmptyMessageDelayed(-1999, 3000L);
        n3Var.sendEmptyMessageDelayed(-2999, 30000L);
    }

    public void t() {
        boolean z17 = this.f196758q.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        boolean Y6 = ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this.f196758q)).Y6();
        if (!z17 || Y6) {
            com.tencent.mm.ui.ee.c(0);
            this.f196758q.setRequestedOrientation(1);
        } else {
            com.tencent.mm.ui.ee.c(1);
            this.f196758q.setRequestedOrientation(-1);
        }
    }

    public final void u(boolean z17) {
        if (this.f196752k == null || this.f196766y == null || this.f196765x == null) {
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "want update more menu new tips, but mmcore not ready");
            return;
        }
        this.f196752k.f209743v.a(z17);
        com.tencent.mm.ui.HomeUI.PlusActionView plusActionView = this.f196765x;
        com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
        if (!com.tencent.mm.plugin.newtips.model.i.l(homeUI.f196752k.f209743v.f208693a > 0, plusActionView)) {
            if (homeUI.f196752k.f209743v.f208693a > 0) {
                android.view.View view = homeUI.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = homeUI.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.newtips.model.i.b(plusActionView, com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT, homeUI.f196752k.f209743v.f208693a > 0);
        }
        com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent = new com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent();
        am.a00 a00Var = updateMainActionBarViewEvent.f54921g;
        a00Var.f6113a = 2;
        a00Var.f6115c = this.f196752k.f209743v.f208693a > 0;
        updateMainActionBarViewEvent.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(r4.f196758q)).Y6() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r5) {
        /*
            r4 = this;
            fp.m.e()
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.mm.ui.LauncherUI.getInstance()
            if (r0 == 0) goto L3e
            com.tencent.mm.ui.MainTabUI r1 = r0.f7()
            if (r1 == 0) goto L3e
            com.tencent.mm.ui.MainTabUI r0 = r0.f7()
            boolean r0 = r0.j()
            if (r0 != 0) goto L31
            java.lang.Class<ia0.n> r0 = ia0.n.class
            i95.m r0 = i95.n0.c(r0)
            ia0.n r0 = (ia0.n) r0
            com.tencent.mm.ui.MMFragmentActivity r1 = r4.f196758q
            ia0.o r0 = (ia0.o) r0
            zk3.c r0 = r0.Ai(r1)
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC r0 = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) r0
            boolean r0 = r0.Y6()
            if (r0 == 0) goto L3e
        L31:
            com.tencent.mm.ui.MMFragmentActivity r5 = r4.f196758q
            android.content.res.Resources r5 = r5.getResources()
            r0 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r5 = r5.getColor(r0)
        L3e:
            int r0 = r4.R
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            r1 = 50000(0xc350, float:7.0065E-41)
            if (r0 < r1) goto L65
            com.tencent.mm.ui.MMFragmentActivity r0 = r4.f196758q     // Catch: java.lang.NullPointerException -> L54
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.NullPointerException -> L54
            r0.setStatusBarColor(r5)     // Catch: java.lang.NullPointerException -> L54
            goto L65
        L54:
            r0 = move-exception
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r3 = "updateStatusBar %s"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r1)
        L65:
            r4.R = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.HomeUI.v(int):void");
    }

    public final void w(boolean z17) {
        android.view.MenuItem menuItem;
        android.view.MenuItem menuItem2;
        if (this.f196753l) {
            com.tencent.mm.ui.MainTabUI mainTabUI = this.f196761t;
            int i17 = mainTabUI.f196925e;
            java.lang.String l17 = l(com.tencent.mm.R.string.f490495wp);
            if (i17 == 0) {
                if (mainTabUI.i() > 0) {
                    if (!this.f196764w) {
                        l17 = ((java.lang.Object) l17) + " ";
                    }
                    l17 = ((java.lang.Object) l17) + "(" + mainTabUI.i() + ")";
                }
                com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent updateMainActionBarViewEvent = new com.tencent.mm.autogen.events.UpdateMainActionBarViewEvent();
                am.a00 a00Var = updateMainActionBarViewEvent.f54921g;
                a00Var.f6113a = 1;
                a00Var.f6114b = l17.toString();
                updateMainActionBarViewEvent.e();
            } else if (i17 == 1) {
                l17 = l(com.tencent.mm.R.string.gpx);
            } else if (i17 == 2) {
                l17 = l(com.tencent.mm.R.string.gpv);
            } else if (i17 == 3) {
                l17 = l(com.tencent.mm.R.string.gqv);
            }
            if (i17 == 3) {
                int color = this.f196758q.getResources().getColor(com.tencent.mm.R.color.a9e);
                v(color);
                boolean z18 = (!bi4.v1.g() ? false : ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(en1.a.a())) || com.tencent.mm.ui.bk.C();
                android.view.View decorView = this.f196758q.getWindow().getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                int i18 = z18 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192;
                if (systemUiVisibility != i18) {
                    decorView.setSystemUiVisibility(i18);
                }
                q(color);
                this.H = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "updateSettingTitle");
            } else {
                int color2 = this.f196758q.getResources().getColor(com.tencent.mm.R.color.a07);
                v(color2);
                boolean z19 = this.f196748g;
                android.view.View decorView2 = this.f196758q.getWindow().getDecorView();
                int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                int i19 = z19 ? systemUiVisibility2 & (-8193) : systemUiVisibility2 | 8192;
                if (systemUiVisibility2 != i19) {
                    decorView2.setSystemUiVisibility(i19);
                }
                q(color2);
                this.H = true;
                if ((this.f196754m == 2 && this.f196755n == 2) && (menuItem2 = this.F) != null && !menuItem2.isVisible()) {
                    this.F.setVisible(true);
                    h();
                }
                if ((this.f196754m == 2 && this.f196755n == 2) && (menuItem = this.G) != null && !menuItem.isVisible()) {
                    this.G.setVisible(true);
                    h();
                }
            }
            this.f196744c.G(0.0f);
            this.f196744c.p();
            this.f196746e = (android.widget.TextView) this.f196744c.j().findViewById(android.R.id.text1);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f196744c.j().findViewById(com.tencent.mm.R.id.h0y);
            this.f196747f = weImageView;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            android.widget.TextView textView = this.f196746e;
            if (textView != null) {
                textView.setText(l17);
                if (z17) {
                    la5.c cVar = la5.b.f317600a;
                    l17.getClass();
                    cVar.getClass();
                }
                if (i17 == 0) {
                    ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yz5.a() { // from class: com.tencent.mm.ui.HomeUI$$c
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                            com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                            homeUI.getClass();
                            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(homeUI.f196746e, en1.a.a(), bi4.c.PLANET, bi4.d.OUTLINED);
                            return null;
                        }
                    });
                } else {
                    ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yz5.a() { // from class: com.tencent.mm.ui.HomeUI$$d
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                            com.tencent.mm.ui.HomeUI homeUI = com.tencent.mm.ui.HomeUI.this;
                            homeUI.getClass();
                            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                            android.widget.TextView textView2 = homeUI.f196746e;
                            java.lang.String a17 = en1.a.a();
                            ((we0.j1) l0Var).getClass();
                            if (textView2 == null) {
                                return null;
                            }
                            if (a17 == null || r26.n0.N(a17)) {
                                return null;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "clearTextStatus: " + a17);
                            ej4.c0.f253335a.a(a17, textView2);
                            return null;
                        }
                    });
                }
                boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f196747f;
                if (weImageView2 != null && isTeenMode && i17 == 0) {
                    weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_umbrella);
                    this.f196747f.setVisibility(0);
                }
                boolean z27 = j65.e.b() && j65.e.g() && !j65.e.h();
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f196747f;
                if (weImageView3 != null && !isTeenMode && z27 && i17 == 0) {
                    weImageView3.setImageResource(com.tencent.mm.R.raw.icons_outlined_volume_mute);
                    this.f196747f.setVisibility(0);
                }
                if (this.f196754m == 3 && this.f196755n == 3) {
                    this.f196746e.setVisibility(8);
                } else {
                    this.f196746e.setVisibility(0);
                }
                if (com.tencent.mm.ui.f.a()) {
                    com.tencent.mm.ui.f.b(this.f196746e, com.tencent.mm.R.dimen.f479559b);
                    android.view.View findViewById = this.f196744c.j().findViewById(com.tencent.mm.R.id.o3d);
                    if (findViewById instanceof android.widget.TextView) {
                        com.tencent.mm.ui.f.b((android.widget.TextView) findViewById, com.tencent.mm.R.dimen.f479559b);
                    }
                } else {
                    float f17 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479559b);
                    if (this.f196746e.getTextSize() != f17) {
                        this.f196746e.setTextSize(0, f17);
                    }
                }
                int color3 = this.f196758q.getResources().getColor(com.tencent.mm.R.color.by);
                if (this.f196748g && this.f196746e.getCurrentTextColor() != color3) {
                    this.f196746e.setTextColor(color3);
                }
                com.tencent.mm.ui.bk.r0(this.f196746e.getPaint(), 0.8f);
            }
            i(true);
        }
    }

    /* loaded from: classes11.dex */
    public static class FitSystemWindowLayoutView extends android.widget.FrameLayout {

        /* renamed from: d, reason: collision with root package name */
        public int f196813d;

        /* renamed from: e, reason: collision with root package name */
        public final android.graphics.Rect f196814e;

        /* renamed from: f, reason: collision with root package name */
        public android.view.ViewGroup f196815f;

        public FitSystemWindowLayoutView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f196814e = new android.graphics.Rect();
            this.f196815f = null;
        }

        @Override // android.view.View
        public boolean fitSystemWindows(android.graphics.Rect rect) {
            java.lang.Object obj;
            boolean fitSystemWindows;
            java.lang.Object[] objArr = new java.lang.Object[4];
            boolean z17 = false;
            objArr[0] = rect.toString();
            objArr[1] = java.lang.Integer.valueOf(this.f196813d);
            objArr[2] = java.lang.Integer.valueOf(hashCode());
            if (rect.height() == 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS;
            }
            objArr[3] = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "fitSystemWindows beg %s, cacheInsetsTop:%d, hashCode:%d stack:%s", objArr);
            int i17 = rect.top;
            if (i17 > 0) {
                this.f196813d = i17;
            }
            android.view.ViewGroup viewGroup = this.f196815f;
            if (viewGroup != null && (viewGroup.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f196815f.getLayoutParams();
                int i18 = marginLayoutParams.bottomMargin;
                int i19 = marginLayoutParams.rightMargin;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "try to setFitSystemWindowsBottomRightPadding: %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485486u90);
                if (viewGroup2 == null) {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= getChildCount()) {
                            break;
                        }
                        android.view.View childAt = getChildAt(i27);
                        if (childAt instanceof com.tencent.mm.ui.tools.TestTimeForChatting) {
                            com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = (com.tencent.mm.ui.tools.TestTimeForChatting) childAt;
                            if (java.lang.Float.compare(i18, i65.a.b(testTimeForChatting.getContext(), 48) * 2.0f) > 0 || i18 < 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.TestTimeForChatting", "ERROR bottom padding %d", java.lang.Integer.valueOf(i18));
                                testTimeForChatting.f210263f = 0;
                            } else {
                                testTimeForChatting.f210263f = i18;
                            }
                            if (java.lang.Float.compare(i19, i65.a.b(testTimeForChatting.getContext(), 48) * 2.0f) > 0 || i19 < 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.TestTimeForChatting", "ERROR right padding %d", java.lang.Integer.valueOf(i18));
                                testTimeForChatting.f210264g = 0;
                            } else {
                                testTimeForChatting.f210264g = i19;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "setFitSystemWindowsUseActionBarContainer: %d %d OK", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        } else {
                            i27++;
                        }
                    }
                } else {
                    int i28 = 0;
                    while (true) {
                        if (i28 >= viewGroup2.getChildCount()) {
                            break;
                        }
                        android.view.View childAt2 = viewGroup2.getChildAt(i28);
                        if (childAt2 instanceof com.tencent.mm.ui.tools.TestTimeForChatting) {
                            com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout chattingUILayout = (com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout) childAt2.findViewById(com.tencent.mm.R.id.bkb);
                            if (chattingUILayout != null) {
                                if (java.lang.Float.compare(i18, i65.a.b(chattingUILayout.getContext(), 48) * 2.0f) > 0 || i18 < 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUILayout", "ERROR bottom padding %d", java.lang.Integer.valueOf(i18));
                                    chattingUILayout.f190137n = 0;
                                } else {
                                    chattingUILayout.f190137n = i18;
                                }
                                if (java.lang.Float.compare(i19, i65.a.b(chattingUILayout.getContext(), 48) * 2.0f) > 0 || i19 < 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUILayout", "ERROR right padding %d", java.lang.Integer.valueOf(i18));
                                    chattingUILayout.f190138o = 0;
                                } else {
                                    chattingUILayout.f190138o = i19;
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "[chattingFragmentView]setFitSystemWindowsUseActionBarContainer: %d %d OK", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        } else {
                            i28++;
                        }
                    }
                }
                com.tencent.mm.ui.bk.f197978a.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.graphics.Rect rect2 = this.f196814e;
            rect2.set(rect);
            if (fp.h.c(14)) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f485486u90);
                if (viewGroup3 == null) {
                    for (int i29 = 0; i29 < getChildCount(); i29++) {
                        android.view.View childAt3 = getChildAt(i29);
                        if (childAt3 instanceof com.tencent.mm.ui.tools.TestTimeForChatting) {
                            childAt3.setFitsSystemWindows(true);
                            fitSystemWindows = ((com.tencent.mm.ui.tools.TestTimeForChatting) childAt3).fitSystemWindows(rect);
                            childAt3.setFitsSystemWindows(false);
                            z17 = fitSystemWindows;
                            break;
                        }
                    }
                } else {
                    int i37 = 0;
                    while (true) {
                        if (i37 >= viewGroup3.getChildCount()) {
                            break;
                        }
                        android.view.View childAt4 = viewGroup3.getChildAt(i37);
                        if (childAt4 instanceof com.tencent.mm.ui.tools.TestTimeForChatting) {
                            com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout chattingUILayout2 = (com.tencent.mm.pluginsdk.ui.chat.ChattingUILayout) childAt4.findViewById(com.tencent.mm.R.id.bkb);
                            if (chattingUILayout2 != null) {
                                chattingUILayout2.setFitsSystemWindows(true);
                                fitSystemWindows = chattingUILayout2.fitSystemWindows(rect);
                                chattingUILayout2.setFitsSystemWindows(false);
                            }
                        } else {
                            i37++;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return super.fitSystemWindows(rect2);
        }

        public int getCacheInsetsTop() {
            return this.f196813d;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i17, int i18) {
            try {
                super.onMeasure(i17, i18);
            } catch (java.lang.ClassCastException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "my layout params %s %s", getLayoutParams(), getLayoutParams().getClass());
                int childCount = getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = getChildAt(i19);
                    com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", java.lang.Integer.valueOf(i19), childAt, childAt.getLayoutParams(), childAt.getLayoutParams().getClass());
                }
                for (int i27 = 0; i27 < childCount; i27++) {
                    android.view.View childAt2 = getChildAt(i27);
                    if ((childAt2 instanceof android.widget.ImageView) && childAt2.getId() == com.tencent.mm.R.id.l3_ && childAt2.getLayoutParams() != null && (childAt2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && !(childAt2.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams)) {
                        childAt2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(childAt2.getLayoutParams()));
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", java.lang.Integer.valueOf(i27), childAt2, childAt2.getLayoutParams(), childAt2.getLayoutParams().getClass());
                }
                super.onMeasure(i17, i18);
            }
        }

        public void setActionBarContainer(android.view.ViewGroup viewGroup) {
            this.f196815f = viewGroup;
            com.tencent.mm.ui.HomeUI.f((android.app.Activity) getContext());
        }

        public FitSystemWindowLayoutView(android.content.Context context) {
            super(context);
            this.f196814e = new android.graphics.Rect();
            this.f196815f = null;
        }
    }
}
