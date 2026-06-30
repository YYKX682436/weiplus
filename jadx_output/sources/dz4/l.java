package dz4;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public boolean f245332c;

    /* renamed from: d, reason: collision with root package name */
    public dz4.j f245333d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f245334e;

    /* renamed from: f, reason: collision with root package name */
    public long f245335f;

    /* renamed from: g, reason: collision with root package name */
    public long f245336g;

    /* renamed from: h, reason: collision with root package name */
    public long f245337h;

    /* renamed from: i, reason: collision with root package name */
    public long f245338i;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f245330a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final int f245331b = 50;

    /* renamed from: j, reason: collision with root package name */
    public final dz4.k f245339j = new dz4.k(this);

    public final void a(java.lang.String playId) {
        kotlin.jvm.internal.o.g(playId, "playId");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "pauseMonitoring: " + this.f245332c + ", " + this.f245334e + ' ' + playId);
        if (this.f245332c && kotlin.jvm.internal.o.b(this.f245334e, playId)) {
            this.f245332c = false;
            this.f245330a.removeCallbacks(this.f245339j);
            long currentTimeMillis = this.f245336g + (java.lang.System.currentTimeMillis() - this.f245335f);
            this.f245338i = currentTimeMillis;
            this.f245336g = currentTimeMillis;
            long j17 = this.f245337h;
            double d17 = j17 > 0 ? e06.p.d(currentTimeMillis / j17, 0.0d, 1.0d) : 0.0d;
            dz4.j jVar = this.f245333d;
            if (jVar != null) {
                ((dz4.d0) jVar).a(d17, playId);
            }
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "stopMonitoring: ");
        this.f245332c = false;
        this.f245330a.removeCallbacks(this.f245339j);
    }
}
