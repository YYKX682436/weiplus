package lc3;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f317911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.o f317912e;

    public n(yz5.l lVar, lc3.o oVar) {
        this.f317911d = lVar;
        this.f317912e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lc3.o oVar = this.f317912e;
        this.f317911d.invoke(kz5.n0.t0((java.util.Collection) oVar.o().invoke(), kz5.b0.c(oVar.t().c(oVar.s()))));
    }
}
