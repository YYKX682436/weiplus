package f93;

/* loaded from: classes3.dex */
public class u3 implements android.view.View.OnClickListener {
    public u3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
