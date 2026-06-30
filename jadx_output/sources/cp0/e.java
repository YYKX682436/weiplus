package cp0;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.b f220742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp0.f f220743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f220744f;

    public e(cp0.b bVar, cp0.f fVar, java.lang.Object obj) {
        this.f220742d = bVar;
        this.f220743e = fVar;
        this.f220744f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp0.f fVar = this.f220743e;
        this.f220742d.a(fVar.b(this.f220744f, fVar.f220745a));
    }
}
