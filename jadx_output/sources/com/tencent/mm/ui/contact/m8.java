package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class m8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMSelectContactUI f207026d;

    public m8(com.tencent.mm.ui.contact.OpenIMSelectContactUI openIMSelectContactUI) {
        this.f207026d = openIMSelectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.OpenIMSelectContactUI openIMSelectContactUI = this.f207026d;
        boolean d17 = com.tencent.mm.ui.contact.i5.d(openIMSelectContactUI.L, 8192);
        openIMSelectContactUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = openIMSelectContactUI.H.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (d17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it6 = n17.iterator();
                    while (it6.hasNext()) {
                        hashSet.add((java.lang.String) it6.next());
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        arrayList.remove(c01.z1.r());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(openIMSelectContactUI.I);
        arrayList2.removeAll(arrayList);
        openIMSelectContactUI.w7(arrayList, arrayList2);
        return true;
    }
}
