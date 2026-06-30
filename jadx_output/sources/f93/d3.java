package f93;

/* loaded from: classes9.dex */
public class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260311d;

    public d3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260311d = contactLabelSelectUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f260311d.E.B();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
