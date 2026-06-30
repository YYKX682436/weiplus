package l83;

/* loaded from: classes14.dex */
public class d implements l83.k {

    /* renamed from: b, reason: collision with root package name */
    public j83.b f317096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f317097c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.l6 f317098d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f317099e;

    /* renamed from: f, reason: collision with root package name */
    public long f317100f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l83.l f317095a = new l83.l();

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.MMActivity mMActivity = this.f317099e;
        if (mMActivity != null) {
            mMActivity.setScreenEnable(!z17);
        }
        if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
            if (z17) {
                this.f317096b.a(false);
            } else {
                j83.b bVar = this.f317096b;
                bVar.a(bVar.f298164o);
            }
        }
    }

    public void b(boolean z17) {
        this.f317096b.a(z17);
    }

    public void c() {
        l83.h hVar = this.f317096b.f298162m;
        if (hVar == null || hVar.f317106c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRecorder", "start record");
        hVar.f317106c = true;
        synchronized (hVar.f317105b) {
            s75.d.b(new l83.f(hVar), "IPCallRecorder_startRecord");
        }
    }
}
