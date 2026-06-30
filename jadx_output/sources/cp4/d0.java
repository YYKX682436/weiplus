package cp4;

/* loaded from: classes8.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f220993d;

    public d0(cp4.g1 g1Var) {
        this.f220993d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.LinearLayout contentLayout;
        android.widget.LinearLayout emptyLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.g1 g1Var = this.f220993d;
        contentLayout = g1Var.getContentLayout();
        contentLayout.setVisibility(0);
        emptyLayout = g1Var.getEmptyLayout();
        emptyLayout.setVisibility(4);
        yz5.l startTransListener = g1Var.getStartTransListener();
        if (startTransListener != null) {
            startTransListener.invoke(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
