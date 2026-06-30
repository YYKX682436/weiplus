package com.tencent.mm.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class LauncherUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity {
    private com.tencent.mm.ui.NewChattingTabUI chattingTabUI;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f196828h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyEnterChattingEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.LauncherUI.1
        {
            this.__eventId = -1684644523;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NotifyEnterChattingEvent notifyEnterChattingEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "enterChattingUIEventIListener execute");
            android.content.Intent intent = new android.content.Intent(com.tencent.mm.ui.LauncherUI.this, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
            intent.putExtra("nofification_type", "new_msg_nofification");
            intent.putExtra("Main_User", notifyEnterChattingEvent.f54540g.f7250a);
            intent.putExtra("talkerCount", 1);
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            intent.addFlags(67108864);
            com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(launcherUI, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            launcherUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(launcherUI, "com/tencent/mm/ui/LauncherUI$1", "callback", "(Lcom/tencent/mm/autogen/events/NotifyEnterChattingEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.HomeUI f196829i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.z8 f196830m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Intent f196831n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f196832o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f196833p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196834q;

    /* renamed from: r, reason: collision with root package name */
    public qg0.y f196835r;

    /* renamed from: s, reason: collision with root package name */
    public final o25.n2 f196836s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f196837t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f196838u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f196839v;

    /* renamed from: w, reason: collision with root package name */
    public int f196840w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f196841x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.ArrayList f196826y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.ArrayList f196827z = new java.util.ArrayList();
    public static boolean A = true;
    public static boolean B = false;
    public static java.lang.Boolean C = null;

    public LauncherUI() {
        com.tencent.mm.ui.HomeUI homeUI = new com.tencent.mm.ui.HomeUI();
        this.f196829i = homeUI;
        this.chattingTabUI = new com.tencent.mm.ui.NewChattingTabUI(homeUI);
        this.f196830m = new com.tencent.mm.ui.z8();
        this.f196831n = null;
        this.f196832o = false;
        this.f196833p = false;
        this.f196834q = false;
        this.f196836s = new o25.n2("MicroMsg.LauncherUI");
        this.f196837t = new com.tencent.mm.sdk.platformtools.n3();
        this.f196838u = new com.tencent.mm.ui.l8(this);
        this.f196839v = false;
        this.f196840w = 0;
        this.f196841x = false;
    }

    public static int getCurrentTabIndex() {
        if (getInstance() == null || getInstance().getHomeUI() == null || getInstance().getHomeUI().getMainTabUI() == null) {
            return -1;
        }
        return getInstance().getHomeUI().getMainTabUI().f196925e;
    }

    public static com.tencent.mm.ui.LauncherUI getInstance() {
        java.util.ArrayList arrayList = f196826y;
        if (!arrayList.isEmpty()) {
            return (com.tencent.mm.ui.LauncherUI) arrayList.get(0);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI", "LauncherUI instances should not be empty. %s", new com.tencent.mm.sdk.platformtools.z3());
        return null;
    }

    public static void n7(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/LauncherUI", "startMainTabUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public boolean W6() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI;
        if (C == null) {
            C = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.d0());
        }
        return (!C.booleanValue() || (newChattingTabUI = this.chattingTabUI) == null) ? !C.booleanValue() : newChattingTabUI.k();
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public void X6() {
        super.X6();
        if (this.f196832o) {
            this.chattingTabUI.o(true, 0);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.huh);
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(1);
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public void Y6() {
        android.widget.ImageView imageView;
        if (!this.chattingTabUI.k() && (imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l3_)) != null && imageView.getDrawable() != null) {
            imageView.setImageDrawable(null);
        }
        if (this.f196832o) {
            this.chattingTabUI.o(false, 0);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.huh);
        if (viewGroup == null || com.tencent.mm.ui.bk.y()) {
            return;
        }
        viewGroup.setImportantForAccessibility(4);
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onVASEnter hasPauseByVASEnter:%s", java.lang.Boolean.valueOf(this.f196841x));
        if (getCurrentTabIndex() == 2) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yj(com.tencent.mm.plugin.finder.extension.reddot.b3.f105415f);
        }
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (newChattingTabUI == null || !newChattingTabUI.k()) {
            return;
        }
        com.tencent.mm.ui.MMFragment currentFragmet = getCurrentFragmet();
        if (currentFragmet instanceof com.tencent.mm.ui.chatting.BaseChattingUIFragment) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onVASEnter!! chatting onPause");
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = (com.tencent.mm.ui.chatting.BaseChattingUIFragment) currentFragmet;
            baseChattingUIFragment.l0();
            baseChattingUIFragment.o0();
            com.tencent.mm.autogen.events.PatTipNeedDismissEvent patTipNeedDismissEvent = new com.tencent.mm.autogen.events.PatTipNeedDismissEvent();
            patTipNeedDismissEvent.f54606g.f8594a = false;
            patTipNeedDismissEvent.e();
            baseChattingUIFragment.f198152f.f460714i = false;
            this.f196841x = true;
            this.chattingTabUI.i(false);
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher
    public void a7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onVASExit hasPauseByVASEnter:%s", java.lang.Boolean.valueOf(this.f196841x));
        getHomeUI().t();
        if (this.f196841x) {
            if (this.chattingTabUI != null) {
                com.tencent.mm.ui.MMFragment currentFragmet = getCurrentFragmet();
                if (currentFragmet instanceof com.tencent.mm.ui.chatting.BaseChattingUIFragment) {
                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = (com.tencent.mm.ui.chatting.BaseChattingUIFragment) currentFragmet;
                    boolean z17 = baseChattingUIFragment.f198152f.f460714i;
                    boolean z18 = !isPaused();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onVASExit!! try chatting onResume isForeground:%s isActivityForeground:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                    if (!z17) {
                        baseChattingUIFragment.f198152f.f460714i = true;
                        if (z18) {
                            baseChattingUIFragment.n0();
                            baseChattingUIFragment.m0();
                            this.chattingTabUI.i(true);
                        }
                    }
                }
            }
            this.f196841x = false;
        }
        if (getCurrentTabIndex() == 2) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.plugin.finder.extension.reddot.b3 b3Var = com.tencent.mm.plugin.finder.extension.reddot.b3.f105415f;
            c61.l7 l7Var = (c61.l7) b6Var;
            l7Var.getClass();
            l7Var.nk().r(b3Var, null);
        }
        com.tencent.mm.ui.he heVar = getHomeUI().f196761t.f196922b;
        heVar.getClass();
        nm.j.f338443g.a(new com.tencent.mm.ui.ue(heVar, null));
        zy2.ka kaVar = heVar.f208865f;
        if (kaVar != null) {
            ((com.tencent.mm.plugin.finder.extension.reddot.g) kaVar).f105533g.alive();
            zy2.ia.n0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "Discovery", null, 2, null);
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.w1) ((zy2.e9) i95.n0.c(zy2.e9.class))).Ri();
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity
    /* renamed from: b7 */
    public boolean getF152056g() {
        xn5.q0.a();
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigLauncherUIX2CPreload()) == 1;
    }

    public final void c7() {
        if (!gm0.j1.b().m()) {
            if (gm0.j1.b().n()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "[whatsnew] account not initiate, skip whatsnew.");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "[whatsnew] not login yet, skip.");
                return;
            }
        }
        android.content.Intent intent = this.f196831n;
        if (!((intent == null || com.tencent.mm.sdk.platformtools.c2.c(intent, "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "[whatsnew] notSwitchOrHold is false, skip whatsnew.");
            return;
        }
        boolean c17 = com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI.enter_from_reg", false);
        boolean g17 = la5.b.f317600a.g(true);
        k35.o oVar = k35.p.f303943a;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(c17);
        objArr[1] = java.lang.Boolean.valueOf(gm0.j1.a());
        objArr[2] = java.lang.Boolean.valueOf(oVar == null);
        objArr[3] = java.lang.Boolean.FALSE;
        objArr[4] = java.lang.Boolean.valueOf(g17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "[whatsnew] do not show whatsnew. enter_from_reg=%s accHasReady=%s MMAppMgr is null %s isWhatsNewAvailable=%s, isAccessibilityEnabled=%s", objArr);
    }

    public void closeChatting(boolean z17) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView;
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        if (this.chattingTabUI.f(z17)) {
            boolean isSupportCustomActionBar = this.chattingTabUI.f197027n.isSupportCustomActionBar();
            com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
            if (!isSupportCustomActionBar) {
                homeUI.m();
            }
            homeUI.f196758q.supportInvalidateOptionsMenu();
            java.lang.String str = null;
            if (c01.z1.H().booleanValue()) {
                if (gm0.j1.a()) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340227, null)));
                    if (!valueOf.booleanValue() && !com.tencent.mm.ui.contact.a4.f206579n.booleanValue()) {
                        com.tencent.mm.ui.HomeUI.f196738a0 = java.lang.Boolean.TRUE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(340240, null), 0L);
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340230, null)));
                    java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340228, null)));
                    java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340229, null)));
                    if (valueOf.booleanValue() && valueOf3.booleanValue() && valueOf4.booleanValue() && !valueOf2.booleanValue() && currentTimeMillis >= 432000000) {
                        com.tencent.mm.ui.HomeUI.f196739b0 = java.lang.Boolean.TRUE;
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready");
                }
            }
            com.tencent.mm.ui.MainTabUI mainTabUI = homeUI.f196761t;
            if (mainTabUI.f196925e == 0 && gm0.j1.n().f273288b.f70771n) {
                ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
            } else {
                ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mainTabUI.f196921a.findViewById(com.tencent.mm.R.id.huh);
            if (viewGroup != null) {
                viewGroup.setImportantForAccessibility(1);
            }
            java.util.HashMap hashMap = mainTabUI.f196935o;
            com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) hashMap.get(0);
            if (mainUI != null) {
                mainUI.s0();
            }
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = mainTabUI.f196925e;
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
                i0Var.Ai(str, 3);
            }
            com.tencent.mm.ui.conversation.MainUI mainUI2 = (com.tencent.mm.ui.conversation.MainUI) hashMap.get(0);
            if (mainUI2 != null) {
                mainUI2.getContentView();
                com.tencent.mm.ui.ga gaVar = mainUI2.mController;
                if (gaVar != null) {
                    gaVar.l0();
                }
                mainUI2.onHiddenChanged(false);
            }
            com.tencent.mm.ui.MainTabUI f76 = f7();
            f76.f196929i = java.lang.Boolean.FALSE;
            com.tencent.mm.ui.conversation.MainUI mainUI3 = (com.tencent.mm.ui.conversation.MainUI) f76.f196935o.get(0);
            if (mainUI3 == null || (conversationListView = mainUI3.f207372o) == null || (rVar = conversationListView.f207318m) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "onChattingClose");
            ((com.tencent.mm.plugin.taskbar.ui.z) rVar).f172789z1 = false;
        }
    }

    public final void d7() {
        java.util.ArrayList arrayList = f196826y;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "checktask delteInstance index %d, size:%d, hashCode: 0x%x", java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(hashCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c3, code lost:
    
        if (r3 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        if (r3 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.LauncherUI.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public java.lang.String e7() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        yb5.d dVar;
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        return (newChattingTabUI == null || (baseChattingUIFragment = newChattingTabUI.f197027n) == null || (dVar = baseChattingUIFragment.f198152f) == null) ? "" : dVar.x();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    public com.tencent.mm.ui.MainTabUI f7() {
        return this.f196829i.getMainTabUI();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        d7();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f196826y.size());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "checktask Launcherui onfinish 0x%x,instance size %d, stack: %s", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    public boolean forceRemoveNoMatchOnPath() {
        this.chattingTabUI.getClass();
        return true;
    }

    public final boolean g7() {
        android.content.Intent intent = this.f196831n;
        if (intent != null) {
            if (com.tencent.mm.sdk.platformtools.c2.c(intent, "absolutely_exit", false) || com.tencent.mm.sdk.platformtools.c2.g(this.f196831n, "absolutely_exit_pid", 0) == android.os.Process.myPid()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI", "resumeLogoutJump launcherOnResume exit absolutely!!! hashCode[%d]", java.lang.Integer.valueOf(hashCode()));
                finish();
                com.tencent.mm.ui.vb.f(com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "kill_service", true));
                return true;
            }
            if (com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "can_finish", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump exit obviously");
                c01.d9.e().v(true);
                if (gm0.k2.c(getApplicationContext())) {
                    android.content.Context applicationContext = getApplicationContext();
                    if (com.tencent.mm.booter.o.d()) {
                        com.tencent.mm.app.d0.e();
                    } else {
                        try {
                            applicationContext.stopService(new android.content.Intent(applicationContext, (java.lang.Class<?>) com.tencent.mm.booter.CoreService.class));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.CoreServiceHelper", "stopServiceInstance() Exception:%s", e17.getMessage());
                        }
                    }
                }
                com.tencent.mm.plugin.report.service.f0.e(8);
                sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_FORCE_DEACTIVE").setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b), com.tencent.mm.sdk.platformtools.v9.a());
                finish();
                db5.f.k(this);
                return true;
            }
            if (com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "exit_and_restart", false)) {
                com.tencent.mars.WeChatMars.onSingalCrash(0);
                if (com.tencent.paymars.WeChatMars.isEnable()) {
                    com.tencent.paymars.WeChatMars.onSingalCrash(0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "exit and restart myself.");
                com.tencent.mars.xlog.Log.appenderFlush();
                finish();
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
                intent2.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "restart, try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
                com.tencent.mm.ui.vb.i();
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "handleExitIntent", "()Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public com.tencent.mm.ui.MMFragment getCurrentFragmet() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = !newChattingTabUI.f197024k ? newChattingTabUI.f197027n : null;
        return baseChattingUIFragment == null ? super.getCurrentFragmet() : baseChattingUIFragment;
    }

    public com.tencent.mm.ui.HomeUI getHomeUI() {
        return this.f196829i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.LauncherUI.h7(android.content.Intent):void");
    }

    public boolean i7() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (newChattingTabUI != null) {
            return newChattingTabUI.k();
        }
        return false;
    }

    public final void j7(android.content.Intent intent, com.tencent.mm.ui.LauncherUI launcherUI, java.lang.String str) {
        intent.putExtra("Contact_User", "opencustomerservicemsg");
        intent.putExtra("open_im_kefu_chatting_username", str);
        intent.putExtra("open_im_kefu_jump_chatting", true);
        intent.putExtra("open_im_kefu_conversation_list_ui_from_scene", 2);
        intent.addFlags(67108864);
        j45.l.u(this, ".ui.conversation.OpenImKefuServiceConversationUI", intent, null);
        launcherUI.overridePendingTransition(0, com.tencent.mm.R.anim.f477848d6);
    }

    public final void k7(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "handleJump, isWxGame and LiteApp");
        intent.putExtra("Chat_User", "gh_25d9ac85a4bc");
        intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(this, intent);
    }

    public final void l7(boolean z17) {
        com.tencent.mm.ui.z8 z8Var = this.f196830m;
        if (z17) {
            z8Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "ingore check permission on init");
            return;
        }
        z8Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "checkOnResume");
        if (z8Var.f212606a) {
            z8Var.f212606a = false;
        }
    }

    public final void m7() {
        boolean z17;
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump");
        if (this.f196831n != null && com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI.jump_from_uimode_check", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "dancy uimode check from background, not jumpToLogin or welcome!");
            return;
        }
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "LauncherUI.Shortcut.LaunchType");
        if (l17 != null) {
            if (l17.equals("launch_type_scan_qrcode")) {
                com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct();
                wC3DTouchHomeShortCutStruct.f62064d = 2L;
                wC3DTouchHomeShortCutStruct.f62065e = 2L;
                wC3DTouchHomeShortCutStruct.k();
                wC3DTouchHomeShortCutStruct.o();
            } else if (l17.equals("launch_type_offline_wallet")) {
                com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct();
                wC3DTouchHomeShortCutStruct2.f62064d = 1L;
                wC3DTouchHomeShortCutStruct2.f62065e = 2L;
                wC3DTouchHomeShortCutStruct2.k();
                wC3DTouchHomeShortCutStruct2.o();
            } else if (l17.equals("launch_type_my_qrcode")) {
                com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct wC3DTouchHomeShortCutStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct();
                wC3DTouchHomeShortCutStruct3.f62064d = 3L;
                wC3DTouchHomeShortCutStruct3.f62065e = 2L;
                wC3DTouchHomeShortCutStruct3.k();
                wC3DTouchHomeShortCutStruct3.o();
            }
        }
        com.tencent.mm.ui.uc.a();
        com.tencent.mm.ui.uc.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.ui.fl.b(context);
        com.tencent.mm.ui.v7.b(context);
        com.tencent.mm.ui.w9.b(context);
        com.tencent.mm.ui.rk.b(context);
        com.tencent.mm.ui.eg.c(context);
        com.tencent.mm.ui.ee.d(2);
        c01.b9 b9Var = c01.b9.f37069c;
        java.lang.String a17 = b9Var.a("login_user_name", "");
        boolean h17 = c01.d9.h();
        java.lang.Runnable runnable = this.f196838u;
        if (!h17 && a17.equals("")) {
            v61.g0 g0Var = v61.h0.f433441a;
            if (com.tencent.mm.ui.bk.A()) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginSelectUI.class);
                intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                intent.putExtra("mobile_input_purpose", 1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.WelcomeActivity.class);
                intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeLogoutJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            db5.f.h(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump but has not login and ret");
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 2000L);
            return;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("PREF_KEY_LAST_AUTH_FLAG", -1);
        android.content.Intent intent3 = this.f196831n;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeLogoutJump hasDoInit:%b needResetLaunchUI:%b formNotification:%b, ishold:%b", java.lang.Boolean.valueOf(this.f196832o), java.lang.Boolean.valueOf(intent3 != null && (intent3.getFlags() & 67108864) == 67108864), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "Intro_Notify", false)), java.lang.Boolean.valueOf(gm0.m.r()));
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "doOnResumeImp resumeLogoutJump hasCfgDefaultUin[%b]", java.lang.Boolean.valueOf(c01.d9.h()));
        gm0.m.o();
        if (com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI.From.Scaner.Shortcut", false)) {
            this.f196834q = true;
        }
        boolean c17 = com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "Intro_Switch", false);
        boolean z27 = gm0.m.f273236y;
        boolean s17 = gm0.m.s();
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            z17 = false;
            com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "LauncherUI.jump_switch_account", false);
            com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "Intro_Switch", false);
        } else {
            z17 = false;
        }
        if (com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "LauncherUI.jump_switch_account", z17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "launcher to switch account");
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "switch to wxid %s", com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).getString("last_switch_account_to_wx_username", ""));
            android.content.Intent intent4 = new android.content.Intent();
            intent4.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.class);
            intent4.addFlags(268468224);
            intent4.putExtra("key_scene", 1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "switchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.h(this);
        } else {
            if (c17) {
                z18 = c17;
            } else {
                z18 = c17;
                if (!this.f196832o && !z27 && !s17) {
                    if (!com.tencent.mm.sdk.platformtools.c2.c(this.f196831n, "LauncherUI.jump_switch_account", false)) {
                        java.lang.String a18 = b9Var.a("login_user_name", "");
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "%s jumpToLogin", a18);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                            v61.g0 g0Var2 = v61.h0.f433441a;
                            if (com.tencent.mm.ui.bk.A()) {
                                android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginSelectUI.class);
                                intent5.putExtra("mobile_input_purpose", 1);
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                arrayList4.add(intent5);
                                java.util.Collections.reverse(arrayList4);
                                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList4.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else {
                                android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.WelcomeActivity.class);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(intent6);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList5.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.h(this);
                            }
                        } else {
                            boolean z28 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).getBoolean("last_logout_switch_account", false);
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "switchAccount %s", java.lang.Boolean.valueOf(z28));
                            if (z28) {
                                android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.class);
                                intent7.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                                intent7.putExtra("key_scene", 2);
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList6.add(intent7);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList6.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.i(this);
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "pluginSwitch  " + com.tencent.mm.sdk.platformtools.t8.D1(b9Var.a("last_login_use_voice", ""), 0));
                                android.content.Intent intent8 = new android.content.Intent();
                                intent8.putExtra("key_errType", com.tencent.mm.sdk.platformtools.c2.g(this.f196831n, "key_errType", 0));
                                intent8.putExtra("key_errCode", com.tencent.mm.sdk.platformtools.c2.g(this.f196831n, "key_errCode", 0));
                                intent8.putExtra("key_errMsg", com.tencent.mm.sdk.platformtools.c2.l(this.f196831n, "key_errMsg"));
                                intent8.putExtra("login_type", 0);
                                intent8.setClassName(this, "com.tencent.mm.plugin.account.ui.LoginPasswordUI");
                                intent8.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                arrayList7.add(intent8);
                                java.util.Collections.reverse(arrayList7);
                                yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                startActivity((android.content.Intent) arrayList7.get(0));
                                yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                db5.f.i(this);
                            }
                        }
                        com.tencent.mm.plugin.report.service.f0.e(8);
                        com.tencent.mm.sdk.platformtools.u3.l(runnable);
                        com.tencent.mm.sdk.platformtools.u3.i(runnable, 2000L);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "will logout account and kill app, bSwitchAccount = %s, hasDoneCreateImp = %s, isKickOffline = %s, hasLogin = %s, hasInitialAccount = %s, isVirtualLogin=%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f196832o), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(gm0.j1.b().n()), java.lang.Boolean.valueOf(gm0.j1.b().m()), java.lang.Boolean.valueOf(s17));
            v61.g0 g0Var3 = v61.h0.f433441a;
            if (gm0.j1.b().m()) {
                java.lang.String a19 = b9Var.a("login_user_name", "");
                java.lang.String r17 = c01.z1.r();
                kotlin.jvm.internal.o.d(a19);
                if ((c01.z1.x() || kotlin.jvm.internal.o.b(a19, gm0.j1.u().c().l(6, null)) || kotlin.jvm.internal.o.b(a19, c01.z1.c()) || kotlin.jvm.internal.o.b(a19, java.lang.String.valueOf(gm0.j1.u().c().q(9, 0))) || kotlin.jvm.internal.o.b(a19, gm0.j1.u().c().l(5, null))) ? false : true) {
                    java.lang.Object l18 = gm0.j1.u().c().l(6, null);
                    java.lang.String str = l18 instanceof java.lang.String ? (java.lang.String) l18 : null;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        java.lang.String c18 = c01.z1.c();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                            b9Var.d("login_user_name", r17);
                            c01.uc.f37514c.h(r17, "login_user_name", r17);
                            com.tencent.mars.xlog.Log.i("LoginUtil", "change lastLoginName from %s to userName %s", a19, r17);
                        } else {
                            b9Var.d("login_user_name", c18);
                            c01.uc.f37514c.h(r17, "login_user_name", c18);
                            com.tencent.mars.xlog.Log.i("LoginUtil", "change lastLoginName from %s to alias %s", a19, c18);
                        }
                    } else {
                        b9Var.d("login_user_name", str);
                        c01.uc.f37514c.h(r17, "login_user_name", str);
                        com.tencent.mars.xlog.Log.i("LoginUtil", "change lastLoginName from %s mobile to %s", a19, str);
                    }
                }
            }
            this.f196829i.getMainTabUI().e();
            gm0.j1.i().l("[normal logout]");
            com.tencent.mars.xlog.Log.i("MMKernel.CoreAccount", "[!] unmarkVirtualLogin");
            com.tencent.mm.sdk.platformtools.o4.M("system_config_prefs").G("virtual_login_mark", false);
            com.tencent.mars.WeChatMars.onSingalCrash(0);
            if (com.tencent.paymars.WeChatMars.isEnable()) {
                com.tencent.paymars.WeChatMars.onSingalCrash(0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "checktask ConstantsUI.Intro.KSwitch kill myself.");
            com.tencent.mars.xlog.Log.appenderFlush();
            finish();
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent9 = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
            intent9.putExtra("key_errType", com.tencent.mm.sdk.platformtools.c2.g(this.f196831n, "key_errType", 0));
            intent9.putExtra("key_errCode", com.tencent.mm.sdk.platformtools.c2.g(this.f196831n, "key_errCode", 0));
            intent9.putExtra("key_errMsg", com.tencent.mm.sdk.platformtools.c2.l(this.f196831n, "key_errMsg"));
            intent9.addFlags(67108864);
            intent9.addFlags(268435456);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(intent9);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(context2, arrayList8.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList8.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
            com.tencent.mm.ui.vb.i();
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList9.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(obj, arrayList9.toArray(), "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "jumpToLogin", "(Landroid/content/Context;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
        gm0.m.E();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public boolean moveTaskToBack(boolean z17) {
        try {
            return super.moveTaskToBack(z17);
        } finally {
            com.tencent.mm.ui.launcher.LauncherUIRegistry$LauncherUIMoveTaskToBackEvent launcherUIRegistry$LauncherUIMoveTaskToBackEvent = new com.tencent.mm.ui.launcher.LauncherUIRegistry$LauncherUIMoveTaskToBackEvent();
            launcherUIRegistry$LauncherUIMoveTaskToBackEvent.f209074g = this;
            launcherUIRegistry$LauncherUIMoveTaskToBackEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        boolean z17;
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        newChattingTabUI.getClass();
        if ((i17 == 2001 || i17 == 30763 || i17 == 226 || i17 == 3001 || i17 == 30762 || i17 == 1111 || i17 == 229) && (baseChattingUIFragment = newChattingTabUI.f197027n) != null) {
            baseChattingUIFragment.onActivityResult(i17, i18, intent);
        }
        int i19 = 65535 & i17;
        com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "check request code %d", java.lang.Integer.valueOf(i19));
        if ((i19 == 217 || i19 == 218 || i19 == 226) && newChattingTabUI.f197027n == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "on select image ActivityResult. the chattingUI maybe kill in the background.");
            com.tencent.mm.ui.dg dgVar = newChattingTabUI.f197030q;
            com.tencent.mm.sdk.platformtools.u3.l(dgVar);
            dgVar.f208336d = 0;
            dgVar.f208337e = i17;
            dgVar.f208338f = i18;
            dgVar.f208339g = intent;
            com.tencent.mm.sdk.platformtools.u3.h(dgVar);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        final com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        if (!homeUI.f196742a || i17 == 1) {
            return;
        }
        if (i17 == 22722) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "showAgreements %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "disagree privacy policy");
                gm0.j1.d().g(new n61.c(2, str, ""));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 5L, 1L, false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "agree privacy policy");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 4L, 1L, false);
                gm0.j1.d().g(new n61.c(1, str, ""));
                if (u11.c.f(str) && gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "needbirthday true");
                    com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.30
                        public AnonymousClass30() {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                            java.lang.String string = homeUI2.f196758q.getString(com.tencent.mm.R.string.f492238fr0, com.tencent.mm.sdk.platformtools.m2.d());
                            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_NEED_CONFIRM_BOOLEAN_SYNC, false)) {
                                com.tencent.mm.ui.HomeUI.e(homeUI2, string, 22723, homeUI2.f196758q.getString(com.tencent.mm.R.string.f492239fr2, com.tencent.mm.sdk.platformtools.m2.d()));
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "needconfirm false");
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putString("close_dialog_msg", homeUI2.f196749h);
                                bundle.putString("close_dialog_cancel", homeUI2.f196751j);
                                bundle.putString("close_dialog_ok", homeUI2.f196750i);
                                bundle.putBoolean("close_dialog_ok_close", false);
                                com.tencent.mm.ui.HomeUI.d(homeUI2, string, 22723, bundle);
                            }
                            db5.f.h(homeUI2.f196758q);
                        }
                    }, 100L);
                }
            }
        } else if (i17 == 22723) {
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
            bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                if (bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "verify birthday ok");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                } else if (bundleExtra.getString("go_next", "").equals("gdpr_confirm_logout")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "quit verify birthday after H5-warnning");
                    gm0.j1.d().g(new n61.c(2, str2, ""));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 5L, 1L, false);
                }
            }
        }
        if (i17 == 65534 && i18 == -1) {
            com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
            gm0.k2.a(homeUI.f196758q, true);
            com.tencent.mm.ui.vb.e();
            com.tencent.mm.ui.vb.c(homeUI.f196758q);
            homeUI.f196758q.finish();
            return;
        }
        if (i17 != 30764 || intent == null || (bundleExtra2 = intent.getBundleExtra("result_data")) == null || !bundleExtra2.getString("go_next", "").equals("gdpr_auth_location")) {
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = homeUI.f196758q;
        ((sb0.f) jVar).getClass();
        j35.u.i(mMFragmentActivity, "android.permission.ACCESS_FINE_LOCATION", 66);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        e3.d a17;
        super.onAttachedToWindow();
        com.tencent.mm.ui.b4.f197210a = j62.e.g().c(new com.tencent.mm.repairer.config.edge2edge.RepairerConfigFixEdgeToEdgeForApi35()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Edge2EdgeHelper", "initExp SwitchEnable=" + com.tencent.mm.ui.b4.f197210a + " from=LauncherUI");
        if (com.tencent.mm.ui.b4.c(this)) {
            n3.g3 a18 = com.tencent.mm.ui.cl.a(this);
            com.tencent.mm.ui.cl.f206295a = (a18 == null || (a17 = a18.a(2)) == null) ? 0 : a17.f247047d;
            com.tencent.mm.ui.yk.f("MicroMsg.WeUIToolHelper", "navigationBarHeightCache=" + com.tencent.mm.ui.cl.f206295a, new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (U6()) {
            super.onBackPressed();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onBackPressed");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f196829i.f196758q;
        if (mMFragmentActivity != null) {
            try {
                mMFragmentActivity.moveTaskToBack(true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        o25.n1.b(homeUI.f196758q, homeUI.K, 0);
        if (fp.e0.e() || u75.e.a() || fp.e0.f()) {
            com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent oPPOFloatWindowModeChangedEvent = new com.tencent.mm.autogen.events.OPPOFloatWindowModeChangedEvent();
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            am.am amVar = oPPOFloatWindowModeChangedEvent.f54555g;
            amVar.f6163a = contains;
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(amVar.f6163a));
            oPPOFloatWindowModeChangedEvent.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c9  */
    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.LauncherUI.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        if (this.chattingTabUI.k()) {
            return false;
        }
        final com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        com.tencent.mm.ui.m8 m8Var = homeUI.f196759r;
        if (m8Var == null || ((com.tencent.mm.ui.NewChattingTabUI) m8Var).k()) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(homeUI.f196759r == null);
            objArr[1] = java.lang.Boolean.valueOf(((com.tencent.mm.ui.NewChattingTabUI) homeUI.f196759r).k());
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "unCreateOptionsMenu, %b, %b", objArr);
            return false;
        }
        int l17 = homeUI.f196758q.getSupportActionBar().l();
        int f17 = i65.a.f(homeUI.f196758q, com.tencent.mm.R.dimen.f479723df);
        if (l17 == 0) {
            android.util.DisplayMetrics displayMetrics = homeUI.f196758q.getResources().getDisplayMetrics();
            l17 = displayMetrics.widthPixels > displayMetrics.heightPixels ? homeUI.f196758q.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : homeUI.f196758q.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
        }
        android.view.MenuItem add = menu.add(0, com.tencent.mm.R.id.jha, 0, com.tencent.mm.R.string.jzr);
        homeUI.F = add;
        android.graphics.drawable.Drawable drawable = homeUI.f196758q.getResources().getDrawable(com.tencent.mm.R.raw.magnifying_glass_regular);
        com.tencent.mm.ui.uk.f(drawable, homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.FG_0));
        add.setIcon(drawable);
        if (homeUI.D == null) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(f17, l17);
            android.view.View inflate = android.view.LayoutInflater.from(homeUI.f196758q).inflate(com.tencent.mm.R.layout.f487912be, (android.view.ViewGroup) null);
            homeUI.D = inflate;
            homeUI.E = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h5n);
            homeUI.D.setLayoutParams(layoutParams);
            homeUI.D.setMinimumHeight(l17);
            homeUI.D.setMinimumWidth(f17);
            android.widget.ImageView imageView3 = homeUI.E;
            android.graphics.drawable.Drawable drawable2 = homeUI.f196758q.getResources().getDrawable(com.tencent.mm.R.raw.magnifying_glass_regular);
            com.tencent.mm.ui.uk.f(drawable2, homeUI.f196758q.getResources().getColor(com.tencent.mm.R.color.FG_0));
            imageView3.setImageDrawable(drawable2);
            homeUI.D.setContentDescription(homeUI.l(com.tencent.mm.R.string.jzr));
            homeUI.D.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.ui.HomeUI.14
                public AnonymousClass14() {
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
                
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_local_wechat_repair_entrance_flag_and, 0) == 1) goto L39;
                 */
                @Override // android.view.View.OnLongClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onLongClick(android.view.View r14) {
                    /*
                        r13 = this;
                        java.lang.String r0 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r1 = "android/view/View$OnLongClickListener"
                        java.lang.String r2 = "onLongClick"
                        java.lang.String r3 = "(Landroid/view/View;)Z"
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        r4.add(r14)
                        java.lang.Object[] r5 = r4.toArray()
                        r4.clear()
                        r4 = r13
                        yj0.a.b(r0, r1, r2, r3, r4, r5)
                        int r0 = com.tencent.mm.sdk.platformtools.z.f193112h
                        r1 = 788529167(0x2f00000f, float:1.1641553E-10)
                        r2 = 1
                        r3 = 0
                        if (r0 == r1) goto L2c
                        r1 = 788529166(0x2f00000e, float:1.1641552E-10)
                        if (r0 != r1) goto L2a
                        goto L2c
                    L2a:
                        r0 = r3
                        goto L2d
                    L2c:
                        r0 = r2
                    L2d:
                        if (r0 != 0) goto L38
                        boolean r0 = z65.c.a()
                        if (r0 == 0) goto L36
                        goto L38
                    L36:
                        r0 = r3
                        goto L39
                    L38:
                        r0 = r2
                    L39:
                        if (r0 != 0) goto L4d
                        java.lang.Class<e42.e0> r0 = e42.e0.class
                        i95.m r0 = i95.n0.c(r0)
                        e42.e0 r0 = (e42.e0) r0
                        e42.d0 r1 = e42.d0.clicfg_local_wechat_repair_entrance_flag_and
                        h62.d r0 = (h62.d) r0
                        int r0 = r0.Ni(r1, r3)
                        if (r0 != r2) goto L9a
                    L4d:
                        android.content.Intent r0 = new android.content.Intent
                        r0.<init>()
                        com.tencent.mm.ui.HomeUI r2 = com.tencent.mm.ui.HomeUI.this
                        com.tencent.mm.ui.MMFragmentActivity r4 = r2.f196758q
                        java.lang.String r5 = "com.tencent.mm.plugin.repairer.ui.RepairerMainUI"
                        r0.setClassName(r4, r5)
                        r4 = 268435456(0x10000000, float:2.524355E-29)
                        r0.addFlags(r4)
                        com.tencent.mm.ui.MMFragmentActivity r2 = r2.f196758q
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        r4.add(r0)
                        java.util.Collections.reverse(r4)
                        java.lang.Object[] r6 = r4.toArray()
                        java.lang.String r7 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r8 = "onLongClick"
                        java.lang.String r9 = "(Landroid/view/View;)Z"
                        java.lang.String r10 = "Undefined"
                        java.lang.String r11 = "startActivity"
                        java.lang.String r12 = "(Landroid/content/Intent;)V"
                        r5 = r2
                        yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
                        java.lang.Object r0 = r4.get(r3)
                        android.content.Intent r0 = (android.content.Intent) r0
                        r2.startActivity(r0)
                        java.lang.String r6 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r7 = "onLongClick"
                        java.lang.String r8 = "(Landroid/view/View;)Z"
                        java.lang.String r9 = "Undefined"
                        java.lang.String r10 = "startActivity"
                        java.lang.String r11 = "(Landroid/content/Intent;)V"
                        r5 = r2
                        yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
                    L9a:
                        java.lang.String r6 = "com/tencent/mm/ui/HomeUI$14"
                        java.lang.String r7 = "android/view/View$OnLongClickListener"
                        java.lang.String r8 = "onLongClick"
                        java.lang.String r9 = "(Landroid/view/View;)Z"
                        r4 = 0
                        r5 = r13
                        yj0.a.i(r4, r5, r6, r7, r8, r9)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.HomeUI.AnonymousClass14.onLongClick(android.view.View):boolean");
                }
            });
            homeUI.D.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.15
                public AnonymousClass15() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    tf5.m mVar;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                    com.tencent.mm.ui.HomeUI.this.n();
                    android.content.Context context = view.getContext();
                    if (context == null) {
                        mVar = null;
                    } else {
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        mVar = (tf5.m) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(tf5.m.class);
                    }
                    if (mVar != null && mVar.f419004e) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(mVar.f419003d)), new jz5.l("view_id", "search_button_contact_tab")), 33926);
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            homeUI.D.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.16
                public AnonymousClass16() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.ui.HomeUI.this.f196758q.supportInvalidateOptionsMenu();
                }

                public java.lang.String toString() {
                    return super.toString() + "|supportInvalidateOptionsMenu";
                }
            });
        }
        homeUI.F.setActionView(homeUI.D);
        homeUI.G = menu.add(0, com.tencent.mm.R.id.jga, 0, com.tencent.mm.R.string.jzq);
        if (homeUI.f196766y == null) {
            homeUI.f196765x = new com.tencent.mm.ui.HomeUI.PlusActionView(f17, l17);
        }
        if (com.tencent.mm.ui.t7.f209881a.a() && homeUI.B == null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(f17, l17);
            android.view.View inflate2 = android.view.LayoutInflater.from(homeUI.f196758q).inflate(com.tencent.mm.R.layout.f487913bf, (android.view.ViewGroup) null);
            homeUI.B = inflate2;
            homeUI.C = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.h5n);
            homeUI.B.setLayoutParams(layoutParams2);
            homeUI.B.setMinimumHeight(l17);
            homeUI.B.setMinimumWidth(f17);
            homeUI.C.setImageResource(com.tencent.mm.R.raw.person_plus_regular);
            homeUI.B.setContentDescription(homeUI.l(com.tencent.mm.R.string.gum));
            homeUI.B.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                    com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                    homeUI2.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", homeUI2, array);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10919, "0");
                    new android.content.Intent().putExtra("invite_friend_scene", 2);
                    j45.l.j(homeUI2.f196758q, "subapp", ".ui.pluginapp.AddMoreFriendsUI", new android.content.Intent(), null);
                    if (!com.tencent.mm.sdk.platformtools.s9.f192974b) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis - homeUI2.f196741J > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                            homeUI2.f196741J = currentTimeMillis;
                            homeUI2.I = 1;
                        } else {
                            int i17 = homeUI2.I + 1;
                            homeUI2.I = i17;
                            if (i17 >= 5) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
                                com.tencent.mm.sdk.platformtools.s9.f192974b = true;
                            }
                        }
                    }
                    yj0.a.h(homeUI2, "com/tencent/mm/ui/HomeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        homeUI.h();
        if (gm0.j1.b().m()) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().k(homeUI.f196765x);
        }
        if (homeUI.f196748g && (imageView2 = homeUI.f196767z) != null) {
            imageView2.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        if (homeUI.f196748g && (imageView = homeUI.C) != null) {
            imageView.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        nm.j.f338443g.a(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.17
            public AnonymousClass17() {
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                com.tencent.mm.ui.HomeUI.this.u(false);
            }
        });
        homeUI.G.setActionView(homeUI.f196766y);
        homeUI.g();
        android.view.MenuItem menuItem = homeUI.G;
        if (menuItem != null) {
            if (homeUI.H) {
                menuItem.setShowAsAction(2);
                homeUI.G.setVisible(true);
                homeUI.h();
                android.widget.TextView textView = homeUI.f196746e;
                if (textView != null) {
                    textView.setVisibility(4);
                }
            } else {
                menuItem.setVisible(false);
                homeUI.G.setEnabled(false);
                android.widget.TextView textView2 = homeUI.f196746e;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
        }
        android.view.MenuItem menuItem2 = homeUI.F;
        if (menuItem2 != null) {
            if (homeUI.H) {
                menuItem2.setShowAsAction(2);
                homeUI.F.setVisible(true);
                homeUI.h();
                android.widget.TextView textView3 = homeUI.f196746e;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            } else {
                menuItem2.setVisible(false);
                homeUI.F.setEnabled(false);
                android.widget.TextView textView4 = homeUI.f196746e;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
        homeUI.f196766y.getLayoutParams().width = f17;
        homeUI.f196766y.getLayoutParams().height = l17;
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        nm.a.a(512);
        nm.a.f338422w = false;
        super.onDestroy();
        com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        if (homeUI != null) {
            homeUI.f196761t.e();
            com.tencent.mm.ui.o7 o7Var = homeUI.f196760s;
            if (o7Var != null) {
                o7Var.f209461l.dead();
                o7Var.f209463n.dead();
            }
            if (homeUI.f196742a) {
                android.os.Looper.myQueue().removeIdleHandler(homeUI.O);
            }
            homeUI.M.dead();
            homeUI.N.dead();
        }
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        if (newChattingTabUI != null) {
            newChattingTabUI.p();
            com.tencent.mm.sdk.platformtools.u3.l(newChattingTabUI.mStartChattingRunnable);
            com.tencent.mm.sdk.platformtools.u3.l(newChattingTabUI.f197026m);
            android.os.Looper.myQueue().removeIdleHandler(newChattingTabUI.f197018e);
        }
        qg0.y yVar = this.f196835r;
        if (yVar != null) {
            nt4.e eVar = (nt4.e) yVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.HKOfflineLogic", "doOnDestroy");
            eVar.f339819d = null;
            eVar.f339821f = null;
            eVar.f339820e = false;
            eVar.f339822g = null;
            gm0.j1.d().q(2540, eVar);
            this.f196835r = null;
        }
        this.f196828h.dead();
        d7();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getTaskId());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "checktask onDestroy 0x%x, taskid %d, task:%s, instancesize %d", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.q8(this), java.lang.Integer.valueOf(f196826y.size()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onMultiWindowModeChanged2 isInMultiWindowMode: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.autogen.events.MultiWindowModeChangedEvent multiWindowModeChangedEvent = new com.tencent.mm.autogen.events.MultiWindowModeChangedEvent();
        multiWindowModeChangedEvent.f54508g.f6682a = z17;
        multiWindowModeChangedEvent.e();
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onNewIntent 0x%x task:%s", valueOf, new com.tencent.mm.sdk.platformtools.q8(this));
        this.f196831n = intent;
        super.onNewIntent(intent);
        setIntent(intent);
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if ("android.intent.action.MAIN".equals(intent.getAction()) && c9Var != null && ((com.tencent.mm.plugin.finder.service.l3) c9Var).Ai(this)) {
            return;
        }
        android.content.Intent intent2 = this.f196831n;
        if (intent2 != null && com.tencent.mm.sdk.platformtools.c2.c(intent2, "LauncherUI.jump_from_uimode_check", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "dancy onNewIntent uimode check from background, finish LauncherUI");
            finish();
            return;
        }
        if (c9Var != null && "new_msg_nofification".equals(intent.getStringExtra("nofification_type"))) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.service.f3((com.tencent.mm.plugin.finder.service.l3) c9Var));
        }
        ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.model.app.h1(this, ""), "reportLaunchWechat");
        if (g7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onNewIntent handleExitIntent");
            return;
        }
        android.content.Intent intent3 = this.f196831n;
        if (intent3 != null && com.tencent.mm.sdk.platformtools.c2.c(intent3, "Intro_Need_Clear_Top ", false)) {
            finish();
            n7(this);
            return;
        }
        if ((intent.getFlags() & 67108864) == 67108864) {
            closeChatting(false);
        }
        com.tencent.mm.ui.MainTabUI mainTabUI = this.f196829i.f196761t;
        mainTabUI.getClass();
        if ((intent.getFlags() & 67108864) == 67108864) {
            mainTabUI.f196924d = true;
        }
        if (this.f196832o) {
            h7(intent);
        }
        rp3.c.a().getClass();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        com.tencent.mm.ui.MMFragment currentFragmet = homeUI.f196758q.getCurrentFragmet();
        boolean z17 = false;
        if ((currentFragmet == null || !currentFragmet.isShowing()) && !((com.tencent.mm.ui.NewChattingTabUI) homeUI.f196759r).k()) {
            if (menuItem.getItemId() == com.tencent.mm.R.id.jga) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10919, "0");
                homeUI.o();
            } else if (menuItem.getItemId() == com.tencent.mm.R.id.jha) {
                homeUI.n();
            }
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        hashCode();
        super.onPause();
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null) {
            com.tencent.mm.plugin.finder.service.l3 l3Var = (com.tencent.mm.plugin.finder.service.l3) c9Var;
            if (gm0.j1.a()) {
                l3Var.f126122e = false;
                l3Var.f126121d = false;
            } else {
                com.tencent.mars.xlog.Log.e("FinderMultiTaskService", "onLauncherUIPause: acc not ready");
            }
        }
        o25.n2 n2Var = this.f196836s;
        boolean a17 = n2Var.a("onPause");
        if (a17) {
            n2Var.f342566a = false;
        }
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onPause");
            return;
        }
        nm.a.a(512);
        nm.a.f338422w = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "not skip this onPause");
        com.tencent.mm.ui.MMFragment currentFragmet = getCurrentFragmet();
        this.f196837t.removeCallbacksAndMessages(null);
        if (!com.tencent.mm.ui.bk.y()) {
            this.f196829i.j();
            this.chattingTabUI.h();
        }
        if (currentFragmet != null) {
            return;
        }
        this.f196833p = false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (this.f196830m.a(this, i17, strArr, iArr)) {
            return;
        }
        final com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        homeUI.getClass();
        if (i17 == 16 || i17 == 80) {
            int i18 = i17 == 80 ? com.tencent.mm.R.string.hhn : com.tencent.mm.R.string.hh8;
            if (iArr[0] != 0) {
                db5.e1.C(homeUI.f196758q, homeUI.l(i18), homeUI.l(com.tencent.mm.R.string.hht), homeUI.l(com.tencent.mm.R.string.g6z), homeUI.l(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.31
                    public AnonymousClass31() {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = com.tencent.mm.ui.HomeUI.this.f196758q;
                        ((sb0.f) jVar).getClass();
                        j35.u.g(mMFragmentActivity);
                    }
                }, new android.content.DialogInterface.OnClickListener(homeUI) { // from class: com.tencent.mm.ui.HomeUI.32
                    public AnonymousClass32(final com.tencent.mm.ui.HomeUI homeUI2) {
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                    }
                });
            }
        } else if (i17 != 65) {
            if (i17 == 66) {
                if (iArr[0] == 0) {
                    com.tencent.mm.ui.MMFragment g17 = homeUI2.f196761t.g();
                    if (g17 instanceof com.tencent.mm.ui.FindMoreFriendsUI) {
                        ((com.tencent.mm.ui.FindMoreFriendsUI) g17).C0();
                    }
                } else {
                    db5.e1.C(homeUI2.f196758q, homeUI2.l(com.tencent.mm.R.string.hhm), homeUI2.l(com.tencent.mm.R.string.hht), homeUI2.l(com.tencent.mm.R.string.g6z), homeUI2.l(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.34
                        public AnonymousClass34() {
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = com.tencent.mm.ui.HomeUI.this.f196758q;
                            ((sb0.f) jVar).getClass();
                            j35.u.g(mMFragmentActivity);
                        }
                    }, null);
                }
            }
        } else if (iArr[0] == 0) {
            homeUI2.n();
        } else {
            db5.e1.C(homeUI2.f196758q, homeUI2.l(com.tencent.mm.R.string.hhm), homeUI2.l(com.tencent.mm.R.string.hht), homeUI2.l(com.tencent.mm.R.string.g6z), homeUI2.l(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.33
                public AnonymousClass33() {
                }

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i19) {
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = com.tencent.mm.ui.HomeUI.this.f196758q;
                    ((sb0.f) jVar).getClass();
                    j35.u.g(mMFragmentActivity);
                }
            }, null);
        }
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.chattingTabUI.f197027n;
        if (baseChattingUIFragment != null) {
            baseChattingUIFragment.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        newChattingTabUI.getClass();
        java.lang.String string = bundle.getString("last_restore_talker");
        newChattingTabUI.f197020g = string;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "onRestoreInstanceState:%s", string);
        this.f196839v = bundle.getBoolean("last_stay_chatting");
        this.f196840w = bundle.getInt("last_stay_tab");
        if (this.f196839v) {
            com.tencent.mm.ui.NewChattingTabUI newChattingTabUI2 = this.chattingTabUI;
            newChattingTabUI2.r(newChattingTabUI2.f197020g, null, false);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String action;
        java.lang.String str3;
        com.tencent.mm.ui.MoreTabUI moreTabUI;
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView;
        yf5.j0 j0Var;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onResume %s", java.lang.Integer.valueOf(hashCode()));
        super.onResume();
        if (this.f196836s.a("onResume")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "recreate activity %s, skip this onResume");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "not skip this onResume");
        A = false;
        if (gm0.m.s()) {
            m7();
        } else {
            android.content.Intent intent = this.f196831n;
            if ((intent == null || com.tencent.mm.sdk.platformtools.c2.c(intent, "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) ? false : true) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "doOnResumeImp notSwitchorHold, hasDoInit:%b", java.lang.Boolean.valueOf(this.f196832o));
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI", "accHasNotReady, kill self");
                    finish();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "try to kill mm pid %d", java.lang.Integer.valueOf(android.os.Process.myPid()));
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/ui/LauncherUI", "onResume", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/ui/LauncherUI", "onResume", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                }
                if (!this.f196832o) {
                    this.f196832o = true;
                    final com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
                    homeUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "doOnCreate");
                    ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
                    if (bf4.f.f19715b.f()) {
                        ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_STORY_NEW_FEATURE_TIP_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
                    }
                    com.tencent.mm.ui.o7 o7Var = homeUI.f196760s;
                    o7Var.f209461l.alive();
                    o7Var.f209463n.alive();
                    getWindow().setCallback(new ma5.f(getWindow().getCallback(), this));
                    if (com.tencent.mm.sdk.platformtools.x2.l()) {
                        com.tencent.mm.sdk.platformtools.x2.t();
                        com.tencent.mm.xlog.app.XLogSetup.realSetupXlog();
                    }
                    homeUI.f196752k = new com.tencent.mm.ui.rg(this, homeUI.f196761t);
                    homeUI.f196742a = true;
                    com.tencent.mm.booter.NotifyReceiver.d();
                    ((com.tencent.mm.booter.notification.x) c01.d9.f()).getClass();
                    com.tencent.mm.booter.notification.l0.f63501a.f63504a.getClass();
                    pm.b bVar = pm.f.f356752a.f356755f;
                    synchronized (bVar) {
                        if (bVar.f356750d == null) {
                            bVar.g();
                        }
                        arrayList = new java.util.ArrayList();
                        java.util.Iterator it = bVar.iterator();
                        while (it.hasNext()) {
                            pm.a aVar = (pm.a) it.next();
                            if ((aVar.f356749i & 1) != 0 && !arrayList.contains(java.lang.Integer.valueOf(aVar.f356744d))) {
                                arrayList.add(java.lang.Integer.valueOf(aVar.f356744d));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        z2.n1 n1Var = new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            pm.f.f356752a.d(n1Var, ((java.lang.Integer) it6.next()).intValue());
                        }
                    }
                    if (gm0.j1.a()) {
                        java.lang.System.currentTimeMillis();
                        com.tencent.mm.ui.MMActivity.initLanguage(homeUI.f196758q);
                        try {
                            java.util.HashSet hashSet = new java.util.HashSet();
                            java.lang.String[] split = homeUI.l(com.tencent.mm.R.string.bll).split(";");
                            hashSet.add(split[0]);
                            if (split.length > 1) {
                                hashSet.add(split[1]);
                            }
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            c01.a2.f37047a = hashSet;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
                        }
                        gm0.j1.i();
                        gm0.j1.e().j(new com.tencent.mm.ui.HomeUI$$h());
                        java.lang.System.currentTimeMillis();
                        java.lang.System.currentTimeMillis();
                        homeUI.K = com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(homeUI.f196758q), com.tencent.mm.R.layout.bvp, null, false);
                        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getColor(com.tencent.mm.R.color.a07);
                        if (homeUI.K != null) {
                            homeUI.K.setBackgroundColor(color);
                        }
                        nm.j jVar = nm.j.f338443g;
                        synchronized (jVar) {
                            jVar.f338445b = true;
                        }
                        com.tencent.mm.blink.FirstScreenFrameLayout firstScreenFrameLayout = (com.tencent.mm.blink.FirstScreenFrameLayout) homeUI.K.findViewById(com.tencent.mm.R.id.g6w);
                        firstScreenFrameLayout.f63232d = new nm.l(homeUI) { // from class: com.tencent.mm.ui.HomeUI.2

                            /* renamed from: com.tencent.mm.ui.HomeUI$2$1 */
                            /* loaded from: classes8.dex */
                            class AnonymousClass1 implements gm5.a {
                                public AnonymousClass1(com.tencent.mm.ui.HomeUI.AnonymousClass2 anonymousClass2) {
                                }

                                @Override // gm5.a
                                public java.lang.Object call(java.lang.Object obj) {
                                    java.util.ArrayList arrayList = nm.a.f338420u;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        long[] jArr = (long[]) it.next();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
                                        arrayList2.add(new com.tencent.mars.smc.IDKey(jArr[0], jArr[1], jArr[2]));
                                    }
                                    if (arrayList2.size() > 0) {
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList2, false, false);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup report size %s", java.lang.Integer.valueOf(arrayList.size()));
                                    arrayList.clear();
                                    java.util.Iterator it6 = nm.a.f338421v.iterator();
                                    while (it6.hasNext()) {
                                        java.lang.Object[] objArr = (java.lang.Object[]) it6.next();
                                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(((java.lang.Integer) objArr[0]).intValue(), (java.lang.Object[]) objArr[1]);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup kv %s, %s", objArr[0], ((java.lang.Object[]) objArr[1])[0]);
                                    }
                                    return null;
                                }
                            }

                            public AnonymousClass2(final com.tencent.mm.ui.HomeUI homeUI2) {
                            }

                            @Override // nm.l
                            public void a() {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "afterDraw");
                                if (com.tencent.mm.ui.HomeUI.f196740c0) {
                                    com.tencent.mm.ui.HomeUI.f196740c0 = false;
                                    long nativeHeapAllocatedSize = android.os.Debug.getNativeHeapAllocatedSize();
                                    if (nativeHeapAllocatedSize > 209715200) {
                                        if (nativeHeapAllocatedSize < 419430400) {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(959L, 190L, 1L);
                                        } else if (nativeHeapAllocatedSize < 629145600) {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(959L, 191L, 1L);
                                        } else if (nativeHeapAllocatedSize < 838860800) {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(959L, 192L, 1L);
                                        } else {
                                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(959L, 193L, 1L);
                                        }
                                    }
                                }
                                if (!nm.a.f338422w ? false : nm.a.a(256)) {
                                    nm.a.e(6);
                                    long currentTimeMillis = java.lang.System.currentTimeMillis() - nm.a.f338423x;
                                    nm.a.c(nm.a.f338407h, currentTimeMillis);
                                    if (currentTimeMillis <= 3000) {
                                        nm.a.c(nm.a.f338408i, 1L);
                                    } else if (currentTimeMillis > 3000 && currentTimeMillis <= androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                                        nm.a.c(nm.a.f338409j, 1L);
                                    } else if (currentTimeMillis <= androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS || currentTimeMillis > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                                        nm.a.c(nm.a.f338411l, 1L);
                                    } else {
                                        nm.a.c(nm.a.f338410k, 1L);
                                    }
                                    nm.a.c(nm.a.f338400a, 1L);
                                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - nm.a.f338424y;
                                    nm.a.d(nm.a.f338413n, elapsedRealtime);
                                    if (elapsedRealtime <= 2000) {
                                        nm.a.d(nm.a.f338414o, 1L);
                                    } else if (elapsedRealtime > 2000 && elapsedRealtime <= 4000) {
                                        nm.a.d(nm.a.f338415p, 1L);
                                    } else if (elapsedRealtime > 4000 && elapsedRealtime <= androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
                                        nm.a.d(nm.a.f338416q, 1L);
                                    } else if (elapsedRealtime > androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS && elapsedRealtime <= 8000) {
                                        nm.a.d(nm.a.f338417r, 1L);
                                    } else if (elapsedRealtime <= 8000 || elapsedRealtime > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                                        nm.a.d(nm.a.f338419t, 1L);
                                    } else {
                                        nm.a.d(nm.a.f338418s, 1L);
                                    }
                                    nm.a.d(nm.a.f338412m, 1L);
                                    nm.a.f338421v.add(new java.lang.Object[]{15854, new java.lang.Object[]{java.lang.Long.valueOf(elapsedRealtime)}});
                                    gm0.c2.b("First Screen");
                                    ((km5.q) km5.u.d()).l(500L).q(new gm5.a(this) { // from class: com.tencent.mm.ui.HomeUI.2.1
                                        public AnonymousClass1(com.tencent.mm.ui.HomeUI.AnonymousClass2 this) {
                                        }

                                        @Override // gm5.a
                                        public java.lang.Object call(java.lang.Object obj2) {
                                            java.util.ArrayList arrayList3 = nm.a.f338420u;
                                            java.util.ArrayList arrayList22 = new java.util.ArrayList();
                                            java.util.Iterator it7 = arrayList3.iterator();
                                            while (it7.hasNext()) {
                                                long[] jArr = (long[]) it7.next();
                                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
                                                arrayList22.add(new com.tencent.mars.smc.IDKey(jArr[0], jArr[1], jArr[2]));
                                            }
                                            if (arrayList22.size() > 0) {
                                                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList22, false, false);
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup report size %s", java.lang.Integer.valueOf(arrayList3.size()));
                                            arrayList3.clear();
                                            java.util.Iterator it62 = nm.a.f338421v.iterator();
                                            while (it62.hasNext()) {
                                                java.lang.Object[] objArr = (java.lang.Object[]) it62.next();
                                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(((java.lang.Integer) objArr[0]).intValue(), (java.lang.Object[]) objArr[1]);
                                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "blink-startup kv %s, %s", objArr[0], ((java.lang.Object[]) objArr[1])[0]);
                                            }
                                            return null;
                                        }
                                    });
                                }
                                nm.j jVar2 = nm.j.f338443g;
                                synchronized (jVar2) {
                                    if (jVar2.f338445b) {
                                        jVar2.f338445b = false;
                                        jVar2.b();
                                    }
                                }
                            }
                        };
                        if (u75.e.a()) {
                            firstScreenFrameLayout.postInvalidate();
                        }
                        java.lang.System.currentTimeMillis();
                        homeUI2.f196758q.setContentView(homeUI2.K);
                        android.os.Looper.myQueue().addIdleHandler(homeUI2.O);
                        java.lang.System.currentTimeMillis();
                        homeUI2.m();
                        homeUI2.f196744c.L();
                        homeUI2.K.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.3
                            public AnonymousClass3() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                                com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                                homeUI2.w(true);
                                c01.d9.b().p().z(327947, homeUI2.f196744c.l());
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "contentView.post then setFullScreenAfterSetContentView, padding: %s", java.lang.Integer.valueOf(homeUI2.K.getPaddingTop()));
                                o25.n1.b(homeUI2.f196758q, homeUI2.K, 0);
                            }

                            public java.lang.String toString() {
                                return super.toString() + "|updateTitle";
                            }
                        });
                        java.lang.System.currentTimeMillis();
                        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable(homeUI2) { // from class: com.tencent.mm.ui.HomeUI.4
                            public AnonymousClass4(final com.tencent.mm.ui.HomeUI homeUI2) {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                b4.d.a(com.tencent.mm.sdk.platformtools.x2.f193071a).c(new android.content.Intent(com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_REFRESH_WXAPP));
                            }

                            public java.lang.String toString() {
                                return super.toString() + "|sendBroadcast";
                            }
                        }, 2000L);
                        homeUI2.K.addOnLayoutChangeListener(homeUI2.f196763v);
                        o25.n1.b(homeUI2.f196758q, homeUI2.K, 0);
                        homeUI2.K.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.5
                            public AnonymousClass5() {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "contentView.post, padding: %s", java.lang.Integer.valueOf(com.tencent.mm.ui.HomeUI.this.K.getPaddingTop()));
                            }
                        }, 20L);
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        com.tencent.mm.ui.fl.b(context);
                        com.tencent.mm.ui.v7.b(context);
                        com.tencent.mm.ui.w9.b(context);
                        com.tencent.mm.ui.rk.b(context);
                        com.tencent.mm.ui.eg.c(context);
                        com.tencent.mm.ui.ee.d(1);
                        com.tencent.mm.ui.tools.id.b(new com.tencent.mm.ui.tools.hd() { // from class: com.tencent.mm.ui.HomeUI$$g
                            @Override // com.tencent.mm.ui.tools.hd
                            public final void a() {
                                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                                com.tencent.mm.ui.HomeUI.this.w(true);
                            }
                        }, homeUI2.f196758q);
                        homeUI2.M.alive();
                        homeUI2.N.alive();
                        homeUI2.f196761t.d();
                        if (homeUI2.K != null) {
                            homeUI2.K.setBackground(null);
                        }
                        homeUI2.f196761t.f196927g = new com.tencent.mm.ui.HomeUI.AnonymousClass1();
                        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.ui.HomeUI homeUI2 = com.tencent.mm.ui.HomeUI.this;
                                java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                                homeUI2.getClass();
                                com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct sightAutoDownloadAndPlaySettingStruct = new com.tencent.mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct();
                                sightAutoDownloadAndPlaySettingStruct.f60380d = 1;
                                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
                                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                sightAutoDownloadAndPlaySettingStruct.f60381e = ((java.lang.Boolean) c17.m(u3Var, bool2)).booleanValue() ? 1 : 2;
                                sightAutoDownloadAndPlaySettingStruct.f60382f = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                sightAutoDownloadAndPlaySettingStruct.f60383g = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                sightAutoDownloadAndPlaySettingStruct.f60384h = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool2)).booleanValue() ? 1 : 2;
                                sightAutoDownloadAndPlaySettingStruct.f60385i = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri() ? 1 : 2;
                                sightAutoDownloadAndPlaySettingStruct.k();
                                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                synchronized (g0Var.f158179i) {
                                    for (android.util.Pair pair : g0Var.f158179i) {
                                        g0Var.B(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) pair.second).longValue());
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "clear all pendding stat %d", java.lang.Integer.valueOf(((java.util.LinkedList) g0Var.f158179i).size()));
                                    ((java.util.LinkedList) g0Var.f158179i).clear();
                                }
                            }
                        });
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready, finish launcherui");
                        homeUI2.f196758q.finish();
                    }
                    h7(getIntent());
                }
                final com.tencent.mm.ui.HomeUI homeUI2 = this.f196829i;
                homeUI2.getClass();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                homeUI2.f196761t.g();
                homeUI2.f196761t.f(((com.tencent.mm.ui.NewChattingTabUI) homeUI2.f196759r).k());
                com.tencent.mm.ui.o7 o7Var2 = homeUI2.f196760s;
                o7Var2.getClass();
                com.tencent.mm.autogen.events.CheckHotPatchAlertEvent checkHotPatchAlertEvent = new com.tencent.mm.autogen.events.CheckHotPatchAlertEvent();
                checkHotPatchAlertEvent.e();
                am.o2 o2Var = checkHotPatchAlertEvent.f54050g;
                if (o2Var.f7506a && !com.tencent.mm.sdk.platformtools.t8.K0(o2Var.f7507b)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "  now show msg:%s", o2Var.f7507b);
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(o7Var2.f209450a);
                    u1Var.u(o7Var2.c(com.tencent.mm.R.string.f490588z9));
                    u1Var.h(o7Var2.c(com.tencent.mm.R.string.f490587z8));
                    u1Var.f211996a.f211821b.f211731u = o2Var.f7507b;
                    u1Var.a(false);
                    u1Var.l(new com.tencent.mm.ui.p6(o7Var2));
                    u1Var.q(false);
                }
                am.zg zgVar = o7Var2.f209452c;
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "doOnResumeCheck");
                if (o7Var2.f(zgVar)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "doOnResumeCheck, showGlobalAlert");
                } else {
                    gm0.j1.e().k(new com.tencent.mm.ui.d7(o7Var2), 500L);
                }
                o7Var2.f209452c = null;
                z65.c.f470455a = true;
                boolean k17 = ((com.tencent.mm.ui.NewChattingTabUI) homeUI2.f196759r).k();
                if (!k17 && gm0.j1.a()) {
                    nm.j.f338443g.a(new java.lang.Runnable(homeUI2) { // from class: com.tencent.mm.ui.HomeUI.7
                        public AnonymousClass7(final com.tencent.mm.ui.HomeUI homeUI22) {
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            java.util.Map map = com.tencent.mm.plugin.sight.decode.model.s.H;
                            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
                            com.tencent.mm.plugin.sight.decode.model.c cVar = new com.tencent.mm.plugin.sight.decode.model.c();
                            ((vf0.y1) k1Var).getClass();
                            t21.o2.aj(cVar, 0L);
                        }
                    });
                    if (q21.d.b() != null && q21.d.a() != null) {
                        ua3.b bVar2 = ((va3.z0) q21.d.a()).f434397b;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar2 != null ? bVar2.f425976e : "")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "launcher onResume end track %s", ((va3.v0) q21.d.b()).f434364v);
                            com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
                            exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
                            exitTrackRoomEvent.e();
                        }
                    }
                }
                if (!k17) {
                    pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
                    int i17 = homeUI22.f196761t.f196925e;
                    kn4.i0 i0Var = (kn4.i0) uVar;
                    i0Var.getClass();
                    java.lang.String str4 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
                    if (str4 != null) {
                        i0Var.Ai(str4, 3);
                    }
                    com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) homeUI22.f196761t.f196935o.get(0);
                    if (mainUI != null && (j0Var = mainUI.f207379v) != null) {
                        ((yf5.w0) j0Var).f461988t.b(260);
                    }
                }
                al5.a3.c(homeUI22.f196758q);
                homeUI22.f196758q.onSwipe(1.0f);
                homeUI22.f196757p = com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_RESUME;
                if (homeUI22.f196743b) {
                    homeUI22.f196743b = false;
                }
                com.tencent.mm.modelavatar.b1.f70426b = 0;
                com.tencent.mm.modelavatar.b1.f70427c.d();
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.HomeUI", "[Launching Application]");
                gm0.k2.a(homeUI22.f196758q, false);
                gm0.k2.b(homeUI22.f196758q, false);
                java.lang.System.currentTimeMillis();
                homeUI22.t();
                java.lang.System.currentTimeMillis();
                if (getInstance() != null) {
                    nm.j jVar2 = nm.j.f338443g;
                    synchronized (jVar2) {
                        jVar2.f338447d = false;
                    }
                    ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
                    c01.ad.f37061a.c("showprivacypolicy", homeUI22.U);
                    homeUI22.u(false);
                    homeUI22.L.alive();
                    java.lang.System.currentTimeMillis();
                    gm0.j1.a();
                }
                java.lang.System.currentTimeMillis();
                java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "initView " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                if (homeUI22.f196743b) {
                    homeUI22.f196743b = false;
                }
                if (com.tencent.mm.app.i5.f53456c == null) {
                    com.tencent.mm.app.i5.f53456c = new com.tencent.mm.app.i5();
                }
                com.tencent.mm.app.i5 i5Var = com.tencent.mm.app.i5.f53456c;
                i5Var.f53457a = true;
                com.tencent.mm.sdk.platformtools.n3 n3Var = i5Var.f53458b;
                n3Var.removeMessages(-1999);
                n3Var.removeMessages(-2999);
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "start time check LauncherUI Launcher onResume end: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LOGIN_SHOW_BIND_THIRD_ADD_TYPE_INT;
                int r17 = c17.r(u3Var, 0);
                if (r17 != 0) {
                    gm0.j1.u().c().x(u3Var, 0);
                    if (!c01.z1.u() && r17 == 1) {
                        db5.e1.u(homeUI22.f196758q, homeUI22.l(com.tencent.mm.R.string.ghh), "", new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.8
                            public AnonymousClass8() {
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.tencent.mm.ui.HomeUI homeUI3 = com.tencent.mm.ui.HomeUI.this;
                                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = homeUI3.f196758q;
                                android.content.Intent intent2 = new android.content.Intent(homeUI3.f196758q, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(intent2);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(mMFragmentActivity, arrayList3.toArray(), "com/tencent/mm/ui/HomeUI$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                mMFragmentActivity.startActivity((android.content.Intent) arrayList3.get(0));
                                yj0.a.f(mMFragmentActivity, "com/tencent/mm/ui/HomeUI$8", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        }, null);
                    }
                }
                nm.j jVar3 = nm.j.f338443g;
                jVar3.a(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.9
                    public AnonymousClass9() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        int i18;
                        com.tencent.mm.ui.HomeUI homeUI3 = com.tencent.mm.ui.HomeUI.this;
                        java.lang.Boolean bool = com.tencent.mm.ui.HomeUI.f196738a0;
                        homeUI3.getClass();
                        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable(homeUI3) { // from class: com.tencent.mm.ui.HomeUI.10
                            public AnonymousClass10(com.tencent.mm.ui.HomeUI homeUI32) {
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                int o17 = i65.a.o(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                if (currentTimeMillis2 - com.tencent.mm.sdk.platformtools.o4.L().q("font_size_report_time", 0L) > 604800000) {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14239, java.lang.Integer.valueOf(o17));
                                    com.tencent.mm.sdk.platformtools.o4.L().B("font_size_report_time", currentTimeMillis2);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "using font size kvReport logID:%d , usingFontSize: %d", 14239, java.lang.Integer.valueOf(o17));
                                }
                            }
                        });
                        com.tencent.mm.ui.HomeUI homeUI4 = com.tencent.mm.ui.HomeUI.this;
                        homeUI4.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis2 - com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getLong("dark_mode_status", 0L) > 86400000) {
                            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            int i19 = com.tencent.mm.ui.bk.F() ? com.tencent.mm.ui.bk.I() ? 1 : 2 : 0;
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var.d(18893, 1, java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0));
                            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putLong("dark_mode_status", currentTimeMillis2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()));
                            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = homeUI4.f196758q;
                            if (mMFragmentActivity != null) {
                                int i27 = mMFragmentActivity.getBaseContext().getResources().getConfiguration().uiMode & 48;
                                if (i27 == 16) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.UIUtils", "dancy test isSystemDarkMode not darkmode");
                                } else if (i27 == 32) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.UIUtils", "dancy test isSystemDarkMode darkmode");
                                    i18 = 1;
                                    g0Var.d(18893, 3, java.lang.Integer.valueOf(i18), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0));
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()));
                                }
                            }
                            i18 = 0;
                            g0Var.d(18893, 3, java.lang.Integer.valueOf(i18), 2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0));
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s , action: %s, isDark:%s", 18893, 1, java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()));
                        }
                        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("dark_mode_follow_system_need_report", false)) {
                            java.lang.Object[] objArr = new java.lang.Object[4];
                            objArr[0] = 18893;
                            objArr[1] = 4;
                            objArr[2] = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0);
                            objArr[3] = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.I() ? 1 : 2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "dark mode kvReport logID:%s, action:%s, dark:%s, mode:%s", objArr);
                            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            java.lang.Object[] objArr2 = new java.lang.Object[5];
                            objArr2[0] = 4;
                            objArr2[1] = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0);
                            objArr2[2] = 2;
                            objArr2[3] = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.I() ? 1 : 2);
                            objArr2[4] = java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0);
                            g0Var2.d(18893, objArr2);
                            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_follow_system_need_report", false);
                        }
                        if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.ui.bk.L()) {
                            if (!j65.m.f297966a) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "dark mode used: %s", java.lang.Boolean.TRUE);
                                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_used", true);
                                j65.m.f297966a = true;
                            }
                            if (com.tencent.mm.ui.bk.I()) {
                                com.tencent.mm.ui.HomeUI homeUI5 = com.tencent.mm.ui.HomeUI.this;
                                homeUI5.getClass();
                                if (!com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("dark_mode_notice_dialog", false)) {
                                    com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(homeUI5.f196758q);
                                    u1Var2.g(homeUI5.f196758q.getResources().getString(com.tencent.mm.R.string.f491033bn1));
                                    u1Var2.m(com.tencent.mm.R.string.f490454vi);
                                    u1Var2.l(new com.tencent.mm.ui.widget.dialog.w1(homeUI5) { // from class: com.tencent.mm.ui.HomeUI.11
                                        public AnonymousClass11(com.tencent.mm.ui.HomeUI homeUI52) {
                                        }

                                        @Override // com.tencent.mm.ui.widget.dialog.w1
                                        public void a(boolean z18, java.lang.String str6) {
                                        }
                                    });
                                    u1Var2.q(false);
                                    com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_notice_dialog", true);
                                }
                            }
                        }
                        com.tencent.mm.ui.HomeUI homeUI6 = com.tencent.mm.ui.HomeUI.this;
                        homeUI6.getClass();
                        if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("caremode_setting_succeed", false)) {
                            homeUI6.getMainTabUI().a(3);
                            android.content.Intent intent2 = new android.content.Intent();
                            if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
                                intent2.setClassName(homeUI6.f196758q, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro");
                            } else {
                                intent2.setClassName(homeUI6.f196758q, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI");
                            }
                            intent2.putExtra("jumptocare", true);
                            com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
                            intent2.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_START_MODE, 0);
                            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = homeUI6.f196758q;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(intent2);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(mMFragmentActivity2, arrayList3.toArray(), "com/tencent/mm/ui/HomeUI", "showCareModeNotice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mMFragmentActivity2.startActivity((android.content.Intent) arrayList3.get(0));
                            yj0.a.f(mMFragmentActivity2, "com/tencent/mm/ui/HomeUI", "showCareModeNotice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                        com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_NOTICE_BOOLEAN, false)));
                        j65.e.b();
                        int i28 = j65.e.a().getInt("care_mode_font_size", 0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "getCareModeFontSize:%s", java.lang.Integer.valueOf(i28));
                        int b17 = f14.e.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        boolean z18 = j65.e.a().getBoolean("care_mode_change", false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMCareModeManager", "getCareModeChange:%s", java.lang.Boolean.valueOf(z18));
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "careModeChange:%s, careModeFontSize:%s, currentIndex:%s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(b17));
                        if (z18) {
                            j65.e.i(false);
                            if (j65.e.b()) {
                                boolean z19 = j65.e.e() && b17 < 5;
                                wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
                                wd0.g1 g1Var = wd0.g1.f444713e;
                                boolean z27 = Ui == g1Var && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi() != g1Var;
                                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "MMCareMode updateHearingAid = %b, updateLargeFont = %b", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19));
                                if (z19 || z27) {
                                    com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                    if (!z19) {
                                        u1Var3.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n8c));
                                    } else if (z27) {
                                        u1Var3.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n8b));
                                    } else {
                                        u1Var3.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n8a));
                                    }
                                    u1Var3.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n86));
                                    u1Var3.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.b6w));
                                    u1Var3.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.ui.HomeUI.12

                                        /* renamed from: a */
                                        public final /* synthetic */ boolean f196777a;

                                        /* renamed from: b */
                                        public final /* synthetic */ boolean f196778b;

                                        public AnonymousClass12(boolean z192, boolean z272) {
                                            r2 = z192;
                                            r3 = z272;
                                        }

                                        @Override // com.tencent.mm.ui.widget.dialog.w1
                                        public void a(boolean z28, java.lang.String str6) {
                                            if (z28) {
                                                if (r2) {
                                                    j65.c.h(5);
                                                    j65.e.j(5);
                                                }
                                                if (r3) {
                                                    com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                                                    if (lifecycleScope != null) {
                                                        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).fj(lifecycleScope, ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() != wd0.g1.f444713e ? ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() : ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi());
                                                    } else {
                                                        com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.HomeUI", "showCareModeNotice(), lifecycleScope is null");
                                                    }
                                                }
                                                android.content.Intent intent3 = new android.content.Intent();
                                                intent3.putExtra("Intro_Need_Clear_Top ", true);
                                                ((com.tencent.mm.app.y7) f14.g.b()).d(intent3, com.tencent.mm.ui.HomeUI.this.f196758q);
                                            }
                                        }
                                    });
                                    u1Var3.q(false);
                                }
                            } else {
                                if (i28 > 0 && j65.e.e()) {
                                    com.tencent.mm.ui.widget.dialog.u1 u1Var4 = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                    u1Var4.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n8_));
                                    u1Var4.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.n86));
                                    u1Var4.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.b6w));
                                    u1Var4.i(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.ui.HomeUI.13
                                        public AnonymousClass13() {
                                        }

                                        @Override // com.tencent.mm.ui.widget.dialog.w1
                                        public void a(boolean z28, java.lang.String str6) {
                                            if (z28) {
                                                return;
                                            }
                                            j65.c.h(j65.c.e(com.tencent.mm.sdk.platformtools.x2.f193071a));
                                            j65.e.j(0);
                                            j65.e.k(false);
                                            android.content.Intent intent3 = new android.content.Intent();
                                            intent3.putExtra("Intro_Need_Clear_Top ", true);
                                            ((com.tencent.mm.app.y7) f14.g.b()).d(intent3, com.tencent.mm.ui.HomeUI.this.f196758q);
                                        }
                                    });
                                    u1Var4.q(false);
                                }
                            }
                        }
                        if (j65.e.d()) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
                            j65.e.n(true);
                        }
                    }
                });
                if (homeUI22.f196762u) {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    int hashCode = homeUI22.hashCode();
                    iy1.c cVar = iy1.c.MainUI;
                    ((cy1.a) rVar).uj("MainUI_LeftScreen", hashCode, 1006, 0);
                }
                if (homeUI22.getMainTabUI().f196925e != 3 && (pullDownListView = (moreTabUI = (com.tencent.mm.ui.MoreTabUI) homeUI22.getMainTabUI().h(3)).f196950u) != null && !pullDownListView.f212147J) {
                    pullDownListView.n();
                    moreTabUI.V0();
                }
                com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
                newChattingTabUI.getClass();
                com.tencent.mm.sdk.platformtools.t8.i1();
                if (newChattingTabUI.f197016c == null && newChattingTabUI.n()) {
                    newChattingTabUI.f197018e = new com.tencent.mm.ui.sf(newChattingTabUI);
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.tf(newChattingTabUI), 50L);
                }
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = newChattingTabUI.f197014a;
                if ((mMFragmentActivity instanceof com.tencent.mm.ui.LauncherUI) && ((com.tencent.mm.ui.LauncherUI) mMFragmentActivity).T6() == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "tryInitVasContainer() called real create container inflate activity_common_vas_for_launcher");
                    android.view.View inflate = android.view.LayoutInflater.from(newChattingTabUI.f197014a).inflate(com.tencent.mm.R.layout.f487929bu, (android.view.ViewGroup) null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(inflate, arrayList3.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "tryInitVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/ui/NewChattingTabUI", "tryInitVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.view.ViewGroup) newChattingTabUI.f197014a.getWindow().getDecorView()).addView(inflate);
                }
                if (newChattingTabUI.k()) {
                    ((kn4.i0) ((pf0.u) i95.n0.c(pf0.u.class))).Ai("ChattingUI", 3);
                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
                    if (baseChattingUIFragment != null && baseChattingUIFragment.isSupportNavigationSwipeBack()) {
                        newChattingTabUI.f197027n.getSwipeBackLayout().setEnableGesture(true);
                    }
                } else if (newChattingTabUI.f197032s) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "[onResume] need exec this runnable!");
                    com.tencent.mm.sdk.platformtools.u3.l(newChattingTabUI.mStartChattingRunnable);
                    com.tencent.mm.sdk.platformtools.u3.h(newChattingTabUI.mStartChattingRunnable);
                    newChattingTabUI.f197032s = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "resumeNormalJump");
                com.tencent.mm.ui.uc.a();
                if ("pushcontent_notification".equals(com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "nofification_type")) && !com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "Main_FromUserName"))) {
                    java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "Main_FromUserName");
                    int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "MainUI_User_Last_Msg_Type", 0);
                    com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI", "launch report, fromUserName = %s, msgType = %d" + l17 + "" + g17);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10856, java.lang.Integer.valueOf(g17), l17, 0);
                }
                java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "LauncherUI.Shortcut.LaunchType");
                if (l18 != null) {
                    if (l18.equals("launch_type_voip")) {
                        android.content.Intent putExtra = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(putExtra);
                        java.util.Collections.reverse(arrayList4);
                        str3 = "";
                        yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11034, 2, 0);
                    } else {
                        str3 = "";
                        if (l18.equals("launch_type_voip_audio")) {
                            android.content.Intent putExtra2 = new android.content.Intent().setClassName(this, "com.tencent.mm.ui.contact.VoipAddressUI").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(putExtra2);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(this, arrayList5.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((android.content.Intent) arrayList5.get(0));
                            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11034, 2, 1);
                        } else if (!l18.equals("launch_type_scan_qrcode")) {
                            str = str3;
                            if (l18.equals("launch_type_offline_wallet")) {
                                getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                                r45.t54 t54Var = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "WalletOfflineEntranceUI", 3, r45.t54.class);
                                if (t54Var != null) {
                                    t54Var.f386157d = "launch_type_offline_wallet";
                                }
                                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                                if (intValue == 0 || intValue == 1) {
                                    android.content.Intent className = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI");
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.add(className);
                                    java.util.Collections.reverse(arrayList6);
                                    yj0.a.d(this, arrayList6.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    startActivity((android.content.Intent) arrayList6.get(0));
                                    yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                } else if (intValue == 8) {
                                    if (this.f196835r == null) {
                                        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
                                        this.f196835r = new nt4.e();
                                    }
                                    ((nt4.e) this.f196835r).b(this);
                                }
                            } else if (l18.equals("launch_type_my_qrcode")) {
                                getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                                r45.t54 t54Var2 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "SelfQRCodeUI", 3, r45.t54.class);
                                if (t54Var2 != null) {
                                    t54Var2.f386157d = "launch_type_my_qrcode";
                                }
                                ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).getClass();
                                e04.g2.a(this, null);
                            }
                        } else if (com.tencent.mm.sdk.platformtools.f9.GlobalScan.k(this, null)) {
                            str = str3;
                            getIntent().putExtra("LauncherUI.Shortcut.LaunchType", str);
                            r45.t54 t54Var3 = (r45.t54) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Di(this, "BaseScanUI", 3, r45.t54.class);
                            if (t54Var3 != null) {
                                t54Var3.f386157d = "launch_type_scan_qrcode";
                            }
                            android.content.Intent className2 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.scanner.ui.BaseScanUI");
                            className2.putExtra("key_enable_multi_code", true);
                            className2.putExtra("key_scan_goods_enable_dynamic_wording", true);
                            className2.putExtra("key_enable_scan_code_product_merge", true);
                            className2.putExtra("key_scan_report_enter_scene", 14);
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            arrayList7.add(className2);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(this, arrayList7.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((android.content.Intent) arrayList7.get(0));
                            yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                    str = str3;
                } else {
                    str = "";
                }
                java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "LauncherUI.switch.tab");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l19)) {
                    com.tencent.mm.ui.HomeUI homeUI3 = this.f196829i;
                    homeUI3.getMainTabUI().o(l19);
                    if (l19.equals("tab_find_friend")) {
                        homeUI3.getMainTabUI().h(2).getIntent().putExtra("LauncherUI.FindMore.HighLightPreference", getIntent().getStringExtra("LauncherUI.FindMore.HighLightPreference"));
                    }
                    getIntent().putExtra("LauncherUI.switch.tab", str);
                }
                getIntent().putExtra("LauncherUI.FindMore.HighLightPreference", str);
                if (com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI.From.Scaner.Shortcut", false) || this.f196834q) {
                    this.f196834q = false;
                    com.tencent.mm.ui.LauncherUI launcherUI = getInstance();
                    if (launcherUI != null) {
                        android.net.Uri referrer = getReferrer();
                        if (referrer == null || (str2 = referrer.getAuthority()) == null) {
                            str2 = str;
                        }
                        com.tencent.mm.ui.HomeUI homeUI4 = launcherUI.f196829i;
                        homeUI4.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "startScanner referrerPackageName: %s", str2);
                        gm0.j1.e().p();
                        com.tencent.mm.ui.he heVar = homeUI4.f196761t.f196922b;
                        heVar.getClass();
                        jVar3.a(new com.tencent.mm.ui.xe(heVar));
                        homeUI4.P = str2;
                        com.tencent.mm.sdk.platformtools.u3.h(homeUI4.Q);
                    }
                    getIntent().putExtra("LauncherUI.From.Scaner.Shortcut", false);
                    getIntent().putExtra("LauncherUI.switch.tab", "tab_find_friend");
                }
                boolean c18 = com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI.From.Biz.Shortcut", false);
                if (c18) {
                    action = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "LauncherUI.Shortcut.Username");
                } else {
                    c18 = com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "LauncherUI_From_Biz_Shortcut", false);
                    action = getIntent().getAction();
                }
                if (c18 && !com.tencent.mm.sdk.platformtools.t8.K0(action)) {
                    java.lang.String g18 = xp1.c.g(action);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
                        if (c01.e2.J(g18)) {
                            if (r01.z.k(g18)) {
                                ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                                if (r01.z.g(g18)) {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    intent2.setClassName(this, "com.tencent.mm.ui.bizchat.BizChatConversationUI");
                                    intent2.putExtra("Contact_User", g18);
                                    intent2.putExtra("biz_chat_from_scene", 9);
                                    intent2.addFlags(67108864);
                                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                    arrayList8.add(intent2);
                                    java.util.Collections.reverse(arrayList8);
                                    yj0.a.d(this, arrayList8.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    startActivity((android.content.Intent) arrayList8.get(0));
                                    yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                } else {
                                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                                    if (r01.z.j(g18)) {
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.setClassName(this, "com.tencent.mm.ui.conversation.EnterpriseConversationUI");
                                        intent3.putExtra("enterprise_biz_name", g18);
                                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                                        intent3.putExtra("enterprise_biz_display_name", c01.a2.e(g18));
                                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                        arrayList9.add(intent3);
                                        java.util.Collections.reverse(arrayList9);
                                        yj0.a.d(this, arrayList9.toArray(), "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        startActivity((android.content.Intent) arrayList9.get(0));
                                        yj0.a.f(this, "com/tencent/mm/ui/LauncherUI", "resumeNormalJump", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    } else if (r01.z.l(g18)) {
                                        qk.o b17 = r01.z.b(g18);
                                        java.lang.String z07 = b17 == null ? null : b17.z0();
                                        if (z07 == null) {
                                            z07 = str;
                                        }
                                        android.content.Intent intent4 = new android.content.Intent();
                                        intent4.putExtra("rawUrl", z07);
                                        intent4.putExtra("useJs", true);
                                        intent4.putExtra("srcUsername", g18);
                                        intent4.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                                        intent4.addFlags(67108864);
                                        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent4, null);
                                    } else {
                                        com.tencent.mm.ui.LauncherUI launcherUI2 = getInstance();
                                        android.os.Bundle bundle = new android.os.Bundle();
                                        bundle.putInt("chat_from_scene", 3);
                                        launcherUI2.startChatting(g18, bundle, false);
                                    }
                                }
                            } else {
                                com.tencent.mm.ui.LauncherUI launcherUI3 = getInstance();
                                if (launcherUI3 != null) {
                                    launcherUI3.startChatting(g18, null, false);
                                }
                            }
                        }
                        getIntent().putExtra("LauncherUI_From_Biz_Shortcut", false);
                        getIntent().putExtra("LauncherUI.From.Biz.Shortcut", false);
                    }
                }
                this.f196833p = true;
            } else if (!B) {
                m7();
            }
        }
        nm.a.e(5);
        if (!B) {
            l7(false);
        }
        c7();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVisibilityUtil", "fixFloatBallIfNeed, try to fix");
            Bi.e0();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallVisibilityUtil", "fixFloatBallIfNeed, service is null");
        }
        ((d73.i) i95.n0.c(d73.i.class)).C6();
        java.util.Map map = com.tencent.mm.plugin.base.stub.e0.f93731a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "checkWXBizEntry by LauncherUI");
        com.tencent.mm.plugin.base.stub.e0.f93737g = true;
        com.tencent.mm.plugin.base.stub.e0.f93738h = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.base.stub.e0.e();
        ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).checkEvilServiceStatus(this);
        if (gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.g8(this));
        }
        gm0.c2.b("LauncherUI");
        com.tencent.mm.app.u6.INSTANCE.h(com.tencent.mm.app.t6.UNTIL_LAUNCHER_UI_ON_RESUME_END);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.chattingTabUI.f197027n;
        if (baseChattingUIFragment != null) {
            java.lang.String x17 = baseChattingUIFragment.f198152f.x();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "onSaveInstanceState:%s", x17);
                bundle.putString("last_restore_talker", x17);
            }
        }
        bundle.putBoolean("last_stay_chatting", getCurrentFragmet() != null);
        bundle.putInt("last_stay_tab", getCurrentTabIndex());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSettle(boolean r4, int r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3.f196832o
            if (r0 == 0) goto L3e
            com.tencent.mm.ui.NewChattingTabUI r0 = r3.chattingTabUI
            boolean r1 = r0.n()
            if (r1 != 0) goto Ld
            goto L33
        Ld:
            if (r4 == 0) goto L31
            com.tencent.mm.ui.n8 r1 = r0.f197015b
            com.tencent.mm.ui.HomeUI r1 = (com.tencent.mm.ui.HomeUI) r1
            com.tencent.mm.ui.MainTabUI r1 = r1.f196761t
            java.util.HashMap r1 = r1.f196935o
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.ui.conversation.MainUI r1 = (com.tencent.mm.ui.conversation.MainUI) r1
            if (r1 == 0) goto L31
            yf5.j0 r1 = r1.f207379v
            if (r1 == 0) goto L31
            yf5.w0 r1 = (yf5.w0) r1
            com.tencent.mm.ui.conversation.b3 r1 = r1.f461988t
            r2 = 170(0xaa, float:2.38E-43)
            r1.b(r2)
        L31:
            if (r6 != 0) goto L35
        L33:
            r0 = 1
            goto L39
        L35:
            boolean r0 = r0.a(r4, r5)
        L39:
            if (r0 != 0) goto L3e
            super.onSettle(r4, r5, r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.LauncherUI.onSettle(boolean, int, boolean):void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
        if (c9Var != null) {
            ((com.tencent.mm.plugin.finder.service.l3) c9Var).aj();
        }
        if (((pm4.u) i95.n0.c(pm4.u.class)) != null) {
            new com.tencent.mm.plugin.event.TopStoryLauncherStartEvent().e();
        }
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI", "onStop %s", java.lang.Integer.valueOf(hashCode()));
        nm.a.a(512);
        nm.a.f338422w = false;
        boolean y17 = com.tencent.mm.ui.bk.y();
        com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        if (y17) {
            if (homeUI != null) {
                homeUI.j();
            }
            this.chattingTabUI.h();
        }
        homeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "doOnStop!!");
        if (!(c01.d9.f37105b == null)) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        }
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.i("showprivacypolicy", homeUI.U);
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    public void onSwipe(float f17) {
        boolean z17;
        if (this.f196832o) {
            com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
            com.tencent.mm.ui.n8 n8Var = newChattingTabUI.f197015b;
            if (newChattingTabUI.n()) {
                if (f17 == 0.0f && !newChattingTabUI.f197024k) {
                    newChattingTabUI.q(0);
                    android.widget.ImageView imageView = (android.widget.ImageView) newChattingTabUI.f197014a.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_);
                    if (imageView != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE no cache!");
                        imageView.setVisibility(8);
                        imageView.setImageDrawable(null);
                    }
                    android.view.animation.Animation animation = newChattingTabUI.f197033t;
                    if (animation != null) {
                        animation.cancel();
                    }
                } else if (f17 == 1.0f && !newChattingTabUI.f197024k && !newChattingTabUI.f197027n.H0()) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) newChattingTabUI.f197014a.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.l3_);
                    if (imageView2 != null && imageView2.getVisibility() == 0 && imageView2.getTag() != null) {
                        android.view.View view = (android.view.View) imageView2.getTag();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/NewChattingTabUI", "onSwipe", "(F)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] prepareView GONE");
                        imageView2.setVisibility(8);
                    }
                    if (newChattingTabUI.f197027n.getContentView() == null || newChattingTabUI.f197027n.getContentView().getX() > 0.0f) {
                        newChattingTabUI.q(0);
                    } else {
                        newChattingTabUI.q(8);
                    }
                }
                if (((com.tencent.mm.ui.HomeUI) n8Var).f196757p == com.tencent.mm.ui.HomeUI.ActivityStatus.ACTIVITY_RESUME) {
                    z17 = true;
                } else if (java.lang.Float.compare(1.0f, f17) > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] return! consumedSuperCall:%s", java.lang.Boolean.FALSE);
                    z17 = false;
                } else {
                    z17 = false;
                }
                com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = newChattingTabUI.f197014a;
                if (mMFragmentActivity != null) {
                    android.view.View findViewById = mMFragmentActivity.findViewById(com.tencent.mm.R.id.huh);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) newChattingTabUI.f197014a.findViewById(com.tencent.mm.R.id.l3_);
                    if (imageView3 != null && imageView3.getVisibility() == 8 && imageView3.getDrawable() != null && !newChattingTabUI.f197024k && f17 != 1.0f && f17 != 0.0f) {
                        imageView3.setVisibility(0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onSwipe] !1 && !0 prepareView VISIBLE");
                        newChattingTabUI.q(8);
                    }
                    if (java.lang.Float.compare(1.0f, f17) <= 0) {
                        com.tencent.mm.ui.tools.l5.c(findViewById, 0.0f, 0.0f);
                        if (imageView3 != null && imageView3.getDrawable() != null) {
                            com.tencent.mm.ui.tools.l5.c(imageView3, 0.0f, 0.0f);
                        }
                    } else if (imageView3 != null && imageView3.getDrawable() != null) {
                        com.tencent.mm.ui.tools.l5.c(imageView3, (imageView3.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
                    } else if (findViewById != null) {
                        com.tencent.mm.ui.tools.l5.c(findViewById, (findViewById.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
                    }
                }
            } else {
                z17 = true;
            }
            if (z17) {
                return;
            }
            super.onSwipe(f17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        android.view.ActionMode actionMode;
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.chattingTabUI;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
        if (baseChattingUIFragment == null || baseChattingUIFragment.A0() == null || !((com.tencent.mm.ui.chatting.ChattingUIFragment) newChattingTabUI.f197027n).isSupportNavigationSwipeBack() || fp.h.b(22) || (actionMode = newChattingTabUI.f197027n.A0().A0.g(callback)) == null) {
            actionMode = null;
        }
        return actionMode == null ? super.onWindowStartingActionMode(callback) : actionMode;
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent != null && intent.getComponent() != null) {
            com.tencent.mm.ui.tools.sd.f210742a.a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i17, bundle);
    }

    public void startChatting(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        yf5.j0 j0Var;
        com.tencent.mm.ui.HomeUI homeUI = this.f196829i;
        homeUI.getClass();
        if (c01.z1.H().booleanValue() && !com.tencent.mm.ui.HomeUI.f196738a0.booleanValue()) {
            com.tencent.mm.ui.HomeUI.f196739b0.booleanValue();
        }
        boolean y17 = com.tencent.mm.ui.bk.y();
        com.tencent.mm.ui.MainTabUI mainTabUI = homeUI.f196761t;
        if (y17) {
            mainTabUI.f196929i = java.lang.Boolean.TRUE;
        } else {
            com.tencent.mm.ui.conversation.MainUI mainUI = (com.tencent.mm.ui.conversation.MainUI) mainTabUI.f196935o.get(0);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mainTabUI.f196921a.findViewById(com.tencent.mm.R.id.huh);
            boolean z18 = (com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.c0() || com.tencent.mm.ui.bk.y())) || com.tencent.mm.ui.bk.Z() || com.tencent.mm.ui.bk.w0();
            if (viewGroup != null && !z18) {
                viewGroup.setImportantForAccessibility(4);
            }
            if (mainUI != null) {
                mainUI.onHiddenChanged(true);
            }
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = mainTabUI.f196925e;
            kn4.i0 i0Var = (kn4.i0) uVar;
            i0Var.getClass();
            java.lang.String str2 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "MoreTabUI" : "FindMoreFriendUI" : "AddressUI" : "MainUI";
            if (str2 != null) {
                i0Var.Ai(str2, 4);
            }
            com.tencent.mm.ui.conversation.MainUI mainUI2 = (com.tencent.mm.ui.conversation.MainUI) mainTabUI.f196935o.get(0);
            if (mainUI2 != null && (j0Var = mainUI2.f207379v) != null) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (w0Var.f461991w) {
                    w0Var.f461991w = false;
                }
            }
            com.tencent.mm.ui.he heVar = mainTabUI.f196922b;
            heVar.getClass();
            nm.j.f338443g.a(new com.tencent.mm.ui.xe(heVar));
            mainTabUI.f196934n = true;
        }
        this.chattingTabUI.r(str, bundle, z17);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        hashSet.add(la5.l0.class);
        hashSet.add(la5.c0.class);
        hashSet.add(la5.n.class);
        hashSet.add(la5.m.class);
        ((xe0.l0) i95.n0.c(xe0.l0.class)).getClass();
        hashSet.add(uj4.e.class);
        hashSet.add(cd0.b.class);
        hashSet.add(xn5.w0.class);
        hashSet.add(uj5.e.class);
        hashSet.add(la5.r0.class);
        hashSet.add(tf5.m.class);
    }
}
