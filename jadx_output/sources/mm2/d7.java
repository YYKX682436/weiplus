package mm2;

/* loaded from: classes3.dex */
public final class d7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.f7 f328962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(mm2.f7 f7Var) {
        super(2);
        this.f328962d = f7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        r45.pm1 pm1Var = (r45.pm1) obj;
        r45.pm1 pm1Var2 = (r45.pm1) obj2;
        this.f328962d.getClass();
        if (pm1Var != null && pm1Var2 != null) {
            z17 = false;
            java.util.LinkedList list = pm1Var.getList(0);
            java.util.LinkedList list2 = pm1Var2.getList(0);
            if (list.size() == list2.size()) {
                int i17 = 0;
                for (java.lang.Object obj3 : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.gh6 gh6Var = (r45.gh6) obj3;
                    r45.gh6 gh6Var2 = (r45.gh6) list.get(i17);
                    if (kotlin.jvm.internal.o.b(gh6Var.getString(0), gh6Var2.getString(0)) && kotlin.jvm.internal.o.b(gh6Var.getString(1), gh6Var2.getString(1))) {
                        i17 = i18;
                    }
                }
                return java.lang.Boolean.valueOf(!z17);
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(!z17);
    }
}
