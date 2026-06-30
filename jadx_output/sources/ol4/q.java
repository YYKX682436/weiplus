package ol4;

/* loaded from: classes14.dex */
public final class q implements ll4.d, ll4.c {
    public final kl4.h A;
    public final ol4.e B;
    public final jz5.g C;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f346179a;

    /* renamed from: b, reason: collision with root package name */
    public final kk4.c f346180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346181c;

    /* renamed from: d, reason: collision with root package name */
    public ll4.a f346182d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f346183e;

    /* renamed from: f, reason: collision with root package name */
    public float f346184f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f346185g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f346186h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f346187i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f346188j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f346189k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f346190l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f346191m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f346192n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f346193o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f346194p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f346195q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f346196r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f346197s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f346198t;

    /* renamed from: u, reason: collision with root package name */
    public pl4.k f346199u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts f346200v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid f346201w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance f346202x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioGainProcess f346203y;

    /* renamed from: z, reason: collision with root package name */
    public ll4.b f346204z;

    public q(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f346179a = jz5.h.b(ol4.p.f346178d);
        int hashCode = hashCode();
        this.f346181c = hashCode;
        this.f346184f = 1.0f;
        java.lang.String str = "MicroMsg.TingTPPlayerCore@" + hashCode;
        this.f346197s = str;
        i95.n0.c(df0.s.class);
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        com.tencent.mars.xlog.Log.i(str, "mainProcHistoryPath:" + com.tencent.mm.modelcdntran.s1.cj().f71049m);
        kk4.c wi6 = ((cf0.q) ((df0.q) i95.n0.c(df0.q.class))).wi(context);
        this.f346180b = wi6;
        kk4.f0 f0Var = (kk4.f0) wi6;
        f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(146, true));
        f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(161, true));
        int optInt = ml4.b.f328408b.optInt("errorRetry", 3);
        if (optInt >= 0) {
            urgen.ur_0025.UR_29AB.UR_FA75(optInt);
        }
        int optInt2 = ml4.b.f328408b.optInt("bufferTimeOutMs", 0);
        if (optInt2 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(107, optInt2));
        }
        int optInt3 = ml4.b.f328408b.optInt("prepareTimeOutMs", 0);
        if (optInt3 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(128, optInt3));
        }
        int optInt4 = ml4.b.f328408b.optInt("preloadDurationMs", 500);
        if (optInt4 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(103, optInt4));
        }
        int optInt5 = ml4.b.f328408b.optInt("minBufferTimeMs", 4000);
        if (optInt5 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(103, optInt5));
        }
        int optInt6 = ml4.b.f328408b.optInt("bufferMinDurationMs", com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_ILLEGAL);
        if (optInt6 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, optInt6));
        }
        int optInt7 = ml4.b.f328408b.optInt("tcpRetryCount", 0);
        if (optInt7 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(109, optInt7));
        }
        int optInt8 = ml4.b.f328408b.optInt("tcpTimeOutMs", 0);
        if (optInt8 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(108, optInt8));
        }
        int optInt9 = ml4.b.f328408b.optInt("minBufferingTimeMs", 500);
        if (optInt9 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(105, optInt9));
        }
        int optInt10 = ml4.b.f328408b.optInt("maxAnalyzeDurationMs", 1000);
        if (optInt10 > 0) {
            f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(129, optInt10));
        }
        f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(502, 0L));
        f0Var.setOnSeekCompleteListener(new ol4.a(this));
        f0Var.f308541q = new ol4.b(this);
        f0Var.setOnInfoListener(new ol4.c(this));
        this.A = new kl4.h(0, 1, null);
        this.B = new ol4.e(this);
        this.C = jz5.h.b(new ol4.d(this));
    }

    public static final void q(ol4.q qVar) {
        qVar.getClass();
        ol4.n nVar = new ol4.n(qVar);
        wu5.c cVar = qVar.f346186h;
        if (cVar != null) {
            cVar.cancel(false);
        }
        qVar.f346186h = ((ku5.t0) ku5.t0.f312615d).d(nVar, 500L, 400L);
    }

    @Override // ll4.c
    public yz5.l a() {
        return this.f346198t;
    }

    @Override // ll4.d
    public bw5.lp0 b() {
        bw5.lp0 lp0Var = this.f346183e;
        if (lp0Var == null) {
            bw5.lp0 lp0Var2 = bw5.lp0.f29890v;
            kotlin.jvm.internal.o.f(lp0Var2, "getDefaultInstance(...)");
            return lp0Var2;
        }
        if (lp0Var != null) {
            return lp0Var;
        }
        kotlin.jvm.internal.o.o("mPlayingItem");
        throw null;
    }

    @Override // ll4.d
    public void c(float f17) {
        this.f346184f = f17;
        ((kk4.f0) this.f346180b).setPlaySpeedRatio(f17);
    }

    @Override // ll4.d
    public long d() {
        if (!this.f346190l || this.f346188j || this.f346193o || this.f346192n) {
            return 0L;
        }
        kk4.c cVar = this.f346180b;
        long durationMs = ((kk4.f0) cVar).getDurationMs();
        if (durationMs == 0) {
            return 0L;
        }
        return (((kk4.f0) cVar).getPlayerBufferedDurationMs() * 100) / durationMs;
    }

    @Override // ll4.d
    public void e(ll4.a aVar) {
        com.tencent.mars.xlog.Log.i(this.f346197s, "set callback " + aVar);
        this.f346182d = aVar;
    }

    @Override // ll4.d
    public void f(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f346183e;
        if (lp0Var == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f27457i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f346183e;
        if (lp0Var2 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f346183e;
        if (lp0Var3 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().getTitle());
        java.lang.String str = "pause, " + sb6.toString();
        java.lang.String str2 = this.f346197s;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.f346192n) {
            com.tencent.mars.xlog.Log.i(str2, "has call release, no need pause");
        } else {
            v(new ol4.f(this));
        }
    }

    @Override // ll4.d
    public java.lang.String g() {
        return "TingTPPlayerCore";
    }

    @Override // ll4.d
    public float h() {
        return this.f346184f;
    }

    @Override // ll4.d
    public void i(ll4.b bVar) {
        this.f346204z = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0089  */
    @Override // ll4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(bw5.kq0 r18) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol4.q.j(bw5.kq0):void");
    }

    @Override // ll4.d
    public long k() {
        return ((kk4.f0) this.f346180b).getDurationMs();
    }

    @Override // ll4.d
    public bw5.ap0 l() {
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance tingTPAudioEnhance = this.f346202x;
        if (tingTPAudioEnhance != null) {
            return tingTPAudioEnhance.getAuditoryEnhanceEffectArgs();
        }
        return null;
    }

    @Override // ll4.d
    public long m() {
        return ((kk4.f0) this.f346180b).getCurrentPositionMs();
    }

    @Override // ll4.d
    public void n(byte[] buffer, java.lang.String listenId, boolean z17, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(listenId, "listenId");
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts tingTPAudioMixTts = this.f346200v;
        if (tingTPAudioMixTts != null) {
            tingTPAudioMixTts.setAudioMixPcmBuffer(buffer, listenId, z17, i17, i18, i19, i27);
        }
    }

    @Override // ll4.d
    public int o() {
        return this.f346181c;
    }

    @Override // ll4.c
    public void p(yz5.l lVar) {
        this.f346198t = lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnPreparedCallback: callback=");
        sb6.append(lVar != null);
        sb6.append(", hasPrepared=");
        sb6.append(this.f346190l);
        sb6.append(", willImmediatelyInvoke=");
        sb6.append(this.f346190l && lVar != null);
        com.tencent.mars.xlog.Log.i(this.f346197s, sb6.toString());
        if (!this.f346190l || lVar == null) {
            return;
        }
        lVar.invoke(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r4) {
        /*
            r3 = this;
            bw5.lp0 r0 = r3.f346183e
            if (r0 == 0) goto L68
            boolean r0 = rk4.j5.g(r0)
            if (r0 == 0) goto L23
            pl4.k r0 = r3.f346199u
            r1 = 0
            if (r0 == 0) goto L21
            r2 = 1
            java.lang.String r0 = r0.f356719c
            if (r0 == 0) goto L1d
            boolean r0 = r26.n0.N(r0)
            r0 = r0 ^ r2
            if (r0 != r2) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != r2) goto L21
            r1 = r2
        L21:
            if (r1 == 0) goto L25
        L23:
            if (r4 == 0) goto L67
        L25:
            pl4.k r4 = r3.f346199u
            if (r4 == 0) goto L67
            dn.o r0 = r4.f356735s
            java.lang.String r1 = r0.field_fullpath
            boolean r1 = com.tencent.mm.vfs.w6.j(r1)
            if (r1 == 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "deleteCachedFile fileCacheId:"
            r1.<init>(r2)
            java.lang.String r4 = r4.f356718b
            r1.append(r4)
            java.lang.String r4 = ", path "
            r1.append(r4)
            java.lang.String r4 = r0.field_fullpath
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MicroMsg.TingTPResourceLoader"
            com.tencent.mars.xlog.Log.i(r1, r4)
            java.lang.String r4 = r0.field_fullpath
            com.tencent.mm.vfs.w6.h(r4)
            java.lang.String r4 = r0.field_fullpath
            java.lang.String r0 = "field_fullpath"
            kotlin.jvm.internal.o.f(r4, r0)
            java.lang.String r0 = ".finish"
            java.lang.String r4 = r4.concat(r0)
            com.tencent.mm.vfs.w6.h(r4)
        L67:
            return
        L68:
            java.lang.String r4 = "mPlayingItem"
            kotlin.jvm.internal.o.o(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ol4.q.r(boolean):void");
    }

    @Override // ll4.d
    public void release() {
        java.lang.String str = this.f346197s;
        com.tencent.mars.xlog.Log.i(str, "release");
        if (this.f346192n) {
            com.tencent.mars.xlog.Log.i(str, "has call release");
            return;
        }
        this.f346182d = null;
        this.f346192n = true;
        v(new ol4.g(this));
    }

    @Override // ll4.d
    public void reset() {
        java.lang.String str = this.f346197s;
        com.tencent.mars.xlog.Log.i(str, "reset");
        if (this.f346193o || this.f346192n) {
            com.tencent.mars.xlog.Log.i(str, "has call reset, reset: " + this.f346193o + ", release: " + this.f346192n);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f346194p = false;
        this.f346190l = false;
        this.f346191m = false;
        this.f346188j = false;
        this.f346185g = false;
        this.f346189k = false;
        this.f346193o = true;
        ((kk4.f0) this.f346180b).reset();
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioEnhance tingTPAudioEnhance = this.f346202x;
        if (tingTPAudioEnhance != null) {
            tingTPAudioEnhance.release();
        }
        com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPHearingAid tingTPHearingAid = this.f346201w;
        if (tingTPHearingAid != null) {
            tingTPHearingAid.release();
        }
        com.tencent.mars.xlog.Log.i(str, "call reset cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // ll4.d
    public void resume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f346183e;
        if (lp0Var == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f27457i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f346183e;
        if (lp0Var2 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f346183e;
        if (lp0Var3 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().getTitle());
        com.tencent.mars.xlog.Log.i(this.f346197s, "resume, " + sb6.toString());
        if (this.f346190l) {
            v(new ol4.h(this));
        }
    }

    public final boolean s() {
        return ((java.lang.Boolean) ((jz5.n) this.C).getValue()).booleanValue();
    }

    @Override // ll4.d
    public void seek(long j17) {
        com.tencent.mars.xlog.Log.i(this.f346197s, "seek " + j17);
        this.f346196r = true;
        ll4.a aVar = this.f346182d;
        if (aVar != null) {
            ll4.a.a(aVar, 9, null, 2, null);
        }
        ((kk4.f0) this.f346180b).seekTo((int) j17, 3);
    }

    @Override // ll4.c
    public void setSurface(android.view.Surface surface) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface: surface=");
        sb6.append(surface != null);
        sb6.append(", videoWidth=");
        kk4.c cVar = this.f346180b;
        sb6.append(((kk4.f0) cVar).getVideoWidth());
        sb6.append(", videoHeight=");
        sb6.append(((kk4.f0) cVar).getVideoHeight());
        sb6.append(", hasPrepared=");
        sb6.append(this.f346190l);
        com.tencent.mars.xlog.Log.i(this.f346197s, sb6.toString());
        ((kk4.f0) cVar).setSurface(surface);
    }

    @Override // ll4.d
    public void setVolume(float f17) {
        ((kk4.f0) this.f346180b).setAudioGainRatio(f17);
    }

    @Override // ll4.d
    public void stop() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = this.f346183e;
        if (lp0Var == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f27457i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = this.f346183e;
        if (lp0Var2 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = this.f346183e;
        if (lp0Var3 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().getTitle());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f346197s;
        com.tencent.mars.xlog.Log.i(str, "stop, " + sb7);
        this.f346182d = null;
        if (!this.f346188j && !this.f346192n) {
            this.f346188j = true;
            v(new ol4.o(this, sb7));
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "has call stop: " + this.f346188j + ", release: " + this.f346192n + ", " + sb7);
    }

    public final boolean t() {
        boolean z17;
        if (this.f346203y != null) {
            return true;
        }
        if (u()) {
            bw5.lp0 lp0Var = this.f346183e;
            if (lp0Var == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            bw5.fq0 c17 = lp0Var.c();
            boolean z18 = s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
            java.lang.String str = c17.H[9] ? c17.f27459n : "";
            bw5.lp0 lp0Var2 = this.f346183e;
            if (lp0Var2 == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            bw5.xa0 k17 = lp0Var2.d().k();
            bw5.ta0 ta0Var = k17.S[22] ? k17.B : new bw5.ta0();
            java.lang.String str2 = ta0Var.f33343v[8] ? ta0Var.f33335n : "";
            bw5.lp0 lp0Var3 = this.f346183e;
            if (lp0Var3 == null) {
                kotlin.jvm.internal.o.o("mPlayingItem");
                throw null;
            }
            if (!lp0Var3.e().f27963s) {
                if (str == null || str.length() == 0) {
                    if (str2 == null || str2.length() == 0) {
                        z17 = false;
                        if (!c17.f27469x || c17.f27465t || z18 || z17) {
                            return true;
                        }
                    }
                }
            }
            z17 = true;
            return !c17.f27469x ? true : true;
        }
        if (this.f346201w != null || this.f346200v != null || this.f346202x != null) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        bw5.lp0 lp0Var = this.f346183e;
        if (lp0Var != null) {
            return lp0Var.c().F && this.f346204z != null;
        }
        kotlin.jvm.internal.o.o("mPlayingItem");
        throw null;
    }

    public final void v(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        try {
            block.invoke();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(this.f346197s, "safeCall fail:" + th6.getMessage());
        }
    }

    @Override // ll4.c
    public int videoHeight() {
        return ((kk4.f0) this.f346180b).getVideoHeight();
    }

    @Override // ll4.c
    public int videoWidth() {
        return ((kk4.f0) this.f346180b).getVideoWidth();
    }
}
