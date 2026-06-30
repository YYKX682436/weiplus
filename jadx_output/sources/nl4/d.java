package nl4;

/* loaded from: classes11.dex */
public final class d implements ll4.d, ll4.c {

    /* renamed from: a, reason: collision with root package name */
    public ll4.a f338196a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f338197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f338198c;

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f338199d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338200e;

    /* renamed from: f, reason: collision with root package name */
    public final mn0.b0 f338201f;

    /* renamed from: g, reason: collision with root package name */
    public final int f338202g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f338203h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f338204i;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        mn0.b0 wi6 = ((v40.q) ((c50.q0) i95.n0.c(c50.q0.class))).wi(context);
        this.f338201f = wi6;
        int hashCode = hashCode();
        this.f338202g = hashCode;
        this.f338203h = "MicroMsg.TingFinderLivePlayerCore@" + hashCode;
        mn0.y yVar = (mn0.y) wi6;
        yVar.K(mn0.d0.A, 21);
        ls5.d dVar = yVar.f329807f;
        if (dVar != null) {
            dVar.f321128h = new nl4.a(this);
        }
        yVar.Q(0);
        yVar.J(new nl4.b(this));
    }

    @Override // ll4.c
    public yz5.l a() {
        return this.f338204i;
    }

    @Override // ll4.d
    public bw5.lp0 b() {
        bw5.lp0 lp0Var = this.f338199d;
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
    }

    @Override // ll4.d
    public long d() {
        return 0L;
    }

    @Override // ll4.d
    public void e(ll4.a aVar) {
        this.f338196a = aVar;
    }

    @Override // ll4.d
    public void f(boolean z17) {
        this.f338198c = true;
        mn0.b0.C(this.f338201f, false, true, false, 4, null);
    }

    @Override // ll4.d
    public java.lang.String g() {
        return "TingFinderLivePlayerCore";
    }

    @Override // ll4.d
    public float h() {
        return 1.0f;
    }

    @Override // ll4.d
    public void i(ll4.b bVar) {
    }

    @Override // ll4.d
    public void j(bw5.kq0 tingPlayerContext) {
        kotlin.jvm.internal.o.g(tingPlayerContext, "tingPlayerContext");
        if (tingPlayerContext.f29494m[1]) {
            bw5.lp0 b17 = tingPlayerContext.b();
            kotlin.jvm.internal.o.f(b17, "getPlayingItem(...)");
            this.f338199d = b17;
            q();
            return;
        }
        ll4.a aVar = this.f338196a;
        if (aVar != null) {
            ll4.a.a(aVar, 12, null, 2, null);
        }
    }

    @Override // ll4.d
    public long k() {
        return 0L;
    }

    @Override // ll4.d
    public bw5.ap0 l() {
        return null;
    }

    @Override // ll4.d
    public long m() {
        return 0L;
    }

    @Override // ll4.d
    public void n(byte[] buffer, java.lang.String listenId, boolean z17, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(listenId, "listenId");
        com.tencent.mars.xlog.Log.i(this.f338203h, "setAudioMixPcmBuffer sr:" + i18 + ", ch:" + i27 + ", format:" + i19 + ", len:" + buffer.length);
    }

    @Override // ll4.d
    public int o() {
        return this.f338202g;
    }

    @Override // ll4.c
    public void p(yz5.l lVar) {
        this.f338204i = lVar;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl4.d.q():void");
    }

    @Override // ll4.d
    public void release() {
        stop();
        ((mn0.y) this.f338201f).w();
    }

    @Override // ll4.d
    public void reset() {
    }

    @Override // ll4.d
    public void resume() {
        this.f338198c = false;
        if (this.f338199d != null) {
            q();
        } else {
            com.tencent.mars.xlog.Log.w(this.f338203h, "resume but playingItem not initialized");
        }
    }

    @Override // ll4.d
    public void seek(long j17) {
    }

    @Override // ll4.c
    public void setSurface(android.view.Surface surface) {
        if (surface != null) {
            ((nn0.c) this.f338201f).v(surface, 0, 0);
        }
    }

    @Override // ll4.d
    public void setVolume(float f17) {
    }

    @Override // ll4.d
    public void stop() {
        com.tencent.mars.xlog.Log.i(this.f338203h, "stop");
        this.f338196a = null;
        this.f338197b = true;
        mn0.b0.C(this.f338201f, true, false, false, 6, null);
    }

    @Override // ll4.c
    public int videoHeight() {
        com.tencent.rtmp.ui.TXCloudVideoView o17 = ((mn0.y) this.f338201f).o();
        if (o17 != null) {
            return o17.getHeight();
        }
        return 0;
    }

    @Override // ll4.c
    public int videoWidth() {
        com.tencent.rtmp.ui.TXCloudVideoView o17 = ((mn0.y) this.f338201f).o();
        if (o17 != null) {
            return o17.getWidth();
        }
        return 0;
    }
}
