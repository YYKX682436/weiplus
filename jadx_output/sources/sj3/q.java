package sj3;

/* loaded from: classes14.dex */
public class q extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408699f;

    public q(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView, android.view.View view, int i17) {
        this.f408699f = collapseView;
        this.f408697d = view;
        this.f408698e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        int i17 = this.f408698e;
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.f408699f;
        android.view.View view = this.f408697d;
        if (f17 == 1.0f) {
            android.view.View view2 = collapseView.f150316o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.getLayoutParams().height = i17;
        } else {
            if (f17 >= collapseView.f150318q) {
                android.view.View view3 = collapseView.f150316o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = collapseView.f150316o;
                float f18 = (f17 - collapseView.f150318q) + 0.1f;
                float f19 = ((double) f18) * 2.5d >= 1.0d ? 1.0f : f18 * 2.5f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(f19));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$6", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (sj3.i1.f408565j * f17);
            ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).bottomMargin = (int) (sj3.i1.f408560e * f17);
            view.getLayoutParams().height = (int) (i17 * f17);
        }
        view.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
