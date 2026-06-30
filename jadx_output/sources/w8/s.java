package w8;

/* loaded from: classes15.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f443758a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f443759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443760c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f443761d;

    /* renamed from: e, reason: collision with root package name */
    public int f443762e;

    public s(int i17, int i18) {
        this.f443758a = i17;
        byte[] bArr = new byte[i18 + 3];
        this.f443761d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i17, int i18) {
        if (this.f443759b) {
            int i19 = i18 - i17;
            byte[] bArr2 = this.f443761d;
            int length = bArr2.length;
            int i27 = this.f443762e;
            if (length < i27 + i19) {
                this.f443761d = java.util.Arrays.copyOf(bArr2, (i27 + i19) * 2);
            }
            java.lang.System.arraycopy(bArr, i17, this.f443761d, this.f443762e, i19);
            this.f443762e += i19;
        }
    }

    public boolean b(int i17) {
        if (!this.f443759b) {
            return false;
        }
        this.f443762e -= i17;
        this.f443759b = false;
        this.f443760c = true;
        return true;
    }

    public void c() {
        this.f443759b = false;
        this.f443760c = false;
    }

    public void d(int i17) {
        t9.a.d(!this.f443759b);
        boolean z17 = i17 == this.f443758a;
        this.f443759b = z17;
        if (z17) {
            this.f443762e = 3;
            this.f443760c = false;
        }
    }
}
