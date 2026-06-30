package sj3;

/* loaded from: classes14.dex */
public class r extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.CollapseView f408723f;

    public r(com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView, android.view.View view, int i17) {
        this.f408723f = collapseView;
        this.f408721d = view;
        this.f408722e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation transformation) {
        android.view.View view;
        android.view.View view2 = this.f408721d;
        com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = this.f408723f;
        if (f17 == 1.0f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            collapseView.getClass();
        } else {
            if (f17 >= collapseView.f150318q && (view = collapseView.f150316o) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = collapseView.f150316o;
            if (view3 != null) {
                float f18 = 1.0f - f17;
                float f19 = ((double) f18) * 2.5d < 1.0d ? 2.5f * f18 : 1.0f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(f19));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ((android.widget.LinearLayout.LayoutParams) view2.getLayoutParams()).topMargin = (int) (sj3.i1.f408565j * f17);
            ((android.widget.LinearLayout.LayoutParams) view2.getLayoutParams()).bottomMargin = (int) (sj3.i1.f408560e * f17);
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i17 = this.f408722e;
            layoutParams.height = i17 - ((int) (i17 * f17));
        }
        view2.requestLayout();
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
