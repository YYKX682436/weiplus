package tl4;

/* loaded from: classes11.dex */
public abstract class h implements tl4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Service f420308a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.eq0 f420309b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f420310c;

    /* renamed from: d, reason: collision with root package name */
    public int f420311d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f420312e;

    public h(android.app.Service context, bw5.eq0 appId, com.tencent.unit_rc.WeakPtr weakPtr) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f420308a = context;
        this.f420309b = appId;
        this.f420310c = weakPtr;
        this.f420312e = jz5.h.b(new tl4.f(this));
    }

    public void a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "cancelNotification");
            this.f420308a.stopForeground(true);
            ((android.app.NotificationManager) ((jz5.n) this.f420312e).getValue()).cancel(((wl4.m) this).f447093f.f27025d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingPlayAppBaseNotificationManager", e17, "cancelNotification exception", new java.lang.Object[0]);
        }
    }

    public final android.app.PendingIntent b(int i17) {
        android.app.Service service = this.f420308a;
        android.content.Intent intent = new android.content.Intent(service, (java.lang.Class<?>) com.tencent.mm.plugin.ting.notification.TingBroadcastReceiver.class);
        intent.putExtra("com.tencent.mm.ting.ActionCode", i17);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(service, i17, intent, 201326592);
        kotlin.jvm.internal.o.f(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public void c(bw5.jq0 playingInfo, int i17, java.lang.String title, java.lang.String description, android.graphics.Bitmap bitmap, android.support.v4.media.session.MediaSessionCompat$Token sessionToken) {
        android.app.PendingIntent activity;
        kotlin.jvm.internal.o.g(playingInfo, "playingInfo");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(sessionToken, "sessionToken");
        if (i17 == 0 || i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "updateSystemNotification state = " + i17 + ", just cancel");
            a();
            return;
        }
        java.lang.String packageName = this.f420308a.getPackageName();
        kotlin.jvm.internal.o.f(packageName, "getPackageName(...)");
        z2.k0 k0Var = new z2.k0(this.f420308a, packageName);
        k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.f469477u = -1;
        k0Var.h(2, true);
        k0Var.f469466j = 2;
        k0Var.d(false);
        k0Var.E = true;
        k0Var.f(title);
        k0Var.e(description);
        if (bitmap != null) {
            k0Var.j(bitmap);
        }
        k0Var.f469470n = 0;
        k0Var.f469471o = 0;
        k0Var.f469472p = false;
        sb0.f fVar = (sb0.f) ((tb0.j) i95.n0.c(tb0.j.class));
        android.app.Service service = this.f420308a;
        boolean Ui = fVar.Ui(service);
        bw5.eq0 eq0Var = this.f420309b;
        if (Ui) {
            android.content.Intent intent = new android.content.Intent(service, (java.lang.Class<?>) com.tencent.mm.plugin.ting.notification.TingBroadcastReceiver.class);
            intent.putExtra("com.tencent.mm.ting.ActionCode", 5);
            intent.putExtra("com.tent.mm.ting.PlayAppId", eq0Var.f27025d);
            activity = android.app.PendingIntent.getBroadcast(service, 5, intent, fp.g0.a(134217728));
            kotlin.jvm.internal.o.f(activity, "getBroadcast(...)");
        } else {
            android.content.Intent intent2 = new android.content.Intent(service, (java.lang.Class<?>) com.tencent.mm.plugin.ting.TingNotificationProxy.class);
            intent2.putExtra("com.tent.mm.ting.PlayAppId", eq0Var.f27025d);
            activity = android.app.PendingIntent.getActivity(service, 52, intent2, fp.g0.a(134217728));
            kotlin.jvm.internal.o.f(activity, "getActivity(...)");
        }
        k0Var.f469463g = activity;
        android.app.PendingIntent b17 = b(1);
        android.app.Service service2 = this.f420308a;
        k0Var.a(new z2.e0(androidx.core.graphics.drawable.IconCompat.d(service2, com.tencent.mm.R.drawable.c6p), service2.getString(com.tencent.mm.R.string.f492607h51), b17).a());
        if (i17 == 3) {
            z2.f0 a17 = new z2.e0(androidx.core.graphics.drawable.IconCompat.d(service2, com.tencent.mm.R.drawable.c6n), service2.getString(com.tencent.mm.R.string.h4z), b(2)).a();
            if (this.f420311d != i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "setupNotificationAction actionCode = 2, title = " + ((java.lang.Object) a17.f469444i));
            }
            k0Var.a(a17);
        } else {
            z2.f0 a18 = new z2.e0(androidx.core.graphics.drawable.IconCompat.d(service2, com.tencent.mm.R.drawable.c6o), service2.getString(com.tencent.mm.R.string.f492606h50), b(4)).a();
            if (this.f420311d != i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseNotificationManager", "setupNotificationAction actionCode = 4, title = " + ((java.lang.Object) a18.f469444i));
            }
            k0Var.a(a18);
        }
        k0Var.a(new z2.e0(androidx.core.graphics.drawable.IconCompat.d(service2, com.tencent.mm.R.drawable.c6m), service2.getString(com.tencent.mm.R.string.h4y), b(3)).a());
        d4.b bVar = new d4.b();
        bVar.f226354c = sessionToken;
        bVar.f226353b = java.util.Arrays.copyOf(new int[]{0, 1, 2}, 3);
        k0Var.l(bVar);
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            java.lang.String packageName2 = this.f420308a.getPackageName();
            kotlin.jvm.internal.o.f(packageName2, "getPackageName(...)");
            k0Var.f469482z = packageName2;
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) ((jz5.n) this.f420312e).getValue();
            java.lang.String packageName3 = this.f420308a.getPackageName();
            kotlin.jvm.internal.o.f(packageName3, "getPackageName(...)");
            if (notificationManager.getNotificationChannel(packageName3) == null) {
                java.lang.String packageName4 = this.f420308a.getPackageName();
                kotlin.jvm.internal.o.f(packageName4, "getPackageName(...)");
                java.lang.String string = this.f420308a.getString(com.tencent.mm.R.string.m_v);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(packageName4, string, 2);
                java.lang.String string2 = this.f420308a.getString(com.tencent.mm.R.string.m_u);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                notificationChannel.setDescription(string2);
                ((android.app.NotificationManager) ((jz5.n) this.f420312e).getValue()).createNotificationChannel(notificationChannel);
            }
        }
        if (i17 == 2) {
            k0Var.h(2, false);
            ku5.u0 u0Var = ku5.t0.f312615d;
            tl4.g gVar = new tl4.g(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(gVar, 20L, false);
        }
        android.app.Notification b18 = k0Var.b();
        kotlin.jvm.internal.o.f(b18, "build(...)");
        if (i17 != 2) {
            if (i18 >= 30) {
                this.f420308a.startForeground(((wl4.m) this).f447093f.f27025d, b18, 2);
            } else {
                this.f420308a.startForeground(((wl4.m) this).f447093f.f27025d, b18);
            }
        }
        ((android.app.NotificationManager) ((jz5.n) this.f420312e).getValue()).notify(((wl4.m) this).f447093f.f27025d, b18);
        this.f420311d = i17;
    }
}
