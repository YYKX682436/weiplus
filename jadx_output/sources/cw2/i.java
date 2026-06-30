package cw2;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f223758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f223759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f223760f;

    public i(cw2.o oVar, double d17, boolean z17) {
        this.f223758d = oVar;
        this.f223759e = d17;
        this.f223760f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f223758d.r(this.f223759e, this.f223760f, 1);
    }
}
