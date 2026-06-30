package tl;

/* loaded from: classes14.dex */
public class d0 extends tl.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f420029d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420030e;

    /* renamed from: f, reason: collision with root package name */
    public int f420031f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f420032g = 12800;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420033h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.os.HandlerThread f420034i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f420035j;

    /* renamed from: k, reason: collision with root package name */
    public final android.media.AudioRecord f420036k;

    /* renamed from: l, reason: collision with root package name */
    public final tl.b0 f420037l;

    /* renamed from: m, reason: collision with root package name */
    public to.b f420038m;

    /* renamed from: n, reason: collision with root package name */
    public tl.c f420039n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f420040o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f420041p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f420042q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f420043r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f420044s;

    public d0(android.media.AudioRecord audioRecord, boolean z17, int i17, tl.c cVar, boolean z18) {
        int i18 = pu5.i.f358473b;
        this.f420034i = pu5.f.a("RecordModeAsyncRead_record", 5);
        this.f420037l = new tl.b0(this);
        this.f420038m = null;
        this.f420040o = new java.lang.Object();
        this.f420041p = new byte[0];
        this.f420042q = new java.lang.Object();
        this.f420043r = null;
        this.f420044s = false;
        this.f420036k = audioRecord;
        this.f420029d = z17;
        this.f420030e = i17;
        this.f420039n = cVar;
        this.f420044s = z18;
    }

    @Override // tl.f0
    public boolean a() {
        int i17;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        synchronized (this.f420042q) {
            this.f420031f = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "[startRecord] dumpRunningTask:%s", ((ku5.t0) ku5.t0.f312616e).f());
        this.f420034i.start();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(this.f420034i.getLooper());
        this.f420035j = n3Var;
        n3Var.post(this.f420037l);
        this.f420035j.setLogging(false);
        if (true == this.f420044s) {
            this.f420038m = new to.b();
            this.f420032g = this.f420030e * 20;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", "audioBuffer init mAudioBufferSize: " + this.f420032g);
            to.b bVar = this.f420038m;
            int i18 = this.f420032g;
            bVar.getClass();
            if (i18 <= 0) {
                i17 = -1;
            } else {
                bVar.f420882c = new byte[i18];
                bVar.f420880a = i18;
                i17 = 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncRead", "audioBuffer init failed, error code = " + i17);
                z17 = false;
            } else {
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncRead", "initAudioBuffer failed");
                return false;
            }
            if (this.f420043r != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordModeAsyncRead", "startRecord failed : last record is NOT stopped now");
                return false;
            }
            this.f420043r = ((ku5.t0) ku5.t0.f312615d).e(new tl.a0(this), 60L, 20L);
        }
        return true;
    }

    @Override // tl.f0
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordModeAsyncRead", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        synchronized (this.f420042q) {
            this.f420031f = 3;
            this.f420037l.f420027d = new tl.z(this);
        }
        synchronized (this.f420041p) {
            this.f420041p.notify();
        }
    }

    @Override // tl.f0
    public void c(boolean z17) {
        this.f420033h = z17;
    }
}
