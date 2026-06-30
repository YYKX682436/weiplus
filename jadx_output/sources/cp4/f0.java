package cp4;

/* loaded from: classes8.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f220999d;

    public f0(cp4.g1 g1Var) {
        this.f220999d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.ViewGroup recordContentLayout;
        android.view.ViewGroup recordEmptyLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.g1 g1Var = this.f220999d;
        recordContentLayout = g1Var.getRecordContentLayout();
        recordContentLayout.setVisibility(0);
        recordEmptyLayout = g1Var.getRecordEmptyLayout();
        recordEmptyLayout.setVisibility(4);
        yz5.l startTransListener = g1Var.getStartTransListener();
        if (startTransListener != null) {
            startTransListener.invoke(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
