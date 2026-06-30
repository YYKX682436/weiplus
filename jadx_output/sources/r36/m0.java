package r36;

/* loaded from: classes16.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f369440a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f369441b = new int[10];

    public int a() {
        if ((this.f369440a & 128) != 0) {
            return this.f369441b[7];
        }
        return 65535;
    }

    public r36.m0 b(int i17, int i18) {
        if (i17 >= 0) {
            int[] iArr = this.f369441b;
            if (i17 < iArr.length) {
                this.f369440a = (1 << i17) | this.f369440a;
                iArr[i17] = i18;
            }
        }
        return this;
    }
}
