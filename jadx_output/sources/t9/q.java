package t9;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f416543a;

    /* renamed from: b, reason: collision with root package name */
    public int f416544b;

    /* renamed from: c, reason: collision with root package name */
    public int f416545c;

    /* renamed from: d, reason: collision with root package name */
    public int f416546d = 0;

    public q(byte[] bArr, int i17, int i18) {
        this.f416543a = bArr;
        this.f416545c = i17;
        this.f416544b = i18;
        a();
    }

    public final void a() {
        int i17;
        int i18 = this.f416545c;
        t9.a.d(i18 >= 0 && (i18 < (i17 = this.f416544b) || (i18 == i17 && this.f416546d == 0)));
    }

    public boolean b(int i17) {
        int i18 = this.f416545c;
        int i19 = i17 / 8;
        int i27 = i18 + i19;
        int i28 = (this.f416546d + i17) - (i19 * 8);
        if (i28 > 7) {
            i27++;
            i28 -= 8;
        }
        while (true) {
            i18++;
            if (i18 > i27 || i27 >= this.f416544b) {
                break;
            }
            if (h(i18)) {
                i27++;
                i18 += 2;
            }
        }
        int i29 = this.f416544b;
        if (i27 >= i29) {
            return i27 == i29 && i28 == 0;
        }
        return true;
    }

    public boolean c() {
        int i17 = this.f416545c;
        int i18 = this.f416546d;
        int i19 = 0;
        while (this.f416545c < this.f416544b && !d()) {
            i19++;
        }
        boolean z17 = this.f416545c == this.f416544b;
        this.f416545c = i17;
        this.f416546d = i18;
        return !z17 && b((i19 * 2) + 1);
    }

    public boolean d() {
        boolean z17 = (this.f416543a[this.f416545c] & (128 >> this.f416546d)) != 0;
        i();
        return z17;
    }

    public int e(int i17) {
        int i18;
        this.f416546d += i17;
        int i19 = 0;
        while (true) {
            i18 = this.f416546d;
            if (i18 <= 8) {
                break;
            }
            int i27 = i18 - 8;
            this.f416546d = i27;
            byte[] bArr = this.f416543a;
            int i28 = this.f416545c;
            i19 |= (bArr[i28] & 255) << i27;
            if (!h(i28 + 1)) {
                r3 = 1;
            }
            this.f416545c = i28 + r3;
        }
        byte[] bArr2 = this.f416543a;
        int i29 = this.f416545c;
        int i37 = ((-1) >>> (32 - i17)) & (i19 | ((bArr2[i29] & 255) >> (8 - i18)));
        if (i18 == 8) {
            this.f416546d = 0;
            this.f416545c = i29 + (h(i29 + 1) ? 2 : 1);
        }
        a();
        return i37;
    }

    public final int f() {
        int i17 = 0;
        while (!d()) {
            i17++;
        }
        return ((1 << i17) - 1) + (i17 > 0 ? e(i17) : 0);
    }

    public int g() {
        int f17 = f();
        return (f17 % 2 == 0 ? -1 : 1) * ((f17 + 1) / 2);
    }

    public final boolean h(int i17) {
        if (2 <= i17 && i17 < this.f416544b) {
            byte[] bArr = this.f416543a;
            if (bArr[i17] == 3 && bArr[i17 - 2] == 0 && bArr[i17 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        int i17 = this.f416546d + 1;
        this.f416546d = i17;
        if (i17 == 8) {
            this.f416546d = 0;
            int i18 = this.f416545c;
            this.f416545c = i18 + (h(i18 + 1) ? 2 : 1);
        }
        a();
    }

    public void j(int i17) {
        int i18 = this.f416545c;
        int i19 = i17 / 8;
        int i27 = i18 + i19;
        this.f416545c = i27;
        int i28 = this.f416546d + (i17 - (i19 * 8));
        this.f416546d = i28;
        if (i28 > 7) {
            this.f416545c = i27 + 1;
            this.f416546d = i28 - 8;
        }
        while (true) {
            i18++;
            if (i18 > this.f416545c) {
                a();
                return;
            } else if (h(i18)) {
                this.f416545c++;
                i18 += 2;
            }
        }
    }
}
