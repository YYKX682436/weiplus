package w36;

/* loaded from: classes16.dex */
public class b implements l36.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l36.w0 f442770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w36.h f442771e;

    public b(w36.h hVar, l36.w0 w0Var) {
        this.f442771e = hVar;
        this.f442770d = w0Var;
    }

    @Override // l36.o
    public void a(l36.n nVar, l36.a1 a1Var) {
        try {
            this.f442771e.a(a1Var);
            ((l36.o0) m36.a.f323382a).getClass();
            o36.j jVar = ((l36.u0) nVar).f315652e.f351738b;
            jVar.f();
            o36.d b17 = jVar.b();
            o36.c cVar = new o36.c(b17, true, b17.f342766i, b17.f342767j, jVar);
            try {
                this.f442771e.f442784b.getClass();
                this.f442771e.d("OkHttp WebSocket " + this.f442770d.f315681a.n(), cVar);
                jVar.b().f342762e.setSoTimeout(0);
                this.f442771e.e();
            } catch (java.lang.Exception e17) {
                this.f442771e.c(e17, null);
            }
        } catch (java.net.ProtocolException e18) {
            this.f442771e.c(e18, a1Var);
            m36.e.c(a1Var);
        }
    }

    @Override // l36.o
    public void d(l36.n nVar, java.io.IOException iOException) {
        this.f442771e.c(iOException, null);
    }
}
