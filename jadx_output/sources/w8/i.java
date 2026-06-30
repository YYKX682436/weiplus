package w8;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f443646e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f443647a;

    /* renamed from: b, reason: collision with root package name */
    public int f443648b;

    /* renamed from: c, reason: collision with root package name */
    public int f443649c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f443650d;

    public i(int i17) {
        this.f443650d = new byte[i17];
    }

    public void a(byte[] bArr, int i17, int i18) {
        if (this.f443647a) {
            int i19 = i18 - i17;
            byte[] bArr2 = this.f443650d;
            int length = bArr2.length;
            int i27 = this.f443648b;
            if (length < i27 + i19) {
                this.f443650d = java.util.Arrays.copyOf(bArr2, (i27 + i19) * 2);
            }
            java.lang.System.arraycopy(bArr, i17, this.f443650d, this.f443648b, i19);
            this.f443648b += i19;
        }
    }
}
