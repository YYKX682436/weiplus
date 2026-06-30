package n8;

/* loaded from: classes13.dex */
public final class x implements n8.f {

    /* renamed from: b, reason: collision with root package name */
    public int f335587b;

    /* renamed from: c, reason: collision with root package name */
    public int f335588c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f335589d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f335590e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f335591f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f335592g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f335593h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f335594i;

    public x() {
        java.nio.ByteBuffer byteBuffer = n8.f.f335519a;
        this.f335592g = byteBuffer;
        this.f335593h = byteBuffer;
        this.f335587b = -1;
        this.f335588c = -1;
    }

    @Override // n8.f
    public boolean a() {
        return this.f335590e;
    }

    @Override // n8.f
    public void b(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f335587b * 2)) * this.f335591f.length * 2;
        if (this.f335592g.capacity() < length) {
            this.f335592g = java.nio.ByteBuffer.allocateDirect(length).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f335592g.clear();
        }
        while (position < limit) {
            for (int i17 : this.f335591f) {
                this.f335592g.putShort(byteBuffer.getShort((i17 * 2) + position));
            }
            position += this.f335587b * 2;
        }
        byteBuffer.position(limit);
        this.f335592g.flip();
        this.f335593h = this.f335592g;
    }

    @Override // n8.f
    public int c() {
        int[] iArr = this.f335591f;
        return iArr == null ? this.f335587b : iArr.length;
    }

    @Override // n8.f
    public int d() {
        return 2;
    }

    @Override // n8.f
    public void e() {
        this.f335594i = true;
    }

    @Override // n8.f
    public java.nio.ByteBuffer f() {
        java.nio.ByteBuffer byteBuffer = this.f335593h;
        this.f335593h = n8.f.f335519a;
        return byteBuffer;
    }

    @Override // n8.f
    public void flush() {
        this.f335593h = n8.f.f335519a;
        this.f335594i = false;
    }

    @Override // n8.f
    public boolean g(int i17, int i18, int i19) {
        boolean z17 = !java.util.Arrays.equals(this.f335589d, this.f335591f);
        int[] iArr = this.f335589d;
        this.f335591f = iArr;
        if (iArr == null) {
            this.f335590e = false;
            return z17;
        }
        if (i19 != 2) {
            throw new n8.e(i17, i18, i19);
        }
        if (!z17 && this.f335588c == i17 && this.f335587b == i18) {
            return false;
        }
        this.f335588c = i17;
        this.f335587b = i18;
        this.f335590e = i18 != iArr.length;
        int i27 = 0;
        while (true) {
            int[] iArr2 = this.f335591f;
            if (i27 >= iArr2.length) {
                return true;
            }
            int i28 = iArr2[i27];
            if (i28 >= i18) {
                throw new n8.e(i17, i18, i19);
            }
            this.f335590e = (i28 != i27) | this.f335590e;
            i27++;
        }
    }

    @Override // n8.f
    public boolean h() {
        return this.f335594i && this.f335593h == n8.f.f335519a;
    }

    @Override // n8.f
    public void reset() {
        flush();
        this.f335592g = n8.f.f335519a;
        this.f335587b = -1;
        this.f335588c = -1;
        this.f335591f = null;
        this.f335590e = false;
    }
}
