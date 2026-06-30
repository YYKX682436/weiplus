package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q5 implements com.tencent.mm.modelbase.v0, com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f208000y;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Activity f208009o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f208010p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.q f208011q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.o5 f208012r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.m6 f208013s;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208015u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208016v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.FLock f208017w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f208018x;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f208001d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f208002e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f208003f = false;

    /* renamed from: g, reason: collision with root package name */
    public final fp.j f208004g = new fp.j();

    /* renamed from: h, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f208005h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f208006i = false;

    /* renamed from: m, reason: collision with root package name */
    public w11.k0 f208007m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f208008n = null;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.o6 f208014t = new com.tencent.mm.ui.conversation.o6();

    public q5() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f208015u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QueryDoingInitEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.InitHelper$1
            {
                this.__eventId = 1192037483;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.QueryDoingInitEvent queryDoingInitEvent) {
                am.cp cpVar = queryDoingInitEvent.f54635g;
                com.tencent.mm.ui.conversation.q5.this.getClass();
                cpVar.getClass();
                return false;
            }
        };
        this.f208016v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TriggerInitEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.InitHelper$2
            {
                this.__eventId = -1308291390;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TriggerInitEvent triggerInitEvent) {
                com.tencent.mm.ui.conversation.q5 q5Var = com.tencent.mm.ui.conversation.q5.this;
                if (q5Var.f208009o == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "inithelper hasn't initialized");
                } else {
                    q5Var.f208003f = false;
                    q5Var.c();
                }
                return false;
            }
        };
        this.f208018x = false;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null || m1Var.getType() != 139) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.j6(this, (int) (j18 != 0 ? (j17 * 100) / j18 : 0L)));
    }

    public final void a() {
        android.app.Activity activity = (android.app.Activity) this.f208010p.get();
        if (this.f208018x || activity == null) {
            j35.b.a(activity);
            return;
        }
        this.f208018x = true;
        if (android.os.Build.VERSION.SDK_INT < 33 || activity.getApplicationInfo().targetSdkVersion < 33) {
            j35.b.a(activity);
            return;
        }
        if (j35.u.d(activity, "android.permission.POST_NOTIFICATIONS", true)) {
            j35.b.a(activity);
            return;
        }
        if (j35.u.f("android.permission.POST_NOTIFICATIONS", 160) != 0 && !z2.h.b(activity, "android.permission.POST_NOTIFICATIONS")) {
            j35.b.a(activity);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(160, new com.tencent.mm.ui.conversation.u5(this, activity), "android.permission.POST_NOTIFICATIONS");
    }

    public final boolean b(int i17, int i18, int i19) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InitHelper", "account not ready");
            return false;
        }
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_FLAG_LONG;
        long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) p17.m(u3Var, null), 0L);
        long k18 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_TIME_LONG, null), 0L);
        com.tencent.mm.storage.n3 p18 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_VERION_LONG;
        long k19 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) p18.m(u3Var2, null), 0L);
        c01.d9.b().p().x(u3Var, 0L);
        c01.d9.b().p().x(u3Var2, 0L);
        if (k19 == o45.wf.f343029g && com.tencent.mm.sdk.platformtools.t8.H1(k18) < 3600) {
            if (k17 == 1) {
                if (com.tencent.mm.ui.qc.b(this.f208009o, 4, -17, null)) {
                    return true;
                }
            } else if (k17 == 2 && com.tencent.mm.ui.qc.b(this.f208009o, 4, -16, null)) {
                return true;
            }
        }
        if (i17 != 4) {
            return false;
        }
        if (i18 != -16 && i18 != -17) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "trigger check update: errCode:%d, sceneType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (x51.o1.f452055h) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", (com.tencent.mm.sdk.platformtools.t8.i1() - 86400) - 1).commit();
        }
        return com.tencent.mm.ui.qc.b(this.f208009o, i17, i18, null);
    }

    public final void c() {
        if (this.f208003f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "summerinit doPreCreate but hasTryDoInitButFailed true ret");
            return;
        }
        if (!this.f208005h.isHeld()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InitHelper", "tryDoInit wakelock.acquire!");
            android.os.PowerManager.WakeLock wakeLock = this.f208005h;
            yj0.a.c(wakeLock, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        yf5.j0 j0Var = ((com.tencent.mm.ui.conversation.MainUI) this.f208013s).f207379v;
        if (j0Var != null) {
            ((yf5.w0) j0Var).f461994z = true;
        }
        com.tencent.mm.autogen.events.DoingInitContactEvent doingInitContactEvent = new com.tencent.mm.autogen.events.DoingInitContactEvent();
        doingInitContactEvent.f54093g.f6636a = 1;
        doingInitContactEvent.e();
        if (this.f208007m == null) {
            if (p94.w0.c() != null) {
                com.tencent.mm.plugin.sns.storage.e2 e2Var = (com.tencent.mm.plugin.sns.storage.e2) p94.w0.c();
                e2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                e2Var.f165970d = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            }
            this.f208007m = new w11.k0(this, this.f208009o);
            fp.j jVar = this.f208004g;
            jVar.a();
            this.f208007m.hashCode();
            jVar.b();
            c01.d9.e().g(this.f208007m);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.conversation.i6(this));
    }

    public void d() {
        android.os.PowerManager.WakeLock wakeLock = this.f208005h;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
        android.os.PowerManager.WakeLock wakeLock2 = this.f208005h;
        yj0.a.c(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        yj0.a.f(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.q5.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r27, int r28, java.lang.String r29, com.tencent.mm.modelbase.m1 r30) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.q5.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
