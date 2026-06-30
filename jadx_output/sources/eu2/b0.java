package eu2;

@j95.b
/* loaded from: classes2.dex */
public final class b0 extends i95.w {
    public static final du2.l I = du2.l.f243481e;
    public java.lang.ref.WeakReference A;

    /* renamed from: d, reason: collision with root package name */
    public cw2.da f256757d;

    /* renamed from: e, reason: collision with root package name */
    public cw2.wa f256758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f256759f;

    /* renamed from: h, reason: collision with root package name */
    public in5.s0 f256761h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f256763m;

    /* renamed from: n, reason: collision with root package name */
    public long f256764n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f256765o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f256766p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f256767q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f256768r;

    /* renamed from: t, reason: collision with root package name */
    public f25.m0 f256770t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f256771u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f256772v;

    /* renamed from: w, reason: collision with root package name */
    public ls5.l f256773w;

    /* renamed from: z, reason: collision with root package name */
    public android.content.res.Configuration f256776z;

    /* renamed from: g, reason: collision with root package name */
    public eu2.k f256760g = eu2.k.f256797g;

    /* renamed from: i, reason: collision with root package name */
    public eu2.e f256762i = eu2.e.f256784f;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.e2 f256769s = new com.tencent.mm.plugin.finder.assist.e2(1000, com.tencent.mm.plugin.finder.assist.h2.f102216e, null, 4, null);

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f256774x = jz5.h.b(eu2.t.f256809d);

    /* renamed from: y, reason: collision with root package name */
    public final eu2.n f256775y = new eu2.n(this);
    public final java.util.HashSet B = new java.util.HashSet();
    public final jz5.g C = jz5.h.b(eu2.q.f256806d);
    public final jz5.g D = jz5.h.b(eu2.z.f256816d);
    public final jz5.g E = jz5.h.b(eu2.l.f256799d);
    public final jz5.g F = jz5.h.b(eu2.s.f256808d);
    public final eu2.m G = new eu2.m(this);
    public final eu2.a0 H = new eu2.a0(this);

    public static final void Ai(eu2.b0 b0Var, boolean z17) {
        fu2.c wi6 = b0Var.Ui().wi(I);
        eu2.j jVar = wi6 instanceof eu2.j ? (eu2.j) wi6 : null;
        if (jVar != null) {
            jVar.c(z17);
        }
    }

    public static final boolean Bi(eu2.b0 b0Var) {
        if (b0Var.f256765o) {
            return true;
        }
        cw2.da daVar = b0Var.f256757d;
        return daVar != null && daVar.isPlaying();
    }

    public final void Di() {
        java.util.concurrent.Future future = this.f256768r;
        if (future != null) {
            future.cancel(true);
        }
        this.f256768r = null;
    }

