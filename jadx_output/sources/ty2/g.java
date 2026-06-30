package ty2;

/* loaded from: classes9.dex */
public final class g extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final ty2.o f423066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f423107g, config);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f423066d = new ty2.o(context, a());
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        ty2.c cVar = this.f423060c.f423131f;
        ty2.f fVar = cVar instanceof ty2.f ? (ty2.f) cVar : null;
        if (fVar == null) {
            fVar = new ty2.f(ty2.e.f423064d);
        }
        java.util.LinkedList linkedList = item.A;
        kotlin.jvm.internal.o.f(linkedList, "getShowBoxItems(...)");
        java.util.List list = (java.util.List) fVar.f423065a.invoke(linkedList);
        boolean isEmpty = list.isEmpty();
        ty2.o oVar = this.f423066d;
        if (isEmpty) {
            oVar.c();
            return null;
        }
        int i17 = this.f423060c.f423130e;
        oVar.getClass();
        oVar.c();
        oVar.f423095f = i17;
        java.util.List list2 = oVar.f423096g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((bw5.o5) obj).f30949d == 6) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ty2.k((bw5.o5) it.next(), oVar.f423094e.getAndIncrement(), null, null));
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
        arrayList3.addAll(arrayList2);
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ty2.k kVar = (ty2.k) it6.next();
            oVar.f423097h.put(java.lang.Integer.valueOf(kVar.f423074b), kotlinx.coroutines.l.d(v65.m.a(oVar), null, null, new ty2.n(oVar, kVar, null), 3, null));
        }
        return oVar;
    }
}
