package rr;

/* loaded from: classes9.dex */
public final class g implements rr.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.n f399127a;

    public g(rr.n nVar) {
        this.f399127a = nVar;
    }

    @Override // rr.o
    public void a(boolean z17) {
        rr.n nVar = this.f399127a;
        if (z17) {
            new pr.b(0, 4, kz5.b0.c(nVar.f399137c.getMd5())).l().K(new rr.f(nVar));
        } else {
            rr.n.a(nVar, false);
        }
    }
}
