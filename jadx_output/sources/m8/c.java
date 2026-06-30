package m8;

/* loaded from: classes15.dex */
public final class c implements m8.u {

    /* renamed from: a, reason: collision with root package name */
    public final r9.o f324545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f324546b;

    /* renamed from: c, reason: collision with root package name */
    public final long f324547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f324548d;

    /* renamed from: e, reason: collision with root package name */
    public final long f324549e;

    /* renamed from: f, reason: collision with root package name */
    public int f324550f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f324551g;

    public c(r9.o oVar, int i17, int i18, long j17, long j18) {
        this.f324545a = oVar;
        this.f324546b = i17 * 1000;
        this.f324547c = i18 * 1000;
        this.f324548d = j17 * 1000;
        this.f324549e = j18 * 1000;
    }

    public final void a(boolean z17) {
        this.f324550f = 0;
        this.f324551g = false;
        if (z17) {
            r9.o oVar = this.f324545a;
            synchronized (oVar) {
                if (oVar.f393390a) {
                    synchronized (oVar) {
                        boolean z18 = oVar.f393393d > 0;
                        oVar.f393393d = 0;
                        if (z18) {
                            oVar.b();
                        }
                    }
                }
            }
        }
    }
}
