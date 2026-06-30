package nz2;

/* loaded from: classes9.dex */
public class s implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public int f341570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.d f341571b;

    public s(nz2.x xVar, nz2.d dVar) {
        this.f341571b = dVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "authorize pay result: %s, %s", java.lang.Integer.valueOf(cVar.f341543a), null);
        nz2.e a17 = nz2.e.a(cVar);
        boolean z17 = a17.f341549a == 0;
        nz2.d dVar = this.f341571b;
        if (z17) {
            a17.f341550b++;
            dVar.onSuccess(a17);
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f341570a;
        if (i17 >= 1) {
            a17.f341550b++;
            this.f341570a = currentTimeMillis;
        }
        int i18 = a17.f341549a;
        if ((i18 == 1) && i17 >= 1) {
            dVar.onRetry(a17);
            return;
        }
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "do fast, do nothing");
        } else {
            dVar.onFail(a17);
        }
    }
}
