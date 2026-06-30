package tl;

/* loaded from: classes14.dex */
public class y extends tl.f0 {

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioRecord f420178d;

    /* renamed from: f, reason: collision with root package name */
    public final tl.c f420180f;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f420182h;

    /* renamed from: i, reason: collision with root package name */
    public final int f420183i;

    /* renamed from: j, reason: collision with root package name */
    public final int f420184j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f420185k;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f420179e = null;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f420181g = null;

    /* renamed from: l, reason: collision with root package name */
    public final android.media.AudioRecord.OnRecordPositionUpdateListener f420186l = new tl.x(this);

    public y(android.media.AudioRecord audioRecord, tl.c cVar, boolean z17, int i17, int i18) {
        this.f420178d = audioRecord;
        this.f420180f = cVar;
        this.f420182h = z17;
        this.f420183i = i17;
        this.f420184j = i18;
    }

    @Override // tl.f0
    public boolean a() {
        if (this.f420179e != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
            return false;
        }
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("RecordModeAsyncCallback_handlerThread", 10);
        this.f420179e = a17;
        a17.start();
        this.f420178d.setRecordPositionUpdateListener(this.f420186l, com.tencent.mm.sdk.platformtools.n3.createFreeHandler(this.f420179e.getLooper()));
        this.f420178d.setPositionNotificationPeriod(this.f420183i);
        boolean z17 = this.f420182h;
        int i18 = this.f420184j;
        if (z17 || this.f420181g == null) {
            this.f420181g = new byte[i18];
        }
        int read = this.f420178d.read(this.f420181g, 0, i18);
        tl.c cVar = this.f420180f;
        if (cVar == null || read <= 0) {
            return true;
        }
        cVar.b(this.f420181g, read);
        return true;
    }

    @Override // tl.f0
    public void b() {
        this.f420178d.setRecordPositionUpdateListener(null);
        this.f420178d = null;
        this.f420179e.quit();
        this.f420179e = null;
    }

    @Override // tl.f0
    public void c(boolean z17) {
        this.f420185k = z17;
    }
}
