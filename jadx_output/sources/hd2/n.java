package hd2;

/* loaded from: classes8.dex */
public final class n implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f280501f;

    public n(android.view.View view, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f280499d = view;
        this.f280500e = finderCommentShareDialogFragment;
        this.f280501f = k0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View container = this.f280499d;
        android.view.ViewTreeObserver viewTreeObserver = container.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        kotlin.jvm.internal.o.f(container, "$container");
        android.view.View view = this.f280501f.S;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.l0(this.f280500e, container, view != null ? view.getMeasuredHeight() : 0, container.getMeasuredHeight());
    }
}
