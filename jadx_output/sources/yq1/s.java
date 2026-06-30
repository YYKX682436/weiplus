package yq1;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f464466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464467e;

    public s(java.util.List list, int i17) {
        this.f464466d = list;
        this.f464467e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr1.c0 c0Var = lr1.c0.f320643a;
        java.util.List<ot0.l0> items = this.f464466d;
        kotlin.jvm.internal.o.g(items, "items");
        lr1.c0.f320646d = 0L;
        ((java.util.LinkedList) lr1.c0.f320647e).clear();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ot0.l0 l0Var : items) {
            java.util.LinkedList items2 = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(l0Var.f348574h, l0Var.f348573g).f348581i;
            kotlin.jvm.internal.o.f(items2, "items");
            kz5.h0.u(arrayList, items2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String str = ((ot0.s0) next).f348762e;
            if (str == null ? false : hy4.i.l(str)) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            int i17 = this.f464467e;
            if (!hasNext) {
                linkedList.size();
                c0Var.a(linkedList, i17);
                return;
            }
            ot0.s0 s0Var = (ot0.s0) it6.next();
            r45.u9 u9Var = new r45.u9();
            java.lang.String Url = s0Var.f348762e;
            u9Var.f387147e = Url;
            lr1.c0 c0Var2 = lr1.c0.f320643a;
            kotlin.jvm.internal.o.f(Url, "Url");
            u9Var.f387146d = c0Var2.b(Url);
            u9Var.f387149g = s0Var.f348770o;
            u9Var.f387150h = s0Var.L;
            if (i17 != 0) {
                if (s0Var.I == 1) {
                    u9Var.f387148f = 3;
                } else {
                    u9Var.f387148f = 1;
                }
                linkedList.add(u9Var);
            } else if (s0Var.I == 1) {
                u9Var.f387148f = 2;
                linkedList.add(u9Var);
            }
        }
    }
}
