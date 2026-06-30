package pc3;

/* loaded from: classes7.dex */
public final class l implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f353381d;

    public l(pc3.m mVar) {
        this.f353381d = mVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onBindingDied " + name);
        je3.i.t8(je3.k.f299298e, "magicbrush", "onBindingDied", "", null, 0.0f, 24, null);
        pc3.m.a(this.f353381d, true);
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(android.content.ComponentName name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onNullBinding " + name);
        je3.i.t8(je3.k.f299298e, "magicbrush", "onNullBinding", "", null, 0.0f, 24, null);
        pc3.m.a(this.f353381d, true);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(binder, "binder");
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onServiceConnected " + name);
        int i17 = com.tencent.mm.plugin.magicbrush.m4.f148073d;
        android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
        com.tencent.mm.plugin.magicbrush.n4 l4Var = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.plugin.magicbrush.n4)) ? new com.tencent.mm.plugin.magicbrush.l4(binder) : (com.tencent.mm.plugin.magicbrush.n4) queryLocalInterface;
        pc3.m mVar = this.f353381d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onServerMgrReady");
        je3.k.f299298e.t6("", "magicbrush", com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene.BIND_SERVICE, java.lang.System.currentTimeMillis() - mVar.f353384c, kotlin.jvm.internal.o.b(mVar.f353386e, java.lang.Boolean.TRUE) ? "1" : kotlin.jvm.internal.o.b(mVar.f353386e, java.lang.Boolean.FALSE) ? "2" : "0", 1.0E-5f);
        mVar.f353384c = 0L;
        com.tencent.mm.plugin.magicbrush.a5.f147838c = true;
        mVar.f353385d = l4Var;
        java.util.Collection<rc3.w0> values = mVar.f353383b.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (rc3.w0 w0Var : values) {
            w0Var.getClass();
            w0Var.T(new rc3.f0(w0Var, l4Var));
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        pc3.k kVar = new pc3.k(mVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 60000L, false);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "onServiceDisconnected " + name);
        je3.i.t8(je3.k.f299298e, "magicbrush", "onServiceDisconnected", "", null, 0.001f, 8, null);
        pc3.m.a(this.f353381d, true);
    }
}
