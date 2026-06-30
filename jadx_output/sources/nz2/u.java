package nz2;

/* loaded from: classes9.dex */
public class u implements d50.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nz2.b f341574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.x f341575b;

    public u(nz2.x xVar, nz2.b bVar) {
        this.f341575b = xVar;
        this.f341574a = bVar;
    }

    @Override // d50.o
    public void a() {
    }

    @Override // d50.o
    public void b(eu5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "authentication success");
        this.f341575b.getClass();
        nz2.b bVar = this.f341574a;
        if (bVar != null) {
            bVar.a(nz2.c.b(aVar));
        }
    }

    @Override // d50.o
    public void c(int i17, eu5.a aVar) {
        re4.n.c(3, aVar.f475605a, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "authentication failed: %s", java.lang.Integer.valueOf(i17));
        nz2.b bVar = this.f341574a;
        if (i17 == 1) {
            if (bVar != null) {
                nz2.c cVar = new nz2.c();
                cVar.f341543a = 2002;
                bVar.a(cVar);
                return;
            }
            return;
        }
        if (aVar.f475605a == 1022) {
            ((ne4.n) this.f341575b.f341580d).a(true);
        }
        if (bVar != null) {
            bVar.a(nz2.c.b(aVar));
        }
    }
}
