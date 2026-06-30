package zc4;

/* loaded from: classes4.dex */
public final class e extends ym3.a {
    @Override // ym3.a, ym3.f
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.j a(v65.i iVar, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        kotlinx.coroutines.flow.j a17 = a(iVar, (ym3.c) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        return a17;
    }

    @Override // ym3.a
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        androidx.lifecycle.c1 a17;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        java.util.List<xc4.p> c76 = gVar.c7(request);
        if (!(!c76.isEmpty())) {
            c76 = null;
        }
        if (c76 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", "=====request db data start key:" + request.f463146d + "=====");
            for (xc4.p pVar : c76) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", java.lang.String.valueOf(pVar));
                java.util.Iterator it = dVar.f463149c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((zc4.b) obj2).n().y0() == pVar.y0() && pVar.y0() != 0) {
                        break;
                    }
                }
                if (obj2 != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Improve.DataFlow", "sth. error,delete " + pVar);
                    gVar.R6(pVar, false, true);
                } else {
                    dVar.f463149c.add(new zc4.b(pVar, false, 2, null));
                }
            }
            dVar.f463148b = true;
            java.util.ArrayList arrayList = dVar.f463149c;
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (!((zc4.b) obj).n().isAd()) {
                    break;
                }
            }
            zc4.b bVar = (zc4.b) obj;
            if (bVar == null) {
                bVar = (zc4.b) kz5.n0.i0(dVar.f463149c);
            }
            dVar.f463150d = bVar.n().getStringSeq();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataFlow", "=====request db data finish key:" + dVar.f463150d + "=====");
        }
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b17, dVar, null), 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        return b17;
    }
}
