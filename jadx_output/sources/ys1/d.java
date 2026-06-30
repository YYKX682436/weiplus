package ys1;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ys1.a f465137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.o83 f465138b;

    public d(ys1.a aVar, r45.o83 o83Var) {
        this.f465137a = aVar;
        this.f465138b = o83Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.o83 req = this.f465138b;
        ys1.a aVar = this.f465137a;
        if (aVar != null) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            r45.q83 q83Var = fVar instanceof r45.q83 ? (r45.q83) fVar : null;
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r2 r2Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.r2) aVar;
            kotlin.jvm.internal.o.g(req, "req");
            if (i17 != 0 && i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcher", "sendGetA8KeyLiteRequest:" + i17 + ", " + i18 + ", " + str);
            } else if (q83Var != null) {
                long j17 = r2Var.f94424a;
                java.util.HashMap hashMap = r2Var.f94425b;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcher", "GetA8KeyLiteResponse: " + q83Var.f383761h.size());
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
                java.util.LinkedList<r45.k83> DomainInfos = q83Var.f383760g;
                kotlin.jvm.internal.o.f(DomainInfos, "DomainInfos");
                for (r45.k83 k83Var : DomainInfos) {
                    java.lang.String str3 = k83Var.f378486d;
                    if (str3 != null) {
                        k83Var.f378489g = java.lang.System.currentTimeMillis();
                        ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94446b.i()).H(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.g(str3, false, 2, null), k83Var.toByteArray());
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcher", "save preauth domain:" + str3 + ' ' + k83Var.f378487e + ' ' + k83Var.f378488f);
                    }
                }
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new com.tencent.mm.plugin.brandservice.ui.timeline.preload.q2(q83Var, j17, req, hashMap, null), 3, null);
            }
        }
        try {
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ys1.f.f465143c;
            java.util.LinkedList ReqInfo = req.f382027n;
            kotlin.jvm.internal.o.f(ReqInfo, "ReqInfo");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(ReqInfo, 10));
            java.util.Iterator it = ReqInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.n83) it.next()).f381153e);
            }
            concurrentSkipListSet.removeAll(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebPrefetcherPreAuther", "[TRACE_PREFETCH-preAuth] Concurrent Remove Exception: " + e17.getMessage());
        }
    }
}
