package ym5;

/* loaded from: classes10.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f463410d;

    public j6(ym5.n6 n6Var) {
        this.f463410d = n6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.n6 n6Var = this.f463410d;
        android.view.animation.Animation animation = n6Var.getTextEditView().getAnimation();
        if (animation != null && animation.hasStarted() && !n6Var.getTextEditView().getAnimation().hasEnded()) {
            yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        n6Var.getTextEditView().clearFocus();
        if (n6Var.getTextEditView().getVisibility() == 0) {
            android.text.Editable text = n6Var.f463357t.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            l45.q presenter = n6Var.getPresenter();
            int currentTextColor = n6Var.f463357t.getCurrentTextColor();
            if (n6Var.f463358u.getCurMode() == 3) {
                java.lang.Object tag = n6Var.f463358u.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
                i17 = ((java.lang.Integer) tag).intValue();
            } else {
                i17 = 0;
            }
            ((l45.n) presenter).t(obj, currentTextColor, i17, "", n6Var.f463358u.getCurMode() == 2, n6Var.f463449x, false, false, ((l45.n) n6Var.getPresenter()).f316461b.f364236f.width());
            if (n6Var.getContext() instanceof com.tencent.mm.ui.MMActivity) {
                if (!(obj == null || obj.length() == 0)) {
                    android.content.Context context = n6Var.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.tencent.mm.ui.MMActivity) context).hideVKB();
                }
            }
        } else {
            qk.i6 i6Var = ((l45.n) n6Var.getPresenter()).f316464e;
            if (i6Var != null) {
                i6Var.onFinish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
