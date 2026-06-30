package ds2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f242908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f242910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f242911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f242912h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.LinkedList linkedList, ds2.b0 b0Var, java.util.List list, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        super(0);
        this.f242908d = linkedList;
        this.f242909e = b0Var;
        this.f242910f = list;
        this.f242911g = linkedList2;
        this.f242912h = linkedList3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        ds2.b0 b0Var;
        java.util.Iterator it = this.f242908d.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            boolean z17 = false;
            linkedList = this.f242911g;
            b0Var = this.f242909e;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            cs2.p pVar2 = (cs2.p) b0Var.f242855c.get(pVar.f222092i2);
            if (pVar2 != null) {
                if (pVar.f241805x == pVar2.f241805x && pVar.V1 == pVar2.V1 && pVar.field_requestVideoFormat == pVar2.field_requestVideoFormat && kotlin.jvm.internal.o.b(pVar.k(), pVar2.k())) {
                    z17 = true;
                }
                if (z17) {
                    it.remove();
                } else {
                    linkedList.add(pVar2.f222092i2);
                }
            }
        }
        for (java.util.Map.Entry entry : b0Var.f242855c.entrySet()) {
            if (!this.f242910f.contains(entry.getValue())) {
                linkedList.add(((cs2.p) entry.getValue()).f222092i2);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            cs2.p a17 = b0Var.a((java.lang.String) it6.next(), false, "mergePreload");
            if (a17 != null) {
                this.f242912h.addFirst(a17);
            }
        }
        return jz5.f0.f302826a;
    }
}
