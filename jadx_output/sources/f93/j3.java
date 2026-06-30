package f93;

/* loaded from: classes11.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f260364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260365e;

    public j3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI, boolean z17) {
        this.f260365e = contactLabelSelectUI;
        this.f260364d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        java.util.ArrayList f17 = b93.r.wi().f1();
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260365e;
        contactLabelSelectUI.f143272J = f17;
        if (f17 == null) {
            contactLabelSelectUI.f143272J = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData allContactLabel size:%d", java.lang.Integer.valueOf(contactLabelSelectUI.f143272J.size()));
        if (contactLabelSelectUI.G) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet(contactLabelSelectUI.F);
            java.util.Iterator it = contactLabelSelectUI.f143272J.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) it.next();
                if (hashSet.contains(d4Var.field_labelID + "")) {
                    arrayList.add(d4Var);
                }
            }
            contactLabelSelectUI.f143272J.clear();
            contactLabelSelectUI.f143272J.addAll(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData: filterCustomLabel size:%d", java.lang.Integer.valueOf(contactLabelSelectUI.f143272J.size()));
        }
        boolean z17 = contactLabelSelectUI.f143295z;
        if (z17 && contactLabelSelectUI.D) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < contactLabelSelectUI.f143272J.size(); i17++) {
                com.tencent.mm.storage.d4 d4Var2 = (com.tencent.mm.storage.d4) contactLabelSelectUI.f143272J.get(i17);
                int i18 = d4Var2.field_labelID;
                java.util.ArrayList P1 = b93.r.wi().P1(i18 + "");
                if (P1 == null || P1.size() <= 0) {
                    arrayList2.add(d4Var2);
                }
            }
            if (arrayList2.size() > 0) {
                contactLabelSelectUI.f143272J.removeAll(arrayList2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData: filterContactLabel size:%d", java.lang.Integer.valueOf(arrayList2.size()));
        }
        java.util.HashSet hashSet2 = contactLabelSelectUI.Q;
        hashSet2.clear();
        java.util.ArrayList arrayList3 = contactLabelSelectUI.f143272J;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Empty");
            if (contactLabelSelectUI.S) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 1, 0);
                contactLabelSelectUI.S = false;
            }
            if (!z17) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (hashSet2 != null && hashSet2.size() > 0) {
                    java.util.Iterator it6 = hashSet2.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add((java.lang.String) it6.next());
                    }
                }
                k93.r y17 = k93.j.y(arrayList4, 10);
                int i19 = y17.f305927a;
                if (i19 > 0) {
                    k93.q qVar = new k93.q();
                    qVar.field_labelName = contactLabelSelectUI.getResources().getString(com.tencent.mm.R.string.g9c);
                    qVar.field_labelID = -1000000;
                    qVar.field_isTemporary = true;
                    qVar.G = i19;
                    qVar.F = y17.f305928b;
                    contactLabelSelectUI.E.f305899n = qVar;
                } else {
                    contactLabelSelectUI.E.f305899n = null;
                }
            }
            com.tencent.mm.sdk.platformtools.u3.h(new f93.h3(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "cpan[updateData] Normal");
        if (contactLabelSelectUI.S) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 1, 1);
            contactLabelSelectUI.S = false;
        }
        java.util.ArrayList arrayList5 = contactLabelSelectUI.f143272J;
        if (arrayList5 != null && arrayList5.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData run: mAllContactLabel size:%d", java.lang.Integer.valueOf(contactLabelSelectUI.f143272J.size()));
            int size = contactLabelSelectUI.f143272J.size();
            b93.r.wi().D0();
            java.util.HashMap hashMap2 = contactLabelSelectUI.N;
            hashMap2.clear();
            java.util.HashMap hashMap3 = contactLabelSelectUI.P;
            hashMap3.clear();
            int i27 = 0;
            while (true) {
                hashMap = contactLabelSelectUI.M;
                if (i27 >= size) {
                    break;
                }
                com.tencent.mm.storage.d4 d4Var3 = (com.tencent.mm.storage.d4) contactLabelSelectUI.f143272J.get(i27);
                int i28 = d4Var3.field_labelID;
                java.lang.String str = d4Var3.field_labelName;
                java.lang.String str2 = i28 + "";
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "updateData label error, id:%s, name:%s", str2, str);
                } else {
                    hashMap2.put(str2, str);
                    hashMap3.put(str, str2);
                }
                java.util.ArrayList P12 = b93.r.wi().P1(i28 + "");
                if (P12 == null || P12.size() <= 0) {
                    hashMap.put(java.lang.Integer.valueOf(i28), 0);
                } else {
                    hashSet2.addAll(P12);
                    hashMap.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(P12.size()));
                }
                i27++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateData run finish, size of LabelCountMap:%d, LabelIdNameMap:%d, LabelNameIdMap:%d", java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap3.size()));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new f93.i3(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|updateData";
    }
}
