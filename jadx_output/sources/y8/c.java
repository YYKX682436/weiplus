package y8;

/* loaded from: classes15.dex */
public abstract class c extends m8.a {
    public static final byte[] W;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public java.nio.ByteBuffer[] G;
    public java.nio.ByteBuffer[] H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public int f459800J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public o8.f V;

    /* renamed from: o, reason: collision with root package name */
    public final y8.e f459801o;

    /* renamed from: p, reason: collision with root package name */
    public final o8.g f459802p;

    /* renamed from: q, reason: collision with root package name */
    public final o8.g f459803q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.s f459804r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f459805s;

    /* renamed from: t, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f459806t;

    /* renamed from: u, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f459807u;

    /* renamed from: v, reason: collision with root package name */
    public android.media.MediaCodec f459808v;

    /* renamed from: w, reason: collision with root package name */
    public y8.a f459809w;

    /* renamed from: x, reason: collision with root package name */
    public int f459810x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f459811y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f459812z;

    static {
        int i17 = t9.d0.f416498a;
        byte[] bArr = new byte[38];
        for (int i18 = 0; i18 < 38; i18++) {
            int i19 = i18 * 2;
            bArr[i18] = (byte) ((java.lang.Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i19), 16) << 4) + java.lang.Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i19 + 1), 16));
        }
        W = bArr;
    }

    public c(int i17, y8.e eVar, p8.b bVar, boolean z17) {
        super(i17);
        t9.a.d(t9.d0.f416498a >= 16);
        eVar.getClass();
        this.f459801o = eVar;
        this.f459802p = new o8.g(0);
        this.f459803q = new o8.g(0);
        this.f459804r = new m8.s();
        this.f459805s = new java.util.ArrayList();
        this.f459806t = new android.media.MediaCodec.BufferInfo();
        this.N = 0;
        this.P = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r5.f44085q == r0.f44085q) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.google.android.exoplayer2.Format r5) {
        /*
            r4 = this;
            com.google.android.exoplayer2.Format r0 = r4.f459807u
            r4.f459807u = r5
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.f44083o
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.f44083o
        Lc:
            boolean r5 = t9.d0.a(r5, r1)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == 0) goto L29
            com.google.android.exoplayer2.Format r5 = r4.f459807u
            com.google.android.exoplayer2.drm.DrmInitData r5 = r5.f44083o
            if (r5 != 0) goto L1b
            goto L29
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f324537f
            m8.e r5 = m8.e.a(r5, r0)
            throw r5
        L29:
            android.media.MediaCodec r5 = r4.f459808v
            if (r5 == 0) goto L57
            y8.a r2 = r4.f459809w
            boolean r2 = r2.f459791b
            com.google.android.exoplayer2.Format r3 = r4.f459807u
            boolean r5 = r4.s(r5, r2, r0, r3)
            if (r5 == 0) goto L57
            r4.M = r1
            r4.N = r1
            int r5 = r4.f459810x
            r2 = 2
            if (r5 == r2) goto L54
            if (r5 != r1) goto L53
            com.google.android.exoplayer2.Format r5 = r4.f459807u
            int r2 = r5.f44084p
            int r3 = r0.f44084p
            if (r2 != r3) goto L53
            int r5 = r5.f44085q
            int r0 = r0.f44085q
            if (r5 != r0) goto L53
            goto L54
        L53:
            r1 = 0
        L54:
            r4.E = r1
            goto L64
        L57:
            boolean r5 = r4.Q
            if (r5 == 0) goto L5e
            r4.P = r1
            goto L64
        L5e:
            r4.G()
            r4.x()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.A(com.google.android.exoplayer2.Format):void");
    }

    public abstract void C(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat);

    public void D(o8.g gVar) {
    }

    public final void E() {
        if (this.P == 2) {
            G();
            x();
        } else {
            this.T = true;
            H();
        }
    }

    public abstract boolean F(long j17, long j18, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i17, int i18, long j19, boolean z17);

    public void G() {
        this.I = -9223372036854775807L;
        this.f459800J = -1;
        this.K = -1;
        this.L = false;
        ((java.util.ArrayList) this.f459805s).clear();
        this.G = null;
        this.H = null;
        this.f459809w = null;
        this.M = false;
        this.Q = false;
        this.f459811y = false;
        this.f459812z = false;
        this.f459810x = 0;
        this.A = false;
        this.B = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.R = false;
        this.N = 0;
        this.P = 0;
        this.f459802p.f343610f = null;
        android.media.MediaCodec mediaCodec = this.f459808v;
        if (mediaCodec != null) {
            this.V.f343603b++;
            try {
                mediaCodec.stop();
                try {
                    this.f459808v.release();
                } finally {
                }
            } catch (java.lang.Throwable th6) {
                try {
                    this.f459808v.release();
                    throw th6;
                } finally {
                }
            }
        }
    }

    public void H() {
    }

    public boolean I(y8.a aVar) {
        return true;
    }

    public abstract int J(y8.e eVar, com.google.android.exoplayer2.Format format);

    @Override // m8.c0
    public final int c(com.google.android.exoplayer2.Format format) {
        try {
            int J2 = J(this.f459801o, format);
            if ((J2 & 7) > 2) {
                return !(format.f44083o == null) ? (J2 & (-8)) | 2 : J2;
            }
            return J2;
        } catch (y8.h e17) {
            throw m8.e.a(e17, this.f324537f);
        }
    }

    @Override // m8.a, m8.c0
    public final int g() {
        return 8;
    }

    @Override // m8.b0
    public boolean h() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0185 A[LOOP:0: B:18:0x0044->B:33:0x0185, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b A[EDGE_INSN: B:34:0x018b->B:35:0x018b BREAK  A[LOOP:0: B:18:0x0044->B:33:0x0185], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // m8.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(long r33, long r35) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.i(long, long):void");
    }

    @Override // m8.b0
    public boolean isReady() {
        if (this.f459807u != null) {
            if ((this.f324541m ? this.f324542n : this.f324539h.isReady()) || this.K >= 0 || (this.I != -9223372036854775807L && android.os.SystemClock.elapsedRealtime() < this.I)) {
                return true;
            }
        }
        return false;
    }

    @Override // m8.a
    public void n(long j17, boolean z17) {
        this.S = false;
        this.T = false;
        if (this.f459808v != null) {
            this.I = -9223372036854775807L;
            this.f459800J = -1;
            this.K = -1;
            this.U = true;
            this.L = false;
            ((java.util.ArrayList) this.f459805s).clear();
            this.E = false;
            this.F = false;
            if (this.f459812z || (this.B && this.R)) {
                G();
                x();
            } else if (this.P != 0) {
                G();
                x();
            } else {
                this.f459808v.flush();
                this.Q = false;
            }
            if (!this.M || this.f459807u == null) {
                return;
            }
            this.N = 1;
        }
    }

    public boolean s(android.media.MediaCodec mediaCodec, boolean z17, com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        return false;
    }

    public abstract void t(y8.a aVar, android.media.MediaCodec mediaCodec, com.google.android.exoplayer2.Format format, android.media.MediaCrypto mediaCrypto);

    public y8.a w(y8.e eVar, com.google.android.exoplayer2.Format format, boolean z17) {
        java.lang.String str = format.f44080i;
        ((y8.d) eVar).getClass();
        return y8.l.b(str, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.c.x():void");
    }

    public abstract void y(java.lang.String str, long j17, long j18);
}
