package hd2;

/* loaded from: classes8.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f280493e;

    public l(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.view.View view) {
        this.f280492d = finderCommentShareDialogFragment;
        this.f280493e = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280492d;
        o25.y1 y1Var = finderCommentShareDialogFragment.f110041m;
        if (y1Var != null) {
            kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new hd2.k(finderCommentShareDialogFragment, this.f280493e));
        }
    }
}
