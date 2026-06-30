package tr5;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr5.a0 f421453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr5.r f421454e;

    public b0(tr5.a0 a0Var, tr5.r rVar) {
        this.f421453d = a0Var;
        this.f421454e = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tr5.a0 a0Var = this.f421453d;
        java.util.Set c17 = a0Var.c();
        tr5.r rVar = this.f421454e;
        if (c17.contains(rVar)) {
            tr5.g0 c18 = rVar.c(a0Var.f421440a);
            boolean d17 = c18.f421493e.d();
            tr5.q qVar = c18.f421493e;
            if (d17 || qVar.b()) {
                c17.remove(rVar);
                tr5.c0.a(a0Var, rVar, qVar, c18.f421492d.f421511f);
            }
        }
    }
}
