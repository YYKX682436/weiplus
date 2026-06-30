package ey2;

/* loaded from: classes2.dex */
public final class t0 extends pf5.o0 {

    /* renamed from: m, reason: collision with root package name */
    public int f257507m;

    /* renamed from: n, reason: collision with root package name */
    public int f257508n;

    /* renamed from: o, reason: collision with root package name */
    public int f257509o;

    /* renamed from: p, reason: collision with root package name */
    public int f257510p;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257502e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257503f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f257504g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f257505h = jz5.h.b(ey2.s0.f257497d);

    /* renamed from: i, reason: collision with root package name */
    public final r45.nx2 f257506i = new r45.nx2();

    /* renamed from: q, reason: collision with root package name */
    public volatile int f257511q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257512r = true;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V6(ey2.t0 r18, java.lang.String r19, int r20, int r21, int r22, java.util.List r23, java.util.ArrayList r24, com.tencent.mm.protobuf.g r25, boolean r26, boolean r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ey2.t0.V6(ey2.t0, java.lang.String, int, int, int, java.util.List, java.util.ArrayList, com.tencent.mm.protobuf.g, boolean, boolean, int, java.lang.Object):void");
    }

    public final ey2.o0 N6(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f257502e;
        if (concurrentHashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.o0(i17, true));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.d(obj);
        return (ey2.o0) obj;
    }

    public final com.tencent.mm.storage.u3 O6(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 35 ? i17 != 39 ? com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_FRIEND_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_NATIVE_DRAMA_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_LBS_FULLSCREEN_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_MACHINE_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_FOLLOW_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_LBS_INT : com.tencent.mm.storage.u3.USERINFO_FINDER_TAB_TIP_FRIEND_INT;
    }

    public final java.util.concurrent.ConcurrentHashMap P6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f257505h).getValue();
    }

    public final int Q6() {
        int i17 = 4;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, 4);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderEntrance");
        boolean z17 = L0 != null;
        if (!R6(r17) && !z17) {
            com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "[getTargetEnterTabType] no autoRefresh... hasEntranceCtrlInfo=" + z17 + " lastExitTabType=" + r17 + " defaultServerTabType=4");
            return r17;
        }
        int c17 = com.tencent.mm.plugin.finder.extension.reddot.ta.f105879a.c("Finder.TlTabStateVM", nk6, "FinderEntrance");
        if (c17 == -100) {
            i17 = r17;
        } else if (c17 != -1) {
            i17 = c17;
        }
        com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "[getTargetEnterTabType] autoRefresh... ret=" + i17 + " hasEntranceCtrlInfo=" + z17 + " lastExitTabType=" + r17 + " defaultServerTabType=4 isAtAppPush=" + N6(i17).f257452l);
        boolean z18 = L0 != null && L0.Y0("FinderEntrance");
        if (!R6(i17) && z18) {
            ey2.o0 N6 = N6(i17);
            N6.f257448h = -1L;
            N6.a(ey2.q0.f257472e);
        }
        return i17;
    }

    public final boolean R6(int i17) {
        return S6(N6(i17));
    }

    public final boolean S6(ey2.o0 cache) {
        kotlin.jvm.internal.o.g(cache, "cache");
        ey2.q0 q0Var = cache.f257450j;
        if (q0Var == ey2.q0.f257472e) {
            return true;
        }
        if (q0Var == ey2.q0.f257471d || q0Var == ey2.q0.f257474g) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - cache.f257448h;
            if (this.f257511q == -1) {
                this.f257511q = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
            }
            if (currentTimeMillis > this.f257511q) {
                cache.a(ey2.q0.f257473f);
                return true;
            }
        } else {
            if (q0Var == ey2.q0.f257475h) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - cache.f257449i;
                if (this.f257511q == -1) {
                    this.f257511q = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
                }
                if (currentTimeMillis2 <= this.f257511q) {
                    return false;
                }
                cache.a(ey2.q0.f257473f);
                return true;
            }
            if (q0Var == ey2.q0.f257473f) {
                return true;
            }
        }
        cache.a(ey2.q0.f257474g);
        return false;
    }

    public final void T6(int i17) {
        ey2.o0 N6 = N6(i17);
        N6.a(ey2.q0.f257471d);
        N6.f257448h = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "[markUnFocusTabType] tabType=" + i17);
    }

    public final void U6() {
        W6(4, ey2.p0.f257464e);
        this.f257502e.clear();
        this.f257503f.clear();
        this.f257504g.clear();
    }

    public final void W6(int i17, ey2.p0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "[storeLastTabType] tabType=" + i17 + " source=" + source);
        if (source == ey2.p0.f257463d) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_TAB_TYPE_RED_DOT_INT_SYNC, -1);
        }
    }

    public final void X6(int i17, int i18) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.U2() && (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) P6().get(java.lang.Integer.valueOf(i18))) != null) {
            com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "updateFirstUnreadFeed fail,source:" + i17 + " tabType=" + i18 + ",feed=" + baseFinderFeed + " exist!");
        }
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
    }
}
