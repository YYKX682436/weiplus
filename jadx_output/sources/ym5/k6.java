package ym5;

/* loaded from: classes10.dex */
public final class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f463421d;

    public k6(ym5.n6 n6Var) {
        this.f463421d = n6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ym5.n6 n6Var = this.f463421d;
        n6Var.getTextEditView().clearFocus();
        if (n6Var.getTextEditView().getVisibility() == 0) {
            ((l45.n) n6Var.getPresenter()).o();
            if (n6Var.getContext() instanceof com.tencent.mm.ui.MMActivity) {
                android.content.Context context = n6Var.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) context).hideVKB();
            }
        } else {
            qk.i6 i6Var = ((l45.n) n6Var.getPresenter()).f316464e;
            if (i6Var != null) {
                i6Var.m5();
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
