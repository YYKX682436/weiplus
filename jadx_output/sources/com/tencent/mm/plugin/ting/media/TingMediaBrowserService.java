package com.tencent.mm.plugin.ting.media;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/ting/media/TingMediaBrowserService;", "Lcom/tencent/mm/plugin/ting/media/BaseTingMediaBrowserService;", "Lrl4/b;", "Lrl4/a;", "Lfl4/c;", "<init>", "()V", "fl4/e", "fl4/g", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingMediaBrowserService extends com.tencent.mm.plugin.ting.media.BaseTingMediaBrowserService implements rl4.b, rl4.a, fl4.c {
    public static final fl4.e I = new fl4.e(null);
    public b66.n A;
    public java.lang.String B;
    public bw5.tp0 C;
    public java.lang.String D;
    public java.lang.String E;
    public android.support.v4.media.r F;
    public final jz5.g G;
    public final jz5.g H;

    /* renamed from: n, reason: collision with root package name */
    public final fl4.k f174691n;

    /* renamed from: o, reason: collision with root package name */
    public android.support.v4.media.session.f0 f174692o;

    /* renamed from: p, reason: collision with root package name */
    public android.support.v4.media.session.k0 f174693p;

    /* renamed from: q, reason: collision with root package name */
    public tl4.e f174694q;

    /* renamed from: r, reason: collision with root package name */
    public tl4.a f174695r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f174696s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f174697t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.eq0 f174698u;

    /* renamed from: v, reason: collision with root package name */
    public rl4.c f174699v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f174700w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.jq0 f174701x;

    /* renamed from: y, reason: collision with root package name */
    public int f174702y;

    /* renamed from: z, reason: collision with root package name */
    public long f174703z;

    public TingMediaBrowserService() {
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        this.f174691n = new fl4.k(this);
        this.f174696s = "";
        this.B = "";
        this.D = "";
        this.E = "";
        this.F = new android.support.v4.media.r();
        this.G = jz5.h.b(new fl4.i(this));
        this.H = jz5.h.b(new fl4.j(this));
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "real cancel notification ok, is not playable");
        this.f174696s = "";
        this.f174697t = null;
        tl4.a aVar = this.f174695r;
        if (aVar != null) {
            ((tl4.h) aVar).a();
        }
    }

    public final void f() {
        android.support.v4.media.session.f0 f0Var;
        android.support.v4.media.session.f0 f0Var2 = this.f174692o;
        if (f0Var2 == null) {
            return;
        }
        try {
            android.support.v4.media.session.k0 k0Var = this.f174693p;
            if (k0Var != null) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                k0Var.f8982b = 0;
                k0Var.f8983c = 0L;
                k0Var.f8986f = elapsedRealtime;
                k0Var.f8984d = 0.0f;
                f0Var2.h(k0Var.a());
            }
            f0Var = this.f174692o;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMediaBrowserService", "deactivateAndReleaseSession error: " + e17.getMessage());
        }
        if (f0Var == null) {
            kotlin.jvm.internal.o.o("mSession");
            throw null;
        }
        f0Var.e(false);
        android.support.v4.media.session.f0 f0Var3 = this.f174692o;
        if (f0Var3 != null) {
            f0Var3.d();
        } else {
            kotlin.jvm.internal.o.o("mSession");
            throw null;
        }
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "disConnectSession bizType:" + this.f174698u);
        d75.b.g(new fl4.l(this, null));
        f();
        d75.b.g(tl4.o.f420325d);
    }

    public final b66.n h() {
        b66.g gVar;
        b66.n a17;
        b66.n nVar = this.A;
        if (nVar != null) {
            return nVar;
        }
        com.tencent.unit_rc.WeakPtr weakPtr = this.f174700w;
        if (weakPtr == null || (gVar = (b66.g) weakPtr.lock()) == null || (a17 = ((b66.i) gVar).a()) == null) {
            return null;
        }
        this.A = a17;
        return a17;
    }

    public void i(com.tencent.unit_rc.WeakPtr weakPtr, bw5.eq0 appId, bw5.jq0 playingInfo) {
        bw5.v70 d17;
        com.tencent.unit_rc.WeakPtr weakPtr2;
        b66.g gVar;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(playingInfo, "playingInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate playAppRef: " + weakPtr + ", appId: " + appId + ", playingInfo.status: " + playingInfo.f29110e);
        if (this.f174698u != appId) {
            this.f174698u = appId;
            if (playingInfo.f29110e == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate playTask is idle, don't need to recreate notification manager bizType:" + this.f174698u);
                return;
            }
            if (weakPtr != null && (gVar = (b66.g) weakPtr.lock()) != null) {
                this.f174699v = wl4.w.f447104a.a(((b66.i) gVar).getAppId(), null);
            }
            tl4.a aVar = this.f174695r;
            if (aVar != null) {
                ((tl4.h) aVar).a();
            }
            rl4.c cVar = this.f174699v;
            bw5.eq0 eq0Var = this.f174698u;
            if (cVar == null || eq0Var == null) {
                this.f174695r = null;
            } else {
                this.f174695r = new wl4.m(this, this.f174700w, cVar, eq0Var);
            }
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f174700w, weakPtr);
        fl4.e eVar = I;
        if (!b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "onPlayingInfoUpdate update playApp: " + weakPtr);
            b66.n h17 = h();
            fl4.k kVar = this.f174691n;
            if (h17 != null) {
                ((b66.q) h17).j(kVar);
            }
            if (weakPtr != null) {
                b66.g gVar2 = (b66.g) weakPtr.lock();
                this.A = gVar2 != null ? ((b66.i) gVar2).a() : null;
                weakPtr2 = weakPtr;
            } else {
                weakPtr2 = null;
            }
            this.f174700w = weakPtr2;
            b66.n h18 = h();
            this.f174702y = h18 != null ? eVar.a(((b66.q) h18).n()) : 0;
            this.C = null;
            b66.n h19 = h();
            if (h19 != null) {
                ((b66.q) h19).a(kVar);
            }
            tl4.a aVar2 = this.f174695r;
            if (aVar2 != null) {
                ((tl4.h) aVar2).f420310c = weakPtr;
            }
            j(weakPtr);
        }
        tl4.e eVar2 = this.f174694q;
        if (eVar2 != null) {
            eVar2.f420305j = playingInfo;
        }
        bw5.lp0 b18 = playingInfo.b();
        java.lang.String listenId = (b18 == null || (d17 = b18.d()) == null) ? null : d17.getListenId();
        if (listenId == null) {
            listenId = "";
        }
        if (!kotlin.jvm.internal.o.b(listenId, this.B)) {
            this.C = null;
            this.B = listenId;
        }
        this.f174701x = playingInfo;
        b66.n h27 = h();
        if (h27 == null) {
            return;
        }
        int a17 = eVar.a(((b66.q) h27).n());
        if (this.f174702y != a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "onStatusChanged systemState = " + a17);
        }
        try {
            l(a17, playingInfo, -1L, -1L);
            k(a17, playingInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingMediaBrowserService", e17, "onStatusChanged", new java.lang.Object[0]);
        }
        this.f174702y = a17;
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.TingMediaBrowserService");
        if (a17 == 2) {
            boolean Ai = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).Ai();
            ((ov.k0) ((pv.h0) i95.n0.c(pv.h0.class))).getClass();
            boolean b19 = qp1.q.b();
            if (Ai || !b19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "begin pause notification runnable isInTing " + Ai + ", hasFloatPermission " + b19);
                ku5.u0 u0Var = ku5.t0.f312615d;
                fl4.g gVar3 = (fl4.g) ((jz5.n) this.H).getValue();
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                java.util.Objects.requireNonNull(gVar3);
                t0Var.w(gVar3, 300000L, "MicroMsg.TingMediaBrowserService");
            }
        }
    }

    public final void j(com.tencent.unit_rc.WeakPtr weakPtr) {
        tl4.e eVar = this.f174694q;
        if (eVar != null && eVar.m() == this.f174698u) {
            tl4.e eVar2 = this.f174694q;
            if (eVar2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppBaseMediaSessionCallBack", "updatePlayApp playAppRef: " + weakPtr);
                eVar2.f420301f = weakPtr;
                return;
            }
            return;
        }
        bw5.eq0 eq0Var = this.f174698u;
        if (eq0Var == bw5.eq0.AudioRadio) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "updateMediaSessionCallback create media session callback, playAppRef: " + weakPtr);
            am4.h hVar = new am4.h(weakPtr);
            this.f174694q = hVar;
            d75.b.g(new fl4.l(this, hVar));
            return;
        }
        rl4.c cVar = this.f174699v;
        if (cVar == null || eq0Var == null) {
            this.f174694q = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "updateMediaSessionCallback create media session callback, playAppRef: " + weakPtr);
        if (eq0Var == bw5.eq0.TingChatRoom) {
            this.f174694q = new wl4.g(weakPtr, cVar);
        } else if (eq0Var == bw5.eq0.TingMusic) {
            this.f174694q = new wl4.u(weakPtr);
        } else {
            this.f174694q = new wl4.q(weakPtr, cVar, eq0Var);
        }
        d75.b.g(new fl4.l(this, this.f174694q));
    }

    public final void k(int i17, bw5.jq0 jq0Var) {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "api 26 disable notify");
            return;
        }
        if (i17 != 0) {
            if (i17 != 1) {
                if (jq0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingMediaBrowserService", "updateSystemNotify playingInfo is null");
                    return;
                }
                java.lang.String title = jq0Var.b().d().getTitle();
                if (title == null) {
                    title = "";
                }
                java.lang.String c17 = jq0Var.b().d().c();
                if (c17 == null) {
                    c17 = "";
                }
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = title;
                kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                h0Var2.f310123d = c17;
                if (this.C != null) {
                    h0Var.f310123d = title + " - " + c17;
                    bw5.tp0 tp0Var = this.C;
                    kotlin.jvm.internal.o.d(tp0Var);
                    java.lang.String str = tp0Var.f33574h[3] ? tp0Var.f33572f : "";
                    kotlin.jvm.internal.o.f(str, "getText(...)");
                    h0Var2.f310123d = str;
                }
                android.graphics.Bitmap bitmap = this.f174697t;
                boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
                tl4.a aVar = this.f174695r;
                if (aVar != null) {
                    java.lang.String str2 = (java.lang.String) h0Var.f310123d;
                    java.lang.Object obj = h0Var2.f310123d;
                    kotlin.jvm.internal.o.d(obj);
                    java.lang.String str3 = (java.lang.String) obj;
                    android.graphics.Bitmap bitmap2 = z17 ? this.f174697t : null;
                    android.support.v4.media.session.f0 f0Var = this.f174692o;
                    if (f0Var == null) {
                        kotlin.jvm.internal.o.o("mSession");
                        throw null;
                    }
                    android.support.v4.media.session.MediaSessionCompat$Token b17 = f0Var.b();
                    kotlin.jvm.internal.o.f(b17, "getSessionToken(...)");
                    ((tl4.h) aVar).c(jq0Var, i17, str2, str3, bitmap2, b17);
                }
                java.lang.String f17 = jq0Var.b().d().f();
                if (z17 && kotlin.jvm.internal.o.b(this.f174696s, f17)) {
                    return;
                }
                kotlin.jvm.internal.o.d(f17);
                if (f17.length() > 0) {
                    ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Zi(f17, null, 0, 500, 500, null, new jl4.a(new fl4.n(jq0Var, this, f17, i17, h0Var, h0Var2)));
                    return;
                } else {
                    this.f174696s = "";
                    this.f174697t = null;
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "call cancelNotification");
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if ((r10.isRecycled()) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18, bw5.jq0 r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.media.TingMediaBrowserService.l(int, bw5.jq0, long, long):void");
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onCreate() {
        bw5.jq0 jq0Var;
        com.tencent.unit_rc.WeakPtr weakPtr;
        android.content.Intent launchIntentForPackage;
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "onCreate %s", getPackageName());
        if (!tl4.p.f420329d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMediaBrowserService", "onCreate not create by self, just return");
            stopSelf();
            return;
        }
        ef0.q3 q3Var = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var.getClass();
        q3Var.f252306d.add(this);
        ef0.q3 q3Var2 = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var2.getClass();
        q3Var2.f252307e.add(this);
        android.content.pm.PackageManager packageManager = getPackageManager();
        android.app.PendingIntent activity = (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(getPackageName())) == null) ? null : android.app.PendingIntent.getActivity(this, 0, launchIntentForPackage, fp.g0.a(0));
        android.support.v4.media.session.f0 f0Var = new android.support.v4.media.session.f0(this, "MicroMsg.TingMediaBrowserService");
        this.f174692o = f0Var;
        tl4.e eVar = this.f174694q;
        if (eVar == null) {
            j(this.f174700w);
            eVar = this.f174694q;
        }
        f0Var.f(eVar, null);
        android.support.v4.media.session.w wVar = f0Var.f8973a;
        ((android.support.v4.media.session.y) wVar).f8999a.setSessionActivity(activity);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("HMOS_MEDIA_CONTROLLER", true);
        ((android.support.v4.media.session.y) wVar).f8999a.setExtras(bundle);
        f0Var.e(true);
        android.support.v4.media.session.f0 f0Var2 = this.f174692o;
        if (f0Var2 == null) {
            kotlin.jvm.internal.o.o("mSession");
            throw null;
        }
        d(f0Var2.b());
        android.support.v4.media.session.k0 k0Var = new android.support.v4.media.session.k0();
        k0Var.f8985e = 1847L;
        this.f174693p = k0Var;
        bw5.eq0 eq0Var = this.f174698u;
        if (eq0Var == null || (jq0Var = this.f174701x) == null || (weakPtr = this.f174700w) == null) {
            b66.h hVar = b66.i.f18167d;
            b66.g gVar = (b66.g) urgen.ur_2BA9.UR_882D.UR_16B0();
            if (gVar instanceof jm4.n2) {
                b66.g gVar2 = (jm4.n2) gVar;
                jm4.m2 m2Var = (jm4.m2) urgen.ur_0025.UR_882D.UR_ACB1(((jm4.p2) gVar2).getCppPointer());
                if (m2Var instanceof tl4.l) {
                    bw5.eq0 appId = ((b66.i) gVar2).getAppId();
                    bw5.jq0 jq0Var2 = ((tl4.l) m2Var).f420323g;
                    if (jq0Var2 != null) {
                        i(new com.tencent.unit_rc.WeakPtr(gVar), appId, jq0Var2);
                    }
                }
            }
        } else {
            i(weakPtr, eq0Var, jq0Var);
        }
        jz5.g gVar3 = com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver.f174688c;
        com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver tingHeadsetChangeReceiver = (com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver) ((jz5.n) com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver.f174688c).getValue();
        tingHeadsetChangeReceiver.getClass();
        ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) tingHeadsetChangeReceiver.f174690b).getValue()).put(java.lang.Integer.valueOf(hashCode()), this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "onDestroy bizType:" + this.f174698u);
        super.onDestroy();
        b66.n h17 = h();
        if (h17 != null) {
            ((b66.q) h17).j(this.f174691n);
        }
        ef0.q3 q3Var = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var.getClass();
        q3Var.f252306d.remove(this);
        ef0.q3 q3Var2 = (ef0.q3) ((qk.b9) i95.n0.c(qk.b9.class));
        q3Var2.getClass();
        q3Var2.f252307e.remove(this);
        this.A = null;
        this.f174700w = null;
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.TingMediaBrowserService");
        e();
        jz5.g gVar = com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver.f174688c;
        com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver tingHeadsetChangeReceiver = (com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver) ((jz5.n) com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver.f174688c).getValue();
        tingHeadsetChangeReceiver.getClass();
        ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) tingHeadsetChangeReceiver.f174690b).getValue()).remove(java.lang.Integer.valueOf(hashCode()));
        if (this.f174692o == null) {
            return;
        }
        f();
        d75.b.g(tl4.o.f420325d);
    }
}
