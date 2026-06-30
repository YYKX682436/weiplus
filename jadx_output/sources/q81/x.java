package q81;

/* loaded from: classes7.dex */
public enum x implements q81.z {
    _INSTANCE;


    /* renamed from: e, reason: collision with root package name */
    public volatile pq5.g f360729e;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f360728d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f360730f = new java.util.concurrent.ConcurrentSkipListSet();

    x() {
    }

    public static void a(q81.x xVar) {
        xVar.getClass();
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but disconnected");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f360728d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f360730f).clear();
            }
            return;
        }
        if (!gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but account not ready");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f360728d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f360730f).clear();
            }
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i17 = com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? 1 : com.tencent.mars.comm.NetStatusUtil.is2G(context) ? 2 : com.tencent.mars.comm.NetStatusUtil.is3G(context) ? 4 : com.tencent.mars.comm.NetStatusUtil.is4G(context) ? 8 : -1;
        java.util.LinkedList<t81.c> linkedList = new java.util.LinkedList();
        t81.d dVar = (t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class);
        dVar.getClass();
        linkedList.addAll(dVar.D0("networkType=?", java.lang.String.valueOf(0)));
        t81.d dVar2 = (t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class);
        dVar2.getClass();
        for (t81.c cVar : dVar2.D0("networkType<>?", java.lang.String.valueOf(0))) {
            if ((cVar.field_networkType & i17) > 0) {
                linkedList.add(cVar);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but records empty, interrupt");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f360728d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f360730f).clear();
            }
            return;
        }
        boolean z17 = q81.y.f360731a;
        for (t81.c cVar2 : linkedList) {
            if (!z17 || cVar2.field_type != 0) {
                xVar.f360729e.K(new q81.u(xVar, cVar2));
            }
        }
        xVar.f360729e.K(new q81.w(xVar));
    }

    @Override // q81.z
    public synchronized void h() {
        if (this.f360729e != null) {
            this.f360729e.B();
        }
        this.f360728d = false;
        ((java.util.concurrent.ConcurrentSkipListSet) this.f360730f).clear();
    }

    @Override // q81.z
    public synchronized void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        if (!gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, account not ready");
            if (this.f360729e != null) {
                this.f360729e.B();
            }
            this.f360728d = false;
            ((java.util.concurrent.ConcurrentSkipListSet) this.f360730f).clear();
            return;
        }
        if (this.f360728d) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, set flag queue running");
        this.f360728d = true;
        this.f360729e = pq5.h.a();
        this.f360729e.i(new q81.t(this));
    }

    @Override // q81.z
    public boolean k(java.lang.String str) {
        return !u46.l.e(str) && ((java.util.concurrent.ConcurrentSkipListSet) this.f360730f).contains(str);
    }
}
