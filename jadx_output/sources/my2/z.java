package my2;

/* loaded from: classes3.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f332779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f332780c;

    public z(my2.k0 k0Var, int i17, android.view.ViewGroup viewGroup) {
        this.f332778a = k0Var;
        this.f332779b = i17;
        this.f332780c = viewGroup;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        my2.k0 k0Var = this.f332778a;
        k0Var.A.b();
        r45.me2 me2Var = ((mm2.c1) k0Var.P0(mm2.c1.class)).f328784b6;
        int i17 = fVar.f70615a;
        ky2.g0 g0Var = k0Var.f332752y;
        if (i17 == 0 && fVar.f70616b == 0) {
            if (g0Var != null) {
                g0Var.f313548n = true;
                boolean z17 = g0Var.f313546i;
                java.util.ArrayList arrayList2 = g0Var.f313543f;
                int i18 = this.f332779b;
                if (!z17) {
                    java.lang.Object obj2 = arrayList2.get(i18);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    if (((r45.l30) obj2).getInteger(2) == 0) {
                        g0Var.x(i18);
                    } else {
                        g0Var.y(i18);
                    }
                } else if (((r45.l30) arrayList2.get(i18)).getInteger(2) == 0) {
                    java.util.Iterator it = arrayList2.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.l30 l30Var = (r45.l30) next;
                        if (i19 == i18) {
                            g0Var.x(i19);
                        } else if (l30Var.getInteger(2) == 1) {
                            g0Var.y(i19);
                        }
                        i19 = i27;
                    }
                } else {
                    java.util.Iterator it6 = arrayList2.iterator();
                    int i28 = 0;
                    while (it6.hasNext()) {
                        java.lang.Object next2 = it6.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (((r45.l30) next2).getInteger(2) == 1) {
                            g0Var.y(i28);
                        }
                        i28 = i29;
                    }
                }
                g0Var.notifyItemRangeChanged(0, g0Var.getItemCount(), java.lang.Boolean.TRUE);
            }
            if (me2Var != null && (list2 = me2Var.getList(2)) != null) {
                list2.clear();
            }
            if (g0Var != null && (arrayList = g0Var.f313543f) != null && me2Var != null && (list = me2Var.getList(2)) != null) {
                list.addAll(arrayList);
            }
        } else {
            android.view.ViewGroup viewGroup = this.f332780c;
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ejg));
        }
        if (g0Var != null) {
            g0Var.f313547m = false;
        }
        return jz5.f0.f302826a;
    }
}
