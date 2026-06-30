package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class h implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final ym3.c f115409d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f115410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource f115411f;

    public h(com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource finderLiveAtGroupSearchDataSource, ym3.c request, u26.k0 channel) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f115411f = finderLiveAtGroupSearchDataSource;
        this.f115409d = request;
        this.f115410e = channel;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.util.List list;
        if (vVar != null) {
            if ((kotlin.jvm.internal.o.b(vVar.f351157b, this.f115411f.f115398f) ? vVar : null) != null) {
                int i17 = vVar.f351158c;
                u26.k0 k0Var = this.f115410e;
                if (i17 != 0) {
                    u26.s.a(k0Var, null, 1, null);
                    return;
                }
                ym3.d dVar = new ym3.d(this.f115409d);
                java.util.List resultList = vVar.f351160e;
                kotlin.jvm.internal.o.f(resultList, "resultList");
                int i18 = 0;
                p13.y yVar = (p13.y) kz5.n0.a0(resultList, 0);
                if (yVar != null) {
                    yVar.f351203u = vVar.f351159d;
                } else {
                    yVar = null;
                }
                if (yVar != null && (list = yVar.f351196n) != null) {
                    for (java.lang.Object obj : list) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.l) obj).f351114e, true);
                        java.util.ArrayList arrayList = dVar.f463149c;
                        kotlin.jvm.internal.o.d(n17);
                        com.tencent.mm.plugin.finder.ui.at.t tVar = new com.tencent.mm.plugin.finder.ui.at.t(i18, n17, 2);
                        tVar.f128905h = vVar.f351159d;
                        arrayList.add(tVar);
                        i18 = i19;
                    }
                }
                k0Var.e(dVar);
            }
        }
    }
}
