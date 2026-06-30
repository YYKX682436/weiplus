package ph;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f354268e;

    public l(ph.t tVar, long j17) {
        this.f354267d = tVar;
        this.f354268e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354267d.d(this.f354268e);
    }
}
