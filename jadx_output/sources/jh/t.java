package jh;

/* loaded from: classes13.dex */
public class t implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public jh.r f299753d;

    /* renamed from: e, reason: collision with root package name */
    public final jh.m f299754e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f299755f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f299756g;

    /* renamed from: h, reason: collision with root package name */
    public final jh.f0 f299757h;

    /* renamed from: i, reason: collision with root package name */
    public final long f299758i;

    public t(jh.m mVar, android.content.Context context, jh.f0 f0Var, long j17) {
        this.f299758i = 0L;
        this.f299754e = mVar;
        if (this.f299755f == null) {
            this.f299755f = new android.os.Handler(android.os.Looper.getMainLooper(), this);
        }
        this.f299756g = context;
        this.f299757h = f0Var;
        this.f299758i = java.lang.Math.max(j17, 3000L);
    }

    public void a(jh.s sVar) {
        int size;
        int ordinal = this.f299757h.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            android.content.Context context = this.f299756g;
            synchronized (this) {
                jh.r rVar = this.f299753d;
                if (rVar != null) {
                    synchronized (rVar) {
                        ((java.util.HashSet) rVar.f299747f).remove(sVar);
                        size = ((java.util.HashSet) rVar.f299747f).size();
                    }
                    if (size == 0) {
                        oj.j.c("Matrix.WarmUpScheduler", "Unregister idle receiver.", new java.lang.Object[0]);
                        context.unregisterReceiver(this.f299753d);
                        this.f299753d = null;
                    }
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        jh.m mVar = this.f299754e;
        if (i17 == 1) {
            mVar.f299728d.a(new jh.c(mVar, (android.os.CancellationSignal) message.obj), "warm-up");
            return false;
        }
        if (i17 == 2) {
            mVar.f299728d.a(new jh.f(mVar, (android.os.CancellationSignal) message.obj), "consuming-up");
            return false;
        }
        if (i17 == 3) {
            mVar.f299728d.a(new jh.e(mVar, (android.os.CancellationSignal) message.obj), "clean-up");
            return false;
        }
        if (i17 != 4) {
            return false;
        }
        mVar.f299728d.a(new jh.h(mVar, (android.os.CancellationSignal) message.obj), "compute-disk-usage");
        return false;
    }
}
