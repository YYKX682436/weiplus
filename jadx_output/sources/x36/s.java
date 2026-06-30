package x36;

/* loaded from: classes16.dex */
public final class s implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public byte f451703d;

    /* renamed from: e, reason: collision with root package name */
    public final x36.b0 f451704e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.Inflater f451705f;

    /* renamed from: g, reason: collision with root package name */
    public final x36.t f451706g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.zip.CRC32 f451707h;

    public s(x36.h0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        x36.b0 b0Var = new x36.b0(source);
        this.f451704e = b0Var;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.f451705f = inflater;
        this.f451706g = new x36.t(b0Var, inflater);
        this.f451707h = new java.util.zip.CRC32();
    }

    @Override // x36.h0
    public long B(x36.k sink, long j17) {
        java.util.zip.CRC32 crc32;
        x36.b0 b0Var;
        x36.k kVar;
        long j18;
        kotlin.jvm.internal.o.g(sink, "sink");
        byte b17 = 1;
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("byteCount < 0: " + j17).toString());
        }
        if (j17 == 0) {
            return 0L;
        }
        byte b18 = this.f451703d;
        java.util.zip.CRC32 crc322 = this.f451707h;
        x36.b0 b0Var2 = this.f451704e;
        if (b18 == 0) {
            b0Var2.c1(10L);
            x36.k kVar2 = b0Var2.f451654d;
            byte c17 = kVar2.c(3L);
            boolean z17 = ((c17 >> 1) & 1) == 1;
            if (z17) {
                b(b0Var2.f451654d, 0L, 10L);
            }
            a("ID1ID2", 8075, b0Var2.readShort());
            b0Var2.skip(8L);
            if (((c17 >> 2) & 1) == 1) {
                b0Var2.c1(2L);
                if (z17) {
                    b(b0Var2.f451654d, 0L, 2L);
                }
                int readShort = kVar2.readShort() & 65535;
                long j19 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                b0Var2.c1(j19);
                if (z17) {
                    b(b0Var2.f451654d, 0L, j19);
                    j18 = j19;
                } else {
                    j18 = j19;
                }
                b0Var2.skip(j18);
            }
            if (((c17 >> 3) & 1) == 1) {
                long a17 = b0Var2.a((byte) 0, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                if (a17 == -1) {
                    throw new java.io.EOFException();
                }
                if (z17) {
                    b(b0Var2.f451654d, 0L, a17 + 1);
                }
                b0Var2.skip(a17 + 1);
            }
            if (((c17 >> 4) & 1) == 1) {
                kVar = kVar2;
                crc32 = crc322;
                long a18 = b0Var2.a((byte) 0, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                if (a18 == -1) {
                    throw new java.io.EOFException();
                }
                if (z17) {
                    b0Var = b0Var2;
                    b17 = 1;
                    b(b0Var2.f451654d, 0L, a18 + 1);
                } else {
                    b0Var = b0Var2;
                    b17 = 1;
                }
                b0Var.skip(a18 + 1);
            } else {
                kVar = kVar2;
                crc32 = crc322;
                b0Var = b0Var2;
            }
            if (z17) {
                b0Var.c1(2L);
                int readShort2 = kVar.readShort() & 65535;
                a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f451703d = b17;
        } else {
            crc32 = crc322;
            b0Var = b0Var2;
        }
        if (this.f451703d == b17) {
            long j27 = sink.f451694e;
            long B = this.f451706g.B(sink, j17);
            if (B != -1) {
                b(sink, j27, B);
                return B;
            }
            this.f451703d = (byte) 2;
        }
        if (this.f451703d == 2) {
            a("CRC", b0Var.b(), (int) crc32.getValue());
            a("ISIZE", b0Var.b(), (int) this.f451705f.getBytesWritten());
            this.f451703d = (byte) 3;
            if (!b0Var.o1()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(java.lang.String str, int i17, int i18) {
        if (i18 == i17) {
            return;
        }
        java.lang.String format = java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)}, 3));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(this, *args)");
        throw new java.io.IOException(format);
    }

    public final void b(x36.k kVar, long j17, long j18) {
        x36.c0 c0Var = kVar.f451693d;
        kotlin.jvm.internal.o.d(c0Var);
        while (true) {
            int i17 = c0Var.f451659c;
            int i18 = c0Var.f451658b;
            if (j17 < i17 - i18) {
                break;
            }
            j17 -= i17 - i18;
            c0Var = c0Var.f451662f;
            kotlin.jvm.internal.o.d(c0Var);
        }
        while (j18 > 0) {
            int min = (int) java.lang.Math.min(c0Var.f451659c - r6, j18);
            this.f451707h.update(c0Var.f451657a, (int) (c0Var.f451658b + j17), min);
            j18 -= min;
            c0Var = c0Var.f451662f;
            kotlin.jvm.internal.o.d(c0Var);
            j17 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f451706g.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451704e.h();
    }
}
