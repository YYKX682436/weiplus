package pk2;

/* loaded from: classes.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355775d;

    public g5(android.view.View view) {
        this.f355775d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f355775d;
        android.content.Context context = view2.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = view2.getContext().getString(com.tencent.mm.R.string.npe);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
