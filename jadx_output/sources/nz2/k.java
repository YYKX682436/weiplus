package nz2;

/* loaded from: classes9.dex */
public class k implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public int f341561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.d f341562b;

    public k(nz2.n nVar, nz2.d dVar) {
        this.f341562b = dVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "authorize pay result: %s, %s", java.lang.Integer.valueOf(cVar.f341543a), null);
        nz2.e a17 = nz2.e.a(cVar);
        boolean z17 = a17.f341549a == 0;
        nz2.d dVar = this.f341562b;
        if (z17) {
            a17.f341550b++;
            dVar.onSuccess(a17);
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f341561a;
        if (i17 >= 1) {
            a17.f341550b++;
            this.f341561a = currentTimeMillis;
        }
        if (!(a17.f341549a == 1) || a17.f341550b >= 3 || i17 < 1) {
            dVar.onFail(a17);
        } else {
            dVar.onRetry(a17);
        }
    }
}
