package pe4;

/* loaded from: classes15.dex */
public class e implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353699a;

    public e(pe4.m mVar) {
        this.f353699a = mVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a aVar = (eu5.a) eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "request authentication result errCode: %d, errMsg: %s", java.lang.Integer.valueOf(aVar.f475605a), aVar.f475606b);
        pe4.m mVar = this.f353699a;
        mVar.f353708j = false;
        if (aVar.a()) {
            mVar.f353715q.postDelayed(new pe4.d(this, aVar), 500L);
            return;
        }
        re4.b0.a(3, aVar.f475605a, 1L);
        int i17 = aVar.f475605a;
        re4.d0 d0Var = mVar.f353718b;
        if (i17 == 1007 || i17 == 1015) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: start authen error, maybe key invalid. remove former key and give suggestion");
            cu5.b.f(mVar.f353724h);
            d0Var.f394526a = 90007;
            d0Var.f394527b = "start fingerprint authen failed";
        } else if (i17 == 1021) {
            d0Var.f394526a = 90010;
            d0Var.f394527b = "authenticate freeze. please try again later";
        } else {
            d0Var.f394526a = 90007;
            d0Var.f394527b = "authenticate error: " + aVar.f475606b;
        }
        mVar.b();
    }
}
