package mm2;

/* loaded from: classes3.dex */
public final class c7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.f7 f328941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(mm2.f7 f7Var) {
        super(2);
        this.f328941d = f7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.lang.Object obj3;
        r45.i82 i82Var = (r45.i82) obj;
        r45.i82 i82Var2 = (r45.i82) obj2;
        this.f328941d.getClass();
        if (i82Var != null && i82Var2 != null) {
            z17 = false;
            if (i82Var.getBoolean(0) == i82Var2.getBoolean(0) && i82Var.getLong(1) == i82Var2.getLong(1) && i82Var.getLong(2) == i82Var2.getLong(2) && kotlin.jvm.internal.o.b(i82Var.getString(6), i82Var2.getString(6))) {
                java.util.LinkedList list = i82Var.getList(5);
                kotlin.jvm.internal.o.f(list, "getWish_list(...)");
                java.util.LinkedList<r45.aa4> list2 = i82Var2.getList(5);
                kotlin.jvm.internal.o.f(list2, "getWish_list(...)");
                if (list.size() == list2.size()) {
                    for (r45.aa4 aa4Var : list2) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            r45.aa4 aa4Var2 = (r45.aa4) next;
                            r45.kv1 kv1Var = (r45.kv1) aa4Var.getCustom(0);
                            java.lang.String string = kv1Var != null ? kv1Var.getString(0) : null;
                            r45.kv1 kv1Var2 = (r45.kv1) aa4Var2.getCustom(0);
                            if (kotlin.jvm.internal.o.b(string, kv1Var2 != null ? kv1Var2.getString(0) : null) && aa4Var.getLong(1) == aa4Var2.getLong(1) && aa4Var.getLong(2) == aa4Var2.getLong(2)) {
                                obj3 = next;
                                break;
                            }
                        }
                        if (!(obj3 != null)) {
                        }
                    }
                    return java.lang.Boolean.valueOf(!z17);
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(!z17);
    }
}
