package ne4;

/* loaded from: classes9.dex */
public class l implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public d50.o f336564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f336565b;

    public l(d50.o oVar, int i17) {
        this.f336564a = oVar;
        this.f336565b = i17;
    }

    @Override // du5.d
    public void a() {
    }

    @Override // du5.d
    public void b() {
        d50.o oVar = this.f336564a;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
    }

    @Override // du5.d
    public void d() {
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
    }

    @Override // du5.d
    public void f() {
        d50.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "request authorize failed");
        if (this.f336565b != 1 || (oVar = this.f336564a) == null) {
            return;
        }
        oVar.c(1, new eu5.a());
    }
}
