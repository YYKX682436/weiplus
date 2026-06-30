package uh1;

/* loaded from: classes15.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.n1 f427819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.l1 f427820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.o1 f427821f;

    public k1(uh1.o1 o1Var, uh1.n1 n1Var, uh1.l1 l1Var) {
        this.f427821f = o1Var;
        this.f427819d = n1Var;
        this.f427820e = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start reslove ");
        uh1.n1 n1Var = this.f427819d;
        sb6.append(n1Var.f427843b);
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", sb6.toString());
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.net.nsd.NsdServiceInfo nsdServiceInfo = new android.net.nsd.NsdServiceInfo();
        java.lang.String str = n1Var.f427843b;
        nsdServiceInfo.setServiceName(str);
        nsdServiceInfo.setServiceType(n1Var.f427844c);
        this.f427821f.getClass();
        ((android.net.nsd.NsdManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("servicediscovery")).resolveService(nsdServiceInfo, new uh1.j1(this, countDownLatch));
        try {
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LocalServiceMgr", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "finish reslove " + str + " trhead id=" + java.lang.Thread.currentThread().getId());
    }
}
