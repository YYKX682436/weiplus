package gk4;

/* loaded from: classes10.dex */
public final class r {
    public static final long C;
    public static final java.lang.String D;
    public static final long E;
    public long A;
    public final jk4.e B;

    /* renamed from: a, reason: collision with root package name */
    public gk4.u f272596a;

    /* renamed from: b, reason: collision with root package name */
    public pk4.u f272597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f272598c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f272599d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f272600e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f272601f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f272602g = "MicroMsg.MultiMediaEffectController@" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public final um5.i0 f272603h;

    /* renamed from: i, reason: collision with root package name */
    public int f272604i;

    /* renamed from: j, reason: collision with root package name */
    public int f272605j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f272606k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f272607l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f272608m;

    /* renamed from: n, reason: collision with root package name */
    public gk4.t f272609n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f272610o;

    /* renamed from: p, reason: collision with root package name */
    public volatile gk4.e f272611p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f272612q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272613r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f272614s;

    /* renamed from: t, reason: collision with root package name */
    public wu5.c f272615t;

    /* renamed from: u, reason: collision with root package name */
    public long f272616u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f272617v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f272618w;

    /* renamed from: x, reason: collision with root package name */
    public volatile long f272619x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.SurfaceTexture f272620y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f272621z;

    static {
        com.tencent.tav.decoder.logger.Logger.setLogProxy(new p05.f2());
        com.tencent.tav.decoder.logger.Logger.setLevel(2);
        xm5.b.f455398a = new p05.g2();
        C = 500L;
        D = "pag/overlap.pag";
        E = 33L;
    }

