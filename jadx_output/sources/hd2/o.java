package hd2;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f280505c;

    public o(android.view.View view, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f280503a = view;
        this.f280504b = finderCommentShareDialogFragment;
        this.f280505c = k0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public final void onShow() {
        android.view.View view = this.f280503a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$onViewCreated$9", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$onViewCreated$9", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View container = this.f280503a;
        kotlin.jvm.internal.o.f(container, "$container");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f280505c;
        android.view.View view2 = k0Var.S;
        int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
        int measuredHeight2 = container.getMeasuredHeight();
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280504b;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.l0(finderCommentShareDialogFragment, container, measuredHeight, measuredHeight2);
        android.view.ViewTreeObserver viewTreeObserver = container.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new hd2.n(container, finderCommentShareDialogFragment, k0Var));
        }
    }
}
