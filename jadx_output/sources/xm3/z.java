package xm3;

/* loaded from: classes4.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455397e;

    public z(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, yz5.l lVar) {
        this.f455396d = mvvmList;
        this.f455397e = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object j17;
        ym3.d dVar = (ym3.d) obj;
        int i17 = dVar.f463147a.f463143a;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455396d;
        int i18 = mvvmList.f152073w.get();
        jz5.f0 f0Var = jz5.f0.f302826a;
        ym3.c cVar = dVar.f463147a;
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i(mvvmList.c(), "postLoadMoreTask getData not same loadId current:" + mvvmList.f152073w.get() + " resp:" + cVar.f463143a);
            return f0Var;
        }
        java.lang.String c17 = mvvmList.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getData continueFlag:");
        sb6.append(dVar.f463148b);
        sb6.append(" size:");
        java.util.ArrayList arrayList = dVar.f463149c;
        sb6.append(arrayList.size());
        sb6.append(" offset:");
        java.util.ArrayList arrayList2 = mvvmList.f152066p;
        sb6.append(arrayList2.size());
        sb6.append(" loadId:");
        sb6.append(cVar.f463143a);
        com.tencent.mars.xlog.Log.i(c17, sb6.toString());
        yz5.l lVar = this.f455397e;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
        mvvmList.f152062i = dVar.f463148b;
        if (dVar.f463151e) {
            arrayList2.addAll(arrayList);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xm3.d dVar2 = (xm3.d) it.next();
                if (!arrayList2.contains(dVar2)) {
                    arrayList2.add(dVar2);
                }
            }
        }
        mvvmList.k(false);
        com.tencent.mm.plugin.mvvmlist.MvvmList.m(mvvmList, xm3.i.f455326i, false, 2, null);
        mvvmList.h(new ym3.o(ym3.p.f463179d, dVar), 1);
        return (mvvmList.f152062i && mvvmList.f152058e.a() && (j17 = com.tencent.mm.plugin.mvvmlist.MvvmList.j(this.f455396d, cVar.f463143a, dVar.f463150d, 0, null, continuation, 12, null)) == pz5.a.f359186d) ? j17 : f0Var;
    }
}
