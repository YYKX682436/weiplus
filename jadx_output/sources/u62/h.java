package u62;

/* loaded from: classes12.dex */
public class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy f424956d;

    public h(com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy) {
        this.f424956d = extControlProviderNearBy;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof an3.f) {
            com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy extControlProviderNearBy = this.f424956d;
            if (extControlProviderNearBy.f99902t == null) {
                return;
            }
            an3.f fVar = (an3.f) m1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend errcode: " + i18 + ", errType: " + i17);
            if (i17 == 0 && i18 == 0) {
                extControlProviderNearBy.f99898p = fVar.H();
                java.util.List list = extControlProviderNearBy.f99898p;
                if (list == null || list.size() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend list size:0");
                    extControlProviderNearBy.f99902t.countDown();
                } else {
                    if (extControlProviderNearBy.f99898p.size() > 10) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend size > 10," + extControlProviderNearBy.f99898p.size());
                        java.util.List list2 = extControlProviderNearBy.f99898p;
                        list2.subList(10, list2.size()).clear();
                    }
                    extControlProviderNearBy.f99903u = new java.util.concurrent.CountDownLatch(extControlProviderNearBy.f99898p.size());
                    extControlProviderNearBy.f99902t.countDown();
                    extControlProviderNearBy.getClass();
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.d1.Ai().d(extControlProviderNearBy);
                    if (extControlProviderNearBy.f99900r == null) {
                        extControlProviderNearBy.f99900r = new d95.e(com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.f99896z);
                    }
                    java.util.Iterator it = extControlProviderNearBy.f99898p.iterator();
                    while (it.hasNext()) {
                        extControlProviderNearBy.o((r45.b64) it.next());
                    }
                    extControlProviderNearBy.f99903u.countDown();
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend failed: errCode = " + i18 + ", errType=" + i17);
                extControlProviderNearBy.f99902t.countDown();
            }
            com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.n(extControlProviderNearBy);
        }
    }
}
