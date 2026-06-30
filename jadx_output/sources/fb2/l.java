package fb2;

/* loaded from: classes2.dex */
public abstract class l {
    public static final java.lang.String a(r45.ww2 ww2Var) {
        kotlin.jvm.internal.o.g(ww2Var, "<this>");
        return pm0.v.u(ww2Var.getLong(14)) + '_' + ww2Var.getLong(0) + '_' + ww2Var.getInteger(7) + '_' + ww2Var.getList(4).size() + '_' + ww2Var.getString(2) + '_' + ww2Var.getString(1) + '_' + ww2Var.getString(13);
    }

    public static final so2.j5 b(r45.ww2 ww2Var, int i17) {
        kotlin.jvm.internal.o.g(ww2Var, "<this>");
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list = ww2Var.getList(4);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
            kotlin.jvm.internal.o.d(finderObject);
            if (hc2.o0.C(finderObject)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = tVar.j(arrayList, hc2.d0.d(i17), null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = ((java.util.ArrayList) j17).iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        if (ww2Var.getInteger(7) != 1) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).qk(ww2Var.getLong(14), null, hc2.d0.b(i17), ww2Var.getString(15), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
            return new com.tencent.mm.plugin.finder.feed.ys(ww2Var, ww2Var.getInteger(7), linkedList);
        }
        so2.i1 i1Var = new so2.i1(ww2Var);
        for (so2.j1 j1Var : i1Var.f()) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
            long itemId = j1Var.getItemId();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = j1Var.f410439d;
            r45.dm2 object_extend = finderObject2.getObject_extend();
            o3Var.qk(itemId, object_extend != null ? object_extend.getString(62) : null, hc2.d0.b(i17), finderObject2.getSessionBuffer(), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
        }
        com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", "[updateLiveList] tabType:" + i17 + ", live list:" + i1Var);
        if (i1Var.f().size() > 0) {
            return i1Var;
        }
        return null;
    }

    public static final so2.j5 c(r45.yw2 yw2Var) {
        kotlin.jvm.internal.o.g(yw2Var, "<this>");
        int integer = yw2Var.getInteger(2);
        if (integer == 1 || integer == 2) {
            return new so2.c2(yw2Var);
        }
        if (integer == 6) {
            return new so2.h4(yw2Var);
        }
        if (integer == 14) {
            return new so2.l3(yw2Var);
        }
        switch (integer) {
            case 8:
            case 9:
            case 10:
            case 11:
                return new so2.j4(yw2Var);
            default:
                return new com.tencent.mm.plugin.finder.feed.km(yw2Var);
        }
    }
}
