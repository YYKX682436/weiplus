package es2;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.LinkedList linkedList, es2.h0 h0Var, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        super(0);
        this.f256332d = linkedList;
        this.f256333e = h0Var;
        this.f256334f = linkedList2;
        this.f256335g = linkedList3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        es2.h0 h0Var;
        boolean z17;
        java.util.LinkedList linkedList = this.f256332d;
        java.util.Iterator it = linkedList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            h0Var = this.f256333e;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            cs2.p pVar = (cs2.p) next;
            if (!(h0Var.e(pVar, null, "mergePreload") == es2.h.f256365e)) {
                it.remove();
                com.tencent.mars.xlog.Log.i(h0Var.f256375h, "remove from  preloadList " + pVar);
            }
        }
        kz5.g0.s(linkedList);
        cs2.p pVar2 = (cs2.p) kz5.n0.Z(linkedList);
        java.util.LinkedList linkedList2 = this.f256334f;
        if (pVar2 != null) {
            java.util.Collection values = h0Var.f256371d.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Collection collection = values;
            if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                java.util.Iterator it6 = collection.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    cs2.p pVar3 = (cs2.p) it6.next();
                    kotlin.jvm.internal.o.d(pVar3);
                    if (h0Var.k(pVar2, pVar3)) {
                        z17 = false;
                        break;
                    }
                }
            }
            java.lang.String str = h0Var.f256375h;
            if (z17) {
                java.util.Collection<cs2.p> values2 = h0Var.f256371d.values();
                kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
                for (cs2.p pVar4 : values2) {
                    com.tencent.mars.xlog.Log.i(str, "loadingMap add to removeLoadingList " + pVar4);
                    linkedList2.add(pVar4.f222092i2);
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "preloadList remove " + pVar2 + " for loading.");
                linkedList.remove(pVar2);
            }
        }
        java.util.Iterator it7 = linkedList2.iterator();
        while (it7.hasNext()) {
            cs2.p a17 = h0Var.a((java.lang.String) it7.next(), false, "mergePreload");
            if (a17 != null) {
                this.f256335g.addFirst(a17);
            }
        }
        return jz5.f0.f302826a;
    }
}
