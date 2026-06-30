package i01;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i01.b f286496d;

    public a(i01.b bVar) {
        this.f286496d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f286496d.f286498d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer update isUpdating and ret");
            return;
        }
        long j17 = this.f286496d.f286499e.getLong("trace_config_last_update_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - j17 > 86400000 || j17 > currentTimeMillis) {
            this.f286496d.a();
            this.f286496d.f286498d = true;
            c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this.f286496d);
            c01.d9.e().a(160, this.f286496d);
            c01.d9.e().g(new f21.g0(21));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer last update time: " + j17 + " current time: " + currentTimeMillis + " in same day");
    }
}
