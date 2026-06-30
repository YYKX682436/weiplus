package ey2;

/* loaded from: classes2.dex */
public abstract class a2 {
    public static final java.lang.String a(r45.um5 um5Var) {
        kotlin.jvm.internal.o.g(um5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expose_interval=");
        sb6.append(um5Var.getLong(0));
        sb6.append(" ctrl_type=");
        sb6.append(um5Var.getInteger(1));
        sb6.append(" mention_count=");
        sb6.append(um5Var.getLong(3));
        sb6.append(" bypass_info=");
        com.tencent.mm.protobuf.g byteString = um5Var.getByteString(2);
        sb6.append(byteString != null ? byteString.f192156a.length : -1);
        return sb6.toString();
    }

    public static final java.lang.String b(r45.ym5 ym5Var) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(ym5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report_scene=");
        sb6.append(ym5Var.getInteger(0));
        sb6.append(" contextId=");
        sb6.append(ym5Var.getString(1));
        sb6.append(" leftList(");
        sb6.append(ym5Var.getList(6).size());
        sb6.append(")=");
        java.util.LinkedList<r45.um5> list = ym5Var.getList(6);
        java.util.ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.um5 um5Var : list) {
                kotlin.jvm.internal.o.d(um5Var);
                arrayList.add(a(um5Var));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append(" rightList(");
        sb6.append(ym5Var.getList(7).size());
        sb6.append(")=");
        java.util.LinkedList<r45.um5> list2 = ym5Var.getList(7);
        if (list2 != null) {
            arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (r45.um5 um5Var2 : list2) {
                kotlin.jvm.internal.o.d(um5Var2);
                arrayList2.add(a(um5Var2));
            }
        }
        sb6.append(arrayList2);
        sb6.append(" session_interval=");
        sb6.append(ym5Var.getInteger(4));
        return sb6.toString();
    }
}
