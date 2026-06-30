package je2;

/* loaded from: classes3.dex */
public abstract class u {
    public static final java.lang.String a(r45.oq1 oq1Var) {
        kotlin.jvm.internal.o.g(oq1Var, "<this>");
        return "{product_id:" + oq1Var.f382442e + ", giftId:" + oq1Var.f382441d + '}';
    }

    public static final java.lang.String b(r45.pq1 pq1Var) {
        kotlin.jvm.internal.o.g(pq1Var, "<this>");
        java.util.LinkedList<r45.oq1> gift = pq1Var.f383303e;
        kotlin.jvm.internal.o.f(gift, "gift");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(gift, 10));
        for (r45.oq1 oq1Var : gift) {
            kotlin.jvm.internal.o.d(oq1Var);
            arrayList.add(a(oq1Var));
        }
        return arrayList.toString();
    }
}
