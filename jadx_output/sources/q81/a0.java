package q81;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.plugin.appbrand.utils.a, wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f360691d;

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (!gm0.j1.b().f273254q) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask", "retry but account not ready");
            q81.e0.f360704g.h();
            return;
        }
        be1.y E = be1.z.E(com.tencent.mm.sdk.platformtools.x2.f193071a);
        switch (E) {
            case None:
            case Unknown:
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask", "networkType(" + E + ") invalid, skip");
                return;
            case Mobile_2g:
                i17 = 2;
                break;
            case Mobile_3g:
                i17 = 4;
                break;
            case Mobile_4g:
            case Mobile_5g:
                i17 = 8;
                break;
            case Wifi:
                i17 = 1;
                break;
            default:
                i17 = -1;
                break;
        }
        java.util.LinkedList<t81.c> linkedList = new java.util.LinkedList();
        t81.d dVar = (t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class);
        dVar.getClass();
        boolean z17 = false;
        linkedList.addAll(dVar.D0("networkType=?", java.lang.String.valueOf(0)));
        t81.d dVar2 = (t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class);
        dVar2.getClass();
        java.util.List<t81.c> D0 = dVar2.D0("networkType<>?", java.lang.String.valueOf(0));
        kotlin.jvm.internal.o.f(D0, "getCmdsUnderSpecificNetType(...)");
        for (t81.c cVar : D0) {
            if ((cVar.field_networkType & i17) > 0) {
                linkedList.add(cVar);
            }
        }
        for (t81.c cVar2 : linkedList) {
            if (cVar2.field_type == 0) {
                q81.e0 e0Var = q81.e0.f360704g;
                e0Var.getClass();
                e0Var.a(new q81.d0(cVar2));
            } else {
                z17 = true;
            }
        }
        yz5.a aVar = this.f360691d;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("notifyQueueCallback");
            throw null;
        }
        aVar.invoke();
        if (z17) {
            q81.x._INSTANCE.j();
        }
    }
}
