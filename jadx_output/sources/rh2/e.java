package rh2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rh2.e f395641a = new rh2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.qq.wx.voice.vad.VoiceRecognizeNative f395642b = new com.qq.wx.voice.vad.VoiceRecognizeNative();

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f395643c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f395644d;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.p f395645e;

    public final void a() {
        synchronized (this) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KWSEngine", "Destroying KWSEngine");
            if (f395643c != -1) {
                try {
                    com.qq.wx.voice.vad.VoiceRecognizeNative voiceRecognizeNative = f395642b;
                    voiceRecognizeNative.End(f395643c);
                    voiceRecognizeNative.Release(f395643c);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.KWSEngine", "Error releasing engine: " + e17.getMessage());
                }
                f395643c = -1L;
            }
            f395644d = false;
            f395645e = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.KWSEngine", "KWSEngine destroyed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x00f4, Exception -> 0x00f6, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f6, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0048, B:9:0x004c, B:14:0x0058, B:16:0x0087, B:18:0x00a7, B:36:0x00af, B:37:0x00c4), top: B:2:0x000e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.e.b():void");
    }
}
