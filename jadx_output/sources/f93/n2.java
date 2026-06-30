package f93;

/* loaded from: classes.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260396d = arrayList;
        this.f260397e = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f93.n2(this.f260396d, this.f260397e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Set linkedHashSet;
        java.lang.String D0;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.storage.h4 wi6 = b93.r.wi();
        if (wi6 == null) {
            return null;
        }
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String u17 = wi6.u1(this.f260396d);
        if (u17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelRecommendUI", "doBatchSaveLabels: selectedLabelIdStr is null");
            return null;
        }
        java.util.List f07 = r26.n0.f0(u17, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f07.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doBatchSaveLabels: users=");
        java.util.ArrayList arrayList2 = this.f260397e;
        sb6.append(arrayList2.size());
        sb6.append(", selectedIds=");
        sb6.append(X0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
            if (n17 == null || (D0 = n17.D0()) == null) {
                linkedHashSet = new java.util.LinkedHashSet();
            } else {
                java.util.List f08 = r26.n0.f0(D0, new java.lang.String[]{","}, false, 0, 6, null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : f08) {
                    if (((java.lang.String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                linkedHashSet = kz5.n0.W0(arrayList3);
            }
            java.util.Set set = linkedHashSet;
            set.addAll(X0);
            java.lang.String g07 = kz5.n0.g0(set, ",", null, null, 0, null, null, 62, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "doBatchSaveLabels: user=" + str + ", mergedIds=" + g07);
            if (n17 != null) {
                n17.r1(g07);
                Bi.p0(str, n17);
            }
            r45.gw6 gw6Var = new r45.gw6();
            gw6Var.f375582e = g07;
            gw6Var.f375581d = str;
            linkedList.add(gw6Var);
        }
        return linkedList;
    }
}
