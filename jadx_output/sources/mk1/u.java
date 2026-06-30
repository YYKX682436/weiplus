package mk1;

/* loaded from: classes7.dex */
public final class u implements ye1.r, ye1.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f327118a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f327119b;

    /* renamed from: c, reason: collision with root package name */
    public ye1.r f327120c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f327121d;

    public u(java.util.List providers) {
        kotlin.jvm.internal.o.g(providers, "providers");
        this.f327118a = providers;
        this.f327119b = new java.lang.Object();
    }

    @Override // ye1.r
    public void A(ye1.n listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        D("addOnSeekCompleteListener", new mk1.e(listener));
    }

    @Override // ye1.e
    public void B(ye1.m mVar) {
        D("setOnPreparedListener", new mk1.n(mVar));
    }

    @Override // ye1.s
    public void C(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.C(j17);
        }
    }

    public final void D(java.lang.String str, yz5.l lVar) {
        ye1.r E = E(null);
        if (E != null) {
            lVar.invoke(E);
            return;
        }
        synchronized (this.f327119b) {
            if (this.f327121d == null) {
                this.f327121d = new java.util.ArrayList();
            }
            java.util.List list = this.f327121d;
            kotlin.jvm.internal.o.d(list);
            ((java.util.ArrayList) list).add(lVar);
        }
    }

    public final ye1.r E(mk1.b0 b0Var) {
        ye1.r rVar;
        synchronized (this.f327119b) {
            if (b0Var == null) {
                rVar = this.f327120c;
            } else {
                ye1.r rVar2 = this.f327120c;
                if (rVar2 == null) {
                    java.util.Iterator it = this.f327118a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            rVar = null;
                            break;
                        }
                        ye1.r a17 = ((mk1.v) it.next()).a(b0Var);
                        this.f327120c = a17;
                        if (a17 != null) {
                            kotlin.jvm.internal.o.d(a17);
                            java.util.List list = this.f327121d;
                            if (list != null) {
                                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                                while (it6.hasNext()) {
                                    ((yz5.l) it6.next()).invoke(a17);
                                }
                            }
                            java.util.List list2 = this.f327121d;
                            if (list2 != null) {
                                ((java.util.ArrayList) list2).clear();
                            }
                            this.f327121d = null;
                            rVar = this.f327120c;
                        }
                    }
                } else {
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    @Override // ye1.r
    public void a(ye1.m listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        D("addOnPreparedListener", new mk1.d(listener));
    }

    @Override // ye1.e
    public void b(boolean z17) {
        D("setLooping", new mk1.f(z17));
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        D(be1.x0.NAME, new mk1.t(f17, f18));
    }

    @Override // ye1.e
    public void d(ye1.f fVar) {
        D("setOnBufferingUpdateListener", new mk1.h(fVar));
    }

    @Override // ye1.r
    public void e(ye1.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        D("addOnCompletionListener", new mk1.c(listener));
    }

    @Override // ye1.e
    public boolean f(float f17) {
        ye1.r E = E(null);
        if (E != null) {
            return E.f(f17);
        }
        return false;
    }

    @Override // ye1.e
    public void g(ye1.q qVar) {
        D("setOnVideoSizeChangedListener", new mk1.q(qVar));
    }

    @Override // ye1.e
    public int getCurrentPosition() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getCurrentPosition();
        }
        return 0;
    }

    @Override // ye1.e
    public int getDuration() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getDuration();
        }
        return 0;
    }

    @Override // ye1.e
    public int getPlayerType() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getPlayerType();
        }
        return 4;
    }

    @Override // ye1.e
    public int getState() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getState();
        }
        return 0;
    }

    @Override // ye1.e
    public int getVideoHeight() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getVideoHeight();
        }
        return 0;
    }

    @Override // ye1.e
    public int getVideoWidth() {
        ye1.r E = E(null);
        if (E != null) {
            return E.getVideoWidth();
        }
        return 0;
    }

    @Override // ye1.e
    public void h(ye1.n nVar) {
        D("setOnSeekCompleteListener", new mk1.o(nVar));
    }

    @Override // ye1.e
    public void i(ye1.o oVar) {
        D("setOnSubtitleDataListener", new mk1.p(oVar));
    }

    @Override // ye1.e
    public boolean isPlaying() {
        ye1.r E = E(null);
        if (E != null) {
            return E.isPlaying();
        }
        return false;
    }

    @Override // ye1.e
    public void j(boolean z17) {
        ye1.r E = E(null);
        if (E != null) {
            E.j(z17);
        }
    }

    @Override // ye1.e
    public void k(ye1.k kVar) {
        D("setOnHitPreloadListener", new mk1.l(kVar));
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class playerClass) {
        kotlin.jvm.internal.o.g(playerClass, "playerClass");
        ye1.r E = E(null);
        if (E != null) {
            return E.l(playerClass);
        }
        return null;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        mk1.a0 b17;
        ye1.r E;
        if (str == null || (E = E((b17 = mk1.b0.f327095d.b(str)))) == null) {
            return;
        }
        E.x(b17.f327096a, str2, b17.f327092e ? 2 : 0);
    }

    @Override // ye1.e
    public void n(double d17) {
        D("setPreferredPeakBitRate", new mk1.r(d17));
    }

    @Override // ye1.s
    public void o(org.json.JSONObject jSONObject) {
        ye1.r E = E(null);
        if (E != null) {
            E.o(jSONObject);
        }
    }

    @Override // ye1.e
    public void p(ye1.l lVar) {
        D("setOnInfoListener", new mk1.m(lVar));
    }

    @Override // ye1.e
    public void pause() {
        ye1.r E = E(null);
        if (E != null) {
            E.pause();
        }
    }

    @Override // ye1.e
    public void prepareAsync() {
        ye1.r E = E(null);
        if (E != null) {
            E.prepareAsync();
        }
    }

    @Override // ye1.e
    public void q(ye1.i iVar) {
        D("setOnDownstreamChangedListener", new mk1.j(iVar));
    }

    @Override // ye1.e
    public void r(ye1.j jVar) {
        D("setOnErrorListener", new mk1.k(jVar));
    }

    @Override // ye1.e
    public void release() {
        ye1.r E = E(null);
        if (E != null) {
            E.release();
        }
        synchronized (this.f327119b) {
            this.f327120c = null;
        }
    }

    @Override // ye1.e
    public void reset() {
        ye1.r E = E(null);
        if (E != null) {
            E.reset();
        }
    }

    @Override // ye1.e
    public void seekTo(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.seekTo(j17);
        }
    }

    @Override // ye1.s
    public void setAppId(java.lang.String str) {
        ye1.r E = E(null);
        if (E != null) {
            E.setAppId(str);
        }
    }

    @Override // ye1.e
    public void setDataSource(java.lang.String str) {
        mk1.a0 b17;
        ye1.r E;
        if (str == null || (E = E((b17 = mk1.b0.f327095d.b(str)))) == null) {
            return;
        }
        E.y(b17.f327096a, b17.f327092e ? 2 : 0);
    }

    @Override // ye1.e
    public void setMute(boolean z17) {
        D("setMute", new mk1.g(z17));
    }

    @Override // ye1.e
    public void setSurface(android.view.Surface surface) {
        D(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurface, new mk1.s(surface));
    }

    @Override // ye1.e
    public void start() {
        ye1.r E = E(null);
        if (E != null) {
            E.start();
        }
    }

    @Override // ye1.e
    public void stop() {
        ye1.r E = E(null);
        if (E != null) {
            E.stop();
        }
    }

    @Override // ye1.e
    public void t(java.lang.String sourceUrl, java.lang.String str, java.lang.String str2, boolean z17) {
        kotlin.jvm.internal.o.g(sourceUrl, "sourceUrl");
        mk1.w a17 = mk1.b0.f327095d.a(sourceUrl, true);
        java.lang.String str3 = a17.f327122a;
        java.lang.String str4 = a17.f327123b;
        ye1.r E = E(new mk1.z(str3, str4, a17.f327125d, a17.f327126e, a17.f327127f));
        if (E != null) {
            E.t(str4, str, str2, z17);
        }
    }

    @Override // ye1.s
    public void v(long j17) {
        ye1.r E = E(null);
        if (E != null) {
            E.v(j17);
        }
    }

    @Override // ye1.e
    public void w(java.lang.String str) {
        ye1.r E = E(null);
        if (E != null) {
            E.w(str);
        }
    }

    @Override // ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            return;
        }
        ye1.r E = E(new mk1.a0(str, str, "", "", 0L, i17 == 2));
        if (E != null) {
            E.x(str, str2, i17);
        }
    }

    @Override // ye1.e
    public void z(ye1.g gVar) {
        D("setOnCompletionListener", new mk1.i(gVar));
    }
}
