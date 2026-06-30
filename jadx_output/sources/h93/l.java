package h93;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.o f279718d;

    public l(h93.o oVar) {
        this.f279718d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/label/MyLabelPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h93.o oVar = this.f279718d;
        android.content.Intent intent = new android.content.Intent(oVar.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("key_label_click_source", 1);
        intent.putExtra("label_edit_mode", true);
        oVar.getActivity().startActivityForResult(intent, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
