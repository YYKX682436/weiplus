package kf3;

/* loaded from: classes11.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI f307357d;

    public h2(com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI) {
        this.f307357d = massSendSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "Click SelectAll");
        com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI massSendSelectContactUI = this.f307357d;
        com.tencent.mm.ui.contact.p4 p4Var = (com.tencent.mm.ui.contact.p4) ((android.widget.HeaderViewListAdapter) massSendSelectContactUI.f206446d.getAdapter()).getWrappedAdapter();
        if (massSendSelectContactUI.F) {
            massSendSelectContactUI.C.setText(com.tencent.mm.R.string.gte);
            massSendSelectContactUI.G.e(new java.util.LinkedList());
            ((java.util.LinkedList) massSendSelectContactUI.E).clear();
        } else {
            massSendSelectContactUI.C.setText(com.tencent.mm.R.string.f492482gt3);
            ((java.util.LinkedList) massSendSelectContactUI.E).clear();
            int count = p4Var.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                com.tencent.mm.ui.contact.item.d item = p4Var.getItem(i17);
                if (item != null && (str = item.f206850s) != null && !((java.util.LinkedList) massSendSelectContactUI.E).contains(str)) {
                    ((java.util.LinkedList) massSendSelectContactUI.E).add(item.f206850s);
                }
            }
            massSendSelectContactUI.G.e(massSendSelectContactUI.E);
        }
        massSendSelectContactUI.F = !massSendSelectContactUI.F;
        massSendSelectContactUI.w7(((java.util.LinkedList) massSendSelectContactUI.E).size());
        p4Var.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
