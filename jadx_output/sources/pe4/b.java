package pe4;

/* loaded from: classes15.dex */
public class b implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353695a;

    public b(pe4.m mVar) {
        this.f353695a = mVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: update mp auth key result: errcode: %d, errmsg: %s", java.lang.Integer.valueOf(cVar.f475605a), cVar.f475606b);
        pe4.m mVar = this.f353695a;
        mVar.a();
        if (cVar.a()) {
            pe4.m.g(mVar, false);
            pe4.n nVar = mVar.f353725i;
            if (nVar != null) {
                ((te4.a) nVar).f418596a.f171747i = (zt5.r) cVar.f256827c;
            }
        } else {
            re4.b0.a(2, cVar.f475605a, 1L);
        }
        int i17 = cVar.f475605a;
        re4.d0 d0Var = mVar.f353718b;
        if (i17 == 1006) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "hy: model is null");
            d0Var.f394526a = 90007;
            d0Var.f394527b = "auth key can not be retrieved";
            mVar.b();
            return;
        }
        if (i17 == 6) {
            cu5.b.f(mVar.f353724h);
            d0Var.f394526a = 90007;
            d0Var.f394527b = "auth key generate failed";
            mVar.b();
            return;
        }
        if (i17 == 1004) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: update auth key failed. remove auth key");
            cu5.b.f(mVar.f353724h);
            d0Var.f394526a = 90007;
            d0Var.f394527b = "auth key update error";
            mVar.b();
        }
    }
}
