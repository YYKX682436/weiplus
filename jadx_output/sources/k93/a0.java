package k93;

/* loaded from: classes11.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.MMLabelPanel f305883d;

    public a0(com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel) {
        this.f305883d = mMLabelPanel;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = this.f305883d;
        k93.b0 b0Var = mMLabelPanel.T;
        if (b0Var != null) {
            b0Var.a(mMLabelPanel.R);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
