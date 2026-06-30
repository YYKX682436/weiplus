package gc0;

/* loaded from: classes5.dex */
public abstract class f1 {
    public static final r45.b90 a(java.util.LinkedList linkedList, java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.b90) obj).getString(0), str)) {
                break;
            }
        }
        r45.b90 b90Var = (r45.b90) obj;
        if (b90Var != null) {
            return b90Var;
        }
        r45.b90 b90Var2 = new r45.b90();
        b90Var2.set(0, str);
        linkedList.add(b90Var2);
        return b90Var2;
    }

    public static final gc0.i3 b(r45.ml5 ml5Var, java.lang.String content) {
        kotlin.jvm.internal.o.g(ml5Var, "<this>");
        kotlin.jvm.internal.o.g(content, "content");
        java.util.LinkedList list = ml5Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getPhone(...)");
        java.util.LinkedList list2 = ml5Var.getList(5);
        kotlin.jvm.internal.o.f(list2, "getPhoneInfo(...)");
        return d(content, list, list2);
    }

    public static final gc0.i3 c(r45.ml5 ml5Var, java.lang.String content) {
        kotlin.jvm.internal.o.g(ml5Var, "<this>");
        kotlin.jvm.internal.o.g(content, "content");
        java.util.LinkedList list = ml5Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getRemark(...)");
        java.util.LinkedList list2 = ml5Var.getList(4);
        kotlin.jvm.internal.o.f(list2, "getRemarkInfo(...)");
        return d(content, list, list2);
    }

    public static final gc0.i3 d(java.lang.String str, java.util.List list, java.util.LinkedList linkedList) {
        if (list.contains(str)) {
            return new gc0.i3(true, null);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.b90 b90Var = (r45.b90) it.next();
            if (kotlin.jvm.internal.o.b(b90Var.getString(0), str)) {
                return new gc0.i3(false, b90Var);
            }
        }
        r45.b90 b90Var2 = new r45.b90();
        b90Var2.set(0, str);
        linkedList.add(b90Var2);
        return new gc0.i3(false, b90Var2);
    }
}
