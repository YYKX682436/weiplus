package ph;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354275e;

    public p(ph.t tVar, int i17) {
        this.f354274d = tVar;
        this.f354275e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354274d.g(this.f354275e);
    }
}
