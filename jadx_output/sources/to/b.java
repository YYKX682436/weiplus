package to;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f420880a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f420881b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f420882c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f420883d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f420884e = 0;

    public int a() {
        int i17 = this.f420883d;
        int i18 = this.f420884e;
        if (i17 == i18) {
            return 0;
        }
        if (i17 < i18) {
            this.f420881b = i18 - i17;
        } else if (i17 > i18) {
            this.f420881b = (i18 + this.f420880a) - i17;
        }
        return this.f420881b;
    }

    public int b(byte[] bArr, int i17) {
        int i18 = -1;
        if (i17 > 0 && i17 <= a() && bArr != null) {
            int i19 = this.f420883d;
            int i27 = this.f420884e;
            if (i19 == i27) {
                return -1;
            }
            i18 = 0;
            if (i19 < i27) {
                java.lang.System.arraycopy(this.f420882c, i19, bArr, 0, i17);
                this.f420883d += i17;
            } else {
                int i28 = this.f420880a;
                if (i17 <= i28 - i19) {
                    java.lang.System.arraycopy(this.f420882c, i19, bArr, 0, i17);
                    this.f420883d += i17;
                } else {
                    java.lang.System.arraycopy(this.f420882c, i19, bArr, 0, i28 - i19);
                    byte[] bArr2 = this.f420882c;
                    int i29 = this.f420880a;
                    int i37 = this.f420883d;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i29 - i37, i17 - (i29 - i37));
                    this.f420883d = i17 - (this.f420880a - this.f420883d);
                }
            }
        }
        return i18;
    }
}
