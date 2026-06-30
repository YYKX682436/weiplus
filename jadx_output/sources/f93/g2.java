package f93;

/* loaded from: classes.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260342d;

    public g2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260342d = contactLabelManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.X;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260342d;
        contactLabelManagerUI.getClass();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigNewSelectLabel()) == 1) {
            ((j93.w) pf5.z.f353948a.a(contactLabelManagerUI).a(j93.w.class)).O6();
        } else {
            b93.n.a(contactLabelManagerUI.getIntent().getIntExtra("key_label_click_source", 0), 4L, 0L, 0L, 0L);
            java.util.ArrayList arrayList2 = contactLabelManagerUI.B;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 1, 0);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 1, 1);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[dealAddLabel]");
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, 1024));
            intent.putExtra("last_page_source_type", 1);
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", contactLabelManagerUI.getString(com.tencent.mm.R.string.g8s));
            intent.putExtra("show_too_many_member", false);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 5);
            intent.putExtra("label_source", "label_source_Address");
            intent.putExtra("without_openim", true);
            j45.l.v(contactLabelManagerUI, ".ui.contact.SelectContactUI", intent, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
