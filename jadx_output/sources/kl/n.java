package kl;

/* loaded from: classes13.dex */
public class n implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f308740a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f308741b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f308742c;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        short[] a17 = kl.a.a(bArr, bArr.length);
        int length = a17.length;
        int i17 = this.f308741b;
        int i18 = this.f308740a;
        int i19 = (length * i17) / i18;
        if (i17 % i18 != 0) {
            i19++;
        }
        short[] sArr = new short[i19];
        if (com.tencent.mm.audio.mix.jni.SilkResampleJni.resamplePcm(this.f308742c, i18, i17, a17, a17.length, sArr) != -1) {
            return kl.a.d(sArr);
        }
        java.lang.Object[] objArr = {this.f308742c};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "resamplePcm result is -1, fileName:%s", objArr);
        return null;
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f308740a = i17;
        this.f308741b = i19;
        this.f308742c = str;
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.SilkResampleAlgorithm", "initResample, fileName:%s, sSample:%d, dSample:%d", objArr);
        if (com.tencent.mm.audio.mix.jni.SilkResampleJni.initResample(str, i17, i19) != -1) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "initResample result is -1, fileName:%s", str);
        return false;
    }

    @Override // kl.l
    public boolean release() {
        if (com.tencent.mm.audio.mix.jni.SilkResampleJni.clearResample(this.f308742c) == -1) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.SilkResampleAlgorithm", "clearResample result is -1", null);
            return false;
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.SilkResampleAlgorithm", "release", null);
        return true;
    }
}
