package j20;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j20.o f297222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.g f297223e;

    public f(j20.o oVar, j20.g gVar) {
        this.f297222d = oVar;
        this.f297223e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l Di = this.f297222d.Di();
        this.f297223e.a(101, ((java.lang.Number) Di.f302833d).floatValue(), ((java.lang.Number) Di.f302834e).floatValue());
    }
}
