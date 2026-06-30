package km1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f308998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f308999e;

    public g(km1.s sVar, boolean z17) {
        this.f308998d = sVar;
        this.f308999e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f308998d.f309028e.o(this.f308999e);
        km1.s sVar = this.f308998d;
        sVar.f309028e.setSurface(this.f308999e ? null : sVar.f309034n);
    }
}
