package ph;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f354271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354272e;

    public n(ph.t tVar, boolean z17) {
        this.f354271d = tVar;
        this.f354272e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354271d.e(this.f354272e);
    }
}
