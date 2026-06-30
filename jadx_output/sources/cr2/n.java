package cr2;

/* loaded from: classes2.dex */
public final class n extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221869a;

    public n(cr2.x xVar) {
        this.f221869a = xVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        cr2.x xVar = this.f221869a;
        com.tencent.mars.xlog.Log.i(xVar.f221901g, "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            com.tencent.mm.ui.MMActivity activity = xVar.f221895a;
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            if (((rq2.w) zVar.a(activity).a(rq2.w.class)) != null) {
                in5.c cVar = jVar.f293070a;
                if (cVar instanceof wp2.b) {
                    org.json.JSONObject g17 = cq2.r.f221444a.g(cVar, xVar.f221898d, jVar.f293074e);
                    wp2.b bVar = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                    if (bVar != null) {
                        ml2.d dVar = xVar.f221915u;
                        int i17 = jVar.f293074e;
                        ml2.x1 x1Var = ml2.x1.f328202f;
                        com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment fragment = xVar.f221897c;
                        kotlin.jvm.internal.o.g(fragment, "fragment");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                            str = "";
                        }
                        java.lang.String jSONObject = g17.toString();
                        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                        dVar.h(bVar, i17, x1Var, str, "", jSONObject);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w(xVar.f221901g, "handleExposeReport unknown feed:" + cVar);
                }
            }
        }
        sp2.j.f411054a.c(xVar.f221895a, recordsSet, java.lang.Integer.valueOf(xVar.b()));
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        cq2.r rVar = cq2.r.f221444a;
        cr2.x xVar = this.f221869a;
        er2.a aVar = xVar.f221898d;
        int i17 = item.f293074e;
        in5.c cVar = item.f293070a;
        org.json.JSONObject g17 = rVar.g(cVar, aVar, i17);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f410378e = g17;
        }
        sp2.j.f411054a.d(xVar.f221895a, item, g17, java.lang.Integer.valueOf(xVar.b()));
    }
}
