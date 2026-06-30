package es2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.LinkedList linkedList, es2.h0 h0Var) {
        super(0);
        this.f256327d = linkedList;
        this.f256328e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        java.util.LinkedList linkedList = this.f256327d;
        java.util.Iterator it = linkedList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            es2.h0 h0Var = this.f256328e;
            boolean z18 = false;
            boolean z19 = h0Var.e(pVar, null, "mergePendingList") == es2.h.f256365e;
            java.lang.String str = h0Var.f256375h;
            if (z19) {
                java.util.Collection values = h0Var.f256371d.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                java.util.Collection<cs2.p> collection = values;
                if (!collection.isEmpty()) {
                    for (cs2.p pVar2 : collection) {
                        kotlin.jvm.internal.o.d(pVar2);
                        if (h0Var.k(pVar, pVar2)) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z17) {
                    java.util.LinkedList linkedList2 = h0Var.f256372e;
                    if (!(linkedList2 instanceof java.util.Collection) || !linkedList2.isEmpty()) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            if (h0Var.k(pVar, (cs2.p) it6.next())) {
                                break;
                            }
                        }
                    }
                    z18 = true;
                    if (!z18) {
                        it.remove();
                        com.tencent.mars.xlog.Log.i(str, "remove from " + pVar + " for noneInWaitingList");
                    }
                } else {
                    it.remove();
                    com.tencent.mars.xlog.Log.i(str, "remove from " + pVar + " for noneInLoadingMap");
                }
            } else {
                it.remove();
                com.tencent.mars.xlog.Log.i(str, "remove from " + pVar + " for isAcceptTask");
            }
        }
        kz5.g0.s(linkedList);
        return jz5.f0.f302826a;
    }
}
