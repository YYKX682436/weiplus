package mz4;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final mz4.j f333289a = new mz4.j();

    public final boolean a(mz4.d dataManager, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.String inputText, java.util.List insertItems) {
        int recyclerItemPosition;
        kotlin.jvm.internal.o.g(dataManager, "dataManager");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        kotlin.jvm.internal.o.g(insertItems, "insertItems");
        boolean z17 = false;
        if (wXRTEditText == null || (recyclerItemPosition = wXRTEditText.getRecyclerItemPosition()) >= dataManager.D()) {
            return false;
        }
        iz4.c l17 = dataManager.l(recyclerItemPosition);
        iz4.p pVar = null;
        iz4.p pVar2 = l17 instanceof iz4.p ? (iz4.p) l17 : null;
        if (pVar2 == null) {
            return false;
        }
        int i17 = wXRTEditText.f188114l1;
        int j17 = pVar2.j();
        if (i17 > 0 && i17 < j17) {
            pVar = new iz4.p();
            java.util.Iterator it = pVar2.f296136t.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                iz4.c cVar = (iz4.c) next;
                if (i18 >= i17) {
                    it.remove();
                    pVar.f296136t.addLast(cVar);
                }
                i18++;
            }
        }
        if (pVar != null) {
            pVar2.f296104b = false;
            z17 = true;
            pVar.f296104b = true;
            pVar.f296110h = true;
            if (kotlin.jvm.internal.o.b(inputText, "<br/>")) {
                dataManager.a(recyclerItemPosition + 1, pVar, true);
            } else {
                int i19 = recyclerItemPosition + 1;
                dataManager.a(i19, pVar, true);
                java.util.Iterator it6 = insertItems.iterator();
                while (it6.hasNext()) {
                    dataManager.a(i19, (iz4.c) it6.next(), true);
                    i19++;
                }
            }
        }
        return z17;
    }

    public final boolean b(int i17, java.util.List oriData) {
        kotlin.jvm.internal.o.g(oriData, "oriData");
        java.lang.Object obj = oriData.get(i17);
        iz4.p pVar = obj instanceof iz4.p ? (iz4.p) obj : null;
        if (pVar == null) {
            return false;
        }
        if (!(pVar.j() > 3)) {
            return false;
        }
        java.lang.Object removeLast = pVar.f296136t.removeLast();
        kotlin.jvm.internal.o.f(removeLast, "removeLast(...)");
        iz4.c cVar = (iz4.c) removeLast;
        int i18 = i17 + 1;
        iz4.c cVar2 = oriData.size() > i18 ? (iz4.c) oriData.get(i18) : null;
        if (cVar2 instanceof iz4.p) {
            iz4.p pVar2 = (iz4.p) cVar2;
            pVar2.getClass();
            pVar2.f296136t.addFirst(cVar);
            b(i18, oriData);
        } else {
            iz4.p pVar3 = new iz4.p();
            pVar3.g(cVar);
            oriData.add(i18, pVar3);
        }
        return true;
    }

    public final java.util.List c(java.util.List oriDataList) {
        kotlin.jvm.internal.o.g(oriDataList, "oriDataList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!oriDataList.isEmpty()) {
            java.util.Iterator it = oriDataList.iterator();
            while (it.hasNext()) {
                iz4.c cVar = (iz4.c) it.next();
                if (cVar instanceof iz4.p) {
                    java.util.Iterator it6 = ((iz4.p) cVar).f296136t.iterator();
                    while (it6.hasNext()) {
                        linkedList.add((iz4.c) it6.next());
                    }
                } else {
                    linkedList.add(cVar);
                }
            }
        }
        return linkedList;
    }

    public final boolean d(int i17, boolean z17, java.util.List oriData, nz4.h hVar, mz4.d noteDataManager) {
        int i18;
        kotlin.jvm.internal.o.g(oriData, "oriData");
        kotlin.jvm.internal.o.g(noteDataManager, "noteDataManager");
        iz4.c cVar = (iz4.c) oriData.get(i17);
        if (!(cVar instanceof iz4.p) || hVar == null || (i18 = hVar.f341619a) != hVar.f341621c || i18 != i17) {
            return false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i19 = hVar.f341620b;
        int i27 = hVar.f341622d;
        iz4.p pVar = (iz4.p) cVar;
        java.util.Iterator it = pVar.f296136t.iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                pVar.getClass();
                java.util.LinkedList linkedList2 = pVar.f296136t;
                linkedList2.clear();
                linkedList2.addAll(linkedList);
                if (pVar.j() == 0) {
                    noteDataManager.z(i17, false, null);
                }
                return true;
            }
            java.lang.Object next = it.next();
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            iz4.c cVar2 = (iz4.c) next;
            if (!(i19 <= i28 && i28 < i27)) {
                linkedList.add(cVar2);
            }
            i28 = i29;
        }
    }
}
