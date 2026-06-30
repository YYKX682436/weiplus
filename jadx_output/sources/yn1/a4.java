package yn1;

/* loaded from: classes11.dex */
public final class a4 implements com.tencent.wechat.aff.migration.b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f463607b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f463608c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.migration.a f463609d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f463610e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f463606a = "MM.Mig.MigrationProviderImpl";

    /* renamed from: f, reason: collision with root package name */
    public final yn1.u2 f463611f = new yn1.u2(this);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f463612g = jz5.h.b(new yn1.t2(this));

    public static final void a(yn1.a4 a4Var) {
        if (a4Var.f463608c) {
            return;
        }
        synchronized (a4Var) {
            if (a4Var.f463608c) {
                return;
            }
            a4Var.f463608c = true;
            com.tencent.mars.xlog.Log.i(a4Var.f463606a, "startRecover");
            ((ku5.t0) ku5.t0.f312615d).r(fo1.i.f264877d, "RoamBackup.MediaPullObserver");
        }
    }

    public final vn1.m b() {
        return (vn1.m) ((jz5.n) this.f463612g).getValue();
    }
}
