package t9;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f416536a;

    /* renamed from: b, reason: collision with root package name */
    public int f416537b;

    /* renamed from: c, reason: collision with root package name */
    public int f416538c;

    /* renamed from: d, reason: collision with root package name */
    public int f416539d;

    public o(byte[] bArr, int i17) {
        this.f416536a = bArr;
        this.f416539d = i17;
    }

    public final void a() {
        int i17;
        int i18 = this.f416537b;
        t9.a.d(i18 >= 0 && (i18 < (i17 = this.f416539d) || (i18 == i17 && this.f416538c == 0)));
    }

    public int b() {
        return ((this.f416539d - this.f416537b) * 8) - this.f416538c;
    }

    public boolean c() {
        byte[] bArr = this.f416536a;
        int i17 = this.f416537b;
        byte b17 = bArr[i17];
        int i18 = this.f416538c;
        boolean z17 = (b17 & (128 >> i18)) != 0;
        int i19 = i18 + 1;
        this.f416538c = i19;
        if (i19 == 8) {
            this.f416538c = 0;
            this.f416537b = i17 + 1;
        }
        a();
        return z17;
    }

    public int d(int i17) {
        int i18;
        if (i17 == 0) {
            return 0;
        }
        this.f416538c += i17;
        int i19 = 0;
        while (true) {
            i18 = this.f416538c;
            if (i18 <= 8) {
                break;
            }
            int i27 = i18 - 8;
            this.f416538c = i27;
            byte[] bArr = this.f416536a;
            int i28 = this.f416537b;
            this.f416537b = i28 + 1;
            i19 |= (bArr[i28] & 255) << i27;
        }
        byte[] bArr2 = this.f416536a;
        int i29 = this.f416537b;
        int i37 = ((-1) >>> (32 - i17)) & (i19 | ((bArr2[i29] & 255) >> (8 - i18)));
        if (i18 == 8) {
            this.f416538c = 0;
            this.f416537b = i29 + 1;
        }
        a();
        return i37;
    }

    public void e(int i17) {
        int i18 = i17 / 8;
        this.f416537b = i18;
        this.f416538c = i17 - (i18 * 8);
        a();
    }

    public void f(int i17) {
        int i18 = i17 / 8;
        int i19 = this.f416537b + i18;
        this.f416537b = i19;
        int i27 = this.f416538c + (i17 - (i18 * 8));
        this.f416538c = i27;
        if (i27 > 7) {
            this.f416537b = i19 + 1;
            this.f416538c = i27 - 8;
        }
        a();
    }
}
