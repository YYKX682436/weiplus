package n0;

/* loaded from: classes14.dex */
public final class i1 implements n0.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f333533a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f333534b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f333535c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f333536d;

    public i1(java.util.Set abandoning) {
        kotlin.jvm.internal.o.g(abandoning, "abandoning");
        this.f333533a = abandoning;
        this.f333534b = new java.util.ArrayList();
        this.f333535c = new java.util.ArrayList();
        this.f333536d = new java.util.ArrayList();
    }

    public final void a() {
        java.util.Set set = this.f333533a;
        if (!set.isEmpty()) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                n0.e4 e4Var = (n0.e4) it.next();
                it.remove();
                e4Var.c();
            }
        }
    }

    public final void b() {
        java.util.List list = this.f333535c;
        boolean z17 = !list.isEmpty();
        java.util.Set set = this.f333533a;
        if (z17) {
            int size = ((java.util.ArrayList) list).size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                }
                n0.e4 e4Var = (n0.e4) ((java.util.ArrayList) list).get(size);
                if (!set.contains(e4Var)) {
                    e4Var.d();
                }
            }
        }
        java.util.List list2 = this.f333534b;
        if (!list2.isEmpty()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list2;
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                n0.e4 e4Var2 = (n0.e4) arrayList.get(i17);
                set.remove(e4Var2);
                e4Var2.b();
            }
        }
    }

    public void c(n0.e4 instance) {
        kotlin.jvm.internal.o.g(instance, "instance");
        java.util.List list = this.f333534b;
        int lastIndexOf = ((java.util.ArrayList) list).lastIndexOf(instance);
        if (lastIndexOf < 0) {
            ((java.util.ArrayList) this.f333535c).add(instance);
        } else {
            ((java.util.ArrayList) list).remove(lastIndexOf);
            this.f333533a.remove(instance);
        }
    }

    public void d(n0.e4 instance) {
        kotlin.jvm.internal.o.g(instance, "instance");
        java.util.List list = this.f333535c;
        int lastIndexOf = ((java.util.ArrayList) list).lastIndexOf(instance);
        if (lastIndexOf < 0) {
            ((java.util.ArrayList) this.f333534b).add(instance);
        } else {
            ((java.util.ArrayList) list).remove(lastIndexOf);
            this.f333533a.remove(instance);
        }
    }
}
