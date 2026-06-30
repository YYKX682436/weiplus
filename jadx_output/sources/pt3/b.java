package pt3;

/* loaded from: classes4.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        pt3.b bVar = com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155649g;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "delete fun");
        l75.k0 k0Var = gm0.j1.u().f273153f;
        kotlin.jvm.internal.o.f(k0Var, "getDataDB(...)");
        pt3.a aVar = new pt3.a(k0Var);
        int count = aVar.getCount();
        if (count == 0) {
            return;
        }
        if (count > 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeSeeProvider", "delete count error, count: " + count + ' ');
        }
        aVar.delete(com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155655p);
    }

    public final void b(java.lang.String weSeeUri, long j17) {
        kotlin.jvm.internal.o.g(weSeeUri, "weSeeUri");
        pt3.b bVar = com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155649g;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "insert fun");
        l75.k0 k0Var = gm0.j1.u().f273153f;
        kotlin.jvm.internal.o.f(k0Var, "getDataDB(...)");
        pt3.a aVar = new pt3.a(k0Var);
        pt3.c cVar = new pt3.c();
        cVar.field_weSeeUri = weSeeUri;
        cVar.field_time = j17;
        if (aVar.getCount() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "insert weseeProvider:" + weSeeUri + ", time:" + j17);
            aVar.insert(cVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeSeeProvider", "update weseeProvider:" + weSeeUri + ", time:" + j17);
        aVar.update((long) com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155655p, cVar);
    }
}
