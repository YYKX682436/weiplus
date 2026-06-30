package w36;

/* loaded from: classes16.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f442804a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.m f442805b;

    /* renamed from: c, reason: collision with root package name */
    public final w36.j f442806c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f442807d;

    /* renamed from: e, reason: collision with root package name */
    public int f442808e;

    /* renamed from: f, reason: collision with root package name */
    public long f442809f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442810g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f442811h;

    /* renamed from: i, reason: collision with root package name */
    public final x36.k f442812i = new x36.k();

    /* renamed from: j, reason: collision with root package name */
    public final x36.k f442813j = new x36.k();

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f442814k;

    /* renamed from: l, reason: collision with root package name */
    public final x36.i f442815l;

    public k(boolean z17, x36.m mVar, w36.j jVar) {
        if (mVar == null) {
            throw new java.lang.NullPointerException("source == null");
        }
        if (jVar == null) {
            throw new java.lang.NullPointerException("frameCallback == null");
        }
        this.f442804a = z17;
        this.f442805b = mVar;
        this.f442806c = jVar;
        this.f442814k = z17 ? null : new byte[4];
        this.f442815l = z17 ? null : new x36.i();
    }

    public final void a() {
        java.lang.String str;
        short s17;
        w36.g gVar;
        long j17 = this.f442809f;
        if (j17 > 0) {
            this.f442805b.k1(this.f442812i, j17);
            if (!this.f442804a) {
                this.f442812i.j(this.f442815l);
                this.f442815l.a(0L);
                w36.i.b(this.f442815l, this.f442814k);
                this.f442815l.close();
            }
        }
        switch (this.f442808e) {
            case 8:
                x36.k kVar = this.f442812i;
                long j18 = kVar.f451694e;
                if (j18 == 1) {
                    throw new java.net.ProtocolException("Malformed close payload length of 1.");
                }
                if (j18 != 0) {
                    s17 = kVar.readShort();
                    str = this.f442812i.q();
                    java.lang.String a17 = w36.i.a(s17);
                    if (a17 != null) {
                        throw new java.net.ProtocolException(a17);
                    }
                } else {
                    str = "";
                    s17 = 1005;
                }
                w36.h hVar = (w36.h) this.f442806c;
                if (s17 == -1) {
                    hVar.getClass();
                    throw new java.lang.IllegalArgumentException();
                }
                synchronized (hVar) {
                    if (hVar.f442799q != -1) {
                        throw new java.lang.IllegalStateException("already closed");
                    }
                    hVar.f442799q = s17;
                    hVar.f442800r = str;
                    gVar = null;
                    if (hVar.f442797o && hVar.f442795m.isEmpty()) {
                        w36.g gVar2 = hVar.f442793k;
                        hVar.f442793k = null;
                        java.util.concurrent.ScheduledFuture scheduledFuture = hVar.f442798p;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) hVar.f442792j).shutdown();
                        gVar = gVar2;
                    }
                }
                try {
                    hVar.f442784b.getClass();
                    if (gVar != null) {
                        hVar.f442784b.a(hVar, s17, str);
                    }
                    m36.e.c(gVar);
                    this.f442807d = true;
                    return;
                } catch (java.lang.Throwable th6) {
                    m36.e.c(gVar);
                    throw th6;
                }
            case 9:
                w36.j jVar = this.f442806c;
                x36.o l17 = this.f442812i.l();
                w36.h hVar2 = (w36.h) jVar;
                synchronized (hVar2) {
                    if (!hVar2.f442801s && (!hVar2.f442797o || !hVar2.f442795m.isEmpty())) {
                        hVar2.f442794l.add(l17);
                        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = hVar2.f442792j;
                        if (scheduledExecutorService != null) {
                            ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(hVar2.f442789g);
                        }
                        return;
                    }
                    return;
                }
            case 10:
                w36.j jVar2 = this.f442806c;
                this.f442812i.l();
                w36.h hVar3 = (w36.h) jVar2;
                synchronized (hVar3) {
                    hVar3.f442803u = false;
                }
                return;
            default:
                throw new java.net.ProtocolException("Unknown control opcode: " + java.lang.Integer.toHexString(this.f442808e));
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        if (this.f442807d) {
            throw new java.io.IOException("closed");
        }
        x36.m mVar = this.f442805b;
        long h17 = mVar.h().h();
        mVar.h().b();
        try {
            int readByte = mVar.readByte() & 255;
            mVar.h().g(h17, java.util.concurrent.TimeUnit.NANOSECONDS);
            this.f442808e = readByte & 15;
            boolean z17 = (readByte & 128) != 0;
            this.f442810g = z17;
            boolean z18 = (readByte & 8) != 0;
            this.f442811h = z18;
            if (z18 && !z17) {
                throw new java.net.ProtocolException("Control frames must be final.");
            }
            boolean z19 = (readByte & 64) != 0;
            boolean z27 = (readByte & 32) != 0;
            boolean z28 = (readByte & 16) != 0;
            if (z19 || z27 || z28) {
                throw new java.net.ProtocolException("Reserved flags are unsupported.");
            }
            int readByte2 = mVar.readByte() & 255;
            boolean z29 = (readByte2 & 128) != 0;
            boolean z37 = this.f442804a;
            if (z29 == z37) {
                throw new java.net.ProtocolException(z37 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j17 = readByte2 & 127;
            this.f442809f = j17;
            if (j17 == 126) {
                this.f442809f = mVar.readShort() & 65535;
            } else if (j17 == 127) {
                long readLong = mVar.readLong();
                this.f442809f = readLong;
                if (readLong < 0) {
                    throw new java.net.ProtocolException("Frame length 0x" + java.lang.Long.toHexString(this.f442809f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f442811h && this.f442809f > 125) {
                throw new java.net.ProtocolException("Control frame must be less than 125B.");
            }
            if (z29) {
                mVar.readFully(this.f442814k);
            }
        } catch (java.lang.Throwable th6) {
            mVar.h().g(h17, java.util.concurrent.TimeUnit.NANOSECONDS);
            throw th6;
        }
    }
}
