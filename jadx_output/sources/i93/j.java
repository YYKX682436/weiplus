package i93;

/* loaded from: classes11.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI f289752d;

    public j(com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI) {
        this.f289752d = labelSearchUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI labelSearchUI = this.f289752d;
        if (labelSearchUI.f143392m) {
            labelSearchUI.f143392m = false;
            labelSearchUI.f143393n.setText(labelSearchUI.getResources().getString(com.tencent.mm.R.string.f490493wm));
            labelSearchUI.f143399t.setVisibility(8);
            i93.e eVar = labelSearchUI.f143394o;
            eVar.f289739s = true;
            eVar.f289735o = 0;
            java.util.List list = eVar.f289729f;
            if (list != null) {
                ((java.util.LinkedList) list).clear();
            }
            eVar.notifyDataSetChanged();
        } else {
            labelSearchUI.f143392m = true;
            labelSearchUI.f143393n.setText(labelSearchUI.getResources().getString(com.tencent.mm.R.string.f492374g95));
            labelSearchUI.f143399t.setVisibility(0);
            java.util.List list2 = labelSearchUI.f143394o.f289729f;
            if (list2 == null || ((java.util.LinkedList) list2).size() == 0) {
                labelSearchUI.f143399t.setText(labelSearchUI.getString(com.tencent.mm.R.string.f490352sk));
            } else {
                labelSearchUI.f143399t.setText(labelSearchUI.getString(com.tencent.mm.R.string.f490352sk) + "(" + ((java.util.LinkedList) labelSearchUI.f143394o.f289729f).size() + ")");
            }
            i93.e eVar2 = labelSearchUI.f143394o;
            eVar2.f289739s = false;
            eVar2.f289735o = 1;
            java.util.List list3 = eVar2.f289729f;
            if (list3 != null) {
                ((java.util.LinkedList) list3).clear();
            }
            eVar2.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