    public final void Ni() {
        boolean z17;
        boolean z18;
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[cancelPlayerNotification]");
        du2.n Ui = Ui();
        du2.l type = I;
        Ui.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        if (type != Ui.f243489i) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[cancelPlayerNotification] failed, type = " + type + ", currentBusinessType = " + Ui.f243489i);
            return;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("FinderSystemPlayerManager", "[cancelPlayerNotification] type = " + type, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[cancelPlayerNotification] type = " + type);
        }
        android.os.Bundle bundle = Ui.f243491n;
        bundle.putBoolean("key_need_cancel_notification", true);
        bundle.putBoolean("key_set_session_active", false);
        android.support.v4.media.session.r rVar = Ui.f243487g;
        if (rVar != null) {
            rVar.a("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION", Ui.f243491n, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
    
        if (r7 == 9) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final in5.s0 Ri(androidx.appcompat.app.AppCompatActivity r13) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.b0.Ri(androidx.appcompat.app.AppCompatActivity):in5.s0");
    }

    public final du2.n Ui() {
        return (du2.n) ((jz5.n) this.F).getValue();
    }

    public final boolean Vi(cw2.wa waVar, java.lang.String str) {
        if (waVar == null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[" + str + "] mediaInfo is null!");
            return true;
        }
        if (this.f256760g != eu2.k.f256795e) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[" + str + "] currentScene = MINI_VIEW, return!");
        return true;
    }

    public final boolean Zi() {
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) this.C).getValue();
        boolean z17 = !(powerManager != null ? powerManager.isInteractive() : true);
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) ((jz5.n) this.E).getValue();
        return (keyguardManager != null && keyguardManager.isKeyguardLocked()) || z17;
    }

    public final boolean aj() {
        du2.w wVar = Ui().f243484d;
        if (wVar != null) {
            com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService finderSystemPlayerService = (com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService) wVar;
            if (((du2.q) ((jz5.n) finderSystemPlayerService.f128480p).getValue()).f243498c.contains(java.lang.Integer.valueOf(finderSystemPlayerService.f128481q))) {
                return true;
            }
        }
        return false;
    }

    public final void bj(java.lang.String str) {
        boolean z17;
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            com.tencent.mm.sdk.platformtools.Log.c("FinderVideoSystemPlayerController", str, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", str);
        }
    }

    public final boolean cj(eu2.k kVar) {
        long j17;
        if (kVar != null) {
            du2.n Ui = Ui();
            du2.l type = I;
            Ui.getClass();
            kotlin.jvm.internal.o.g(type, "type");
            if (!Ui.f243490m.containsKey(type)) {
                du2.n Ui2 = Ui();
                du2.l lVar = du2.l.f243481e;
                eu2.j jVar = new eu2.j(this);
                Ui2.getClass();
                Ui2.f243490m.put(lVar, jVar);
            }
        }
        du2.n Ui3 = Ui();
        du2.l businessType = I;
        fu2.c wi6 = Ui3.wi(businessType);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[notifyMediaInfoUpdate] failed! depend is null, currentBusinessType = " + businessType);
            return false;
        }
        int ordinal = this.f256762i.ordinal();
        if (ordinal == 0) {
            j17 = this.f256764n;
        } else {
            if (ordinal != 1 && ordinal != 2) {
                throw new jz5.j();
            }
            j17 = 0;
        }
        int i17 = this.f256765o ? 3 : 2;
        fu2.b bVar = ((eu2.j) wi6).f256792c;
        bVar.f266874a = j17;
        bVar.f266875b = i17;
        bVar.f266876c = 1.0f;
        if (kVar != null) {
            return Ui().Ni(businessType);
        }
        du2.n Ui4 = Ui();
        Ui4.getClass();
        kotlin.jvm.internal.o.g(businessType, "businessType");
        if (businessType == Ui4.f243489i) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[updateMediaState] businessType = " + businessType);
            return Ui4.Ni(null);
        }
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerManager", "[updateMediaState] update state failed! businessType = " + businessType + ", currentBusinessType = " + Ui4.f243489i);
        return false;
    }

    public final void fj(cw2.wa waVar, java.lang.Long l17, eu2.k kVar) {
        if (waVar != null) {
            long expectId = waVar.f224099f.getExpectId();
            java.lang.Long l18 = this.f256759f;
            if (l18 != null && expectId == l18.longValue()) {
                eu2.k kVar2 = this.f256760g;
                eu2.k kVar3 = eu2.k.f256795e;
                if (kVar2 != kVar3 || kVar == kVar3) {
                    this.f256764n = l17 != null ? l17.longValue() : 0L;
                    this.f256769s.a(new eu2.p(this, waVar, l17));
                }
            }
        }
    }

    public final void hj(eu2.k scene) {
        android.support.v4.media.session.r rVar;
        kotlin.jvm.internal.o.g(scene, "scene");
        if (scene != this.f256760g) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[releaseSystemPlayer] release failed, scene = " + scene + ", currentScene = " + this.f256760g);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[releaseSystemPlayer] playingView = " + this.f256757d + ", scene = " + scene);
        cw2.da daVar = this.f256757d;
        if (daVar != null) {
            daVar.stop();
        }
        mj();
        nj();
        Ni();
        if (this.B.isEmpty()) {
            du2.n Ui = Ui();
            Ui.getClass();
            du2.l type = I;
            kotlin.jvm.internal.o.g(type, "type");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = Ui.f243490m;
            concurrentHashMap.remove(type);
            if (!concurrentHashMap.isEmpty() || (rVar = Ui.f243487g) == null) {
                return;
            }
            rVar.a("COMMAND_DISCONNECT_SERVICE", null, null);
        }
    }

    public final void ij(java.lang.String str) {
        java.lang.Integer num;
        java.lang.String str2;
        r45.qt2 qt2Var;
        java.lang.String string;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        android.content.Context context;
        com.tencent.mm.plugin.finder.report.r0 a76;
        r45.qt2 qt2Var2;
        java.lang.String string2;
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dy1.r rVar = (dy1.r) c17;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("event_time", java.lang.String.valueOf(c01.id.c())));
        java.lang.Long l17 = this.f256759f;
        int ordinal = this.f256760g.ordinal();
        if (ordinal != 0) {
            num = null;
            if (ordinal != 1) {
                in5.s0 s0Var = this.f256761h;
                if (s0Var != null && (context = s0Var.f293121e) != null) {
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    if (nyVar != null && (a76 = nyVar.a7(-1)) != null && (qt2Var2 = a76.f125284h) != null && (string2 = qt2Var2.getString(0)) != null) {
                        str2 = string2;
                    } else if (nyVar != null) {
                        str2 = nyVar.f135385q;
                    }
                }
                str2 = null;
            } else {
                kd2.q0 q0Var = kd2.p1.N.a().f306787x;
                java.lang.Long valueOf = (q0Var == null || (feedData = q0Var.f306806g) == null) ? null : java.lang.Long.valueOf(feedData.getFeedId());
                str2 = (q0Var == null || (qt2Var = q0Var.f306803d) == null || (string = qt2Var.getString(0)) == null) ? "" : string;
                num = 1;
                l17 = valueOf;
            }
        } else {
            num = 2;
            str2 = this.f256772v;
        }
        if (num != null) {
            i17.put("lock_scene", java.lang.Integer.valueOf(num.intValue()));
        }
        i17.put("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        i17.put("session_id", str2 == null ? "" : str2);
        i17.put("behaviour_session_id", str2 != null ? str2 : "");
        ((cy1.a) rVar).yj(str, null, i17, 1, true);
    }

    public final void mj() {
        bj("[resetController]");
        this.f256764n = 0L;
        this.f256758e = null;
        this.f256759f = null;
        this.f256760g = eu2.k.f256797g;
        this.f256762i = eu2.e.f256784f;
        this.f256771u = null;
        this.f256761h = null;
        this.f256776z = null;
        this.f256757d = null;
        this.f256772v = null;
        this.f256765o = false;
        this.f256766p = false;
        Di();
        fu2.c wi6 = Ui().wi(I);
        if (wi6 == null) {
            return;
        }
        eu2.j jVar = (eu2.j) wi6;
        fu2.b bVar = jVar.f256792c;
        bVar.f266874a = 0L;
        bVar.f266875b = 0;
        bVar.f266876c = 1.0f;
        fu2.a aVar = jVar.f256791b;
        aVar.f266872a = null;
        aVar.f266873b = null;
    }

    public final void nj() {
        cw2.da daVar = this.f256757d;
        if (daVar != null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[resetPlayers] playingView = " + daVar + ", mediaid:" + daVar.getVideoMediaId());
            daVar.stop();
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setVideoViewCallback(null);
                finderThumbPlayerProxy.setLifecycle(null);
            }
            daVar.setVideoPlayLifecycle(null);
            daVar.d();
            daVar.b();
        }
        this.f256757d = null;
    }

    public final void oj() {
        cw2.wa waVar;
        if (this.f256760g == eu2.k.f256794d && (waVar = this.f256758e) != null) {
            java.lang.Float valueOf = java.lang.Float.valueOf((float) waVar.f224098e.e().getLong(24));
            if (!(valueOf.floatValue() > 0.0f)) {
                valueOf = null;
            }
            if (valueOf != null) {
                float floatValue = valueOf.floatValue();
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[saveProgress]: currentPlayMs = " + this.f256764n);
                ey2.v2 v2Var = (ey2.v2) ((jz5.n) this.D).getValue();
                long expectId = waVar.f224099f.getExpectId();
                long j17 = this.f256764n;
                int i17 = (int) ((((float) j17) / floatValue) * 100);
                long j18 = floatValue;
                ey2.t2 t2Var = ey2.t2.f257516f;
                v2Var.getClass();
                com.tencent.mars.xlog.Log.i("Finder.VideoStateCacheVM", "[updateProgress] feedId=" + pm0.v.u(expectId) + " playTimeMs=" + j17 + " totalTimeMs=" + j18 + " invokeSource=" + t2Var + " progress=" + i17 + " seekMode=3 forceSeek=true");
                ey2.q2 q2Var = (ey2.q2) v2Var.f257556f.get(pm0.v.u(expectId));
                if (q2Var != null) {
                    q2Var.f257480c = i17;
                    q2Var.f257481d = j17;
                    q2Var.f257482e = j18;
                    q2Var.f257484g = java.lang.System.currentTimeMillis();
                    q2Var.f257485h = 3;
                    q2Var.f257486i = true;
                }
            }
        }
    }

    public final void pj() {
        cw2.wa waVar;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        if (this.f256760g != eu2.k.f256794d || (waVar = this.f256758e) == null || (feedData = waVar.f224099f) == null) {
            return;
        }
        long expectId = feedData.getExpectId();
        com.tencent.mars.xlog.Log.e("FinderVideoSystemPlayerController", "[updateEndState]: feed id = ".concat(pm0.v.u(expectId)));
        ((ey2.v2) ((jz5.n) this.D).getValue()).T6(expectId);
    }

    public final void qj(cw2.da daVar, eu2.k scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        boolean z17 = false;
        if (daVar != null && daVar.isPlaying()) {
            z17 = true;
        }
        eu2.k kVar = this.f256760g;
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[updateSystemPlayer] new scene = " + scene.name() + ", last scene: " + kVar.name() + " isPlaying = " + z17 + ", view = " + daVar + ',');
        if (!rj(daVar != null ? daVar.getF130756y() : null, z17, scene, daVar != null ? java.lang.Long.valueOf(daVar.getCurrentPlayMs()) : null) || kVar == scene) {
            return;
        }
        if (scene == eu2.k.f256794d || scene == eu2.k.f256795e) {
            ij("lock_and_gen_player");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (kotlin.jvm.internal.o.b(r8.f256759f, (r9 == null || (r6 = r9.f224099f) == null) ? null : java.lang.Long.valueOf(r6.getExpectId())) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean rj(cw2.wa r9, boolean r10, eu2.k r11, java.lang.Long r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.b0.rj(cw2.wa, boolean, eu2.k, java.lang.Long):boolean");
    }

    public final void wi() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[abandonAudioFocus]");
        f25.m0 m0Var = this.f256770t;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f256770t = null;
    }
}
