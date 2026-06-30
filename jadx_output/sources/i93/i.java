package i93;

/* loaded from: classes11.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI f289751d;

    public i(com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI) {
        this.f289751d = labelSearchUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI.f143385u;
        com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI = this.f289751d;
        labelSearchUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) ((java.util.LinkedList) labelSearchUI.f143394o.f289729f).toArray(new java.lang.String[0]));
        if (P1 == null) {
            P1 = new java.util.ArrayList();
        }
        java.lang.String string = labelSearchUI.getResources().getString(com.tencent.mm.R.string.g9w, java.lang.Integer.valueOf(P1.size()));
        if (labelSearchUI.f143398s) {
            dp.a.makeText(labelSearchUI, string, 0).show();
        }
        intent.putExtra("contact_choose_label_list", com.tencent.mm.sdk.platformtools.t8.c1(P1, ","));
        labelSearchUI.setResult(-1, intent);
        labelSearchUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
