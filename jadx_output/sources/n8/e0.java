package n8;

/* loaded from: classes15.dex */
public final class e0 implements n8.f {

    /* renamed from: d, reason: collision with root package name */
    public n8.d0 f335510d;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f335513g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ShortBuffer f335514h;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer f335515i;

    /* renamed from: j, reason: collision with root package name */
    public long f335516j;

    /* renamed from: k, reason: collision with root package name */
    public long f335517k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f335518l;

    /* renamed from: e, reason: collision with root package name */
    public float f335511e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f335512f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f335508b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f335509c = -1;

    public e0() {
        java.nio.ByteBuffer byteBuffer = n8.f.f335519a;
        this.f335513g = byteBuffer;
        this.f335514h = byteBuffer.asShortBuffer();
        this.f335515i = byteBuffer;
    }

    @Override // n8.f
    public boolean a() {
        return java.lang.Math.abs(this.f335511e - 1.0f) >= 0.01f || java.lang.Math.abs(this.f335512f - 1.0f) >= 0.01f;
    }

    @Override // n8.f
    public void b(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f335516j += remaining;
            n8.d0 d0Var = this.f335510d;
            d0Var.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i17 = d0Var.f335485b;
            int i18 = remaining2 / i17;
            int i19 = i18 * i17 * 2;
            int i27 = d0Var.f335500q + i18;
            int i28 = d0Var.f335490g;
            if (i27 > i28) {
                int i29 = i28 + (i28 / 2) + i18;
                d0Var.f335490g = i29;
                d0Var.f335491h = java.util.Arrays.copyOf(d0Var.f335491h, i29 * i17);
            }
            asShortBuffer.get(d0Var.f335491h, d0Var.f335500q * i17, i19 / 2);
            d0Var.f335500q += i18;
            d0Var.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i37 = this.f335510d.f335501r * this.f335508b * 2;
        if (i37 > 0) {
            if (this.f335513g.capacity() < i37) {
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(i37).order(java.nio.ByteOrder.nativeOrder());
                this.f335513g = order;
                this.f335514h = order.asShortBuffer();
            } else {
                this.f335513g.clear();
                this.f335514h.clear();
            }
            n8.d0 d0Var2 = this.f335510d;
            java.nio.ShortBuffer shortBuffer = this.f335514h;
            d0Var2.getClass();
            int remaining3 = shortBuffer.remaining();
            int i38 = d0Var2.f335485b;
            int min = java.lang.Math.min(remaining3 / i38, d0Var2.f335501r);
            int i39 = min * i38;
            shortBuffer.put(d0Var2.f335493j, 0, i39);
            int i47 = d0Var2.f335501r - min;
            d0Var2.f335501r = i47;
            short[] sArr = d0Var2.f335493j;
            java.lang.System.arraycopy(sArr, i39, sArr, 0, i47 * i38);
            this.f335517k += i37;
            this.f335513g.limit(i37);
            this.f335515i = this.f335513g;
        }
    }

    @Override // n8.f
    public int c() {
        return this.f335508b;
    }

    @Override // n8.f
    public int d() {
        return 2;
    }

    @Override // n8.f
    public void e() {
        n8.d0 d0Var = this.f335510d;
        int i17 = d0Var.f335500q;
        float f17 = d0Var.f335498o;
        float f18 = d0Var.f335499p;
        int i18 = d0Var.f335501r + ((int) ((((i17 / (f17 / f18)) + d0Var.f335502s) / f18) + 0.5f));
        int i19 = d0Var.f335488e * 2;
        int i27 = i19 + i17;
        int i28 = i17 + i27;
        int i29 = d0Var.f335490g;
        int i37 = d0Var.f335485b;
        if (i28 > i29) {
            int i38 = i29 + (i29 / 2) + i27;
            d0Var.f335490g = i38;
            d0Var.f335491h = java.util.Arrays.copyOf(d0Var.f335491h, i38 * i37);
        }
        for (int i39 = 0; i39 < i19 * i37; i39++) {
            d0Var.f335491h[(i37 * i17) + i39] = 0;
        }
        d0Var.f335500q += i19;
        d0Var.e();
        if (d0Var.f335501r > i18) {
            d0Var.f335501r = i18;
        }
        d0Var.f335500q = 0;
        d0Var.f335503t = 0;
        d0Var.f335502s = 0;
        this.f335518l = true;
    }

    @Override // n8.f
    public java.nio.ByteBuffer f() {
        java.nio.ByteBuffer byteBuffer = this.f335515i;
        this.f335515i = n8.f.f335519a;
        return byteBuffer;
    }

    @Override // n8.f
    public void flush() {
        n8.d0 d0Var = new n8.d0(this.f335509c, this.f335508b);
        this.f335510d = d0Var;
        d0Var.f335498o = this.f335511e;
        d0Var.f335499p = this.f335512f;
        this.f335515i = n8.f.f335519a;
        this.f335516j = 0L;
        this.f335517k = 0L;
        this.f335518l = false;
    }

    @Override // n8.f
    public boolean g(int i17, int i18, int i19) {
        if (i19 != 2) {
            throw new n8.e(i17, i18, i19);
        }
        if (this.f335509c == i17 && this.f335508b == i18) {
            return false;
        }
        this.f335509c = i17;
        this.f335508b = i18;
        return true;
    }

    @Override // n8.f
    public boolean h() {
        n8.d0 d0Var;
        return this.f335518l && ((d0Var = this.f335510d) == null || d0Var.f335501r == 0);
    }

    @Override // n8.f
    public void reset() {
        this.f335510d = null;
        java.nio.ByteBuffer byteBuffer = n8.f.f335519a;
        this.f335513g = byteBuffer;
        this.f335514h = byteBuffer.asShortBuffer();
        this.f335515i = byteBuffer;
        this.f335508b = -1;
        this.f335509c = -1;
        this.f335516j = 0L;
        this.f335517k = 0L;
        this.f335518l = false;
    }
}
