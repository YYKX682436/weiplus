package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class kj0 {
    public kj0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.List data, java.lang.String col) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(col, "col");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        sb6.append(col.concat(" in ("));
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Number) it.next()).intValue());
            if (it.hasNext()) {
                sb6.append(",");
            }
        }
        sb6.append("))");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.util.ArrayList b(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList(data);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Integer) it6.next()).intValue();
                kotlin.jvm.internal.o.d(num);
                arrayList3.add(java.lang.Integer.valueOf(intValue | num.intValue()));
            }
            hashSet.addAll(new java.util.HashSet(arrayList3));
            hashSet.add(num);
        }
        hashSet.add(0);
        arrayList2.addAll(hashSet);
        return arrayList2;
    }
}
