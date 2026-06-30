package g4;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f268382a;

    /* renamed from: b, reason: collision with root package name */
    public int f268383b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayDeque f268384c = new java.util.ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final g4.e1 f268385d = new g4.e1();

    public final void a(g4.l1 event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean z17 = event instanceof g4.i1;
        java.util.ArrayDeque arrayDeque = this.f268384c;
        int i17 = 0;
        g4.e1 e1Var = this.f268385d;
        if (!z17) {
            if (!(event instanceof g4.f1)) {
                if (event instanceof g4.k1) {
                    g4.k1 k1Var = (g4.k1) event;
                    e1Var.b(k1Var.f268402a, k1Var.f268403b, k1Var.f268404c);
                    return;
                }
                return;
            }
            g4.f1 f1Var = (g4.f1) event;
            g4.x0 x0Var = g4.x0.f268605c;
            g4.a1 a1Var = f1Var.f268279a;
            e1Var.b(a1Var, false, x0Var);
            int ordinal = a1Var.ordinal();
            int i18 = f1Var.f268282d;
            if (ordinal == 1) {
                this.f268382a = i18;
                int b17 = f1Var.b();
                while (i17 < b17) {
                    arrayDeque.removeFirst();
                    i17++;
                }
                return;
            }
            if (ordinal != 2) {
                throw new java.lang.IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f268383b = i18;
            int b18 = f1Var.b();
            while (i17 < b18) {
                arrayDeque.removeLast();
                i17++;
            }
            return;
        }
        g4.i1 i1Var = (g4.i1) event;
        e1Var.getClass();
        g4.a0 combinedLoadStates = i1Var.f268373e;
        kotlin.jvm.internal.o.g(combinedLoadStates, "combinedLoadStates");
        e1Var.f268261a = combinedLoadStates.f268193a;
        e1Var.f268262b = combinedLoadStates.f268194b;
        e1Var.f268263c = combinedLoadStates.f268195c;
        e1Var.f268264d = combinedLoadStates.f268196d;
        e1Var.f268265e = combinedLoadStates.f268197e;
        int ordinal2 = i1Var.f268369a.ordinal();
        int i19 = i1Var.f268371c;
        int i27 = i1Var.f268372d;
        java.util.List list = i1Var.f268370b;
        if (ordinal2 == 0) {
            arrayDeque.clear();
            this.f268383b = i27;
            this.f268382a = i19;
            arrayDeque.addAll(list);
            return;
        }
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                return;
            }
            this.f268383b = i27;
            arrayDeque.addAll(list);
            return;
        }
        this.f268382a = i19;
        int size = list.size() - 1;
        e06.j jVar = new e06.j(size, sz5.b.a(size, 0, -1), -1);
        while (jVar.f246214f) {
            arrayDeque.addFirst(list.get(jVar.b()));
        }
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayDeque arrayDeque = this.f268384c;
        boolean z17 = !arrayDeque.isEmpty();
        g4.e1 e1Var = this.f268385d;
        if (z17) {
            arrayList.add(g4.i1.f268368g.a(kz5.n0.S0(arrayDeque), this.f268382a, this.f268383b, e1Var.c()));
        } else {
            g4.z0 z0Var = e1Var.f268264d;
            g4.a1 a1Var = g4.a1.REFRESH;
            g4.y0 y0Var = z0Var.f268645a;
            g4.j1 j1Var = g4.k1.f268401d;
            if (j1Var.a(y0Var, false)) {
                arrayList.add(new g4.k1(a1Var, false, y0Var));
            }
            g4.a1 a1Var2 = g4.a1.PREPEND;
            g4.y0 y0Var2 = z0Var.f268646b;
            if (j1Var.a(y0Var2, false)) {
                arrayList.add(new g4.k1(a1Var2, false, y0Var2));
            }
            g4.a1 a1Var3 = g4.a1.APPEND;
            g4.y0 y0Var3 = z0Var.f268647c;
            if (j1Var.a(y0Var3, false)) {
                arrayList.add(new g4.k1(a1Var3, false, y0Var3));
            }
            g4.z0 z0Var2 = e1Var.f268265e;
            if (z0Var2 != null) {
                g4.y0 y0Var4 = z0Var2.f268645a;
                if (j1Var.a(y0Var4, true)) {
                    arrayList.add(new g4.k1(a1Var, true, y0Var4));
                }
                g4.y0 y0Var5 = z0Var2.f268646b;
                if (j1Var.a(y0Var5, true)) {
                    arrayList.add(new g4.k1(a1Var2, true, y0Var5));
                }
                g4.y0 y0Var6 = z0Var2.f268647c;
                if (j1Var.a(y0Var6, true)) {
                    arrayList.add(new g4.k1(a1Var3, true, y0Var6));
                }
            }
        }
        return arrayList;
    }
}
