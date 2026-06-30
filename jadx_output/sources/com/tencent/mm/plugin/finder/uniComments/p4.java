package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f130360a = new java.util.ArrayList();

    public final int a(jv2.i item, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderCommentLoader", "addItem " + item.getItemId() + ", sort:" + z17);
        long t07 = item.f302223d.t0();
        int i18 = -1;
        int i19 = 0;
        java.util.ArrayList arrayList = this.f130360a;
        if (t07 == 0) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((jv2.i) it.next()).f302223d.field_localCommentId == item.f302223d.field_localCommentId) {
                    break;
                }
                i17++;
            }
            i17 = -1;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if (((jv2.i) it6.next()).f302223d.t0() == item.f302223d.t0()) {
                    break;
                }
                i17++;
            }
            i17 = -1;
        }
        if (i17 >= 0) {
            arrayList.set(i17, item);
            return i17;
        }
        if (item.f302223d.J0() != 0) {
            int e17 = e(item.f302223d.J0(), true);
            arrayList.add(e17, item);
            return e17;
        }
        int size = arrayList.size();
        jv2.c cVar = item.f302223d;
        if (cVar.field_state != -1 && cVar.w0() != 0) {
            if (z17) {
                java.util.Iterator it7 = arrayList.iterator();
                int i27 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (((jv2.i) it7.next()).f302223d.w0() <= item.f302223d.w0()) {
                        i18 = i27;
                        break;
                    }
                    i27++;
                }
                i19 = i18 < 0 ? arrayList.size() : i18;
            } else {
                i19 = size;
            }
        }
        arrayList.add(i19, item);
        return i19;
    }

    public final void b(java.util.List itemList, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        java.util.List c17 = c(itemList);
        java.util.ArrayList arrayList = (java.util.ArrayList) c17;
        if (arrayList.size() > 1) {
            kz5.g0.t(c17, new com.tencent.mm.plugin.finder.uniComments.n4());
        }
        int size = itemList.size() - arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reduce size: ");
        sb6.append(size);
        sb6.append(", data size: ");
        java.util.ArrayList arrayList2 = this.f130360a;
        sb6.append(arrayList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderCommentLoader", sb6.toString());
        if (z17) {
            arrayList2.addAll(0, c17);
        } else if (z18) {
            arrayList2.addAll(arrayList2.size(), c17);
        }
    }

    public final java.util.List c(java.util.List list) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jv2.i iVar = (jv2.i) it.next();
            java.util.ArrayList arrayList2 = this.f130360a;
            java.util.Iterator it6 = arrayList2.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it6.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((jv2.i) it6.next()).f302223d.t0() == iVar.f302223d.t0()) {
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
                if (((jv2.i) it7.next()).f302223d.t0() == iVar.f302223d.t0()) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
            if (i18 >= 0) {
                arrayList2.set(i18, iVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderCommentLoader", "filter1:" + iVar.f302223d.t0() + ", " + iVar.f302223d.getClientId());
            } else if (i17 >= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.FinderCommentLoader", "filter2:" + iVar.f302223d.t0());
            } else {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public final jv2.i d(int i17) {
        java.lang.Object obj = this.f130360a.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (jv2.i) obj;
    }

    public final int e(long j17, boolean z17) {
        int i17;
        java.util.ArrayList arrayList = this.f130360a;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((jv2.i) it.next()).f302223d.t0() == j17) {
                break;
            }
            i18++;
        }
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((jv2.i) listIterator.previous()).f302223d.J0() == j17) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        return (z17 && i17 >= 0) ? i17 + 1 : i18 + 1;
    }

    public final int f() {
        return this.f130360a.size();
    }

    public final boolean g(jv2.i comment1, jv2.i comment2) {
        kotlin.jvm.internal.o.g(comment1, "comment1");
        kotlin.jvm.internal.o.g(comment2, "comment2");
        return comment1.f302223d.J0() != 0 && comment1.f302223d.J0() == comment2.f302223d.J0();
    }
}
