package hh;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f281435a;

    /* renamed from: c, reason: collision with root package name */
    public long f281437c;

    /* renamed from: d, reason: collision with root package name */
    public long f281438d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f281439e;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f281436b = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f281440f = new hh.e(this);

    public f(long j17, java.lang.Object obj, boolean z17) {
        this.f281439e = false;
        this.f281435a = obj;
        this.f281439e = z17;
    }

    public abstract java.lang.Object a();

    public void b(java.lang.Object obj) {
        ah.i.b("MicroMsg.SDK.SyncTask", "setResultFinish ", new java.lang.Object[0]);
        this.f281435a = obj;
        synchronized (this.f281436b) {
            ah.i.b("MicroMsg.SDK.SyncTask", "setResultFinish synchronized", new java.lang.Object[0]);
            this.f281436b.notify();
        }
    }
}
