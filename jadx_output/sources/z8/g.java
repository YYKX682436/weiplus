package z8;

/* loaded from: classes15.dex */
public final class g extends m8.a implements android.os.Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final z8.d f470627o;

    /* renamed from: p, reason: collision with root package name */
    public final z8.f f470628p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f470629q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.s f470630r;

    /* renamed from: s, reason: collision with root package name */
    public final z8.e f470631s;

    /* renamed from: t, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.Metadata[] f470632t;

    /* renamed from: u, reason: collision with root package name */
    public final long[] f470633u;

    /* renamed from: v, reason: collision with root package name */
    public int f470634v;

    /* renamed from: w, reason: collision with root package name */
    public int f470635w;

    /* renamed from: x, reason: collision with root package name */
    public z8.b f470636x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f470637y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(z8.f fVar, android.os.Looper looper) {
        super(4);
        z8.d dVar = z8.d.f470625a;
        fVar.getClass();
        this.f470628p = fVar;
        this.f470629q = looper == null ? null : new android.os.Handler(looper, this);
        this.f470627o = dVar;
        this.f470630r = new m8.s();
        this.f470631s = new z8.e();
        this.f470632t = new com.google.android.exoplayer2.metadata.Metadata[5];
        this.f470633u = new long[5];
    }

    @Override // m8.c0
    public int c(com.google.android.exoplayer2.Format format) {
        ((z8.c) this.f470627o).getClass();
        java.lang.String str = format.f44080i;
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_ID3.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SCTE35.equals(str) ? 4 : 0;
    }

    @Override // m8.b0
    public boolean h() {
        return this.f470637y;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            throw new java.lang.IllegalStateException();
        }
        this.f470628p.p((com.google.android.exoplayer2.metadata.Metadata) message.obj);
        return true;
    }

    @Override // m8.b0
    public void i(long j17, long j18) {
        boolean z17 = this.f470637y;
        long[] jArr = this.f470633u;
        com.google.android.exoplayer2.metadata.Metadata[] metadataArr = this.f470632t;
        if (!z17 && this.f470635w < 5) {
            z8.e eVar = this.f470631s;
            eVar.l();
            m8.s sVar = this.f470630r;
            if (r(sVar, eVar, false) == -4) {
                if (eVar.b(4)) {
                    this.f470637y = true;
                } else if (!eVar.k()) {
                    eVar.f470626i = sVar.f324666a.C;
                    eVar.f343610f.flip();
                    int i17 = (this.f470634v + this.f470635w) % 5;
                    metadataArr[i17] = this.f470636x.a(eVar);
                    jArr[i17] = eVar.f343611g;
                    this.f470635w++;
                }
            }
        }
        if (this.f470635w > 0) {
            int i18 = this.f470634v;
            if (jArr[i18] <= j17) {
                com.google.android.exoplayer2.metadata.Metadata metadata = metadataArr[i18];
                android.os.Handler handler = this.f470629q;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.f470628p.p(metadata);
                }
                int i19 = this.f470634v;
                metadataArr[i19] = null;
                this.f470634v = (i19 + 1) % 5;
                this.f470635w--;
            }
        }
    }

    @Override // m8.b0
    public boolean isReady() {
        return true;
    }

    @Override // m8.a
    public void l() {
        java.util.Arrays.fill(this.f470632t, (java.lang.Object) null);
        this.f470634v = 0;
        this.f470635w = 0;
        this.f470636x = null;
    }

    @Override // m8.a
    public void n(long j17, boolean z17) {
        java.util.Arrays.fill(this.f470632t, (java.lang.Object) null);
        this.f470634v = 0;
        this.f470635w = 0;
        this.f470637y = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r2.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_ID3) == false) goto L4;
     */
    @Override // m8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.google.android.exoplayer2.Format[] r2, long r3) {
        /*
            r1 = this;
            r3 = 0
            r2 = r2[r3]
            z8.d r4 = r1.f470627o
            z8.c r4 = (z8.c) r4
            r4.getClass()
            java.lang.String r2 = r2.f44080i
            r2.getClass()
            int r4 = r2.hashCode()
            r0 = -1
            switch(r4) {
                case -1248341703: goto L2f;
                case 1154383568: goto L24;
                case 1652648887: goto L19;
                default: goto L17;
            }
        L17:
            r3 = r0
            goto L38
        L19:
            java.lang.String r3 = "application/x-scte35"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L17
        L22:
            r3 = 2
            goto L38
        L24:
            java.lang.String r3 = "application/x-emsg"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L17
        L2d:
            r3 = 1
            goto L38
        L2f:
            java.lang.String r4 = "application/id3"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L38
            goto L17
        L38:
            switch(r3) {
                case 0: goto L4f;
                case 1: goto L49;
                case 2: goto L43;
                default: goto L3b;
            }
        L3b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Attempted to create decoder for unsupported format"
            r2.<init>(r3)
            throw r2
        L43:
            c9.b r2 = new c9.b
            r2.<init>()
            goto L55
        L49:
            a9.b r2 = new a9.b
            r2.<init>()
            goto L55
        L4f:
            b9.i r2 = new b9.i
            r3 = 0
            r2.<init>(r3)
        L55:
            r1.f470636x = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.g.q(com.google.android.exoplayer2.Format[], long):void");
    }
}
