package gc0;

/* loaded from: classes5.dex */
public abstract class m1 {
    public static final boolean a(r45.nl5 nl5Var, r45.nl5 newData, yz5.l getRecommendField, yz5.l getRecommendFieldMsgId) {
        kotlin.jvm.internal.o.g(newData, "newData");
        kotlin.jvm.internal.o.g(getRecommendField, "getRecommendField");
        kotlin.jvm.internal.o.g(getRecommendFieldMsgId, "getRecommendFieldMsgId");
        java.lang.String str = (java.lang.String) getRecommendField.invoke(newData);
        java.lang.String str2 = (java.lang.String) getRecommendField.invoke(nl5Var);
        if (str2 == null || r26.n0.N(str2)) {
            if (!(str == null || r26.n0.N(str))) {
                return true;
            }
        } else {
            if (str == null || r26.n0.N(str)) {
                long longValue = ((java.lang.Number) getRecommendFieldMsgId.invoke(nl5Var)).longValue();
                if (longValue > 0 && !newData.getList(5).contains(java.lang.Long.valueOf(longValue))) {
                    return true;
                }
            } else if (!kotlin.jvm.internal.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(r45.nl5 nl5Var) {
        kotlin.jvm.internal.o.g(nl5Var, "<this>");
        if (((r45.kl5) nl5Var.getCustom(1)) == null) {
            return true;
        }
        java.lang.String string = ((r45.kl5) nl5Var.getCustom(1)).getString(1);
        return string == null || r26.n0.N(string);
    }

    public static final boolean c(r45.nl5 nl5Var) {
        kotlin.jvm.internal.o.g(nl5Var, "<this>");
        if (((r45.kl5) nl5Var.getCustom(0)) != null) {
            java.lang.String string = ((r45.kl5) nl5Var.getCustom(0)).getString(0);
            if (!(string == null || r26.n0.N(string))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(r45.nl5 nl5Var) {
        kotlin.jvm.internal.o.g(nl5Var, "<this>");
        return c(nl5Var) && b(nl5Var) && ((nl5Var.getLong(2) > 0L ? 1 : (nl5Var.getLong(2) == 0L ? 0 : -1)) == 0);
    }

    public static final java.util.Map e(r45.nl5 nl5Var) {
        kotlin.jvm.internal.o.g(nl5Var, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean c17 = c(nl5Var);
        gc0.z0 z0Var = gc0.e1.f270141o;
        if (!c17) {
            r45.kl5 kl5Var = (r45.kl5) nl5Var.getCustom(0);
            kotlin.jvm.internal.o.f(kl5Var, "getRemarkData(...)");
            z0Var.a(linkedHashMap, 1, kl5Var);
        }
        if (!b(nl5Var)) {
            r45.kl5 kl5Var2 = (r45.kl5) nl5Var.getCustom(1);
            kotlin.jvm.internal.o.f(kl5Var2, "getPhoneData(...)");
            z0Var.a(linkedHashMap, 2, kl5Var2);
        }
        if (!(nl5Var.getLong(2) == 0)) {
            r45.kl5 kl5Var3 = new r45.kl5();
            kl5Var3.set(4, java.lang.Long.valueOf(nl5Var.getLong(2)));
            kl5Var3.set(5, (r45.ll5) nl5Var.getCustom(6));
            z0Var.a(linkedHashMap, 3, kl5Var3);
        }
        return linkedHashMap;
    }
}
