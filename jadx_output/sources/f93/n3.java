package f93;

/* loaded from: classes11.dex */
public class n3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260399e;

    public n3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI, java.util.ArrayList arrayList) {
        this.f260399e = contactLabelSelectUI;
        this.f260398d = arrayList;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = 0;
        java.util.ArrayList arrayList = this.f260398d;
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260399e;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i18 < arrayList.size()) {
                    com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) arrayList.get(i18);
                    if (d4Var != null) {
                        if (!arrayList2.contains(d4Var.field_labelID + "")) {
                            arrayList2.add(d4Var.field_labelID + "");
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 2, 2);
                    }
                    i18++;
                }
                com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.b(contactLabelSelectUI, arrayList2, arrayList);
                contactLabelSelectUI.Y = 1;
                return;
            }
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        k93.j jVar = contactLabelSelectUI.E;
        if (jVar != null && jVar.f305894f.size() > 0) {
            while (i18 < contactLabelSelectUI.E.f305894f.size()) {
                com.tencent.mm.storage.d4 n17 = b93.r.wi().n1((java.lang.String) contactLabelSelectUI.E.f305894f.get(i18));
                if (n17 != null) {
                    if (!arrayList4.contains(n17.field_labelID + "")) {
                        arrayList4.add(n17.field_labelID + "");
                        arrayList3.add(n17);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 2, 2);
                }
                i18++;
            }
        }
        if (arrayList4.size() > 0) {
            com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.b(contactLabelSelectUI, arrayList4, arrayList3);
        }
        contactLabelSelectUI.Y = 2;
    }
}
