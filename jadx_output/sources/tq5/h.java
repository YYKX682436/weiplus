package tq5;

/* loaded from: classes8.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String[] a(java.util.Map strMap) {
        kotlin.jvm.internal.o.h(strMap, "strMap");
        int size = strMap.size() * 2;
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i17 = 0; i17 < size; i17++) {
            strArr[i17] = new java.lang.String();
        }
        java.lang.Object[] array = strMap.keySet().toArray(new java.lang.String[0]);
        if (array == null) {
            throw new jz5.q("null cannot be cast to non-null type kotlin.Array<T>");
        }
        java.lang.String[] strArr2 = (java.lang.String[]) array;
        int length = strArr2.length;
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = i18 * 2;
            strArr[i19] = strArr2[i18];
            int i27 = i19 + 1;
            java.lang.String str = (java.lang.String) strMap.get(strArr2[i18]);
            if (str == null) {
                str = "";
            }
            strArr[i27] = str;
        }
        return strArr;
    }
}
