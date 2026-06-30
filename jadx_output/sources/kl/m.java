package kl;

/* loaded from: classes13.dex */
public class m implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f308737a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f308738b = 0;

    /* renamed from: c, reason: collision with root package name */
    public short[] f308739c;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        int length = kl.a.a(bArr, bArr.length).length - 1;
        int length2 = (int) (r9.length * (this.f308738b / this.f308737a));
        short[] sArr = this.f308739c;
        if (sArr == null || sArr.length != length2) {
            this.f308739c = new short[length2];
        }
        java.util.Arrays.fill(this.f308739c, 0, length2, (short) 0);
        for (int i17 = 0; i17 < length2; i17++) {
            float f17 = (i17 * this.f308737a) / this.f308738b;
            int i18 = (int) f17;
            float f18 = f17 - i18;
            this.f308739c[i17] = (short) (((1.0f - f18) * r9[i18]) + (f18 * r9[i18 == length ? length : i18 + 1]));
        }
        return kl.a.d(this.f308739c);
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.LinearResampleAlgorithm", "linear resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f308737a = i17;
        this.f308738b = i19;
        return true;
    }

    @Override // kl.l
    public boolean release() {
        return false;
    }
}
