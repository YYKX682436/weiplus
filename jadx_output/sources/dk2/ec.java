package dk2;

/* loaded from: classes2.dex */
public abstract class ec {
    public static final dk2.hc a(dk2.fc fcVar, long j17, java.util.Map map) {
        dk2.gc gcVar;
        java.lang.String str;
        dk2.hc hcVar;
        r45.zk2 zk2Var = (r45.zk2) map.get(java.lang.Long.valueOf(j17));
        if (zk2Var == null) {
            throw new java.lang.IllegalArgumentException("Poll question not found. " + j17);
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        int integer = zk2Var.getInteger(4);
        int i17 = 1;
        if (integer == 1) {
            gcVar = dk2.gc.f233524d;
        } else {
            if (integer != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported question type. " + j17 + ", " + zk2Var.getInteger(4));
            }
            gcVar = dk2.gc.f233525e;
        }
        java.lang.String string = zk2Var.getString(1);
        if (string == null) {
            throw new java.lang.IllegalArgumentException("Empty poll question stem. " + j17);
        }
        java.util.LinkedList<r45.xk2> list = zk2Var.getList(2);
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Empty poll question options. " + j17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.xk2 xk2Var : list) {
            kotlin.jvm.internal.o.d(xk2Var);
            java.lang.String string2 = xk2Var.getString(i17);
            if (string2 == null) {
                throw new java.lang.IllegalArgumentException("Empty poll question option content. " + xk2Var.getLong(0));
            }
            int integer2 = xk2Var.getInteger(5);
            if (integer2 == i17) {
                str = string;
                hcVar = null;
            } else {
                if (integer2 != 2) {
                    throw new java.lang.IllegalArgumentException("Unsupported poll question option action. " + xk2Var.getLong(0) + ", " + xk2Var.getInteger(5));
                }
                str = string;
                hcVar = a(dk2.hc.f233578f, xk2Var.getLong(6), map);
            }
            arrayList.add(new dk2.ic(java.lang.String.valueOf(xk2Var.getLong(0)), string2, hcVar));
            string = str;
            i17 = 1;
        }
        return new dk2.hc(java.lang.String.valueOf(j17), uuid, gcVar, string, arrayList);
    }
}
