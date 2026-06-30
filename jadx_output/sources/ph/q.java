package ph;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354277e;

    public q(ph.t tVar, int i17) {
        this.f354276d = tVar;
        this.f354277e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354276d.i(this.f354277e);
    }
}
