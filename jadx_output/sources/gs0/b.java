package gs0;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f274971a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.Surface f274972b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.p f274973c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f274974d;

    /* renamed from: e, reason: collision with root package name */
    public int f274975e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f274976f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f274977g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f274978h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f274979i;

    public b(es0.d videoCodecConfig, yz5.l lVar) {
        kotlin.jvm.internal.o.g(videoCodecConfig, "videoCodecConfig");
        this.f274971a = "MicroMsg.IMediaCodecTransEncoder";
        this.f274979i = new java.lang.Object();
    }

    public abstract void a(long j17);

    public abstract void b();

    public final android.view.Surface c() {
        android.view.Surface surface = this.f274972b;
        if (surface != null) {
            return surface;
        }
        kotlin.jvm.internal.o.o("codecSurface");
        throw null;
    }

    public abstract long d();

    public final void e(java.nio.ByteBuffer buffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(bufferInfo, "bufferInfo");
        com.tencent.mars.xlog.Log.i(this.f274971a, "processEncodeBuffer, buffer " + buffer + ", pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size + ", isMain: " + kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()));
        yz5.p pVar = this.f274973c;
        if (pVar != null) {
            pVar.invoke(buffer, bufferInfo);
        }
        this.f274975e++;
    }

    public abstract void f();
}
