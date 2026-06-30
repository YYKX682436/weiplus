package fq3;

/* loaded from: classes12.dex */
public class l implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq3.n f265526d;

    public l(fq3.n nVar) {
        this.f265526d = nVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 == 5) {
            fq3.n nVar = this.f265526d;
            nVar.requireAccountInitialized();
            if (nVar.f265536u != null) {
                nVar.requireAccountInitialized();
                nVar.f265536u.a(new tq3.d(str));
            }
        }
    }
}
