package qd0;

@j95.b
/* loaded from: classes9.dex */
public final class c extends i95.w implements rd0.s0 {
    public void wi(java.lang.String str, java.lang.String str2) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        if (str2 == null || r26.n0.N(str2)) {
            return;
        }
        g15.b a17 = ti3.c.f419579a.a(str);
        if (a17 == null) {
            a17 = new g15.b();
        }
        java.util.LinkedList n17 = a17.n();
        a17.k();
        a17.n().size();
        if (5 <= n17.size()) {
            n17.removeFirst();
        }
        g15.c cVar = new g15.c();
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (!kotlin.jvm.internal.o.b("notify@all", (java.lang.String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        cVar.k(new java.util.LinkedList(arrayList2));
        if (cVar.j().isEmpty()) {
            return;
        }
        n17.addLast(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneRecentFeatureService", "updateAtSomeoneRecord " + n17.size() + ' ' + str2);
        pm0.v.X(new qd0.b(str, n17));
    }
}
