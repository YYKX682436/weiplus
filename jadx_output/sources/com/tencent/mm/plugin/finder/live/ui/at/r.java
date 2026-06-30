package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class r implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f115419d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f115420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneSearchDataSource f115421f;

    public r(com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneSearchDataSource finderLiveAtSomeoneSearchDataSource, ym3.c request, u26.k0 channel) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f115421f = finderLiveAtSomeoneSearchDataSource;
        this.f115419d = request;
        this.f115420e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17;
        if (vVar != null) {
            if ((kotlin.jvm.internal.o.b(vVar.f351157b, this.f115421f.f115400e) ? vVar : null) != null) {
                int i18 = vVar.f351158c;
                u26.k0 k0Var = this.f115420e;
                if (i18 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f115419d);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                java.util.Iterator it = resultList.iterator();
                while (true) {
                    i17 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    p13.y yVar = (p13.y) it.next();
                    if (kz5.c0.i(1, 15).contains(java.lang.Integer.valueOf(yVar.f351185c))) {
                        arrayList.add(yVar);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                java.util.ArrayList arrayList2 = dVar.f463149c;
                if (arrayList != null) {
                    for (java.lang.Object obj : arrayList) {
                        int i19 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        p13.y yVar2 = (p13.y) obj;
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f351187e, true);
                        kotlin.jvm.internal.o.d(n17);
                        com.tencent.mm.plugin.finder.ui.at.t tVar = new com.tencent.mm.plugin.finder.ui.at.t(i17, n17, 2);
                        tVar.f128904g = yVar2;
                        tVar.f128905h = vVar.f351159d;
                        arrayList2.add(tVar);
                        i17 = i19;
                    }
                } else {
                    com.tencent.mm.plugin.finder.ui.at.t tVar2 = new com.tencent.mm.plugin.finder.ui.at.t(0, new com.tencent.mm.storage.z3(), 4);
                    tVar2.f128904g = null;
                    tVar2.f128905h = vVar.f351159d;
                    arrayList2.add(tVar2);
                }
                k0Var.e(dVar);
            }
        }
    }
}
