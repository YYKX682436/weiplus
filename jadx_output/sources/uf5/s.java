package uf5;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final uf5.s f427295d = new uf5.s();

    public s() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uf5.l state = (uf5.l) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof uf5.x0)) {
            state.f427266e = true;
        }
        java.util.List list = state.f427267f;
        if (dVar != null && (dVar instanceof uf5.y0)) {
            state.f427266e = false;
            ((java.util.ArrayList) list).clear();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof uf5.c)) {
            uf5.c cVar = (uf5.c) dVar2;
            boolean z17 = cVar.f427205c;
            java.lang.String str = cVar.f427204b;
            if (z17) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            } else {
                ((java.util.ArrayList) list).remove(str);
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof uf5.d)) {
            uf5.d dVar4 = (uf5.d) dVar3;
            state.f427266e = false;
            ((java.util.ArrayList) list).clear();
            java.lang.String[] strArr = state.f427269h;
            if (strArr != null && (!dVar4.f427210b.isEmpty())) {
                java.util.HashSet hashSet = new java.util.HashSet(dVar4.f427210b);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : strArr) {
                    if (!hashSet.contains(str2)) {
                        arrayList2.add(str2);
                    }
                }
                state.f427269h = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
            }
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof uf5.c2)) {
            uf5.c2 c2Var = (uf5.c2) dVar5;
            java.util.Iterator it = c2Var.f427208b.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) list).remove((java.lang.String) it.next());
            }
            for (java.lang.String str3 : c2Var.f427209c) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                if (!arrayList3.contains(str3)) {
                    arrayList3.add(str3);
                }
            }
        }
        j75.d dVar6 = state.f298066d;
        if (dVar6 != null && (dVar6 instanceof uf5.a)) {
            ((java.util.ArrayList) list).remove(((uf5.a) dVar6).f427196b);
        }
        return jz5.f0.f302826a;
    }
}
