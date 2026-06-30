package uh1;

/* loaded from: classes15.dex */
public class i1 implements android.net.nsd.NsdManager.DiscoveryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.m1 f427802a;

    public i1(uh1.o1 o1Var, uh1.m1 m1Var) {
        this.f427802a = m1Var;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(java.lang.String str) {
        yc1.y yVar = (yc1.y) this.f427802a;
        yVar.f460819a.a(yVar.f460820b.get(), yVar.f460822d.o("ok"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStarted");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onDiscoveryStarted " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(java.lang.String str) {
        yc1.y yVar = (yc1.y) this.f427802a;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStopped");
        int i17 = yVar.f460821c.get();
        java.lang.String o17 = yVar.f460822d.o("ok");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = yVar.f460819a;
        lVar.a(i17, o17);
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, null, "stopScan", 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onDiscoveryStopped " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.y yVar = (yc1.y) this.f427802a;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceFound");
        uh1.o1 o1Var = uh1.o1.INSTANCE;
        yc1.x xVar = new yc1.x(yVar);
        o1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new uh1.k1(o1Var, n1Var, xVar), "LocalServiceMgr#resolveService");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onServicesFound " + nsdServiceInfo.getServiceType());
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ((yc1.y) this.f427802a).f460819a;
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, n1Var, "lost", 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onServiceLost " + nsdServiceInfo.getServiceType());
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(java.lang.String str, int i17) {
        yc1.y yVar = (yc1.y) this.f427802a;
        yVar.f460819a.a(yVar.f460820b.get(), yVar.f460822d.o("fail"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onStartDiscoveryFailed");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onStartDiscoveryFailed " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(java.lang.String str, int i17) {
        yc1.y yVar = (yc1.y) this.f427802a;
        yVar.f460819a.a(yVar.f460821c.get(), yVar.f460822d.o("fail"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onStopDiscoveryFailed");
        com.tencent.mars.xlog.Log.i("MicroMsg.LocalServiceMgr", "onStopDiscoveryFailed " + str);
    }
}
