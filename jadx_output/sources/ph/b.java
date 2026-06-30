package ph;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f354253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph.t f354254e;

    public b(ph.t tVar) {
        this.f354254e = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph.t tVar = this.f354254e;
        if (tVar.f354290e) {
            return;
        }
        if (!wh.m.w(tVar.f354286a)) {
            long j17 = this.f354253d;
            tVar.getClass();
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                tVar.d(j17);
            } else {
                tVar.m().post(new ph.l(tVar, j17));
            }
        }
        long j18 = this.f354253d;
        if (j18 <= 300000) {
            android.os.Handler m17 = tVar.m();
            this.f354253d += 300000;
            m17.postDelayed(this, 300000L);
        } else if (j18 <= 600000) {
            android.os.Handler m18 = tVar.m();
            this.f354253d += 1200000;
            m18.postDelayed(this, 1200000L);
        }
    }
}
