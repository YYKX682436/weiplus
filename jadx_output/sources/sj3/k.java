package sj3;

/* loaded from: classes14.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408605d;

    public k(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView) {
        this.f408605d = collapseView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.f408605d;
        if (collapseView.f150326y) {
            if (com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
                com.tencent.mm.plugin.multitalk.model.u0.f150149i++;
            }
            collapseView.f150326y = false;
            collapseView.g();
            collapseView.f();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
