package com.tencent.mm.plugin.finder.system_player;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/system_player/FinderSystemPlayerService;", "Landroidx/media/MediaBrowserServiceCompat;", "Ldu2/w;", "<init>", "()V", "du2/r", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FinderSystemPlayerService extends androidx.media.MediaBrowserServiceCompat implements du2.w {

    /* renamed from: r, reason: collision with root package name */
    public static final du2.r f128477r = new du2.r(null);

    /* renamed from: n, reason: collision with root package name */
    public android.support.v4.media.session.f0 f128478n;

    /* renamed from: o, reason: collision with root package name */
    public android.support.v4.media.session.k0 f128479o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f128480p = jz5.h.b(new du2.s(this));

    /* renamed from: q, reason: collision with root package name */
    public final int f128481q = hashCode() + 539300132;

    @Override // androidx.media.MediaBrowserServiceCompat
    public c4.l b(java.lang.String clientPackageName, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(clientPackageName, "clientPackageName");
        return new c4.l("FinderSystemPlayerService", null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void c(java.lang.String parentId, c4.z result) {
        kotlin.jvm.internal.o.g(parentId, "parentId");
        kotlin.jvm.internal.o.g(result, "result");
        result.a();
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[cancelNotification]");
        du2.q qVar = (du2.q) ((jz5.n) this.f128480p).getValue();
        qVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerNotificationManager", "cancelNotification");
            z2.n1 b17 = qVar.b();
            int i17 = this.f128481q;
            if (b17 != null) {
                b17.f469505b.cancel(null, i17);
            }
            qVar.f243498c.remove(java.lang.Integer.valueOf(i17));
            qVar.f243496a.stopForeground(1);
            qVar.f243499d = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderSystemPlayerNotificationManager", e17, "cancelNotification exception", new java.lang.Object[0]);
        }
    }

    public final void f() {
        android.support.v4.media.session.f0 f0Var = this.f128478n;
        if (f0Var != null) {
            f0Var.f(null, null);
        }
        android.support.v4.media.session.f0 f0Var2 = this.f128478n;
        if (f0Var2 != null) {
            f0Var2.d();
        }
        e();
        i95.m c17 = i95.n0.c(du2.n.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        du2.n nVar = (du2.n) c17;
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "disconnectService");
        android.support.v4.media.m mVar = nVar.f243488h;
        if (!((mVar == null || ((android.support.v4.media.g) mVar.f8937a).f8927b.isConnected()) ? false : true)) {
            nVar.f243485e = false;
            android.support.v4.media.m mVar2 = nVar.f243488h;
            if (mVar2 != null) {
                mVar2.a();
            }
            nVar.f243488h = null;
            nVar.f243487g = null;
            nVar.f243484d = null;
            fu2.c Ai = du2.n.Ai(nVar, null, 1, null);
            if (Ai != null) {
                ((eu2.j) Ai).f256793d.mj();
            }
        }
        stopSelf();
    }

    public final void g(fu2.c cVar) {
        android.support.v4.media.session.PlaybackStateCompat playbackStateCompat;
        android.support.v4.media.session.f0 f0Var = this.f128478n;
        if (f0Var != null) {
            fu2.b bVar = ((eu2.j) cVar).f256792c;
            int i17 = bVar.f266875b;
            long j17 = bVar.f266874a;
            float f17 = bVar.f266876c;
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "state = " + i17 + ", currentPlayMs = " + j17 + ", playbackSpeed = " + f17);
            android.support.v4.media.session.k0 k0Var = this.f128479o;
            if (k0Var != null) {
                k0Var.f8987g = 0L;
                k0Var.f8985e = 774L;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f8982b = i17;
                k0Var.f8983c = j17;
                k0Var.f8986f = elapsedRealtime;
                k0Var.f8984d = f17;
                playbackStateCompat = k0Var.a();
            } else {
                playbackStateCompat = null;
            }
            f0Var.h(playbackStateCompat);
        }
    }

    public final void h(fu2.c cVar) {
        eu2.j jVar = (eu2.j) cVar;
        cw2.wa waVar = jVar.f256793d.f256758e;
        if (waVar == null) {
            return;
        }
        android.graphics.Bitmap e17 = jVar.e();
        java.lang.String d17 = jVar.d();
        java.lang.String g17 = jVar.g();
        android.support.v4.media.r rVar = new android.support.v4.media.r();
        rVar.c("android.media.metadata.DURATION", waVar.f224098e.e().getLong(24));
        rVar.d("android.media.metadata.DISPLAY_TITLE", d17);
        rVar.d("android.media.metadata.TITLE", d17);
        rVar.d("android.media.metadata.ARTIST", g17);
        rVar.d("android.media.metadata.DISPLAY_SUBTITLE", g17);
        rVar.b("android.media.metadata.ALBUM_ART", e17);
        rVar.b("android.media.metadata.DISPLAY_ICON", e17);
        rVar.e("android.media.metadata.MEDIA_ID", java.lang.String.valueOf(waVar.f224099f.getFeedId()));
        android.support.v4.media.session.f0 f0Var = this.f128478n;
        if (f0Var != null) {
            ((android.support.v4.media.session.y) f0Var.f8973a).f8999a.setQueueTitle(d17);
        }
        android.support.v4.media.session.f0 f0Var2 = this.f128478n;
        if (f0Var2 != null) {
            f0Var2.g(rVar.a());
        }
        g(cVar);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (gm0.j1.a()) {
            i95.m c17 = i95.n0.c(du2.n.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (!((du2.n) c17).f243485e) {
                com.tencent.mars.xlog.Log.w("FinderSystemPlayerService", "[onCreate] service not create manually, just return!");
                stopSelf();
                return;
            }
            android.support.v4.media.session.f0 f0Var = this.f128478n;
            if (f0Var == null) {
                f0Var = new android.support.v4.media.session.f0(this, "FinderSystemPlayerService");
                f0Var.f(new du2.u(this), null);
                android.app.PendingIntent a17 = f128477r.a(this);
                android.support.v4.media.session.w wVar = f0Var.f8973a;
                ((android.support.v4.media.session.y) wVar).f8999a.setSessionActivity(a17);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("HMOS_MEDIA_CONTROLLER", true);
                ((android.support.v4.media.session.y) wVar).f8999a.setExtras(bundle);
                f0Var.e(true);
                ((android.support.v4.media.session.y) wVar).f8999a.setFlags(3);
                this.f128478n = f0Var;
            }
            d(f0Var.b());
            android.support.v4.media.session.k0 k0Var = new android.support.v4.media.session.k0();
            k0Var.f8985e = 774L;
            this.f128479o = k0Var;
            i95.m c18 = i95.n0.c(du2.n.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((du2.n) c18).f243484d = this;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_action_code", 0)) : null;
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[onStartCommand] action: " + valueOf);
        if (valueOf != null && valueOf.intValue() == 2) {
            i95.m c17 = i95.n0.c(du2.n.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((du2.n) c17).Di();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            i95.m c18 = i95.n0.c(du2.n.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((du2.n) c18).Bi();
        } else if (valueOf != null && valueOf.intValue() == 5) {
            i95.m c19 = i95.n0.c(du2.n.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            fu2.c Ai = du2.n.Ai((du2.n) c19, null, 1, null);
            if (Ai != null) {
                eu2.b0 b0Var = ((eu2.j) Ai).f256793d;
                b0Var.hj(b0Var.f256760g);
            }
        }
        return 2;
    }
}
