package ll;

/* loaded from: classes13.dex */
public class h extends ll.g {

    /* renamed from: J, reason: collision with root package name */
    public pl.a f319107J;
    public final java.lang.Object K;

    public h(ol.h hVar, ql.c cVar) {
        super(hVar, cVar);
        this.K = new java.lang.Object();
    }

    @Override // ll.g
    public void C(hl.d dVar) {
        kl.k kVar = this.f319084e;
        if (kVar != null) {
            kVar.d();
        }
        B(dVar);
        dVar.a();
    }

    @Override // ll.g
    public void D(hl.d dVar, java.nio.ByteBuffer byteBuffer, int i17) {
        E(dVar, byteBuffer, i17);
    }

    @Override // ll.d, ll.p
    public void a(int i17) {
        super.a(i17);
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(aVar.f356564j)};
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmBasePlayComponent", "seek startPos:%d", objArr);
                aVar.f356564j = i17;
            }
        }
    }

    @Override // ll.g, ll.p
    public void b() {
        super.b();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "releasePlayComponent", null);
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                aVar.e();
                aVar.f356563i = null;
                aVar.f356562h = null;
                aVar.f356556b = null;
                aVar.f356557c = 0;
                aVar.f356558d = 0;
                this.f319107J = null;
            }
        }
    }

    @Override // ll.d, ll.p
    public void c(float f17, float f18) {
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                aVar.i(f17, f18);
            }
        }
    }

    @Override // ll.d, ll.p
    public void d() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "pauseOnBackground", null);
        p(5);
        this.f319090k.set(true);
        this.f319092m.set(false);
        k();
    }

    @Override // ll.d, ll.p
    public long getCurrentPosition() {
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar == null) {
                return -1L;
            }
            return aVar.a();
        }
    }

    @Override // ll.d
    public void o() {
    }

    @Override // ll.d, ll.p
    public void pause() {
        super.pause();
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    @Override // ll.d
    public void r() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playAfter", null);
        pl.a aVar = this.f319107J;
        if (aVar != null) {
            aVar.d();
            if (!(this.f319107J instanceof pl.b)) {
                return;
            }
            do {
                atomicBoolean = this.f319089j;
                boolean z17 = atomicBoolean.get();
                y();
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f319090k;
                if (atomicBoolean2.get()) {
                    return;
                }
                if (z17) {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "need resume if not stop", null);
                    this.f319107J.g();
                }
                if (atomicBoolean2.get()) {
                    return;
                }
            } while (atomicBoolean.get());
        }
    }

    @Override // ll.d
    public void s() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playBefore", null);
        synchronized (this.K) {
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    @Override // ll.d
    public void t(hl.e eVar) {
        if (f().f282022e) {
            this.f319094o = 44100;
            this.f319095p = 2;
        } else {
            this.f319094o = eVar.f282034b;
            this.f319095p = eVar.f282035c;
        }
        byte[] bArr = eVar.f282038f;
        if (!this.f319087h.get()) {
            if (this.f319107J == null) {
                hl.d f17 = f();
                if (!f17.f282019b || f17.f282021d > 2000) {
                    this.f319107J = new pl.c(this.f319094o, this.f319095p, f17, this);
                } else {
                    this.f319107J = new pl.b(this.f319094o, this.f319095p, f17, this);
                }
                this.f319107J.f356561g = this.f319082c.f333848m;
                this.f319107J.i((float) this.f319082c.f333847l, (float) this.f319082c.f333847l);
            }
            pl.a aVar = this.f319107J;
            if (aVar != null) {
                aVar.c(bArr);
            }
        }
        if (eVar.f282039g) {
            il.h.a().c(eVar);
        }
    }
}
