package n81;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f335620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.util.List list) {
        super(0);
        this.f335619d = str;
        this.f335620e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n81.p pVar = n81.p.f335628a;
        java.util.List a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.luggage.sdk.processes.s) it.next()).f47684a);
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        java.lang.String str = this.f335619d;
        if (X0.contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSweeperLogic", "cleanBlock for " + str + ", app is alive, skip clean");
            return 0L;
        }
        long b17 = n81.p.b(n81.p.f335628a, this.f335620e);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSweeperLogic", "cleanBlock for " + str + ", cleaned " + b17 + " bytes");
        return java.lang.Long.valueOf(b17);
    }
}
