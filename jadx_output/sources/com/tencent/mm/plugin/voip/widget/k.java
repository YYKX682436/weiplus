package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class k implements com.tencent.mm.plugin.voip.ui.f, android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.ui.g f177156d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.widget.BaseSmallView f177157e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f177158f;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f177160h;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f177162m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f177163n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f177165p;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f177169t;

    /* renamed from: y, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f177174y;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177159g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f177161i = -1;

    /* renamed from: o, reason: collision with root package name */
    public long f177164o = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f177166q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f177167r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f177168s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f177170u = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f177171v = new com.tencent.mm.plugin.voip.widget.l(this);

    /* renamed from: w, reason: collision with root package name */
    public int f177172w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f177173x = false;

    public k(com.tencent.mm.plugin.voip.ui.g gVar, int i17, com.tencent.mm.storage.z3 z3Var, boolean z17, boolean z18, boolean z19) {
        this.f177169t = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "initState: %s, talker: %s, isVideoCall: %b", vq4.n0.d(i17), z3Var.d1(), java.lang.Boolean.valueOf(z17));
        this.f177162m = z3Var;
        this.f177156d = gVar;
        this.f177163n = z17;
        this.f177165p = z18;
        this.f177169t = z19;
        z1(0, i17);
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.NewVoipSmallWindow");
        this.f177160h = newWakeLock;
        yj0.a.c(newWakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        newWakeLock.acquire();
        yj0.a.f(newWakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "<init>", "(Lcom/tencent/mm/plugin/voip/ui/IVoipUIListener;ILcom/tencent/mm/storage/Contact;ZZZ)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void H5(int i17, java.lang.String str) {
        if (i17 == 235) {
            return;
        }
        if (i17 == 233) {
            gq4.v.Bi().f176558a.f176411a.f176532x.M1.f176726m = 1;
        } else if (i17 == 237) {
            u11.c.i();
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public android.content.Context J4() {
        return null;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void K(int i17) {
        int i18 = this.f177172w;
        if (i18 != -1 && i18 != i17) {
            com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
            if (Ai.f176987a != null && !Ai.f176990d) {
                ((ku5.t0) ku5.t0.f312615d).A("showIcon");
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.voip.ui.c1(Ai, i17), "showIcon");
            }
        }
        com.tencent.mm.plugin.voip.ui.g gVar = this.f177156d;
        if (gVar != null) {
            gVar.K(i17);
        }
        this.f177172w = i17;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void M4(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "uninit");
        if (this.f177170u) {
            return;
        }
        this.f177170u = true;
        if (-1 != this.f177166q) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f177167r ? 2 : 3);
            objArr[1] = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f177166q) / 1000);
            objArr[2] = java.lang.Integer.valueOf(this.f177169t ? 1 : 2);
            g0Var.d(11620, objArr);
        }
        android.os.PowerManager.WakeLock wakeLock = this.f177160h;
        if (wakeLock != null && wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "release waklock");
            android.os.PowerManager.WakeLock wakeLock2 = this.f177160h;
            yj0.a.c(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
        b(z17);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f177158f;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "uninit..cancel notification..");
        android.os.PowerManager.WakeLock wakeLock3 = this.f177174y;
        if (wakeLock3 == null || !wakeLock3.isHeld()) {
            return;
        }
        android.os.PowerManager.WakeLock wakeLock4 = this.f177174y;
        yj0.a.c(wakeLock4, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock4.release();
        yj0.a.f(wakeLock4, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "uninit", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f177174y = null;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void Q2(boolean z17) {
        gq4.v.Ai().c(true);
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void W2() {
        gq4.v.Ai().c(false);
    }

    public java.lang.String a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        long j17 = this.f177164o;
        int i17 = (int) (currentTimeMillis - j17);
        if (j17 == -1) {
            i17 = 0;
        }
        java.lang.String format = i17 >= 3600 ? java.lang.String.format(java.util.Locale.US, "%d:%02d:%02d", java.lang.Integer.valueOf(i17 / 3600), java.lang.Integer.valueOf((i17 % 3600) / 60), java.lang.Integer.valueOf(i17 % 60)) : i17 >= 600 ? java.lang.String.format(java.util.Locale.US, "%d:%02d", java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)) : java.lang.String.format(java.util.Locale.US, "%02d:%02d", java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
        return com.tencent.mm.sdk.platformtools.t8.K0(format) ? "00:00" : format;
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "removeSmallView isFinish: %b", java.lang.Boolean.valueOf(z17));
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f177158f;
        if (b4Var != null) {
            b4Var.d();
        }
        if (z17) {
            com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
            if (Ai.f176987a != null) {
                Ai.f176990d = true;
                ((ku5.t0) ku5.t0.f312615d).A("showIcon");
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.ui.y0(Ai));
            } else {
                Ai.a(true);
            }
        } else {
            gq4.v.Ai().a(false);
        }
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f177157e;
        if (baseSmallView == null || z17) {
            return;
        }
        baseSmallView.j();
        if (this.f177157e.getParent() != null) {
            ((android.view.ViewGroup) this.f177157e.getParent()).removeAllViews();
        }
        this.f177157e = null;
    }

    public void c(final yz5.l lVar) {
        java.lang.String str = gq4.v.Bi().f176558a.f176431u;
        boolean z17 = gq4.v.Bi().f176558a.f176432v;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Voip.NewVoipSmallWindow", "null talkName");
        } else {
            ((y03.e) i95.n0.c(y03.e.class)).d8(com.tencent.mm.sdk.platformtools.x2.f193071a, str, z17, new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.k$$d
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    android.content.Intent intent = (android.content.Intent) obj;
                    com.tencent.mm.plugin.voip.widget.k kVar = com.tencent.mm.plugin.voip.widget.k.this;
                    kVar.getClass();
                    if (intent == null) {
                        return null;
                    }
                    intent.putExtra("Voip_CallRoomKey", gq4.v.Bi().n());
                    intent.putExtra("Voip_Call_From", 3);
                    intent.putExtra("Voip_User", kVar.f177162m.d1());
                    intent.putExtra("Voip_Outcall", kVar.f177165p);
                    intent.putExtra("Voip_VideoCall", kVar.f177163n);
                    intent.putExtra("Voip_Is_Talking", kVar.f177173x);
                    lVar.invoke(intent);
                    return null;
                }
            });
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "setVideoTalkingView");
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f177157e;
        if (baseSmallView != null) {
            baseSmallView.setStatus(this.f177161i);
            this.f177157e.setConnectSec(this.f177164o);
            this.f177157e.setVoipUIListener(this.f177156d);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            float p17 = gq4.v.Bi().p(true);
            int height = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight() / 5;
            this.f177157e.h((int) (height * p17), height);
            this.f177157e.setOnClickListener(this.f177171v);
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "now add to view..");
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "steve: showMiniSmallView decMode:%d, beautyCmd:%d", 0, 0);
        }
    }

    public final void e(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "showMini");
        gq4.v.Ai().d(intent, this.f177163n, false, new com.tencent.mm.plugin.voip.widget.o(this, intent));
        if (gq4.v.Bi().f176572o) {
            return;
        }
        gq4.v.Bi().f176572o = true;
        if (java.lang.System.currentTimeMillis() - gm0.j1.u().c().s(327950, 0L) > 86400000) {
            gm0.j1.u().c().A(327950, java.lang.System.currentTimeMillis());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n#client.version=");
            sb6.append(o45.wf.f343029g);
            sb6.append("\n#accinfo.revision=");
            sb6.append(com.tencent.mm.sdk.platformtools.z.f193109e);
            sb6.append("\n#accinfo.build=");
            sb6.append(com.tencent.mm.sdk.platformtools.z.f193107c);
            sb6.append(":");
            sb6.append(com.tencent.mm.sdk.platformtools.z.f193106b);
            sb6.append(":");
            sb6.append(com.tencent.mm.sdk.platformtools.a0.f192439b);
            sb6.append("\n");
            java.util.Date date = new java.util.Date();
            sb6.append("#accinfo.uploadTime=" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", java.util.Locale.getDefault()).format(date));
            sb6.append("\n#accinfo.content:\n");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver");
            intent2.setAction("uncatch_exception");
            intent2.putExtra("exceptionWriteSdcard", false);
            intent2.putExtra("exceptionPid", android.os.Process.myPid());
            c01.b9 b9Var = c01.b9.f37069c;
            java.lang.String a17 = b9Var.a("login_weixin_username", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                a17 = b9Var.a("login_user_name", "never_login_crash");
            }
            intent2.putExtra("userName", a17);
            intent2.putExtra("tag", "float_window_permission");
            intent2.putExtra("exceptionMsg", android.util.Base64.encodeToString((sb6.toString() + "have not permission to showing floating window\n").getBytes(), 2));
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent2);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void e4(java.lang.String str) {
    }

    public void f(android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipSmallWindow", "showNotification..show notification..tickContent:" + str + ",title:" + str2 + ",content:" + str3 + ",breathEffect:" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("breathEffect ");
        sb6.append(z17);
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.Voip.NewVoipSmallWindow", sb6.toString(), new java.lang.Object[0]);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 40, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(str);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(str2);
        k0Var.e(str3);
        k0Var.f469463g = activity;
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.h(2, true);
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(40, vq4.p0.a(k0Var), false);
    }

    public final void g() {
        int i17 = this.f177161i;
        if (i17 == 261 || i17 == 7 || i17 == 260 || i17 == 6) {
            this.f177173x = true;
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f177158f;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4("timerCounter", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.voip.widget.n(this), true);
            this.f177158f = b4Var2;
            b4Var2.c(1000L, 1000L);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void k() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void o5(long j17) {
        this.f177164o = j17;
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f177157e;
        if (baseSmallView != null) {
            baseSmallView.setConnectSec(j17);
            return;
        }
        int i17 = this.f177161i;
        if (261 == i17 || 7 == i17) {
            final java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdl);
            c(new yz5.l() { // from class: com.tencent.mm.plugin.voip.widget.k$$b
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.String str = string;
                    android.content.Intent intent = (android.content.Intent) obj;
                    com.tencent.mm.plugin.voip.widget.k kVar = com.tencent.mm.plugin.voip.widget.k.this;
                    kVar.getClass();
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d17 = kVar.f177162m.d1();
                    ((sg3.a) v0Var).getClass();
                    kVar.f(intent, str, c01.a2.e(d17), str, false);
                    return null;
                }
            });
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void setScreenEnable(boolean z17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Voip.NewVoipSmallWindow", "setScreenEnable: " + z17);
        if (!z17) {
            if (this.f177174y == null) {
                this.f177174y = ((android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power")).newWakeLock(32, "wechat:screen small-window-lock");
            }
            if (this.f177174y.isHeld()) {
                return;
            }
            android.os.PowerManager.WakeLock wakeLock = this.f177174y;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            return;
        }
        android.os.PowerManager.WakeLock wakeLock2 = this.f177174y;
        if (wakeLock2 == null || !wakeLock2.isHeld()) {
            return;
        }
        android.os.PowerManager.WakeLock wakeLock3 = this.f177174y;
        yj0.a.c(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock3.release();
        yj0.a.f(wakeLock3, "com/tencent/mm/plugin/voip/widget/NewVoipSmallWindow", "setScreenEnable", "(Z)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.f177174y = null;
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void u() {
        com.tencent.mm.plugin.voip.ui.t0 Ai = gq4.v.Ai();
        if (Ai.f176987a == null || Ai.f176990d) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).A("showIcon");
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.voip.ui.a1(Ai), "showIcon");
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void v1() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void y(int i17) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f177157e;
        if (baseSmallView != null) {
            baseSmallView.e(i17);
        }
    }

    @Override // com.tencent.mm.plugin.voip.ui.f
    public void z(boolean z17) {
        gq4.v.Ai().e(z17);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // com.tencent.mm.plugin.voip.ui.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z1(final int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = vq4.n0.d(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.Voip.NewVoipSmallWindow"
            java.lang.String r2 = "newState: %s "
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            int r0 = r4.f177161i
            if (r6 != r0) goto L1a
            java.lang.String r5 = "state unchange"
            com.tencent.mars.xlog.Log.i(r1, r5)
            return
        L1a:
            r4.f177161i = r6
            r2 = -1
            r0 = 1
            switch(r6) {
                case 0: goto L4e;
                case 1: goto L2a;
                case 2: goto L4e;
                case 3: goto L2a;
                case 4: goto L4e;
                case 5: goto L2a;
                case 6: goto L4e;
                case 7: goto L2a;
                case 8: goto L26;
                default: goto L22;
            }
        L22:
            switch(r6) {
                case 256: goto L4e;
                case 257: goto L2a;
                case 258: goto L4e;
                case 259: goto L2a;
                case 260: goto L4e;
                case 261: goto L2a;
                case 262: goto L26;
                default: goto L25;
            }
        L25:
            goto L81
        L26:
            r4.b(r0)
            goto L81
        L2a:
            r4.g()
            boolean r6 = r4.f177168s
            if (r6 != 0) goto L81
            java.lang.String r6 = "showVoiceTalking"
            com.tencent.mars.xlog.Log.i(r1, r6)
            r4.f177168s = r0
            long r0 = r4.f177166q
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L45
            long r0 = java.lang.System.currentTimeMillis()
            r4.f177166q = r0
        L45:
            com.tencent.mm.plugin.voip.widget.k$$a r6 = new com.tencent.mm.plugin.voip.widget.k$$a
            r6.<init>(r5)
            r4.c(r6)
            goto L81
        L4e:
            r4.g()
            boolean r5 = r4.f177167r
            if (r5 != 0) goto L81
            java.lang.String r5 = "showVideoTalking"
            com.tencent.mars.xlog.Log.i(r1, r5)
            r4.f177167r = r0
            long r5 = r4.f177166q
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L69
            long r5 = java.lang.System.currentTimeMillis()
            r4.f177166q = r5
        L69:
            com.tencent.mm.plugin.voip.ui.g r5 = r4.f177156d
            if (r5 == 0) goto L70
            r5.d()
        L70:
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r6 = 2131779016(0x7f105dc8, float:1.9189577E38)
            java.lang.String r5 = r5.getString(r6)
            com.tencent.mm.plugin.voip.widget.k$$c r6 = new com.tencent.mm.plugin.voip.widget.k$$c
            r6.<init>()
            r4.c(r6)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.widget.k.z1(int, int):void");
    }
}
