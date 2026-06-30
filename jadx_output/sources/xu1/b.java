package xu1;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public xu1.c f457188a;

    /* renamed from: b, reason: collision with root package name */
    public java.net.Socket f457189b;

    public b() {
        xu1.c cVar = xu1.c.f457190d;
        this.f457188a = cVar;
        com.tencent.mars.xlog.Log.i("ScreenRecord.Main", "try socket init ");
        this.f457188a = cVar;
        java.net.Socket socket = new java.net.Socket();
        this.f457189b = socket;
        com.tencent.mars.xlog.Log.i("ScreenRecord.Main", "socket:" + this.f457189b + ',' + socket);
    }
}
