package xl;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioRecord f455092a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455093b;

    /* renamed from: c, reason: collision with root package name */
    public final int f455094c;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f455097f;

    /* renamed from: h, reason: collision with root package name */
    public xl.f f455099h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f455095d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f455096e = new xl.e(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f455098g = false;

    public g(int i17, int i18, int i19, int i27, int i28) {
        this.f455093b = 12;
        if (i19 == 2) {
            this.f455093b = 12;
        } else {
            this.f455093b = 16;
        }
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i18, this.f455093b, i27) * i28;
        this.f455094c = minBufferSize;
        this.f455092a = new android.media.AudioRecord(i17, i18, this.f455093b, i27, minBufferSize);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecorderPcm", "mAudioSource:%d, mSampleRate:%d mAudioChannel:%d mAudioFormat:%d mBufferSize:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f455093b), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(minBufferSize));
    }
}