    public r() {
        um5.i0 i0Var = new um5.i0();
        this.f272603h = i0Var;
        this.f272606k = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f272607l = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f272608m = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f272610o = new java.util.ArrayList();
        this.f272611p = gk4.e.f272542d;
        this.f272616u = -1L;
        this.f272617v = -1L;
        this.f272618w = -1L;
        this.f272619x = -1L;
        this.B = new jk4.e();
        i0Var.j(0, 0);
        i0Var.d();
        i0Var.f429208q = new gk4.d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f A[LOOP:0: B:6:0x0010->B:40:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(gk4.r r7, hk4.a r8) {
        /*
            gk4.t r7 = r7.f272609n
            if (r7 == 0) goto L82
            java.util.ArrayList r7 = r7.f272630a
            if (r7 != 0) goto La
            goto L82
        La:
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        L10:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r7.next()
            gk4.s r2 = (gk4.s) r2
            dk4.a r3 = r2.f272629h
            r4 = 0
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.f234482s
            goto L25
        L24:
            r3 = r4
        L25:
            gk4.s r5 = r8.f281929h
            if (r5 == 0) goto L30
            dk4.a r5 = r5.f272629h
            if (r5 == 0) goto L30
            java.lang.String r5 = r5.f234482s
            goto L31
        L30:
            r5 = r4
        L31:
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 == 0) goto L7b
            dk4.a r3 = r2.f272629h
            if (r3 == 0) goto L42
            long r5 = r3.f234477n
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L43
        L42:
            r3 = r4
        L43:
            gk4.s r5 = r8.f281929h
            if (r5 == 0) goto L52
            dk4.a r5 = r5.f272629h
            if (r5 == 0) goto L52
            long r5 = r5.f234477n
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L53
        L52:
            r5 = r4
        L53:
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 == 0) goto L7b
            dk4.a r2 = r2.f272629h
            if (r2 == 0) goto L64
            long r2 = r2.f234478o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L65
        L64:
            r2 = r4
        L65:
            gk4.s r3 = r8.f281929h
            if (r3 == 0) goto L73
            dk4.a r3 = r3.f272629h
            if (r3 == 0) goto L73
            long r3 = r3.f234478o
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L73:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r4)
            if (r2 == 0) goto L7b
            r2 = 1
            goto L7c
        L7b:
            r2 = r0
        L7c:
            if (r2 == 0) goto L7f
            goto L83
        L7f:
            int r1 = r1 + 1
            goto L10
        L82:
            r1 = -1
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.r.a(gk4.r, hk4.a):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hk4.a b(gk4.s sVar, boolean z17) {
        dk4.a aVar = sVar.f272629h;
        hk4.n nVar = null;
        if (aVar == null) {
            return null;
        }
        int ordinal = sVar.f272622a.ordinal();
        java.lang.String str = this.f272602g;
        if (ordinal == 1) {
            hk4.n nVar2 = new hk4.n();
            nVar2.m(this.f272604i, this.f272605j);
            java.lang.String str2 = nVar2.f281956k;
            com.tencent.mars.xlog.Log.i(str2, "setMediaInfo:" + aVar);
            nVar2.f281958m = aVar;
            java.lang.String path = aVar.f234483t;
            kotlin.jvm.internal.o.f(path, "path");
            java.lang.String url = aVar.f234484u;
            kotlin.jvm.internal.o.f(url, "url");
            java.lang.String str3 = aVar.f234467d;
            java.lang.String str4 = aVar.f234466c;
            com.tencent.mars.xlog.Log.i(str2, "setImagePath:" + path + ", url:" + url);
            nVar2.f281959n = path;
            nVar2.f281960o = url;
            nVar2.f281961p = str3;
            nVar2.f281962q = str4;
            nVar = nVar2;
        } else if (ordinal != 2) {
            com.tencent.mars.xlog.Log.e(str, "unknown track type!");
        } else {
            hk4.x xVar = new hk4.x();
            int i17 = this.f272604i;
            int i18 = this.f272605j;
            xVar.f281922a = i17;
            xVar.f281923b = i18;
            java.lang.String str5 = xVar.f281985k;
            com.tencent.mars.xlog.Log.i(str5, "setMediaInfo:" + aVar);
            kk4.v vVar = xVar.f281986l;
            vVar.B(aVar);
            xVar.f281992r = aVar.f234470g;
            if (aVar instanceof jk4.f) {
                float f17 = ((jk4.f) aVar).f300155y;
                if (f17 > 0.0f) {
                    com.tencent.mars.xlog.Log.i(str5, "setPlayRate:" + f17);
                    kk4.c cVar = vVar.f308577b;
                    if (cVar != null) {
                        cVar.setPlaySpeedRatio(f17);
                    }
                }
            }
            xVar.j(aVar.f234475l);
            nVar = xVar;
        }
        if (nVar != null) {
            nVar.f281929h = sVar;
            long j17 = sVar.f272625d;
            if (j17 >= 0) {
                long j18 = sVar.f272626e;
                if (j18 > 0) {
                    nVar.l(j17, j18);
                }
            }
            long j19 = sVar.f272623b;
            long j27 = sVar.f272624c;
            nVar.f281924c = j19;
            nVar.f281925d = j27;
            nVar.j(aVar.f234475l);
            nVar.k(this.f272613r);
            if (z17) {
                nVar.f();
            }
            com.tencent.mars.xlog.Log.i(str, "setupPlayer:" + nVar);
            nVar.f281926e = new gk4.l(this);
            nVar.f281927f = new gk4.m(this);
            nVar.f281928g = gk4.n.f272591d;
        }
        return nVar;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i(this.f272602g, "pause, current status:" + this.f272611p + ", playingPlayers.size:" + this.f272606k.size());
        if (this.f272606k.isEmpty()) {
            return;
        }
        ((hk4.a) this.f272606k.getFirst()).e();
        this.f272611p = gk4.e.f272544f;
        gk4.u uVar = this.f272596a;
        if (uVar != null) {
            uVar.onPause();
        }
        m();
    }

    public final void d(int i17) {
        java.lang.Object obj;
        dk4.a aVar;
        gk4.t tVar = this.f272609n;
        if (tVar == null) {
            return;
        }
        java.util.ArrayList arrayList = tVar.f272630a;
        if (i17 >= arrayList.size()) {
            return;
        }
        java.lang.Object obj2 = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        gk4.s sVar = (gk4.s) obj2;
        dk4.a aVar2 = sVar.f272629h;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f272608m;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gk4.s sVar2 = ((hk4.a) obj).f281929h;
            if (kotlin.jvm.internal.o.b((sVar2 == null || (aVar = sVar2.f272629h) == null) ? null : aVar.f234482s, aVar2 != null ? aVar2.f234482s : null)) {
                break;
            }
        }
        hk4.a aVar3 = (hk4.a) obj;
        boolean z17 = true;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.f272607l;
        if (aVar3 != null) {
            concurrentLinkedDeque.remove(aVar3);
            concurrentLinkedDeque2.add(aVar3);
        } else {
            hk4.a b17 = b(sVar, true);
            if (b17 == null) {
                return;
            }
            concurrentLinkedDeque2.add(b17);
            z17 = false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadMedia, pendingPlayers.size:");
        sb6.append(concurrentLinkedDeque2.size());
        sb6.append(", nextMediaIndex:");
        sb6.append(i17);
        sb6.append(", mediaId:");
        sb6.append(aVar2 != null ? aVar2.f234482s : null);
        sb6.append(", fromFreePlayer:");
        sb6.append(z17);
        sb6.append(", freePlayers.size:");
        sb6.append(concurrentLinkedDeque.size());
        com.tencent.mars.xlog.Log.i(this.f272602g, sb6.toString());
    }

    public final synchronized void e() {
        for (hk4.a aVar : this.f272606k) {
            aVar.o();
            aVar.g();
            this.f272603h.k(aVar.f281930i);
        }
        java.util.Iterator it = this.f272608m.iterator();
        while (it.hasNext()) {
            ((hk4.a) it.next()).g();
        }
        java.util.Iterator it6 = this.f272607l.iterator();
        while (it6.hasNext()) {
            ((hk4.a) it6.next()).g();
        }
        this.f272606k.clear();
        this.f272607l.clear();
        this.f272608m.clear();
    }

    public final void f(long j17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str = this.f272602g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekTo:");
        sb6.append(j17);
        sb6.append(", renderPts:");
        sb6.append(this.f272612q);
        sb6.append(", playingPlayers.size:");
        sb6.append(this.f272606k.size());
        sb6.append(", status:");
        sb6.append(this.f272611p);
        sb6.append(", trackList.size:");
        gk4.t tVar = this.f272609n;
        java.lang.Object obj = null;
        sb6.append((tVar == null || (arrayList2 = tVar.f272630a) == null) ? null : java.lang.Integer.valueOf(arrayList2.size()));
        com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        gk4.t tVar2 = this.f272609n;
        if (tVar2 == null || (arrayList = tVar2.f272630a) == null) {
            return;
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            java.lang.Object previous = listIterator.previous();
            gk4.s sVar = (gk4.s) previous;
            if (j17 <= sVar.f272624c && sVar.f272623b <= j17) {
                obj = previous;
                break;
            }
        }
        gk4.s sVar2 = (gk4.s) obj;
        if (sVar2 == null) {
            return;
        }
        long j18 = (j17 - sVar2.f272623b) + sVar2.f272625d;
        com.tencent.mars.xlog.Log.i(this.f272602g, "found seek target track:" + sVar2 + ", trackSeekTime:" + j18 + ", trackStartTimeMs:" + sVar2.f272625d);
        this.f272619x = j17;
        g(sVar2, j18);
    }

    public final void g(gk4.s sVar, long j17) {
        m();
        hk4.a aVar = (hk4.a) kz5.n0.Y(this.f272606k);
        this.f272611p = gk4.e.f272546h;
        if (aVar == null || !kotlin.jvm.internal.o.b(aVar.f281929h, sVar)) {
            e();
            hk4.a b17 = b(sVar, true);
            if (b17 == null) {
                return;
            }
            b17.n();
            dk4.a aVar2 = sVar.f272629h;
            if ((aVar2 == null || aVar2.f234476m) ? false : true) {
                b17.i(j17, null);
            }
            this.f272606k.add(b17);
            java.lang.String str = this.f272602g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekTo create new player, trackSeekTime:");
            sb6.append(j17);
            sb6.append(", playingPlayers.size:");
            sb6.append(this.f272606k.size());
            sb6.append(", defaultVideo:");
            dk4.a aVar3 = sVar.f272629h;
            sb6.append(aVar3 != null ? java.lang.Boolean.valueOf(aVar3.f234476m) : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            return;
        }
        java.lang.String str2 = this.f272602g;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("seekTo locate to first playing player, trackSeekTime:");
        sb7.append(j17);
        sb7.append(", isStarted:");
        sb7.append(aVar.c());
        sb7.append(", isPlaying:");
        sb7.append(aVar.a());
        sb7.append(", defaultVideo:");
        dk4.a aVar4 = sVar.f272629h;
        sb7.append(aVar4 != null ? java.lang.Boolean.valueOf(aVar4.f234476m) : null);
        com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        dk4.a aVar5 = sVar.f272629h;
        if ((aVar5 == null || aVar5.f234476m) ? false : true) {
            aVar.i(j17, new gk4.j(this, j17, aVar));
        } else {
            this.f272611p = gk4.e.f272543e;
            l();
        }
        if (aVar.c()) {
            return;
        }
        this.f272611p = gk4.e.f272543e;
        if (aVar.b()) {
            aVar.h();
        } else {
            aVar.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk4.r.h(java.util.List, boolean):void");
    }

    public final void i(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f272602g, "setSize:[" + i17 + ',' + i18 + ']');
        this.f272603h.j(i17, i18);
        this.f272604i = i17;
        this.f272605j = i18;
        java.util.Iterator it = this.f272606k.iterator();
        while (it.hasNext()) {
            ((hk4.a) it.next()).m(i17, i18);
        }
        java.util.Iterator it6 = this.f272607l.iterator();
        while (it6.hasNext()) {
            ((hk4.a) it6.next()).m(i17, i18);
        }
    }

    public final void j(gk4.s sVar, gk4.s sVar2) {
        um5.i0 i0Var = this.f272603h;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = i0Var.f429193b;
        rm5.n nVar = sVar.f272628g;
        if (nVar.a()) {
            if (nVar.f397530b == null) {
                boolean j17 = com.tencent.mm.vfs.w6.j(nVar.f397529a);
                uq5.k kVar = uq5.k.PAGTransitionEffect;
                if (j17) {
                    nVar.f397530b = effectManager.i(kVar, nVar.f397529a);
                } else {
                    com.tencent.mm.xeffect.effect.EffectManager effectManager2 = i0Var.f429193b;
                    android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                    nVar.f397530b = effectManager2.h(kVar, assets, D);
                }
            }
            long j18 = sVar.f272624c;
            long j19 = sVar2.f272628g.f397531c + j18;
            if (j18 > 0 && j19 > 0) {
                uq5.y yVar = nVar.f397530b;
                if (yVar != null) {
                    yVar.b(j18, j19);
                }
                effectManager.c(nVar.f397530b);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set track transition time range:[");
            sb6.append(j18);
            sb6.append(',');
            sb6.append(j19);
            sb6.append("], effect:");
            uq5.y yVar2 = nVar.f397530b;
            sb6.append(yVar2 != null ? java.lang.Long.valueOf(yVar2.f430267a) : null);
            com.tencent.mars.xlog.Log.i(this.f272602g, sb6.toString());
        }
    }

    public final void k() {
        gk4.u uVar;
        com.tencent.mars.xlog.Log.i(this.f272602g, "start, current status:" + this.f272611p + ", playingPlayers.size:" + this.f272606k.size() + ", pendingPlayers.size:" + this.f272607l.size());
        if (this.f272610o.isEmpty()) {
            com.tencent.mars.xlog.Log.e(this.f272602g, "start ignore not set mediaList");
            return;
        }
        gk4.e eVar = this.f272611p;
        gk4.e eVar2 = gk4.e.f272543e;
        if (eVar != eVar2) {
            boolean z17 = !this.f272606k.isEmpty();
            if (this.f272606k.isEmpty()) {
                this.f272612q = 0L;
                if (this.f272607l.isEmpty()) {
                    d(0);
                }
                this.f272606k.add((hk4.a) this.f272607l.removeFirst());
            }
            if (this.f272606k.isEmpty()) {
                com.tencent.mars.xlog.Log.e(this.f272602g, "start error playingPlayers is empty");
            }
            this.f272611p = eVar2;
            ((hk4.a) kz5.n0.W(this.f272606k)).n();
            if (z17 && (uVar = this.f272596a) != null) {
                uVar.onResume();
            }
            com.tencent.mars.xlog.Log.i(this.f272602g, "start finished, playingPlayers.size:" + this.f272606k.size());
            if (this.f272617v > 0) {
                com.tencent.mars.xlog.Log.i(this.f272602g, "start finished seekTo playRange start:" + this.f272617v);
                f(this.f272617v);
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.A = android.os.SystemClock.elapsedRealtime();
            this.f272621z = false;
        }
        jk4.e eVar3 = this.B;
        eVar3.getClass();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        eVar3.f300151b = android.os.SystemClock.elapsedRealtime();
    }

    public final synchronized void l() {
        com.tencent.mars.xlog.Log.i(this.f272602g, "startProgressUpdate " + this.f272611p);
        if (this.f272615t != null) {
            return;
        }
        gk4.o oVar = new gk4.o(this);
        if (this.f272611p == gk4.e.f272544f) {
            oVar.run();
        } else {
            this.f272615t = ((ku5.t0) ku5.t0.f312615d).d(oVar, 0L, E);
        }
        this.f272616u = -1L;
        com.tencent.mars.xlog.Log.i(this.f272602g, "do startProgressUpdate");
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i(this.f272602g, "stopProgressUpdate");
        wu5.c cVar = this.f272615t;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f272615t = null;
    }
}
