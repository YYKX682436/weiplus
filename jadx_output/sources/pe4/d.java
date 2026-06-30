package pe4;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu5.a f353697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe4.e f353698e;

    public d(pe4.e eVar, eu5.a aVar) {
        this.f353698e = eVar;
        this.f353697d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zt5.s sVar = (zt5.s) this.f353697d.f256827c;
        pe4.e eVar = this.f353698e;
        if (sVar == null) {
            pe4.m mVar = eVar.f353699a;
            re4.d0 d0Var = mVar.f353718b;
            d0Var.f394526a = 90007;
            d0Var.f394527b = "signatureResult is null";
            mVar.b();
            return;
        }
        pe4.m mVar2 = eVar.f353699a;
        re4.d0 d0Var2 = mVar2.f353718b;
        d0Var2.f394526a = 0;
        d0Var2.f394527b = "OK";
        d0Var2.f394528c = (byte) 1;
        d0Var2.f394529d = sVar.f475629j;
        d0Var2.f394530e = sVar.f475630k;
        if (mVar2.f353720d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        } else {
            mVar2.a();
            mVar2.f353720d.obtainMessage(0, mVar2.f353718b).sendToTarget();
        }
    }
}
