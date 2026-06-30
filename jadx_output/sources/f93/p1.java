package f93;

/* loaded from: classes.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260422d;

    public p1(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260422d = contactLabelManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.X;
        this.f260422d.a7();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
