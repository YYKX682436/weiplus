package on2;

/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.p {
    public k2(zg2.d dVar) {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.dt1 dt1Var = (r45.dt1) obj;
        r45.dt1 dt1Var2 = (r45.dt1) obj2;
        boolean z17 = false;
        if (dt1Var != null && dt1Var2 != null) {
            java.util.LinkedList list = dt1Var.getList(1);
            java.util.LinkedList list2 = dt1Var2.getList(1);
            if (dt1Var.getInteger(2) == dt1Var2.getInteger(2) && list.size() == list2.size()) {
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z17 = true;
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.dz1 dz1Var = (r45.dz1) next;
                    java.lang.Object obj3 = list2.get(i17);
                    if (obj3 != null) {
                        if (!(((r45.dz1) obj3).getInteger(0) == dz1Var.getInteger(0))) {
                            break;
                        }
                        i17 = i18;
                    } else {
                        break;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
