package f93;

/* loaded from: classes11.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260312d;

    public d4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260312d = contactLabelUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<java.lang.String> i17;
        java.util.ArrayList k17 = b93.r.wi().k1();
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260312d;
        contactLabelUI.C = k17;
        if (contactLabelUI.f143296J) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = contactLabelUI.D.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!contactLabelUI.C.contains(str)) {
                    arrayList2.add(str);
                }
            }
            if (contactLabelUI.E) {
                com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(contactLabelUI.f143311v);
                if (z07 != null) {
                    contactLabelUI.f143312w = z07.field_contactLabels;
                    i17 = ((b93.b) c93.a.a()).f(contactLabelUI.f143312w);
                } else {
                    i17 = null;
                }
            } else {
                contactLabelUI.f143312w = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(contactLabelUI.f143311v, true).D0();
                i17 = ((b93.b) c93.a.a()).i(contactLabelUI.f143312w);
            }
            if (i17 == null) {
                i17 = new java.util.ArrayList();
            }
            java.util.ArrayList arrayList4 = contactLabelUI.f143313x;
            if (arrayList4 != null) {
                java.util.Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it6.next();
                    if (!i17.contains(str2)) {
                        arrayList3.add(str2);
                    }
                }
                contactLabelUI.f143313x.clear();
                contactLabelUI.f143313x.addAll(i17);
            }
            java.util.Iterator<java.lang.String> it7 = contactLabelUI.f143302m.getSelectTagList().iterator();
            while (it7.hasNext()) {
                java.lang.String next = it7.next();
                if (!arrayList2.contains(next)) {
                    if (!arrayList.contains(next) && !arrayList3.contains(next)) {
                        arrayList.add(next);
                    }
                    if (contactLabelUI.f143315z.contains(next)) {
                        hashSet.add(next);
                    }
                }
            }
            for (java.lang.String str3 : i17) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
            java.util.Iterator it8 = contactLabelUI.C.iterator();
            while (it8.hasNext()) {
                java.lang.String str4 = (java.lang.String) it8.next();
                if (!arrayList2.contains(str4) && contactLabelUI.f143314y.contains(str4)) {
                    hashSet2.add(str4);
                }
            }
            contactLabelUI.f143314y.clear();
            contactLabelUI.f143314y.addAll(hashSet2);
            contactLabelUI.f143315z.clear();
            contactLabelUI.A.clear();
            contactLabelUI.f143315z.addAll(hashSet);
            contactLabelUI.A.addAll(arrayList);
            contactLabelUI.D.clear();
            contactLabelUI.D.addAll(contactLabelUI.C);
        } else {
            contactLabelUI.A.addAll(contactLabelUI.f143313x);
            contactLabelUI.f143296J = true;
        }
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143302m;
        java.util.ArrayList arrayList5 = contactLabelUI.A;
        mMLabelPanel.r(arrayList5, arrayList5);
        if (contactLabelUI.f143307r != null) {
            java.util.ArrayList arrayList6 = contactLabelUI.C;
            if (arrayList6 == null || arrayList6.size() <= 0) {
                contactLabelUI.f143307r.r(contactLabelUI.A, contactLabelUI.C);
                if (contactLabelUI.I) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 0, 0);
                    contactLabelUI.I = false;
                }
            } else {
                if (contactLabelUI.E) {
                    contactLabelUI.f143307r.r(contactLabelUI.A, contactLabelUI.C);
                } else {
                    contactLabelUI.f143307r.r(contactLabelUI.A, contactLabelUI.C);
                }
                if (contactLabelUI.I) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 0, 1);
                    contactLabelUI.I = false;
                }
            }
        }
        java.util.ArrayList arrayList7 = contactLabelUI.f143313x;
        contactLabelUI.getClass();
        if (arrayList7 != null && arrayList7.size() > 0) {
            com.tencent.mm.sdk.platformtools.u3.i(new f93.a4(contactLabelUI), 50L);
        }
        contactLabelUI.d7(f93.n4.Normal);
    }
}
