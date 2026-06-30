package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public abstract class n {

    /* renamed from: d, reason: collision with root package name */
    public final jq4.y f176753d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f176754e;

    /* renamed from: f, reason: collision with root package name */
    public final vx3.i f176755f;

    /* renamed from: g, reason: collision with root package name */
    public final yx3.k f176756g;

    /* renamed from: h, reason: collision with root package name */
    public final ao4.b f176757h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f176758i;

    /* renamed from: m, reason: collision with root package name */
    public wu5.c f176759m;

    /* renamed from: n, reason: collision with root package name */
    public r45.r27 f176760n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176761o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176762p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176763q;

    public n(jq4.y floatCardManager) {
        kotlin.jvm.internal.o.g(floatCardManager, "floatCardManager");
        this.f176753d = floatCardManager;
        vx3.c cVar = new vx3.c(vx3.d.f441273d, 0, true);
        vx3.i b17 = vx3.l.E.b();
        dk4.a aVar = b17.f441284a;
        if (aVar != null) {
            aVar.f234475l = true;
        }
        this.f176755f = b17;
        kotlin.jvm.internal.o.d(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayer", "create ringtonePlayer, mediaInfo:" + aVar + ", soundInfo:" + cVar + ", isOutCall:false");
        this.f176756g = aVar.f234468e ? new yx3.j(aVar, cVar, false) : new yx3.x(aVar, cVar, false);
        this.f176757h = new ao4.b();
    }

    public static final void b(com.tencent.mm.plugin.voip.model.n nVar, int i17) {
        r45.r27 r27Var = nVar.f176760n;
        if (r27Var == null) {
            return;
        }
        ((com.tencent.mm.plugin.voip.model.c0) nVar).y(i17, r27Var);
    }

    public final boolean a(r45.r27 roomInfo) {
        boolean z17;
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        if (this.f176760n != null) {
            return false;
        }
        com.tencent.mm.plugin.voip.model.c0 c0Var = (com.tencent.mm.plugin.voip.model.c0) this;
        c0Var.f176366t.alive();
        c0Var.f176367u.alive();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptIncomingCal, roomInfo:");
        sb6.append(com.tencent.mm.plugin.voip.model.o.a(roomInfo));
        sb6.append(" and ");
        r45.r27 r27Var = this.f176760n;
        sb6.append(r27Var != null ? java.lang.Integer.valueOf(r27Var.f384495m) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", sb6.toString());
        this.f176760n = roomInfo;
        java.lang.String str = roomInfo.f384494i;
        r45.r27 r27Var2 = c0Var.f176760n;
        boolean z18 = r27Var2 != null && r27Var2.f384495m == 0;
        wu5.c cVar = this.f176759m;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f176756g.g(0L);
        this.f176756g.f();
        this.f176757h.a(this.f176755f.i(), null);
        this.f176757h.b();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.voip.model.j jVar = new com.tencent.mm.plugin.voip.model.j(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f176759m = t0Var.z(jVar, 8000L, false);
        wu5.c cVar2 = this.f176758i;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        ku5.u0 u0Var2 = ku5.t0.f312615d;
        com.tencent.mm.plugin.voip.model.k kVar = new com.tencent.mm.plugin.voip.model.k(this);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        this.f176758i = t0Var2.z(kVar, 70000L, false);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        jq4.y yVar = this.f176753d;
        kotlin.jvm.internal.o.d(context);
        long j17 = roomInfo.f384490e;
        int i17 = roomInfo.f384489d;
        kotlin.jvm.internal.o.d(str);
        jq4.y.y(yVar, context, intent, j17, i17, z18, str, false, 3, 64, null);
        java.lang.Object systemService = context.getSystemService("keyguard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        java.lang.Object systemService2 = context.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        java.lang.ref.WeakReference i18 = com.tencent.mm.app.w.INSTANCE.i();
        boolean isKeyguardLocked = ((android.app.KeyguardManager) systemService).isKeyguardLocked();
        boolean isInteractive = ((android.os.PowerManager) systemService2).isInteractive();
        boolean z19 = (i18 != null ? (android.app.Activity) i18.get() : null) instanceof com.tencent.mm.plugin.voip.ui.VideoActivity;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "check if show notification, isKeyguardLocked:" + isKeyguardLocked + ", isScreenOn:" + isInteractive + ", isVideoActivityForeground:" + z19 + ", hasWindowFocus:" + ((i18 == null || (activity = (android.app.Activity) i18.get()) == null) ? false : activity.hasWindowFocus()));
        if (!isKeyguardLocked || isInteractive || z19) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "show incoming call notification");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(context, "com.tencent.mm.ui.LauncherUI");
            intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            intent2.addFlags(67108864);
            android.app.PendingIntent activity2 = android.app.PendingIntent.getActivity(context, 0, intent2, fp.g0.a(134217728));
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            android.graphics.Bitmap b17 = com.tencent.mm.modelavatar.g.b(str, false, 20, null);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (e17 == null) {
                e17 = "";
            }
            java.lang.String string = context.getResources().getString(z18 ? com.tencent.mm.R.string.kdd : com.tencent.mm.R.string.kdi, e17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z2.k0 k0Var = new z2.k0(context, n25.a.b());
            z17 = true;
            k0Var.f469466j = 1;
            k0Var.f469475s = "call";
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f469463g = activity2;
            notification.icon = com.tencent.mm.R.drawable.c7v;
            k0Var.j(b17);
            k0Var.f(e17);
            k0Var.e(string);
            k0Var.h(2, true);
            k0Var.h(16, true);
            android.app.Notification b18 = k0Var.b();
            kotlin.jvm.internal.o.f(b18, "build(...)");
            ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).n(49, b18, true);
        }
        c0Var.s(roomInfo);
        return z17;
    }

    public final boolean e(boolean z17) {
        if (!((com.tencent.mm.plugin.voip.model.c0) this).u()) {
            return false;
        }
        boolean j17 = com.tencent.mm.plugin.voip.model.h2.j(com.tencent.mm.sdk.platformtools.x2.f193071a, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canAcceptIncomingCall, isVideoCalling:");
        sb6.append(z17);
        sb6.append(", hasPermission:");
        sb6.append(j17);
        sb6.append(", inviteInfo:");
        r45.r27 r27Var = this.f176760n;
        sb6.append(r27Var != null ? com.tencent.mm.plugin.voip.model.o.a(r27Var) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", sb6.toString());
        return this.f176760n == null && j17;
    }

    public final boolean k() {
        r45.r27 r27Var = this.f176760n;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "checkStartAcceptVoIP, roomInfo:" + r27Var + ", hasCleanVoipMgr:" + this.f176761o + ", hasReleaseCamera:" + this.f176762p);
        if (r27Var != null && this.f176763q) {
            com.tencent.mm.plugin.voip.model.c0 c0Var = (com.tencent.mm.plugin.voip.model.c0) this;
            if (c0Var.f176761o && c0Var.f176762p) {
                c0Var.z(r27Var);
                p();
                return true;
            }
        }
        return false;
    }

    public final void m() {
        r45.r27 r27Var = this.f176760n;
        if (r27Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "onAccept, roomInfo:" + com.tencent.mm.plugin.voip.model.o.a(r27Var));
        com.tencent.mm.plugin.voip.model.c0 c0Var = (com.tencent.mm.plugin.voip.model.c0) this;
        if (!gq4.v.Bi().f176558a.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "directly accept");
            jq4.z0.c(this.f176753d, false, false, false, 3, null);
            q();
            c0Var.z(r27Var);
            r45.r27 r27Var2 = this.f176760n;
            if (r27Var2 != null) {
                c0Var.y(2, r27Var2);
            }
            p();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.u(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.k_t));
        u1Var.j(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490347sg));
        u1Var.i(new com.tencent.mm.plugin.voip.model.l(this));
        u1Var.m(com.tencent.mm.R.string.k_s);
        u1Var.k(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f479308vo));
        u1Var.l(new com.tencent.mm.plugin.voip.model.m(this, r27Var));
        this.f176754e = u1Var.s();
        r45.r27 r27Var3 = this.f176760n;
        if (r27Var3 == null) {
            return;
        }
        c0Var.y(7, r27Var3);
    }

    public final void o(int i17) {
        r45.r27 r27Var = this.f176760n;
        if (r27Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "onCancelInvite, roomId:" + i17);
        if (r27Var.f384489d == i17 || i17 == 0) {
            q();
            jq4.z0.c(this.f176753d, false, false, false, 3, null);
            p();
        }
    }

    public abstract void p();

    public final void q() {
        this.f176756g.k();
        this.f176757h.c();
    }
}
