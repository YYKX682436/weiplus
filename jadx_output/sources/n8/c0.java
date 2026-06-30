package n8;

/* loaded from: classes13.dex */
public final class c0 implements n8.f {

    /* renamed from: b, reason: collision with root package name */
    public int f335475b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f335476c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f335477d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteBuffer f335478e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteBuffer f335479f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f335480g;

    public c0() {
        java.nio.ByteBuffer byteBuffer = n8.f.f335519a;
        this.f335478e = byteBuffer;
        this.f335479f = byteBuffer;
    }

    @Override // n8.f
    public boolean a() {
        int i17 = this.f335477d;
        return (i17 == 0 || i17 == 2) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[ADDED_TO_REGION, LOOP:2: B:24:0x0081->B:25:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0041, B:25:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // n8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f335477d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f335478e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f335478e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f335478e
            r2.clear()
        L3f:
            int r2 = r7.f335477d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f335478e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f335478e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f335478e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f335478e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f335478e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f335478e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f335478e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f335478e
            r7.f335479f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.c0.b(java.nio.ByteBuffer):void");
    }

    @Override // n8.f
    public int c() {
        return this.f335476c;
    }

    @Override // n8.f
    public int d() {
        return 2;
    }

    @Override // n8.f
    public void e() {
        this.f335480g = true;
    }

    @Override // n8.f
    public java.nio.ByteBuffer f() {
        java.nio.ByteBuffer byteBuffer = this.f335479f;
        this.f335479f = n8.f.f335519a;
        return byteBuffer;
    }

    @Override // n8.f
    public void flush() {
        this.f335479f = n8.f.f335519a;
        this.f335480g = false;
    }

    @Override // n8.f
    public boolean g(int i17, int i18, int i19) {
        if (i19 != 3 && i19 != 2 && i19 != Integer.MIN_VALUE && i19 != 1073741824) {
            throw new n8.e(i17, i18, i19);
        }
        if (this.f335475b == i17 && this.f335476c == i18 && this.f335477d == i19) {
            return false;
        }
        this.f335475b = i17;
        this.f335476c = i18;
        this.f335477d = i19;
        if (i19 != 2) {
            return true;
        }
        this.f335478e = n8.f.f335519a;
        return true;
    }

    @Override // n8.f
    public boolean h() {
        return this.f335480g && this.f335479f == n8.f.f335519a;
    }

    @Override // n8.f
    public void reset() {
        flush();
        this.f335478e = n8.f.f335519a;
        this.f335475b = -1;
        this.f335476c = -1;
        this.f335477d = 0;
    }
}
