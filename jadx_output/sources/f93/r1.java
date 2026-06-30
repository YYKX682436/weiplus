package f93;

/* loaded from: classes11.dex */
public class r1 implements k93.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260448a;

    public r1(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260448a = contactLabelManagerUI;
    }

    @Override // k93.x
    public void T(android.view.View view, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260448a;
        if (contactLabelManagerUI.f143257x || contactLabelManagerUI.f143255v) {
            return;
        }
        com.tencent.mm.storage.d4 z17 = contactLabelManagerUI.A.z(i17);
        if (z17 == null || !z17.field_isTemporary || z17.field_labelID != -1000000) {
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI2 = this.f260448a;
            contactLabelManagerUI2.f143240J.g(view, i17, -1L, contactLabelManagerUI2, contactLabelManagerUI2, contactLabelManagerUI2.L, contactLabelManagerUI2.M);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "onItemLongClick, is no lebal title item, position = " + i17);
        }
    }

    @Override // k93.x
    public void U(android.content.Intent intent) {
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260448a;
        contactLabelManagerUI.N = false;
        contactLabelManagerUI.startActivityForResult(intent, com.tencent.liteav.TXLiteAVCode.WARNING_VIRTUAL_BACKGROUND_DEVICE_UNSURPORTED);
    }

    @Override // k93.x
    public void V(f93.d5 d5Var, int i17) {
        com.tencent.mm.storage.d4 z17;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260448a;
        if (contactLabelManagerUI.A.getItemViewType(i17) == 2) {
            contactLabelManagerUI.getClass();
            gm0.j1.e().j(new f93.w1(contactLabelManagerUI));
            return;
        }
        k93.j jVar = contactLabelManagerUI.A;
        if (jVar == null || i17 < 0 || (z17 = jVar.z(i17)) == null) {
            return;
        }
        if (contactLabelManagerUI.f143255v) {
            com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.V6(contactLabelManagerUI, d5Var.f260315f, z17);
            return;
        }
        if (contactLabelManagerUI.f143257x) {
            if (contactLabelManagerUI.f143259z) {
                com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.V6(contactLabelManagerUI, d5Var.f260315f, z17);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("label_id", z17.field_labelID);
            contactLabelManagerUI.setResult(-1, intent);
            contactLabelManagerUI.finish();
            return;
        }
        java.lang.String str = z17.field_labelID + "";
        java.lang.String str2 = z17.field_labelName;
        contactLabelManagerUI.getClass();
        f93.q5 q5Var = f93.q5.f260441a;
        if (q5Var.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startLabelEditUIV2() called with: labelID = [" + str + "], mLabelName = [" + str2 + "]");
            q5Var.d(contactLabelManagerUI, str, str2);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("label_id", str);
        intent2.putExtra("label_name", str2);
        intent2.putExtra("label_source", "label_source_Address");
        intent2.putExtra("last_page_source_type", 1);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
            intent2.setClass(contactLabelManagerUI, com.tencent.mm.plugin.label.ui.ContactEditLabel.class);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
            intent2.setClass(contactLabelManagerUI, com.tencent.mm.plugin.label.ui.ContactLabelEditUI.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contactLabelManagerUI, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        contactLabelManagerUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(contactLabelManagerUI, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "startLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b93.n.a(contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0), 2L, 0L, 0L, 0L);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.ArrayList arrayList2 = contactLabelManagerUI.B;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 1, 0);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 1, 1);
            }
        }
    }
}
