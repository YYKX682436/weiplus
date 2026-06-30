package ym5;

/* loaded from: classes10.dex */
public final class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463482d;

    public q5(ym5.y5 y5Var) {
        this.f463482d = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/StickerDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.y5 y5Var = this.f463482d;
        android.view.animation.Animation animation = y5Var.getTextEditView().getAnimation();
        if (animation == null || !animation.hasStarted() || y5Var.getTextEditView().getAnimation().hasEnded()) {
            android.text.Editable text = y5Var.f463357t.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                y5Var.f();
            } else {
                y5Var.getTextEditView().clearFocus();
                y5Var.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("textEditView: finish click, visible=");
                boolean z17 = true;
                sb6.append(y5Var.getTextEditView().getVisibility() == 0);
                com.tencent.mars.xlog.Log.i(y5Var.f463581x, sb6.toString());
                if (y5Var.getTextEditView().getVisibility() == 0) {
                    ((l45.n) y5Var.getPresenter()).t(obj, y5Var.f463357t.getCurrentTextColor(), y5Var.f463358u.getCurMode() == 3 ? y5Var.f463357t.getTextBgColor() : 0, "", y5Var.f463358u.getCurMode() == 2, y5Var.f463582y, false, true, Integer.MAX_VALUE);
                    if (y5Var.getContext() instanceof com.tencent.mm.ui.MMActivity) {
                        if (obj != null && obj.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            android.content.Context context = y5Var.getContext();
                            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            ((com.tencent.mm.ui.MMActivity) context).hideVKB();
                        }
                    }
                } else {
                    qk.i6 i6Var = ((l45.n) y5Var.getPresenter()).f316464e;
                    if (i6Var != null) {
                        i6Var.onFinish();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/StickerDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
