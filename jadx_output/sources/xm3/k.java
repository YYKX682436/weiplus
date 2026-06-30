package xm3;

/* loaded from: classes4.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.i f455336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xm3.n0 f455337f;

    public k(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, xm3.i iVar, xm3.n0 n0Var) {
        this.f455335d = mvvmList;
        this.f455336e = iVar;
        this.f455337f = n0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object j17;
        ym3.d dVar = (ym3.d) obj;
        int i17 = dVar.f463147a.f463143a;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f455335d;
        int i18 = mvvmList.f152073w.get();
        jz5.f0 f0Var = jz5.f0.f302826a;
        ym3.c cVar = dVar.f463147a;
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i(mvvmList.c(), "create getData not same loadId current:" + mvvmList.f152073w.get() + " resp:" + cVar.f463143a);
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
        mvvmList.l(this.f455336e, false);
        mvvmList.h(new ym3.o(ym3.p.f463179d, dVar), 0);
        return (mvvmList.f152062i && this.f455337f.a() && (j17 = com.tencent.mm.plugin.mvvmlist.MvvmList.j(this.f455335d, cVar.f463143a, dVar.f463150d, 0, null, continuation, 12, null)) == pz5.a.f359186d) ? j17 : f0Var;
    }
}
