package sj3;

/* loaded from: classes14.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408793e;

    public x(sj3.a1 a1Var, int i17) {
        this.f408792d = a1Var;
        this.f408793e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.a1 a1Var = this.f408792d;
        if (a1Var.f408412z) {
            a1Var.f408393d.W6(this.f408793e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$handleBadNetworkLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
