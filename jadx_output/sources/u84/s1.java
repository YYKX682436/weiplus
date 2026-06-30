package u84;

/* loaded from: classes2.dex */
public class s1 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425666e;

    public s1(com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView, android.view.View view) {
        this.f425666e = view;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$2");
        android.view.View view = this.f425666e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/SnsAdInteractionLabelView$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/SnsAdInteractionLabelView$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$2");
    }
}
