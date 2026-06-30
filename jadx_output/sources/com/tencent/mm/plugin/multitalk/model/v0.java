package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class v0 implements android.content.ServiceConnection {
    public final com.tencent.mm.sdk.platformtools.n3 A1;
    public final android.content.BroadcastReceiver B1;
    public com.tencent.mm.plugin.multitalk.model.z C;
    public final com.tencent.mm.sdk.event.IListener C1;
    public com.tencent.mm.plugin.multitalk.model.n2 E;

    /* renamed from: J, reason: collision with root package name */
    public zi3.f f150160J;
    public final com.tencent.mm.plugin.multitalk.model.m2 K;
    public com.tencent.mm.plugin.multitalk.model.k2 L;
    public com.tencent.mm.plugin.multitalk.model.r3 M;
    public com.tencent.mm.plugin.multitalk.model.p3 N;
    public com.tencent.mm.plugin.multitalk.model.j P;
    public com.tencent.mm.plugin.multitalk.model.a2 Q;
    public int R;
    public final com.tencent.mm.plugin.multitalk.ui.h S;
    public final java.lang.Object T;
    public final java.lang.Object U;
    public final java.util.Map V;
    public final java.util.HashMap W;
    public final tq4.b X;
    public gi.q0 Y;
    public final com.tencent.mm.ui.tools.kd Z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f150161d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f150162e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f150163f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f150164g;

    /* renamed from: h, reason: collision with root package name */
    public int f150165h;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f150167l1;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f150170o;

    /* renamed from: p0, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f150172p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.c3 f150173p1;

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f150182x0;

    /* renamed from: x1, reason: collision with root package name */
    public androidx.lifecycle.j0 f150183x1;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.s1 f150185y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f150186y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f150188z1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f150166i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f150168m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f150169n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f150171p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.util.HashSet f150174q = new java.util.HashSet();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f150175r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public sj3.e4 f150176s = sj3.e4.Init;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modeltalkroom.MultiTalkGroup f150177t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150178u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f150179v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f150180w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f150181x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150184y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f150187z = false;
    public long A = 0;
    public long B = 30000;
    public wu5.c D = null;
    public com.tencent.mm.modeltalkroom.MultiTalkGroup F = null;
    public long G = 0;
    public boolean H = false;
    public boolean I = false;

    public v0() {
        com.tencent.mm.plugin.multitalk.model.m2 m2Var = new com.tencent.mm.plugin.multitalk.model.m2();
        this.K = m2Var;
        this.R = 0;
        com.tencent.mm.plugin.multitalk.ui.h hVar = new com.tencent.mm.plugin.multitalk.ui.h();
        this.S = hVar;
        com.tencent.mm.plugin.multitalk.model.j1 j1Var = new com.tencent.mm.plugin.multitalk.model.j1(this);
        this.T = new java.lang.Object();
        this.U = new java.lang.Object();
        this.V = new java.util.HashMap();
        this.W = new java.util.HashMap();
        this.X = new tq4.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.Z = new com.tencent.mm.plugin.multitalk.model.k1(this);
        this.f150172p0 = new java.util.concurrent.CopyOnWriteArrayList();
        this.f150182x0 = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.multitalk.model.q1(this), true);
        this.f150167l1 = false;
        this.f150183x1 = new androidx.lifecycle.j0();
        this.f150188z1 = false;
        this.A1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.B1 = new com.tencent.mm.plugin.multitalk.model.f1(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$17
            {
                this.__eventId = -893558668;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent) {
                com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent2 = refreshMainUIMultitalkIconEvent;
                if (refreshMainUIMultitalkIconEvent2 == null) {
                    return false;
                }
                int i17 = refreshMainUIMultitalkIconEvent2.f54671g.f7358a;
                com.tencent.mm.plugin.multitalk.model.v0 v0Var = com.tencent.mm.plugin.multitalk.model.v0.this;
                if (i17 != 1) {
                    if (i17 != 2) {
                        return false;
                    }
                    try {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(v0Var.B1);
                        return false;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "phoneStatusReceiver unregister error %s", e17.fillInStackTrace());
                        return false;
                    }
                }
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.addAction("android.intent.action.PHONE_STATE_2");
                intentFilter.addAction("android.intent.action.PHONE_STATE2");
                intentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
                intentFilter.addAction("android.intent.action.DUAL_PHONE_STATE");
                intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
                try {
                    if (fp.h.a(33)) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(v0Var.B1, intentFilter);
                    } else {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(v0Var.B1, intentFilter, 2);
                    }
                    return false;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "phoneStatusReceiver register error %s", e18.fillInStackTrace());
                    return false;
                }
            }
        };
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkActionEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitalk.model.MultiTalkManager$18
            {
                this.__eventId = 1177822575;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent2 = multiTalkActionEvent;
                if (multiTalkActionEvent2 instanceof com.tencent.mm.autogen.events.MultiTalkActionEvent) {
                    int i17 = multiTalkActionEvent2.f54504g.f6259a;
                    com.tencent.mm.plugin.multitalk.model.v0 v0Var = com.tencent.mm.plugin.multitalk.model.v0.this;
                    am.ck ckVar = multiTalkActionEvent2.f54505h;
                    if (i17 != 1) {
                        if (i17 == 2) {
                            com.tencent.mm.plugin.multitalk.model.z zVar = v0Var.C;
                            if (zVar != null ? zVar.g4() : false) {
                                ckVar.f6359a = true;
                            }
                        }
                    } else if (v0Var.x()) {
                        ckVar.f6359a = true;
                    }
                }
                return false;
            }
        };
        this.C1 = iListener2;
        ((java.util.ArrayDeque) m2Var.f150045a).clear();
        iListener2.alive();
        iListener.alive();
        hVar.f150285w = j1Var;
    }

    public static boolean u(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks = ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1);
        if (runningTasks != null && !runningTasks.isEmpty()) {
            android.content.ComponentName componentName = runningTasks.get(0).topActivity;
            componentName.flattenToString();
            if (!componentName.getPackageName().equals(context.getPackageName())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "is in backGround.");
                return false;
            }
        }
        if (((android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "is in foreGround.");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A() {
        /*
            r4 = this;
            zi3.f r0 = r4.f150160J
            r1 = 1
            if (r0 == 0) goto L31
            r0.getClass()
            java.lang.Class<mx3.j> r0 = mx3.j.class
            i95.m r0 = i95.n0.c(r0)
            mx3.j r0 = (mx3.j) r0
            mx3.u r0 = (mx3.u) r0
            yx3.v r0 = r0.Ai()
            r2 = 0
            r3 = 9
            if (r0 == 0) goto L2c
            yx3.k r0 = r0.f467943c
            if (r0 == 0) goto L27
            boolean r0 = r0.d()
            if (r0 != r1) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2c
            r0 = 5
            goto L2d
        L2c:
            r0 = r3
        L2d:
            if (r0 != r3) goto L30
            goto L31
        L30:
            r1 = r2
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.v0.A():boolean");
    }

    public boolean B() {
        return com.tencent.mm.plugin.multitalk.model.o2.g(this.f150165h);
    }

    public void C(boolean z17) {
        if (!x() || this.f150186y1) {
            return;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h0y);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h2o);
        android.content.Intent intent = new android.content.Intent();
        if (this.f150169n) {
            intent.putExtra("enterMainUIScreenProjectOnline", true);
            intent.putExtra("enterMainUIScreenProjectParams", this.f150170o);
        }
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 43, intent, fp.g0.a(134217728));
        int i17 = fp.h.a(19) ? com.tencent.mm.R.drawable.c7u : com.tencent.mm.R.drawable.c7v;
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(string2);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(string);
        k0Var.e(string2);
        k0Var.f469463g = activity;
        android.app.Notification a17 = vq4.p0.a(k0Var);
        a17.icon = i17;
        a17.flags |= 32;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.model.b1(this, a17, z17));
    }

    public void D(sj3.e4 e4Var) {
        sj3.e4 e4Var2 = this.f150176s;
        this.f150176s = e4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onChangeMultiTalkStatus is %s", e4Var);
        if (e4Var2 != e4Var) {
            if (e4Var == sj3.e4.Talking) {
                com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
                refreshMainUIMultitalkIconEvent.f54671g.f7358a = 1;
                refreshMainUIMultitalkIconEvent.e();
                boolean equals = this.f150177t.f71610h.equals(c01.z1.r());
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f150180w;
                java.lang.String e17 = com.tencent.mm.plugin.multitalk.model.o2.e(this.f150177t);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(220L, 34L, 1L, false);
                g0Var.d(12725, 1, java.lang.Integer.valueOf(equals ? 1 : 2), java.lang.Long.valueOf(currentTimeMillis), e17);
                com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
                i95.m c17 = i95.n0.c(ym1.f.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                xm1.h hVar = ((ym1.f) c17).f463136e;
                if (hVar == null) {
                    hVar = new xm1.j();
                    i95.m c18 = i95.n0.c(ym1.f.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    ((ym1.f) c18).f463136e = hVar;
                    i95.m c19 = i95.n0.c(ym1.f.class);
                    kotlin.jvm.internal.o.f(c19, "getService(...)");
                    ((ym1.f) c19).f463138g[0] = "music";
                }
                xm1.h.y(hVar, 3, null, 2, null);
            }
            com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
            if (zVar != null) {
                zVar.I5(e4Var2, e4Var);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "pushMultiTalkStatus: " + ((java.util.ArrayDeque) this.K.f150045a).offer(e4Var));
        }
    }

    public void E(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_mutex_adjust, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s checkInVoip %b isIPCallStarted %b isIPCallStarted %b", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup), java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
        if (fj6) {
            boolean z17 = vq4.p0.c() || vq4.p0.d();
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk isInVoip %b ipcall %b voip %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
                f(false, false);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onCreateMultiTalk: %s", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
        com.tencent.mm.plugin.multitalk.model.u0.c(true);
        if (c0(multiTalkGroup)) {
            zj3.g gVar = zj3.g.f473302a;
            gVar.a(v());
            if (!android.text.TextUtils.isEmpty(multiTalkGroup.f71606d)) {
                java.lang.String groupId = multiTalkGroup.f71606d;
                kotlin.jvm.internal.o.g(groupId, "groupId");
                zj3.g.f473308g = groupId;
            }
            java.util.List list = multiTalkGroup.f71611i;
            if (list != null) {
                gVar.c(list);
            }
            H();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0046. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.v0.F(int, java.lang.Object):void");
    }

    public void G(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(this.f150162e);
        objArr[1] = java.lang.Boolean.valueOf(this.f150163f);
        objArr[2] = java.lang.Boolean.valueOf(this.f150166i);
        objArr[3] = this.f150176s.toString();
        objArr[4] = java.lang.Boolean.valueOf(this.f150177t == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", objArr);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(220L, 1L, 1L, false);
        if (!ip.b.t() && !u(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
            if (this.F == null) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f150182x0;
                if (b4Var.e()) {
                    this.F = multiTalkGroup;
                    b4Var.c(2000L, 2000L);
                    this.G = java.lang.System.currentTimeMillis();
                    g0Var.idkeyStat(500L, 6L, 1L, false);
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String d17 = com.tencent.mm.plugin.multitalk.model.o2.d(multiTalkGroup);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
        if (!(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MultitalkBlockReceiver", 0) == 0) || n17 == null || n17.o2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "not open multitalk receiver or black user");
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.multitalk.model.r1(this, multiTalkGroup), 1000L);
            com.tencent.mm.plugin.multitalk.model.u0.e(3, com.tencent.mm.plugin.multitalk.model.o2.e(multiTalkGroup));
            return;
        }
        if (x() || vq4.p0.d() || vq4.p0.c() || p21.i.a() || com.tencent.mm.sdk.platformtools.l5.Bi() || !n17.r2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: exit multitalk: %s", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
            if (!((py.a) ((qy.i) i95.n0.c(qy.i.class))).Ai(multiTalkGroup.f71608f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", multiTalkGroup.f71608f);
                ((c01.k7) c01.n8.a()).b(multiTalkGroup.f71608f, 25, new com.tencent.mm.plugin.multitalk.model.w0(this));
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.multitalk.model.x0(this, multiTalkGroup), 1000L);
            com.tencent.mm.plugin.multitalk.model.u0.e(3, com.tencent.mm.plugin.multitalk.model.o2.e(multiTalkGroup));
            return;
        }
        if (!((py.a) ((qy.i) i95.n0.c(qy.i.class))).Ai(multiTalkGroup.f71608f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", multiTalkGroup.f71608f);
            ((c01.k7) c01.n8.a()).b(multiTalkGroup.f71608f, 25, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: %s", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
        D(sj3.e4.Inviting);
        com.tencent.mm.plugin.multitalk.model.u0.e(1, com.tencent.mm.plugin.multitalk.model.o2.e(multiTalkGroup));
        if (n17.r2()) {
            iq.b.r();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk friend show invitingUI inviter=%s,currentuser=%s", d17, c01.z1.r());
            com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
            multiTalkActionEvent.f54504g.f6259a = 3;
            multiTalkActionEvent.e();
            e(multiTalkGroup, java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk nofriend do not show invitingUI  inviter=%s,currentuser=%s", d17, c01.z1.r());
        if (c0(multiTalkGroup)) {
            this.f150161d = false;
            t();
            V();
        }
    }

    public final void H() {
        ((java.util.HashMap) this.V).clear();
        if (com.tencent.mm.plugin.multitalk.model.o2.f(this.f150177t)) {
            D(sj3.e4.Talking);
            rq4.u uVar = rq4.u.f399109a;
            rq4.u.f399115g = java.lang.System.currentTimeMillis();
        } else {
            D(sj3.e4.Starting);
        }
        com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
        if (zVar != null) {
            zVar.C();
            com.tencent.mm.plugin.multitalk.model.n2 c17 = com.tencent.mm.plugin.multitalk.model.o2.c();
            if (c17 != this.E) {
                this.E = c17;
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
        intent.addFlags(268435456);
        com.tencent.mm.ui.fj.d(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class, 0);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/model/MultiTalkManager", "onMySelfEnterMultiTalk", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/multitalk/model/MultiTalkManager", "onMySelfEnterMultiTalk", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void I() {
        java.lang.String wxGroupId;
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150177t;
        if (multiTalkGroup == null || (wxGroupId = multiTalkGroup.f71608f) == null) {
            return;
        }
        java.lang.String roomId = multiTalkGroup.f71607e;
        kotlin.jvm.internal.o.g(wxGroupId, "wxGroupId");
        kotlin.jvm.internal.o.g(roomId, "roomId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("wxGroupId", wxGroupId);
        jSONObject.put("roomId", roomId);
        jSONObject.put("state", 1);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.plugin.multitalk.model.t2.f150137b);
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        M.putString("mmkv_multitalk_status", jSONObject.toString());
    }

    public void J(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f150172p0.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!str2.equals(str)) {
                arrayList.add(str2);
            }
        }
        this.f150172p0 = new java.util.concurrent.CopyOnWriteArrayList(arrayList);
    }

    public void K() {
        ((ku5.t0) ku5.t0.f312615d).A("delayChecking");
        this.f150173p1 = null;
        androidx.lifecycle.j0 j0Var = this.f150183x1;
        if (j0Var != null) {
            j0Var.postValue(null);
        }
    }

    public void L() {
        this.f150185y0 = null;
        this.f150184y = false;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(41);
    }

    public void M(boolean z17) {
        zi3.f fVar = this.f150160J;
        tq4.b bVar = this.X;
        if (z17 || (fVar != null && fVar.F())) {
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenSensorController", "disable()");
            bVar.f421235b.a();
            bVar.a();
            return;
        }
        if (this.f150176s == sj3.e4.Talking) {
            bVar.f421235b.b(bVar.f421236c);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenSensorController", "enable()");
        }
    }

    public void N(android.app.Activity activity) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo8));
        u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo7));
        u1Var.q(false);
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.Z = null;
        if (activity != null) {
            activity.finish();
            K();
        }
        f(false, false);
    }

    public void O(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "setCurrentMTSDKMode groupid:%s, mode:%d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = this.W;
        if (hashMap == null) {
            return;
        }
        if (hashMap.containsKey(str) && ((java.lang.Integer) hashMap.get(str)).intValue() == i17) {
            return;
        }
        hashMap.put(str, java.lang.Integer.valueOf(i17));
    }

    public void P(boolean z17) {
        this.f150163f = z17;
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().y() || this.C == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "setHandFreeEnable: %s", java.lang.Boolean.valueOf(z17));
        this.C.n3(z17);
    }

    public void Q(boolean z17) {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: set mute record: %b", java.lang.Boolean.valueOf(z17));
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.l3(i4Var, null, z17));
        this.f150162e = z17;
        com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
        if (zVar != null) {
            zVar.Z(z17);
        }
    }

    public void R(boolean z17) {
        zi3.f fVar;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MT.MultiTalkManager", "set multitalk speaker %s", java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.f149625g.f149759a != null && (fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J) != null) {
            fVar.D(z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onSpeakerStateChange %b, status=%s", java.lang.Boolean.valueOf(z17), this.f150176s.toString());
        this.f150163f = z17;
        com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
        if (zVar != null) {
            zVar.h0(z17);
        }
        M(z17);
    }

    public final void S() {
        java.util.List list = this.f150177t.f71611i;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = null;
        for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember2 : this.f150177t.f71611i) {
            if (multiTalkGroupMember2.f71612d.equals(c01.z1.r())) {
                multiTalkGroupMember = multiTalkGroupMember2;
            } else {
                linkedList.add(multiTalkGroupMember2);
            }
        }
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.multitalk.model.l1(this));
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.multitalk.model.m1(this));
        java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.multitalk.model.n1(this));
        if (multiTalkGroupMember != null) {
            linkedList.add(multiTalkGroupMember);
        }
        this.f150177t.f71611i = linkedList;
    }

    public void T() {
        sj3.j jVar;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "try to startNetworkReceiver");
        if (v() && !zj3.j.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "startNetworkReceiver exit due to ILINK mode!!!");
            return;
        }
        if (this.C == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "ui callback is null");
            return;
        }
        if (this.f150174q.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "currentVideoUserSet.size() is 0,just return.");
            return;
        }
        com.tencent.mm.plugin.multitalk.model.a2 n17 = n();
        if (n17 != null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "startDecodeVideo", new java.lang.Object[0]);
            n17.f();
            cj3.n nVar = n17.f149876b;
            if (nVar != null) {
                com.tencent.mm.plugin.multitalk.model.z1 z1Var = new com.tencent.mm.plugin.multitalk.model.z1(n17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeVideo");
                if (com.tencent.mm.plugin.multitalk.model.e3.Ri().v()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "startDecodeVideo: ilink callback mode");
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.R(nVar.f41902f);
                } else if (nVar.f41899c) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MTR.MultiTalkEngineOp", "video decode runner is working");
                } else {
                    nVar.f41899c = true;
                    z1Var.invoke(new cj3.m(new cj3.i(nVar, z1Var)));
                }
            }
        }
        if (!m().j() || (jVar = m().f150008h) == null || (multitalkFrameView = jVar.f408577d) == null) {
            return;
        }
        multitalkFrameView.getF150344m();
    }

    public void U(boolean z17) {
        zi3.f fVar;
        if (this.f150161d || (fVar = this.f150160J) == null) {
            return;
        }
        fVar.I(z17, 0);
        this.f150161d = true;
    }

    public final void V() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "startTimeCount");
        wu5.c cVar = this.D;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f150180w = java.lang.System.currentTimeMillis();
        this.f150181x = 0;
        vq4.d.a();
        this.D = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.multitalk.model.i1(this), 1000L, 1000L);
    }

    public void W() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkDataSource");
        if (n() != null) {
            com.tencent.mm.plugin.multitalk.model.a2 n17 = n();
            n17.getClass();
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MTR.MultiTalkRenderLogic", "stopDecodeVideo", new java.lang.Object[0]);
            cj3.n nVar = n17.f149876b;
            if (nVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MultiTalkEngineOp", "stopDecodeVideo");
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.R(null);
                nVar.f41899c = false;
            }
        }
    }

    public void X() {
        zi3.f fVar;
        if (!this.f150161d || (fVar = this.f150160J) == null) {
            return;
        }
        fVar.f455177i = null;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
        this.f150161d = false;
    }

    public void Y(java.util.Set set, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(set);
        i4Var.getClass();
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.f3(i4Var, arrayList2, arrayList));
    }

    public boolean Z(int i17, boolean z17) {
        if (z17) {
            if (!y()) {
                return false;
            }
            this.f150188z1 = true;
            this.f150165h = i17;
            return true;
        }
        if (y()) {
            this.f150188z1 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "try switch to action : " + i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "switchMultiTalkVideo result: %b", java.lang.Boolean.FALSE);
            int i18 = this.f150165h;
            this.f150165h = i17;
            com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
            if (zVar != null && i18 != i17) {
                zVar.p0(i18, i17);
            }
        }
        return false;
    }

    public void a() {
        if (!x()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: Not in MultiTalking");
            return;
        }
        com.tencent.mm.plugin.multitalk.model.e3.Di().J();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: %s, wifigateway:%s", com.tencent.mm.plugin.multitalk.model.o2.b(this.f150177t), com.tencent.mm.plugin.voip.model.v2protocal.w());
        synchronized (this.U) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.i();
        }
    }

    public boolean a0(int i17) {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.getClass();
        i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.q3(i4Var, i17));
        return true;
    }

    public void b() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "bindSmallServiceIfNeed");
            int d07 = d0();
            if (fp.h.c(26)) {
                if ((this.H && d07 == this.R) || !y() || d07 == 0) {
                    return;
                }
                this.R = d07;
                android.content.Intent intent = new android.content.Intent();
                if (this.f150169n) {
                    intent.putExtra("enterMainUIScreenProjectOnline", true);
                    intent.putExtra("enterMainUIScreenProjectParams", this.f150170o);
                }
                intent.putExtra("enterMainUiWithPermission", this.R);
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.multitalk.service.NewMultiTalkingForegroundService.class);
                try {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
                    this.H = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "bindSmallService isBindSmallService: true");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", e17, "using start foreground service to bindVoipForegroundIfNeed error: %s", e17.getMessage());
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", e18, "bindSmallServiceIfNeed error: %s", e18.getMessage());
        }
    }

    public final void b0(java.lang.String str) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String string = context.getString(com.tencent.mm.R.string.f492595h32, c01.a2.e(str));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string), 0).show();
    }

    public void c(boolean z17) {
        com.tencent.mm.plugin.multitalk.model.p3 p3Var = this.N;
        if (p3Var == null) {
            return;
        }
        java.util.ArrayList arrayList = p3Var.f150068a;
        if (arrayList != null) {
            arrayList.clear();
        }
        p3Var.f150068a = null;
        p3Var.g(0, "");
        if (!z17) {
            p3Var.f150072e.clear();
        }
        p3Var.f150071d.f149996d = null;
        com.tencent.mm.plugin.multitalk.model.e0 e0Var = p3Var.f150074g;
        if (e0Var != null) {
            e0Var.f149924i = false;
            e0Var.f149925m = false;
            e0Var.f149927o = 0;
            com.tencent.mm.plugin.multitalk.model.b3 b3Var = p3Var.f150073f;
            if (b3Var != null) {
                b3Var.a(new com.tencent.mm.plugin.multitalk.model.w2(b3Var));
                android.os.HandlerThread handlerThread = b3Var.f149891d;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
            }
            p3Var.f150073f = null;
        }
        p3Var.f150074g = null;
        if (z17) {
            return;
        }
        this.N = null;
    }

    public boolean c0(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        if (!x()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "first time update multitalk group: %s", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
            this.f150177t = multiTalkGroup;
            this.f150181x = 0;
            this.f150165h = 1;
            this.f150174q.clear();
            e0();
            S();
            return true;
        }
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup2 = this.f150177t;
        if (!((multiTalkGroup == null || multiTalkGroup2 == null || ((com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup.f71606d) || com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup2.f71606d) || !multiTalkGroup.f71606d.equals(multiTalkGroup2.f71606d)) && (com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup.f71607e) || com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup2.f71607e) || !multiTalkGroup.f71607e.equals(multiTalkGroup2.f71607e)))) ? false : true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "updateCurrentMultiTalkGroup: not same multitalk\ncurrentGroup=%s\nchangeGroup=%s", com.tencent.mm.plugin.multitalk.model.o2.b(this.f150177t), com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "update multitalk group: %s", com.tencent.mm.plugin.multitalk.model.o2.b(multiTalkGroup));
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup3 = this.f150177t;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember : multiTalkGroup.f71611i) {
            hashMap.put(multiTalkGroupMember.f71612d, multiTalkGroupMember);
        }
        for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember2 : multiTalkGroup3.f71611i) {
            if (!c01.z1.r().equals(multiTalkGroupMember2.f71612d) && c01.z1.r().equals(multiTalkGroupMember2.f71613e) && multiTalkGroupMember2.f71614f == 1) {
                if (!hashMap.containsKey(multiTalkGroupMember2.f71612d)) {
                    b0(multiTalkGroupMember2.f71612d);
                } else if (((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) hashMap.get(multiTalkGroupMember2.f71612d)).f71614f == 20) {
                    b0(multiTalkGroupMember2.f71612d);
                }
            }
        }
        this.f150177t = multiTalkGroup;
        e0();
        S();
        return true;
    }

    public void d(boolean z17) {
        this.f150186y1 = false;
        if (z17) {
            com.tencent.mm.plugin.multitalk.model.e3.Zi().h();
        } else {
            com.tencent.mm.plugin.multitalk.model.e3.Zi().e(false);
        }
        ((android.app.NotificationManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification")).cancel(43);
    }

    public final int d0() {
        int i17;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.RECORD_AUDIO")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "Permission RECORD_AUDIO granted");
            i17 = 128;
        } else {
            i17 = 0;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.CAMERA")) {
            return i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "Permission CAMERA granted");
        return i17 | 64;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.tencent.mm.modeltalkroom.MultiTalkGroup r17, java.lang.Boolean r18) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.v0.e(com.tencent.mm.modeltalkroom.MultiTalkGroup, java.lang.Boolean):void");
    }

    public final void e0() {
        for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember : this.f150177t.f71611i) {
            if (multiTalkGroupMember.f71614f != 10 && this.f150174q.remove(multiTalkGroupMember.f71612d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "remove video user according group %s", multiTalkGroupMember.f71612d);
            }
        }
    }

    public void f(boolean z17, boolean z18) {
        g(z17, z18, false, false, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.modeltalkroom.MultiTalkGroup, zi3.f, vq4.c] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    public void g(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        ?? r96;
        ?? r07;
        com.tencent.mm.plugin.multitalk.model.t2 t2Var;
        sj3.e4 e4Var;
        boolean z37;
        boolean z38;
        gi.q0 q0Var = this.Y;
        if (q0Var != null) {
            q0Var.a();
            this.Y = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isReject %b isMissCall %b isPhoneCall %b isNetworkError %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.Z = null;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.model.o1(this));
        tq4.b bVar = this.X;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenSensorController", "disable()");
        bVar.f421235b.a();
        bVar.a();
        this.f150167l1 = false;
        if (this.L == null) {
            this.L = new com.tencent.mm.plugin.multitalk.model.k2();
        }
        com.tencent.mm.plugin.multitalk.model.k2 k2Var = this.L;
        k2Var.f150029b.clear();
        k2Var.f150028a = null;
        java.util.ArrayList arrayList = k2Var.f150030c;
        if (arrayList != null) {
            arrayList.clear();
        }
        k2Var.f150030c = null;
        ((ku5.t0) ku5.t0.f312615d).A("delayChecking");
        this.f150173p1 = null;
        androidx.lifecycle.j0 j0Var = this.f150183x1;
        if (j0Var != null) {
            j0Var.postValue(null);
            this.f150183x1 = null;
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(41);
        com.tencent.mm.plugin.multitalk.model.e3.Ri().X();
        boolean x17 = x();
        com.tencent.mm.plugin.multitalk.model.t2 t2Var2 = com.tencent.mm.plugin.multitalk.model.t2.f150136a;
        sj3.e4 e4Var2 = sj3.e4.Init;
        if (x17) {
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
            refreshMainUIMultitalkIconEvent.f54671g.f7358a = 2;
            refreshMainUIMultitalkIconEvent.e();
            com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150177t;
            java.lang.String e17 = com.tencent.mm.plugin.multitalk.model.o2.e(multiTalkGroup);
            java.lang.String str = multiTalkGroup.f71608f;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(17771, 0, 0, e17, str);
            g0Var.d(12729, e17, java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150141a), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150142b), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150143c), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150144d), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150145e), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150146f), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150147g), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150148h), java.lang.Integer.valueOf(com.tencent.mm.plugin.multitalk.model.u0.f150149i));
            com.tencent.mm.plugin.multitalk.model.u0.b(9, com.tencent.mm.plugin.multitalk.model.u0.f150141a);
            com.tencent.mm.plugin.multitalk.model.u0.b(10, com.tencent.mm.plugin.multitalk.model.u0.f150145e);
            com.tencent.mm.plugin.multitalk.model.u0.b(11, com.tencent.mm.plugin.multitalk.model.u0.f150142b);
            com.tencent.mm.plugin.multitalk.model.u0.b(12, com.tencent.mm.plugin.multitalk.model.u0.f150143c);
            com.tencent.mm.plugin.multitalk.model.u0.b(13, com.tencent.mm.plugin.multitalk.model.u0.f150144d);
            com.tencent.mm.plugin.multitalk.model.u0.f150141a = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150142b = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150143c = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150144d = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150145e = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150146f = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150147g = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150148h = 0;
            com.tencent.mm.plugin.multitalk.model.u0.f150149i = 0;
            int i17 = 8;
            if (this.f150176s != sj3.e4.Talking) {
                boolean equals = this.f150177t.f71610h.equals(c01.z1.r());
                t2Var = t2Var2;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f150180w;
                if (equals) {
                    i17 = z18 ? 4 : z17 ? 1 : z19 ? 3 : z27 ? 5 : 2;
                } else if (!z18) {
                    i17 = z17 ? 7 : z19 ? 9 : z27 ? 10 : 0;
                } else if (currentTimeMillis >= 45) {
                    i17 = 6;
                }
                g0Var.d(12725, 2, java.lang.Integer.valueOf(equals ? 1 : 2), java.lang.Long.valueOf(currentTimeMillis), e17, java.lang.Integer.valueOf(i17));
            } else {
                t2Var = t2Var2;
                int i18 = this.f150181x;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(220);
                iDKey.SetKey(7);
                iDKey.SetValue(i18);
                arrayList2.add(iDKey);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(220);
                iDKey2.SetKey(8);
                iDKey2.SetValue(1L);
                arrayList2.add(iDKey2);
                g0Var.j(arrayList2, false, false);
                g0Var.d(12726, java.lang.Long.valueOf(this.f150181x), e17);
                java.util.List list = multiTalkGroup.f71611i;
                if (list != null) {
                    int size = list.size();
                    g0Var.idkeyStat(220L, 35L, 1L, false);
                    g0Var.idkeyStat(220L, 36L, size, false);
                }
            }
            zj3.g gVar = zj3.g.f473302a;
            if (java.lang.System.currentTimeMillis() - zj3.g.f473306e < 200) {
                com.tencent.mars.xlog.Log.w("MultitalkFeatureReportH", "has reported");
                e4Var = e4Var2;
                z37 = false;
            } else {
                int i19 = z18 ? 4 : (z17 && zj3.g.f473309h) ? 1 : (!z17 || zj3.g.f473309h) ? (z17 || !zj3.g.f473309h) ? -1 : 2 : 3;
                zj3.f fVar = zj3.g.f473320s;
                fVar.c();
                zj3.f fVar2 = zj3.g.f473321t;
                fVar2.c();
                zj3.f fVar3 = zj3.g.f473322u;
                fVar3.c();
                zj3.f fVar4 = zj3.g.f473323v;
                fVar4.c();
                com.tencent.mm.autogen.mmdata.rpt.MultitalkFeatureReportStruct multitalkFeatureReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MultitalkFeatureReportStruct();
                multitalkFeatureReportStruct.f59397d = multitalkFeatureReportStruct.b("multiTalkGroupId", zj3.g.f473308g, true);
                multitalkFeatureReportStruct.f59398e = zj3.g.f473307f ? 1 : -1;
                multitalkFeatureReportStruct.f59399f = multitalkFeatureReportStruct.b("memberUins", kz5.n0.g0(zj3.g.f473313l, ";", null, null, 0, null, null, 62, null), true);
                multitalkFeatureReportStruct.f59400g = zj3.g.f473305d;
                e4Var = e4Var2;
                multitalkFeatureReportStruct.f59401h = (java.lang.System.currentTimeMillis() - multitalkFeatureReportStruct.f59400g) / 1000;
                multitalkFeatureReportStruct.f59402i = zj3.g.f473314m;
                multitalkFeatureReportStruct.f59403j = zj3.g.f473317p ? 1 : -1;
                multitalkFeatureReportStruct.f59404k = zj3.g.f473315n;
                multitalkFeatureReportStruct.f59405l = zj3.g.f473318q ? 1 : -1;
                multitalkFeatureReportStruct.f59406m = fVar2.e();
                multitalkFeatureReportStruct.f59407n = zj3.g.f473316o;
                multitalkFeatureReportStruct.f59408o = fVar3.e();
                multitalkFeatureReportStruct.f59409p = multitalkFeatureReportStruct.b("subscribeScreenCastOp", fVar3.d(), true);
                multitalkFeatureReportStruct.f59410q = multitalkFeatureReportStruct.b("clickScreenCastBtnOp", kz5.n0.g0(zj3.g.f473324w, ";", null, null, 0, null, null, 62, null), true);
                multitalkFeatureReportStruct.f59411r = fVar.e();
                multitalkFeatureReportStruct.f59412s = multitalkFeatureReportStruct.b("openCameraOp", fVar.d(), true);
                multitalkFeatureReportStruct.f59413t = fVar4.e();
                multitalkFeatureReportStruct.f59414u = multitalkFeatureReportStruct.b("subscribeBigVideoOp", fVar4.d(), true);
                multitalkFeatureReportStruct.f59415v = zj3.g.f473307f ? zj3.g.f473303b : 0L;
                multitalkFeatureReportStruct.f59416w = i19;
                multitalkFeatureReportStruct.f59417x = zj3.g.f473310i;
                multitalkFeatureReportStruct.f59418y = zj3.j.g() ? 1 : 2;
                multitalkFeatureReportStruct.f59419z = zj3.g.f473319r;
                int i27 = zj3.g.f473312k;
                if (i27 != 0) {
                    multitalkFeatureReportStruct.A = zj3.g.f473311j / i27;
                }
                multitalkFeatureReportStruct.k();
                zj3.g.f473306e = java.lang.System.currentTimeMillis();
                zj3.g.f473303b = 0L;
                z37 = false;
                zj3.g.f473309h = false;
            }
            sj3.e4 e4Var3 = this.f150176s;
            com.tencent.mm.plugin.multitalk.model.z zVar = this.C;
            if (zVar != null) {
                zVar.p3();
            }
            this.f150171p = z37;
            this.f150178u = z37;
            this.f150179v = z37;
            this.f150176s = e4Var;
            W();
            c(z37);
            this.P = null;
            d(true);
            wu5.c cVar = this.D;
            if (cVar != null) {
                cVar.cancel(z37);
                this.D = null;
            }
            vq4.c cVar2 = vq4.d.f439282a;
            if (cVar2 != null) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(cVar2);
            }
            vq4.d.f439282a = null;
            zi3.f fVar5 = this.f150160J;
            if (fVar5 != null) {
                fVar5.G();
                this.f150160J.R();
                this.f150160J = null;
            }
            com.tencent.mm.plugin.multitalk.model.l2 aj6 = com.tencent.mm.plugin.multitalk.model.e3.aj();
            aj6.f150038b = false;
            aj6.f150037a = false;
            com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup2 = this.f150177t;
            if (multiTalkGroup2 != null) {
                z38 = true;
                j(multiTalkGroup2, e4Var3, z17, z18, z28, z29);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f150177t.f71606d)) {
                    java.lang.String str2 = this.f150177t.f71607e;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk");
                i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.c1(i4Var, 1));
                this.f150177t = null;
            } else {
                z38 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: currentMultiTalkGroup null");
            }
            this.f150165h = 0;
            this.f150163f = z38;
            this.f150162e = false;
            this.f150166i = z38;
            this.f150180w = 0L;
            this.f150181x = 0;
            this.f150174q.clear();
            new com.tencent.mm.autogen.events.ExitMultiTalkRoomEvent().e();
            this.f150184y = z38;
            rq4.u.f399109a.a();
            t2Var.b();
            r96 = z38;
        } else {
            r96 = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: not connecting, isHangupMultitalk %b, isOverLoadFail %b", java.lang.Boolean.valueOf(this.f150184y), java.lang.Boolean.valueOf(this.f150187z));
            if (!this.f150184y || this.f150187z) {
                W();
                d(false);
                wu5.c cVar3 = this.D;
                if (cVar3 != null) {
                    cVar3.cancel(false);
                    r07 = 0;
                    this.D = null;
                } else {
                    r07 = 0;
                }
                vq4.c cVar4 = vq4.d.f439282a;
                if (cVar4 != null) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(cVar4);
                }
                vq4.d.f439282a = r07;
                zi3.f fVar6 = this.f150160J;
                if (fVar6 != null) {
                    fVar6.G();
                    this.f150160J.R();
                    this.f150160J = r07;
                }
                this.f150177t = r07;
                this.f150165h = 0;
                this.f150184y = false;
                this.f150180w = 0L;
                this.f150181x = 0;
                this.f150174q.clear();
            }
            this.f150176s = e4Var2;
            t2Var2.b();
        }
        com.tencent.mm.plugin.multitalk.model.e3.wi().i(r96);
        ((java.util.ArrayList) this.f150175r).clear();
        com.tencent.mm.plugin.multitalk.model.a2 a2Var = this.Q;
        if (a2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "closeMultiTalkRenderLogic null");
        } else {
            a2Var.b();
            this.Q = null;
        }
        this.f150172p0.clear();
        zj3.i iVar = zj3.i.f473328a;
        zj3.h[] hVarArr = zj3.i.f473329b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i28 = 0; i28 < 5; i28++) {
            zj3.h hVar = hVarArr[i28];
            if (hVar.f473327c > 5 ? r96 : false) {
                arrayList3.add(hVar);
            }
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            zj3.h hVar2 = (zj3.h) it.next();
            java.lang.Integer num = (java.lang.Integer) zj3.i.f473330c.get(java.lang.Integer.valueOf(hVar2.f473325a));
            if (num != null) {
                zj3.i.f473328a.c(num.intValue(), hVar2.f473326b / hVar2.f473327c);
            }
        }
        if (zj3.i.f473333f > 0) {
            int[] iArr = zj3.i.f473331d;
            iVar.c(15, iArr[0]);
            iVar.c(18, iArr[r96]);
            float f17 = 100;
            iVar.c(21, (((float) zj3.i.f473334g) / ((float) zj3.i.f473333f)) * f17);
            iVar.c(24, (((float) zj3.i.f473335h) / ((float) zj3.i.f473333f)) * f17);
        }
        iVar.d();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "unBindSmallServiceIfNeed");
            if (fp.h.c(26) && this.H) {
                this.H = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "unBindSmallService isBindSmallService: false");
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.service.NewMultiTalkingForegroundService.class));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", e18, "unBind VoipSmallService error: %s", e18.getMessage());
        }
        ((java.util.HashMap) this.V).clear();
        boolean z39 = com.tencent.mm.ui.tools.ld.f210556a;
        com.tencent.mm.ui.tools.ld.f210556a = false;
        com.tencent.mm.ui.tools.kd observer = this.Z;
        kotlin.jvm.internal.o.g(observer, "observer");
        ((java.util.ArrayList) com.tencent.mm.ui.tools.ld.f210557b).remove(observer);
        this.R = 0;
    }

    public void h() {
        if (!com.tencent.mm.plugin.multitalk.model.e3.Ri().y() || this.C == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "exitProjectScreen");
        this.C.N0();
    }

    public void i(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(64);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.r1(6);
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h37));
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        if (c01.v1.x(str, false)) {
            f9Var.u1(str);
            f9Var.d1(f9Var.j());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        }
    }

    public final void j(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup, sj3.e4 e4Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
        if (e4Var != sj3.e4.Inviting || !z18) {
            if (this.I) {
                k(multiTalkGroup.f71608f, "0");
                return;
            }
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(64);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.r1(6);
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h37));
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str = multiTalkGroup.f71608f;
        ((py.a) iVar).getClass();
        if (c01.v1.x(str, false)) {
            f9Var.u1(multiTalkGroup.f71608f);
            f9Var.d1(f9Var.j());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "0"
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L40
            java.lang.String r1 = com.tencent.mm.plugin.multitalk.model.t2.f150137b
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.M(r1)
            java.lang.String r2 = "getMMKV(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            java.lang.String r3 = "mmkv_last_crash_roomId"
            java.lang.String r0 = r1.getString(r3, r0)
            java.lang.String r1 = com.tencent.mm.plugin.multitalk.model.t2.f150137b
            com.tencent.mm.sdk.platformtools.o4 r1 = com.tencent.mm.sdk.platformtools.o4.M(r1)
            kotlin.jvm.internal.o.f(r1, r2)
            r1.remove(r3)
            boolean r6 = kotlin.jvm.internal.o.b(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.MT.MultiTalkManager"
            java.lang.String r2 = "generateMsgExitMsg %s"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            if (r6 == 0) goto L40
            java.lang.String r5 = "current msg not need to show cause crash is show"
            com.tencent.mars.xlog.Log.e(r1, r5)
            return
        L40:
            com.tencent.mm.storage.f9 r6 = new com.tencent.mm.storage.f9
            r6.<init>()
            r0 = 64
            r6.setType(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r6.e1(r0)
            r0 = 6
            r6.r1(r0)
            boolean r0 = r4.I
            r1 = 0
            if (r0 == 0) goto L91
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r2 = e42.d0.clicfg_multitalk_show_exit_reason_tips
            r3 = 1
            h62.d r0 = (h62.d) r0
            boolean r0 = r0.fj(r2, r3)
            if (r0 == 0) goto L91
            r4.I = r1
            com.tencent.mm.plugin.multitalk.model.d2 r0 = com.tencent.mm.plugin.multitalk.model.e3.Vi()
            com.tencent.mm.modeltalkroom.MultiTalkGroup r2 = r4.f150177t
            java.lang.String r2 = r2.f71608f
            boolean r0 = r0.q4(r2)
            if (r0 == 0) goto L87
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131772046(0x7f10428e, float:1.917544E38)
            java.lang.String r0 = r0.getString(r2)
            goto L9a
        L87:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131772047(0x7f10428f, float:1.9175442E38)
            java.lang.String r0 = r0.getString(r2)
            goto L9a
        L91:
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131772076(0x7f1042ac, float:1.9175501E38)
            java.lang.String r0 = r0.getString(r2)
        L9a:
            r6.d1(r0)
            java.lang.Class<qy.i> r0 = qy.i.class
            i95.m r0 = i95.n0.c(r0)
            qy.i r0 = (qy.i) r0
            py.a r0 = (py.a) r0
            r0.getClass()
            boolean r0 = c01.v1.x(r5, r1)
            if (r0 == 0) goto Lcb
            r6.u1(r5)
            java.lang.String r5 = r6.j()
            r6.d1(r5)
            java.lang.Class<vg3.x3> r5 = vg3.x3.class
            lm0.a r5 = gm0.j1.s(r5)
            vg3.x3 r5 = (vg3.x3) r5
            com.tencent.mm.plugin.messenger.foundation.h2 r5 = (com.tencent.mm.plugin.messenger.foundation.h2) r5
            com.tencent.mm.storage.g9 r5 = r5.cj()
            r5.M9(r6)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.v0.k(java.lang.String, java.lang.String):void");
    }

    public void l(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        if (!((py.a) ((qy.i) i95.n0.c(qy.i.class))).Ai(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", str);
            ((c01.k7) c01.n8.a()).b(str, 25, new com.tencent.mm.plugin.multitalk.model.p1(this));
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(64);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.r1(6);
        f9Var.j1(2);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        if (e17 != null && !e17.equals("")) {
            str2 = e17;
        }
        java.lang.String str3 = str2 + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492597h35);
        f9Var.d1(str3);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        if (c01.v1.x(str, false)) {
            f9Var.u1(str);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
            if (p17 != null) {
                if (z17) {
                    p17.Y1(p17.d1() + 1);
                }
                p17.l1(str3);
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, true, true) == -1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "update cvs fail!!! for :".concat(str));
                }
                if (z18) {
                    ((c01.v8) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).a(f9Var);
                    return;
                }
                return;
            }
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.b2(str);
            if (z17) {
                l4Var.Y1(1);
            }
            l4Var.l1(str3);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
            if (z18) {
                ((c01.v8) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).a(f9Var);
            }
        }
    }

    public com.tencent.mm.plugin.multitalk.model.j m() {
        if (this.P == null) {
            this.P = new com.tencent.mm.plugin.multitalk.model.j();
        }
        return this.P;
    }

    public com.tencent.mm.plugin.multitalk.model.a2 n() {
        if (this.Q == null && zj3.j.g()) {
            this.Q = new com.tencent.mm.plugin.multitalk.model.a2();
        }
        return this.Q;
    }

    public com.tencent.mm.plugin.multitalk.model.k2 o() {
        if (this.L == null) {
            this.L = new com.tencent.mm.plugin.multitalk.model.k2();
        }
        return this.L;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    public java.util.List p() {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150177t;
        if (multiTalkGroup == null) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup.f71606d)) {
            java.lang.String str = this.f150177t.f71607e;
        }
        com.tencent.mm.plugin.multitalk.model.o2.b(this.f150177t);
        java.lang.String str2 = this.f150177t.f71608f;
        new java.util.ArrayList();
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        java.util.ArrayList a17 = i4Var.f149623f.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a17 == null || a17.size() == 0 || i4Var.f149637n != 1) {
            return null;
        }
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
            if (com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.GetVoiceActivity(wVar.f149840a) > 0) {
                arrayList.add(wVar.f149842c);
            }
        }
        return arrayList;
    }

    public com.tencent.mm.plugin.multitalk.model.p3 q() {
        if (this.N == null) {
            this.N = new com.tencent.mm.plugin.multitalk.model.p3();
        }
        return this.N;
    }

    public com.tencent.mm.plugin.multitalk.model.q3 r() {
        if (this.M == null) {
            this.M = new com.tencent.mm.plugin.multitalk.model.r3();
        }
        return this.M;
    }

    public java.util.List s() {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150177t;
        if (multiTalkGroup == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "no MultiTalkGroup");
            return new java.util.ArrayList();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiTalkGroup.f71606d)) {
            java.lang.String str = this.f150177t.f71607e;
        }
        boolean w17 = w(this.f150177t.f71608f);
        com.tencent.mm.plugin.multitalk.model.o2.b(this.f150177t);
        java.lang.String str2 = this.f150177t.f71608f;
        return w17 ? com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.B() : new java.util.ArrayList();
    }

    public final void t() {
        if (this.f150176s == sj3.e4.Creating) {
            this.f150163f = true;
        } else {
            this.f150163f = (ym1.f.Ri() || ym1.f.Ni()) ? false : true;
        }
        this.f150162e = false;
        this.E = com.tencent.mm.plugin.multitalk.model.o2.c();
    }

    public boolean v() {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = this.f150177t;
        if (multiTalkGroup != null) {
            return w(multiTalkGroup.f71608f);
        }
        return false;
    }

    public boolean w(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f150177t.f71606d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = this.f150177t.f71607e;
            }
        }
        java.util.HashMap hashMap = this.W;
        return (hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : 0) == 2;
    }

    public boolean x() {
        return (this.f150176s == sj3.e4.Init || this.f150177t == null) ? false : true;
    }

    public boolean y() {
        sj3.e4 e4Var = this.f150176s;
        return e4Var == sj3.e4.Starting || e4Var == sj3.e4.Talking;
    }

    public boolean z() {
        return this.f150176s == sj3.e4.Talking;
    }
}
