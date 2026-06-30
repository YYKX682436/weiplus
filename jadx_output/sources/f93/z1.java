package f93;

/* loaded from: classes11.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f260526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260527e;

    public z1(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI, boolean z17) {
        this.f260527e = contactLabelManagerUI;
        this.f260526d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList f17 = b93.r.wi().f1();
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260527e;
        contactLabelManagerUI.B = f17;
        if (contactLabelManagerUI.B == null) {
            contactLabelManagerUI.B = new java.util.ArrayList();
        }
        if (contactLabelManagerUI.f143257x && contactLabelManagerUI.f143259z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < contactLabelManagerUI.B.size(); i17++) {
                com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) contactLabelManagerUI.B.get(i17);
                int i18 = d4Var.field_labelID;
                java.util.ArrayList P1 = b93.r.wi().P1(i18 + "");
                if (P1 == null || P1.size() <= 0) {
                    arrayList.add(d4Var);
                }
            }
            if (arrayList.size() > 0) {
                contactLabelManagerUI.B.removeAll(arrayList);
            }
        }
        contactLabelManagerUI.G.clear();
        java.util.ArrayList arrayList2 = contactLabelManagerUI.B;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Empty");
            if (contactLabelManagerUI.H) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 1, 0);
                contactLabelManagerUI.H = false;
            }
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.W6(contactLabelManagerUI);
            com.tencent.mm.sdk.platformtools.u3.h(new f93.x1(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Normal");
        if (contactLabelManagerUI.H) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11346, 1, 1);
            contactLabelManagerUI.H = false;
        }
        java.util.ArrayList arrayList3 = contactLabelManagerUI.B;
        if (arrayList3 != null && arrayList3.size() > 0) {
            int size = contactLabelManagerUI.B.size();
            b93.r.wi().D0();
            for (int i19 = 0; i19 < size; i19++) {
                int i27 = ((com.tencent.mm.storage.d4) contactLabelManagerUI.B.get(i19)).field_labelID;
                java.util.ArrayList P12 = b93.r.wi().P1(i27 + "");
                if (P12 == null || P12.size() <= 0) {
                    contactLabelManagerUI.F.put(java.lang.Integer.valueOf(i27), 0);
                } else {
                    contactLabelManagerUI.G.addAll(P12);
                    contactLabelManagerUI.F.put(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(P12.size()));
                }
            }
        }
        if (!contactLabelManagerUI.f143257x && !contactLabelManagerUI.f143255v) {
            contactLabelManagerUI.B.add(0, contactLabelManagerUI.A.f305907v);
        }
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.W6(contactLabelManagerUI);
        com.tencent.mm.sdk.platformtools.u3.h(new f93.y1(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|updateData";
    }
}
