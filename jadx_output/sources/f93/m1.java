package f93;

/* loaded from: classes11.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelEditUI f260385d;

    public m1(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI) {
        this.f260385d = contactLabelEditUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.h4 wi6 = b93.r.wi();
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260385d;
        java.util.ArrayList P1 = wi6.P1(contactLabelEditUI.f143222f);
        if (P1 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelEditUI", "result is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = b93.r.wi().f195005g;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelStorage", "getNewLabelCache() called size:%s", java.lang.Integer.valueOf(hashMap.size()));
        if (hashMap.containsKey(contactLabelEditUI.f143222f)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) d75.b.c(P1, 100)).iterator();
            while (it.hasNext()) {
                java.util.List list = (java.util.List) it.next();
                p75.n0 n0Var = dm.e2.N1;
                p75.d dVar = dm.e2.P1;
                p75.i0 g17 = n0Var.g(kz5.c0.i(dVar, dm.e2.X1));
                g17.f352657d = dVar.l(list);
                java.util.Iterator it6 = ((java.util.ArrayList) g17.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class)).iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it6.next();
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    hashMap2.put(d17, z3Var);
                }
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) hashMap2.get((java.lang.String) it7.next());
                    if (z3Var2 != null) {
                        arrayList2.add(z3Var2);
                    }
                }
            }
            java.util.Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                com.tencent.mm.storage.z3 z3Var3 = (com.tencent.mm.storage.z3) it8.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var3.D0()) && z3Var3.D0().contains(contactLabelEditUI.f143222f)) {
                    arrayList.add(z3Var3.d1());
                }
            }
        } else {
            arrayList.addAll(P1);
        }
        com.tencent.mm.autogen.mmdata.rpt.ContactLabelEditStruct contactLabelEditStruct = contactLabelEditUI.G;
        contactLabelEditStruct.f55739g = contactLabelEditStruct.b("CurrentLabelUinList", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";"), true);
        contactLabelEditUI.f143237x = arrayList;
        java.util.ArrayList arrayList3 = contactLabelEditUI.f143238y;
        if (arrayList3 == null) {
            contactLabelEditUI.f143238y = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        contactLabelEditUI.f143238y.addAll(arrayList);
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactLabelEditUI.H;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|initView";
    }
}
