package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f130342a = new java.util.ArrayList();

    public final int a(jv2.d item, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", "addItem " + item.getItemId() + ", sort:" + z17);
        long t07 = item.f302207d.t0();
        int i18 = -1;
        java.util.ArrayList arrayList = this.f130342a;
        if (t07 == 0) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((jv2.d) it.next()).f302207d.field_localCommentId == item.f302207d.field_localCommentId) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if (((jv2.d) it6.next()).f302207d.t0() == item.f302207d.t0()) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        }
        if (i18 >= 0) {
            arrayList.set(i18, item);
            return i18;
        }
        if (item.f302207d.A0() == 0) {
            arrayList.add(item);
            return arrayList.size() - 1;
        }
        int d17 = d(item.f302207d.A0(), true);
        arrayList.add(d17, item);
        return d17;
    }

    public final void b(java.util.List itemList, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        java.util.List c17 = c(itemList);
        int size = itemList.size() - ((java.util.ArrayList) c17).size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reduce size: ");
        sb6.append(size);
        sb6.append(", data size: ");
        java.util.ArrayList arrayList = this.f130342a;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", sb6.toString());
        if (z17) {
            arrayList.addAll(0, c17);
        } else if (z18) {
            arrayList.addAll(arrayList.size(), c17);
        }
    }

    public final java.util.List c(java.util.List list) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jv2.d dVar = (jv2.d) it.next();
            java.util.ArrayList arrayList2 = this.f130342a;
            java.util.Iterator it6 = arrayList2.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((jv2.d) it6.next()).f302207d.t0() == dVar.f302207d.t0()) {
                    break;
                }
                i18++;
            }
            java.util.Iterator it7 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                if (((jv2.d) it7.next()).f302207d.t0() == dVar.f302207d.t0()) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
            if (i18 >= 0) {
                arrayList2.set(i18, dVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", "filter1:" + dVar.f302207d.t0() + ", " + dVar.f302207d.getClientId());
            } else if (i17 >= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", "filter2:" + dVar.f302207d.t0());
            } else {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final int d(long j17, boolean z17) {
        int i17;
        java.util.ArrayList arrayList = this.f130342a;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((jv2.d) it.next()).f302207d.t0() == j17) {
                break;
            }
            i18++;
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((jv2.d) listIterator.previous()).f302207d.A0() == j17) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        return (z17 && i17 >= 0) ? i17 + 1 : i18 + 1;
    }

    public final int e() {
        return this.f130342a.size();
    }

    public final boolean f(jv2.d comment1, jv2.d comment2) {
        kotlin.jvm.internal.o.g(comment1, "comment1");
        kotlin.jvm.internal.o.g(comment2, "comment2");
        return comment1.f302207d.A0() != 0 && comment1.f302207d.A0() == comment2.f302207d.A0();
    }
}
