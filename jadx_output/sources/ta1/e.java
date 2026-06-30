package ta1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f416610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.f f416611e;

    public e(ta1.f fVar, ta1.t0 t0Var) {
        this.f416611e = fVar;
        this.f416610d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseGameRecord.HardwareMgrImp", "hy: stopRecord, stop callback");
        this.f416611e.f416614c.clear();
        this.f416610d.a(0, 0, "ok", "");
    }
}
