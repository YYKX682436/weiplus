package f93;

/* loaded from: classes3.dex */
public class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260469d;

    public t3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260469d = contactLabelSelectUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("label_edit_mode", true);
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260469d;
        intent.putExtra("contact_select_label_from_scene", contactLabelSelectUI.getIntent().getIntExtra("contact_select_label_from_scene", 0));
        pf5.z zVar = pf5.z.f353948a;
        intent.putExtra("contact_select_label_session_id", ((j93.r) zVar.a(contactLabelSelectUI).a(j93.r.class)).O6());
        j45.l.j(contactLabelSelectUI, "label", ".ui.ContactLabelManagerUI", intent, null);
        j93.r rVar = (j93.r) zVar.a(contactLabelSelectUI).a(j93.r.class);
        rVar.getClass();
        kotlin.jvm.internal.o.g(v17, "v");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", v17, kz5.c1.k(new jz5.l("view_id", "label_manage_btn"), new jz5.l("label_business_type", (java.lang.String) ((jz5.n) rVar.f298487e).getValue()), new jz5.l("label_select_sessionid", rVar.O6())), 33926);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
