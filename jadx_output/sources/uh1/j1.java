package uh1;

/* loaded from: classes15.dex */
public class j1 implements android.net.nsd.NsdManager.ResolveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f427809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.k1 f427810b;

    public j1(uh1.k1 k1Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f427810b = k1Var;
        this.f427809a = countDownLatch;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onResolveFailed(android.net.nsd.NsdServiceInfo nsdServiceInfo, int i17) {
        uh1.l1 l1Var = this.f427810b.f427820e;
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.x xVar = (yc1.x) l1Var;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onResolveFailed");
        yc1.a.u(xVar.f460818a.f460819a, n1Var, "resolveFail", i17);
        this.f427809a.countDown();
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onServiceResolved(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.l1 l1Var = this.f427810b.f427820e;
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.x xVar = (yc1.x) l1Var;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceResolved");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = xVar.f460818a.f460819a;
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, n1Var, "found", 0);
        }
        this.f427809a.countDown();
    }
}
