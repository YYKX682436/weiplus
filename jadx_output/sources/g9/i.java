package g9;

/* loaded from: classes15.dex */
public final class i extends e9.c {
    public static final java.util.concurrent.atomic.AtomicInteger G = new java.util.concurrent.atomic.AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public g9.o D;
    public volatile boolean E;
    public volatile boolean F;

    /* renamed from: j, reason: collision with root package name */
    public final int f269585j;

    /* renamed from: k, reason: collision with root package name */
    public final int f269586k;

    /* renamed from: l, reason: collision with root package name */
    public final h9.a f269587l;

    /* renamed from: m, reason: collision with root package name */
    public final r9.k f269588m;

    /* renamed from: n, reason: collision with root package name */
    public final r9.n f269589n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f269590o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f269591p;

    /* renamed from: q, reason: collision with root package name */
    public final t9.a0 f269592q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f269593r;

    /* renamed from: s, reason: collision with root package name */
    public final q8.e f269594s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f269595t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f269596u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f269597v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f269598w;

    /* renamed from: x, reason: collision with root package name */
    public final b9.i f269599x;

    /* renamed from: y, reason: collision with root package name */
    public final t9.p f269600y;

    /* renamed from: z, reason: collision with root package name */
    public q8.e f269601z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(r9.k r17, r9.n r18, r9.n r19, h9.a r20, java.util.List r21, int r22, java.lang.Object r23, long r24, long r26, int r28, int r29, boolean r30, t9.a0 r31, g9.i r32, byte[] r33, byte[] r34) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.i.<init>(r9.k, r9.n, r9.n, h9.a, java.util.List, int, java.lang.Object, long, long, int, int, boolean, t9.a0, g9.i, byte[], byte[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019e A[Catch: all -> 0x01e7, TryCatch #1 {all -> 0x01e7, blocks: (B:109:0x018c, B:111:0x019e, B:113:0x01a6, B:114:0x01af, B:115:0x01ad, B:117:0x01b7, B:125:0x01d5, B:130:0x01ca, B:131:0x01d4, B:121:0x01be, B:123:0x01c2), top: B:108:0x018c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b7 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #1 {all -> 0x01e7, blocks: (B:109:0x018c, B:111:0x019e, B:113:0x01a6, B:114:0x01af, B:115:0x01ad, B:117:0x01b7, B:125:0x01d5, B:130:0x01ca, B:131:0x01d4, B:121:0x01be, B:123:0x01c2), top: B:108:0x018c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    @Override // r9.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.i.a():void");
    }

    @Override // r9.c0
    public boolean b() {
        return this.E;
    }

    @Override // r9.c0
    public void c() {
        this.E = true;
    }

    @Override // e9.a
    public long d() {
        return this.B;
    }

    public final q8.e e(long j17) {
        q8.e aVar;
        java.lang.String str = this.f269593r;
        if (str.endsWith(".aac")) {
            aVar = new w8.c(j17);
        } else if (str.endsWith(".ac3") || str.endsWith(".ec3")) {
            aVar = new w8.a(j17);
        } else {
            if (!str.endsWith(".mp3")) {
                throw new java.lang.IllegalArgumentException("Unknown extension for audio file: " + str);
            }
            aVar = new t8.c(0, j17);
        }
        aVar.b(this.D);
        return aVar;
    }

    public final long f(q8.f fVar) {
        com.google.android.exoplayer2.metadata.Metadata b17;
        ((q8.b) fVar).f360620e = 0;
        t9.p pVar = this.f269600y;
        q8.b bVar = (q8.b) fVar;
        if (!bVar.b(pVar.f416540a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        pVar.t(10);
        if (pVar.o() != b9.i.f18356a) {
            return -9223372036854775807L;
        }
        pVar.x(3);
        int l17 = pVar.l();
        int i17 = l17 + 10;
        if (i17 > pVar.a()) {
            byte[] bArr = pVar.f416540a;
            pVar.t(i17);
            java.lang.System.arraycopy(bArr, 0, pVar.f416540a, 0, 10);
        }
        if (!bVar.b(pVar.f416540a, 10, l17, true) || (b17 = this.f269599x.b(pVar.f416540a, l17)) == null) {
            return -9223372036854775807L;
        }
        for (com.google.android.exoplayer2.metadata.Metadata.Entry entry : b17.f44104d) {
            if (entry instanceof com.google.android.exoplayer2.metadata.id3.PrivFrame) {
                com.google.android.exoplayer2.metadata.id3.PrivFrame privFrame = (com.google.android.exoplayer2.metadata.id3.PrivFrame) entry;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f44135e)) {
                    java.lang.System.arraycopy(privFrame.f44136f, 0, pVar.f416540a, 0, 8);
                    pVar.t(8);
                    return pVar.h();
                }
            }
        }
        return -9223372036854775807L;
    }
}
