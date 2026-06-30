package rp1;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.ContentFloatBallEduView f398357d;

    public b(com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView) {
        this.f398357d = contentFloatBallEduView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/ContentFloatBallEduView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = this.f398357d;
        contentFloatBallEduView.setVisibility(8);
        android.widget.PopupWindow.OnDismissListener onDismissListener = contentFloatBallEduView.f93403i;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/ContentFloatBallEduView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
