package f93;

/* loaded from: classes11.dex */
public class z3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260529d;

    public z3(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260529d = contactLabelUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260529d;
        f93.x2 x2Var = contactLabelUI.f143310u;
        if (x2Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String item = x2Var.getItem(i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(item) && (mMLabelPanel = contactLabelUI.f143302m) != null) {
            mMLabelPanel.g();
            contactLabelUI.f143302m.d(item, true);
            contactLabelUI.f143307r.s(item, true);
            contactLabelUI.F.add(item);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
