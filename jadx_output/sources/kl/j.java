package kl;

/* loaded from: classes13.dex */
public class j implements kl.l {

    /* renamed from: a, reason: collision with root package name */
    public int f308732a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f308733b = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni f308734c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f308735d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteBuffer f308736e;

    @Override // kl.l
    public byte[] a(byte[] bArr) {
        int ceil = ((int) java.lang.Math.ceil(((bArr.length / 2) / 2) * (this.f308733b / this.f308732a))) * 2 * 2;
        java.nio.ByteBuffer byteBuffer = this.f308736e;
        if (byteBuffer == null || byteBuffer.capacity() < ceil) {
            this.f308736e = java.nio.ByteBuffer.allocateDirect(ceil).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        java.nio.ByteBuffer resamplePcm = this.f308734c.resamplePcm(this.f308735d, this.f308732a, this.f308733b, bArr, bArr.length, this.f308736e);
        this.f308736e = resamplePcm;
        if (resamplePcm != null) {
            byte[] bArr2 = new byte[resamplePcm.remaining()];
            resamplePcm.get(bArr2);
            return bArr2;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.FFmpegResampleAlgorithm", "Failed to resample", null);
        return bArr;
    }

    @Override // kl.l
    public boolean b(java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19)};
        int i28 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.FFmpegResampleAlgorithm", "ffmpeg resample algorithm  sSample:%d, dSample:%d", objArr);
        this.f308732a = i17;
        this.f308733b = i19;
        this.f308735d = str;
        com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni audioFFmpegDecodeJni = new com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni();
        this.f308734c = audioFFmpegDecodeJni;
        audioFFmpegDecodeJni.initResample(str, i17, i19, 2, 2);
        return true;
    }

    @Override // kl.l
    public boolean release() {
        this.f308734c.clearResample(this.f308735d);
        return false;
    }
}
