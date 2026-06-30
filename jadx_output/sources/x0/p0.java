package x0;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f450919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x0.r0 r0Var) {
        super(2);
        this.f450919d = r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.util.Set applied = (java.util.Set) obj;
        kotlin.jvm.internal.o.g(applied, "applied");
        kotlin.jvm.internal.o.g((x0.m) obj2, "<anonymous parameter 1>");
        x0.r0 r0Var = this.f450919d;
        synchronized (r0Var.f450935d) {
            o0.i iVar = r0Var.f450935d;
            int i18 = iVar.f341852f;
            i17 = 0;
            if (i18 > 0) {
                java.lang.Object[] objArr = iVar.f341850d;
                int i19 = 0;
                do {
                    x0.n0 n0Var = (x0.n0) objArr[i17];
                    java.util.HashSet hashSet = n0Var.f450915c;
                    o0.e eVar = n0Var.f450914b;
                    java.util.Iterator it = applied.iterator();
                    while (it.hasNext()) {
                        int b17 = eVar.b(it.next());
                        if (b17 >= 0) {
                            java.util.Iterator it6 = eVar.d(b17).iterator();
                            while (true) {
                                o0.c cVar = (o0.c) it6;
                                if (cVar.hasNext()) {
                                    hashSet.add(cVar.next());
                                    i19 = 1;
                                }
                            }
                        }
                    }
                    i17++;
                } while (i17 < i18);
                i17 = i19;
            }
        }
        if (i17 != 0) {
            x0.r0 r0Var2 = this.f450919d;
            r0Var2.f450932a.invoke(new x0.o0(r0Var2));
        }
        return jz5.f0.f302826a;
    }
}
