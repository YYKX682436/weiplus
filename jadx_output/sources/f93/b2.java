package f93;

/* loaded from: classes11.dex */
public class b2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260296e;

    public b2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI, java.util.ArrayList arrayList) {
        this.f260296e = contactLabelManagerUI;
        this.f260295d = arrayList;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 != 0) {
            return;
        }
        b93.l lVar = b93.l.f18596a;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260296e;
        int i18 = 0;
        b93.l.a(lVar, contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0), 12, 0, 0, 0, 28, null);
        java.util.ArrayList arrayList = this.f260295d;
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
                com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.Y6(contactLabelManagerUI, arrayList2, arrayList);
                contactLabelManagerUI.P = 1;
                return;
            }
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        k93.j jVar = contactLabelManagerUI.A;
        if (jVar != null && jVar.f305894f.size() > 0) {
            for (int i19 = 0; i19 < contactLabelManagerUI.A.f305894f.size(); i19++) {
                com.tencent.mm.storage.d4 n17 = b93.r.wi().n1((java.lang.String) contactLabelManagerUI.A.f305894f.get(i19));
                if (n17 != null) {
                    if (!arrayList4.contains(n17.field_labelID + "")) {
                        arrayList4.add(n17.field_labelID + "");
                        arrayList3.add(n17);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 2, 2);
                }
            }
            java.lang.String stringExtra = contactLabelManagerUI.getIntent().getStringExtra("contact_select_label_session_id");
            int intExtra = contactLabelManagerUI.getIntent().getIntExtra("contact_select_label_from_scene", 0);
            if (stringExtra != null) {
                int length = stringExtra.length();
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        i18 = 1;
                        break;
                    }
                    int codePointAt = stringExtra.codePointAt(i27);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        break;
                    } else {
                        i27 += java.lang.Character.charCount(codePointAt);
                    }
                }
                if (i18 == 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "label_detele_confirm_btn");
                    hashMap.put("label_business_type", java.lang.Integer.valueOf(intExtra));
                    hashMap.put("label_select_sessionid", stringExtra);
                    hashMap.put("delete_cnt", java.lang.Integer.valueOf(contactLabelManagerUI.A.f305894f.size()));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", contactLabelManagerUI.f143250q, hashMap, 33926);
                }
            }
        }
        if (arrayList4.size() > 0) {
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.Y6(contactLabelManagerUI, arrayList4, arrayList3);
        }
        contactLabelManagerUI.P = 2;
    }
}
