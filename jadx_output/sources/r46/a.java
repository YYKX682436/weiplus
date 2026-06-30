package r46;

/* loaded from: classes13.dex */
public class a implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final long[] f392495h = new long[64];

    /* renamed from: d, reason: collision with root package name */
    public final r46.g f392496d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteOrder f392497e;

    /* renamed from: f, reason: collision with root package name */
    public long f392498f;

    /* renamed from: g, reason: collision with root package name */
    public int f392499g;

    static {
        for (int i17 = 1; i17 <= 63; i17++) {
            long[] jArr = f392495h;
            jArr[i17] = (jArr[i17 - 1] << 1) + 1;
        }
    }

    public a(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.f392496d = new r46.g(inputStream);
        this.f392497e = byteOrder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003b, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(int r13) {
        /*
            r12 = this;
            if (r13 < 0) goto L86
            r0 = 63
            if (r13 > r0) goto L86
        L6:
            int r0 = r12.f392499g
            java.nio.ByteOrder r1 = r12.f392497e
            r2 = 0
            r46.g r4 = r12.f392496d
            if (r0 >= r13) goto L3b
            r5 = 57
            if (r0 >= r5) goto L3b
            int r0 = r4.read()
            long r5 = (long) r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1f
            r0 = 1
            goto L3c
        L1f:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2 = 8
            if (r1 != r0) goto L2f
            long r0 = r12.f392498f
            int r3 = r12.f392499g
            long r3 = r5 << r3
            long r0 = r0 | r3
            r12.f392498f = r0
            goto L35
        L2f:
            long r0 = r12.f392498f
            long r0 = r0 << r2
            long r0 = r0 | r5
            r12.f392498f = r0
        L35:
            int r0 = r12.f392499g
            int r0 = r0 + r2
            r12.f392499g = r0
            goto L6
        L3b:
            r0 = 0
        L3c:
            if (r0 == 0) goto L41
            r0 = -1
            return r0
        L41:
            int r0 = r12.f392499g
            if (r0 >= r13) goto L81
            int r0 = r13 - r0
            int r5 = 8 - r0
            int r4 = r4.read()
            long r6 = (long) r4
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L53
            goto L80
        L53:
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            long[] r3 = r46.a.f392495h
            if (r1 != r2) goto L68
            r1 = r3[r0]
            long r1 = r1 & r6
            long r8 = r12.f392498f
            int r4 = r12.f392499g
            long r1 = r1 << r4
            long r1 = r1 | r8
            r12.f392498f = r1
            long r6 = r6 >>> r0
            r0 = r3[r5]
            goto L76
        L68:
            long r1 = r12.f392498f
            long r1 = r1 << r0
            long r8 = r6 >>> r5
            r10 = r3[r0]
            long r8 = r8 & r10
            long r0 = r1 | r8
            r12.f392498f = r0
            r0 = r3[r5]
        L76:
            long r0 = r0 & r6
            long r6 = r12.f392498f
            r2 = r3[r13]
            long r6 = r6 & r2
            r12.f392498f = r0
            r12.f392499g = r5
        L80:
            return r6
        L81:
            long r0 = r12.b(r13)
            return r0
        L86:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "count must not be negative or greater than 63"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r46.a.a(int):long");
    }

    public final long b(int i17) {
        long j17;
        java.nio.ByteOrder byteOrder = this.f392497e;
        java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        long[] jArr = f392495h;
        if (byteOrder == byteOrder2) {
            long j18 = this.f392498f;
            j17 = j18 & jArr[i17];
            this.f392498f = j18 >>> i17;
        } else {
            j17 = (this.f392498f >> (this.f392499g - i17)) & jArr[i17];
        }
        this.f392499g -= i17;
        return j17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f392496d.close();
    }
}
