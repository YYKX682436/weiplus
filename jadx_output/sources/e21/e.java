package e21;

/* loaded from: classes11.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f246504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e21.f f246505e;

    public e(e21.f fVar, java.util.ArrayList arrayList) {
        this.f246505e = fVar;
        this.f246504d = arrayList;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        e21.g gVar;
        r45.j25 j25Var;
        java.util.LinkedList linkedList;
        if (m1Var.getType() == 681 && (gVar = ((e21.j) m1Var).f246537e) != null) {
            gVar.getClass();
            r45.i25 i25Var = gVar.f246521b.f246528a;
            int i19 = ((r45.b50) ((e21.h) gVar.getReqObj()).f246523a.f375784d.f371295e.getLast()).f370530d;
            e21.f fVar = this.f246505e;
            final java.util.ArrayList arrayList = this.f246504d;
            if (i25Var != null && (j25Var = i25Var.f376688e) != null && (linkedList = j25Var.f377518e) != null) {
                final int intValue = linkedList.size() > 0 ? ((java.lang.Integer) i25Var.f376688e.f377518e.getLast()).intValue() : -1;
                final r45.g25 g25Var = i25Var.f376688e.f377519f.size() > 0 ? (r45.g25) i25Var.f376688e.f377519f.getLast() : new r45.g25();
                java.util.List list = (java.util.List) fVar.f246514d.get(i19);
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xg3.d0) it.next()).u0(intValue, g25Var, (xg3.q0) arrayList.get(0));
                    }
                }
                fs.g.c(xg3.e0.class, java.lang.Integer.valueOf(i19), new fs.o() { // from class: e21.e$$b
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        ((h13.a0) ((xg3.e0) nVar)).b(intValue, g25Var, (xg3.q0) arrayList.get(0));
                        return false;
                    }
                });
                java.util.List list2 = (java.util.List) fVar.f246515e.get(i19);
                if (list2 != null) {
                    java.util.Iterator it6 = list2.iterator();
                    if (it6.hasNext()) {
                        android.support.v4.media.f.a(it6.next());
                        r45.j25 j25Var2 = i25Var.f376688e;
                        java.util.LinkedList linkedList2 = j25Var2.f377518e;
                        java.util.LinkedList linkedList3 = j25Var2.f377519f;
                        throw null;
                    }
                    return;
                }
                return;
            }
            java.util.List list3 = (java.util.List) fVar.f246514d.get(i19);
            if (list3 != null) {
                java.util.Iterator it7 = list3.iterator();
                while (it7.hasNext()) {
                    ((xg3.d0) it7.next()).u0(-1, new r45.g25(), (xg3.q0) arrayList.get(0));
                }
            }
            fs.g.c(xg3.e0.class, java.lang.Integer.valueOf(i19), new fs.o() { // from class: e21.e$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    ((h13.a0) ((xg3.e0) nVar)).b(-1, new r45.g25(), (xg3.q0) arrayList.get(0));
                    return false;
                }
            });
            java.util.List list4 = (java.util.List) fVar.f246515e.get(i19);
            if (list4 != null) {
                java.util.Iterator it8 = list4.iterator();
                if (it8.hasNext()) {
                    android.support.v4.media.f.a(it8.next());
                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                    java.util.LinkedList linkedList5 = new java.util.LinkedList();
                    for (int i27 = 0; i27 < arrayList.size(); i27++) {
                        linkedList4.add(new r45.g25());
                        linkedList5.add(-1);
                    }
                    throw null;
                }
            }
        }
    }
}
