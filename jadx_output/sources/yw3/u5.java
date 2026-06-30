package yw3;

/* loaded from: classes.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI f466904d;

    public u5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
        this.f466904d = repairerPullDownWidgetDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$bindViewAndFakeData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI = this.f466904d;
        db5.t7.i(repairerPullDownWidgetDemoUI.getContext(), "已设置", 0);
        android.widget.FrameLayout frameLayout = repairerPullDownWidgetDemoUI.d;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("layoutContainer");
            throw null;
        }
        frameLayout.removeAllViews();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$bindViewAndFakeData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
