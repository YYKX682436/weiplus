package l46;

/* loaded from: classes13.dex */
public class a extends a46.b {

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f316485s = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};

    /* renamed from: e, reason: collision with root package name */
    public final java.io.PushbackInputStream f316486e;

    /* renamed from: f, reason: collision with root package name */
    public final l46.b f316487f;

    /* renamed from: g, reason: collision with root package name */
    public l46.e f316488g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f316489h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f316490i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f316491m;

    /* renamed from: n, reason: collision with root package name */
    public int f316492n;

    /* renamed from: o, reason: collision with root package name */
    public long f316493o;

    /* renamed from: p, reason: collision with root package name */
    public final int f316494p;

    /* renamed from: q, reason: collision with root package name */
    public final l46.c f316495q;

    /* renamed from: r, reason: collision with root package name */
    public final r46.c f316496r;

    public a(java.io.InputStream inputStream) {
        l46.b bVar = l46.b.STANDARD;
        this.f316489h = new byte[1];
        this.f316493o = -1L;
        this.f316495q = new l46.c();
        this.f316496r = new r46.c() { // from class: l46.a$$a
            @Override // r46.c
            public final int a() {
                l46.a aVar = l46.a.this;
                int read = aVar.f316486e.read();
                if (read == -1) {
                    return -1;
                }
                aVar.a(1);
                return read & 255;
            }
        };
        this.f316486e = new java.io.PushbackInputStream(new r46.g(inputStream), 1);
        this.f316494p = 32768;
        this.f316487f = bVar;
        i();
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f316491m) {
            return java.lang.Math.min(this.f316492n, this.f316486e.available());
        }
        l46.e eVar = this.f316488g;
        if (eVar != null) {
            return eVar.f278971g - eVar.f278972h;
        }
        return 0;
    }

    public final long b() {
        byte[] bArr = new byte[4];
        int a17 = r46.h.a(this.f316486e, bArr, 0, 4);
        a(a17);
        if (a17 == 4) {
            return r46.d.c(bArr, 0, 4);
        }
        throw new java.io.IOException("Premature end of stream");
    }

    public final void c() {
        int i17;
        long j17 = this.f316493o;
        l46.c cVar = this.f316495q;
        if (j17 >= 0 && j17 != cVar.getValue()) {
            throw new java.io.IOException("Checksum verification failed");
        }
        this.f316493o = -1L;
        cVar.f316502a = -1;
        this.f316491m = false;
        java.io.PushbackInputStream pushbackInputStream = this.f316486e;
        int read = pushbackInputStream.read();
        if (read != -1) {
            a(1);
            i17 = read & 255;
        } else {
            i17 = -1;
        }
        if (i17 == -1) {
            this.f316490i = true;
            return;
        }
        if (i17 == 255) {
            pushbackInputStream.unread(i17);
            this.f1354d--;
            i();
            c();
            return;
        }
        r46.c cVar2 = this.f316496r;
        if (i17 == 254 || (i17 > 127 && i17 <= 253)) {
            int b17 = (int) r46.d.b(cVar2, 3);
            if (b17 < 0) {
                throw new java.io.IOException("Found illegal chunk with negative size");
            }
            long j18 = b17;
            long b18 = r46.h.b(pushbackInputStream, j18);
            a(b18);
            if (b18 != j18) {
                throw new java.io.IOException("Premature end of stream");
            }
            c();
            return;
        }
        if (i17 >= 2 && i17 <= 127) {
            throw new java.io.IOException("Unskippable chunk with type " + i17 + " (hex " + java.lang.Integer.toHexString(i17) + ") detected.");
        }
        if (i17 == 1) {
            this.f316491m = true;
            int b19 = ((int) r46.d.b(cVar2, 3)) - 4;
            this.f316492n = b19;
            if (b19 < 0) {
                throw new java.io.IOException("Found illegal chunk with negative size");
            }
            long b27 = (b() - 2726488792L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
            this.f316493o = ((b27 << 15) | (b27 >> 17)) & io.flutter.embedding.android.KeyboardMap.kValueMask;
            return;
        }
        if (i17 != 0) {
            throw new java.io.IOException("Unknown chunk type " + i17 + " detected.");
        }
        boolean z17 = this.f316487f.f316500d;
        long b28 = ((int) r46.d.b(cVar2, 3)) - (z17 ? 4L : 0L);
        if (b28 < 0) {
            throw new java.io.IOException("Found illegal chunk with negative size");
        }
        if (z17) {
            long b29 = (b() - 2726488792L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
            this.f316493o = ((b29 << 15) | (b29 >> 17)) & io.flutter.embedding.android.KeyboardMap.kValueMask;
        } else {
            this.f316493o = -1L;
        }
        l46.e eVar = new l46.e(new r46.b(pushbackInputStream, b28), this.f316494p);
        this.f316488g = eVar;
        a(eVar.f1354d);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.io.PushbackInputStream pushbackInputStream = this.f316486e;
        try {
            l46.e eVar = this.f316488g;
            if (eVar != null) {
                eVar.close();
                this.f316488g = null;
            }
        } finally {
            pushbackInputStream.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4.f316491m
            r1 = -1
            if (r0 == 0) goto L20
            int r0 = r4.f316492n
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto Le
            return r1
        Le:
            java.io.PushbackInputStream r0 = r4.f316486e
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L3d
            int r0 = r4.f316492n
            int r0 = r0 - r7
            r4.f316492n = r0
            long r0 = (long) r7
            r4.a(r0)
            goto L3d
        L20:
            l46.e r0 = r4.f316488g
            if (r0 == 0) goto L3e
            long r2 = r0.f1354d
            int r7 = r0.read(r5, r6, r7)
            if (r7 != r1) goto L35
            l46.e r0 = r4.f316488g
            r0.close()
            r0 = 0
            r4.f316488g = r0
            goto L3d
        L35:
            l46.e r0 = r4.f316488g
            long r0 = r0.f1354d
            long r0 = r0 - r2
            r4.a(r0)
        L3d:
            r1 = r7
        L3e:
            if (r1 <= 0) goto L45
            l46.c r7 = r4.f316495q
            r7.update(r5, r6, r1)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l46.a.f(byte[], int, int):int");
    }

    public final void i() {
        byte[] bArr = new byte[10];
        int a17 = r46.h.a(this.f316486e, bArr, 0, 10);
        a(a17);
        if (10 != a17 || !java.util.Arrays.equals(bArr, f316485s)) {
            throw new java.io.IOException("Not a framed Snappy stream");
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f316489h;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i18 == 0) {
            return 0;
        }
        int f17 = f(bArr, i17, i18);
        if (f17 != -1) {
            return f17;
        }
        c();
        if (this.f316490i) {
            return -1;
        }
        return f(bArr, i17, i18);
    }
}
