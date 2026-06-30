package kc2;

/* loaded from: classes8.dex */
public abstract class l1 {
    public static final java.util.List a(java.util.List clickSeq, java.util.List exposeSeq) {
        kotlin.jvm.internal.o.g(clickSeq, "clickSeq");
        kotlin.jvm.internal.o.g(exposeSeq, "exposeSeq");
        int size = clickSeq.size();
        int size2 = exposeSeq.size();
        if (size > size2) {
            size = size2;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < size; i17++) {
            int intValue = ((java.lang.Number) exposeSeq.get(i17)).intValue();
            if (intValue > 0) {
                linkedList.add(java.lang.Float.valueOf(new java.math.BigDecimal(java.lang.String.valueOf(((java.lang.Number) clickSeq.get(i17)).intValue() / intValue)).setScale(4, java.math.RoundingMode.HALF_UP).floatValue()));
            } else {
                linkedList.add(java.lang.Float.valueOf(0.0f));
            }
        }
        return linkedList;
    }

    public static final float b(boolean z17) {
        return z17 ? 1.0f : 0.0f;
    }

    public static final java.lang.String c(java.util.List list, char c17) {
        int i17 = 0;
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size = list.size();
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append((java.lang.Number) obj);
            if (i17 != size - 1) {
                sb6.append(c17);
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.String d(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        java.lang.String jSONArray2 = jSONArray.toString();
        return jSONArray2 != null ? r26.i0.t(jSONArray2, ",", ";", false) : "";
    }

    public static final java.lang.String e(org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2;
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        return (jSONObject.length() > 0 && (jSONObject2 = jSONObject.toString()) != null) ? r26.i0.t(jSONObject2, ",", ";", false) : "";
    }

    public static /* synthetic */ java.lang.String f(java.util.List list, char c17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            c17 = ';';
        }
        return c(list, c17);
    }
}
