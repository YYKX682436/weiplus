package sj3;

/* loaded from: classes14.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408491e;

    public e0(sj3.a1 a1Var, com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f408490d = a1Var;
        this.f408491e = multiTalkControlIconLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f408490d.onClick(this.f408491e);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
